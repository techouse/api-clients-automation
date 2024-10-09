// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package algoliasearch.methods.snippets

import scala.concurrent.duration.Duration

// >IMPORT
import algoliasearch.api.InsightsClient

// IMPORT<
import algoliasearch.insights.*

import org.json4s.*
import org.json4s.native.JsonParser.*
import scala.concurrent.{Await, ExecutionContextExecutor}

class SnippetInsightsClient {
  implicit val ec: ExecutionContextExecutor = scala.concurrent.ExecutionContext.global
  implicit val formats: Formats = org.json4s.DefaultFormats

  /** Snippet for the customDelete method.
    *
    * allow del method for a custom path with minimal parameters
    */
  def snippetForInsightsClientCustomDelete(): Unit = {
    // >SEPARATOR customDelete default
    // Initialize the client
    val client = InsightsClient(
      appId = "ALGOLIA_APPLICATION_ID",
      apiKey = "ALGOLIA_API_KEY",
      region = Option("ALGOLIA_APPLICATION_REGION")
    )

    // Call the API
    val response = client.customDelete[JObject](
      path = "test/minimal"
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the customGet method.
    *
    * allow get method for a custom path with minimal parameters
    */
  def snippetForInsightsClientCustomGet(): Unit = {
    // >SEPARATOR customGet default
    // Initialize the client
    val client = InsightsClient(
      appId = "ALGOLIA_APPLICATION_ID",
      apiKey = "ALGOLIA_API_KEY",
      region = Option("ALGOLIA_APPLICATION_REGION")
    )

    // Call the API
    val response = client.customGet[JObject](
      path = "test/minimal"
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the customPost method.
    *
    * allow post method for a custom path with minimal parameters
    */
  def snippetForInsightsClientCustomPost(): Unit = {
    // >SEPARATOR customPost default
    // Initialize the client
    val client = InsightsClient(
      appId = "ALGOLIA_APPLICATION_ID",
      apiKey = "ALGOLIA_API_KEY",
      region = Option("ALGOLIA_APPLICATION_REGION")
    )

    // Call the API
    val response = client.customPost[JObject](
      path = "test/minimal"
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the customPut method.
    *
    * allow put method for a custom path with minimal parameters
    */
  def snippetForInsightsClientCustomPut(): Unit = {
    // >SEPARATOR customPut default
    // Initialize the client
    val client = InsightsClient(
      appId = "ALGOLIA_APPLICATION_ID",
      apiKey = "ALGOLIA_API_KEY",
      region = Option("ALGOLIA_APPLICATION_REGION")
    )

    // Call the API
    val response = client.customPut[JObject](
      path = "test/minimal"
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the deleteUserToken method.
    *
    * deleteUserToken
    */
  def snippetForInsightsClientDeleteUserToken(): Unit = {
    // >SEPARATOR deleteUserToken default
    // Initialize the client
    val client = InsightsClient(
      appId = "ALGOLIA_APPLICATION_ID",
      apiKey = "ALGOLIA_API_KEY",
      region = Option("ALGOLIA_APPLICATION_REGION")
    )

    // Call the API
    client.deleteUserToken(
      userToken = "test-user-1"
    )

    // >LOG
    // SEPARATOR<
  }

  /** Snippet for the pushEvents method.
    *
    * pushEvents
    */
  def snippetForInsightsClientPushEvents(): Unit = {
    // >SEPARATOR pushEvents default
    // Initialize the client
    val client = InsightsClient(
      appId = "ALGOLIA_APPLICATION_ID",
      apiKey = "ALGOLIA_API_KEY",
      region = Option("ALGOLIA_APPLICATION_REGION")
    )

    // Call the API
    val response = client.pushEvents(
      insightsEvents = InsightsEvents(
        events = Seq(
          ClickedObjectIDsAfterSearch(
            eventType = ClickEvent.withName("click"),
            eventName = "Product Clicked",
            index = "products",
            userToken = "user-123456",
            authenticatedUserToken = Some("user-123456"),
            timestamp = Some(1641290601962L),
            objectIDs = Seq("9780545139700", "9780439784542"),
            queryID = "43b15df305339e827f0ac0bdc5ebcaa7",
            positions = Seq(7, 6)
          )
        )
      )
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

}