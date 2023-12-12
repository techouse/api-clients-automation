//
// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
//

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using Algolia.Search.Models;

namespace Algolia.Search.Ingestion.Models
{
  /// <summary>
  /// DockerSourceStreams
  /// </summary>
  [DataContract(Name = "dockerSourceStreams")]
  public partial class DockerSourceStreams : IEquatable<DockerSourceStreams>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="DockerSourceStreams" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected DockerSourceStreams() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="DockerSourceStreams" /> class.
    /// </summary>
    /// <param name="streams">streams (required).</param>
    public DockerSourceStreams(List<Object> streams = default(List<Object>))
    {
      // to ensure "streams" is required (not null)
      if (streams == null)
      {
        throw new ArgumentNullException("streams is a required property for DockerSourceStreams and cannot be null");
      }
      this.Streams = streams;
    }

    /// <summary>
    /// Gets or Sets Streams
    /// </summary>
    [DataMember(Name = "streams", IsRequired = true, EmitDefaultValue = true)]
    public List<Object> Streams { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class DockerSourceStreams {\n");
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
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

    /// <summary>
    /// Returns true if objects are equal
    /// </summary>
    /// <param name="input">Object to be compared</param>
    /// <returns>Boolean</returns>
    public override bool Equals(object input)
    {
      return this.Equals(input as DockerSourceStreams);
    }

    /// <summary>
    /// Returns true if DockerSourceStreams instances are equal
    /// </summary>
    /// <param name="input">Instance of DockerSourceStreams to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(DockerSourceStreams input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.Streams == input.Streams ||
              this.Streams != null &&
              input.Streams != null &&
              this.Streams.SequenceEqual(input.Streams)
          );
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
        if (this.Streams != null)
        {
          hashCode = (hashCode * 59) + this.Streams.GetHashCode();
        }
        return hashCode;
      }
    }

  }

}
