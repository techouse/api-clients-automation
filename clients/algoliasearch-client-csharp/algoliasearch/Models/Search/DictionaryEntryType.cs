//
// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
//
using System;
using System.Text;
using System.Linq;
using System.Text.Json.Serialization;
using System.Collections.Generic;
using Algolia.Search.Serializer;
using System.Text.Json;

namespace Algolia.Search.Models.Search;

/// <summary>
/// Whether a dictionary entry is provided by Algolia (standard), or has been added by you (custom).
/// </summary>
/// <value>Whether a dictionary entry is provided by Algolia (standard), or has been added by you (custom).</value>
[JsonConverter(typeof(Serializer.JsonStringEnumConverter<DictionaryEntryType>))]
public enum DictionaryEntryType
{
  /// <summary>
  /// Enum Custom for value: custom
  /// </summary>
  [JsonPropertyName("custom")]
  Custom = 1,

  /// <summary>
  /// Enum Standard for value: standard
  /// </summary>
  [JsonPropertyName("standard")]
  Standard = 2
}

