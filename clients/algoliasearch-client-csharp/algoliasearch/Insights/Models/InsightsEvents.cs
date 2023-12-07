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
using FileParameter = Algolia.Search.Insights.Client.FileParameter;
using OpenAPIDateConverter = Algolia.Search.Insights.Client.OpenAPIDateConverter;

namespace Algolia.Search.Insights.Models
{
  /// <summary>
  /// InsightsEvents
  /// </summary>
  [DataContract(Name = "InsightsEvents")]
  public partial class InsightsEvents : IEquatable<InsightsEvents>, IValidatableObject
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="InsightsEvents" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected InsightsEvents() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="InsightsEvents" /> class.
    /// </summary>
    /// <param name="events">List of click and conversion events.  An event is an object representing a user interaction. Events have attributes that describe the interaction, such as an event name, a type, or a user token. Some attributes require other attributes to be declared, and some attributes can&#39;t be declared at the same time.  **All** events must be valid, otherwise the API returns an error.  (required).</param>
    public InsightsEvents(List<EventsItems> events = default(List<EventsItems>))
    {
      // to ensure "events" is required (not null)
      if (events == null)
      {
        throw new ArgumentNullException("events is a required property for InsightsEvents and cannot be null");
      }
      this.Events = events;
    }

    /// <summary>
    /// List of click and conversion events.  An event is an object representing a user interaction. Events have attributes that describe the interaction, such as an event name, a type, or a user token. Some attributes require other attributes to be declared, and some attributes can&#39;t be declared at the same time.  **All** events must be valid, otherwise the API returns an error. 
    /// </summary>
    /// <value>List of click and conversion events.  An event is an object representing a user interaction. Events have attributes that describe the interaction, such as an event name, a type, or a user token. Some attributes require other attributes to be declared, and some attributes can&#39;t be declared at the same time.  **All** events must be valid, otherwise the API returns an error. </value>
    [DataMember(Name = "events", IsRequired = true, EmitDefaultValue = true)]
    public List<EventsItems> Events { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class InsightsEvents {\n");
      sb.Append("  Events: ").Append(Events).Append("\n");
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
      return this.Equals(input as InsightsEvents);
    }

    /// <summary>
    /// Returns true if InsightsEvents instances are equal
    /// </summary>
    /// <param name="input">Instance of InsightsEvents to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(InsightsEvents input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.Events == input.Events ||
              this.Events != null &&
              input.Events != null &&
              this.Events.SequenceEqual(input.Events)
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
        if (this.Events != null)
        {
          hashCode = (hashCode * 59) + this.Events.GetHashCode();
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