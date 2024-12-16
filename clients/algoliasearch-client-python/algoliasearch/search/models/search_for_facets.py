# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""

from __future__ import annotations

from json import loads
from sys import version_info
from typing import Any, Dict, List, Optional

from pydantic import BaseModel, ConfigDict

if version_info >= (3, 11):
    from typing import Self
else:
    from typing_extensions import Self


from algoliasearch.search.models.advanced_syntax_features import AdvancedSyntaxFeatures
from algoliasearch.search.models.alternatives_as_exact import AlternativesAsExact
from algoliasearch.search.models.around_precision import AroundPrecision
from algoliasearch.search.models.around_radius import AroundRadius
from algoliasearch.search.models.distinct import Distinct
from algoliasearch.search.models.exact_on_single_word_query import (
    ExactOnSingleWordQuery,
)
from algoliasearch.search.models.facet_filters import FacetFilters
from algoliasearch.search.models.ignore_plurals import IgnorePlurals
from algoliasearch.search.models.inside_bounding_box import InsideBoundingBox
from algoliasearch.search.models.mode import Mode
from algoliasearch.search.models.numeric_filters import NumericFilters
from algoliasearch.search.models.optional_filters import OptionalFilters
from algoliasearch.search.models.optional_words import OptionalWords
from algoliasearch.search.models.query_type import QueryType
from algoliasearch.search.models.re_ranking_apply_filter import ReRankingApplyFilter
from algoliasearch.search.models.remove_stop_words import RemoveStopWords
from algoliasearch.search.models.remove_words_if_no_results import (
    RemoveWordsIfNoResults,
)
from algoliasearch.search.models.rendering_content import RenderingContent
from algoliasearch.search.models.search_type_facet import SearchTypeFacet
from algoliasearch.search.models.semantic_search import SemanticSearch
from algoliasearch.search.models.supported_language import SupportedLanguage
from algoliasearch.search.models.tag_filters import TagFilters
from algoliasearch.search.models.typo_tolerance import TypoTolerance

_ALIASES = {
    "params": "params",
    "query": "query",
    "similar_query": "similarQuery",
    "filters": "filters",
    "facet_filters": "facetFilters",
    "optional_filters": "optionalFilters",
    "numeric_filters": "numericFilters",
    "tag_filters": "tagFilters",
    "sum_or_filters_scores": "sumOrFiltersScores",
    "restrict_searchable_attributes": "restrictSearchableAttributes",
    "facets": "facets",
    "faceting_after_distinct": "facetingAfterDistinct",
    "page": "page",
    "offset": "offset",
    "length": "length",
    "around_lat_lng": "aroundLatLng",
    "around_lat_lng_via_ip": "aroundLatLngViaIP",
    "around_radius": "aroundRadius",
    "around_precision": "aroundPrecision",
    "minimum_around_radius": "minimumAroundRadius",
    "inside_bounding_box": "insideBoundingBox",
    "inside_polygon": "insidePolygon",
    "natural_languages": "naturalLanguages",
    "rule_contexts": "ruleContexts",
    "personalization_impact": "personalizationImpact",
    "user_token": "userToken",
    "get_ranking_info": "getRankingInfo",
    "synonyms": "synonyms",
    "click_analytics": "clickAnalytics",
    "analytics": "analytics",
    "analytics_tags": "analyticsTags",
    "percentile_computation": "percentileComputation",
    "enable_ab_test": "enableABTest",
    "attributes_to_retrieve": "attributesToRetrieve",
    "ranking": "ranking",
    "custom_ranking": "customRanking",
    "relevancy_strictness": "relevancyStrictness",
    "attributes_to_highlight": "attributesToHighlight",
    "attributes_to_snippet": "attributesToSnippet",
    "highlight_pre_tag": "highlightPreTag",
    "highlight_post_tag": "highlightPostTag",
    "snippet_ellipsis_text": "snippetEllipsisText",
    "restrict_highlight_and_snippet_arrays": "restrictHighlightAndSnippetArrays",
    "hits_per_page": "hitsPerPage",
    "min_word_sizefor1_typo": "minWordSizefor1Typo",
    "min_word_sizefor2_typos": "minWordSizefor2Typos",
    "typo_tolerance": "typoTolerance",
    "allow_typos_on_numeric_tokens": "allowTyposOnNumericTokens",
    "disable_typo_tolerance_on_attributes": "disableTypoToleranceOnAttributes",
    "ignore_plurals": "ignorePlurals",
    "remove_stop_words": "removeStopWords",
    "keep_diacritics_on_characters": "keepDiacriticsOnCharacters",
    "query_languages": "queryLanguages",
    "decompound_query": "decompoundQuery",
    "enable_rules": "enableRules",
    "enable_personalization": "enablePersonalization",
    "query_type": "queryType",
    "remove_words_if_no_results": "removeWordsIfNoResults",
    "mode": "mode",
    "semantic_search": "semanticSearch",
    "advanced_syntax": "advancedSyntax",
    "optional_words": "optionalWords",
    "disable_exact_on_attributes": "disableExactOnAttributes",
    "exact_on_single_word_query": "exactOnSingleWordQuery",
    "alternatives_as_exact": "alternativesAsExact",
    "advanced_syntax_features": "advancedSyntaxFeatures",
    "distinct": "distinct",
    "replace_synonyms_in_highlight": "replaceSynonymsInHighlight",
    "min_proximity": "minProximity",
    "response_fields": "responseFields",
    "max_values_per_facet": "maxValuesPerFacet",
    "sort_facet_values_by": "sortFacetValuesBy",
    "attribute_criteria_computed_by_min_proximity": "attributeCriteriaComputedByMinProximity",
    "rendering_content": "renderingContent",
    "enable_re_ranking": "enableReRanking",
    "re_ranking_apply_filter": "reRankingApplyFilter",
    "facet": "facet",
    "index_name": "indexName",
    "facet_query": "facetQuery",
    "max_facet_hits": "maxFacetHits",
    "type": "type",
}


