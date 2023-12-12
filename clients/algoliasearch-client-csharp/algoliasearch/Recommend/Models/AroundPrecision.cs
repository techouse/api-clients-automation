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
using System.Reflection;
using Algolia.Search.Models;

namespace Algolia.Search.Recommend.Models
{
  /// <summary>
  /// Precision of a geographical search (in meters), to [group results that are more or less the same distance from a central point](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/in-depth/geo-ranking-precision/).
  /// </summary>
  [JsonConverter(typeof(AroundPrecisionJsonConverter))]
  [DataContract(Name = "aroundPrecision")]
  public partial class AroundPrecision : AbstractSchema, IEquatable<AroundPrecision>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="AroundPrecision" /> class
    /// with the <see cref="int" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of int.</param>
    public AroundPrecision(int actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance;
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="AroundPrecision" /> class
    /// with the <see cref="List{AroundPrecisionFromValueInner}" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of List&lt;AroundPrecisionFromValueInner&gt;.</param>
    public AroundPrecision(List<AroundPrecisionFromValueInner> actualInstance)
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
        if (value.GetType() == typeof(List<AroundPrecisionFromValueInner>))
        {
          this._actualInstance = value;
        }
        else if (value.GetType() == typeof(int))
        {
          this._actualInstance = value;
        }
        else
        {
          throw new ArgumentException("Invalid instance found. Must be the following types: List<AroundPrecisionFromValueInner>, int");
        }
      }
    }

    /// <summary>
    /// Get the actual instance of `int`. If the actual instance is not `int`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of int</returns>
    public int GetterInt()
    {
      return (int)this.ActualInstance;
    }

    /// <summary>
    /// Get the actual instance of `List&lt;AroundPrecisionFromValueInner&gt;`. If the actual instance is not `List&lt;AroundPrecisionFromValueInner&gt;`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of List&lt;AroundPrecisionFromValueInner&gt;</returns>
    public List<AroundPrecisionFromValueInner> GetterList()
    {
      return (List<AroundPrecisionFromValueInner>)this.ActualInstance;
    }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      var sb = new StringBuilder();
      sb.Append("class AroundPrecision {\n");
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
      return JsonConvert.SerializeObject(this.ActualInstance, AroundPrecision.SerializerSettings);
    }

    /// <summary>
    /// Converts the JSON string into an instance of AroundPrecision
    /// </summary>
    /// <param name="jsonString">JSON string</param>
    /// <returns>An instance of AroundPrecision</returns>
    public static AroundPrecision FromJson(string jsonString)
    {
      AroundPrecision newAroundPrecision = null;

      if (string.IsNullOrEmpty(jsonString))
      {
        return newAroundPrecision;
      }
      int match = 0;
      List<string> matchedTypes = new List<string>();

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(List<AroundPrecisionFromValueInner>).GetProperty("AdditionalProperties") == null)
        {
          newAroundPrecision = new AroundPrecision(JsonConvert.DeserializeObject<List<AroundPrecisionFromValueInner>>(jsonString, AroundPrecision.SerializerSettings));
        }
        else
        {
          newAroundPrecision = new AroundPrecision(JsonConvert.DeserializeObject<List<AroundPrecisionFromValueInner>>(jsonString, AroundPrecision.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("List<AroundPrecisionFromValueInner>");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into List<AroundPrecisionFromValueInner>: {1}", jsonString, exception.ToString()));
      }

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(int).GetProperty("AdditionalProperties") == null)
        {
          newAroundPrecision = new AroundPrecision(JsonConvert.DeserializeObject<int>(jsonString, AroundPrecision.SerializerSettings));
        }
        else
        {
          newAroundPrecision = new AroundPrecision(JsonConvert.DeserializeObject<int>(jsonString, AroundPrecision.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("int");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into int: {1}", jsonString, exception.ToString()));
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
      return newAroundPrecision;
    }

    /// <summary>
    /// Returns true if objects are equal
    /// </summary>
    /// <param name="input">Object to be compared</param>
    /// <returns>Boolean</returns>
    public override bool Equals(object input)
    {
      return this.Equals(input as AroundPrecision);
    }

    /// <summary>
    /// Returns true if AroundPrecision instances are equal
    /// </summary>
    /// <param name="input">Instance of AroundPrecision to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(AroundPrecision input)
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
  }

  /// <summary>
  /// Custom JSON converter for AroundPrecision
  /// </summary>
  public class AroundPrecisionJsonConverter : JsonConverter
  {
    /// <summary>
    /// To write the JSON string
    /// </summary>
    /// <param name="writer">JSON writer</param>
    /// <param name="value">Object to be converted into a JSON string</param>
    /// <param name="serializer">JSON Serializer</param>
    public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
    {
      writer.WriteRawValue((string)(typeof(AroundPrecision).GetMethod("ToJson").Invoke(value, null)));
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
        return AroundPrecision.FromJson(JObject.Load(reader).ToString(Formatting.None));
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
