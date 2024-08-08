/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import com.algolia.client.exception.AlgoliaClientException
import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*
import kotlin.jvm.JvmInline

/**
 * BuiltInOperationValue
 *
 * Implementations:
 * - [Int] - *[BuiltInOperationValue.of]*
 * - [String] - *[BuiltInOperationValue.of]*
 */
@Serializable(BuiltInOperationValueSerializer::class)
public sealed interface BuiltInOperationValue {
  @Serializable
  @JvmInline
  public value class StringValue(public val value: String) : BuiltInOperationValue

  @Serializable
  @JvmInline
  public value class IntValue(public val value: Int) : BuiltInOperationValue

  public companion object {

    public fun of(value: String): BuiltInOperationValue {
      return StringValue(value)
    }
    public fun of(value: Int): BuiltInOperationValue {
      return IntValue(value)
    }
  }
}

internal class BuiltInOperationValueSerializer : JsonContentPolymorphicSerializer<BuiltInOperationValue>(BuiltInOperationValue::class) {
  override fun selectDeserializer(element: JsonElement): DeserializationStrategy<BuiltInOperationValue> {
    return when {
      element.isString -> BuiltInOperationValue.StringValue.serializer()
      element.isInt -> BuiltInOperationValue.IntValue.serializer()
      else -> throw AlgoliaClientException("Failed to deserialize json element: $element")
    }
  }
}