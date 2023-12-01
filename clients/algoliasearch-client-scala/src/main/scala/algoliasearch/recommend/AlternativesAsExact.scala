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

object AlternativesAsExact extends Enumeration {
  type AlternativesAsExact = AlternativesAsExact.Value
  val IgnorePlurals = Value("ignorePlurals")
  val SingleWordSynonym = Value("singleWordSynonym")
  val MultiWordsSynonym = Value("multiWordsSynonym")
}
