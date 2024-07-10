// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package requestse2e

import (
	"encoding/json"
	"gotests/tests"
	"os"
	"testing"

	"github.com/kinbiko/jsonassert"
	"github.com/stretchr/testify/require"

	"github.com/joho/godotenv"

	"github.com/algolia/algoliasearch-client-go/v4/algolia/search"
)

func createE2ESearchClient(t *testing.T) *search.APIClient {
	t.Helper()

	appID := os.Getenv("ALGOLIA_APPLICATION_ID")
	if appID == "" && os.Getenv("CI") != "true" {
		err := godotenv.Load("../../../../.env")
		require.NoError(t, err)
		appID = os.Getenv("ALGOLIA_APPLICATION_ID")
	}
	apiKey := os.Getenv("ALGOLIA_ADMIN_KEY")
	client, err := search.NewClient(appID, apiKey)
	require.NoError(t, err)

	return client
}

func TestSearchE2E_Browse(t *testing.T) {
	t.Run("browse with minimal parameters", func(t *testing.T) {
		client := createE2ESearchClient(t)
		res, err := client.Browse(client.NewApiBrowseRequest(
			"cts_e2e_browse",
		))
		require.NoError(t, err)
		_ = res

		rawBody, err := json.Marshal(res)
		require.NoError(t, err)

		var rawBodyMap any
		err = json.Unmarshal(rawBody, &rawBodyMap)
		require.NoError(t, err)

		expectedBodyRaw := `{"page":0,"nbHits":33191,"nbPages":34,"hitsPerPage":1000,"query":"","params":""}`
		var expectedBody any
		err = json.Unmarshal([]byte(expectedBodyRaw), &expectedBody)
		require.NoError(t, err)

		unionBody := tests.Union(expectedBody, rawBodyMap)
		unionBodyRaw, err := json.Marshal(unionBody)
		require.NoError(t, err)

		jsonassert.New(t).Assertf(string(unionBodyRaw), expectedBodyRaw)
	})
}

func TestSearchE2E_GetSettings(t *testing.T) {
	t.Run("getSettings", func(t *testing.T) {
		client := createE2ESearchClient(t)
		res, err := client.GetSettings(client.NewApiGetSettingsRequest(
			"cts_e2e_settings",
		))
		require.NoError(t, err)
		_ = res

		rawBody, err := json.Marshal(res)
		require.NoError(t, err)

		var rawBodyMap any
		err = json.Unmarshal(rawBody, &rawBodyMap)
		require.NoError(t, err)

		expectedBodyRaw := `{"minWordSizefor1Typo":4,"minWordSizefor2Typos":8,"hitsPerPage":100,"maxValuesPerFacet":100,"paginationLimitedTo":10,"exactOnSingleWordQuery":"attribute","ranking":["typo","geo","words","filters","proximity","attribute","exact","custom"],"separatorsToIndex":"","removeWordsIfNoResults":"none","queryType":"prefixLast","highlightPreTag":"<em>","highlightPostTag":"</em>","alternativesAsExact":["ignorePlurals","singleWordSynonym"]}`
		var expectedBody any
		err = json.Unmarshal([]byte(expectedBodyRaw), &expectedBody)
		require.NoError(t, err)

		unionBody := tests.Union(expectedBody, rawBodyMap)
		unionBodyRaw, err := json.Marshal(unionBody)
		require.NoError(t, err)

		jsonassert.New(t).Assertf(string(unionBodyRaw), expectedBodyRaw)
	})
}

