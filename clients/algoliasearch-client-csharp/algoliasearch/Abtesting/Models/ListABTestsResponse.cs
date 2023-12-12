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

namespace Algolia.Search.Abtesting.Models
{
  /// <summary>
  /// ListABTestsResponse
  /// </summary>
  [DataContract(Name = "listABTestsResponse")]
  public partial class ListABTestsResponse : IEquatable<ListABTestsResponse>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="ListABTestsResponse" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected ListABTestsResponse() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="ListABTestsResponse" /> class.
    /// </summary>
    /// <param name="abtests">A/B tests. (required).</param>
    /// <param name="count">Number of A/B tests implemented. (required).</param>
    /// <param name="total">Number of retrievable A/B tests. (required).</param>
    public ListABTestsResponse(List<ABTest> abtests = default(List<ABTest>), int count = default(int), int total = default(int))
    {
      // to ensure "abtests" is required (not null)
      if (abtests == null)
      {
        throw new ArgumentNullException("abtests is a required property for ListABTestsResponse and cannot be null");
      }
      this.Abtests = abtests;
      this.Count = count;
      this.Total = total;
    }

    /// <summary>
    /// A/B tests.
    /// </summary>
    /// <value>A/B tests.</value>
    [DataMember(Name = "abtests", IsRequired = true, EmitDefaultValue = true)]
    public List<ABTest> Abtests { get; set; }

    /// <summary>
    /// Number of A/B tests implemented.
    /// </summary>
    /// <value>Number of A/B tests implemented.</value>
    [DataMember(Name = "count", IsRequired = true, EmitDefaultValue = true)]
    public int Count { get; set; }

    /// <summary>
    /// Number of retrievable A/B tests.
    /// </summary>
    /// <value>Number of retrievable A/B tests.</value>
    [DataMember(Name = "total", IsRequired = true, EmitDefaultValue = true)]
    public int Total { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class ListABTestsResponse {\n");
      sb.Append("  Abtests: ").Append(Abtests).Append("\n");
      sb.Append("  Count: ").Append(Count).Append("\n");
      sb.Append("  Total: ").Append(Total).Append("\n");
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
      return this.Equals(input as ListABTestsResponse);
    }

    /// <summary>
    /// Returns true if ListABTestsResponse instances are equal
    /// </summary>
    /// <param name="input">Instance of ListABTestsResponse to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(ListABTestsResponse input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.Abtests == input.Abtests ||
              this.Abtests != null &&
              input.Abtests != null &&
              this.Abtests.SequenceEqual(input.Abtests)
          ) &&
          (
              this.Count == input.Count ||
              this.Count.Equals(input.Count)
          ) &&
          (
              this.Total == input.Total ||
              this.Total.Equals(input.Total)
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
        if (this.Abtests != null)
        {
          hashCode = (hashCode * 59) + this.Abtests.GetHashCode();
        }
        hashCode = (hashCode * 59) + this.Count.GetHashCode();
        hashCode = (hashCode * 59) + this.Total.GetHashCode();
        return hashCode;
      }
    }

  }

}
