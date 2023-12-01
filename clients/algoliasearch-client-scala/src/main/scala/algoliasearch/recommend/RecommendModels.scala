/** Recommend API The Recommend API lets you generate recommendations with several AI models. > **Note**: You should use
  * Algolia's [libraries and
  * tools](https://www.algolia.com/doc/guides/getting-started/how-algolia-works/in-depth/ecosystem/) to interact with
  * the Recommend API. Using the HTTP endpoints directly is not covered by the
  * [SLA](https://www.algolia.com/policies/sla/).
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.recommend

object RecommendModels extends Enumeration {
  type RecommendModels = RecommendModels.Value
  val RelatedProducts = Value("related-products")
  val BoughtTogether = Value("bought-together")
  val TrendingFacets = Value("trending-facets")
  val TrendingItems = Value("trending-items")
}