func TestSearchE2E_Search(t *testing.T) {
	t.Run("search for a single hits request with minimal parameters", func(t *testing.T) {
		client := createE2ESearchClient(t)
		res, err := client.Search(client.NewApiSearchRequest(

			search.NewEmptySearchMethodParams().SetRequests(
				[]search.SearchQuery{*search.SearchForHitsAsSearchQuery(
					search.NewEmptySearchForHits().SetIndexName("cts_e2e_search_empty_index"))}),
		))
		require.NoError(t, err)
		_ = res

		rawBody, err := json.Marshal(res)
		require.NoError(t, err)

		var rawBodyMap any
		err = json.Unmarshal(rawBody, &rawBodyMap)
		require.NoError(t, err)

		expectedBodyRaw := `{"results":[{"hits":[],"page":0,"nbHits":0,"nbPages":0,"hitsPerPage":20,"exhaustiveNbHits":true,"exhaustiveTypo":true,"exhaustive":{"nbHits":true,"typo":true},"query":"","params":"","index":"cts_e2e_search_empty_index","renderingContent":{}}]}`
		var expectedBody any
		err = json.Unmarshal([]byte(expectedBodyRaw), &expectedBody)
		require.NoError(t, err)

		unionBody := tests.Union(expectedBody, rawBodyMap)
		unionBodyRaw, err := json.Marshal(unionBody)
		require.NoError(t, err)

		jsonassert.New(t).Assertf(string(unionBodyRaw), expectedBodyRaw)
	})
	t.Run("search for a single facet request with minimal parameters", func(t *testing.T) {
		client := createE2ESearchClient(t)
		res, err := client.Search(client.NewApiSearchRequest(

			search.NewEmptySearchMethodParams().SetRequests(
				[]search.SearchQuery{*search.SearchForFacetsAsSearchQuery(
					search.NewEmptySearchForFacets().SetIndexName("cts_e2e_search_facet").SetType(search.SearchTypeFacet("facet")).SetFacet("editor"))}).SetStrategy(search.SearchStrategy("stopIfEnoughMatches")),
		))
		require.NoError(t, err)
		_ = res

		rawBody, err := json.Marshal(res)
		require.NoError(t, err)

		var rawBodyMap any
		err = json.Unmarshal(rawBody, &rawBodyMap)
		require.NoError(t, err)

		expectedBodyRaw := `{"results":[{"exhaustiveFacetsCount":true,"facetHits":[{"count":1,"highlighted":"goland","value":"goland"},{"count":1,"highlighted":"neovim","value":"neovim"},{"count":1,"highlighted":"visual studio","value":"visual studio"},{"count":1,"highlighted":"vscode","value":"vscode"}]}]}`
		var expectedBody any
		err = json.Unmarshal([]byte(expectedBodyRaw), &expectedBody)
		require.NoError(t, err)

		unionBody := tests.Union(expectedBody, rawBodyMap)
		unionBodyRaw, err := json.Marshal(unionBody)
		require.NoError(t, err)

		jsonassert.New(t).Assertf(string(unionBodyRaw), expectedBodyRaw)
	})
	t.Run("search filters end to end", func(t *testing.T) {
		client := createE2ESearchClient(t)
		res, err := client.Search(client.NewApiSearchRequest(

			search.NewEmptySearchMethodParams().SetRequests(
				[]search.SearchQuery{*search.SearchForHitsAsSearchQuery(
					search.NewEmptySearchForHits().SetIndexName("cts_e2e_search_facet").SetFilters("editor:'visual studio' OR editor:neovim")), *search.SearchForHitsAsSearchQuery(
					search.NewEmptySearchForHits().SetIndexName("cts_e2e_search_facet").SetFacetFilters(search.ArrayOfFacetFiltersAsFacetFilters(
						[]search.FacetFilters{*search.StringAsFacetFilters("editor:'visual studio'"), *search.StringAsFacetFilters("editor:neovim")}))), *search.SearchForHitsAsSearchQuery(
					search.NewEmptySearchForHits().SetIndexName("cts_e2e_search_facet").SetFacetFilters(search.ArrayOfFacetFiltersAsFacetFilters(
						[]search.FacetFilters{*search.StringAsFacetFilters("editor:'visual studio'"), *search.ArrayOfFacetFiltersAsFacetFilters(
							[]search.FacetFilters{*search.StringAsFacetFilters("editor:neovim")})}))), *search.SearchForHitsAsSearchQuery(
					search.NewEmptySearchForHits().SetIndexName("cts_e2e_search_facet").SetFacetFilters(search.ArrayOfFacetFiltersAsFacetFilters(
						[]search.FacetFilters{*search.StringAsFacetFilters("editor:'visual studio'"), *search.ArrayOfFacetFiltersAsFacetFilters(
							[]search.FacetFilters{*search.StringAsFacetFilters("editor:neovim"), *search.ArrayOfFacetFiltersAsFacetFilters(
								[]search.FacetFilters{*search.StringAsFacetFilters("editor:goland")})})})))}),
		))
		require.NoError(t, err)
		_ = res

		rawBody, err := json.Marshal(res)
		require.NoError(t, err)

		var rawBodyMap any
		err = json.Unmarshal(rawBody, &rawBodyMap)
		require.NoError(t, err)

		expectedBodyRaw := `{"results":[{"hitsPerPage":20,"index":"cts_e2e_search_facet","nbHits":2,"nbPages":1,"page":0,"hits":[{"editor":"visual studio","_highlightResult":{"editor":{"value":"visual studio","matchLevel":"none"}}},{"editor":"neovim","_highlightResult":{"editor":{"value":"neovim","matchLevel":"none"}}}],"query":"","params":"filters=editor%%3A%%27visual+studio%%27+OR+editor%%3Aneovim"},{"hitsPerPage":20,"index":"cts_e2e_search_facet","nbHits":0,"nbPages":0,"page":0,"hits":[],"query":"","params":"facetFilters=%%5B%%22editor%%3A%%27visual+studio%%27%%22%%2C%%22editor%%3Aneovim%%22%%5D"},{"hitsPerPage":20,"index":"cts_e2e_search_facet","nbHits":0,"nbPages":0,"page":0,"hits":[],"query":"","params":"facetFilters=%%5B%%22editor%%3A%%27visual+studio%%27%%22%%2C%%5B%%22editor%%3Aneovim%%22%%5D%%5D"},{"hitsPerPage":20,"index":"cts_e2e_search_facet","nbHits":0,"nbPages":0,"page":0,"hits":[],"query":"","params":"facetFilters=%%5B%%22editor%%3A%%27visual+studio%%27%%22%%2C%%5B%%22editor%%3Aneovim%%22%%2C%%5B%%22editor%%3Agoland%%22%%5D%%5D%%5D"}]}`
		var expectedBody any
		err = json.Unmarshal([]byte(expectedBodyRaw), &expectedBody)
		require.NoError(t, err)

		unionBody := tests.Union(expectedBody, rawBodyMap)
		unionBodyRaw, err := json.Marshal(unionBody)
		require.NoError(t, err)

		jsonassert.New(t).Assertf(string(unionBodyRaw), expectedBodyRaw)
	})
}

