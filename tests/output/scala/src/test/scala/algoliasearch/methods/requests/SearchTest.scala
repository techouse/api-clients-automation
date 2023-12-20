package algoliasearch.methods.requests

import algoliasearch.EchoInterceptor
import algoliasearch.api.SearchClient
import algoliasearch.config.*
import algoliasearch.search.*
import org.json4s.*
import org.json4s.native.JsonParser.*
import org.scalatest.funsuite.AnyFunSuite

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContextExecutor}

class SearchTest extends AnyFunSuite {
  implicit val ec: ExecutionContextExecutor = scala.concurrent.ExecutionContext.global
  implicit val formats: Formats = org.json4s.DefaultFormats

  def testClient(): (SearchClient, EchoInterceptor) = {
    val echo = EchoInterceptor()
    (
      SearchClient(
        appId = "appId",
        apiKey = "apiKey",
        clientOptions = ClientOptions
          .builder()
          .withRequesterConfig(requester => requester.withInterceptor(echo))
          .build()
      ),
      echo
    )
  }

  test("addApiKey0") {
    val (client, echo) = testClient()
    val future = client.addApiKey(
      apiKey = ApiKey(
        acl = Seq(Acl.withName("search"), Acl.withName("addObject")),
        description = Some("my new api key"),
        validity = Some(300),
        maxQueriesPerIPPerHour = Some(100),
        maxHitsPerQuery = Some(20)
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/keys")
    assert(res.method == "POST")
    val expectedBody = parse(
      """{"acl":["search","addObject"],"description":"my new api key","validity":300,"maxQueriesPerIPPerHour":100,"maxHitsPerQuery":20}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("addOrUpdateObject0") {
    val (client, echo) = testClient()
    val future = client.addOrUpdateObject(
      indexName = "indexName",
      objectID = "uniqueID",
      body = JObject(List(JField("key", JString("value"))))
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/uniqueID")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"key":"value"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("appendSource0") {
    val (client, echo) = testClient()
    val future = client.appendSource(
      source = Source(
        source = "theSource",
        description = Some("theDescription")
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/security/sources/append")
    assert(res.method == "POST")
    val expectedBody = parse("""{"source":"theSource","description":"theDescription"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("assignUserId0") {
    val (client, echo) = testClient()
    val future = client.assignUserId(
      xAlgoliaUserID = "userID",
      assignUserIdParams = AssignUserIdParams(
        cluster = "theCluster"
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/clusters/mapping")
    assert(res.method == "POST")
    val expectedBody = parse("""{"cluster":"theCluster"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedHeaders = parse("""{"x-algolia-user-id":"userID"}""").asInstanceOf[JObject].obj.toMap
    val actualHeaders = res.headers
    for ((k, v) <- expectedHeaders) {
      assert(actualHeaders.contains(k))
      assert(actualHeaders(k) == v.asInstanceOf[JString].s)
    }
  }

  test("allows batch method with `addObject` action") {
    val (client, echo) = testClient()
    val future = client.batch(
      indexName = "theIndexName",
      batchWriteParams = BatchWriteParams(
        requests = Seq(
          BatchRequest(
            action = Action.withName("addObject"),
            body = JObject(List(JField("key", JString("value"))))
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/batch")
    assert(res.method == "POST")
    val expectedBody = parse("""{"requests":[{"action":"addObject","body":{"key":"value"}}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("allows batch method with `clear` action") {
    val (client, echo) = testClient()
    val future = client.batch(
      indexName = "theIndexName",
      batchWriteParams = BatchWriteParams(
        requests = Seq(
          BatchRequest(
            action = Action.withName("clear"),
            body = JObject(List(JField("key", JString("value"))))
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/batch")
    assert(res.method == "POST")
    val expectedBody = parse("""{"requests":[{"action":"clear","body":{"key":"value"}}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("allows batch method with `delete` action") {
    val (client, echo) = testClient()
    val future = client.batch(
      indexName = "theIndexName",
      batchWriteParams = BatchWriteParams(
        requests = Seq(
          BatchRequest(
            action = Action.withName("delete"),
            body = JObject(List(JField("key", JString("value"))))
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/batch")
    assert(res.method == "POST")
    val expectedBody = parse("""{"requests":[{"action":"delete","body":{"key":"value"}}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("allows batch method with `deleteObject` action") {
    val (client, echo) = testClient()
    val future = client.batch(
      indexName = "theIndexName",
      batchWriteParams = BatchWriteParams(
        requests = Seq(
          BatchRequest(
            action = Action.withName("deleteObject"),
            body = JObject(List(JField("key", JString("value"))))
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/batch")
    assert(res.method == "POST")
    val expectedBody = parse("""{"requests":[{"action":"deleteObject","body":{"key":"value"}}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("allows batch method with `partialUpdateObject` action") {
    val (client, echo) = testClient()
    val future = client.batch(
      indexName = "theIndexName",
      batchWriteParams = BatchWriteParams(
        requests = Seq(
          BatchRequest(
            action = Action.withName("partialUpdateObject"),
            body = JObject(List(JField("key", JString("value"))))
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/batch")
    assert(res.method == "POST")
    val expectedBody = parse("""{"requests":[{"action":"partialUpdateObject","body":{"key":"value"}}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("allows batch method with `partialUpdateObjectNoCreate` action") {
    val (client, echo) = testClient()
    val future = client.batch(
      indexName = "theIndexName",
      batchWriteParams = BatchWriteParams(
        requests = Seq(
          BatchRequest(
            action = Action.withName("partialUpdateObjectNoCreate"),
            body = JObject(List(JField("key", JString("value"))))
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/batch")
    assert(res.method == "POST")
    val expectedBody = parse("""{"requests":[{"action":"partialUpdateObjectNoCreate","body":{"key":"value"}}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("allows batch method with `updateObject` action") {
    val (client, echo) = testClient()
    val future = client.batch(
      indexName = "theIndexName",
      batchWriteParams = BatchWriteParams(
        requests = Seq(
          BatchRequest(
            action = Action.withName("updateObject"),
            body = JObject(List(JField("key", JString("value"))))
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/batch")
    assert(res.method == "POST")
    val expectedBody = parse("""{"requests":[{"action":"updateObject","body":{"key":"value"}}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("batchAssignUserIds0") {
    val (client, echo) = testClient()
    val future = client.batchAssignUserIds(
      xAlgoliaUserID = "userID",
      batchAssignUserIdsParams = BatchAssignUserIdsParams(
        cluster = "theCluster",
        users = Seq("user1", "user2")
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/clusters/mapping/batch")
    assert(res.method == "POST")
    val expectedBody = parse("""{"cluster":"theCluster","users":["user1","user2"]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedHeaders = parse("""{"x-algolia-user-id":"userID"}""").asInstanceOf[JObject].obj.toMap
    val actualHeaders = res.headers
    for ((k, v) <- expectedHeaders) {
      assert(actualHeaders.contains(k))
      assert(actualHeaders(k) == v.asInstanceOf[JString].s)
    }
  }

  test("get batchDictionaryEntries results with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.batchDictionaryEntries(
      dictionaryName = DictionaryType.withName("compounds"),
      batchDictionaryEntriesParams = BatchDictionaryEntriesParams(
        requests = Seq(
          BatchDictionaryEntriesRequest(
            action = DictionaryAction.withName("addEntry"),
            body = DictionaryEntry(
              objectID = "1",
              language = "en"
            )
          ),
          BatchDictionaryEntriesRequest(
            action = DictionaryAction.withName("deleteEntry"),
            body = DictionaryEntry(
              objectID = "2",
              language = "fr"
            )
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/dictionaries/compounds/batch")
    assert(res.method == "POST")
    val expectedBody = parse(
      """{"requests":[{"action":"addEntry","body":{"objectID":"1","language":"en"}},{"action":"deleteEntry","body":{"objectID":"2","language":"fr"}}]}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("get batchDictionaryEntries results with all parameters") {
    val (client, echo) = testClient()
    val future = client.batchDictionaryEntries(
      dictionaryName = DictionaryType.withName("compounds"),
      batchDictionaryEntriesParams = BatchDictionaryEntriesParams(
        clearExistingDictionaryEntries = Some(false),
        requests = Seq(
          BatchDictionaryEntriesRequest(
            action = DictionaryAction.withName("addEntry"),
            body = DictionaryEntry(
              objectID = "1",
              language = "en",
              word = Some("fancy"),
              words = Some(Seq("believe", "algolia")),
              decomposition = Some(Seq("trust", "algolia")),
              state = Some(DictionaryEntryState.withName("enabled"))
            )
          ),
          BatchDictionaryEntriesRequest(
            action = DictionaryAction.withName("deleteEntry"),
            body = DictionaryEntry(
              objectID = "2",
              language = "fr",
              word = Some("humility"),
              words = Some(Seq("candor", "algolia")),
              decomposition = Some(Seq("grit", "algolia")),
              state = Some(DictionaryEntryState.withName("enabled"))
            )
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/dictionaries/compounds/batch")
    assert(res.method == "POST")
    val expectedBody = parse(
      """{"clearExistingDictionaryEntries":false,"requests":[{"action":"addEntry","body":{"objectID":"1","language":"en","word":"fancy","words":["believe","algolia"],"decomposition":["trust","algolia"],"state":"enabled"}},{"action":"deleteEntry","body":{"objectID":"2","language":"fr","word":"humility","words":["candor","algolia"],"decomposition":["grit","algolia"],"state":"enabled"}}]}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("get batchDictionaryEntries results additional properties") {
    val (client, echo) = testClient()
    val future = client.batchDictionaryEntries(
      dictionaryName = DictionaryType.withName("compounds"),
      batchDictionaryEntriesParams = BatchDictionaryEntriesParams(
        requests = Seq(
          BatchDictionaryEntriesRequest(
            action = DictionaryAction.withName("addEntry"),
            body = DictionaryEntry(
              objectID = "1",
              language = "en",
              additionalProperties = Some(List(JField("additional", JString("try me"))))
            )
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/dictionaries/compounds/batch")
    assert(res.method == "POST")
    val expectedBody =
      parse("""{"requests":[{"action":"addEntry","body":{"objectID":"1","language":"en","additional":"try me"}}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("browse with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.browse(
      indexName = "indexName"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/browse")
    assert(res.method == "POST")
    val expectedBody = parse("""{}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("browse with search parameters") {
    val (client, echo) = testClient()
    val future = client.browse(
      indexName = "indexName",
      browseParams = Some(
        BrowseParamsObject(
          query = Some("myQuery"),
          facetFilters = Some(FacetFilters(Seq(MixedSearchFilters("tags:algolia"))))
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/browse")
    assert(res.method == "POST")
    val expectedBody = parse("""{"query":"myQuery","facetFilters":["tags:algolia"]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("browse allow a cursor in parameters") {
    val (client, echo) = testClient()
    val future = client.browse(
      indexName = "indexName",
      browseParams = Some(
        BrowseParamsObject(
          cursor = Some("test")
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/browse")
    assert(res.method == "POST")
    val expectedBody = parse("""{"cursor":"test"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("clearAllSynonyms0") {
    val (client, echo) = testClient()
    val future = client.clearAllSynonyms(
      indexName = "indexName"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/synonyms/clear")
    assert(res.method == "POST")
    assert(res.body.contains("{}"))
  }

  test("clearObjects0") {
    val (client, echo) = testClient()
    val future = client.clearObjects(
      indexName = "theIndexName"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/clear")
    assert(res.method == "POST")
    assert(res.body.contains("{}"))
  }

  test("clearRules0") {
    val (client, echo) = testClient()
    val future = client.clearRules(
      indexName = "indexName"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/rules/clear")
    assert(res.method == "POST")
    assert(res.body.contains("{}"))
  }

  test("allow del method for a custom path with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.customDelete[JObject](
      path = "/test/minimal"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/minimal")
    assert(res.method == "DELETE")
    assert(res.body.isEmpty)
  }

  test("allow del method for a custom path with all parameters") {
    val (client, echo) = testClient()
    val future = client.customDelete[JObject](
      path = "/test/all",
      parameters = Some(Map("query" -> "parameters"))
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/all")
    assert(res.method == "DELETE")
    assert(res.body.isEmpty)
    val expectedQuery = parse("""{"query":"parameters"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("allow get method for a custom path with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.customGet[JObject](
      path = "/test/minimal"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/minimal")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("allow get method for a custom path with all parameters") {
    val (client, echo) = testClient()
    val future = client.customGet[JObject](
      path = "/test/all",
      parameters = Some(Map("query" -> "parameters"))
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/all")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
    val expectedQuery = parse("""{"query":"parameters"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("allow post method for a custom path with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.customPost[JObject](
      path = "/test/minimal"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/minimal")
    assert(res.method == "POST")
    val expectedBody = parse("""{}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("allow post method for a custom path with all parameters") {
    val (client, echo) = testClient()
    val future = client.customPost[JObject](
      path = "/test/all",
      parameters = Some(Map("query" -> "parameters")),
      body = Some(JObject(List(JField("body", JString("parameters")))))
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/all")
    assert(res.method == "POST")
    val expectedBody = parse("""{"body":"parameters"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"query":"parameters"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("requestOptions can override default query parameters") {
    val (client, echo) = testClient()
    val future = client.customPost[JObject](
      path = "/test/requestOptions",
      parameters = Some(Map("query" -> "parameters")),
      body = Some(JObject(List(JField("facet", JString("filters"))))),
      requestOptions = Some(
        RequestOptions
          .builder()
          .withQueryParameter("query", "myQueryParameter")
          .build()
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/requestOptions")
    assert(res.method == "POST")
    val expectedBody = parse("""{"facet":"filters"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"query":"myQueryParameter"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("requestOptions merges query parameters with default ones") {
    val (client, echo) = testClient()
    val future = client.customPost[JObject](
      path = "/test/requestOptions",
      parameters = Some(Map("query" -> "parameters")),
      body = Some(JObject(List(JField("facet", JString("filters"))))),
      requestOptions = Some(
        RequestOptions
          .builder()
          .withQueryParameter("query2", "myQueryParameter")
          .build()
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/requestOptions")
    assert(res.method == "POST")
    val expectedBody = parse("""{"facet":"filters"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"query":"parameters","query2":"myQueryParameter"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("requestOptions can override default headers") {
    val (client, echo) = testClient()
    val future = client.customPost[JObject](
      path = "/test/requestOptions",
      parameters = Some(Map("query" -> "parameters")),
      body = Some(JObject(List(JField("facet", JString("filters"))))),
      requestOptions = Some(
        RequestOptions
          .builder()
          .withHeader("x-algolia-api-key", "myApiKey")
          .build()
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/requestOptions")
    assert(res.method == "POST")
    val expectedBody = parse("""{"facet":"filters"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"query":"parameters"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
    val expectedHeaders = parse("""{"x-algolia-api-key":"myApiKey"}""").asInstanceOf[JObject].obj.toMap
    val actualHeaders = res.headers
    for ((k, v) <- expectedHeaders) {
      assert(actualHeaders.contains(k))
      assert(actualHeaders(k) == v.asInstanceOf[JString].s)
    }
  }

  test("requestOptions merges headers with default ones") {
    val (client, echo) = testClient()
    val future = client.customPost[JObject](
      path = "/test/requestOptions",
      parameters = Some(Map("query" -> "parameters")),
      body = Some(JObject(List(JField("facet", JString("filters"))))),
      requestOptions = Some(
        RequestOptions
          .builder()
          .withHeader("x-algolia-api-key", "myApiKey")
          .build()
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/requestOptions")
    assert(res.method == "POST")
    val expectedBody = parse("""{"facet":"filters"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"query":"parameters"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
    val expectedHeaders = parse("""{"x-algolia-api-key":"myApiKey"}""").asInstanceOf[JObject].obj.toMap
    val actualHeaders = res.headers
    for ((k, v) <- expectedHeaders) {
      assert(actualHeaders.contains(k))
      assert(actualHeaders(k) == v.asInstanceOf[JString].s)
    }
  }

  test("requestOptions queryParameters accepts booleans") {
    val (client, echo) = testClient()
    val future = client.customPost[JObject](
      path = "/test/requestOptions",
      parameters = Some(Map("query" -> "parameters")),
      body = Some(JObject(List(JField("facet", JString("filters"))))),
      requestOptions = Some(
        RequestOptions
          .builder()
          .withQueryParameter("isItWorking", true)
          .build()
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/requestOptions")
    assert(res.method == "POST")
    val expectedBody = parse("""{"facet":"filters"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"query":"parameters","isItWorking":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("requestOptions queryParameters accepts integers") {
    val (client, echo) = testClient()
    val future = client.customPost[JObject](
      path = "/test/requestOptions",
      parameters = Some(Map("query" -> "parameters")),
      body = Some(JObject(List(JField("facet", JString("filters"))))),
      requestOptions = Some(
        RequestOptions
          .builder()
          .withQueryParameter("myParam", 2)
          .build()
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/requestOptions")
    assert(res.method == "POST")
    val expectedBody = parse("""{"facet":"filters"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"query":"parameters","myParam":"2"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("requestOptions queryParameters accepts list of string") {
    val (client, echo) = testClient()
    val future = client.customPost[JObject](
      path = "/test/requestOptions",
      parameters = Some(Map("query" -> "parameters")),
      body = Some(JObject(List(JField("facet", JString("filters"))))),
      requestOptions = Some(
        RequestOptions
          .builder()
          .withQueryParameter("myParam", Seq("c", "d"))
          .build()
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/requestOptions")
    assert(res.method == "POST")
    val expectedBody = parse("""{"facet":"filters"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"query":"parameters","myParam":"c,d"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("requestOptions queryParameters accepts list of booleans") {
    val (client, echo) = testClient()
    val future = client.customPost[JObject](
      path = "/test/requestOptions",
      parameters = Some(Map("query" -> "parameters")),
      body = Some(JObject(List(JField("facet", JString("filters"))))),
      requestOptions = Some(
        RequestOptions
          .builder()
          .withQueryParameter("myParam", Seq(true, true, false))
          .build()
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/requestOptions")
    assert(res.method == "POST")
    val expectedBody = parse("""{"facet":"filters"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"query":"parameters","myParam":"true,true,false"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("requestOptions queryParameters accepts list of integers") {
    val (client, echo) = testClient()
    val future = client.customPost[JObject](
      path = "/test/requestOptions",
      parameters = Some(Map("query" -> "parameters")),
      body = Some(JObject(List(JField("facet", JString("filters"))))),
      requestOptions = Some(
        RequestOptions
          .builder()
          .withQueryParameter("myParam", Seq(1, 2))
          .build()
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/requestOptions")
    assert(res.method == "POST")
    val expectedBody = parse("""{"facet":"filters"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"query":"parameters","myParam":"1,2"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("allow put method for a custom path with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.customPut[JObject](
      path = "/test/minimal"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/minimal")
    assert(res.method == "PUT")
    val expectedBody = parse("""{}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("allow put method for a custom path with all parameters") {
    val (client, echo) = testClient()
    val future = client.customPut[JObject](
      path = "/test/all",
      parameters = Some(Map("query" -> "parameters")),
      body = Some(JObject(List(JField("body", JString("parameters")))))
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/test/all")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"body":"parameters"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"query":"parameters"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("deleteApiKey0") {
    val (client, echo) = testClient()
    val future = client.deleteApiKey(
      key = "myTestApiKey"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/keys/myTestApiKey")
    assert(res.method == "DELETE")
    assert(res.body.isEmpty)
  }

  test("deleteBy0") {
    val (client, echo) = testClient()
    val future = client.deleteBy(
      indexName = "theIndexName",
      deleteByParams = DeleteByParams(
        filters = Some("brand:brandName")
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/deleteByQuery")
    assert(res.method == "POST")
    val expectedBody = parse("""{"filters":"brand:brandName"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("deleteIndex0") {
    val (client, echo) = testClient()
    val future = client.deleteIndex(
      indexName = "theIndexName"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName")
    assert(res.method == "DELETE")
    assert(res.body.isEmpty)
  }

  test("deleteObject0") {
    val (client, echo) = testClient()
    val future = client.deleteObject(
      indexName = "theIndexName",
      objectID = "uniqueID"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/uniqueID")
    assert(res.method == "DELETE")
    assert(res.body.isEmpty)
  }

  test("deleteRule0") {
    val (client, echo) = testClient()
    val future = client.deleteRule(
      indexName = "indexName",
      objectID = "id1"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/rules/id1")
    assert(res.method == "DELETE")
    assert(res.body.isEmpty)
  }

  test("deleteSource0") {
    val (client, echo) = testClient()
    val future = client.deleteSource(
      source = "theSource"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/security/sources/theSource")
    assert(res.method == "DELETE")
    assert(res.body.isEmpty)
  }

  test("deleteSynonym0") {
    val (client, echo) = testClient()
    val future = client.deleteSynonym(
      indexName = "indexName",
      objectID = "id1"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/synonyms/id1")
    assert(res.method == "DELETE")
    assert(res.body.isEmpty)
  }

  test("getApiKey0") {
    val (client, echo) = testClient()
    val future = client.getApiKey(
      key = "myTestApiKey"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/keys/myTestApiKey")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("get getDictionaryLanguages") {
    val (client, echo) = testClient()
    val future = client.getDictionaryLanguages(
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/dictionaries/*/languages")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("get getDictionarySettings results") {
    val (client, echo) = testClient()
    val future = client.getDictionarySettings(
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/dictionaries/*/settings")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("getLogs with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.getLogs(
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/logs")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("getLogs with parameters") {
    val (client, echo) = testClient()
    val future = client.getLogs(
      offset = Some(5),
      length = Some(10),
      indexName = Some("theIndexName"),
      `type` = Some(LogType.withName("all"))
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/logs")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
    val expectedQuery =
      parse("""{"offset":"5","length":"10","indexName":"theIndexName","type":"all"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("getObject0") {
    val (client, echo) = testClient()
    val future = client.getObject(
      indexName = "theIndexName",
      objectID = "uniqueID",
      attributesToRetrieve = Some(Seq("attr1", "attr2"))
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/uniqueID")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
    val expectedQuery = parse("""{"attributesToRetrieve":"attr1,attr2"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("getObjects0") {
    val (client, echo) = testClient()
    val future = client.getObjects(
      getObjectsParams = GetObjectsParams(
        requests = Seq(
          GetObjectsRequest(
            attributesToRetrieve = Some(Seq("attr1", "attr2")),
            objectID = "uniqueID",
            indexName = "theIndexName"
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/*/objects")
    assert(res.method == "POST")
    val expectedBody = parse(
      """{"requests":[{"attributesToRetrieve":["attr1","attr2"],"objectID":"uniqueID","indexName":"theIndexName"}]}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("getRule0") {
    val (client, echo) = testClient()
    val future = client.getRule(
      indexName = "indexName",
      objectID = "id1"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/rules/id1")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("getSettings0") {
    val (client, echo) = testClient()
    val future = client.getSettings(
      indexName = "theIndexName"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/settings")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("getSources0") {
    val (client, echo) = testClient()
    val future = client.getSources(
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/security/sources")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("getSynonym0") {
    val (client, echo) = testClient()
    val future = client.getSynonym(
      indexName = "indexName",
      objectID = "id1"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/synonyms/id1")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("getTask0") {
    val (client, echo) = testClient()
    val future = client.getTask(
      indexName = "theIndexName",
      taskID = 123L
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/task/123")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("getTopUserIds0") {
    val (client, echo) = testClient()
    val future = client.getTopUserIds(
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/clusters/mapping/top")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("getUserId0") {
    val (client, echo) = testClient()
    val future = client.getUserId(
      userID = "uniqueID"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/clusters/mapping/uniqueID")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("hasPendingMappings with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.hasPendingMappings(
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/clusters/mapping/pending")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("hasPendingMappings with parameters") {
    val (client, echo) = testClient()
    val future = client.hasPendingMappings(
      getClusters = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/clusters/mapping/pending")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
    val expectedQuery = parse("""{"getClusters":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("listApiKeys0") {
    val (client, echo) = testClient()
    val future = client.listApiKeys(
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/keys")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("listClusters0") {
    val (client, echo) = testClient()
    val future = client.listClusters(
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/clusters")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("listIndices with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.listIndices(
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("listIndices with parameters") {
    val (client, echo) = testClient()
    val future = client.listIndices(
      page = Some(8),
      hitsPerPage = Some(3)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
    val expectedQuery = parse("""{"page":"8","hitsPerPage":"3"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("listUserIds with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.listUserIds(
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/clusters/mapping")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
  }

  test("listUserIds with parameters") {
    val (client, echo) = testClient()
    val future = client.listUserIds(
      page = Some(8),
      hitsPerPage = Some(100)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/clusters/mapping")
    assert(res.method == "GET")
    assert(res.body.isEmpty)
    val expectedQuery = parse("""{"page":"8","hitsPerPage":"100"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("multipleBatch0") {
    val (client, echo) = testClient()
    val future = client.multipleBatch(
      batchParams = BatchParams(
        requests = Seq(
          MultipleBatchRequest(
            action = Action.withName("addObject"),
            body = JObject(List(JField("key", JString("value")))),
            indexName = "theIndexName"
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/*/batch")
    assert(res.method == "POST")
    val expectedBody =
      parse("""{"requests":[{"action":"addObject","body":{"key":"value"},"indexName":"theIndexName"}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("operationIndex0") {
    val (client, echo) = testClient()
    val future = client.operationIndex(
      indexName = "theIndexName",
      operationIndexParams = OperationIndexParams(
        operation = OperationType.withName("copy"),
        destination = "dest",
        scope = Some(Seq(ScopeType.withName("rules"), ScopeType.withName("settings")))
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/operation")
    assert(res.method == "POST")
    val expectedBody = parse("""{"operation":"copy","destination":"dest","scope":["rules","settings"]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("partialUpdateObject0") {
    val (client, echo) = testClient()
    val future = client.partialUpdateObject(
      indexName = "theIndexName",
      objectID = "uniqueID",
      attributesToUpdate = Map(
        "id1" -> AttributeToUpdate("test"),
        "id2" -> BuiltInOperation(
          _operation = BuiltInOperationType.withName("AddUnique"),
          value = "test2"
        )
      ),
      createIfNotExists = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/uniqueID/partial")
    assert(res.method == "POST")
    val expectedBody = parse("""{"id1":"test","id2":{"_operation":"AddUnique","value":"test2"}}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"createIfNotExists":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("removeUserId0") {
    val (client, echo) = testClient()
    val future = client.removeUserId(
      userID = "uniqueID"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/clusters/mapping/uniqueID")
    assert(res.method == "DELETE")
    assert(res.body.isEmpty)
  }

  test("replaceSources0") {
    val (client, echo) = testClient()
    val future = client.replaceSources(
      source = Seq(
        Source(
          source = "theSource",
          description = Some("theDescription")
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/security/sources")
    assert(res.method == "PUT")
    val expectedBody = parse("""[{"source":"theSource","description":"theDescription"}]""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("restoreApiKey0") {
    val (client, echo) = testClient()
    val future = client.restoreApiKey(
      key = "myApiKey"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/keys/myApiKey/restore")
    assert(res.method == "POST")
    assert(res.body.contains("{}"))
  }

  test("saveObject0") {
    val (client, echo) = testClient()
    val future = client.saveObject(
      indexName = "theIndexName",
      body = JObject(List(JField("objectID", JString("id")), JField("test", JString("val"))))
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName")
    assert(res.method == "POST")
    val expectedBody = parse("""{"objectID":"id","test":"val"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("saveRule with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.saveRule(
      indexName = "indexName",
      objectID = "id1",
      rule = Rule(
        objectID = "id1",
        conditions = Some(
          Seq(
            Condition(
              pattern = Some("apple"),
              anchoring = Some(Anchoring.withName("contains"))
            )
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/rules/id1")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"objectID":"id1","conditions":[{"pattern":"apple","anchoring":"contains"}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("saveRule with all parameters") {
    val (client, echo) = testClient()
    val future = client.saveRule(
      indexName = "indexName",
      objectID = "id1",
      rule = Rule(
        objectID = "id1",
        conditions = Some(
          Seq(
            Condition(
              pattern = Some("apple"),
              anchoring = Some(Anchoring.withName("contains")),
              alternatives = Some(false),
              context = Some("search")
            )
          )
        ),
        consequence = Some(
          Consequence(
            params = Some(
              ConsequenceParams(
                filters = Some("brand:apple"),
                query = Some(
                  ConsequenceQueryObject(
                    remove = Some(Seq("algolia")),
                    edits = Some(
                      Seq(
                        Edit(
                          `type` = Some(EditType.withName("remove")),
                          delete = Some("abc"),
                          insert = Some("cde")
                        ),
                        Edit(
                          `type` = Some(EditType.withName("replace")),
                          delete = Some("abc"),
                          insert = Some("cde")
                        )
                      )
                    )
                  )
                )
              )
            ),
            hide = Some(
              Seq(
                ConsequenceHide(
                  objectID = "321"
                )
              )
            ),
            filterPromotes = Some(false),
            userData = Some(
              JObject(
                List(
                  JField("algolia", JString("aloglia"))
                )
              )
            ),
            promote = Some(
              Seq(
                PromoteObjectID(
                  objectID = "abc",
                  position = 3
                ),
                PromoteObjectIDs(
                  objectIDs = Seq("abc", "def"),
                  position = 1
                )
              )
            )
          )
        ),
        description = Some("test"),
        enabled = Some(true),
        validity = Some(
          Seq(
            TimeRange(
              from = 1656670273,
              until = 1656670277
            )
          )
        )
      ),
      forwardToReplicas = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/rules/id1")
    assert(res.method == "PUT")
    val expectedBody = parse(
      """{"objectID":"id1","conditions":[{"pattern":"apple","anchoring":"contains","alternatives":false,"context":"search"}],"consequence":{"params":{"filters":"brand:apple","query":{"remove":["algolia"],"edits":[{"type":"remove","delete":"abc","insert":"cde"},{"type":"replace","delete":"abc","insert":"cde"}]}},"hide":[{"objectID":"321"}],"filterPromotes":false,"userData":{"algolia":"aloglia"},"promote":[{"objectID":"abc","position":3},{"objectIDs":["abc","def"],"position":1}]},"description":"test","enabled":true,"validity":[{"from":1656670273,"until":1656670277}]}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"forwardToReplicas":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("saveRules with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.saveRules(
      indexName = "indexName",
      rules = Seq(
        Rule(
          objectID = "a-rule-id",
          conditions = Some(
            Seq(
              Condition(
                pattern = Some("smartphone"),
                anchoring = Some(Anchoring.withName("contains"))
              )
            )
          )
        ),
        Rule(
          objectID = "a-second-rule-id",
          conditions = Some(
            Seq(
              Condition(
                pattern = Some("apple"),
                anchoring = Some(Anchoring.withName("contains"))
              )
            )
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/rules/batch")
    assert(res.method == "POST")
    val expectedBody = parse(
      """[{"objectID":"a-rule-id","conditions":[{"pattern":"smartphone","anchoring":"contains"}]},{"objectID":"a-second-rule-id","conditions":[{"pattern":"apple","anchoring":"contains"}]}]"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("saveRules with all parameters") {
    val (client, echo) = testClient()
    val future = client.saveRules(
      indexName = "indexName",
      rules = Seq(
        Rule(
          objectID = "id1",
          conditions = Some(
            Seq(
              Condition(
                pattern = Some("apple"),
                anchoring = Some(Anchoring.withName("contains")),
                alternatives = Some(false),
                context = Some("search")
              )
            )
          ),
          consequence = Some(
            Consequence(
              params = Some(
                ConsequenceParams(
                  filters = Some("brand:apple"),
                  query = Some(
                    ConsequenceQueryObject(
                      remove = Some(Seq("algolia")),
                      edits = Some(
                        Seq(
                          Edit(
                            `type` = Some(EditType.withName("remove")),
                            delete = Some("abc"),
                            insert = Some("cde")
                          ),
                          Edit(
                            `type` = Some(EditType.withName("replace")),
                            delete = Some("abc"),
                            insert = Some("cde")
                          )
                        )
                      )
                    )
                  )
                )
              ),
              hide = Some(
                Seq(
                  ConsequenceHide(
                    objectID = "321"
                  )
                )
              ),
              filterPromotes = Some(false),
              userData = Some(
                JObject(
                  List(
                    JField("algolia", JString("aloglia"))
                  )
                )
              ),
              promote = Some(
                Seq(
                  PromoteObjectID(
                    objectID = "abc",
                    position = 3
                  ),
                  PromoteObjectIDs(
                    objectIDs = Seq("abc", "def"),
                    position = 1
                  )
                )
              )
            )
          ),
          description = Some("test"),
          enabled = Some(true),
          validity = Some(
            Seq(
              TimeRange(
                from = 1656670273,
                until = 1656670277
              )
            )
          )
        )
      ),
      forwardToReplicas = Some(true),
      clearExistingRules = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/rules/batch")
    assert(res.method == "POST")
    val expectedBody = parse(
      """[{"objectID":"id1","conditions":[{"pattern":"apple","anchoring":"contains","alternatives":false,"context":"search"}],"consequence":{"params":{"filters":"brand:apple","query":{"remove":["algolia"],"edits":[{"type":"remove","delete":"abc","insert":"cde"},{"type":"replace","delete":"abc","insert":"cde"}]}},"hide":[{"objectID":"321"}],"filterPromotes":false,"userData":{"algolia":"aloglia"},"promote":[{"objectID":"abc","position":3},{"objectIDs":["abc","def"],"position":1}]},"description":"test","enabled":true,"validity":[{"from":1656670273,"until":1656670277}]}]"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery =
      parse("""{"forwardToReplicas":"true","clearExistingRules":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("saveSynonym0") {
    val (client, echo) = testClient()
    val future = client.saveSynonym(
      indexName = "indexName",
      objectID = "id1",
      synonymHit = SynonymHit(
        objectID = "id1",
        `type` = SynonymType.withName("synonym"),
        synonyms = Some(Seq("car", "vehicule", "auto"))
      ),
      forwardToReplicas = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/synonyms/id1")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"objectID":"id1","type":"synonym","synonyms":["car","vehicule","auto"]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"forwardToReplicas":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("saveSynonyms0") {
    val (client, echo) = testClient()
    val future = client.saveSynonyms(
      indexName = "indexName",
      synonymHit = Seq(
        SynonymHit(
          objectID = "id1",
          `type` = SynonymType.withName("synonym"),
          synonyms = Some(Seq("car", "vehicule", "auto"))
        ),
        SynonymHit(
          objectID = "id2",
          `type` = SynonymType.withName("onewaysynonym"),
          input = Some("iphone"),
          synonyms = Some(Seq("ephone", "aphone", "yphone"))
        )
      ),
      forwardToReplicas = Some(true),
      replaceExistingSynonyms = Some(false)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/synonyms/batch")
    assert(res.method == "POST")
    val expectedBody = parse(
      """[{"objectID":"id1","type":"synonym","synonyms":["car","vehicule","auto"]},{"objectID":"id2","type":"onewaysynonym","input":"iphone","synonyms":["ephone","aphone","yphone"]}]"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery =
      parse("""{"forwardToReplicas":"true","replaceExistingSynonyms":"false"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("search for a single hits request with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.search(
      searchMethodParams = SearchMethodParams(
        requests = Seq(
          SearchForHits(
            indexName = "theIndexName"
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/*/queries")
    assert(res.method == "POST")
    val expectedBody = parse("""{"requests":[{"indexName":"theIndexName"}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("search for a single facet request with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.search(
      searchMethodParams = SearchMethodParams(
        requests = Seq(
          SearchForFacets(
            indexName = "theIndexName",
            `type` = SearchTypeFacet.withName("facet"),
            facet = "theFacet"
          )
        ),
        strategy = Some(SearchStrategy.withName("stopIfEnoughMatches"))
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/*/queries")
    assert(res.method == "POST")
    val expectedBody = parse(
      """{"requests":[{"indexName":"theIndexName","type":"facet","facet":"theFacet"}],"strategy":"stopIfEnoughMatches"}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("search for a single hits request with all parameters") {
    val (client, echo) = testClient()
    val future = client.search(
      searchMethodParams = SearchMethodParams(
        requests = Seq(
          SearchForHits(
            indexName = "theIndexName",
            query = Some("myQuery"),
            hitsPerPage = Some(50),
            `type` = Some(SearchTypeDefault.withName("default"))
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/*/queries")
    assert(res.method == "POST")
    val expectedBody =
      parse("""{"requests":[{"indexName":"theIndexName","query":"myQuery","hitsPerPage":50,"type":"default"}]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("search for a single facet request with all parameters") {
    val (client, echo) = testClient()
    val future = client.search(
      searchMethodParams = SearchMethodParams(
        requests = Seq(
          SearchForFacets(
            indexName = "theIndexName",
            `type` = SearchTypeFacet.withName("facet"),
            facet = "theFacet",
            facetQuery = Some("theFacetQuery"),
            query = Some("theQuery"),
            maxFacetHits = Some(50)
          )
        ),
        strategy = Some(SearchStrategy.withName("stopIfEnoughMatches"))
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/*/queries")
    assert(res.method == "POST")
    val expectedBody = parse(
      """{"requests":[{"indexName":"theIndexName","type":"facet","facet":"theFacet","facetQuery":"theFacetQuery","query":"theQuery","maxFacetHits":50}],"strategy":"stopIfEnoughMatches"}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("search for multiple mixed requests in multiple indices with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.search(
      searchMethodParams = SearchMethodParams(
        requests = Seq(
          SearchForHits(
            indexName = "theIndexName"
          ),
          SearchForFacets(
            indexName = "theIndexName2",
            `type` = SearchTypeFacet.withName("facet"),
            facet = "theFacet"
          ),
          SearchForHits(
            indexName = "theIndexName",
            `type` = Some(SearchTypeDefault.withName("default"))
          )
        ),
        strategy = Some(SearchStrategy.withName("stopIfEnoughMatches"))
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/*/queries")
    assert(res.method == "POST")
    val expectedBody = parse(
      """{"requests":[{"indexName":"theIndexName"},{"indexName":"theIndexName2","type":"facet","facet":"theFacet"},{"indexName":"theIndexName","type":"default"}],"strategy":"stopIfEnoughMatches"}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("search for multiple mixed requests in multiple indices with all parameters") {
    val (client, echo) = testClient()
    val future = client.search(
      searchMethodParams = SearchMethodParams(
        requests = Seq(
          SearchForFacets(
            indexName = "theIndexName",
            `type` = SearchTypeFacet.withName("facet"),
            facet = "theFacet",
            facetQuery = Some("theFacetQuery"),
            query = Some("theQuery"),
            maxFacetHits = Some(50)
          ),
          SearchForHits(
            indexName = "theIndexName",
            query = Some("myQuery"),
            hitsPerPage = Some(50),
            `type` = Some(SearchTypeDefault.withName("default"))
          )
        ),
        strategy = Some(SearchStrategy.withName("stopIfEnoughMatches"))
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/*/queries")
    assert(res.method == "POST")
    val expectedBody = parse(
      """{"requests":[{"indexName":"theIndexName","type":"facet","facet":"theFacet","facetQuery":"theFacetQuery","query":"theQuery","maxFacetHits":50},{"indexName":"theIndexName","query":"myQuery","hitsPerPage":50,"type":"default"}],"strategy":"stopIfEnoughMatches"}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("search filters accept all of the possible shapes") {
    val (client, echo) = testClient()
    val future = client.search(
      searchMethodParams = SearchMethodParams(
        requests = Seq(
          SearchForHits(
            indexName = "theIndexName",
            facetFilters = Some(FacetFilters("mySearch:filters")),
            reRankingApplyFilter = Some(ReRankingApplyFilter("mySearch:filters")),
            tagFilters = Some(TagFilters("mySearch:filters")),
            numericFilters = Some(NumericFilters("mySearch:filters")),
            optionalFilters = Some(OptionalFilters("mySearch:filters"))
          ),
          SearchForHits(
            indexName = "theIndexName",
            facetFilters = Some(
              FacetFilters(Seq(MixedSearchFilters("mySearch:filters"), MixedSearchFilters(Seq("mySearch:filters"))))
            ),
            reRankingApplyFilter = Some(
              ReRankingApplyFilter(
                Seq(MixedSearchFilters("mySearch:filters"), MixedSearchFilters(Seq("mySearch:filters")))
              )
            ),
            tagFilters = Some(
              TagFilters(Seq(MixedSearchFilters("mySearch:filters"), MixedSearchFilters(Seq("mySearch:filters"))))
            ),
            numericFilters = Some(
              NumericFilters(Seq(MixedSearchFilters("mySearch:filters"), MixedSearchFilters(Seq("mySearch:filters"))))
            ),
            optionalFilters = Some(
              OptionalFilters(Seq(MixedSearchFilters("mySearch:filters"), MixedSearchFilters(Seq("mySearch:filters"))))
            )
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/*/queries")
    assert(res.method == "POST")
    val expectedBody = parse(
      """{"requests":[{"indexName":"theIndexName","facetFilters":"mySearch:filters","reRankingApplyFilter":"mySearch:filters","tagFilters":"mySearch:filters","numericFilters":"mySearch:filters","optionalFilters":"mySearch:filters"},{"indexName":"theIndexName","facetFilters":["mySearch:filters",["mySearch:filters"]],"reRankingApplyFilter":["mySearch:filters",["mySearch:filters"]],"tagFilters":["mySearch:filters",["mySearch:filters"]],"numericFilters":["mySearch:filters",["mySearch:filters"]],"optionalFilters":["mySearch:filters",["mySearch:filters"]]}]}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("search with all search parameters") {
    val (client, echo) = testClient()
    val future = client.search(
      searchMethodParams = SearchMethodParams(
        requests = Seq(
          SearchForHits(
            advancedSyntax = Some(true),
            advancedSyntaxFeatures = Some(Seq(AdvancedSyntaxFeatures.withName("exactPhrase"))),
            allowTyposOnNumericTokens = Some(true),
            alternativesAsExact = Some(Seq(AlternativesAsExact.withName("multiWordsSynonym"))),
            analytics = Some(true),
            analyticsTags = Some(Seq("")),
            aroundLatLng = Some(""),
            aroundLatLngViaIP = Some(true),
            aroundPrecision = Some(AroundPrecision(0)),
            aroundRadius = Some(AroundRadiusAll.withName("all")),
            attributeCriteriaComputedByMinProximity = Some(true),
            attributesForFaceting = Some(Seq("")),
            attributesToHighlight = Some(Seq("")),
            attributesToRetrieve = Some(Seq("")),
            attributesToSnippet = Some(Seq("")),
            clickAnalytics = Some(true),
            customRanking = Some(Seq("")),
            decompoundQuery = Some(true),
            disableExactOnAttributes = Some(Seq("")),
            disableTypoToleranceOnAttributes = Some(Seq("")),
            distinct = Some(Distinct(0)),
            enableABTest = Some(true),
            enablePersonalization = Some(true),
            enableReRanking = Some(true),
            enableRules = Some(true),
            exactOnSingleWordQuery = Some(ExactOnSingleWordQuery.withName("attribute")),
            explain = Some(Seq("foo", "bar")),
            facetFilters = Some(FacetFilters(Seq(MixedSearchFilters("")))),
            facetingAfterDistinct = Some(true),
            facets = Some(Seq("")),
            filters = Some(""),
            getRankingInfo = Some(true),
            highlightPostTag = Some(""),
            highlightPreTag = Some(""),
            hitsPerPage = Some(0),
            ignorePlurals = Some(IgnorePlurals(false)),
            indexName = "theIndexName",
            insideBoundingBox = Some(Seq(Seq(47.3165, 4.9665, 47.3424, 5.0201), Seq(40.9234, 2.1185, 38.643, 1.9916))),
            insidePolygon = Some(
              Seq(
                Seq(47.3165, 4.9665, 47.3424, 5.0201, 47.32, 4.9),
                Seq(40.9234, 2.1185, 38.643, 1.9916, 39.2587, 2.0104)
              )
            ),
            keepDiacriticsOnCharacters = Some(""),
            length = Some(0),
            maxValuesPerFacet = Some(0),
            minProximity = Some(0),
            minWordSizefor1Typo = Some(0),
            minWordSizefor2Typos = Some(0),
            minimumAroundRadius = Some(0),
            naturalLanguages = Some(Seq("")),
            numericFilters = Some(NumericFilters(Seq(MixedSearchFilters("")))),
            offset = Some(0),
            optionalFilters = Some(OptionalFilters(Seq(MixedSearchFilters("")))),
            optionalWords = Some(Seq("")),
            page = Some(0),
            percentileComputation = Some(true),
            personalizationImpact = Some(0),
            query = Some(""),
            queryLanguages = Some(Seq("")),
            queryType = Some(QueryType.withName("prefixAll")),
            ranking = Some(Seq("")),
            reRankingApplyFilter = Some(ReRankingApplyFilter(Seq(MixedSearchFilters("")))),
            relevancyStrictness = Some(0),
            removeStopWords = Some(RemoveStopWords(true)),
            removeWordsIfNoResults = Some(RemoveWordsIfNoResults.withName("allOptional")),
            renderingContent = Some(
              RenderingContent(
                facetOrdering = Some(
                  FacetOrdering(
                    facets = Some(
                      Facets(
                        order = Some(Seq("a", "b"))
                      )
                    ),
                    values = Some(
                      Map(
                        "a" -> Value(
                          order = Some(Seq("b")),
                          sortRemainingBy = Some(SortRemainingBy.withName("count"))
                        )
                      )
                    )
                  )
                )
              )
            ),
            replaceSynonymsInHighlight = Some(true),
            responseFields = Some(Seq("")),
            restrictHighlightAndSnippetArrays = Some(true),
            restrictSearchableAttributes = Some(Seq("")),
            ruleContexts = Some(Seq("")),
            similarQuery = Some(""),
            snippetEllipsisText = Some(""),
            sortFacetValuesBy = Some(""),
            sumOrFiltersScores = Some(true),
            synonyms = Some(true),
            tagFilters = Some(TagFilters(Seq(MixedSearchFilters("")))),
            `type` = Some(SearchTypeDefault.withName("default")),
            typoTolerance = Some(TypoToleranceEnum.withName("min")),
            userToken = Some("")
          )
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/*/queries")
    assert(res.method == "POST")
    val expectedBody = parse(
      """{"requests":[{"advancedSyntax":true,"advancedSyntaxFeatures":["exactPhrase"],"allowTyposOnNumericTokens":true,"alternativesAsExact":["multiWordsSynonym"],"analytics":true,"analyticsTags":[""],"aroundLatLng":"","aroundLatLngViaIP":true,"aroundPrecision":0,"aroundRadius":"all","attributeCriteriaComputedByMinProximity":true,"attributesForFaceting":[""],"attributesToHighlight":[""],"attributesToRetrieve":[""],"attributesToSnippet":[""],"clickAnalytics":true,"customRanking":[""],"decompoundQuery":true,"disableExactOnAttributes":[""],"disableTypoToleranceOnAttributes":[""],"distinct":0,"enableABTest":true,"enablePersonalization":true,"enableReRanking":true,"enableRules":true,"exactOnSingleWordQuery":"attribute","explain":["foo","bar"],"facetFilters":[""],"facetingAfterDistinct":true,"facets":[""],"filters":"","getRankingInfo":true,"highlightPostTag":"","highlightPreTag":"","hitsPerPage":0,"ignorePlurals":false,"indexName":"theIndexName","insideBoundingBox":[[47.3165,4.9665,47.3424,5.0201],[40.9234,2.1185,38.643,1.9916]],"insidePolygon":[[47.3165,4.9665,47.3424,5.0201,47.32,4.9],[40.9234,2.1185,38.643,1.9916,39.2587,2.0104]],"keepDiacriticsOnCharacters":"","length":0,"maxValuesPerFacet":0,"minProximity":0,"minWordSizefor1Typo":0,"minWordSizefor2Typos":0,"minimumAroundRadius":0,"naturalLanguages":[""],"numericFilters":[""],"offset":0,"optionalFilters":[""],"optionalWords":[""],"page":0,"percentileComputation":true,"personalizationImpact":0,"query":"","queryLanguages":[""],"queryType":"prefixAll","ranking":[""],"reRankingApplyFilter":[""],"relevancyStrictness":0,"removeStopWords":true,"removeWordsIfNoResults":"allOptional","renderingContent":{"facetOrdering":{"facets":{"order":["a","b"]},"values":{"a":{"order":["b"],"sortRemainingBy":"count"}}}},"replaceSynonymsInHighlight":true,"responseFields":[""],"restrictHighlightAndSnippetArrays":true,"restrictSearchableAttributes":[""],"ruleContexts":[""],"similarQuery":"","snippetEllipsisText":"","sortFacetValuesBy":"","sumOrFiltersScores":true,"synonyms":true,"tagFilters":[""],"type":"default","typoTolerance":"min","userToken":""}]}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("get searchDictionaryEntries results with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.searchDictionaryEntries(
      dictionaryName = DictionaryType.withName("compounds"),
      searchDictionaryEntriesParams = SearchDictionaryEntriesParams(
        query = "foo"
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/dictionaries/compounds/search")
    assert(res.method == "POST")
    val expectedBody = parse("""{"query":"foo"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("get searchDictionaryEntries results with all parameters") {
    val (client, echo) = testClient()
    val future = client.searchDictionaryEntries(
      dictionaryName = DictionaryType.withName("compounds"),
      searchDictionaryEntriesParams = SearchDictionaryEntriesParams(
        query = "foo",
        page = Some(4),
        hitsPerPage = Some(2),
        language = Some("fr")
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/dictionaries/compounds/search")
    assert(res.method == "POST")
    val expectedBody = parse("""{"query":"foo","page":4,"hitsPerPage":2,"language":"fr"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("get searchForFacetValues results with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.searchForFacetValues(
      indexName = "indexName",
      facetName = "facetName"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/facets/facetName/query")
    assert(res.method == "POST")
    val expectedBody = parse("""{}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("get searchForFacetValues results with all parameters") {
    val (client, echo) = testClient()
    val future = client.searchForFacetValues(
      indexName = "indexName",
      facetName = "facetName",
      searchForFacetValuesRequest = Some(
        SearchForFacetValuesRequest(
          params = Some("query=foo&facetFilters=['bar']"),
          facetQuery = Some("foo"),
          maxFacetHits = Some(42)
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/facets/facetName/query")
    assert(res.method == "POST")
    val expectedBody = parse("""{"params":"query=foo&facetFilters=['bar']","facetQuery":"foo","maxFacetHits":42}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("searchRules0") {
    val (client, echo) = testClient()
    val future = client.searchRules(
      indexName = "indexName",
      searchRulesParams = Some(
        SearchRulesParams(
          query = Some("something")
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/rules/search")
    assert(res.method == "POST")
    val expectedBody = parse("""{"query":"something"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("search with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.searchSingleIndex(
      indexName = "indexName"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/query")
    assert(res.method == "POST")
    val expectedBody = parse("""{}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("search with searchParams") {
    val (client, echo) = testClient()
    val future = client.searchSingleIndex(
      indexName = "indexName",
      searchParams = Some(
        SearchParamsObject(
          query = Some("myQuery"),
          facetFilters = Some(FacetFilters(Seq(MixedSearchFilters("tags:algolia"))))
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/query")
    assert(res.method == "POST")
    val expectedBody = parse("""{"query":"myQuery","facetFilters":["tags:algolia"]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("searchSynonyms with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.searchSynonyms(
      indexName = "indexName"
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/synonyms/search")
    assert(res.method == "POST")
    val expectedBody = parse("""{}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("searchSynonyms with all parameters") {
    val (client, echo) = testClient()
    val future = client.searchSynonyms(
      indexName = "indexName",
      `type` = Some(SynonymType.withName("altcorrection1")),
      page = Some(10),
      hitsPerPage = Some(10),
      searchSynonymsParams = Some(
        SearchSynonymsParams(
          query = Some("myQuery")
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/indexName/synonyms/search")
    assert(res.method == "POST")
    val expectedBody = parse("""{"query":"myQuery"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery =
      parse("""{"type":"altcorrection1","page":"10","hitsPerPage":"10"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("searchUserIds0") {
    val (client, echo) = testClient()
    val future = client.searchUserIds(
      searchUserIdsParams = SearchUserIdsParams(
        query = "test",
        clusterName = Some("theClusterName"),
        page = Some(5),
        hitsPerPage = Some(10)
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/clusters/mapping/search")
    assert(res.method == "POST")
    val expectedBody = parse("""{"query":"test","clusterName":"theClusterName","page":5,"hitsPerPage":10}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("get setDictionarySettings results with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.setDictionarySettings(
      dictionarySettingsParams = DictionarySettingsParams(
        disableStandardEntries = StandardEntries(
          plurals = Some(Map("fr" -> false, "en" -> false, "ru" -> true))
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/dictionaries/*/settings")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"disableStandardEntries":{"plurals":{"fr":false,"en":false,"ru":true}}}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("get setDictionarySettings results with all parameters") {
    val (client, echo) = testClient()
    val future = client.setDictionarySettings(
      dictionarySettingsParams = DictionarySettingsParams(
        disableStandardEntries = StandardEntries(
          plurals = Some(Map("fr" -> false, "en" -> false, "ru" -> true)),
          stopwords = Some(Map("fr" -> false)),
          compounds = Some(Map("ru" -> true))
        )
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/dictionaries/*/settings")
    assert(res.method == "PUT")
    val expectedBody = parse(
      """{"disableStandardEntries":{"plurals":{"fr":false,"en":false,"ru":true},"stopwords":{"fr":false},"compounds":{"ru":true}}}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("setSettings with minimal parameters") {
    val (client, echo) = testClient()
    val future = client.setSettings(
      indexName = "theIndexName",
      indexSettings = IndexSettings(
        paginationLimitedTo = Some(10)
      ),
      forwardToReplicas = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/settings")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"paginationLimitedTo":10}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"forwardToReplicas":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("setSettings allow boolean `typoTolerance`") {
    val (client, echo) = testClient()
    val future = client.setSettings(
      indexName = "theIndexName",
      indexSettings = IndexSettings(
        typoTolerance = Some(TypoTolerance(true))
      ),
      forwardToReplicas = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/settings")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"typoTolerance":true}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"forwardToReplicas":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("setSettings allow enum `typoTolerance`") {
    val (client, echo) = testClient()
    val future = client.setSettings(
      indexName = "theIndexName",
      indexSettings = IndexSettings(
        typoTolerance = Some(TypoToleranceEnum.withName("min"))
      ),
      forwardToReplicas = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/settings")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"typoTolerance":"min"}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"forwardToReplicas":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("setSettings allow boolean `ignorePlurals`") {
    val (client, echo) = testClient()
    val future = client.setSettings(
      indexName = "theIndexName",
      indexSettings = IndexSettings(
        ignorePlurals = Some(IgnorePlurals(true))
      ),
      forwardToReplicas = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/settings")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"ignorePlurals":true}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"forwardToReplicas":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("setSettings allow list of string `ignorePlurals`") {
    val (client, echo) = testClient()
    val future = client.setSettings(
      indexName = "theIndexName",
      indexSettings = IndexSettings(
        ignorePlurals = Some(IgnorePlurals(Seq("algolia")))
      ),
      forwardToReplicas = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/settings")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"ignorePlurals":["algolia"]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"forwardToReplicas":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("setSettings allow boolean `removeStopWords`") {
    val (client, echo) = testClient()
    val future = client.setSettings(
      indexName = "theIndexName",
      indexSettings = IndexSettings(
        removeStopWords = Some(RemoveStopWords(true))
      ),
      forwardToReplicas = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/settings")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"removeStopWords":true}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"forwardToReplicas":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("setSettings allow list of string `removeStopWords`") {
    val (client, echo) = testClient()
    val future = client.setSettings(
      indexName = "theIndexName",
      indexSettings = IndexSettings(
        removeStopWords = Some(RemoveStopWords(Seq("algolia")))
      ),
      forwardToReplicas = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/settings")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"removeStopWords":["algolia"]}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"forwardToReplicas":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("setSettings allow boolean `distinct`") {
    val (client, echo) = testClient()
    val future = client.setSettings(
      indexName = "theIndexName",
      indexSettings = IndexSettings(
        distinct = Some(Distinct(true))
      ),
      forwardToReplicas = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/settings")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"distinct":true}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"forwardToReplicas":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("setSettings allow integers for `distinct`") {
    val (client, echo) = testClient()
    val future = client.setSettings(
      indexName = "theIndexName",
      indexSettings = IndexSettings(
        distinct = Some(Distinct(1))
      ),
      forwardToReplicas = Some(true)
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/settings")
    assert(res.method == "PUT")
    val expectedBody = parse("""{"distinct":1}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
    val expectedQuery = parse("""{"forwardToReplicas":"true"}""").asInstanceOf[JObject].obj.toMap
    val actualQuery = res.queryParameters
    assert(actualQuery.size == expectedQuery.size)
    for ((k, v) <- actualQuery) {
      assert(expectedQuery.contains(k))
      assert(expectedQuery(k).values == v)
    }
  }

  test("setSettings allow all `indexSettings`") {
    val (client, echo) = testClient()
    val future = client.setSettings(
      indexName = "theIndexName",
      indexSettings = IndexSettings(
        advancedSyntax = Some(true),
        advancedSyntaxFeatures = Some(Seq(AdvancedSyntaxFeatures.withName("exactPhrase"))),
        allowCompressionOfIntegerArray = Some(true),
        allowTyposOnNumericTokens = Some(true),
        alternativesAsExact = Some(Seq(AlternativesAsExact.withName("singleWordSynonym"))),
        attributeCriteriaComputedByMinProximity = Some(true),
        attributeForDistinct = Some("test"),
        attributesForFaceting = Some(Seq("algolia")),
        attributesToHighlight = Some(Seq("algolia")),
        attributesToRetrieve = Some(Seq("algolia")),
        attributesToSnippet = Some(Seq("algolia")),
        attributesToTransliterate = Some(Seq("algolia")),
        camelCaseAttributes = Some(Seq("algolia")),
        customNormalization = Some(Map("algolia" -> Map("aloglia" -> "aglolia"))),
        customRanking = Some(Seq("algolia")),
        decompoundQuery = Some(false),
        decompoundedAttributes = Some(JObject(List(JField("algolia", JString("aloglia"))))),
        disableExactOnAttributes = Some(Seq("algolia")),
        disablePrefixOnAttributes = Some(Seq("algolia")),
        disableTypoToleranceOnAttributes = Some(Seq("algolia")),
        disableTypoToleranceOnWords = Some(Seq("algolia")),
        distinct = Some(Distinct(3)),
        enablePersonalization = Some(true),
        enableReRanking = Some(false),
        enableRules = Some(true),
        exactOnSingleWordQuery = Some(ExactOnSingleWordQuery.withName("attribute")),
        highlightPreTag = Some("<span>"),
        highlightPostTag = Some("</span>"),
        hitsPerPage = Some(10),
        ignorePlurals = Some(IgnorePlurals(false)),
        indexLanguages = Some(Seq("algolia")),
        keepDiacriticsOnCharacters = Some("abc"),
        maxFacetHits = Some(20),
        maxValuesPerFacet = Some(30),
        minProximity = Some(6),
        minWordSizefor1Typo = Some(5),
        minWordSizefor2Typos = Some(11),
        mode = Some(Mode.withName("neuralSearch")),
        numericAttributesForFiltering = Some(Seq("algolia")),
        optionalWords = Some(Seq("myspace")),
        paginationLimitedTo = Some(0),
        queryLanguages = Some(Seq("algolia")),
        queryType = Some(QueryType.withName("prefixLast")),
        ranking = Some(Seq("geo")),
        reRankingApplyFilter = Some(ReRankingApplyFilter("mySearch:filters")),
        relevancyStrictness = Some(10),
        removeStopWords = Some(RemoveStopWords(false)),
        removeWordsIfNoResults = Some(RemoveWordsIfNoResults.withName("lastWords")),
        renderingContent = Some(
          RenderingContent(
            facetOrdering = Some(
              FacetOrdering(
                facets = Some(
                  Facets(
                    order = Some(Seq("a", "b"))
                  )
                ),
                values = Some(
                  Map(
                    "a" -> Value(
                      order = Some(Seq("b")),
                      sortRemainingBy = Some(SortRemainingBy.withName("count"))
                    )
                  )
                )
              )
            )
          )
        ),
        replaceSynonymsInHighlight = Some(true),
        replicas = Some(Seq("")),
        responseFields = Some(Seq("algolia")),
        restrictHighlightAndSnippetArrays = Some(true),
        searchableAttributes = Some(Seq("foo")),
        semanticSearch = Some(
          SemanticSearch(
            eventSources = Some(Seq("foo"))
          )
        ),
        separatorsToIndex = Some("bar"),
        snippetEllipsisText = Some("---"),
        sortFacetValuesBy = Some("date"),
        typoTolerance = Some(TypoTolerance(false)),
        unretrievableAttributes = Some(Seq("foo")),
        userData = Some(JObject(List(JField("user", JString("data")))))
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/indexes/theIndexName/settings")
    assert(res.method == "PUT")
    val expectedBody = parse(
      """{"advancedSyntax":true,"advancedSyntaxFeatures":["exactPhrase"],"allowCompressionOfIntegerArray":true,"allowTyposOnNumericTokens":true,"alternativesAsExact":["singleWordSynonym"],"attributeCriteriaComputedByMinProximity":true,"attributeForDistinct":"test","attributesForFaceting":["algolia"],"attributesToHighlight":["algolia"],"attributesToRetrieve":["algolia"],"attributesToSnippet":["algolia"],"attributesToTransliterate":["algolia"],"camelCaseAttributes":["algolia"],"customNormalization":{"algolia":{"aloglia":"aglolia"}},"customRanking":["algolia"],"decompoundQuery":false,"decompoundedAttributes":{"algolia":"aloglia"},"disableExactOnAttributes":["algolia"],"disablePrefixOnAttributes":["algolia"],"disableTypoToleranceOnAttributes":["algolia"],"disableTypoToleranceOnWords":["algolia"],"distinct":3,"enablePersonalization":true,"enableReRanking":false,"enableRules":true,"exactOnSingleWordQuery":"attribute","highlightPreTag":"<span>","highlightPostTag":"</span>","hitsPerPage":10,"ignorePlurals":false,"indexLanguages":["algolia"],"keepDiacriticsOnCharacters":"abc","maxFacetHits":20,"maxValuesPerFacet":30,"minProximity":6,"minWordSizefor1Typo":5,"minWordSizefor2Typos":11,"mode":"neuralSearch","numericAttributesForFiltering":["algolia"],"optionalWords":["myspace"],"paginationLimitedTo":0,"queryLanguages":["algolia"],"queryType":"prefixLast","ranking":["geo"],"reRankingApplyFilter":"mySearch:filters","relevancyStrictness":10,"removeStopWords":false,"removeWordsIfNoResults":"lastWords","renderingContent":{"facetOrdering":{"facets":{"order":["a","b"]},"values":{"a":{"order":["b"],"sortRemainingBy":"count"}}}},"replaceSynonymsInHighlight":true,"replicas":[""],"responseFields":["algolia"],"restrictHighlightAndSnippetArrays":true,"searchableAttributes":["foo"],"semanticSearch":{"eventSources":["foo"]},"separatorsToIndex":"bar","snippetEllipsisText":"---","sortFacetValuesBy":"date","typoTolerance":false,"unretrievableAttributes":["foo"],"userData":{"user":"data"}}"""
    )
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

  test("updateApiKey0") {
    val (client, echo) = testClient()
    val future = client.updateApiKey(
      key = "myApiKey",
      apiKey = ApiKey(
        acl = Seq(Acl.withName("search"), Acl.withName("addObject")),
        validity = Some(300),
        maxQueriesPerIPPerHour = Some(100),
        maxHitsPerQuery = Some(20)
      )
    )

    Await.ready(future, Duration.Inf)
    val res = echo.lastResponse.get

    assert(res.path == "/1/keys/myApiKey")
    assert(res.method == "PUT")
    val expectedBody =
      parse("""{"acl":["search","addObject"],"validity":300,"maxQueriesPerIPPerHour":100,"maxHitsPerQuery":20}""")
    val actualBody = parse(res.body.get)
    assert(actualBody == expectedBody)
  }

}
