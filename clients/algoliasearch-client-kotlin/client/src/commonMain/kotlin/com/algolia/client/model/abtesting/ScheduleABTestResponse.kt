/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.abtesting

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * ScheduleABTestResponse
 *
 * @param abTestScheduleID Unique scheduled A/B test identifier.
 */
@Serializable
public data class ScheduleABTestResponse(

  /** Unique scheduled A/B test identifier. */
  @SerialName(value = "abTestScheduleID") val abTestScheduleID: Int,
)