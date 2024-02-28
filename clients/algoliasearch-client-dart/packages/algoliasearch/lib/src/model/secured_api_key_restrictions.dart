// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
// ignore_for_file: unused_element
import 'package:algoliasearch/src/model/search_params_object.dart';

import 'package:json_annotation/json_annotation.dart';

part 'secured_api_key_restrictions.g.dart';

@JsonSerializable()
final class SecuredAPIKeyRestrictions {
  /// Returns a new [SecuredAPIKeyRestrictions] instance.
  const SecuredAPIKeyRestrictions({
    this.searchParams,
    this.filters,
    this.validUntil,
    this.restrictIndices,
    this.restrictSources,
    this.userToken,
  });

  @JsonKey(name: r'searchParams')
  final SearchParamsObject? searchParams;

  /// Filters that apply to every search made with the secured API key. You can add extra filters at search time with the filters query parameter. For example, if you set the filter group:admin on your generated API key, and you add groups:press OR groups:visitors with the filters query parameter, your final search filter is equivalent to groups:admin AND (groups:press OR groups:visitors).
  @JsonKey(name: r'filters')
  final String? filters;

  /// Unix timestamp used to set the expiration date of the API key.
  @JsonKey(name: r'validUntil')
  final int? validUntil;

  /// Index names that can be queried.
  @JsonKey(name: r'restrictIndices')
  final List<String>? restrictIndices;

  /// IPv4 network allowed to use the generated key. Use this to protect against API key leaking and reuse. You can only provide a single source, but you can specify a range of IPs (for example, 192.168.1.0/24).
  @JsonKey(name: r'restrictSources')
  final String? restrictSources;

  /// Unique user IP address. This can be useful when you want to impose a rate limit on specific users. By default, rate limits are set based on the IP address. This can become an issue when several users search from the same IP address. To avoid this, you can set a unique userToken for each user when generating their API key. This lets you restrict each user to a maximum number of API calls per hour, even if they share their IP with another user. Specifying the userToken in a secured API key is also a good security practice as it ensures users don't change it. Many features like Analytics, Personalization, and Dynamic Re-ranking rely on the authenticity of user identifiers. Setting the userToken at the API key level ensures that downstream services work as expected and prevents abuse.
  @JsonKey(name: r'userToken')
  final String? userToken;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is SecuredAPIKeyRestrictions &&
          other.searchParams == searchParams &&
          other.filters == filters &&
          other.validUntil == validUntil &&
          other.restrictIndices == restrictIndices &&
          other.restrictSources == restrictSources &&
          other.userToken == userToken;

  @override
  int get hashCode =>
      searchParams.hashCode +
      filters.hashCode +
      validUntil.hashCode +
      restrictIndices.hashCode +
      restrictSources.hashCode +
      userToken.hashCode;

  factory SecuredAPIKeyRestrictions.fromJson(Map<String, dynamic> json) =>
      _$SecuredAPIKeyRestrictionsFromJson(json);

  Map<String, dynamic> toJson() => _$SecuredAPIKeyRestrictionsToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }
}
