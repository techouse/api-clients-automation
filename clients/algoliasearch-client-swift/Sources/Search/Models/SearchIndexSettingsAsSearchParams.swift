// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

public struct SearchIndexSettingsAsSearchParams: Codable, JSONEncodable {
    /// Attributes to include in the API response.  To reduce the size of your response, you can retrieve only some of
    /// the attributes. Attribute names are case-sensitive.  - `*` retrieves all attributes, except attributes included
    /// in the `customRanking` and `unretrievableAttributes` settings. - To retrieve all attributes except a specific
    /// one, prefix the attribute with a dash and combine it with the `*`: `[\"*\", \"-ATTRIBUTE\"]`. - The `objectID`
    /// attribute is always included.
    public var attributesToRetrieve: [String]?
    /// Determines the order in which Algolia returns your results.  By default, each entry corresponds to a [ranking
    /// criteria](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/).
    /// The tie-breaking algorithm sequentially applies each criterion in the order they're specified. If you configure
    /// a replica index for [sorting by an attribute](https://www.algolia.com/doc/guides/managing-results/refine-results/sorting/how-to/sort-by-attribute/),
    /// you put the sorting attribute at the top of the list.  **Modifiers**  - `asc(\"ATTRIBUTE\")`.   Sort the index
    /// by the values of an attribute, in ascending order. - `desc(\"ATTRIBUTE\")`.   Sort the index by the values of an
    /// attribute, in descending order.  Before you modify the default setting, you should test your changes in the
    /// dashboard, and by [A/B testing](https://www.algolia.com/doc/guides/ab-testing/what-is-ab-testing/).
    public var ranking: [String]?
    /// Attributes to use as [custom
    /// ranking](https://www.algolia.com/doc/guides/managing-results/must-do/custom-ranking/). Attribute names are
    /// case-sensitive.  The custom ranking attributes decide which items are shown first if the other ranking criteria
    /// are equal.  Records with missing values for your selected custom ranking attributes are always sorted last.
    /// Boolean attributes are sorted based on their alphabetical order.  **Modifiers**  - `asc(\"ATTRIBUTE\")`.   Sort
    /// the index by the values of an attribute, in ascending order.  - `desc(\"ATTRIBUTE\")`.   Sort the index by the
    /// values of an attribute, in descending order.  If you use two or more custom ranking attributes, [reduce the precision](https://www.algolia.com/doc/guides/managing-results/must-do/custom-ranking/how-to/controlling-custom-ranking-metrics-precision/)
    /// of your first attributes, or the other attributes will never be applied.
    public var customRanking: [String]?
    /// Relevancy threshold below which less relevant results aren't included in the results.  You can only set
    /// `relevancyStrictness` on [virtual replica indices](https://www.algolia.com/doc/guides/managing-results/refine-results/sorting/in-depth/replicas/#what-are-virtual-replicas).
    /// Use this setting to strike a balance between the relevance and number of returned results.
    public var relevancyStrictness: Int?
    /// Attributes to highlight.  By default, all searchable attributes are highlighted. Use `*` to highlight all
    /// attributes or use an empty array `[]` to turn off highlighting. Attribute names are case-sensitive.  With
    /// highlighting, strings that match the search query are surrounded by HTML tags defined by `highlightPreTag` and
    /// `highlightPostTag`. You can use this to visually highlight matching parts of a search query in your UI.  For
    /// more information, see [Highlighting and snippeting](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/highlighting-snippeting/js/).
    public var attributesToHighlight: [String]?
    /// Attributes for which to enable snippets. Attribute names are case-sensitive.  Snippets provide additional
    /// context to matched words. If you enable snippets, they include 10 words, including the matched word. The matched
    /// word will also be wrapped by HTML tags for highlighting. You can adjust the number of words with the following
    /// notation: `ATTRIBUTE:NUMBER`, where `NUMBER` is the number of words to be extracted.
    public var attributesToSnippet: [String]?
    /// HTML tag to insert before the highlighted parts in all highlighted results and snippets.
    public var highlightPreTag: String?
    /// HTML tag to insert after the highlighted parts in all highlighted results and snippets.
    public var highlightPostTag: String?
    /// String used as an ellipsis indicator when a snippet is truncated.
    public var snippetEllipsisText: String?
    /// Whether to restrict highlighting and snippeting to items that at least partially matched the search query. By
    /// default, all items are highlighted and snippeted.
    public var restrictHighlightAndSnippetArrays: Bool?
    /// Number of hits per page.
    public var hitsPerPage: Int?
    /// Minimum number of characters a word in the search query must contain to accept matches with [one typo](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos).
    public var minWordSizefor1Typo: Int?
    /// Minimum number of characters a word in the search query must contain to accept matches with [two typos](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos).
    public var minWordSizefor2Typos: Int?
    public var typoTolerance: SearchTypoTolerance?
    /// Whether to allow typos on numbers in the search query.  Turn off this setting to reduce the number of irrelevant
    /// matches when searching in large sets of similar numbers.
    public var allowTyposOnNumericTokens: Bool?
    /// Attributes for which you want to turn off [typo
    /// tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/).
    /// Attribute names are case-sensitive.  Returning only exact matches can help when:  - [Searching in hyphenated attributes](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/how-to/how-to-search-in-hyphenated-attributes/).
    /// - Reducing the number of matches when you have too many.   This can happen with attributes that are long blocks
    /// of text, such as product descriptions.  Consider alternatives such as `disableTypoToleranceOnWords` or adding
    /// synonyms if your attributes have intentional unusual spellings that might look like typos.
    public var disableTypoToleranceOnAttributes: [String]?
    public var ignorePlurals: SearchIgnorePlurals?
    public var removeStopWords: SearchRemoveStopWords?
    /// Characters for which diacritics should be preserved.  By default, Algolia removes diacritics from letters. For
    /// example, `é` becomes `e`. If this causes issues in your search, you can specify characters that should keep
    /// their diacritics.
    public var keepDiacriticsOnCharacters: String?
    /// Languages for language-specific query processing steps such as plurals, stop-word removal, and word-detection
    /// dictionaries.  This setting sets a default list of languages used by the `removeStopWords` and `ignorePlurals`
    /// settings. This setting also sets a dictionary for word detection in the logogram-based [CJK](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/#normalization-for-logogram-based-languages-cjk)
    /// languages. To support this, you must place the CJK language **first**.  **You should always specify a query
    /// language.** If you don't specify an indexing language, the search engine uses all [supported languages](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/supported-languages/),
    /// or the languages you specified with the `ignorePlurals` or `removeStopWords` parameters. This can lead to
    /// unexpected search results. For more information, see [Language-specific configuration](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/).
    public var queryLanguages: [SearchSupportedLanguage]?
    /// Whether to split compound words in the query into their building blocks.  For more information, see [Word segmentation](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#splitting-compound-words).
    /// Word segmentation is supported for these languages: German, Dutch, Finnish, Swedish, and Norwegian.
    /// Decompounding doesn't work for words with [non-spacing mark Unicode
    /// characters](https://www.charactercodes.net/category/non-spacing_mark). For example, `Gartenstühle` won't be
    /// decompounded if the `ü` consists of `u` (U+0075) and `◌̈` (U+0308).
    public var decompoundQuery: Bool?
    /// Whether to enable rules.
    public var enableRules: Bool?
    /// Whether to enable Personalization.
    public var enablePersonalization: Bool?
    public var queryType: SearchQueryType?
    public var removeWordsIfNoResults: SearchRemoveWordsIfNoResults?
    public var mode: SearchMode?
    public var semanticSearch: SearchSemanticSearch?
    /// Whether to support phrase matching and excluding words from search queries.  Use the `advancedSyntaxFeatures`
    /// parameter to control which feature is supported.
    public var advancedSyntax: Bool?
    /// Words that should be considered optional when found in the query.  By default, records must match all words in
    /// the search query to be included in the search results. Adding optional words can help to increase the number of
    /// search results by running an additional search query that doesn't include the optional words. For example, if
    /// the search query is \"action video\" and \"video\" is an optional word, the search engine runs two queries. One
    /// for \"action video\" and one for \"action\". Records that match all words are ranked higher.  For a search query
    /// with 4 or more words **and** all its words are optional, the number of matched words required for a record to be
    /// included in the search results increases for every 1,000 records:  - If `optionalWords` has less than 10 words,
    /// the required number of matched words increases by 1:   results 1 to 1,000 require 1 matched word, results 1,001
    /// to 2000 need 2 matched words. - If `optionalWords` has 10 or more words, the number of required matched words
    /// increases by the number of optional words divided by 5 (rounded down).   For example, with 18 optional words:
    /// results 1 to 1,000 require 1 matched word, results 1,001 to 2000 need 4 matched words.  For more information,
    /// see [Optional words](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/empty-or-insufficient-results/#creating-a-list-of-optional-words).
    public var optionalWords: [String]?
    /// Searchable attributes for which you want to [turn off the Exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes).
    /// Attribute names are case-sensitive.  This can be useful for attributes with long values, where the likelihood of
    /// an exact match is high, such as product descriptions. Turning off the Exact ranking criterion for these
    /// attributes favors exact matching on other attributes. This reduces the impact of individual attributes with a
    /// lot of content on ranking.
    public var disableExactOnAttributes: [String]?
    public var exactOnSingleWordQuery: SearchExactOnSingleWordQuery?
    /// Determine which plurals and synonyms should be considered an exact matches.  By default, Algolia treats singular
    /// and plural forms of a word, and single-word synonyms, as
    /// [exact](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#exact)
    /// matches when searching. For example:  - \"swimsuit\" and \"swimsuits\" are treated the same - \"swimsuit\" and
    /// \"swimwear\" are treated the same (if they are [synonyms](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/adding-synonyms/#regular-synonyms)).
    ///  - `ignorePlurals`.   Plurals and similar declensions added by the `ignorePlurals` setting are considered exact
    /// matches.  - `singleWordSynonym`.   Single-word synonyms, such as \"NY\" = \"NYC\", are considered exact matches.
    ///  - `multiWordsSynonym`.   Multi-word synonyms, such as \"NY\" = \"New York\", are considered exact matches.
    public var alternativesAsExact: [SearchAlternativesAsExact]?
    /// Advanced search syntax features you want to support.  - `exactPhrase`.   Phrases in quotes must match exactly.  
    /// For example, `sparkly blue \"iPhone case\"` only returns records with the exact string \"iPhone case\".  -
    /// `excludeWords`.   Query words prefixed with a `-` must not occur in a record.   For example, `search -engine`
    /// matches records that contain \"search\" but not \"engine\".  This setting only has an effect if `advancedSyntax`
    /// is true.
    public var advancedSyntaxFeatures: [SearchAdvancedSyntaxFeatures]?
    public var distinct: SearchDistinct?
    /// Whether to replace a highlighted word with the matched synonym.  By default, the original words are highlighted
    /// even if a synonym matches. For example, with `home` as a synonym for `house` and a search for `home`, records
    /// matching either \"home\" or \"house\" are included in the search results, and either \"home\" or \"house\" are
    /// highlighted.  With `replaceSynonymsInHighlight` set to `true`, a search for `home` still matches the same
    /// records, but all occurrences of \"house\" are replaced by \"home\" in the highlighted response.
    public var replaceSynonymsInHighlight: Bool?
    /// Minimum proximity score for two matching words.  This adjusts the [Proximity ranking criterion](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#proximity)
    /// by equally scoring matches that are farther apart.  For example, if `minProximity` is 2, neighboring matches and
    /// matches with one word between them would have the same score.
    public var minProximity: Int?
    /// Properties to include in the API response of `search` and `browse` requests.  By default, all response
    /// properties are included. To reduce the response size, you can select, which attributes should be included.  You
    /// can't exclude these properties: `message`, `warning`, `cursor`, `serverUsed`, `indexUsed`, `abTestVariantID`,
    /// `parsedQuery`, or any property triggered by the `getRankingInfo` parameter.  Don't exclude properties that you
    /// might need in your search UI.
    public var responseFields: [String]?
    /// Maximum number of facet values to return when [searching for facet
    /// values](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#search-for-facet-values).
    public var maxFacetHits: Int?
    /// Maximum number of facet values to return for each facet.
    public var maxValuesPerFacet: Int?
    /// Order in which to retrieve facet values.  - `count`.   Facet values are retrieved by decreasing count.   The
    /// count is the number of matching records containing this facet value.  - `alpha`.   Retrieve facet values
    /// alphabetically.  This setting doesn't influence how facet values are displayed in your UI (see
    /// `renderingContent`). For more information, see [facet value
    /// display](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/facet-display/js/).
    public var sortFacetValuesBy: String?
    /// Whether the best matching attribute should be determined by minimum proximity.  This setting only affects
    /// ranking if the Attribute ranking criterion comes before Proximity in the `ranking` setting. If true, the best
    /// matching attribute is selected based on the minimum proximity of multiple matches. Otherwise, the best matching
    /// attribute is determined by the order in the `searchableAttributes` setting.
    public var attributeCriteriaComputedByMinProximity: Bool?
    public var renderingContent: SearchRenderingContent?
    /// Whether this search will use [Dynamic Re-Ranking](https://www.algolia.com/doc/guides/algolia-ai/re-ranking/). 
    /// This setting only has an effect if you activated Dynamic Re-Ranking for this index in the Algolia dashboard.
    public var enableReRanking: Bool?
    public var reRankingApplyFilter: SearchReRankingApplyFilter?

