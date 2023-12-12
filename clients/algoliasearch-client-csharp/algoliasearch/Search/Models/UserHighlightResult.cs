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
  /// UserHighlightResult
  /// </summary>
  [DataContract(Name = "userHighlightResult")]
  public partial class UserHighlightResult : IEquatable<UserHighlightResult>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="UserHighlightResult" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected UserHighlightResult() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="UserHighlightResult" /> class.
    /// </summary>
    /// <param name="userID">userID (required).</param>
    /// <param name="clusterName">clusterName (required).</param>
    public UserHighlightResult(HighlightResult userID = default(HighlightResult), HighlightResult clusterName = default(HighlightResult))
    {
      // to ensure "userID" is required (not null)
      if (userID == null)
      {
        throw new ArgumentNullException("userID is a required property for UserHighlightResult and cannot be null");
      }
      this.UserID = userID;
      // to ensure "clusterName" is required (not null)
      if (clusterName == null)
      {
        throw new ArgumentNullException("clusterName is a required property for UserHighlightResult and cannot be null");
      }
      this.ClusterName = clusterName;
    }

    /// <summary>
    /// Gets or Sets UserID
    /// </summary>
    [DataMember(Name = "userID", IsRequired = true, EmitDefaultValue = true)]
    public HighlightResult UserID { get; set; }

    /// <summary>
    /// Gets or Sets ClusterName
    /// </summary>
    [DataMember(Name = "clusterName", IsRequired = true, EmitDefaultValue = true)]
    public HighlightResult ClusterName { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class UserHighlightResult {\n");
      sb.Append("  UserID: ").Append(UserID).Append("\n");
      sb.Append("  ClusterName: ").Append(ClusterName).Append("\n");
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
      return this.Equals(input as UserHighlightResult);
    }

    /// <summary>
    /// Returns true if UserHighlightResult instances are equal
    /// </summary>
    /// <param name="input">Instance of UserHighlightResult to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(UserHighlightResult input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.UserID == input.UserID ||
              (this.UserID != null &&
              this.UserID.Equals(input.UserID))
          ) &&
          (
              this.ClusterName == input.ClusterName ||
              (this.ClusterName != null &&
              this.ClusterName.Equals(input.ClusterName))
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
        if (this.UserID != null)
        {
          hashCode = (hashCode * 59) + this.UserID.GetHashCode();
        }
        if (this.ClusterName != null)
        {
          hashCode = (hashCode * 59) + this.ClusterName.GetHashCode();
        }
        return hashCode;
      }
    }

  }

}
