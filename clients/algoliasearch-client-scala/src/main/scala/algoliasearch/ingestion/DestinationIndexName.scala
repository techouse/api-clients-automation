/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

import algoliasearch.ingestion.RecordType._

/** DestinationIndexName
  *
  * @param indexName
  *   The index name to store data in.
  * @param attributesToExclude
  *   Determines the attributes to exclude from an Algolia record. To remove nested element, you can separate the path
  *   to the element with dots (`.`): - \"foo.bar\": will remove `bar` from `foo`. To remove elements from an array, you
  *   can use the following: - \"foo.[0].bar\": will only remove `bar` from the first element of `foo`. -
  *   \"foo.[*].bar\": will remove `bar` from every elements of `foo`.
  */
case class DestinationIndexName(
    indexName: String,
    recordType: Option[RecordType] = scala.None,
    attributesToExclude: Option[Seq[String]] = scala.None
) extends DestinationInputTrait

object DestinationIndexNameEnums {}