    public init(
        attributesToRetrieve: [String]? = nil,
        ranking: [String]? = nil,
        customRanking: [String]? = nil,
        relevancyStrictness: Int? = nil,
        attributesToHighlight: [String]? = nil,
        attributesToSnippet: [String]? = nil,
        highlightPreTag: String? = nil,
        highlightPostTag: String? = nil,
        snippetEllipsisText: String? = nil,
        restrictHighlightAndSnippetArrays: Bool? = nil,
        hitsPerPage: Int? = nil,
        minWordSizefor1Typo: Int? = nil,
        minWordSizefor2Typos: Int? = nil,
        typoTolerance: SearchTypoTolerance? = nil,
        allowTyposOnNumericTokens: Bool? = nil,
        disableTypoToleranceOnAttributes: [String]? = nil,
        ignorePlurals: SearchIgnorePlurals? = nil,
        removeStopWords: SearchRemoveStopWords? = nil,
        keepDiacriticsOnCharacters: String? = nil,
        queryLanguages: [SearchSupportedLanguage]? = nil,
        decompoundQuery: Bool? = nil,
        enableRules: Bool? = nil,
        enablePersonalization: Bool? = nil,
        queryType: SearchQueryType? = nil,
        removeWordsIfNoResults: SearchRemoveWordsIfNoResults? = nil,
        mode: SearchMode? = nil,
        semanticSearch: SearchSemanticSearch? = nil,
        advancedSyntax: Bool? = nil,
        optionalWords: [String]? = nil,
        disableExactOnAttributes: [String]? = nil,
        exactOnSingleWordQuery: SearchExactOnSingleWordQuery? = nil,
        alternativesAsExact: [SearchAlternativesAsExact]? = nil,
        advancedSyntaxFeatures: [SearchAdvancedSyntaxFeatures]? = nil,
        distinct: SearchDistinct? = nil,
        replaceSynonymsInHighlight: Bool? = nil,
        minProximity: Int? = nil,
        responseFields: [String]? = nil,
        maxFacetHits: Int? = nil,
        maxValuesPerFacet: Int? = nil,
        sortFacetValuesBy: String? = nil,
        attributeCriteriaComputedByMinProximity: Bool? = nil,
        renderingContent: SearchRenderingContent? = nil,
        enableReRanking: Bool? = nil,
        reRankingApplyFilter: SearchReRankingApplyFilter? = nil
    ) {
        self.attributesToRetrieve = attributesToRetrieve
        self.ranking = ranking
        self.customRanking = customRanking
        self.relevancyStrictness = relevancyStrictness
        self.attributesToHighlight = attributesToHighlight
        self.attributesToSnippet = attributesToSnippet
        self.highlightPreTag = highlightPreTag
        self.highlightPostTag = highlightPostTag
        self.snippetEllipsisText = snippetEllipsisText
        self.restrictHighlightAndSnippetArrays = restrictHighlightAndSnippetArrays
        self.hitsPerPage = hitsPerPage
        self.minWordSizefor1Typo = minWordSizefor1Typo
        self.minWordSizefor2Typos = minWordSizefor2Typos
        self.typoTolerance = typoTolerance
        self.allowTyposOnNumericTokens = allowTyposOnNumericTokens
        self.disableTypoToleranceOnAttributes = disableTypoToleranceOnAttributes
        self.ignorePlurals = ignorePlurals
        self.removeStopWords = removeStopWords
        self.keepDiacriticsOnCharacters = keepDiacriticsOnCharacters
        self.queryLanguages = queryLanguages
        self.decompoundQuery = decompoundQuery
        self.enableRules = enableRules
        self.enablePersonalization = enablePersonalization
        self.queryType = queryType
        self.removeWordsIfNoResults = removeWordsIfNoResults
        self.mode = mode
        self.semanticSearch = semanticSearch
        self.advancedSyntax = advancedSyntax
        self.optionalWords = optionalWords
        self.disableExactOnAttributes = disableExactOnAttributes
        self.exactOnSingleWordQuery = exactOnSingleWordQuery
        self.alternativesAsExact = alternativesAsExact
        self.advancedSyntaxFeatures = advancedSyntaxFeatures
        self.distinct = distinct
        self.replaceSynonymsInHighlight = replaceSynonymsInHighlight
        self.minProximity = minProximity
        self.responseFields = responseFields
        self.maxFacetHits = maxFacetHits
        self.maxValuesPerFacet = maxValuesPerFacet
        self.sortFacetValuesBy = sortFacetValuesBy
        self.attributeCriteriaComputedByMinProximity = attributeCriteriaComputedByMinProximity
        self.renderingContent = renderingContent
        self.enableReRanking = enableReRanking
        self.reRankingApplyFilter = reRankingApplyFilter
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case attributesToRetrieve
        case ranking
        case customRanking
        case relevancyStrictness
        case attributesToHighlight
        case attributesToSnippet
        case highlightPreTag
        case highlightPostTag
        case snippetEllipsisText
        case restrictHighlightAndSnippetArrays
        case hitsPerPage
        case minWordSizefor1Typo
        case minWordSizefor2Typos
        case typoTolerance
        case allowTyposOnNumericTokens
        case disableTypoToleranceOnAttributes
        case ignorePlurals
        case removeStopWords
        case keepDiacriticsOnCharacters
        case queryLanguages
        case decompoundQuery
        case enableRules
        case enablePersonalization
        case queryType
        case removeWordsIfNoResults
        case mode
        case semanticSearch
        case advancedSyntax
        case optionalWords
        case disableExactOnAttributes
        case exactOnSingleWordQuery
        case alternativesAsExact
        case advancedSyntaxFeatures
        case distinct
        case replaceSynonymsInHighlight
        case minProximity
        case responseFields
        case maxFacetHits
        case maxValuesPerFacet
        case sortFacetValuesBy
        case attributeCriteriaComputedByMinProximity
        case renderingContent
        case enableReRanking
        case reRankingApplyFilter
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(self.attributesToRetrieve, forKey: .attributesToRetrieve)
        try container.encodeIfPresent(self.ranking, forKey: .ranking)
        try container.encodeIfPresent(self.customRanking, forKey: .customRanking)
        try container.encodeIfPresent(self.relevancyStrictness, forKey: .relevancyStrictness)
        try container.encodeIfPresent(self.attributesToHighlight, forKey: .attributesToHighlight)
        try container.encodeIfPresent(self.attributesToSnippet, forKey: .attributesToSnippet)
        try container.encodeIfPresent(self.highlightPreTag, forKey: .highlightPreTag)
        try container.encodeIfPresent(self.highlightPostTag, forKey: .highlightPostTag)
        try container.encodeIfPresent(self.snippetEllipsisText, forKey: .snippetEllipsisText)
        try container.encodeIfPresent(
            self.restrictHighlightAndSnippetArrays,
            forKey: .restrictHighlightAndSnippetArrays
        )
        try container.encodeIfPresent(self.hitsPerPage, forKey: .hitsPerPage)
        try container.encodeIfPresent(self.minWordSizefor1Typo, forKey: .minWordSizefor1Typo)
        try container.encodeIfPresent(self.minWordSizefor2Typos, forKey: .minWordSizefor2Typos)
        try container.encodeIfPresent(self.typoTolerance, forKey: .typoTolerance)
        try container.encodeIfPresent(self.allowTyposOnNumericTokens, forKey: .allowTyposOnNumericTokens)
        try container.encodeIfPresent(self.disableTypoToleranceOnAttributes, forKey: .disableTypoToleranceOnAttributes)
        try container.encodeIfPresent(self.ignorePlurals, forKey: .ignorePlurals)
        try container.encodeIfPresent(self.removeStopWords, forKey: .removeStopWords)
        try container.encodeIfPresent(self.keepDiacriticsOnCharacters, forKey: .keepDiacriticsOnCharacters)
        try container.encodeIfPresent(self.queryLanguages, forKey: .queryLanguages)
        try container.encodeIfPresent(self.decompoundQuery, forKey: .decompoundQuery)
        try container.encodeIfPresent(self.enableRules, forKey: .enableRules)
        try container.encodeIfPresent(self.enablePersonalization, forKey: .enablePersonalization)
        try container.encodeIfPresent(self.queryType, forKey: .queryType)
        try container.encodeIfPresent(self.removeWordsIfNoResults, forKey: .removeWordsIfNoResults)
        try container.encodeIfPresent(self.mode, forKey: .mode)
        try container.encodeIfPresent(self.semanticSearch, forKey: .semanticSearch)
        try container.encodeIfPresent(self.advancedSyntax, forKey: .advancedSyntax)
        try container.encodeIfPresent(self.optionalWords, forKey: .optionalWords)
        try container.encodeIfPresent(self.disableExactOnAttributes, forKey: .disableExactOnAttributes)
        try container.encodeIfPresent(self.exactOnSingleWordQuery, forKey: .exactOnSingleWordQuery)
        try container.encodeIfPresent(self.alternativesAsExact, forKey: .alternativesAsExact)
        try container.encodeIfPresent(self.advancedSyntaxFeatures, forKey: .advancedSyntaxFeatures)
        try container.encodeIfPresent(self.distinct, forKey: .distinct)
        try container.encodeIfPresent(self.replaceSynonymsInHighlight, forKey: .replaceSynonymsInHighlight)
        try container.encodeIfPresent(self.minProximity, forKey: .minProximity)
        try container.encodeIfPresent(self.responseFields, forKey: .responseFields)
        try container.encodeIfPresent(self.maxFacetHits, forKey: .maxFacetHits)
        try container.encodeIfPresent(self.maxValuesPerFacet, forKey: .maxValuesPerFacet)
        try container.encodeIfPresent(self.sortFacetValuesBy, forKey: .sortFacetValuesBy)
        try container.encodeIfPresent(
            self.attributeCriteriaComputedByMinProximity,
            forKey: .attributeCriteriaComputedByMinProximity
        )
        try container.encodeIfPresent(self.renderingContent, forKey: .renderingContent)
        try container.encodeIfPresent(self.enableReRanking, forKey: .enableReRanking)
        try container.encodeIfPresent(self.reRankingApplyFilter, forKey: .reRankingApplyFilter)
    }
}

