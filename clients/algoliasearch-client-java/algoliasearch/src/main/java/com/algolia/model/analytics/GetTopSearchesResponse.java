// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.analytics;

import com.algolia.exceptions.AlgoliaRuntimeException;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.io.IOException;
import java.util.logging.Logger;

/** GetTopSearchesResponse */
@JsonDeserialize(using = GetTopSearchesResponse.Deserializer.class)
public interface GetTopSearchesResponse {
  class Deserializer extends JsonDeserializer<GetTopSearchesResponse> {

    private static final Logger LOGGER = Logger.getLogger(Deserializer.class.getName());

    @Override
    public GetTopSearchesResponse deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
      JsonNode tree = jp.readValueAsTree();
      // deserialize TopSearchesResponse
      if (tree.isObject()) {
        try (JsonParser parser = tree.traverse(jp.getCodec())) {
          return parser.readValueAs(TopSearchesResponse.class);
        } catch (Exception e) {
          // deserialization failed, continue
          LOGGER.finest("Failed to deserialize oneOf TopSearchesResponse (error: " + e.getMessage() + ") (type: TopSearchesResponse)");
        }
      }
      // deserialize TopSearchesResponseWithAnalytics
      if (tree.isObject()) {
        try (JsonParser parser = tree.traverse(jp.getCodec())) {
          return parser.readValueAs(TopSearchesResponseWithAnalytics.class);
        } catch (Exception e) {
          // deserialization failed, continue
          LOGGER.finest(
            "Failed to deserialize oneOf TopSearchesResponseWithAnalytics (error: " +
            e.getMessage() +
            ") (type: TopSearchesResponseWithAnalytics)"
          );
        }
      }
      throw new AlgoliaRuntimeException(String.format("Failed to deserialize json element: %s", tree));
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public GetTopSearchesResponse getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "GetTopSearchesResponse cannot be null");
    }
  }
}
