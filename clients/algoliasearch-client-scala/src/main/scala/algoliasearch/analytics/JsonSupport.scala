/** Analytics API The Analytics API lets you review your search, and click and conversion analytics. > **Note**: The API
  * key in the `X-Algolia-API-Key` header requires the [`analytics`
  * ACL](https://www.algolia.com/doc/guides/security/api-keys/#access-control-list-acl).
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.analytics

import org.json4s._
import org.json4s.ext.EnumNameSerializer

object JsonSupport {
  private def enumSerializers: Seq[Serializer[_]] = Seq[Serializer[_]]() :+
    new EnumNameSerializer(Direction) :+
    new EnumNameSerializer(OrderBy)

  private def oneOfsSerializers: Seq[Serializer[_]] = Seq[Serializer[_]]() :+
    GetTopHitsResponseSerializer :+
    GetTopSearchesResponseSerializer

  private def classMapSerializers: Seq[Serializer[_]] = Seq[Serializer[_]]() :+
    new ErrorBaseSerializer()

  implicit val format: Formats = DefaultFormats ++ enumSerializers ++ oneOfsSerializers ++ classMapSerializers
  implicit val serialization: org.json4s.Serialization = org.json4s.native.Serialization
}