// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.search;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** BrowsePagination */
public class BrowsePagination {

  @JsonProperty("page")
  private Integer page;

  @JsonProperty("nbHits")
  private Integer nbHits;

  @JsonProperty("nbPages")
  private Integer nbPages;

  @JsonProperty("hitsPerPage")
  private Integer hitsPerPage;

  public BrowsePagination setPage(Integer page) {
    this.page = page;
    return this;
  }

  /** Page of search results to retrieve. minimum: 0 */
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }

  public BrowsePagination setNbHits(Integer nbHits) {
    this.nbHits = nbHits;
    return this;
  }

  /** Number of results (hits). */
  @javax.annotation.Nullable
  public Integer getNbHits() {
    return nbHits;
  }

  public BrowsePagination setNbPages(Integer nbPages) {
    this.nbPages = nbPages;
    return this;
  }

  /** Number of pages of results. */
  @javax.annotation.Nullable
  public Integer getNbPages() {
    return nbPages;
  }

  public BrowsePagination setHitsPerPage(Integer hitsPerPage) {
    this.hitsPerPage = hitsPerPage;
    return this;
  }

  /** Number of hits per page. minimum: 1 maximum: 1000 */
  @javax.annotation.Nullable
  public Integer getHitsPerPage() {
    return hitsPerPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowsePagination browsePagination = (BrowsePagination) o;
    return (
      Objects.equals(this.page, browsePagination.page) &&
      Objects.equals(this.nbHits, browsePagination.nbHits) &&
      Objects.equals(this.nbPages, browsePagination.nbPages) &&
      Objects.equals(this.hitsPerPage, browsePagination.hitsPerPage)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, nbHits, nbPages, hitsPerPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowsePagination {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    nbHits: ").append(toIndentedString(nbHits)).append("\n");
    sb.append("    nbPages: ").append(toIndentedString(nbPages)).append("\n");
    sb.append("    hitsPerPage: ").append(toIndentedString(hitsPerPage)).append("\n");
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