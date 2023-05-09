/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.analytics

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * GetNoClickRateResponse
 *
 * @param rate The click-through rate.
 * @param count The number of click event.
 * @param noClickCount The number of click event.
 * @param dates A list of searches without clicks with their date, rate and counts.
 */
@Serializable
public data class GetNoClickRateResponse(

  /** The click-through rate. */
  @SerialName(value = "rate") val rate: Double,

  /** The number of click event. */
  @SerialName(value = "count") val count: Int,

  /** The number of click event. */
  @SerialName(value = "noClickCount") val noClickCount: Int,

  /** A list of searches without clicks with their date, rate and counts. */
  @SerialName(value = "dates") val dates: List<NoClickRateEvent>,
)