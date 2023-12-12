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

namespace Algolia.Search.Recommend.Models
{
  /// <summary>
  /// SearchParamsQuery
  /// </summary>
  [DataContract(Name = "searchParamsQuery")]
  public partial class SearchParamsQuery : IEquatable<SearchParamsQuery>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="SearchParamsQuery" /> class.
    /// </summary>
    /// <param name="query">Text to search for in an index. (default to &quot;&quot;).</param>
    public SearchParamsQuery(string query = @"")
    {
      // use default value if no "query" provided
      this.Query = query ?? @"";
    }

    /// <summary>
    /// Text to search for in an index.
    /// </summary>
    /// <value>Text to search for in an index.</value>
    [DataMember(Name = "query", EmitDefaultValue = false)]
    public string Query { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class SearchParamsQuery {\n");
      sb.Append("  Query: ").Append(Query).Append("\n");
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
      return this.Equals(input as SearchParamsQuery);
    }

    /// <summary>
    /// Returns true if SearchParamsQuery instances are equal
    /// </summary>
    /// <param name="input">Instance of SearchParamsQuery to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(SearchParamsQuery input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.Query == input.Query ||
              (this.Query != null &&
              this.Query.Equals(input.Query))
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
        if (this.Query != null)
        {
          hashCode = (hashCode * 59) + this.Query.GetHashCode();
        }
        return hashCode;
      }
    }

  }

}
