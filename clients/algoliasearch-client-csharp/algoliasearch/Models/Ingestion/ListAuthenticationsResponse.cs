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

namespace Algolia.Search.Models.Ingestion;

/// <summary>
/// ListAuthenticationsResponse
/// </summary>
[DataContract(Name = "listAuthenticationsResponse")]
[JsonObject(MemberSerialization.OptOut)]
public partial class ListAuthenticationsResponse
{
  /// <summary>
  /// Initializes a new instance of the ListAuthenticationsResponse class.
  /// </summary>
  [JsonConstructor]
  public ListAuthenticationsResponse() { }
  /// <summary>
  /// Initializes a new instance of the ListAuthenticationsResponse class.
  /// </summary>
  /// <param name="authentications">authentications (required).</param>
  /// <param name="pagination">pagination (required).</param>
  public ListAuthenticationsResponse(List<Authentication> authentications, Pagination pagination)
  {
    Authentications = authentications ?? throw new ArgumentNullException(nameof(authentications));
    Pagination = pagination ?? throw new ArgumentNullException(nameof(pagination));
  }

  /// <summary>
  /// Gets or Sets Authentications
  /// </summary>
  [DataMember(Name = "authentications")]
  public List<Authentication> Authentications { get; set; }

  /// <summary>
  /// Gets or Sets Pagination
  /// </summary>
  [DataMember(Name = "pagination")]
  public Pagination Pagination { get; set; }

  /// <summary>
  /// Returns the string presentation of the object
  /// </summary>
  /// <returns>String presentation of the object</returns>
  public override string ToString()
  {
    StringBuilder sb = new StringBuilder();
    sb.Append("class ListAuthenticationsResponse {\n");
    sb.Append("  Authentications: ").Append(Authentications).Append("\n");
    sb.Append("  Pagination: ").Append(Pagination).Append("\n");
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
