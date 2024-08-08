// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.monitoring;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** IncidentEntry */
public class IncidentEntry {

  @JsonProperty("t")
  private Long t;

  @JsonProperty("v")
  private Incident v;

  public IncidentEntry setT(Long t) {
    this.t = t;
    return this;
  }

  /** Timestamp, measured in milliseconds since the Unix epoch. */
  @javax.annotation.Nullable
  public Long getT() {
    return t;
  }

  public IncidentEntry setV(Incident v) {
    this.v = v;
    return this;
  }

  /** Get v */
  @javax.annotation.Nullable
  public Incident getV() {
    return v;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentEntry incidentEntry = (IncidentEntry) o;
    return Objects.equals(this.t, incidentEntry.t) && Objects.equals(this.v, incidentEntry.v);
  }

  @Override
  public int hashCode() {
    return Objects.hash(t, v);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentEntry {\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    v: ").append(toIndentedString(v)).append("\n");
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