// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.recommend;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** Recommend rule. */
public class RecommendRule {

  @JsonProperty("_metadata")
  private RecommendRuleMetadata metadata;

  @JsonProperty("objectID")
  private String objectID;

  @JsonProperty("condition")
  private Condition condition;

  @JsonProperty("consequence")
  private Consequence consequence;

  @JsonProperty("description")
  private String description;

  @JsonProperty("enabled")
  private Boolean enabled;

  public RecommendRule setMetadata(RecommendRuleMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /** Get metadata */
  @javax.annotation.Nullable
  public RecommendRuleMetadata getMetadata() {
    return metadata;
  }

  public RecommendRule setObjectID(String objectID) {
    this.objectID = objectID;
    return this;
  }

  /** Unique identifier of a rule object. */
  @javax.annotation.Nullable
  public String getObjectID() {
    return objectID;
  }

  public RecommendRule setCondition(Condition condition) {
    this.condition = condition;
    return this;
  }

  /** Get condition */
  @javax.annotation.Nullable
  public Condition getCondition() {
    return condition;
  }

  public RecommendRule setConsequence(Consequence consequence) {
    this.consequence = consequence;
    return this;
  }

  /** Get consequence */
  @javax.annotation.Nullable
  public Consequence getConsequence() {
    return consequence;
  }

  public RecommendRule setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the rule's purpose. This can be helpful for display in the Algolia dashboard.
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public RecommendRule setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /** Indicates whether to enable the rule. If it isn't enabled, it isn't applied at query time. */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendRule recommendRule = (RecommendRule) o;
    return (
      Objects.equals(this.metadata, recommendRule.metadata) &&
      Objects.equals(this.objectID, recommendRule.objectID) &&
      Objects.equals(this.condition, recommendRule.condition) &&
      Objects.equals(this.consequence, recommendRule.consequence) &&
      Objects.equals(this.description, recommendRule.description) &&
      Objects.equals(this.enabled, recommendRule.enabled)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, objectID, condition, consequence, description, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendRule {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    objectID: ").append(toIndentedString(objectID)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    consequence: ").append(toIndentedString(consequence)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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