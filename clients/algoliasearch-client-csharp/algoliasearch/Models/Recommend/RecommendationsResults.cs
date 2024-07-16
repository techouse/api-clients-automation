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

namespace Algolia.Search.Models.Recommend;

/// <summary>
/// RecommendationsResults
/// </summary>
public partial class RecommendationsResults
{
  /// <summary>
  /// Initializes a new instance of the RecommendationsResults class.
  /// </summary>
  [JsonConstructor]
  public RecommendationsResults() { }
  /// <summary>
  /// Initializes a new instance of the RecommendationsResults class.
  /// </summary>
  /// <param name="processingTimeMS">Time the server took to process the request, in milliseconds. (required).</param>
  /// <param name="page">Page of search results to retrieve. (required) (default to 0).</param>
  /// <param name="nbHits">Number of results (hits). (required).</param>
  /// <param name="nbPages">Number of pages of results. (required).</param>
  /// <param name="hitsPerPage">Number of hits per page. (required) (default to 20).</param>
  /// <param name="hits">hits (required).</param>
  public RecommendationsResults(int processingTimeMS, int page, int nbHits, int nbPages, int hitsPerPage, List<RecommendationsHit> hits)
  {
    ProcessingTimeMS = processingTimeMS;
    Page = page;
    NbHits = nbHits;
    NbPages = nbPages;
    HitsPerPage = hitsPerPage;
    Hits = hits ?? throw new ArgumentNullException(nameof(hits));
  }

  /// <summary>
  /// A/B test ID. This is only included in the response for indices that are part of an A/B test.
  /// </summary>
  /// <value>A/B test ID. This is only included in the response for indices that are part of an A/B test.</value>
  [JsonPropertyName("abTestID")]
  public int? AbTestID { get; set; }

  /// <summary>
  /// Variant ID. This is only included in the response for indices that are part of an A/B test.
  /// </summary>
  /// <value>Variant ID. This is only included in the response for indices that are part of an A/B test.</value>
  [JsonPropertyName("abTestVariantID")]
  public int? AbTestVariantID { get; set; }

  /// <summary>
  /// Computed geographical location.
  /// </summary>
  /// <value>Computed geographical location.</value>
  [JsonPropertyName("aroundLatLng")]
  public string AroundLatLng { get; set; }

  /// <summary>
  /// Distance from a central coordinate provided by `aroundLatLng`.
  /// </summary>
  /// <value>Distance from a central coordinate provided by `aroundLatLng`.</value>
  [JsonPropertyName("automaticRadius")]
  public string AutomaticRadius { get; set; }

  /// <summary>
  /// Gets or Sets Exhaustive
  /// </summary>
  [JsonPropertyName("exhaustive")]
  public Exhaustive Exhaustive { get; set; }

  /// <summary>
  /// See the `facetsCount` field of the `exhaustive` object in the response.
  /// </summary>
  /// <value>See the `facetsCount` field of the `exhaustive` object in the response.</value>
  [JsonPropertyName("exhaustiveFacetsCount")]
  [Obsolete]
  public bool? ExhaustiveFacetsCount { get; set; }

  /// <summary>
  /// See the `nbHits` field of the `exhaustive` object in the response.
  /// </summary>
  /// <value>See the `nbHits` field of the `exhaustive` object in the response.</value>
  [JsonPropertyName("exhaustiveNbHits")]
  [Obsolete]
  public bool? ExhaustiveNbHits { get; set; }

  /// <summary>
  /// See the `typo` field of the `exhaustive` object in the response.
  /// </summary>
  /// <value>See the `typo` field of the `exhaustive` object in the response.</value>
  [JsonPropertyName("exhaustiveTypo")]
  [Obsolete]
  public bool? ExhaustiveTypo { get; set; }

  /// <summary>
  /// Facet counts.
  /// </summary>
  /// <value>Facet counts.</value>
  [JsonPropertyName("facets")]
  public Dictionary<string, Dictionary<string, int>> Facets { get; set; }

  /// <summary>
  /// Statistics for numerical facets.
  /// </summary>
  /// <value>Statistics for numerical facets.</value>
  [JsonPropertyName("facets_stats")]
  public Dictionary<string, FacetsStats> FacetsStats { get; set; }

  /// <summary>
  /// Index name used for the query.
  /// </summary>
  /// <value>Index name used for the query.</value>
  [JsonPropertyName("index")]
  public string Index { get; set; }

  /// <summary>
  /// Index name used for the query. During A/B testing, the targeted index isn't always the index used by the query.
  /// </summary>
  /// <value>Index name used for the query. During A/B testing, the targeted index isn't always the index used by the query.</value>
  [JsonPropertyName("indexUsed")]
  public string IndexUsed { get; set; }

