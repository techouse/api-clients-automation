/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * a search banner with image and url.
 *
 * @param image
 * @param link
 */
@Serializable
public data class Banner(

  @SerialName(value = "image") val image: BannerImage? = null,

  @SerialName(value = "link") val link: BannerLink? = null,
)
