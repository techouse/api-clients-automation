/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

object DestinationSortKeys extends Enumeration {
  type DestinationSortKeys = DestinationSortKeys.Value
  val Name = Value("name")
  val `Type` = Value("type")
  val UpdatedAt = Value("updatedAt")
  val CreatedAt = Value("createdAt")
}