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
using FileParameter = Algolia.Search.Ingestion.Client.FileParameter;
using OpenAPIDateConverter = Algolia.Search.Ingestion.Client.OpenAPIDateConverter;

namespace Algolia.Search.Ingestion.Models
{
  /// <summary>
  /// The window parameter represents the holds the dates used to query the Observability data from the database in a given window.
  /// </summary>
  [DataContract(Name = "Window")]
  public partial class Window : IEquatable<Window>, IValidatableObject
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="Window" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected Window() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="Window" /> class.
    /// </summary>
    /// <param name="startDate">A date in format RFC3339 representing the oldest possible data in query window. (required).</param>
    /// <param name="endDate">A date in format RFC3339 representing the newest possible data in query window. (required).</param>
    public Window(string startDate = default(string), string endDate = default(string))
    {
      // to ensure "startDate" is required (not null)
      if (startDate == null)
      {
        throw new ArgumentNullException("startDate is a required property for Window and cannot be null");
      }
      this.StartDate = startDate;
      // to ensure "endDate" is required (not null)
      if (endDate == null)
      {
        throw new ArgumentNullException("endDate is a required property for Window and cannot be null");
      }
      this.EndDate = endDate;
    }

    /// <summary>
    /// A date in format RFC3339 representing the oldest possible data in query window.
    /// </summary>
    /// <value>A date in format RFC3339 representing the oldest possible data in query window.</value>
    [DataMember(Name = "startDate", IsRequired = true, EmitDefaultValue = true)]
    public string StartDate { get; set; }

    /// <summary>
    /// A date in format RFC3339 representing the newest possible data in query window.
    /// </summary>
    /// <value>A date in format RFC3339 representing the newest possible data in query window.</value>
    [DataMember(Name = "endDate", IsRequired = true, EmitDefaultValue = true)]
    public string EndDate { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class Window {\n");
      sb.Append("  StartDate: ").Append(StartDate).Append("\n");
      sb.Append("  EndDate: ").Append(EndDate).Append("\n");
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
      return this.Equals(input as Window);
    }

    /// <summary>
    /// Returns true if Window instances are equal
    /// </summary>
    /// <param name="input">Instance of Window to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(Window input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.StartDate == input.StartDate ||
              (this.StartDate != null &&
              this.StartDate.Equals(input.StartDate))
          ) &&
          (
              this.EndDate == input.EndDate ||
              (this.EndDate != null &&
              this.EndDate.Equals(input.EndDate))
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
        if (this.StartDate != null)
        {
          hashCode = (hashCode * 59) + this.StartDate.GetHashCode();
        }
        if (this.EndDate != null)
        {
          hashCode = (hashCode * 59) + this.EndDate.GetHashCode();
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