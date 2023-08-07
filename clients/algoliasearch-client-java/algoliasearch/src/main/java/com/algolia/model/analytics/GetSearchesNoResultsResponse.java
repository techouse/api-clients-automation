// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.analytics;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GetSearchesNoResultsResponse */
public class GetSearchesNoResultsResponse {

  @JsonProperty("searches")
  private List<SearchNoResultEvent> searches = new ArrayList<>();

  public GetSearchesNoResultsResponse setSearches(List<SearchNoResultEvent> searches) {
    this.searches = searches;
    return this;
  }

  public GetSearchesNoResultsResponse addSearches(SearchNoResultEvent searchesItem) {
    this.searches.add(searchesItem);
    return this;
  }

  /**
   * Searches with no results.
   *
   * @return searches
   */
  @javax.annotation.Nonnull
  public List<SearchNoResultEvent> getSearches() {
    return searches;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSearchesNoResultsResponse getSearchesNoResultsResponse = (GetSearchesNoResultsResponse) o;
    return Objects.equals(this.searches, getSearchesNoResultsResponse.searches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSearchesNoResultsResponse {\n");
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}