  /// <summary>
  /// Warnings about the query.
  /// </summary>
  /// <value>Warnings about the query.</value>
  [JsonPropertyName("message")]
  public string Message { get; set; }

  /// <summary>
  /// Number of hits selected and sorted by the relevant sort algorithm.
  /// </summary>
  /// <value>Number of hits selected and sorted by the relevant sort algorithm.</value>
  [JsonPropertyName("nbSortedHits")]
  public int? NbSortedHits { get; set; }

  /// <summary>
  /// Post-[normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/#what-does-normalization-mean) query string that will be searched.
  /// </summary>
  /// <value>Post-[normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/#what-does-normalization-mean) query string that will be searched.</value>
  [JsonPropertyName("parsedQuery")]
  public string ParsedQuery { get; set; }

  /// <summary>
  /// Time the server took to process the request, in milliseconds.
  /// </summary>
  /// <value>Time the server took to process the request, in milliseconds.</value>
  [JsonPropertyName("processingTimeMS")]
  public int ProcessingTimeMS { get; set; }

  /// <summary>
  /// Experimental. List of processing steps and their times, in milliseconds. You can use this list to investigate performance issues.
  /// </summary>
  /// <value>Experimental. List of processing steps and their times, in milliseconds. You can use this list to investigate performance issues.</value>
  [JsonPropertyName("processingTimingsMS")]
  public object ProcessingTimingsMS { get; set; }

  /// <summary>
  /// Markup text indicating which parts of the original query have been removed to retrieve a non-empty result set.
  /// </summary>
  /// <value>Markup text indicating which parts of the original query have been removed to retrieve a non-empty result set.</value>
  [JsonPropertyName("queryAfterRemoval")]
  public string QueryAfterRemoval { get; set; }

  /// <summary>
  /// Gets or Sets Redirect
  /// </summary>
  [JsonPropertyName("redirect")]
  public Redirect Redirect { get; set; }

  /// <summary>
  /// Gets or Sets RenderingContent
  /// </summary>
  [JsonPropertyName("renderingContent")]
  public RenderingContent RenderingContent { get; set; }

  /// <summary>
  /// Time the server took to process the request, in milliseconds.
  /// </summary>
  /// <value>Time the server took to process the request, in milliseconds.</value>
  [JsonPropertyName("serverTimeMS")]
  public int? ServerTimeMS { get; set; }

  /// <summary>
  /// Host name of the server that processed the request.
  /// </summary>
  /// <value>Host name of the server that processed the request.</value>
  [JsonPropertyName("serverUsed")]
  public string ServerUsed { get; set; }

  /// <summary>
  /// An object with custom data.  You can store up to 32kB as custom data. 
  /// </summary>
  /// <value>An object with custom data.  You can store up to 32kB as custom data. </value>
  [JsonPropertyName("userData")]
  public object UserData { get; set; }

  /// <summary>
  /// Unique identifier for the query. This is used for [click analytics](https://www.algolia.com/doc/guides/analytics/click-analytics/).
  /// </summary>
  /// <value>Unique identifier for the query. This is used for [click analytics](https://www.algolia.com/doc/guides/analytics/click-analytics/).</value>
  [JsonPropertyName("queryID")]
  public string QueryID { get; set; }

  /// <summary>
  /// Page of search results to retrieve.
  /// </summary>
  /// <value>Page of search results to retrieve.</value>
  [JsonPropertyName("page")]
  public int Page { get; set; }

  /// <summary>
  /// Number of results (hits).
  /// </summary>
  /// <value>Number of results (hits).</value>
  [JsonPropertyName("nbHits")]
  public int NbHits { get; set; }

  /// <summary>
  /// Number of pages of results.
  /// </summary>
  /// <value>Number of pages of results.</value>
  [JsonPropertyName("nbPages")]
  public int NbPages { get; set; }

  /// <summary>
  /// Number of hits per page.
  /// </summary>
  /// <value>Number of hits per page.</value>
  [JsonPropertyName("hitsPerPage")]
  public int HitsPerPage { get; set; }

  /// <summary>
  /// Gets or Sets Hits
  /// </summary>
  [JsonPropertyName("hits")]
  public List<RecommendationsHit> Hits { get; set; }

