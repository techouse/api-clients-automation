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
  /// Personalization
  /// </summary>
  [DataContract(Name = "personalization")]
  public partial class Personalization : IEquatable<Personalization>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="Personalization" /> class.
    /// </summary>
    /// <param name="filtersScore">The score of the filters..</param>
    /// <param name="rankingScore">The score of the ranking..</param>
    /// <param name="score">The score of the event..</param>
    public Personalization(int filtersScore = default(int), int rankingScore = default(int), int score = default(int))
    {
      this.FiltersScore = filtersScore;
      this.RankingScore = rankingScore;
      this.Score = score;
    }

    /// <summary>
    /// The score of the filters.
    /// </summary>
    /// <value>The score of the filters.</value>
    [DataMember(Name = "filtersScore", EmitDefaultValue = false)]
    public int FiltersScore { get; set; }

    /// <summary>
    /// The score of the ranking.
    /// </summary>
    /// <value>The score of the ranking.</value>
    [DataMember(Name = "rankingScore", EmitDefaultValue = false)]
    public int RankingScore { get; set; }

    /// <summary>
    /// The score of the event.
    /// </summary>
    /// <value>The score of the event.</value>
    [DataMember(Name = "score", EmitDefaultValue = false)]
    public int Score { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class Personalization {\n");
      sb.Append("  FiltersScore: ").Append(FiltersScore).Append("\n");
      sb.Append("  RankingScore: ").Append(RankingScore).Append("\n");
      sb.Append("  Score: ").Append(Score).Append("\n");
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
      return this.Equals(input as Personalization);
    }

    /// <summary>
    /// Returns true if Personalization instances are equal
    /// </summary>
    /// <param name="input">Instance of Personalization to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(Personalization input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.FiltersScore == input.FiltersScore ||
              this.FiltersScore.Equals(input.FiltersScore)
          ) &&
          (
              this.RankingScore == input.RankingScore ||
              this.RankingScore.Equals(input.RankingScore)
          ) &&
          (
              this.Score == input.Score ||
              this.Score.Equals(input.Score)
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
        hashCode = (hashCode * 59) + this.FiltersScore.GetHashCode();
        hashCode = (hashCode * 59) + this.RankingScore.GetHashCode();
        hashCode = (hashCode * 59) + this.Score.GetHashCode();
        return hashCode;
      }
    }

  }

}
