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
  /// Synonym object.
  /// </summary>
  [DataContract(Name = "synonymHit")]
  public partial class SynonymHit : IEquatable<SynonymHit>, IValidatableObject
  {

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
    public SynonymType Type { get; set; }
    /// <summary>
    /// Initializes a new instance of the <see cref="SynonymHit" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected SynonymHit() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="SynonymHit" /> class.
    /// </summary>
    /// <param name="objectID">Unique identifier of a synonym object. (required).</param>
    /// <param name="type">type (required).</param>
    /// <param name="synonyms">Words or phrases considered equivalent..</param>
    /// <param name="input">Word or phrase to appear in query strings (for [&#x60;onewaysynonym&#x60;s](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/one-way-synonyms/))..</param>
    /// <param name="word">Word or phrase to appear in query strings (for [&#x60;altcorrection1&#x60; and &#x60;altcorrection2&#x60;](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/synonyms-alternative-corrections/))..</param>
    /// <param name="corrections">Words to be matched in records..</param>
    /// <param name="placeholder">[Placeholder token](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/synonyms-placeholders/) to be put inside records. .</param>
    /// <param name="replacements">Query words that will match the [placeholder token](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/synonyms-placeholders/)..</param>
    public SynonymHit(string objectID = default(string), SynonymType type = default(SynonymType), List<string> synonyms = default(List<string>), string input = default(string), string word = default(string), List<string> corrections = default(List<string>), string placeholder = default(string), List<string> replacements = default(List<string>))
    {
      // to ensure "objectID" is required (not null)
      if (objectID == null)
      {
        throw new ArgumentNullException("objectID is a required property for SynonymHit and cannot be null");
      }
      this.ObjectID = objectID;
      this.Type = type;
      this.Synonyms = synonyms;
      this.Input = input;
      this.Word = word;
      this.Corrections = corrections;
      this.Placeholder = placeholder;
      this.Replacements = replacements;
    }

    /// <summary>
    /// Unique identifier of a synonym object.
    /// </summary>
    /// <value>Unique identifier of a synonym object.</value>
    [DataMember(Name = "objectID", IsRequired = true, EmitDefaultValue = true)]
    public string ObjectID { get; set; }

    /// <summary>
    /// Words or phrases considered equivalent.
    /// </summary>
    /// <value>Words or phrases considered equivalent.</value>
    [DataMember(Name = "synonyms", EmitDefaultValue = false)]
    public List<string> Synonyms { get; set; }

    /// <summary>
    /// Word or phrase to appear in query strings (for [&#x60;onewaysynonym&#x60;s](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/one-way-synonyms/)).
    /// </summary>
    /// <value>Word or phrase to appear in query strings (for [&#x60;onewaysynonym&#x60;s](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/one-way-synonyms/)).</value>
    [DataMember(Name = "input", EmitDefaultValue = false)]
    public string Input { get; set; }

    /// <summary>
    /// Word or phrase to appear in query strings (for [&#x60;altcorrection1&#x60; and &#x60;altcorrection2&#x60;](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/synonyms-alternative-corrections/)).
    /// </summary>
    /// <value>Word or phrase to appear in query strings (for [&#x60;altcorrection1&#x60; and &#x60;altcorrection2&#x60;](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/synonyms-alternative-corrections/)).</value>
    [DataMember(Name = "word", EmitDefaultValue = false)]
    public string Word { get; set; }

    /// <summary>
    /// Words to be matched in records.
    /// </summary>
    /// <value>Words to be matched in records.</value>
    [DataMember(Name = "corrections", EmitDefaultValue = false)]
    public List<string> Corrections { get; set; }

    /// <summary>
    /// [Placeholder token](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/synonyms-placeholders/) to be put inside records. 
    /// </summary>
    /// <value>[Placeholder token](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/synonyms-placeholders/) to be put inside records. </value>
    [DataMember(Name = "placeholder", EmitDefaultValue = false)]
    public string Placeholder { get; set; }

    /// <summary>
    /// Query words that will match the [placeholder token](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/synonyms-placeholders/).
    /// </summary>
    /// <value>Query words that will match the [placeholder token](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/in-depth/synonyms-placeholders/).</value>
    [DataMember(Name = "replacements", EmitDefaultValue = false)]
    public List<string> Replacements { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class SynonymHit {\n");
      sb.Append("  ObjectID: ").Append(ObjectID).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  Synonyms: ").Append(Synonyms).Append("\n");
      sb.Append("  Input: ").Append(Input).Append("\n");
      sb.Append("  Word: ").Append(Word).Append("\n");
      sb.Append("  Corrections: ").Append(Corrections).Append("\n");
      sb.Append("  Placeholder: ").Append(Placeholder).Append("\n");
      sb.Append("  Replacements: ").Append(Replacements).Append("\n");
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
      return this.Equals(input as SynonymHit);
    }

    /// <summary>
    /// Returns true if SynonymHit instances are equal
    /// </summary>
    /// <param name="input">Instance of SynonymHit to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(SynonymHit input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.ObjectID == input.ObjectID ||
              (this.ObjectID != null &&
              this.ObjectID.Equals(input.ObjectID))
          ) &&
          (
              this.Type == input.Type ||
              this.Type.Equals(input.Type)
          ) &&
          (
              this.Synonyms == input.Synonyms ||
              this.Synonyms != null &&
              input.Synonyms != null &&
              this.Synonyms.SequenceEqual(input.Synonyms)
          ) &&
          (
              this.Input == input.Input ||
              (this.Input != null &&
              this.Input.Equals(input.Input))
          ) &&
          (
              this.Word == input.Word ||
              (this.Word != null &&
              this.Word.Equals(input.Word))
          ) &&
          (
              this.Corrections == input.Corrections ||
              this.Corrections != null &&
              input.Corrections != null &&
              this.Corrections.SequenceEqual(input.Corrections)
          ) &&
          (
              this.Placeholder == input.Placeholder ||
              (this.Placeholder != null &&
              this.Placeholder.Equals(input.Placeholder))
          ) &&
          (
              this.Replacements == input.Replacements ||
              this.Replacements != null &&
              input.Replacements != null &&
              this.Replacements.SequenceEqual(input.Replacements)
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
        if (this.ObjectID != null)
        {
          hashCode = (hashCode * 59) + this.ObjectID.GetHashCode();
        }
        hashCode = (hashCode * 59) + this.Type.GetHashCode();
        if (this.Synonyms != null)
        {
          hashCode = (hashCode * 59) + this.Synonyms.GetHashCode();
        }
        if (this.Input != null)
        {
          hashCode = (hashCode * 59) + this.Input.GetHashCode();
        }
        if (this.Word != null)
        {
          hashCode = (hashCode * 59) + this.Word.GetHashCode();
        }
        if (this.Corrections != null)
        {
          hashCode = (hashCode * 59) + this.Corrections.GetHashCode();
        }
        if (this.Placeholder != null)
        {
          hashCode = (hashCode * 59) + this.Placeholder.GetHashCode();
        }
        if (this.Replacements != null)
        {
          hashCode = (hashCode * 59) + this.Replacements.GetHashCode();
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