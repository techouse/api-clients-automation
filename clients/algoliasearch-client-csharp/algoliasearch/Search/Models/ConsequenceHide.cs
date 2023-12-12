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

namespace Algolia.Search.Search.Models
{
  /// <summary>
  /// Unique identifier of the record to hide.
  /// </summary>
  [DataContract(Name = "consequenceHide")]
  public partial class ConsequenceHide : IEquatable<ConsequenceHide>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="ConsequenceHide" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected ConsequenceHide() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="ConsequenceHide" /> class.
    /// </summary>
    /// <param name="objectID">Unique object identifier. (required).</param>
    public ConsequenceHide(string objectID = default(string))
    {
      // to ensure "objectID" is required (not null)
      if (objectID == null)
      {
        throw new ArgumentNullException("objectID is a required property for ConsequenceHide and cannot be null");
      }
      this.ObjectID = objectID;
    }

    /// <summary>
    /// Unique object identifier.
    /// </summary>
    /// <value>Unique object identifier.</value>
    [DataMember(Name = "objectID", IsRequired = true, EmitDefaultValue = true)]
    public string ObjectID { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class ConsequenceHide {\n");
      sb.Append("  ObjectID: ").Append(ObjectID).Append("\n");
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
      return this.Equals(input as ConsequenceHide);
    }

    /// <summary>
    /// Returns true if ConsequenceHide instances are equal
    /// </summary>
    /// <param name="input">Instance of ConsequenceHide to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(ConsequenceHide input)
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
        return hashCode;
      }
    }

  }

}
