/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import com.algolia.client.exception.AlgoliaClientException
import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*
import kotlin.jvm.JvmInline

/**
 * PlatformWithNone
 *
 * Implementations:
 * - [Platform]
 * - [PlatformNone]
 */
@Serializable(PlatformWithNoneSerializer::class)
public sealed interface PlatformWithNone {
  @Serializable
  @JvmInline
  public value class PlatformValue(public val value: Platform) : PlatformWithNone

  @Serializable
  @JvmInline
  public value class PlatformNoneValue(public val value: PlatformNone) : PlatformWithNone

  public companion object {

    public fun of(value: Platform): PlatformWithNone {
      return PlatformValue(value)
    }
    public fun of(value: PlatformNone): PlatformWithNone {
      return PlatformNoneValue(value)
    }
  }
}

internal class PlatformWithNoneSerializer : JsonContentPolymorphicSerializer<PlatformWithNone>(PlatformWithNone::class) {
  override fun selectDeserializer(element: JsonElement): DeserializationStrategy<PlatformWithNone> {
    return when {
      element.isString -> Platform.serializer()
      element.isString -> PlatformNone.serializer()
      else -> throw AlgoliaClientException("Failed to deserialize json element: $element")
    }
  }
}
