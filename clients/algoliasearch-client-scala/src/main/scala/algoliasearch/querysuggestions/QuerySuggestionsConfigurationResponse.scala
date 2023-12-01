/** Query Suggestions API The Query Suggestions API lets you manage Algolia's Query Suggestions configurations. Query
  * Suggestions add new indices with popular search queries, external suggestions, or facet values to your Algolia
  * application. In your user interface, you can query the Query Suggestions indices like regular indices and add
  * [suggested searches](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/query-suggestions/js/)
  * to guide users and speed up their search.
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.querysuggestions

/** QuerySuggestionsConfigurationResponse
  *
  * @param appId
  *   Your Algolia application ID.
  * @param sourceIndicesAPIKey
  *   API key used to read from your source index.
  * @param suggestionsIndicesAPIKey
  *   API key used to write and configure your Query Suggestions index.
  * @param externalIndicesAPIKey
  *   API key used to read from external Algolia indices.
  * @param indexName
  *   Query Suggestions index name.
  * @param sourceIndices
  *   Algolia indices from which to get the popular searches for query suggestions.
  * @param exclude
  *   Patterns to exclude from query suggestions.
  * @param enablePersonalization
  *   Turn on personalized query suggestions.
  * @param allowSpecialCharacters
  *   Allow suggestions with special characters.
  */
case class QuerySuggestionsConfigurationResponse(
    appId: Option[String] = scala.None,
    sourceIndicesAPIKey: Option[String] = scala.None,
    suggestionsIndicesAPIKey: Option[String] = scala.None,
    externalIndicesAPIKey: Option[String] = scala.None,
    indexName: String,
    sourceIndices: Seq[SourceIndex],
    languages: Option[Languages] = scala.None,
    exclude: Option[Seq[String]] = scala.None,
    enablePersonalization: Option[Boolean] = scala.None,
    allowSpecialCharacters: Option[Boolean] = scala.None
)
