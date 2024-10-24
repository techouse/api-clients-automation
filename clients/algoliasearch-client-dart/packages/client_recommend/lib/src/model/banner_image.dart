// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
// ignore_for_file: unused_element
import 'package:algolia_client_recommend/src/model/banner_image_url.dart';

import 'package:json_annotation/json_annotation.dart';

part 'banner_image.g.dart';

@JsonSerializable()
final class BannerImage {
  /// Returns a new [BannerImage] instance.
  const BannerImage({
    this.urls,
    this.title,
  });

  @JsonKey(name: r'urls')
  final List<BannerImageUrl>? urls;

  @JsonKey(name: r'title')
  final String? title;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is BannerImage && other.urls == urls && other.title == title;

  @override
  int get hashCode => urls.hashCode + title.hashCode;

  factory BannerImage.fromJson(Map<String, dynamic> json) =>
      _$BannerImageFromJson(json);

  Map<String, dynamic> toJson() => _$BannerImageToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }
}
