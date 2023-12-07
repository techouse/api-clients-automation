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
using FileParameter = Algolia.Search.Search.Client.FileParameter;
using OpenAPIDateConverter = Algolia.Search.Search.Client.OpenAPIDateConverter;

namespace Algolia.Search.Search.Models
{
  /// <summary>
  /// Enable or turn off the built-in Algolia stop words for a specific language.
  /// </summary>
  [DataContract(Name = "dictionarySettingsParams")]
  public partial class DictionarySettingsParams : IEquatable<DictionarySettingsParams>, IValidatableObject
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="DictionarySettingsParams" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected DictionarySettingsParams() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="DictionarySettingsParams" /> class.
    /// </summary>
    /// <param name="disableStandardEntries">disableStandardEntries (required).</param>
    public DictionarySettingsParams(StandardEntries disableStandardEntries = default(StandardEntries))
    {
      // to ensure "disableStandardEntries" is required (not null)
      if (disableStandardEntries == null)
      {
        throw new ArgumentNullException("disableStandardEntries is a required property for DictionarySettingsParams and cannot be null");
      }
      this.DisableStandardEntries = disableStandardEntries;
    }

    /// <summary>
    /// Gets or Sets DisableStandardEntries
    /// </summary>
    [DataMember(Name = "disableStandardEntries", IsRequired = true, EmitDefaultValue = true)]
    public StandardEntries DisableStandardEntries { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class DictionarySettingsParams {\n");
      sb.Append("  DisableStandardEntries: ").Append(DisableStandardEntries).Append("\n");
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
      return this.Equals(input as DictionarySettingsParams);
    }

    /// <summary>
    /// Returns true if DictionarySettingsParams instances are equal
    /// </summary>
    /// <param name="input">Instance of DictionarySettingsParams to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(DictionarySettingsParams input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.DisableStandardEntries == input.DisableStandardEntries ||
              (this.DisableStandardEntries != null &&
              this.DisableStandardEntries.Equals(input.DisableStandardEntries))
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
        if (this.DisableStandardEntries != null)
        {
          hashCode = (hashCode * 59) + this.DisableStandardEntries.GetHashCode();
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