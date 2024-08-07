/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

/**
 * Dictionary entry.
 *
 * @param objectID Unique identifier for the dictionary entry.
 * @param language
 * @param word Matching dictionary word for `stopwords` and `compounds` dictionaries.
 * @param words Matching words in the `plurals` dictionary including declensions.
 * @param decomposition Invividual components of a compound word in the `compounds` dictionary.
 * @param state
 */
@Serializable(DictionaryEntrySerializer::class)
public data class DictionaryEntry(

  /** Unique identifier for the dictionary entry. */
  val objectID: String,

  val language: SupportedLanguage,

  /** Matching dictionary word for `stopwords` and `compounds` dictionaries. */
  val word: String? = null,

  /** Matching words in the `plurals` dictionary including declensions. */
  val words: List<String>? = null,

  /** Invividual components of a compound word in the `compounds` dictionary. */
  val decomposition: List<String>? = null,

  val state: DictionaryEntryState? = null,

  val additionalProperties: Map<String, JsonElement>? = null,
)

internal object DictionaryEntrySerializer : KSerializer<DictionaryEntry> {

  override val descriptor: SerialDescriptor = buildClassSerialDescriptor("DictionaryEntry") {
    element<String>("objectID")
    element<SupportedLanguage>("language")
    element<String>("word", isOptional = true)
    element<List<String>>("words", isOptional = true)
    element<List<String>>("decomposition", isOptional = true)
    element<DictionaryEntryState>("state", isOptional = true)
  }

  override fun deserialize(decoder: Decoder): DictionaryEntry {
    val input = decoder.asJsonDecoder()
    val tree = input.decodeJsonObject()
    return DictionaryEntry(
      objectID = tree.getValue("objectID").let { input.json.decodeFromJsonElement(it) },
      language = tree.getValue("language").let { input.json.decodeFromJsonElement(it) },
      word = tree["word"]?.let { input.json.decodeFromJsonElement(it) },
      words = tree["words"]?.let { input.json.decodeFromJsonElement(it) },
      decomposition = tree["decomposition"]?.let { input.json.decodeFromJsonElement(it) },
      state = tree["state"]?.let { input.json.decodeFromJsonElement(it) },
      additionalProperties = tree.filterKeys { it !in descriptor.elementNames },
    )
  }

  override fun serialize(encoder: Encoder, value: DictionaryEntry) {
    val output = encoder.asJsonEncoder()
    val json = buildJsonObject {
      put("objectID", output.json.encodeToJsonElement(value.objectID))
      put("language", output.json.encodeToJsonElement(value.language))
      value.word?.let { put("word", output.json.encodeToJsonElement(it)) }
      value.words?.let { put("words", output.json.encodeToJsonElement(it)) }
      value.decomposition?.let { put("decomposition", output.json.encodeToJsonElement(it)) }
      value.state?.let { put("state", output.json.encodeToJsonElement(it)) }
      value.additionalProperties?.onEach { (key, element) -> put(key, element) }
    }
    (encoder as JsonEncoder).encodeJsonElement(json)
  }
}
