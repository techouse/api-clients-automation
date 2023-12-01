/** Search API Use the Search REST API to manage your data (indices and records), implement search, and improve
  * relevance (with Rules, synonyms, and language dictionaries). Although Algolia provides a REST API, you should use
  * the official open source API [clients, libraries, and
  * tools](https://www.algolia.com/doc/guides/getting-started/how-algolia-works/in-depth/ecosystem/) instead. There's no
  * [SLA](https://www.algolia.com/policies/sla/) if you use the REST API directly.
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.search

import algoliasearch.search.BuiltInOperationType._

import org.json4s._

/** AttributeToUpdate
  */
sealed trait AttributeToUpdate

trait AttributeToUpdateTrait extends AttributeToUpdate

object AttributeToUpdate {

  case class StringValue(value: String) extends AttributeToUpdate

  def apply(value: String): AttributeToUpdate = {
    AttributeToUpdate.StringValue(value)
  }
}

object AttributeToUpdateSerializer extends Serializer[AttributeToUpdate] {
  override def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), AttributeToUpdate] = {

    case (TypeInfo(clazz, _), json) if clazz == classOf[AttributeToUpdate] =>
      json match {
        case JString(value) => AttributeToUpdate.StringValue(value)
        case value: JObject => Extraction.extract[BuiltInOperation](value)
        case _              => throw new MappingException("Can't convert " + json + " to AttributeToUpdate")
      }
  }

  override def serialize(implicit format: Formats): PartialFunction[Any, JValue] = { case value =>
    Extraction.decompose(value)(format - this)
  }
}

object AttributeToUpdateEnums {}