func TestSearchE2E_SearchDictionaryEntries(t *testing.T) {
	t.Run("get searchDictionaryEntries results with minimal parameters", func(t *testing.T) {
		client := createE2ESearchClient(t)
		res, err := client.SearchDictionaryEntries(client.NewApiSearchDictionaryEntriesRequest(
			search.DictionaryType("stopwords"),
			search.NewEmptySearchDictionaryEntriesParams().SetQuery("about"),
		))
		require.NoError(t, err)
		_ = res

		rawBody, err := json.Marshal(res)
		require.NoError(t, err)

		var rawBodyMap any
		err = json.Unmarshal(rawBody, &rawBodyMap)
		require.NoError(t, err)

		expectedBodyRaw := `{"hits":[{"objectID":"86ef58032f47d976ca7130a896086783","language":"en","word":"about"}],"page":0,"nbHits":1,"nbPages":1}`
		var expectedBody any
		err = json.Unmarshal([]byte(expectedBodyRaw), &expectedBody)
		require.NoError(t, err)

		unionBody := tests.Union(expectedBody, rawBodyMap)
		unionBodyRaw, err := json.Marshal(unionBody)
		require.NoError(t, err)

		jsonassert.New(t).Assertf(string(unionBodyRaw), expectedBodyRaw)
	})
}

func TestSearchE2E_SearchSingleIndex(t *testing.T) {
	t.Run("search with special characters in indexName", func(t *testing.T) {
		client := createE2ESearchClient(t)
		res, err := client.SearchSingleIndex(client.NewApiSearchSingleIndexRequest(
			"cts_e2e_space in index",
		))
		require.NoError(t, err)
		_ = res

	})
	t.Run("single search retrieve snippets", func(t *testing.T) {
		client := createE2ESearchClient(t)
		res, err := client.SearchSingleIndex(client.NewApiSearchSingleIndexRequest(
			"cts_e2e_browse",
		).WithSearchParams(search.SearchParamsObjectAsSearchParams(
			search.NewEmptySearchParamsObject().SetQuery("batman mask of the phantasm").SetAttributesToRetrieve(
				[]string{"*"}).SetAttributesToSnippet(
				[]string{"*:20"}))))
		require.NoError(t, err)
		_ = res

		rawBody, err := json.Marshal(res)
		require.NoError(t, err)

		var rawBodyMap any
		err = json.Unmarshal(rawBody, &rawBodyMap)
		require.NoError(t, err)

		expectedBodyRaw := `{"nbHits":1,"hits":[{"_snippetResult":{"genres":[{"value":"Animated","matchLevel":"none"},{"value":"Superhero","matchLevel":"none"},{"value":"Romance","matchLevel":"none"}],"year":{"value":"1993","matchLevel":"none"}},"_highlightResult":{"genres":[{"value":"Animated","matchLevel":"none","matchedWords":[]},{"value":"Superhero","matchLevel":"none","matchedWords":[]},{"value":"Romance","matchLevel":"none","matchedWords":[]}],"year":{"value":"1993","matchLevel":"none","matchedWords":[]}}}]}`
		var expectedBody any
		err = json.Unmarshal([]byte(expectedBodyRaw), &expectedBody)
		require.NoError(t, err)

		unionBody := tests.Union(expectedBody, rawBodyMap)
		unionBodyRaw, err := json.Marshal(unionBody)
		require.NoError(t, err)

		jsonassert.New(t).Assertf(string(unionBodyRaw), expectedBodyRaw)
	})
}

func TestSearchE2E_SetSettings(t *testing.T) {
	t.Run("setSettings with minimal parameters", func(t *testing.T) {
		client := createE2ESearchClient(t)
		res, err := client.SetSettings(client.NewApiSetSettingsRequest(
			"cts_e2e_settings",
			search.NewEmptyIndexSettings().SetPaginationLimitedTo(10),
		).WithForwardToReplicas(true))
		require.NoError(t, err)
		_ = res

	})
}
