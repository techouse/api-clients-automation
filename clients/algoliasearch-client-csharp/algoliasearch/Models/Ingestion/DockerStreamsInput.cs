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

namespace Algolia.Search.Models.Ingestion;

/// <summary>
/// The selected streams of a singer or airbyte connector.
/// </summary>
public partial class DockerStreamsInput
{
  /// <summary>
  /// Initializes a new instance of the DockerStreamsInput class.
  /// </summary>
  [JsonConstructor]
  public DockerStreamsInput() { }
  /// <summary>
  /// Initializes a new instance of the DockerStreamsInput class.
  /// </summary>
  /// <param name="streams">streams (required).</param>
  public DockerStreamsInput(object streams)
  {
    Streams = streams ?? throw new ArgumentNullException(nameof(streams));
  }

  /// <summary>
  /// Gets or Sets Streams
  /// </summary>
  [JsonPropertyName("streams")]
  public object Streams { get; set; }

  /// <summary>
  /// Returns the string presentation of the object
  /// </summary>
  /// <returns>String presentation of the object</returns>
  public override string ToString()
  {
    StringBuilder sb = new StringBuilder();
    sb.Append("class DockerStreamsInput {\n");
    sb.Append("  Streams: ").Append(Streams).Append("\n");
    sb.Append("}\n");
    return sb.ToString();
  }

  /// <summary>
  /// Returns the JSON string presentation of the object
  /// </summary>
  /// <returns>JSON string presentation of the object</returns>
  public virtual string ToJson()
  {
    return JsonSerializer.Serialize(this, JsonConfig.Options);
  }

  /// <summary>
  /// Returns true if objects are equal
  /// </summary>
  /// <param name="obj">Object to be compared</param>
  /// <returns>Boolean</returns>
  public override bool Equals(object obj)
  {
    if (obj is not DockerStreamsInput input)
    {
      return false;
    }

    return
        (Streams == input.Streams || (Streams != null && Streams.Equals(input.Streams)));
  }

  /// <summary>
  /// Gets the hash code
  /// </summary>
  /// <returns>Hash code</returns>
  public override int GetHashCode()
  {
    unchecked // Overflow is fine, just wrap
    {
      int hashCode = 41;
      if (Streams != null)
      {
        hashCode = (hashCode * 59) + Streams.GetHashCode();
      }
      return hashCode;
    }
  }

}

