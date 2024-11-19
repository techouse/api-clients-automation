// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.search;

import com.algolia.exceptions.AlgoliaRuntimeException;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/** OptionalWords */
@JsonDeserialize(using = OptionalWords.Deserializer.class)
public interface OptionalWords {
  // OptionalWords as String wrapper.
  static OptionalWords of(String value) {
    return new StringWrapper(value);
  }

  // OptionalWords as List<String> wrapper.
  static OptionalWords of(List<String> value) {
    return new ListOfStringWrapper(value);
  }

  // OptionalWords as String wrapper.
  @JsonSerialize(using = StringWrapper.Serializer.class)
  class StringWrapper implements OptionalWords {

    private final String value;

    StringWrapper(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    static class Serializer extends JsonSerializer<StringWrapper> {

      @Override
      public void serialize(StringWrapper value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeObject(value.getValue());
      }
    }
  }

  // OptionalWords as List<String> wrapper.
  @JsonSerialize(using = ListOfStringWrapper.Serializer.class)
  class ListOfStringWrapper implements OptionalWords {

    private final List<String> value;

    ListOfStringWrapper(List<String> value) {
      this.value = value;
    }

    public List<String> getValue() {
      return value;
    }

    static class Serializer extends JsonSerializer<ListOfStringWrapper> {

      @Override
      public void serialize(ListOfStringWrapper value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeObject(value.getValue());
      }
    }
  }

  class Deserializer extends JsonDeserializer<OptionalWords> {

    private static final Logger LOGGER = Logger.getLogger(Deserializer.class.getName());

    @Override
    public OptionalWords deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
      JsonNode tree = jp.readValueAsTree();
      // deserialize String
      if (tree.isTextual()) {
        try (JsonParser parser = tree.traverse(jp.getCodec())) {
          String value = parser.readValueAs(String.class);
          return new OptionalWords.StringWrapper(value);
        } catch (Exception e) {
          // deserialization failed, continue
          LOGGER.finest("Failed to deserialize oneOf String (error: " + e.getMessage() + ") (type: String)");
        }
      }
      // deserialize List<String>
      if (tree.isArray()) {
        try (JsonParser parser = tree.traverse(jp.getCodec())) {
          List<String> value = parser.readValueAs(new TypeReference<List<String>>() {});
          return new OptionalWords.ListOfStringWrapper(value);
        } catch (Exception e) {
          // deserialization failed, continue
          LOGGER.finest("Failed to deserialize oneOf List<String> (error: " + e.getMessage() + ") (type: List<String>)");
        }
      }
      throw new AlgoliaRuntimeException(String.format("Failed to deserialize json element: %s", tree));
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public OptionalWords getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      return null;
    }
  }
}