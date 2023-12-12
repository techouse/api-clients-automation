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

namespace Algolia.Search.Monitoring.Models
{
  /// <summary>
  /// LatencyResponse
  /// </summary>
  [DataContract(Name = "LatencyResponse")]
  public partial class LatencyResponse : IEquatable<LatencyResponse>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="LatencyResponse" /> class.
    /// </summary>
    /// <param name="metrics">metrics.</param>
    public LatencyResponse(LatencyResponseMetrics metrics = default(LatencyResponseMetrics))
    {
      this.Metrics = metrics;
    }

    /// <summary>
    /// Gets or Sets Metrics
    /// </summary>
    [DataMember(Name = "metrics", EmitDefaultValue = false)]
    public LatencyResponseMetrics Metrics { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class LatencyResponse {\n");
      sb.Append("  Metrics: ").Append(Metrics).Append("\n");
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
      return this.Equals(input as LatencyResponse);
    }

    /// <summary>
    /// Returns true if LatencyResponse instances are equal
    /// </summary>
    /// <param name="input">Instance of LatencyResponse to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(LatencyResponse input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.Metrics == input.Metrics ||
              (this.Metrics != null &&
              this.Metrics.Equals(input.Metrics))
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
        if (this.Metrics != null)
        {
          hashCode = (hashCode * 59) + this.Metrics.GetHashCode();
        }
        return hashCode;
      }
    }

  }

}
