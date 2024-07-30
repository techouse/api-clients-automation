// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.ingestion;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** The selected streams of a singer or airbyte connector. */
@JsonDeserialize(as = DockerStreamsInput.class)
public class DockerStreamsInput implements TaskInput {

  @JsonProperty("streams")
  private Object streams;

  public DockerStreamsInput setStreams(Object streams) {
    this.streams = streams;
    return this;
  }

  /** Get streams */
  @javax.annotation.Nonnull
  public Object getStreams() {
    return streams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DockerStreamsInput dockerStreamsInput = (DockerStreamsInput) o;
    return Objects.equals(this.streams, dockerStreamsInput.streams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DockerStreamsInput {\n");
    sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
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
