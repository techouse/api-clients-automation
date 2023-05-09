/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.predict

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * The conditions that define which user profiles are included in the segment.  Can contain operands and a maximum of 1 level of nested conditions.
 *
 * @param `operator`
 * @param operands
 */
@Serializable
public data class SegmentParentConditions(

  @SerialName(value = "operator") val `operator`: SegmentConditionOperator,

  @SerialName(value = "operands") val operands: List<SegmentParentConditionOperands>,
)