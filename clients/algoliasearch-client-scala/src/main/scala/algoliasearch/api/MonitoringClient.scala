/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
  * https://github.com/algolia/api-clients-automation. DO NOT EDIT.
  */
package algoliasearch.api

import algoliasearch.monitoring.BadRequest
import algoliasearch.monitoring.ErrorBase
import algoliasearch.monitoring.Forbidden
import algoliasearch.monitoring.IncidentsResponse
import algoliasearch.monitoring.IndexingTimeResponse
import algoliasearch.monitoring.InfrastructureResponse
import algoliasearch.monitoring.InventoryResponse
import algoliasearch.monitoring.LatencyResponse
import algoliasearch.monitoring.Metric._
import algoliasearch.monitoring.Period._
import algoliasearch.monitoring.StatusResponse
import algoliasearch.monitoring.Unauthorized
import algoliasearch.monitoring._
import algoliasearch.ApiClient
import algoliasearch.api.MonitoringClient.hosts
import algoliasearch.config._
import algoliasearch.internal.util._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.Random

object MonitoringClient {

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
  ) = new MonitoringClient(
    appId = appId,
    apiKey = apiKey,
    clientOptions = clientOptions
  )

  private def hosts(): Seq[Host] = {
    List(Host("status.algolia.com", Set(CallType.Read, CallType.Write)))
  }
}

class MonitoringClient(
    appId: String,
    apiKey: String,
    clientOptions: ClientOptions = ClientOptions()
) extends ApiClient(
      appId = appId,
      apiKey = apiKey,
      clientName = "Monitoring",
      defaultHosts = hosts(),
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
  def customDelete[T: Manifest](
      path: String,
      parameters: Option[Map[String, Any]] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `customDelete`.")

    val request = HttpRequest
      .builder()
      .withMethod("DELETE")
      .withPath(s"/${path}")
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
    */
  def customGet[T: Manifest](
      path: String,
      parameters: Option[Map[String, Any]] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `customGet`.")

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/${path}")
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
  def customPost[T: Manifest](
      path: String,
      parameters: Option[Map[String, Any]] = None,
      body: Option[Any] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `customPost`.")

    val request = HttpRequest
      .builder()
      .withMethod("POST")
      .withPath(s"/${path}")
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
  def customPut[T: Manifest](
      path: String,
      parameters: Option[Map[String, Any]] = None,
      body: Option[Any] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `customPut`.")

    val request = HttpRequest
      .builder()
      .withMethod("PUT")
      .withPath(s"/${path}")
      .withBody(body)
      .withQueryParameters(parameters)
      .build()
    execute[T](request, requestOptions)
  }

  /** Retrieves known incidents for the selected clusters.
    *
    * @param clusters
    *   Subset of clusters, separated by comma.
    */
  def getClusterIncidents(clusters: String, requestOptions: Option[RequestOptions] = None)(implicit
      ec: ExecutionContext
  ): Future[IncidentsResponse] = Future {
    requireNotNull(clusters, "Parameter `clusters` is required when calling `getClusterIncidents`.")

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1/incidents/${escape(clusters)}")
      .build()
    execute[IncidentsResponse](request, requestOptions)
  }

  /** Retrieves the status of selected clusters.
    *
    * @param clusters
    *   Subset of clusters, separated by comma.
    */
  def getClusterStatus(clusters: String, requestOptions: Option[RequestOptions] = None)(implicit
      ec: ExecutionContext
  ): Future[StatusResponse] = Future {
    requireNotNull(clusters, "Parameter `clusters` is required when calling `getClusterStatus`.")

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1/status/${escape(clusters)}")
      .build()
    execute[StatusResponse](request, requestOptions)
  }

  /** Retrieves known incidents for all clusters.
    */
  def getIncidents(
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[IncidentsResponse] = Future {

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1/incidents")
      .build()
    execute[IncidentsResponse](request, requestOptions)
  }

  /** Retrieves average times for indexing operations for selected clusters.
    *
    * @param clusters
    *   Subset of clusters, separated by comma.
    */
  def getIndexingTime(clusters: String, requestOptions: Option[RequestOptions] = None)(implicit
      ec: ExecutionContext
  ): Future[IndexingTimeResponse] = Future {
    requireNotNull(clusters, "Parameter `clusters` is required when calling `getIndexingTime`.")

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1/indexing/${escape(clusters)}")
      .build()
    execute[IndexingTimeResponse](request, requestOptions)
  }

  /** Retrieves the average latency for search requests for selected clusters.
    *
    * @param clusters
    *   Subset of clusters, separated by comma.
    */
  def getLatency(clusters: String, requestOptions: Option[RequestOptions] = None)(implicit
      ec: ExecutionContext
  ): Future[LatencyResponse] = Future {
    requireNotNull(clusters, "Parameter `clusters` is required when calling `getLatency`.")

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1/latency/${escape(clusters)}")
      .build()
    execute[LatencyResponse](request, requestOptions)
  }

  /** Retrieves metrics related to your Algolia infrastructure, aggregated over a selected time window. Access to this
    * API is available as part of the [Premium or Elevate plans](https://www.algolia.com/pricing). You must authenticate
    * requests with the `x-algolia-application-id` and `x-algolia-api-key` headers (using the Monitoring API key).
    *
    * @param metric
    *   Metric to report. For more information about the individual metrics, see the description of the API response. To
    *   include all metrics, use `*`.
    * @param period
    *   Period over which to aggregate the metrics: - `minute`. Aggregate the last minute. 1 data point per 10 seconds.
    *   \- `hour`. Aggregate the last hour. 1 data point per minute. - `day`. Aggregate the last day. 1 data point per
    *   10 minutes. - `week`. Aggregate the last week. 1 data point per hour. - `month`. Aggregate the last month. 1
    *   data point per day.
    */
  def getMetrics(metric: Metric, period: Period, requestOptions: Option[RequestOptions] = None)(implicit
      ec: ExecutionContext
  ): Future[InfrastructureResponse] = Future {
    requireNotNull(metric, "Parameter `metric` is required when calling `getMetrics`.")
    requireNotNull(period, "Parameter `period` is required when calling `getMetrics`.")

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1/infrastructure/${escape(metric)}/period/${escape(period)}")
      .build()
    execute[InfrastructureResponse](request, requestOptions)
  }

  /** Test whether clusters are reachable or not.
    *
    * @param clusters
    *   Subset of clusters, separated by comma.
    */
  def getReachability(clusters: String, requestOptions: Option[RequestOptions] = None)(implicit
      ec: ExecutionContext
  ): Future[Map[String, Map[String, Boolean]]] = Future {
    requireNotNull(clusters, "Parameter `clusters` is required when calling `getReachability`.")

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1/reachability/${escape(clusters)}/probes")
      .build()
    execute[Map[String, Map[String, Boolean]]](request, requestOptions)
  }

  /** Retrieves the servers that belong to clusters. The response depends on whether you authenticate your API request:
    * \- With authentication, the response lists the servers assigned to your Algolia application's cluster. - Without
    * authentication, the response lists the servers for all Algolia clusters.
    */
  def getServers(
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[InventoryResponse] = Future {

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1/inventory/servers")
      .build()
    execute[InventoryResponse](request, requestOptions)
  }

  /** Retrieves the status of all Algolia clusters and instances.
    */
  def getStatus(requestOptions: Option[RequestOptions] = None)(implicit ec: ExecutionContext): Future[StatusResponse] =
    Future {

      val request = HttpRequest
        .builder()
        .withMethod("GET")
        .withPath(s"/1/status")
        .build()
      execute[StatusResponse](request, requestOptions)
    }

}
