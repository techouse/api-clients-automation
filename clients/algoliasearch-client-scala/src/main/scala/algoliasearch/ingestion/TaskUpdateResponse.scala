/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

/** The response from the API after a task update.
  *
  * @param taskID
  *   The task UUID.
  * @param updatedAt
  *   Date of last update (RFC3339 format).
  */
case class TaskUpdateResponse(
    taskID: String,
    updatedAt: String
)
