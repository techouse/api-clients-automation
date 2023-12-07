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
using System.ComponentModel.DataAnnotations;
using FileParameter = Algolia.Search.Analytics.Client.FileParameter;
using OpenAPIDateConverter = Algolia.Search.Analytics.Client.OpenAPIDateConverter;

namespace Algolia.Search.Analytics.Models
{
  /// <summary>
  /// GetTopFiltersNoResultsValues
  /// </summary>
  [DataContract(Name = "getTopFiltersNoResultsValues")]
  public partial class GetTopFiltersNoResultsValues : IEquatable<GetTopFiltersNoResultsValues>, IValidatableObject
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="GetTopFiltersNoResultsValues" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected GetTopFiltersNoResultsValues() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="GetTopFiltersNoResultsValues" /> class.
    /// </summary>
    /// <param name="count">Number of occurrences. (required).</param>
    /// <param name="values">Filters with no results. (required).</param>
    public GetTopFiltersNoResultsValues(int count = default(int), List<GetTopFiltersNoResultsValue> values = default(List<GetTopFiltersNoResultsValue>))
    {
      this.Count = count;
      // to ensure "values" is required (not null)
      if (values == null)
      {
        throw new ArgumentNullException("values is a required property for GetTopFiltersNoResultsValues and cannot be null");
      }
      this.Values = values;
    }

    /// <summary>
    /// Number of occurrences.
    /// </summary>
    /// <value>Number of occurrences.</value>
    [DataMember(Name = "count", IsRequired = true, EmitDefaultValue = true)]
    public int Count { get; set; }

    /// <summary>
    /// Filters with no results.
    /// </summary>
    /// <value>Filters with no results.</value>
    [DataMember(Name = "values", IsRequired = true, EmitDefaultValue = true)]
    public List<GetTopFiltersNoResultsValue> Values { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class GetTopFiltersNoResultsValues {\n");
      sb.Append("  Count: ").Append(Count).Append("\n");
      sb.Append("  Values: ").Append(Values).Append("\n");
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
      return this.Equals(input as GetTopFiltersNoResultsValues);
    }

    /// <summary>
    /// Returns true if GetTopFiltersNoResultsValues instances are equal
    /// </summary>
    /// <param name="input">Instance of GetTopFiltersNoResultsValues to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(GetTopFiltersNoResultsValues input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.Count == input.Count ||
              this.Count.Equals(input.Count)
          ) &&
          (
              this.Values == input.Values ||
              this.Values != null &&
              input.Values != null &&
              this.Values.SequenceEqual(input.Values)
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
        hashCode = (hashCode * 59) + this.Count.GetHashCode();
        if (this.Values != null)
        {
          hashCode = (hashCode * 59) + this.Values.GetHashCode();
        }
        return hashCode;
      }
    }

    /// <summary>
    /// To validate all properties of the instance
    /// </summary>
    /// <param name="validationContext">Validation context</param>
    /// <returns>Validation Result</returns>
    IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
    {
      yield break;
    }
  }

}