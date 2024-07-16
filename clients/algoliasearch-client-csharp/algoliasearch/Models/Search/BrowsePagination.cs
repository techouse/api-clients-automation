//
// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
//
using System;
using System.Text;
using System.Linq;
using System.Text.Json.Serialization;
using System.Collections.Generic;
using Algolia.Search.Serializer;
using System.Text.Json;

namespace Algolia.Search.Models.Search;

/// <summary>
/// BrowsePagination
/// </summary>
public partial class BrowsePagination
{
  /// <summary>
  /// Initializes a new instance of the BrowsePagination class.
  /// </summary>
  public BrowsePagination()
  {
  }

  /// <summary>
  /// Page of search results to retrieve.
  /// </summary>
  /// <value>Page of search results to retrieve.</value>
  [JsonPropertyName("page")]
  public int? Page { get; set; }

  /// <summary>
  /// Number of results (hits).
  /// </summary>
  /// <value>Number of results (hits).</value>
  [JsonPropertyName("nbHits")]
  public int? NbHits { get; set; }

  /// <summary>
  /// Number of pages of results.
  /// </summary>
  /// <value>Number of pages of results.</value>
  [JsonPropertyName("nbPages")]
  public int? NbPages { get; set; }

  /// <summary>
  /// Number of hits per page.
  /// </summary>
  /// <value>Number of hits per page.</value>
  [JsonPropertyName("hitsPerPage")]
  public int? HitsPerPage { get; set; }

  /// <summary>
  /// Returns the string presentation of the object
  /// </summary>
  /// <returns>String presentation of the object</returns>
  public override string ToString()
  {
    StringBuilder sb = new StringBuilder();
    sb.Append("class BrowsePagination {\n");
    sb.Append("  Page: ").Append(Page).Append("\n");
    sb.Append("  NbHits: ").Append(NbHits).Append("\n");
    sb.Append("  NbPages: ").Append(NbPages).Append("\n");
    sb.Append("  HitsPerPage: ").Append(HitsPerPage).Append("\n");
    sb.Append("}\n");
    return sb.ToString();
  }

  /// <summary>
  /// Returns the JSON string presentation of the object
  /// </summary>
  /// <returns>JSON string presentation of the object</returns>
  public virtual string ToJson()
  {
    return JsonSerializer.Serialize(this, JsonConfig.Options);
  }

  /// <summary>
  /// Returns true if objects are equal
  /// </summary>
  /// <param name="obj">Object to be compared</param>
  /// <returns>Boolean</returns>
  public override bool Equals(object obj)
  {
    if (obj is not BrowsePagination input)
    {
      return false;
    }

    return
        (Page == input.Page || Page.Equals(input.Page)) &&
        (NbHits == input.NbHits || NbHits.Equals(input.NbHits)) &&
        (NbPages == input.NbPages || NbPages.Equals(input.NbPages)) &&
        (HitsPerPage == input.HitsPerPage || HitsPerPage.Equals(input.HitsPerPage));
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
      hashCode = (hashCode * 59) + Page.GetHashCode();
      hashCode = (hashCode * 59) + NbHits.GetHashCode();
      hashCode = (hashCode * 59) + NbPages.GetHashCode();
      hashCode = (hashCode * 59) + HitsPerPage.GetHashCode();
      return hashCode;
    }
  }

}