extension SearchIndexSettingsAsSearchParams: Equatable {
    public static func ==(lhs: SearchIndexSettingsAsSearchParams, rhs: SearchIndexSettingsAsSearchParams) -> Bool {
        lhs.attributesToRetrieve == rhs.attributesToRetrieve &&
            lhs.ranking == rhs.ranking &&
            lhs.customRanking == rhs.customRanking &&
            lhs.relevancyStrictness == rhs.relevancyStrictness &&
            lhs.attributesToHighlight == rhs.attributesToHighlight &&
            lhs.attributesToSnippet == rhs.attributesToSnippet &&
            lhs.highlightPreTag == rhs.highlightPreTag &&
            lhs.highlightPostTag == rhs.highlightPostTag &&
            lhs.snippetEllipsisText == rhs.snippetEllipsisText &&
            lhs.restrictHighlightAndSnippetArrays == rhs.restrictHighlightAndSnippetArrays &&
            lhs.hitsPerPage == rhs.hitsPerPage &&
            lhs.minWordSizefor1Typo == rhs.minWordSizefor1Typo &&
            lhs.minWordSizefor2Typos == rhs.minWordSizefor2Typos &&
            lhs.typoTolerance == rhs.typoTolerance &&
            lhs.allowTyposOnNumericTokens == rhs.allowTyposOnNumericTokens &&
            lhs.disableTypoToleranceOnAttributes == rhs.disableTypoToleranceOnAttributes &&
            lhs.ignorePlurals == rhs.ignorePlurals &&
            lhs.removeStopWords == rhs.removeStopWords &&
            lhs.keepDiacriticsOnCharacters == rhs.keepDiacriticsOnCharacters &&
            lhs.queryLanguages == rhs.queryLanguages &&
            lhs.decompoundQuery == rhs.decompoundQuery &&
            lhs.enableRules == rhs.enableRules &&
            lhs.enablePersonalization == rhs.enablePersonalization &&
            lhs.queryType == rhs.queryType &&
            lhs.removeWordsIfNoResults == rhs.removeWordsIfNoResults &&
            lhs.mode == rhs.mode &&
            lhs.semanticSearch == rhs.semanticSearch &&
            lhs.advancedSyntax == rhs.advancedSyntax &&
            lhs.optionalWords == rhs.optionalWords &&
            lhs.disableExactOnAttributes == rhs.disableExactOnAttributes &&
            lhs.exactOnSingleWordQuery == rhs.exactOnSingleWordQuery &&
            lhs.alternativesAsExact == rhs.alternativesAsExact &&
            lhs.advancedSyntaxFeatures == rhs.advancedSyntaxFeatures &&
            lhs.distinct == rhs.distinct &&
            lhs.replaceSynonymsInHighlight == rhs.replaceSynonymsInHighlight &&
            lhs.minProximity == rhs.minProximity &&
            lhs.responseFields == rhs.responseFields &&
            lhs.maxFacetHits == rhs.maxFacetHits &&
            lhs.maxValuesPerFacet == rhs.maxValuesPerFacet &&
            lhs.sortFacetValuesBy == rhs.sortFacetValuesBy &&
            lhs.attributeCriteriaComputedByMinProximity == rhs.attributeCriteriaComputedByMinProximity &&
            lhs.renderingContent == rhs.renderingContent &&
            lhs.enableReRanking == rhs.enableReRanking &&
            lhs.reRankingApplyFilter == rhs.reRankingApplyFilter
    }
}

