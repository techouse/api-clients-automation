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
using FileParameter = Algolia.Search.Monitoring.Client.FileParameter;
using OpenAPIDateConverter = Algolia.Search.Monitoring.Client.OpenAPIDateConverter;

namespace Algolia.Search.Monitoring.Models
{
  /// <summary>
  /// InventoryResponse
  /// </summary>
  [DataContract(Name = "InventoryResponse")]
  public partial class InventoryResponse : IEquatable<InventoryResponse>, IValidatableObject
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="InventoryResponse" /> class.
    /// </summary>
    /// <param name="inventory">inventory.</param>
    public InventoryResponse(List<Server> inventory = default(List<Server>))
    {
      this.Inventory = inventory;
    }

    /// <summary>
    /// Gets or Sets Inventory
    /// </summary>
    [DataMember(Name = "inventory", EmitDefaultValue = false)]
    public List<Server> Inventory { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class InventoryResponse {\n");
      sb.Append("  Inventory: ").Append(Inventory).Append("\n");
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
      return this.Equals(input as InventoryResponse);
    }

    /// <summary>
    /// Returns true if InventoryResponse instances are equal
    /// </summary>
    /// <param name="input">Instance of InventoryResponse to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(InventoryResponse input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.Inventory == input.Inventory ||
              this.Inventory != null &&
              input.Inventory != null &&
              this.Inventory.SequenceEqual(input.Inventory)
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
        if (this.Inventory != null)
        {
          hashCode = (hashCode * 59) + this.Inventory.GetHashCode();
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