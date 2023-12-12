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

namespace Algolia.Search.Abtesting.Models
{
  /// <summary>
  /// ABTest
  /// </summary>
  [DataContract(Name = "ABTest")]
  public partial class ABTest : IEquatable<ABTest>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="ABTest" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected ABTest() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="ABTest" /> class.
    /// </summary>
    /// <param name="abTestID">Unique A/B test ID. (required).</param>
    /// <param name="clickSignificance">[A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on click data. A value of 0.95 or over is considered to be _significant_.  (required).</param>
    /// <param name="conversionSignificance">[A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on conversion. A value of 0.95 or over is considered to be _significant_.  (required).</param>
    /// <param name="addToCartSignificance">[A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on add-to-cart data. A value of 0.95 or over is considered to be _significant_.  (required).</param>
    /// <param name="purchaseSignificance">[A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on purchase data. A value of 0.95 or over is considered to be _significant_.  (required).</param>
    /// <param name="revenueSignificance">[A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on revenue data. A value of 0.95 or over is considered to be _significant_.  (required).</param>
    /// <param name="updatedAt">Update date timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format. (required).</param>
    /// <param name="createdAt">Creation date timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format. (required).</param>
    /// <param name="endAt">End date timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format. (required).</param>
    /// <param name="name">A/B test name. (required).</param>
    /// <param name="status">A/B test status. (required).</param>
    /// <param name="variants">A/B test variants. (required).</param>
    public ABTest(int abTestID = default(int), double clickSignificance = default(double), double conversionSignificance = default(double), double addToCartSignificance = default(double), double purchaseSignificance = default(double), Dictionary<string, double> revenueSignificance = default(Dictionary<string, double>), string updatedAt = default(string), string createdAt = default(string), string endAt = default(string), string name = default(string), string status = default(string), List<Variant> variants = default(List<Variant>))
    {
      this.AbTestID = abTestID;
      this.ClickSignificance = clickSignificance;
      this.ConversionSignificance = conversionSignificance;
      this.AddToCartSignificance = addToCartSignificance;
      this.PurchaseSignificance = purchaseSignificance;
      // to ensure "revenueSignificance" is required (not null)
      if (revenueSignificance == null)
      {
        throw new ArgumentNullException("revenueSignificance is a required property for ABTest and cannot be null");
      }
      this.RevenueSignificance = revenueSignificance;
      // to ensure "updatedAt" is required (not null)
      if (updatedAt == null)
      {
        throw new ArgumentNullException("updatedAt is a required property for ABTest and cannot be null");
      }
      this.UpdatedAt = updatedAt;
      // to ensure "createdAt" is required (not null)
      if (createdAt == null)
      {
        throw new ArgumentNullException("createdAt is a required property for ABTest and cannot be null");
      }
      this.CreatedAt = createdAt;
      // to ensure "endAt" is required (not null)
      if (endAt == null)
      {
        throw new ArgumentNullException("endAt is a required property for ABTest and cannot be null");
      }
      this.EndAt = endAt;
      // to ensure "name" is required (not null)
      if (name == null)
      {
        throw new ArgumentNullException("name is a required property for ABTest and cannot be null");
      }
      this.Name = name;
      // to ensure "status" is required (not null)
      if (status == null)
      {
        throw new ArgumentNullException("status is a required property for ABTest and cannot be null");
      }
      this.Status = status;
      // to ensure "variants" is required (not null)
      if (variants == null)
      {
        throw new ArgumentNullException("variants is a required property for ABTest and cannot be null");
      }
      this.Variants = variants;
    }

    /// <summary>
    /// Unique A/B test ID.
    /// </summary>
    /// <value>Unique A/B test ID.</value>
    [DataMember(Name = "abTestID", IsRequired = true, EmitDefaultValue = true)]
    public int AbTestID { get; set; }

    /// <summary>
    /// [A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on click data. A value of 0.95 or over is considered to be _significant_. 
    /// </summary>
    /// <value>[A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on click data. A value of 0.95 or over is considered to be _significant_. </value>
    [DataMember(Name = "clickSignificance", IsRequired = true, EmitDefaultValue = true)]
    public double ClickSignificance { get; set; }

    /// <summary>
    /// [A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on conversion. A value of 0.95 or over is considered to be _significant_. 
    /// </summary>
    /// <value>[A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on conversion. A value of 0.95 or over is considered to be _significant_. </value>
    [DataMember(Name = "conversionSignificance", IsRequired = true, EmitDefaultValue = true)]
    public double ConversionSignificance { get; set; }

    /// <summary>
    /// [A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on add-to-cart data. A value of 0.95 or over is considered to be _significant_. 
    /// </summary>
    /// <value>[A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on add-to-cart data. A value of 0.95 or over is considered to be _significant_. </value>
    [DataMember(Name = "addToCartSignificance", IsRequired = true, EmitDefaultValue = true)]
    public double AddToCartSignificance { get; set; }

    /// <summary>
    /// [A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on purchase data. A value of 0.95 or over is considered to be _significant_. 
    /// </summary>
    /// <value>[A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on purchase data. A value of 0.95 or over is considered to be _significant_. </value>
    [DataMember(Name = "purchaseSignificance", IsRequired = true, EmitDefaultValue = true)]
    public double PurchaseSignificance { get; set; }

    /// <summary>
    /// [A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on revenue data. A value of 0.95 or over is considered to be _significant_. 
    /// </summary>
    /// <value>[A/B test significance](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/in-depth/how-ab-test-scores-are-calculated/#statistical-significance-or-chance) based on revenue data. A value of 0.95 or over is considered to be _significant_. </value>
    [DataMember(Name = "revenueSignificance", IsRequired = true, EmitDefaultValue = true)]
    public Dictionary<string, double> RevenueSignificance { get; set; }

