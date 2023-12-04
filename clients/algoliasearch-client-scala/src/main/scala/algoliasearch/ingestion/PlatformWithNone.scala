/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

import algoliasearch.ingestion.Platform._
import algoliasearch.ingestion.PlatformNone._

import org.json4s._

/** PlatformWithNone
  */
sealed trait PlatformWithNone

trait PlatformWithNoneTrait extends PlatformWithNone

object PlatformWithNone {}

object PlatformWithNoneSerializer extends Serializer[PlatformWithNone] {
  override def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), PlatformWithNone] = {

    case (TypeInfo(clazz, _), json) if clazz == classOf[PlatformWithNone] =>
      json match {
        case value: JString => Extraction.extract[Platform](value)
        case value: JString => Extraction.extract[PlatformNone](value)
        case _              => throw new MappingException("Can't convert " + json + " to PlatformWithNone")
      }
  }

  override def serialize(implicit format: Formats): PartialFunction[Any, JValue] = { case value =>
    Extraction.decompose(value)(format - this)
  }
}