extension SearchIndexSettingsAsSearchParams: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.attributesToRetrieve?.hashValue)
        hasher.combine(self.ranking?.hashValue)
        hasher.combine(self.customRanking?.hashValue)
        hasher.combine(self.relevancyStrictness?.hashValue)
        hasher.combine(self.attributesToHighlight?.hashValue)
        hasher.combine(self.attributesToSnippet?.hashValue)
        hasher.combine(self.highlightPreTag?.hashValue)
        hasher.combine(self.highlightPostTag?.hashValue)
        hasher.combine(self.snippetEllipsisText?.hashValue)
        hasher.combine(self.restrictHighlightAndSnippetArrays?.hashValue)
        hasher.combine(self.hitsPerPage?.hashValue)
        hasher.combine(self.minWordSizefor1Typo?.hashValue)
        hasher.combine(self.minWordSizefor2Typos?.hashValue)
        hasher.combine(self.typoTolerance?.hashValue)
        hasher.combine(self.allowTyposOnNumericTokens?.hashValue)
        hasher.combine(self.disableTypoToleranceOnAttributes?.hashValue)
        hasher.combine(self.ignorePlurals?.hashValue)
        hasher.combine(self.removeStopWords?.hashValue)
        hasher.combine(self.keepDiacriticsOnCharacters?.hashValue)
        hasher.combine(self.queryLanguages?.hashValue)
        hasher.combine(self.decompoundQuery?.hashValue)
        hasher.combine(self.enableRules?.hashValue)
        hasher.combine(self.enablePersonalization?.hashValue)
        hasher.combine(self.queryType?.hashValue)
        hasher.combine(self.removeWordsIfNoResults?.hashValue)
        hasher.combine(self.mode?.hashValue)
        hasher.combine(self.semanticSearch?.hashValue)
        hasher.combine(self.advancedSyntax?.hashValue)
        hasher.combine(self.optionalWords?.hashValue)
        hasher.combine(self.disableExactOnAttributes?.hashValue)
        hasher.combine(self.exactOnSingleWordQuery?.hashValue)
        hasher.combine(self.alternativesAsExact?.hashValue)
        hasher.combine(self.advancedSyntaxFeatures?.hashValue)
        hasher.combine(self.distinct?.hashValue)
        hasher.combine(self.replaceSynonymsInHighlight?.hashValue)
        hasher.combine(self.minProximity?.hashValue)
        hasher.combine(self.responseFields?.hashValue)
        hasher.combine(self.maxFacetHits?.hashValue)
        hasher.combine(self.maxValuesPerFacet?.hashValue)
        hasher.combine(self.sortFacetValuesBy?.hashValue)
        hasher.combine(self.attributeCriteriaComputedByMinProximity?.hashValue)
        hasher.combine(self.renderingContent?.hashValue)
        hasher.combine(self.enableReRanking?.hashValue)
        hasher.combine(self.reRankingApplyFilter?.hashValue)
    }
}
