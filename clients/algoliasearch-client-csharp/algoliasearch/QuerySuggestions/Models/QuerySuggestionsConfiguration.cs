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
using FileParameter = Algolia.Search.QuerySuggestions.Client.FileParameter;
using OpenAPIDateConverter = Algolia.Search.QuerySuggestions.Client.OpenAPIDateConverter;

namespace Algolia.Search.QuerySuggestions.Models
{
  /// <summary>
  /// Query Suggestions configuration.
  /// </summary>
  [DataContract(Name = "QuerySuggestionsConfiguration")]
  public partial class QuerySuggestionsConfiguration : IEquatable<QuerySuggestionsConfiguration>, IValidatableObject
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="QuerySuggestionsConfiguration" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected QuerySuggestionsConfiguration() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="QuerySuggestionsConfiguration" /> class.
    /// </summary>
    /// <param name="sourceIndices">Algolia indices from which to get the popular searches for query suggestions. (required).</param>
    /// <param name="languages">languages.</param>
    /// <param name="exclude">Patterns to exclude from query suggestions..</param>
    /// <param name="enablePersonalization">Turn on personalized query suggestions. (default to false).</param>
    /// <param name="allowSpecialCharacters">Allow suggestions with special characters. (default to false).</param>
    public QuerySuggestionsConfiguration(List<SourceIndex> sourceIndices = default(List<SourceIndex>), Languages languages = default(Languages), List<string> exclude = default(List<string>), bool enablePersonalization = false, bool allowSpecialCharacters = false)
    {
      // to ensure "sourceIndices" is required (not null)
      if (sourceIndices == null)
      {
        throw new ArgumentNullException("sourceIndices is a required property for QuerySuggestionsConfiguration and cannot be null");
      }
      this.SourceIndices = sourceIndices;
      this.Languages = languages;
      this.Exclude = exclude;
      this.EnablePersonalization = enablePersonalization;
      this.AllowSpecialCharacters = allowSpecialCharacters;
    }

    /// <summary>
    /// Algolia indices from which to get the popular searches for query suggestions.
    /// </summary>
    /// <value>Algolia indices from which to get the popular searches for query suggestions.</value>
    [DataMember(Name = "sourceIndices", IsRequired = true, EmitDefaultValue = true)]
    public List<SourceIndex> SourceIndices { get; set; }

    /// <summary>
    /// Gets or Sets Languages
    /// </summary>
    [DataMember(Name = "languages", EmitDefaultValue = false)]
    public Languages Languages { get; set; }

    /// <summary>
    /// Patterns to exclude from query suggestions.
    /// </summary>
    /// <value>Patterns to exclude from query suggestions.</value>
    [DataMember(Name = "exclude", EmitDefaultValue = true)]
    public List<string> Exclude { get; set; }

    /// <summary>
    /// Turn on personalized query suggestions.
    /// </summary>
    /// <value>Turn on personalized query suggestions.</value>
    [DataMember(Name = "enablePersonalization", EmitDefaultValue = true)]
    public bool EnablePersonalization { get; set; }

    /// <summary>
    /// Allow suggestions with special characters.
    /// </summary>
    /// <value>Allow suggestions with special characters.</value>
    [DataMember(Name = "allowSpecialCharacters", EmitDefaultValue = true)]
    public bool AllowSpecialCharacters { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class QuerySuggestionsConfiguration {\n");
      sb.Append("  SourceIndices: ").Append(SourceIndices).Append("\n");
      sb.Append("  Languages: ").Append(Languages).Append("\n");
      sb.Append("  Exclude: ").Append(Exclude).Append("\n");
      sb.Append("  EnablePersonalization: ").Append(EnablePersonalization).Append("\n");
      sb.Append("  AllowSpecialCharacters: ").Append(AllowSpecialCharacters).Append("\n");
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
      return this.Equals(input as QuerySuggestionsConfiguration);
    }

    /// <summary>
    /// Returns true if QuerySuggestionsConfiguration instances are equal
    /// </summary>
    /// <param name="input">Instance of QuerySuggestionsConfiguration to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(QuerySuggestionsConfiguration input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.SourceIndices == input.SourceIndices ||
              this.SourceIndices != null &&
              input.SourceIndices != null &&
              this.SourceIndices.SequenceEqual(input.SourceIndices)
          ) &&
          (
              this.Languages == input.Languages ||
              (this.Languages != null &&
              this.Languages.Equals(input.Languages))
          ) &&
          (
              this.Exclude == input.Exclude ||
              this.Exclude != null &&
              input.Exclude != null &&
              this.Exclude.SequenceEqual(input.Exclude)
          ) &&
          (
              this.EnablePersonalization == input.EnablePersonalization ||
              this.EnablePersonalization.Equals(input.EnablePersonalization)
          ) &&
          (
              this.AllowSpecialCharacters == input.AllowSpecialCharacters ||
              this.AllowSpecialCharacters.Equals(input.AllowSpecialCharacters)
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
        if (this.SourceIndices != null)
        {
          hashCode = (hashCode * 59) + this.SourceIndices.GetHashCode();
        }
        if (this.Languages != null)
        {
          hashCode = (hashCode * 59) + this.Languages.GetHashCode();
        }
        if (this.Exclude != null)
        {
          hashCode = (hashCode * 59) + this.Exclude.GetHashCode();
        }
        hashCode = (hashCode * 59) + this.EnablePersonalization.GetHashCode();
        hashCode = (hashCode * 59) + this.AllowSpecialCharacters.GetHashCode();
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