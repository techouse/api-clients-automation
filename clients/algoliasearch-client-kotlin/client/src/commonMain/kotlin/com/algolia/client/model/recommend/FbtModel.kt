/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*

/**
 * Frequently bought together model.  This model recommends items that have been purchased within 1 day with the item with the ID `objectID`.
 */
@Serializable
public enum class FbtModel(public val value: kotlin.String) {

  @SerialName(value = "bought-together")
  BoughtTogether("bought-together");

  override fun toString(): kotlin.String = value
}