package algoliasearch.methods.snippets

import scala.concurrent.duration.Duration

import algoliasearch.api.MonitoringClient
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
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.customDelete[JObject](
      path = "/test/minimal"
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the customGet method.
    *
    * allow get method for a custom path with minimal parameters
    */
  def snippetForMonitoringClientCustomGet(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.customGet[JObject](
      path = "/test/minimal"
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the customPost method.
    *
    * allow post method for a custom path with minimal parameters
    */
  def snippetForMonitoringClientCustomPost(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.customPost[JObject](
      path = "/test/minimal"
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the customPut method.
    *
    * allow put method for a custom path with minimal parameters
    */
  def snippetForMonitoringClientCustomPut(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.customPut[JObject](
      path = "/test/minimal"
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the getClusterIncidents method.
    *
    * getClusterIncidents
    */
  def snippetForMonitoringClientGetClusterIncidents(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.getClusterIncidents(
      clusters = "c1-de"
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the getClusterStatus method.
    *
    * getClusterStatus
    */
  def snippetForMonitoringClientGetClusterStatus(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.getClusterStatus(
      clusters = "c1-de"
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the getIncidents method.
    *
    * getIncidents
    */
  def snippetForMonitoringClientGetIncidents(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.getIncidents(
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the getIndexingTime method.
    *
    * getIndexingTime
    */
  def snippetForMonitoringClientGetIndexingTime(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.getIndexingTime(
      clusters = "c1-de"
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the getInventory method.
    *
    * getInventory
    */
  def snippetForMonitoringClientGetInventory(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.getInventory(
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the getLatency method.
    *
    * getLatency
    */
  def snippetForMonitoringClientGetLatency(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.getLatency(
      clusters = "c1-de"
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the getMetrics method.
    *
    * getMetrics
    */
  def snippetForMonitoringClientGetMetrics(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.getMetrics(
      metric = Metric.withName("avg_build_time"),
      period = Period.withName("minute")
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the getReachability method.
    *
    * getReachability
    */
  def snippetForMonitoringClientGetReachability(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.getReachability(
      clusters = "c1-de"
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

  /** Snippet for the getStatus method.
    *
    * getStatus
    */
  def snippetForMonitoringClientGetStatus(): Unit = {
    // Initialize the client
    val client = MonitoringClient(appId = "YOUR_APP_ID", apiKey = "YOUR_API_KEY")

    // Call the API
    val res = client.getStatus(
    )

    // Use the response
    val value = Await.result(res, Duration(100, "sec"))
  }

}