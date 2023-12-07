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
  /// RunProgress
  /// </summary>
  [DataContract(Name = "Run_progress")]
  public partial class RunProgress : IEquatable<RunProgress>, IValidatableObject
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="RunProgress" /> class.
    /// </summary>
    /// <param name="expectedNbOfEvents">expectedNbOfEvents.</param>
    /// <param name="receivedNbOfEvents">receivedNbOfEvents.</param>
    public RunProgress(int expectedNbOfEvents = default(int), int receivedNbOfEvents = default(int))
    {
      this.ExpectedNbOfEvents = expectedNbOfEvents;
      this.ReceivedNbOfEvents = receivedNbOfEvents;
    }

    /// <summary>
    /// Gets or Sets ExpectedNbOfEvents
    /// </summary>
    [DataMember(Name = "expectedNbOfEvents", EmitDefaultValue = false)]
    public int ExpectedNbOfEvents { get; set; }

    /// <summary>
    /// Gets or Sets ReceivedNbOfEvents
    /// </summary>
    [DataMember(Name = "receivedNbOfEvents", EmitDefaultValue = false)]
    public int ReceivedNbOfEvents { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class RunProgress {\n");
      sb.Append("  ExpectedNbOfEvents: ").Append(ExpectedNbOfEvents).Append("\n");
      sb.Append("  ReceivedNbOfEvents: ").Append(ReceivedNbOfEvents).Append("\n");
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
      return this.Equals(input as RunProgress);
    }

    /// <summary>
    /// Returns true if RunProgress instances are equal
    /// </summary>
    /// <param name="input">Instance of RunProgress to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(RunProgress input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.ExpectedNbOfEvents == input.ExpectedNbOfEvents ||
              this.ExpectedNbOfEvents.Equals(input.ExpectedNbOfEvents)
          ) &&
          (
              this.ReceivedNbOfEvents == input.ReceivedNbOfEvents ||
              this.ReceivedNbOfEvents.Equals(input.ReceivedNbOfEvents)
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
        hashCode = (hashCode * 59) + this.ExpectedNbOfEvents.GetHashCode();
        hashCode = (hashCode * 59) + this.ReceivedNbOfEvents.GetHashCode();
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