/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.querysuggestions

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * Query Suggestions configuration.
 *
 * @param sourceIndices Algolia indices from which to get the popular searches for query suggestions.
 * @param indexName Name of the Query Suggestions index.
 * @param languages
 * @param exclude
 * @param enablePersonalization Whether to turn on personalized query suggestions.
 * @param allowSpecialCharacters Whether to include suggestions with special characters.
 */
@Serializable
public data class QuerySuggestionsConfigurationWithIndex(

  /** Algolia indices from which to get the popular searches for query suggestions. */
  @SerialName(value = "sourceIndices") val sourceIndices: List<SourceIndex>,

  /** Name of the Query Suggestions index. */
  @SerialName(value = "indexName") val indexName: String,

  @SerialName(value = "languages") val languages: Languages? = null,

  @SerialName(value = "exclude") val exclude: List<String>? = null,

  /** Whether to turn on personalized query suggestions. */
  @SerialName(value = "enablePersonalization") val enablePersonalization: Boolean? = null,

  /** Whether to include suggestions with special characters. */
  @SerialName(value = "allowSpecialCharacters") val allowSpecialCharacters: Boolean? = null,
)
