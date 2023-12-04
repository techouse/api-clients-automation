/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
  * https://github.com/algolia/api-clients-automation. DO NOT EDIT.
  */
package algoliasearch.api

import algoliasearch.recommend.DeletedAtResponse
import algoliasearch.recommend.ErrorBase
import algoliasearch.recommend.GetRecommendTaskResponse
import algoliasearch.recommend.GetRecommendationsParams
import algoliasearch.recommend.GetRecommendationsResponse
import algoliasearch.recommend.RecommendModels._
import algoliasearch.recommend.RuleResponse
import algoliasearch.recommend.SearchRecommendRulesParams
import algoliasearch.recommend.SearchRecommendRulesResponse
import algoliasearch.recommend._
import algoliasearch.ApiClient
import algoliasearch.api.RecommendClient.hosts
import algoliasearch.config._
import algoliasearch.internal.util._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.Random

object RecommendClient {

  /** Creates a new SearchApi instance using default hosts.
    *
    * @param appId
    *   application ID
    * @param apiKey
    *   api key
    *
    * @param clientOptions
    *   client options
    */
  def apply(
      appId: String,
      apiKey: String,
      clientOptions: ClientOptions = ClientOptions()
  ) = new RecommendClient(
    appId = appId,
    apiKey = apiKey,
    clientOptions = clientOptions
  )

  private def hosts(appId: String): Seq[Host] = {
    val commonHosts = Random.shuffle(
      List(
        Host(appId + "-1.algolianet.net", Set(CallType.Read, CallType.Write)),
        Host(appId + "-2.algolianet.net", Set(CallType.Read, CallType.Write)),
        Host(appId + "-3.algolianet.net", Set(CallType.Read, CallType.Write))
      )
    )
    List(
      Host(appId + "-dsn.algolia.net", Set(CallType.Read)),
      Host(appId + ".algolia.net", Set(CallType.Write))
    ) ++ commonHosts
  }
}

