/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import kotlinx.serialization.*

/**
 * Whether a dictionary entry is provided by Algolia (standard), or has been added by you (custom).
 */
@Serializable
public enum class DictionaryEntryType(public val value: kotlin.String) {

  @SerialName(value = "custom")
  Custom("custom"),

  @SerialName(value = "standard")
  Standard("standard");

  override fun toString(): kotlin.String = value
}
