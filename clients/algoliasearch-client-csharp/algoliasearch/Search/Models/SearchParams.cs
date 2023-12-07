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
using System.ComponentModel.DataAnnotations;
using FileParameter = Algolia.Search.Search.Client.FileParameter;
using OpenAPIDateConverter = Algolia.Search.Search.Client.OpenAPIDateConverter;
using System.Reflection;

namespace Algolia.Search.Search.Models
{
  /// <summary>
  /// SearchParams
  /// </summary>
  [JsonConverter(typeof(SearchParamsJsonConverter))]
  [DataContract(Name = "searchParams")]
  public partial class SearchParams : AbstractOpenAPISchema, IEquatable<SearchParams>, IValidatableObject
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="SearchParams" /> class
    /// with the <see cref="SearchParamsString" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of SearchParamsString.</param>
    public SearchParams(SearchParamsString actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="SearchParams" /> class
    /// with the <see cref="SearchParamsObject" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of SearchParamsObject.</param>
    public SearchParams(SearchParamsObject actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
    }


    private Object _actualInstance;

    /// <summary>
    /// Gets or Sets ActualInstance
    /// </summary>
    public override Object ActualInstance
    {
      get
      {
        return _actualInstance;
      }
      set
      {
        if (value.GetType() == typeof(SearchParamsObject))
        {
          this._actualInstance = value;
        }
        else if (value.GetType() == typeof(SearchParamsString))
        {
          this._actualInstance = value;
        }
        else
        {
          throw new ArgumentException("Invalid instance found. Must be the following types: SearchParamsObject, SearchParamsString");
        }
      }
    }

    /// <summary>
    /// Get the actual instance of `SearchParamsString`. If the actual instance is not `SearchParamsString`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of SearchParamsString</returns>
    public SearchParamsString GetterSearchParamsString()
    {
      return (SearchParamsString)this.ActualInstance;
    }

    /// <summary>
    /// Get the actual instance of `SearchParamsObject`. If the actual instance is not `SearchParamsObject`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of SearchParamsObject</returns>
    public SearchParamsObject GetterSearchParamsObject()
    {
      return (SearchParamsObject)this.ActualInstance;
    }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      var sb = new StringBuilder();
      sb.Append("class SearchParams {\n");
      sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Returns the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public override string ToJson()
    {
      return JsonConvert.SerializeObject(this.ActualInstance, SearchParams.SerializerSettings);
    }

    /// <summary>
    /// Converts the JSON string into an instance of SearchParams
    /// </summary>
    /// <param name="jsonString">JSON string</param>
    /// <returns>An instance of SearchParams</returns>
    public static SearchParams FromJson(string jsonString)
    {
      SearchParams newSearchParams = null;

      if (string.IsNullOrEmpty(jsonString))
      {
        return newSearchParams;
      }
      int match = 0;
      List<string> matchedTypes = new List<string>();

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(SearchParamsObject).GetProperty("AdditionalProperties") == null)
        {
          newSearchParams = new SearchParams(JsonConvert.DeserializeObject<SearchParamsObject>(jsonString, SearchParams.SerializerSettings));
        }
        else
        {
          newSearchParams = new SearchParams(JsonConvert.DeserializeObject<SearchParamsObject>(jsonString, SearchParams.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("SearchParamsObject");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into SearchParamsObject: {1}", jsonString, exception.ToString()));
      }

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(SearchParamsString).GetProperty("AdditionalProperties") == null)
        {
          newSearchParams = new SearchParams(JsonConvert.DeserializeObject<SearchParamsString>(jsonString, SearchParams.SerializerSettings));
        }
        else
        {
          newSearchParams = new SearchParams(JsonConvert.DeserializeObject<SearchParamsString>(jsonString, SearchParams.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("SearchParamsString");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into SearchParamsString: {1}", jsonString, exception.ToString()));
      }

      if (match == 0)
      {
        throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
      }
      else if (match > 1)
      {
        throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + String.Join(",", matchedTypes));
      }

      // deserialization is considered successful at this point if no exception has been thrown.
      return newSearchParams;
    }

    /// <summary>
    /// Returns true if objects are equal
    /// </summary>
    /// <param name="input">Object to be compared</param>
    /// <returns>Boolean</returns>
    public override bool Equals(object input)
    {
      return this.Equals(input as SearchParams);
    }

    /// <summary>
    /// Returns true if SearchParams instances are equal
    /// </summary>
    /// <param name="input">Instance of SearchParams to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(SearchParams input)
    {
      if (input == null)
        return false;

      return this.ActualInstance.Equals(input.ActualInstance);
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
        if (this.ActualInstance != null)
          hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
        return hashCode;
      }
    }

    /// <summary>
    /// To validate all properties of the instance
    /// </summary>
    /// <param name="validationContext">Validation context</param>
    /// <returns>Validation Result</returns>
    IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
    {
      yield break;
    }
  }

  /// <summary>
  /// Custom JSON converter for SearchParams
  /// </summary>
  public class SearchParamsJsonConverter : JsonConverter
  {
    /// <summary>
    /// To write the JSON string
    /// </summary>
    /// <param name="writer">JSON writer</param>
    /// <param name="value">Object to be converted into a JSON string</param>
    /// <param name="serializer">JSON Serializer</param>
    public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
    {
      writer.WriteRawValue((string)(typeof(SearchParams).GetMethod("ToJson").Invoke(value, null)));
    }

    /// <summary>
    /// To convert a JSON string into an object
    /// </summary>
    /// <param name="reader">JSON reader</param>
    /// <param name="objectType">Object type</param>
    /// <param name="existingValue">Existing value</param>
    /// <param name="serializer">JSON Serializer</param>
    /// <returns>The object converted from the JSON string</returns>
    public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
    {
      if (reader.TokenType != JsonToken.Null)
      {
        return SearchParams.FromJson(JObject.Load(reader).ToString(Formatting.None));
      }
      return null;
    }

    /// <summary>
    /// Check if the object can be converted
    /// </summary>
    /// <param name="objectType">Object type</param>
    /// <returns>True if the object can be converted</returns>
    public override bool CanConvert(Type objectType)
    {
      return false;
    }
  }

}