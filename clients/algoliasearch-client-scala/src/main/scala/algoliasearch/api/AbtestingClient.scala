/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
  * https://github.com/algolia/api-clients-automation. DO NOT EDIT.
  */
package algoliasearch.api

import algoliasearch.abtesting.ABTest
import algoliasearch.abtesting.ABTestResponse
import algoliasearch.abtesting.AddABTestsRequest
import algoliasearch.abtesting.ErrorBase
import algoliasearch.abtesting.EstimateABTestRequest
import algoliasearch.abtesting.EstimateABTestResponse
import algoliasearch.abtesting.ListABTestsResponse
import algoliasearch.abtesting.ScheduleABTestResponse
import algoliasearch.abtesting.ScheduleABTestsRequest
import algoliasearch.abtesting._
import algoliasearch.ApiClient
import algoliasearch.api.AbtestingClient.hosts
import algoliasearch.api.AbtestingClient.readTimeout
import algoliasearch.api.AbtestingClient.writeTimeout
import algoliasearch.api.AbtestingClient.connectTimeout
import algoliasearch.config._
import algoliasearch.internal.util._

import java.util.concurrent.TimeUnit
import scala.concurrent.duration.Duration
import scala.concurrent.{ExecutionContext, Future}
import scala.util.Random

object AbtestingClient {

  /** Creates a new AbtestingClient instance using default hosts.
    *
    * @param appId
    *   application ID
    * @param apiKey
    *   api key
    * @param region
    *   region
    * @param clientOptions
    *   client options
    */
  def apply(
      appId: String,
      apiKey: String,
      region: Option[String] = None,
      clientOptions: ClientOptions = ClientOptions()
  ) = new AbtestingClient(
    appId = appId,
    apiKey = apiKey,
    region = region,
    clientOptions = clientOptions
  )

  private def readTimeout(): Duration = {
    Duration(5, TimeUnit.SECONDS)
  }

  private def connectTimeout(): Duration = {
    Duration(2, TimeUnit.SECONDS)
  }

  private def writeTimeout(): Duration = {
    Duration(30, TimeUnit.SECONDS)
  }

  private def hosts(region: Option[String] = None): Seq[Host] = {
    val allowedRegions = Seq("de", "us")
    if (region.isDefined && !allowedRegions.contains(region.get)) {
      throw new IllegalArgumentException(s"`region` must be one of the following: ${allowedRegions.mkString(", ")}")
    }
    val url =
      if (region.isEmpty) "analytics.algolia.com" else "analytics.{region}.algolia.com".replace("{region}", region.get)
    Seq(Host(url = url, callTypes = Set(CallType.Read, CallType.Write)))
  }
}

