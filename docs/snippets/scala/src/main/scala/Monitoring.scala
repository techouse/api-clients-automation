// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package algoliasearch.methods.snippets

import scala.concurrent.duration.Duration

// >IMPORT
import algoliasearch.api.MonitoringClient

// IMPORT<
import algoliasearch.monitoring.*

import org.json4s.*
import org.json4s.native.JsonParser.*
import scala.concurrent.{Await, ExecutionContextExecutor}

class SnippetMonitoringClient {
  implicit val ec: ExecutionContextExecutor = scala.concurrent.ExecutionContext.global
  implicit val formats: Formats = org.json4s.DefaultFormats

  /** Snippet for the customDelete method.
    *
    * allow del method for a custom path with minimal parameters
    */
  def snippetForMonitoringClientCustomDelete(): Unit = {
    // >SEPARATOR customDelete default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

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
  def snippetForMonitoringClientCustomGet(): Unit = {
    // >SEPARATOR customGet default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

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
  def snippetForMonitoringClientCustomPost(): Unit = {
    // >SEPARATOR customPost default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

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
  def snippetForMonitoringClientCustomPut(): Unit = {
    // >SEPARATOR customPut default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

    // Call the API
    val response = client.customPut[JObject](
      path = "test/minimal"
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the getClusterIncidents method.
    *
    * getClusterIncidents
    */
  def snippetForMonitoringClientGetClusterIncidents(): Unit = {
    // >SEPARATOR getClusterIncidents default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

    // Call the API
    val response = client.getClusterIncidents(
      clusters = "c1-de"
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the getClusterStatus method.
    *
    * getClusterStatus
    */
  def snippetForMonitoringClientGetClusterStatus(): Unit = {
    // >SEPARATOR getClusterStatus default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

    // Call the API
    val response = client.getClusterStatus(
      clusters = "c1-de"
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the getIncidents method.
    *
    * getIncidents
    */
  def snippetForMonitoringClientGetIncidents(): Unit = {
    // >SEPARATOR getIncidents default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

    // Call the API
    val response = client.getIncidents(
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the getIndexingTime method.
    *
    * getIndexingTime
    */
  def snippetForMonitoringClientGetIndexingTime(): Unit = {
    // >SEPARATOR getIndexingTime default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

    // Call the API
    val response = client.getIndexingTime(
      clusters = "c1-de"
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the getLatency method.
    *
    * getLatency
    */
  def snippetForMonitoringClientGetLatency(): Unit = {
    // >SEPARATOR getLatency default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

    // Call the API
    val response = client.getLatency(
      clusters = "c1-de"
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the getMetrics method.
    *
    * getMetrics
    */
  def snippetForMonitoringClientGetMetrics(): Unit = {
    // >SEPARATOR getMetrics default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

    // Call the API
    val response = client.getMetrics(
      metric = Metric.withName("avg_build_time"),
      period = Period.withName("minute")
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the getReachability method.
    *
    * getReachability
    */
  def snippetForMonitoringClientGetReachability(): Unit = {
    // >SEPARATOR getReachability default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

    // Call the API
    val response = client.getReachability(
      clusters = "c1-de"
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the getServers method.
    *
    * getInventory
    */
  def snippetForMonitoringClientGetServers(): Unit = {
    // >SEPARATOR getServers default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

    // Call the API
    val response = client.getServers(
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

  /** Snippet for the getStatus method.
    *
    * getStatus
    */
  def snippetForMonitoringClientGetStatus(): Unit = {
    // >SEPARATOR getStatus default
    // Initialize the client
    val client = MonitoringClient(appId = "ALGOLIA_APPLICATION_ID", apiKey = "ALGOLIA_API_KEY")

    // Call the API
    val response = client.getStatus(
    )

    // >LOG
    // Use the response
    val value = Await.result(response, Duration(100, "sec"))
    // SEPARATOR<
  }

}