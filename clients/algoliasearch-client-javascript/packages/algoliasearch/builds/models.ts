// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import type { ClientOptions } from '@algolia/client-common';
import {
  AdvancedSyntaxFeatures,
  AlternativesAsExact,
  Anchoring,
  AroundPrecision,
  AroundPrecisionFromValueInner,
  AroundRadius,
  AroundRadiusAll,
  AutomaticFacetFilter,
  AutomaticFacetFilters,
  BaseSearchParams,
  BaseSearchParamsWithoutQuery,
  BaseSearchResponse,
  Condition,
  Consequence,
  ConsequenceHide,
  ConsequenceParams,
  ConsequenceQuery,
  ConsequenceQueryObject,
  CustomDeleteProps,
  CustomGetProps,
  CustomPostProps,
  CustomPutProps,
  DeletedAtResponse,
  Distinct,
  Edit,
  EditType,
  ErrorBase,
  ExactOnSingleWordQuery,
  Exhaustive,
  FacetFilters,
  FacetOrdering,
  Facets,
  FacetsStats,
  HighlightResult,
  HighlightResultOption,
  IgnorePlurals,
  IndexSettingsAsSearchParams,
  MatchLevel,
  MatchedGeoLocation,
  Mode,
  NumericFilters,
  OptionalFilters,
  Params,
  Personalization,
  Promote,
  PromoteObjectID,
  PromoteObjectIDs,
  QueryType,
  RankingInfo,
  ReRankingApplyFilter,
  Redirect,
  RedirectRuleIndexMetadata,
  RedirectRuleIndexMetadataData,
  RedirectURL,
  RemoveStopWords,
  RemoveWordsIfNoResults,
  RenderingContent,
  SearchPagination,
  SearchParams,
  SearchParamsObject,
  SearchParamsQuery,
  SemanticSearch,
  SnippetResult,
  SnippetResultOption,
  SortRemainingBy,
  SupportedLanguage,
  TagFilters,
  TaskStatus,
  TypoTolerance,
  TypoToleranceEnum,
  Value,
} from '@algolia/client-search/model';

export * from '@algolia/client-search/model';
export * from '@algolia/recommend/model';
export * from '@algolia/client-personalization/model';
export * from '@algolia/client-analytics/model';
export * from '@algolia/client-abtesting/model';

export { SearchClient } from '@algolia/client-search';
export { RecommendClient } from '@algolia/recommend';
export { PersonalizationClient } from '@algolia/client-personalization';
export { AnalyticsClient } from '@algolia/client-analytics';
export { AbtestingClient } from '@algolia/client-abtesting';

export {
  AdvancedSyntaxFeatures,
  AlternativesAsExact,
  Anchoring,
  AroundPrecision,
  AroundPrecisionFromValueInner,
  AroundRadius,
  AroundRadiusAll,
  AutomaticFacetFilter,
  AutomaticFacetFilters,
  BaseSearchParams,
  BaseSearchParamsWithoutQuery,
  BaseSearchResponse,
  Condition,
  Consequence,
  ConsequenceHide,
  ConsequenceParams,
  ConsequenceQuery,
  ConsequenceQueryObject,
  CustomDeleteProps,
  CustomGetProps,
  CustomPostProps,
  CustomPutProps,
  DeletedAtResponse,
  Distinct,
  Edit,
  EditType,
  ErrorBase,
  ExactOnSingleWordQuery,
  Exhaustive,
  FacetFilters,
  FacetOrdering,
  Facets,
  FacetsStats,
  HighlightResult,
  HighlightResultOption,
  IgnorePlurals,
  IndexSettingsAsSearchParams,
  MatchLevel,
  MatchedGeoLocation,
  Mode,
  NumericFilters,
  OptionalFilters,
  Params,
  Personalization,
  Promote,
  PromoteObjectID,
  PromoteObjectIDs,
  QueryType,
  RankingInfo,
  ReRankingApplyFilter,
  Redirect,
  RedirectRuleIndexMetadata,
  RedirectRuleIndexMetadataData,
  RedirectURL,
  RemoveStopWords,
  RemoveWordsIfNoResults,
  RenderingContent,
  SearchParams,
  SearchParamsObject,
  SearchParamsQuery,
  SemanticSearch,
  SearchPagination,
  SnippetResult,
  SnippetResultOption,
  SortRemainingBy,
  SupportedLanguage,
  TagFilters,
  TaskStatus,
  TypoTolerance,
  TypoToleranceEnum,
  Value,
};

/**
 * Options forwarded to the client initialized via the `init` method.
 */
export type InitClientOptions = Partial<{
  /**
   * App to target with the initialized client, defaults to the `algoliasearch` appId.
   */
  appId: string;
  /**
   * API key of the targeted app ID, defaults to the `algoliasearch` apiKey.
   */
  apiKey: string;
  options: ClientOptions;
}>;

export type InitClientRegion<TRegion> = Partial<{
  /**
   * Available regions of the initialized client.
   */
  region: TRegion;
}>;
