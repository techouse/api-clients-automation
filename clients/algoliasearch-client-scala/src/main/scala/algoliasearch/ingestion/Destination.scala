/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

import algoliasearch.ingestion.DestinationType._

/** A destination describe how the data is indexed on the Algolia side.
  *
  * @param destinationID
  *   The destination UUID.
  * @param name
  *   An human readable name describing the object.
  * @param createdAt
  *   Date of creation (RFC3339 format).
  * @param updatedAt
  *   Date of last update (RFC3339 format).
  */
case class Destination(
    destinationID: String,
    `type`: DestinationType,
    name: String,
    input: DestinationInput,
    createdAt: String,
    updatedAt: Option[String] = scala.None,
    authenticationID: Option[String] = scala.None
)

object DestinationEnums {}
