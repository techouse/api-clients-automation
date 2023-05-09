/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * The `batchDictionaryEntries` parameters.
 *
 * @param requests List of operations to batch. Each operation is described by an `action` and a `body`.
 * @param clearExistingDictionaryEntries When `true`, start the batch by removing all the custom entries from the dictionary.
 */
@Serializable
public data class BatchDictionaryEntriesParams(

  /** List of operations to batch. Each operation is described by an `action` and a `body`. */
  @SerialName(value = "requests") val requests: List<BatchDictionaryEntriesRequest>,

  /** When `true`, start the batch by removing all the custom entries from the dictionary. */
  @SerialName(value = "clearExistingDictionaryEntries") val clearExistingDictionaryEntries: Boolean? = null,
)