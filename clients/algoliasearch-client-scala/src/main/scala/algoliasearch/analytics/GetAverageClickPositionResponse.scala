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

/** GetAverageClickPositionResponse
  *
  * @param average
  *   Average count of all click events.
  * @param clickCount
  *   Number of click events.
  * @param dates
  *   Average click positions.
  */
case class GetAverageClickPositionResponse(
    average: Double,
    clickCount: Int,
    dates: Seq[AverageClickEvent]
)
