/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * The response from the API after a task update.
 *
 * @param taskID The task UUID.
 * @param updatedAt Date of last update (RFC3339 format).
 */
@Serializable
public data class TaskUpdateResponse(

  /** The task UUID. */
  @SerialName(value = "taskID") val taskID: String,

  /** Date of last update (RFC3339 format). */
  @SerialName(value = "updatedAt") val updatedAt: String,
)