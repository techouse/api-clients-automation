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

namespace Algolia.Search.Ingestion.Models
{
  /// <summary>
  /// Pagination
  /// </summary>
  [DataContract(Name = "Pagination")]
  public partial class Pagination : IEquatable<Pagination>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="Pagination" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected Pagination() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="Pagination" /> class.
    /// </summary>
    /// <param name="nbPages">nbPages (required).</param>
    /// <param name="page">page (required).</param>
    /// <param name="nbItems">nbItems (required).</param>
    /// <param name="itemsPerPage">itemsPerPage (required).</param>
    public Pagination(int nbPages = default(int), int page = default(int), int nbItems = default(int), int itemsPerPage = default(int))
    {
      this.NbPages = nbPages;
      this.Page = page;
      this.NbItems = nbItems;
      this.ItemsPerPage = itemsPerPage;
    }

    /// <summary>
    /// Gets or Sets NbPages
    /// </summary>
    [DataMember(Name = "nbPages", IsRequired = true, EmitDefaultValue = true)]
    public int NbPages { get; set; }

    /// <summary>
    /// Gets or Sets Page
    /// </summary>
    [DataMember(Name = "page", IsRequired = true, EmitDefaultValue = true)]
    public int Page { get; set; }

    /// <summary>
    /// Gets or Sets NbItems
    /// </summary>
    [DataMember(Name = "nbItems", IsRequired = true, EmitDefaultValue = true)]
    public int NbItems { get; set; }

    /// <summary>
    /// Gets or Sets ItemsPerPage
    /// </summary>
    [DataMember(Name = "itemsPerPage", IsRequired = true, EmitDefaultValue = true)]
    public int ItemsPerPage { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class Pagination {\n");
      sb.Append("  NbPages: ").Append(NbPages).Append("\n");
      sb.Append("  Page: ").Append(Page).Append("\n");
      sb.Append("  NbItems: ").Append(NbItems).Append("\n");
      sb.Append("  ItemsPerPage: ").Append(ItemsPerPage).Append("\n");
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
      return this.Equals(input as Pagination);
    }

    /// <summary>
    /// Returns true if Pagination instances are equal
    /// </summary>
    /// <param name="input">Instance of Pagination to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(Pagination input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.NbPages == input.NbPages ||
              this.NbPages.Equals(input.NbPages)
          ) &&
          (
              this.Page == input.Page ||
              this.Page.Equals(input.Page)
          ) &&
          (
              this.NbItems == input.NbItems ||
              this.NbItems.Equals(input.NbItems)
          ) &&
          (
              this.ItemsPerPage == input.ItemsPerPage ||
              this.ItemsPerPage.Equals(input.ItemsPerPage)
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
        hashCode = (hashCode * 59) + this.NbPages.GetHashCode();
        hashCode = (hashCode * 59) + this.Page.GetHashCode();
        hashCode = (hashCode * 59) + this.NbItems.GetHashCode();
        hashCode = (hashCode * 59) + this.ItemsPerPage.GetHashCode();
        return hashCode;
      }
    }

  }

}
