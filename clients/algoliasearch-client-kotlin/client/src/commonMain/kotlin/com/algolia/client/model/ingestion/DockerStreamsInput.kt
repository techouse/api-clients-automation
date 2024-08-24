/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * The selected streams of a singer or airbyte connector.
 *
 * @param streams
 */
@Serializable
public data class DockerStreamsInput(

  @SerialName(value = "streams") val streams: List<DockerStreams>,
) : TaskInput
