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
using FileParameter = Algolia.Search.Recommend.Client.FileParameter;
using OpenAPIDateConverter = Algolia.Search.Recommend.Client.OpenAPIDateConverter;

namespace Algolia.Search.Recommend.Models
{
  /// <summary>
  /// Records to promote.
  /// </summary>
  [DataContract(Name = "promoteObjectIDs")]
  public partial class PromoteObjectIDs : IEquatable<PromoteObjectIDs>, IValidatableObject
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="PromoteObjectIDs" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected PromoteObjectIDs() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="PromoteObjectIDs" /> class.
    /// </summary>
    /// <param name="objectIDs">Unique identifiers of the records to promote. (required).</param>
    /// <param name="position">The position to promote the records to. If you pass objectIDs, the records are placed at this position as a group. For example, if you pronmote four objectIDs to position 0, the records take the first four positions. (required).</param>
    public PromoteObjectIDs(List<string> objectIDs = default(List<string>), int position = default(int))
    {
      // to ensure "objectIDs" is required (not null)
      if (objectIDs == null)
      {
        throw new ArgumentNullException("objectIDs is a required property for PromoteObjectIDs and cannot be null");
      }
      this.ObjectIDs = objectIDs;
      this.Position = position;
    }

    /// <summary>
    /// Unique identifiers of the records to promote.
    /// </summary>
    /// <value>Unique identifiers of the records to promote.</value>
    [DataMember(Name = "objectIDs", IsRequired = true, EmitDefaultValue = true)]
    public List<string> ObjectIDs { get; set; }

    /// <summary>
    /// The position to promote the records to. If you pass objectIDs, the records are placed at this position as a group. For example, if you pronmote four objectIDs to position 0, the records take the first four positions.
    /// </summary>
    /// <value>The position to promote the records to. If you pass objectIDs, the records are placed at this position as a group. For example, if you pronmote four objectIDs to position 0, the records take the first four positions.</value>
    [DataMember(Name = "position", IsRequired = true, EmitDefaultValue = true)]
    public int Position { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class PromoteObjectIDs {\n");
      sb.Append("  ObjectIDs: ").Append(ObjectIDs).Append("\n");
      sb.Append("  Position: ").Append(Position).Append("\n");
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
      return this.Equals(input as PromoteObjectIDs);
    }

    /// <summary>
    /// Returns true if PromoteObjectIDs instances are equal
    /// </summary>
    /// <param name="input">Instance of PromoteObjectIDs to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(PromoteObjectIDs input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.ObjectIDs == input.ObjectIDs ||
              this.ObjectIDs != null &&
              input.ObjectIDs != null &&
              this.ObjectIDs.SequenceEqual(input.ObjectIDs)
          ) &&
          (
              this.Position == input.Position ||
              this.Position.Equals(input.Position)
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
        if (this.ObjectIDs != null)
        {
          hashCode = (hashCode * 59) + this.ObjectIDs.GetHashCode();
        }
        hashCode = (hashCode * 59) + this.Position.GetHashCode();
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