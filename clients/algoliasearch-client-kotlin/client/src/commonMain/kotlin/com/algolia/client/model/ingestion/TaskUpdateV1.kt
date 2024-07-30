/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * API request body for updating a task using the V1 shape, please use methods and types that don't contain the V1 suffix.
 *
 * @param destinationID Universally unique identifier (UUID) of a destination resource.
 * @param trigger
 * @param input
 * @param enabled Whether the task is enabled.
 * @param failureThreshold Maximum accepted percentage of failures for a task run to finish successfully.
 */
@Deprecated(message = "This schema is deprecated.")
@Serializable
public data class TaskUpdateV1(

  /** Universally unique identifier (UUID) of a destination resource. */
  @SerialName(value = "destinationID") val destinationID: String? = null,

  @SerialName(value = "trigger") val trigger: TriggerUpdateInput? = null,

  @SerialName(value = "input") val input: TaskInput? = null,

  /** Whether the task is enabled. */
  @SerialName(value = "enabled") val enabled: Boolean? = null,

  /** Maximum accepted percentage of failures for a task run to finish successfully. */
  @SerialName(value = "failureThreshold") val failureThreshold: Int? = null,
)