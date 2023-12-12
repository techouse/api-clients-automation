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
  /// ListDestinationsResponse
  /// </summary>
  [DataContract(Name = "listDestinationsResponse")]
  public partial class ListDestinationsResponse : IEquatable<ListDestinationsResponse>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="ListDestinationsResponse" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected ListDestinationsResponse() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="ListDestinationsResponse" /> class.
    /// </summary>
    /// <param name="destinations">destinations (required).</param>
    /// <param name="pagination">pagination (required).</param>
    public ListDestinationsResponse(List<Destination> destinations = default(List<Destination>), Pagination pagination = default(Pagination))
    {
      // to ensure "destinations" is required (not null)
      if (destinations == null)
      {
        throw new ArgumentNullException("destinations is a required property for ListDestinationsResponse and cannot be null");
      }
      this.Destinations = destinations;
      // to ensure "pagination" is required (not null)
      if (pagination == null)
      {
        throw new ArgumentNullException("pagination is a required property for ListDestinationsResponse and cannot be null");
      }
      this.Pagination = pagination;
    }

    /// <summary>
    /// Gets or Sets Destinations
    /// </summary>
    [DataMember(Name = "destinations", IsRequired = true, EmitDefaultValue = true)]
    public List<Destination> Destinations { get; set; }

    /// <summary>
    /// Gets or Sets Pagination
    /// </summary>
    [DataMember(Name = "pagination", IsRequired = true, EmitDefaultValue = true)]
    public Pagination Pagination { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class ListDestinationsResponse {\n");
      sb.Append("  Destinations: ").Append(Destinations).Append("\n");
      sb.Append("  Pagination: ").Append(Pagination).Append("\n");
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
      return this.Equals(input as ListDestinationsResponse);
    }

    /// <summary>
    /// Returns true if ListDestinationsResponse instances are equal
    /// </summary>
    /// <param name="input">Instance of ListDestinationsResponse to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(ListDestinationsResponse input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.Destinations == input.Destinations ||
              this.Destinations != null &&
              input.Destinations != null &&
              this.Destinations.SequenceEqual(input.Destinations)
          ) &&
          (
              this.Pagination == input.Pagination ||
              (this.Pagination != null &&
              this.Pagination.Equals(input.Pagination))
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
        if (this.Destinations != null)
        {
          hashCode = (hashCode * 59) + this.Destinations.GetHashCode();
        }
        if (this.Pagination != null)
        {
          hashCode = (hashCode * 59) + this.Pagination.GetHashCode();
        }
        return hashCode;
      }
    }

  }

}
