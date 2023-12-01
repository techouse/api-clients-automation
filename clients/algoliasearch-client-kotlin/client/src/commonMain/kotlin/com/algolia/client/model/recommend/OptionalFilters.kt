/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import com.algolia.client.exception.AlgoliaClientException
import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*
import kotlin.jvm.JvmInline

/**
 * Create filters to boost or demote records.   Records that match the filter are ranked higher for positive and lower for negative optional filters. In contrast to regular filters, records that don't match the optional filter are still included in the results, only their ranking is affected.
 *
 * Implementations:
 * - [List<MixedSearchFilters>] - *[OptionalFilters.of]*
 * - [String] - *[OptionalFilters.of]*
 */
@Serializable(OptionalFiltersSerializer::class)
public sealed interface OptionalFilters {
  @Serializable
  @JvmInline
  public value class ListOfMixedSearchFiltersValue(public val value: List<MixedSearchFilters>) : OptionalFilters

  @Serializable
  @JvmInline
  public value class StringValue(public val value: String) : OptionalFilters

  public companion object {

    public fun of(value: List<MixedSearchFilters>): OptionalFilters {
      return ListOfMixedSearchFiltersValue(value)
    }
    public fun of(value: String): OptionalFilters {
      return StringValue(value)
    }
  }
}

internal class OptionalFiltersSerializer : JsonContentPolymorphicSerializer<OptionalFilters>(OptionalFilters::class) {
  override fun selectDeserializer(element: JsonElement): DeserializationStrategy<OptionalFilters> {
    return when {
      element.isJsonArrayOfObjects -> OptionalFilters.ListOfMixedSearchFiltersValue.serializer()
      element.isString -> OptionalFilters.StringValue.serializer()
      else -> throw AlgoliaClientException("Failed to deserialize json element: $element")
    }
  }
}
