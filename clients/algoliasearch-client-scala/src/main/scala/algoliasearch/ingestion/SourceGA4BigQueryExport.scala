/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

/** SourceGA4BigQueryExport
  *
  * @param projectID
  *   GCP project ID that the BigQuery Export writes to.
  * @param datasetID
  *   BigQuery dataset ID that the BigQuery Export writes to.
  * @param tablePrefix
  *   Prefix of the tables that the BigQuery Export writes to (i.e. events_intraday_ for streaming, events_ for daily).
  */
case class SourceGA4BigQueryExport(
    projectID: String,
    datasetID: String,
    tablePrefix: String
) extends SourceInputTrait
    with SourceUpdateInputTrait