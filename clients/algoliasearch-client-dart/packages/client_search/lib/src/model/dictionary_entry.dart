// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
// ignore_for_file: unused_element
import 'package:algolia_client_search/src/model/supported_language.dart';
import 'package:algolia_client_search/src/model/dictionary_entry_type.dart';
import 'package:algolia_client_search/src/model/dictionary_entry_state.dart';

import 'package:collection/collection.dart';
import 'package:json_annotation/json_annotation.dart';

part 'dictionary_entry.g.dart';

@JsonSerializable(createFieldMap: true)
final class DictionaryEntry extends DelegatingMap<String, dynamic> {
  /// Returns a new [DictionaryEntry] instance.
  const DictionaryEntry({
    required this.objectID,
    this.language,
    this.word,
    this.words,
    this.decomposition,
    this.state,
    this.type,
    Map<String, dynamic> additionalProperties = const {},
  }) : super(additionalProperties);

  /// Unique identifier for the dictionary entry.
  @JsonKey(name: r'objectID')
  final String objectID;

  @JsonKey(name: r'language')
  final SupportedLanguage? language;

  /// Matching dictionary word for `stopwords` and `compounds` dictionaries.
  @JsonKey(name: r'word')
  final String? word;

  /// Matching words in the `plurals` dictionary including declensions.
  @JsonKey(name: r'words')
  final List<String>? words;

  /// Invividual components of a compound word in the `compounds` dictionary.
  @JsonKey(name: r'decomposition')
  final List<String>? decomposition;

  @JsonKey(name: r'state')
  final DictionaryEntryState? state;

  @JsonKey(name: r'type')
  final DictionaryEntryType? type;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is DictionaryEntry &&
          other.objectID == objectID &&
          other.language == language &&
          other.word == word &&
          other.words == words &&
          other.decomposition == decomposition &&
          other.state == state &&
          other.type == type &&
          const MapEquality<String, dynamic>().equals(this, this);

  @override
  int get hashCode =>
      objectID.hashCode +
      language.hashCode +
      word.hashCode +
      words.hashCode +
      decomposition.hashCode +
      state.hashCode +
      type.hashCode +
      const MapEquality<String, dynamic>().hash(this);

  factory DictionaryEntry.fromJson(Map<String, dynamic> json) {
    final instance = _$DictionaryEntryFromJson(json);
    final additionalProperties = Map<String, dynamic>.from(json)
      ..removeWhere((key, value) => _$DictionaryEntryFieldMap.containsKey(key));
    return DictionaryEntry(
      objectID: instance.objectID,
      language: instance.language,
      word: instance.word,
      words: instance.words,
      decomposition: instance.decomposition,
      state: instance.state,
      type: instance.type,
      additionalProperties: additionalProperties,
    );
  }

  Map<String, dynamic> toJson() => _$DictionaryEntryToJson(this)..addAll(this);

  @override
  String toString() {
    return toJson().toString();
  }
}
