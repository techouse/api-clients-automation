// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.abtesting;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** EstimateABTestRequest */
public class EstimateABTestRequest {

  @JsonProperty("configuration")
  private EstimateConfiguration configuration;

  @JsonProperty("variants")
  private List<AddABTestsVariant> variants = new ArrayList<>();

  public EstimateABTestRequest setConfiguration(EstimateConfiguration configuration) {
    this.configuration = configuration;
    return this;
  }

  /** Get configuration */
  @javax.annotation.Nonnull
  public EstimateConfiguration getConfiguration() {
    return configuration;
  }

  public EstimateABTestRequest setVariants(List<AddABTestsVariant> variants) {
    this.variants = variants;
    return this;
  }

  public EstimateABTestRequest addVariants(AddABTestsVariant variantsItem) {
    this.variants.add(variantsItem);
    return this;
  }

  /** A/B test variants. */
  @javax.annotation.Nonnull
  public List<AddABTestsVariant> getVariants() {
    return variants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimateABTestRequest estimateABTestRequest = (EstimateABTestRequest) o;
    return (
      Objects.equals(this.configuration, estimateABTestRequest.configuration) &&
      Objects.equals(this.variants, estimateABTestRequest.variants)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, variants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateABTestRequest {\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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