class AbtestingClient(
    appId: String,
    apiKey: String,
    region: Option[String] = None,
    clientOptions: ClientOptions = ClientOptions()
) extends ApiClient(
      appId = appId,
      apiKey = apiKey,
      clientName = "Abtesting",
      defaultHosts = hosts(region),
      defaultReadTimeout = readTimeout(),
      defaultWriteTimeout = writeTimeout(),
      defaultConnectTimeout = connectTimeout(),
      formats = JsonSupport.format,
      options = clientOptions
    ) {

  /** Creates a new A/B test.
    *
    * Required API Key ACLs:
    *   - editSettings
    */
  def addABTests(addABTestsRequest: AddABTestsRequest, requestOptions: Option[RequestOptions] = None)(implicit
      ec: ExecutionContext
  ): Future[ABTestResponse] = Future {
    requireNotNull(addABTestsRequest, "Parameter `addABTestsRequest` is required when calling `addABTests`.")

    val request = HttpRequest
      .builder()
      .withMethod("POST")
      .withPath(s"/2/abtests")
      .withBody(addABTestsRequest)
      .build()
    execute[ABTestResponse](request, requestOptions)
  }

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

  /** Deletes an A/B test by its ID.
    *
    * Required API Key ACLs:
    *   - editSettings
    *
    * @param id
    *   Unique A/B test identifier.
    */
  def deleteABTest(id: Int, requestOptions: Option[RequestOptions] = None)(implicit
      ec: ExecutionContext
  ): Future[ABTestResponse] = Future {
    requireNotNull(id, "Parameter `id` is required when calling `deleteABTest`.")

    val request = HttpRequest
      .builder()
      .withMethod("DELETE")
      .withPath(s"/2/abtests/${escape(id)}")
      .build()
    execute[ABTestResponse](request, requestOptions)
  }

  /** Given the traffic percentage and the expected effect size, this endpoint estimates the sample size and duration of
    * an A/B test based on historical traffic.
    *
    * Required API Key ACLs:
    *   - analytics
    */
  def estimateABTest(estimateABTestRequest: EstimateABTestRequest, requestOptions: Option[RequestOptions] = None)(
      implicit ec: ExecutionContext
  ): Future[EstimateABTestResponse] = Future {
    requireNotNull(
      estimateABTestRequest,
      "Parameter `estimateABTestRequest` is required when calling `estimateABTest`."
    )

    val request = HttpRequest
      .builder()
      .withMethod("POST")
      .withPath(s"/2/abtests/estimate")
      .withBody(estimateABTestRequest)
      .build()
    execute[EstimateABTestResponse](request, requestOptions)
  }

  /** Retrieves the details for an A/B test by its ID.
    *
    * Required API Key ACLs:
    *   - analytics
    *
    * @param id
    *   Unique A/B test identifier.
    */
  def getABTest(id: Int, requestOptions: Option[RequestOptions] = None)(implicit ec: ExecutionContext): Future[ABTest] =
    Future {
      requireNotNull(id, "Parameter `id` is required when calling `getABTest`.")

      val request = HttpRequest
        .builder()
        .withMethod("GET")
        .withPath(s"/2/abtests/${escape(id)}")
        .build()
      execute[ABTest](request, requestOptions)
    }

  /** Lists all A/B tests you configured for this application.
    *
    * Required API Key ACLs:
    *   - analytics
    *
    * @param offset
    *   Position of the first item to return.
    * @param limit
    *   Number of items to return.
    * @param indexPrefix
    *   Index name prefix. Only A/B tests for indices starting with this string are included in the response.
    * @param indexSuffix
    *   Index name suffix. Only A/B tests for indices ending with this string are included in the response.
    */
  def listABTests(
      offset: Option[Int] = None,
      limit: Option[Int] = None,
      indexPrefix: Option[String] = None,
      indexSuffix: Option[String] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[ListABTestsResponse] = Future {

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/2/abtests")
      .withQueryParameter("offset", offset)
      .withQueryParameter("limit", limit)
      .withQueryParameter("indexPrefix", indexPrefix)
      .withQueryParameter("indexSuffix", indexSuffix)
      .build()
    execute[ListABTestsResponse](request, requestOptions)
  }

  /** Schedule an A/B test to be started at a later time.
    *
    * Required API Key ACLs:
    *   - editSettings
    */
  def scheduleABTest(scheduleABTestsRequest: ScheduleABTestsRequest, requestOptions: Option[RequestOptions] = None)(
      implicit ec: ExecutionContext
  ): Future[ScheduleABTestResponse] = Future {
    requireNotNull(
      scheduleABTestsRequest,
      "Parameter `scheduleABTestsRequest` is required when calling `scheduleABTest`."
    )

    val request = HttpRequest
      .builder()
      .withMethod("POST")
      .withPath(s"/2/abtests/schedule")
      .withBody(scheduleABTestsRequest)
      .build()
    execute[ScheduleABTestResponse](request, requestOptions)
  }

  /** Stops an A/B test by its ID. You can't restart stopped A/B tests.
    *
    * Required API Key ACLs:
    *   - editSettings
    *
    * @param id
    *   Unique A/B test identifier.
    */
  def stopABTest(id: Int, requestOptions: Option[RequestOptions] = None)(implicit
      ec: ExecutionContext
  ): Future[ABTestResponse] = Future {
    requireNotNull(id, "Parameter `id` is required when calling `stopABTest`.")

    val request = HttpRequest
      .builder()
      .withMethod("POST")
      .withPath(s"/2/abtests/${escape(id)}/stop")
      .build()
    execute[ABTestResponse](request, requestOptions)
  }

}
