/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.analytics

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * Currency code.
 *
 * @param currency Currency code.
 * @param revenue Revenue associated with this search in this currency.
 */
@Serializable
public data class CurrencyCode(

  /** Currency code. */
  @SerialName(value = "currency") val currency: String? = null,

  /** Revenue associated with this search in this currency. */
  @SerialName(value = "revenue") val revenue: Double? = null,
)
