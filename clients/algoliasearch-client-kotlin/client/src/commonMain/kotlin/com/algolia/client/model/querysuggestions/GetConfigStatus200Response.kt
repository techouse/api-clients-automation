/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.querysuggestions

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * GetConfigStatus200Response
 *
 * @param indexName Name of the Query Suggestions index.
 * @param isRunning Whether the creation or update of the Query Suggestions index is in progress.
 * @param lastBuiltAt Timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format when the Query Suggestions index was last built.
 * @param lastSuccessfulBuiltAt Timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format when the Query Suggestions index was last updated successfully.
 * @param lastSuccessfulBuildDuration Duration of the last successful build in seconds.
 */
@Serializable
public data class GetConfigStatus200Response(

  /** Name of the Query Suggestions index. */
  @SerialName(value = "indexName") val indexName: String? = null,

  /** Whether the creation or update of the Query Suggestions index is in progress. */
  @SerialName(value = "isRunning") val isRunning: Boolean? = null,

  /** Timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format when the Query Suggestions index was last built. */
  @SerialName(value = "lastBuiltAt") val lastBuiltAt: String? = null,

  /** Timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format when the Query Suggestions index was last updated successfully. */
  @SerialName(value = "lastSuccessfulBuiltAt") val lastSuccessfulBuiltAt: String? = null,

  /** Duration of the last successful build in seconds. */
  @SerialName(value = "lastSuccessfulBuildDuration") val lastSuccessfulBuildDuration: String? = null,
)