  /// <summary>
  /// Returns the string presentation of the object
  /// </summary>
  /// <returns>String presentation of the object</returns>
  public override string ToString()
  {
    StringBuilder sb = new StringBuilder();
    sb.Append("class RecommendationsResults {\n");
    sb.Append("  AbTestID: ").Append(AbTestID).Append("\n");
    sb.Append("  AbTestVariantID: ").Append(AbTestVariantID).Append("\n");
    sb.Append("  AroundLatLng: ").Append(AroundLatLng).Append("\n");
    sb.Append("  AutomaticRadius: ").Append(AutomaticRadius).Append("\n");
    sb.Append("  Exhaustive: ").Append(Exhaustive).Append("\n");
    sb.Append("  ExhaustiveFacetsCount: ").Append(ExhaustiveFacetsCount).Append("\n");
    sb.Append("  ExhaustiveNbHits: ").Append(ExhaustiveNbHits).Append("\n");
    sb.Append("  ExhaustiveTypo: ").Append(ExhaustiveTypo).Append("\n");
    sb.Append("  Facets: ").Append(Facets).Append("\n");
    sb.Append("  FacetsStats: ").Append(FacetsStats).Append("\n");
    sb.Append("  Index: ").Append(Index).Append("\n");
    sb.Append("  IndexUsed: ").Append(IndexUsed).Append("\n");
    sb.Append("  Message: ").Append(Message).Append("\n");
    sb.Append("  NbSortedHits: ").Append(NbSortedHits).Append("\n");
    sb.Append("  ParsedQuery: ").Append(ParsedQuery).Append("\n");
    sb.Append("  ProcessingTimeMS: ").Append(ProcessingTimeMS).Append("\n");
    sb.Append("  ProcessingTimingsMS: ").Append(ProcessingTimingsMS).Append("\n");
    sb.Append("  QueryAfterRemoval: ").Append(QueryAfterRemoval).Append("\n");
    sb.Append("  Redirect: ").Append(Redirect).Append("\n");
    sb.Append("  RenderingContent: ").Append(RenderingContent).Append("\n");
    sb.Append("  ServerTimeMS: ").Append(ServerTimeMS).Append("\n");
    sb.Append("  ServerUsed: ").Append(ServerUsed).Append("\n");
    sb.Append("  UserData: ").Append(UserData).Append("\n");
    sb.Append("  QueryID: ").Append(QueryID).Append("\n");
    sb.Append("  Page: ").Append(Page).Append("\n");
    sb.Append("  NbHits: ").Append(NbHits).Append("\n");
    sb.Append("  NbPages: ").Append(NbPages).Append("\n");
    sb.Append("  HitsPerPage: ").Append(HitsPerPage).Append("\n");
    sb.Append("  Hits: ").Append(Hits).Append("\n");
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
    if (obj is not RecommendationsResults input)
    {
      return false;
    }

    return
        (AbTestID == input.AbTestID || AbTestID.Equals(input.AbTestID)) &&
        (AbTestVariantID == input.AbTestVariantID || AbTestVariantID.Equals(input.AbTestVariantID)) &&
        (AroundLatLng == input.AroundLatLng || (AroundLatLng != null && AroundLatLng.Equals(input.AroundLatLng))) &&
        (AutomaticRadius == input.AutomaticRadius || (AutomaticRadius != null && AutomaticRadius.Equals(input.AutomaticRadius))) &&
        (Exhaustive == input.Exhaustive || (Exhaustive != null && Exhaustive.Equals(input.Exhaustive))) &&
        (ExhaustiveFacetsCount == input.ExhaustiveFacetsCount || ExhaustiveFacetsCount.Equals(input.ExhaustiveFacetsCount)) &&
        (ExhaustiveNbHits == input.ExhaustiveNbHits || ExhaustiveNbHits.Equals(input.ExhaustiveNbHits)) &&
        (ExhaustiveTypo == input.ExhaustiveTypo || ExhaustiveTypo.Equals(input.ExhaustiveTypo)) &&
        (Facets == input.Facets || Facets != null && input.Facets != null && Facets.SequenceEqual(input.Facets)) &&
        (FacetsStats == input.FacetsStats || FacetsStats != null && input.FacetsStats != null && FacetsStats.SequenceEqual(input.FacetsStats)) &&
        (Index == input.Index || (Index != null && Index.Equals(input.Index))) &&
        (IndexUsed == input.IndexUsed || (IndexUsed != null && IndexUsed.Equals(input.IndexUsed))) &&
        (Message == input.Message || (Message != null && Message.Equals(input.Message))) &&
        (NbSortedHits == input.NbSortedHits || NbSortedHits.Equals(input.NbSortedHits)) &&
        (ParsedQuery == input.ParsedQuery || (ParsedQuery != null && ParsedQuery.Equals(input.ParsedQuery))) &&
        (ProcessingTimeMS == input.ProcessingTimeMS || ProcessingTimeMS.Equals(input.ProcessingTimeMS)) &&
        (ProcessingTimingsMS == input.ProcessingTimingsMS || (ProcessingTimingsMS != null && ProcessingTimingsMS.Equals(input.ProcessingTimingsMS))) &&
        (QueryAfterRemoval == input.QueryAfterRemoval || (QueryAfterRemoval != null && QueryAfterRemoval.Equals(input.QueryAfterRemoval))) &&
        (Redirect == input.Redirect || (Redirect != null && Redirect.Equals(input.Redirect))) &&
        (RenderingContent == input.RenderingContent || (RenderingContent != null && RenderingContent.Equals(input.RenderingContent))) &&
        (ServerTimeMS == input.ServerTimeMS || ServerTimeMS.Equals(input.ServerTimeMS)) &&
        (ServerUsed == input.ServerUsed || (ServerUsed != null && ServerUsed.Equals(input.ServerUsed))) &&
        (UserData == input.UserData || (UserData != null && UserData.Equals(input.UserData))) &&
        (QueryID == input.QueryID || (QueryID != null && QueryID.Equals(input.QueryID))) &&
        (Page == input.Page || Page.Equals(input.Page)) &&
        (NbHits == input.NbHits || NbHits.Equals(input.NbHits)) &&
        (NbPages == input.NbPages || NbPages.Equals(input.NbPages)) &&
        (HitsPerPage == input.HitsPerPage || HitsPerPage.Equals(input.HitsPerPage)) &&
        (Hits == input.Hits || Hits != null && input.Hits != null && Hits.SequenceEqual(input.Hits));
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
      hashCode = (hashCode * 59) + AbTestID.GetHashCode();
      hashCode = (hashCode * 59) + AbTestVariantID.GetHashCode();
      if (AroundLatLng != null)
      {
        hashCode = (hashCode * 59) + AroundLatLng.GetHashCode();
      }
      if (AutomaticRadius != null)
      {
        hashCode = (hashCode * 59) + AutomaticRadius.GetHashCode();
      }
      if (Exhaustive != null)
      {
        hashCode = (hashCode * 59) + Exhaustive.GetHashCode();
      }
      hashCode = (hashCode * 59) + ExhaustiveFacetsCount.GetHashCode();
      hashCode = (hashCode * 59) + ExhaustiveNbHits.GetHashCode();
      hashCode = (hashCode * 59) + ExhaustiveTypo.GetHashCode();
      if (Facets != null)
      {
        hashCode = (hashCode * 59) + Facets.GetHashCode();
      }
      if (FacetsStats != null)
      {
        hashCode = (hashCode * 59) + FacetsStats.GetHashCode();
      }
      if (Index != null)
      {
        hashCode = (hashCode * 59) + Index.GetHashCode();
      }
      if (IndexUsed != null)
      {
        hashCode = (hashCode * 59) + IndexUsed.GetHashCode();
      }
      if (Message != null)
      {
        hashCode = (hashCode * 59) + Message.GetHashCode();
      }
      hashCode = (hashCode * 59) + NbSortedHits.GetHashCode();
      if (ParsedQuery != null)
      {
        hashCode = (hashCode * 59) + ParsedQuery.GetHashCode();
      }
      hashCode = (hashCode * 59) + ProcessingTimeMS.GetHashCode();
      if (ProcessingTimingsMS != null)
      {
        hashCode = (hashCode * 59) + ProcessingTimingsMS.GetHashCode();
      }
      if (QueryAfterRemoval != null)
      {
        hashCode = (hashCode * 59) + QueryAfterRemoval.GetHashCode();
      }
      if (Redirect != null)
      {
        hashCode = (hashCode * 59) + Redirect.GetHashCode();
      }
      if (RenderingContent != null)
      {
        hashCode = (hashCode * 59) + RenderingContent.GetHashCode();
      }
      hashCode = (hashCode * 59) + ServerTimeMS.GetHashCode();
      if (ServerUsed != null)
      {
        hashCode = (hashCode * 59) + ServerUsed.GetHashCode();
      }
      if (UserData != null)
      {
        hashCode = (hashCode * 59) + UserData.GetHashCode();
      }
      if (QueryID != null)
      {
        hashCode = (hashCode * 59) + QueryID.GetHashCode();
      }
      hashCode = (hashCode * 59) + Page.GetHashCode();
      hashCode = (hashCode * 59) + NbHits.GetHashCode();
      hashCode = (hashCode * 59) + NbPages.GetHashCode();
      hashCode = (hashCode * 59) + HitsPerPage.GetHashCode();
      if (Hits != null)
      {
        hashCode = (hashCode * 59) + Hits.GetHashCode();
      }
      return hashCode;
    }
  }

}