    /// <summary>
    /// Update date timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format.
    /// </summary>
    /// <value>Update date timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format.</value>
    [DataMember(Name = "updatedAt", IsRequired = true, EmitDefaultValue = true)]
    public string UpdatedAt { get; set; }

    /// <summary>
    /// Creation date timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format.
    /// </summary>
    /// <value>Creation date timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format.</value>
    [DataMember(Name = "createdAt", IsRequired = true, EmitDefaultValue = true)]
    public string CreatedAt { get; set; }

    /// <summary>
    /// End date timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format.
    /// </summary>
    /// <value>End date timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format.</value>
    [DataMember(Name = "endAt", IsRequired = true, EmitDefaultValue = true)]
    public string EndAt { get; set; }

    /// <summary>
    /// A/B test name.
    /// </summary>
    /// <value>A/B test name.</value>
    [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
    public string Name { get; set; }

    /// <summary>
    /// A/B test status.
    /// </summary>
    /// <value>A/B test status.</value>
    [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
    public string Status { get; set; }

    /// <summary>
    /// A/B test variants.
    /// </summary>
    /// <value>A/B test variants.</value>
    [DataMember(Name = "variants", IsRequired = true, EmitDefaultValue = true)]
    public List<Variant> Variants { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class ABTest {\n");
      sb.Append("  AbTestID: ").Append(AbTestID).Append("\n");
      sb.Append("  ClickSignificance: ").Append(ClickSignificance).Append("\n");
      sb.Append("  ConversionSignificance: ").Append(ConversionSignificance).Append("\n");
      sb.Append("  AddToCartSignificance: ").Append(AddToCartSignificance).Append("\n");
      sb.Append("  PurchaseSignificance: ").Append(PurchaseSignificance).Append("\n");
      sb.Append("  RevenueSignificance: ").Append(RevenueSignificance).Append("\n");
      sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
      sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
      sb.Append("  EndAt: ").Append(EndAt).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
      sb.Append("  Variants: ").Append(Variants).Append("\n");
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
      return this.Equals(input as ABTest);
    }

    /// <summary>
    /// Returns true if ABTest instances are equal
    /// </summary>
    /// <param name="input">Instance of ABTest to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(ABTest input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.AbTestID == input.AbTestID ||
              this.AbTestID.Equals(input.AbTestID)
          ) &&
          (
              this.ClickSignificance == input.ClickSignificance ||
              this.ClickSignificance.Equals(input.ClickSignificance)
          ) &&
          (
              this.ConversionSignificance == input.ConversionSignificance ||
              this.ConversionSignificance.Equals(input.ConversionSignificance)
          ) &&
          (
              this.AddToCartSignificance == input.AddToCartSignificance ||
              this.AddToCartSignificance.Equals(input.AddToCartSignificance)
          ) &&
          (
              this.PurchaseSignificance == input.PurchaseSignificance ||
              this.PurchaseSignificance.Equals(input.PurchaseSignificance)
          ) &&
          (
              this.RevenueSignificance == input.RevenueSignificance ||
              this.RevenueSignificance != null &&
              input.RevenueSignificance != null &&
              this.RevenueSignificance.SequenceEqual(input.RevenueSignificance)
          ) &&
          (
              this.UpdatedAt == input.UpdatedAt ||
              (this.UpdatedAt != null &&
              this.UpdatedAt.Equals(input.UpdatedAt))
          ) &&
          (
              this.CreatedAt == input.CreatedAt ||
              (this.CreatedAt != null &&
              this.CreatedAt.Equals(input.CreatedAt))
          ) &&
          (
              this.EndAt == input.EndAt ||
              (this.EndAt != null &&
              this.EndAt.Equals(input.EndAt))
          ) &&
          (
              this.Name == input.Name ||
              (this.Name != null &&
              this.Name.Equals(input.Name))
          ) &&
          (
              this.Status == input.Status ||
              (this.Status != null &&
              this.Status.Equals(input.Status))
          ) &&
          (
              this.Variants == input.Variants ||
              this.Variants != null &&
              input.Variants != null &&
              this.Variants.SequenceEqual(input.Variants)
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
        hashCode = (hashCode * 59) + this.AbTestID.GetHashCode();
        hashCode = (hashCode * 59) + this.ClickSignificance.GetHashCode();
        hashCode = (hashCode * 59) + this.ConversionSignificance.GetHashCode();
        hashCode = (hashCode * 59) + this.AddToCartSignificance.GetHashCode();
        hashCode = (hashCode * 59) + this.PurchaseSignificance.GetHashCode();
        if (this.RevenueSignificance != null)
        {
          hashCode = (hashCode * 59) + this.RevenueSignificance.GetHashCode();
        }
        if (this.UpdatedAt != null)
        {
          hashCode = (hashCode * 59) + this.UpdatedAt.GetHashCode();
        }
        if (this.CreatedAt != null)
        {
          hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
        }
        if (this.EndAt != null)
        {
          hashCode = (hashCode * 59) + this.EndAt.GetHashCode();
        }
        if (this.Name != null)
        {
          hashCode = (hashCode * 59) + this.Name.GetHashCode();
        }
        if (this.Status != null)
        {
          hashCode = (hashCode * 59) + this.Status.GetHashCode();
        }
        if (this.Variants != null)
        {
          hashCode = (hashCode * 59) + this.Variants.GetHashCode();
        }
        return hashCode;
      }
    }

  }

}