class RecommendClient(
    appId: String,
    apiKey: String,
    clientOptions: ClientOptions = ClientOptions()
) extends ApiClient(
      appId = appId,
      apiKey = apiKey,
      clientName = "Recommend",
      defaultHosts = hosts(appId),
      formats = JsonSupport.format,
      options = clientOptions
    ) {

  /** This method allow you to send requests to the Algolia REST API.
    *
    * @param path
    *   Path of the endpoint, anything after \"/1\" must be specified.
    * @param parameters
    *   Query parameters to apply to the current query.
    */
  def del[T: Manifest](
      path: String,
      parameters: Map[String, Any] = Map.empty,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `del`.")

    val request = HttpRequest
      .builder()
      .withMethod("DELETE")
      .withPath(s"/1${escape(path)}")
      .withQueryParameters(parameters)
      .build()
    execute[T](request, requestOptions)
  }

  /** Delete a [Recommend rule](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).
    *
    * @param indexName
    *   Index on which to perform the request.
    * @param model
    *   [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).
    * @param objectID
    *   Unique record (object) identifier.
    */
  def deleteRecommendRule(
      indexName: String,
      model: RecommendModels,
      objectID: String,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[DeletedAtResponse] = Future {
    requireNotNull(indexName, "Parameter `indexName` is required when calling `deleteRecommendRule`.")
    requireNotNull(model, "Parameter `model` is required when calling `deleteRecommendRule`.")
    requireNotNull(objectID, "Parameter `objectID` is required when calling `deleteRecommendRule`.")

    val request = HttpRequest
      .builder()
      .withMethod("DELETE")
      .withPath(s"/1/indexes/${escape(indexName)}/${escape(model)}/recommend/rules/${escape(objectID)}")
      .build()
    execute[DeletedAtResponse](request, requestOptions)
  }

  /** This method allow you to send requests to the Algolia REST API.
    *
    * @param path
    *   Path of the endpoint, anything after \"/1\" must be specified.
    * @param parameters
    *   Query parameters to apply to the current query.
    */
  def get[T: Manifest](
      path: String,
      parameters: Map[String, Any] = Map.empty,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `get`.")

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1${escape(path)}")
      .withQueryParameters(parameters)
      .build()
    execute[T](request, requestOptions)
  }

  /** Return a [Recommend rule](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).
    *
    * @param indexName
    *   Index on which to perform the request.
    * @param model
    *   [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).
    * @param objectID
    *   Unique record (object) identifier.
    */
  def getRecommendRule(
      indexName: String,
      model: RecommendModels,
      objectID: String,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[RuleResponse] = Future {
    requireNotNull(indexName, "Parameter `indexName` is required when calling `getRecommendRule`.")
    requireNotNull(model, "Parameter `model` is required when calling `getRecommendRule`.")
    requireNotNull(objectID, "Parameter `objectID` is required when calling `getRecommendRule`.")

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1/indexes/${escape(indexName)}/${escape(model)}/recommend/rules/${escape(objectID)}")
      .build()
    execute[RuleResponse](request, requestOptions)
  }

  /** Some operations, such as deleting a Recommend rule, will respond with a `taskID` value. Use this value here to
    * check the status of that task.
    *
    * @param indexName
    *   Index on which to perform the request.
    * @param model
    *   [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).
    * @param taskID
    *   Unique identifier of a task. Numeric value (up to 64bits).
    */
  def getRecommendStatus(
      indexName: String,
      model: RecommendModels,
      taskID: Long,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[GetRecommendTaskResponse] = Future {
    requireNotNull(indexName, "Parameter `indexName` is required when calling `getRecommendStatus`.")
    requireNotNull(model, "Parameter `model` is required when calling `getRecommendStatus`.")
    requireNotNull(taskID, "Parameter `taskID` is required when calling `getRecommendStatus`.")

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1/indexes/${escape(indexName)}/${escape(model)}/task/${escape(taskID)}")
      .build()
    execute[GetRecommendTaskResponse](request, requestOptions)
  }

  /** Returns results from either recommendation or trending models: - **Recommendations** are provided by the [Related
    * Products](https://www.algolia.com/doc/guides/algolia-recommend/overview/#related-products-and-related-content) and
    * [Frequently Bought
    * Together](https://www.algolia.com/doc/guides/algolia-recommend/overview/#frequently-bought-together) models -
    * **Trending** models are [Trending Items and Trending Facet
    * Values](https://www.algolia.com/doc/guides/algolia-recommend/overview/#trending-items-and-trending-facet-values).
    */
  def getRecommendations(
      getRecommendationsParams: GetRecommendationsParams,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[GetRecommendationsResponse] = Future {
    requireNotNull(
      getRecommendationsParams,
      "Parameter `getRecommendationsParams` is required when calling `getRecommendations`."
    )

    val request = HttpRequest
      .builder()
      .withMethod("POST")
      .withPath(s"/1/indexes/*/recommendations")
      .withBody(getRecommendationsParams)
      .withRead(true)
      .build()
    execute[GetRecommendationsResponse](request, requestOptions)
  }

  /** This method allow you to send requests to the Algolia REST API.
    *
    * @param path
    *   Path of the endpoint, anything after \"/1\" must be specified.
    * @param parameters
    *   Query parameters to apply to the current query.
    * @param body
    *   Parameters to send with the custom request.
    */
  def post[T: Manifest](
      path: String,
      parameters: Map[String, Any] = Map.empty,
      body: Option[Any] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `post`.")

    val request = HttpRequest
      .builder()
      .withMethod("POST")
      .withPath(s"/1${escape(path)}")
      .withBody(body)
      .withQueryParameters(parameters)
      .build()
    execute[T](request, requestOptions)
  }

  /** This method allow you to send requests to the Algolia REST API.
    *
    * @param path
    *   Path of the endpoint, anything after \"/1\" must be specified.
    * @param parameters
    *   Query parameters to apply to the current query.
    * @param body
    *   Parameters to send with the custom request.
    */
  def put[T: Manifest](
      path: String,
      parameters: Map[String, Any] = Map.empty,
      body: Option[Any] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `put`.")

    val request = HttpRequest
      .builder()
      .withMethod("PUT")
      .withPath(s"/1${escape(path)}")
      .withBody(body)
      .withQueryParameters(parameters)
      .build()
    execute[T](request, requestOptions)
  }

  /** List [Recommend rules](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).
    *
    * @param indexName
    *   Index on which to perform the request.
    * @param model
    *   [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).
    */
  def searchRecommendRules(
      indexName: String,
      model: RecommendModels,
      searchRecommendRulesParams: Option[SearchRecommendRulesParams] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[SearchRecommendRulesResponse] = Future {
    requireNotNull(indexName, "Parameter `indexName` is required when calling `searchRecommendRules`.")
    requireNotNull(model, "Parameter `model` is required when calling `searchRecommendRules`.")

    val request = HttpRequest
      .builder()
      .withMethod("POST")
      .withPath(s"/1/indexes/${escape(indexName)}/${escape(model)}/recommend/rules/search")
      .withBody(searchRecommendRulesParams)
      .withRead(true)
      .build()
    execute[SearchRecommendRulesResponse](request, requestOptions)
  }

}