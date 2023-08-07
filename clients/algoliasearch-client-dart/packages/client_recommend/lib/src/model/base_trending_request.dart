// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
// ignore_for_file: unused_element
import 'package:algolia_client_recommend/src/model/trending_models.dart';

import 'package:json_annotation/json_annotation.dart';

part 'base_trending_request.g.dart';

@JsonSerializable()
final class BaseTrendingRequest {
  /// Returns a new [BaseTrendingRequest] instance.
  const BaseTrendingRequest({
    required this.model,
    this.facetName,
    this.facetValue,
  });

  @JsonKey(name: r'model')
  final TrendingModels model;

  /// Facet name for trending models.
  @JsonKey(name: r'facetName')
  final String? facetName;

  /// Facet value for trending models.
  @JsonKey(name: r'facetValue')
  final String? facetValue;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is BaseTrendingRequest &&
          other.model == model &&
          other.facetName == facetName &&
          other.facetValue == facetValue;

  @override
  int get hashCode => model.hashCode + facetName.hashCode + facetValue.hashCode;

  factory BaseTrendingRequest.fromJson(Map<String, dynamic> json) =>
      _$BaseTrendingRequestFromJson(json);

  Map<String, dynamic> toJson() => _$BaseTrendingRequestToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }
}