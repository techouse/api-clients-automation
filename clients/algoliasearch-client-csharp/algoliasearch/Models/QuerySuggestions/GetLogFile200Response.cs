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

namespace Algolia.Search.Models.QuerySuggestions;

/// <summary>
/// GetLogFile200Response
/// </summary>
[DataContract(Name = "getLogFile_200_response")]
[JsonObject(MemberSerialization.OptOut)]
public partial class GetLogFile200Response
{

  /// <summary>
  /// Gets or Sets Level
  /// </summary>
  [DataMember(Name = "level")]
  public LogLevel? Level { get; set; }
  /// <summary>
  /// Initializes a new instance of the GetLogFile200Response class.
  /// </summary>
  public GetLogFile200Response()
  {
  }

  /// <summary>
  /// Timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format.
  /// </summary>
  /// <value>Timestamp in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format.</value>
  [DataMember(Name = "timestamp")]
  public string? Timestamp { get; set; }

  /// <summary>
  /// Details about this log entry.
  /// </summary>
  /// <value>Details about this log entry.</value>
  [DataMember(Name = "message")]
  public string? Message { get; set; }

  /// <summary>
  /// Level indicating the position of a suggestion in a hierarchy of records.   For example, a `contextLevel` of 1 indicates that this suggestion belongs to a previous suggestion with `contextLevel` 0. 
  /// </summary>
  /// <value>Level indicating the position of a suggestion in a hierarchy of records.   For example, a `contextLevel` of 1 indicates that this suggestion belongs to a previous suggestion with `contextLevel` 0. </value>
  [DataMember(Name = "contextLevel")]
  public int? ContextLevel { get; set; }

  /// <summary>
  /// Returns the string presentation of the object
  /// </summary>
  /// <returns>String presentation of the object</returns>
  public override string ToString()
  {
    StringBuilder sb = new StringBuilder();
    sb.Append("class GetLogFile200Response {\n");
    sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
    sb.Append("  Level: ").Append(Level).Append("\n");
    sb.Append("  Message: ").Append(Message).Append("\n");
    sb.Append("  ContextLevel: ").Append(ContextLevel).Append("\n");
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