def _alias_generator(name: str) -> str:
    return _ALIASES.get(name, name)


class SearchForFacets(BaseModel):
    """
    SearchForFacets
    """

    params: Optional[str] = None
    """ Search parameters as a URL-encoded query string. """
    query: Optional[str] = None
    """ Search query. """
    similar_query: Optional[str] = None
    """ Keywords to be used instead of the search query to conduct a more broader search.  Using the `similarQuery` parameter changes other settings:  - `queryType` is set to `prefixNone`. - `removeStopWords` is set to true. - `words` is set as the first ranking criterion. - All remaining words are treated as `optionalWords`.  Since the `similarQuery` is supposed to do a broad search, they usually return many results. Combine it with `filters` to narrow down the list of results.  """
    filters: Optional[str] = None
    """ Filter expression to only include items that match the filter criteria in the response.  You can use these filter expressions:  - **Numeric filters.** `<facet> <op> <number>`, where `<op>` is one of `<`, `<=`, `=`, `!=`, `>`, `>=`. - **Ranges.** `<facet>:<lower> TO <upper>` where `<lower>` and `<upper>` are the lower and upper limits of the range (inclusive). - **Facet filters.** `<facet>:<value>` where `<facet>` is a facet attribute (case-sensitive) and `<value>` a facet value. - **Tag filters.** `_tags:<value>` or just `<value>` (case-sensitive). - **Boolean filters.** `<facet>: true | false`.  You can combine filters with `AND`, `OR`, and `NOT` operators with the following restrictions:  - You can only combine filters of the same type with `OR`.   **Not supported:** `facet:value OR num > 3`. - You can't use `NOT` with combinations of filters.   **Not supported:** `NOT(facet:value OR facet:value)` - You can't combine conjunctions (`AND`) with `OR`.   **Not supported:** `facet:value OR (facet:value AND facet:value)`  Use quotes around your filters, if the facet attribute name or facet value has spaces, keywords (`OR`, `AND`, `NOT`), or quotes. If a facet attribute is an array, the filter matches if it matches at least one element of the array.  For more information, see [Filters](https://www.algolia.com/doc/guides/managing-results/refine-results/filtering/).  """
    facet_filters: Optional[FacetFilters] = None
    optional_filters: Optional[OptionalFilters] = None
    numeric_filters: Optional[NumericFilters] = None
    tag_filters: Optional[TagFilters] = None
    sum_or_filters_scores: Optional[bool] = None
    """ Whether to sum all filter scores.  If true, all filter scores are summed. Otherwise, the maximum filter score is kept. For more information, see [filter scores](https://www.algolia.com/doc/guides/managing-results/refine-results/filtering/in-depth/filter-scoring/#accumulating-scores-with-sumorfiltersscores).  """
    restrict_searchable_attributes: Optional[List[str]] = None
    """ Restricts a search to a subset of your searchable attributes. Attribute names are case-sensitive.  """
    facets: Optional[List[str]] = None
    """ Facets for which to retrieve facet values that match the search criteria and the number of matching facet values.  To retrieve all facets, use the wildcard character `*`. For more information, see [facets](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#contextual-facet-values-and-counts).  """
    faceting_after_distinct: Optional[bool] = None
    """ Whether faceting should be applied after deduplication with `distinct`.  This leads to accurate facet counts when using faceting in combination with `distinct`. It's usually better to use `afterDistinct` modifiers in the `attributesForFaceting` setting, as `facetingAfterDistinct` only computes correct facet counts if all records have the same facet values for the `attributeForDistinct`.  """
    page: Optional[int] = None
    """ Page of search results to retrieve. """
    offset: Optional[int] = None
    """ Position of the first hit to retrieve. """
    length: Optional[int] = None
    """ Number of hits to retrieve (used in combination with `offset`). """
    around_lat_lng: Optional[str] = None
    """ Coordinates for the center of a circle, expressed as a comma-separated string of latitude and longitude.  Only records included within a circle around this central location are included in the results. The radius of the circle is determined by the `aroundRadius` and `minimumAroundRadius` settings. This parameter is ignored if you also specify `insidePolygon` or `insideBoundingBox`.  """
    around_lat_lng_via_ip: Optional[bool] = None
    """ Whether to obtain the coordinates from the request's IP address. """
    around_radius: Optional[AroundRadius] = None
    around_precision: Optional[AroundPrecision] = None
    minimum_around_radius: Optional[int] = None
    """ Minimum radius (in meters) for a search around a location when `aroundRadius` isn't set. """
    inside_bounding_box: Optional[InsideBoundingBox] = None
    inside_polygon: Optional[List[List[float]]] = None
    """ Coordinates of a polygon in which to search.  Polygons are defined by 3 to 10,000 points. Each point is represented by its latitude and longitude. Provide multiple polygons as nested arrays. For more information, see [filtering inside polygons](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filtering-inside-rectangular-or-polygonal-areas). This parameter is ignored if you also specify `insideBoundingBox`.  """
    natural_languages: Optional[List[SupportedLanguage]] = None
    """ ISO language codes that adjust settings that are useful for processing natural language queries (as opposed to keyword searches):  - Sets `removeStopWords` and `ignorePlurals` to the list of provided languages. - Sets `removeWordsIfNoResults` to `allOptional`. - Adds a `natural_language` attribute to `ruleContexts` and `analyticsTags`.  """
    rule_contexts: Optional[List[str]] = None
    """ Assigns a rule context to the search query.  [Rule contexts](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/how-to/customize-search-results-by-platform/#whats-a-context) are strings that you can use to trigger matching rules.  """
    personalization_impact: Optional[int] = None
    """ Impact that Personalization should have on this search.  The higher this value is, the more Personalization determines the ranking compared to other factors. For more information, see [Understanding Personalization impact](https://www.algolia.com/doc/guides/personalization/personalizing-results/in-depth/configuring-personalization/#understanding-personalization-impact).  """
    user_token: Optional[str] = None
    """ Unique pseudonymous or anonymous user identifier.  This helps with analytics and click and conversion events. For more information, see [user token](https://www.algolia.com/doc/guides/sending-events/concepts/usertoken/).  """
    get_ranking_info: Optional[bool] = None
    """ Whether the search response should include detailed ranking information. """
    synonyms: Optional[bool] = None
    """ Whether to take into account an index's synonyms for this search. """
    click_analytics: Optional[bool] = None
    """ Whether to include a `queryID` attribute in the response.  The query ID is a unique identifier for a search query and is required for tracking [click and conversion events](https://www.algolia.com/guides/sending-events/getting-started/).  """
    analytics: Optional[bool] = None
    """ Whether this search will be included in Analytics. """
    analytics_tags: Optional[List[str]] = None
    """ Tags to apply to the query for [segmenting analytics data](https://www.algolia.com/doc/guides/search-analytics/guides/segments/). """
    percentile_computation: Optional[bool] = None
    """ Whether to include this search when calculating processing-time percentiles. """
    enable_ab_test: Optional[bool] = None
    """ Whether to enable A/B testing for this search. """
    attributes_to_retrieve: Optional[List[str]] = None
    """ Attributes to include in the API response.  To reduce the size of your response, you can retrieve only some of the attributes. Attribute names are case-sensitive.  - `*` retrieves all attributes, except attributes included in the `customRanking` and `unretrievableAttributes` settings. - To retrieve all attributes except a specific one, prefix the attribute with a dash and combine it with the `*`: `[\"*\", \"-ATTRIBUTE\"]`. - The `objectID` attribute is always included.  """
    ranking: Optional[List[str]] = None
    """ Determines the order in which Algolia returns your results.  By default, each entry corresponds to a [ranking criteria](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/). The tie-breaking algorithm sequentially applies each criterion in the order they're specified. If you configure a replica index for [sorting by an attribute](https://www.algolia.com/doc/guides/managing-results/refine-results/sorting/how-to/sort-by-attribute/), you put the sorting attribute at the top of the list.  **Modifiers**  - `asc(\"ATTRIBUTE\")`.   Sort the index by the values of an attribute, in ascending order. - `desc(\"ATTRIBUTE\")`.   Sort the index by the values of an attribute, in descending order.  Before you modify the default setting, you should test your changes in the dashboard, and by [A/B testing](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/).  """
    custom_ranking: Optional[List[str]] = None
    """ Attributes to use as [custom ranking](https://www.algolia.com/doc/guides/managing-results/must-do/custom-ranking/). Attribute names are case-sensitive.  The custom ranking attributes decide which items are shown first if the other ranking criteria are equal.  Records with missing values for your selected custom ranking attributes are always sorted last. Boolean attributes are sorted based on their alphabetical order.  **Modifiers**  - `asc(\"ATTRIBUTE\")`.   Sort the index by the values of an attribute, in ascending order.  - `desc(\"ATTRIBUTE\")`.   Sort the index by the values of an attribute, in descending order.  If you use two or more custom ranking attributes, [reduce the precision](https://www.algolia.com/doc/guides/managing-results/must-do/custom-ranking/how-to/controlling-custom-ranking-metrics-precision/) of your first attributes, or the other attributes will never be applied.  """
    relevancy_strictness: Optional[int] = None
    """ Relevancy threshold below which less relevant results aren't included in the results.  You can only set `relevancyStrictness` on [virtual replica indices](https://www.algolia.com/doc/guides/managing-results/refine-results/sorting/in-depth/replicas/#what-are-virtual-replicas). Use this setting to strike a balance between the relevance and number of returned results.  """
    attributes_to_highlight: Optional[List[str]] = None
    """ Attributes to highlight.  By default, all searchable attributes are highlighted. Use `*` to highlight all attributes or use an empty array `[]` to turn off highlighting. Attribute names are case-sensitive.  With highlighting, strings that match the search query are surrounded by HTML tags defined by `highlightPreTag` and `highlightPostTag`. You can use this to visually highlight matching parts of a search query in your UI.  For more information, see [Highlighting and snippeting](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/highlighting-snippeting/js/).  """
    attributes_to_snippet: Optional[List[str]] = None
    """ Attributes for which to enable snippets. Attribute names are case-sensitive.  Snippets provide additional context to matched words. If you enable snippets, they include 10 words, including the matched word. The matched word will also be wrapped by HTML tags for highlighting. You can adjust the number of words with the following notation: `ATTRIBUTE:NUMBER`, where `NUMBER` is the number of words to be extracted.  """
    highlight_pre_tag: Optional[str] = None
    """ HTML tag to insert before the highlighted parts in all highlighted results and snippets. """
    highlight_post_tag: Optional[str] = None
    """ HTML tag to insert after the highlighted parts in all highlighted results and snippets. """
    snippet_ellipsis_text: Optional[str] = None
    """ String used as an ellipsis indicator when a snippet is truncated. """
    restrict_highlight_and_snippet_arrays: Optional[bool] = None
    """ Whether to restrict highlighting and snippeting to items that at least partially matched the search query. By default, all items are highlighted and snippeted.  """
    hits_per_page: Optional[int] = None
    """ Number of hits per page. """
    min_word_sizefor1_typo: Optional[int] = None
    """ Minimum number of characters a word in the search query must contain to accept matches with [one typo](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos). """
    min_word_sizefor2_typos: Optional[int] = None
    """ Minimum number of characters a word in the search query must contain to accept matches with [two typos](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos). """
    typo_tolerance: Optional[TypoTolerance] = None
    allow_typos_on_numeric_tokens: Optional[bool] = None
    """ Whether to allow typos on numbers in the search query.  Turn off this setting to reduce the number of irrelevant matches when searching in large sets of similar numbers.  """
    disable_typo_tolerance_on_attributes: Optional[List[str]] = None
    """ Attributes for which you want to turn off [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/). Attribute names are case-sensitive.  Returning only exact matches can help when:  - [Searching in hyphenated attributes](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/how-to/how-to-search-in-hyphenated-attributes/). - Reducing the number of matches when you have too many.   This can happen with attributes that are long blocks of text, such as product descriptions.  Consider alternatives such as `disableTypoToleranceOnWords` or adding synonyms if your attributes have intentional unusual spellings that might look like typos.  """
    ignore_plurals: Optional[IgnorePlurals] = None
    remove_stop_words: Optional[RemoveStopWords] = None
    keep_diacritics_on_characters: Optional[str] = None
    """ Characters for which diacritics should be preserved.  By default, Algolia removes diacritics from letters. For example, `é` becomes `e`. If this causes issues in your search, you can specify characters that should keep their diacritics.  """
    query_languages: Optional[List[SupportedLanguage]] = None
    """ Languages for language-specific query processing steps such as plurals, stop-word removal, and word-detection dictionaries.  This setting sets a default list of languages used by the `removeStopWords` and `ignorePlurals` settings. This setting also sets a dictionary for word detection in the logogram-based [CJK](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/#normalization-for-logogram-based-languages-cjk) languages. To support this, you must place the CJK language **first**.  **You should always specify a query language.** If you don't specify an indexing language, the search engine uses all [supported languages](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/supported-languages/), or the languages you specified with the `ignorePlurals` or `removeStopWords` parameters. This can lead to unexpected search results. For more information, see [Language-specific configuration](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/).  """
    decompound_query: Optional[bool] = None
    """ Whether to split compound words in the query into their building blocks.  For more information, see [Word segmentation](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#splitting-compound-words). Word segmentation is supported for these languages: German, Dutch, Finnish, Swedish, and Norwegian. Decompounding doesn't work for words with [non-spacing mark Unicode characters](https://www.charactercodes.net/category/non-spacing_mark). For example, `Gartenstühle` won't be decompounded if the `ü` consists of `u` (U+0075) and `◌̈` (U+0308).  """
    enable_rules: Optional[bool] = None
    """ Whether to enable rules. """
    enable_personalization: Optional[bool] = None
    """ Whether to enable Personalization. """
    query_type: Optional[QueryType] = None
    remove_words_if_no_results: Optional[RemoveWordsIfNoResults] = None
    mode: Optional[Mode] = None
    semantic_search: Optional[SemanticSearch] = None
    advanced_syntax: Optional[bool] = None
    """ Whether to support phrase matching and excluding words from search queries.  Use the `advancedSyntaxFeatures` parameter to control which feature is supported.  """
    optional_words: Optional[OptionalWords] = None
    disable_exact_on_attributes: Optional[List[str]] = None
    """ Searchable attributes for which you want to [turn off the Exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes). Attribute names are case-sensitive.  This can be useful for attributes with long values, where the likelihood of an exact match is high, such as product descriptions. Turning off the Exact ranking criterion for these attributes favors exact matching on other attributes. This reduces the impact of individual attributes with a lot of content on ranking.  """
    exact_on_single_word_query: Optional[ExactOnSingleWordQuery] = None
    alternatives_as_exact: Optional[List[AlternativesAsExact]] = None
    """ Determine which plurals and synonyms should be considered an exact matches.  By default, Algolia treats singular and plural forms of a word, and single-word synonyms, as [exact](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#exact) matches when searching. For example:  - \"swimsuit\" and \"swimsuits\" are treated the same - \"swimsuit\" and \"swimwear\" are treated the same (if they are [synonyms](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/#regular-synonyms)).  - `ignorePlurals`.   Plurals and similar declensions added by the `ignorePlurals` setting are considered exact matches.  - `singleWordSynonym`.   Single-word synonyms, such as \"NY\" = \"NYC\", are considered exact matches.  - `multiWordsSynonym`.   Multi-word synonyms, such as \"NY\" = \"New York\", are considered exact matches.  """
    advanced_syntax_features: Optional[List[AdvancedSyntaxFeatures]] = None
    """ Advanced search syntax features you want to support.  - `exactPhrase`.   Phrases in quotes must match exactly.   For example, `sparkly blue \"iPhone case\"` only returns records with the exact string \"iPhone case\".  - `excludeWords`.   Query words prefixed with a `-` must not occur in a record.   For example, `search -engine` matches records that contain \"search\" but not \"engine\".  This setting only has an effect if `advancedSyntax` is true.  """
    distinct: Optional[Distinct] = None
    replace_synonyms_in_highlight: Optional[bool] = None
    """ Whether to replace a highlighted word with the matched synonym.  By default, the original words are highlighted even if a synonym matches. For example, with `home` as a synonym for `house` and a search for `home`, records matching either \"home\" or \"house\" are included in the search results, and either \"home\" or \"house\" are highlighted.  With `replaceSynonymsInHighlight` set to `true`, a search for `home` still matches the same records, but all occurrences of \"house\" are replaced by \"home\" in the highlighted response.  """
    min_proximity: Optional[int] = None
    """ Minimum proximity score for two matching words.  This adjusts the [Proximity ranking criterion](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#proximity) by equally scoring matches that are farther apart.  For example, if `minProximity` is 2, neighboring matches and matches with one word between them would have the same score.  """
    response_fields: Optional[List[str]] = None
    """ Properties to include in the API response of `search` and `browse` requests.  By default, all response properties are included. To reduce the response size, you can select, which attributes should be included.  You can't exclude these properties: `message`, `warning`, `cursor`, `serverUsed`, `indexUsed`, `abTestVariantID`, `parsedQuery`, or any property triggered by the `getRankingInfo` parameter.  Don't exclude properties that you might need in your search UI.  """
    max_values_per_facet: Optional[int] = None
    """ Maximum number of facet values to return for each facet. """
    sort_facet_values_by: Optional[str] = None
    """ Order in which to retrieve facet values.  - `count`.   Facet values are retrieved by decreasing count.   The count is the number of matching records containing this facet value.  - `alpha`.   Retrieve facet values alphabetically.  This setting doesn't influence how facet values are displayed in your UI (see `renderingContent`). For more information, see [facet value display](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/facet-display/js/).  """
    attribute_criteria_computed_by_min_proximity: Optional[bool] = None
    """ Whether the best matching attribute should be determined by minimum proximity.  This setting only affects ranking if the Attribute ranking criterion comes before Proximity in the `ranking` setting. If true, the best matching attribute is selected based on the minimum proximity of multiple matches. Otherwise, the best matching attribute is determined by the order in the `searchableAttributes` setting.  """
    rendering_content: Optional[RenderingContent] = None
    enable_re_ranking: Optional[bool] = None
    """ Whether this search will use [Dynamic Re-Ranking](https://www.algolia.com/doc/guides/algolia-ai/re-ranking/).  This setting only has an effect if you activated Dynamic Re-Ranking for this index in the Algolia dashboard.  """
    re_ranking_apply_filter: Optional[ReRankingApplyFilter] = None
    facet: str
    """ Facet name. """
    index_name: str
    """ Index name (case-sensitive). """
    facet_query: Optional[str] = None
    """ Text to search inside the facet's values. """
    max_facet_hits: Optional[int] = None
    """ Maximum number of facet values to return when [searching for facet values](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#search-for-facet-values). """
    type: SearchTypeFacet

    model_config = ConfigDict(
        strict=False,
        use_enum_values=True,
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
        alias_generator=_alias_generator,
        extra="allow",
    )

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of SearchForFacets from a JSON string"""
        return cls.from_dict(loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias."""
        return self.model_dump(
            by_alias=True,
            exclude_none=True,
            exclude_unset=True,
        )

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of SearchForFacets from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        obj["facetFilters"] = (
            FacetFilters.from_dict(obj["facetFilters"])
            if obj.get("facetFilters") is not None
            else None
        )
        obj["optionalFilters"] = (
            OptionalFilters.from_dict(obj["optionalFilters"])
            if obj.get("optionalFilters") is not None
            else None
        )
        obj["numericFilters"] = (
            NumericFilters.from_dict(obj["numericFilters"])
            if obj.get("numericFilters") is not None
            else None
        )
        obj["tagFilters"] = (
            TagFilters.from_dict(obj["tagFilters"])
            if obj.get("tagFilters") is not None
            else None
        )
        obj["aroundRadius"] = (
            AroundRadius.from_dict(obj["aroundRadius"])
            if obj.get("aroundRadius") is not None
            else None
        )
        obj["aroundPrecision"] = (
            AroundPrecision.from_dict(obj["aroundPrecision"])
            if obj.get("aroundPrecision") is not None
            else None
        )
        obj["insideBoundingBox"] = (
            InsideBoundingBox.from_dict(obj["insideBoundingBox"])
            if obj.get("insideBoundingBox") is not None
            else None
        )
        obj["naturalLanguages"] = obj.get("naturalLanguages")
        obj["typoTolerance"] = (
            TypoTolerance.from_dict(obj["typoTolerance"])
            if obj.get("typoTolerance") is not None
            else None
        )
        obj["ignorePlurals"] = (
            IgnorePlurals.from_dict(obj["ignorePlurals"])
            if obj.get("ignorePlurals") is not None
            else None
        )
        obj["removeStopWords"] = (
            RemoveStopWords.from_dict(obj["removeStopWords"])
            if obj.get("removeStopWords") is not None
            else None
        )
        obj["queryLanguages"] = obj.get("queryLanguages")
        obj["queryType"] = obj.get("queryType")
        obj["removeWordsIfNoResults"] = obj.get("removeWordsIfNoResults")
        obj["mode"] = obj.get("mode")
        obj["semanticSearch"] = (
            SemanticSearch.from_dict(obj["semanticSearch"])
            if obj.get("semanticSearch") is not None
            else None
        )
        obj["optionalWords"] = (
            OptionalWords.from_dict(obj["optionalWords"])
            if obj.get("optionalWords") is not None
            else None
        )
        obj["exactOnSingleWordQuery"] = obj.get("exactOnSingleWordQuery")
        obj["alternativesAsExact"] = obj.get("alternativesAsExact")
        obj["advancedSyntaxFeatures"] = obj.get("advancedSyntaxFeatures")
        obj["distinct"] = (
            Distinct.from_dict(obj["distinct"])
            if obj.get("distinct") is not None
            else None
        )
        obj["renderingContent"] = (
            RenderingContent.from_dict(obj["renderingContent"])
            if obj.get("renderingContent") is not None
            else None
        )
        obj["reRankingApplyFilter"] = (
            ReRankingApplyFilter.from_dict(obj["reRankingApplyFilter"])
            if obj.get("reRankingApplyFilter") is not None
            else None
        )
        obj["type"] = obj.get("type")

        return cls.model_validate(obj)
