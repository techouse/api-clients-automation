/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.analytics

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * TopSearch
 *
 * @param search The search query.
 * @param count The number of occurrences.
 * @param nbHits Number of hits that the search query matched.
 */
@Serializable
public data class TopSearch(

  /** The search query. */
  @SerialName(value = "search") val search: String,

  /** The number of occurrences. */
  @SerialName(value = "count") val count: Int,

  /** Number of hits that the search query matched. */
  @SerialName(value = "nbHits") val nbHits: Int,
)