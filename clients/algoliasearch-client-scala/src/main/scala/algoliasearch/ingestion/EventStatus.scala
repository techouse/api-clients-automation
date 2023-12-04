/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

object EventStatus extends Enumeration {
  type EventStatus = EventStatus.Value
  val Created = Value("created")
  val Started = Value("started")
  val Retried = Value("retried")
  val Failed = Value("failed")
  val Succeeded = Value("succeeded")
  val Critical = Value("critical")
}