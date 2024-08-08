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
/// DockerStreams
/// </summary>
public partial class DockerStreams
{

  /// <summary>
  /// Gets or Sets SyncMode
  /// </summary>
  [JsonPropertyName("syncMode")]
  public DockerStreamsSyncMode? SyncMode { get; set; }
  /// <summary>
  /// Initializes a new instance of the DockerStreams class.
  /// </summary>
  [JsonConstructor]
  public DockerStreams() { }
  /// <summary>
  /// Initializes a new instance of the DockerStreams class.
  /// </summary>
  /// <param name="name">The name of the stream to fetch the data from (e.g. table name). (required).</param>
  /// <param name="syncMode">syncMode (required).</param>
  public DockerStreams(string name, DockerStreamsSyncMode? syncMode)
  {
    Name = name ?? throw new ArgumentNullException(nameof(name));
    SyncMode = syncMode;
  }

  /// <summary>
  /// The name of the stream to fetch the data from (e.g. table name).
  /// </summary>
  /// <value>The name of the stream to fetch the data from (e.g. table name).</value>
  [JsonPropertyName("name")]
  public string Name { get; set; }

  /// <summary>
  /// The properties of the stream to select (e.g. column).
  /// </summary>
  /// <value>The properties of the stream to select (e.g. column).</value>
  [JsonPropertyName("properties")]
  public List<string> Properties { get; set; }

  /// <summary>
  /// Returns the string presentation of the object
  /// </summary>
  /// <returns>String presentation of the object</returns>
  public override string ToString()
  {
    StringBuilder sb = new StringBuilder();
    sb.Append("class DockerStreams {\n");
    sb.Append("  Name: ").Append(Name).Append("\n");
    sb.Append("  Properties: ").Append(Properties).Append("\n");
    sb.Append("  SyncMode: ").Append(SyncMode).Append("\n");
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
    if (obj is not DockerStreams input)
    {
      return false;
    }

    return
        (Name == input.Name || (Name != null && Name.Equals(input.Name))) &&
        (Properties == input.Properties || Properties != null && input.Properties != null && Properties.SequenceEqual(input.Properties)) &&
        (SyncMode == input.SyncMode || SyncMode.Equals(input.SyncMode));
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
      if (Name != null)
      {
        hashCode = (hashCode * 59) + Name.GetHashCode();
      }
      if (Properties != null)
      {
        hashCode = (hashCode * 59) + Properties.GetHashCode();
      }
      hashCode = (hashCode * 59) + SyncMode.GetHashCode();
      return hashCode;
    }
  }

}
