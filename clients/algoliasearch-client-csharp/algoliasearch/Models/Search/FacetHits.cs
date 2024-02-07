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
using Algolia.Search.Models.Common;
using Algolia.Search.Serializer;

namespace Algolia.Search.Models.Search;

/// <summary>
/// FacetHits
/// </summary>
[DataContract(Name = "facetHits")]
[JsonObject(MemberSerialization.OptOut)]
public partial class FacetHits
{
  /// <summary>
  /// Initializes a new instance of the FacetHits class.
  /// </summary>
  [JsonConstructor]
  public FacetHits() { }
  /// <summary>
  /// Initializes a new instance of the FacetHits class.
  /// </summary>
  /// <param name="value">Facet value. (required).</param>
  /// <param name="highlighted">Markup text with &#x60;facetQuery&#x60; matches highlighted. (required).</param>
  /// <param name="count">Number of records containing this facet value. This takes into account the extra search parameters specified in the query. Like for a regular search query, the [counts may not be exhaustive](https://support.algolia.com/hc/en-us/articles/4406975248145-Why-are-my-facet-and-hit-counts-not-accurate-). (required).</param>
  public FacetHits(string value, string highlighted, int count)
  {
    Value = value ?? throw new ArgumentNullException(nameof(value));
    Highlighted = highlighted ?? throw new ArgumentNullException(nameof(highlighted));
    Count = count;
  }

  /// <summary>
  /// Facet value.
  /// </summary>
  /// <value>Facet value.</value>
  [DataMember(Name = "value")]
  public string Value { get; set; }

  /// <summary>
  /// Markup text with `facetQuery` matches highlighted.
  /// </summary>
  /// <value>Markup text with `facetQuery` matches highlighted.</value>
  [DataMember(Name = "highlighted")]
  public string Highlighted { get; set; }

  /// <summary>
  /// Number of records containing this facet value. This takes into account the extra search parameters specified in the query. Like for a regular search query, the [counts may not be exhaustive](https://support.algolia.com/hc/en-us/articles/4406975248145-Why-are-my-facet-and-hit-counts-not-accurate-).
  /// </summary>
  /// <value>Number of records containing this facet value. This takes into account the extra search parameters specified in the query. Like for a regular search query, the [counts may not be exhaustive](https://support.algolia.com/hc/en-us/articles/4406975248145-Why-are-my-facet-and-hit-counts-not-accurate-).</value>
  [DataMember(Name = "count")]
  public int Count { get; set; }

  /// <summary>
  /// Returns the string presentation of the object
  /// </summary>
  /// <returns>String presentation of the object</returns>
  public override string ToString()
  {
    StringBuilder sb = new StringBuilder();
    sb.Append("class FacetHits {\n");
    sb.Append("  Value: ").Append(Value).Append("\n");
    sb.Append("  Highlighted: ").Append(Highlighted).Append("\n");
    sb.Append("  Count: ").Append(Count).Append("\n");
    sb.Append("}\n");
    return sb.ToString();
  }

  /// <summary>
  /// Returns the JSON string presentation of the object
  /// </summary>
  /// <returns>JSON string presentation of the object</returns>
  public virtual string ToJson()
  {
    return JsonConvert.SerializeObject(this, Formatting.Indented);
  }

}
