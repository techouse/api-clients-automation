import type { EchoResponse, RequestOptions } from '@algolia/client-common';
import { echoRequester } from '@algolia/requester-node-http';
import { liteClient } from 'algoliasearch/lite';
import * as dotenv from 'dotenv';

import { union } from '../helpers';

dotenv.config({ path: '../../.env' });

const appId = process.env.ALGOLIA_APPLICATION_ID || 'test_app_id';
const apiKey = process.env.ALGOLIA_SEARCH_KEY || 'test_api_key';

const client = liteClient(appId, apiKey, { requester: echoRequester() });

if (!process.env.ALGOLIA_APPLICATION_ID) {
  throw new Error(
    'please provide an `ALGOLIA_APPLICATION_ID` env var for e2e tests'
  );
}

if (!process.env.ALGOLIA_ADMIN_KEY) {
  throw new Error(
    'please provide an `ALGOLIA_ADMIN_KEY` env var for e2e tests'
  );
}

const e2eClient = liteClient(
  process.env.ALGOLIA_APPLICATION_ID,
  process.env.ALGOLIA_ADMIN_KEY
);

describe('customPost', () => {
  test('allow post method for a custom path with minimal parameters', async () => {
    const req = (await client.customPost({
      path: '/test/minimal',
    })) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/test/minimal');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({});
    expect(req.searchParams).toStrictEqual(undefined);
  });

  test('allow post method for a custom path with all parameters', async () => {
    const req = (await client.customPost({
      path: '/test/all',
      parameters: { query: 'parameters' },
      body: { body: 'parameters' },
    })) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/test/all');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({ body: 'parameters' });
    expect(req.searchParams).toStrictEqual({ query: 'parameters' });
  });

  test('requestOptions can override default query parameters', async () => {
    const requestOptions: RequestOptions = {
      queryParameters: { query: 'myQueryParameter' },
    };

    const req = (await client.customPost(
      {
        path: '/test/requestOptions',
        parameters: { query: 'parameters' },
        body: { facet: 'filters' },
      },
      requestOptions
    )) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/test/requestOptions');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({ facet: 'filters' });
    expect(req.searchParams).toStrictEqual({ query: 'myQueryParameter' });
  });

  test('requestOptions merges query parameters with default ones', async () => {
    const requestOptions: RequestOptions = {
      queryParameters: { query2: 'myQueryParameter' },
    };

    const req = (await client.customPost(
      {
        path: '/test/requestOptions',
        parameters: { query: 'parameters' },
        body: { facet: 'filters' },
      },
      requestOptions
    )) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/test/requestOptions');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({ facet: 'filters' });
    expect(req.searchParams).toStrictEqual({
      query: 'parameters',
      query2: 'myQueryParameter',
    });
  });

  test('requestOptions can override default headers', async () => {
    const requestOptions: RequestOptions = {
      headers: { 'x-algolia-api-key': 'myApiKey' },
    };

    const req = (await client.customPost(
      {
        path: '/test/requestOptions',
        parameters: { query: 'parameters' },
        body: { facet: 'filters' },
      },
      requestOptions
    )) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/test/requestOptions');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({ facet: 'filters' });
    expect(req.searchParams).toStrictEqual({ query: 'parameters' });
    expect(req.headers).toEqual(
      expect.objectContaining({ 'x-algolia-api-key': 'myApiKey' })
    );
  });

  test('requestOptions merges headers with default ones', async () => {
    const requestOptions: RequestOptions = {
      headers: { 'x-algolia-api-key': 'myApiKey' },
    };

    const req = (await client.customPost(
      {
        path: '/test/requestOptions',
        parameters: { query: 'parameters' },
        body: { facet: 'filters' },
      },
      requestOptions
    )) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/test/requestOptions');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({ facet: 'filters' });
    expect(req.searchParams).toStrictEqual({ query: 'parameters' });
    expect(req.headers).toEqual(
      expect.objectContaining({ 'x-algolia-api-key': 'myApiKey' })
    );
  });

  test('requestOptions queryParameters accepts booleans', async () => {
    const requestOptions: RequestOptions = {
      queryParameters: { isItWorking: true },
    };

    const req = (await client.customPost(
      {
        path: '/test/requestOptions',
        parameters: { query: 'parameters' },
        body: { facet: 'filters' },
      },
      requestOptions
    )) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/test/requestOptions');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({ facet: 'filters' });
    expect(req.searchParams).toStrictEqual({
      query: 'parameters',
      isItWorking: 'true',
    });
  });

  test('requestOptions queryParameters accepts integers', async () => {
    const requestOptions: RequestOptions = {
      queryParameters: { myParam: 2 },
    };

    const req = (await client.customPost(
      {
        path: '/test/requestOptions',
        parameters: { query: 'parameters' },
        body: { facet: 'filters' },
      },
      requestOptions
    )) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/test/requestOptions');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({ facet: 'filters' });
    expect(req.searchParams).toStrictEqual({
      query: 'parameters',
      myParam: '2',
    });
  });

  test('requestOptions queryParameters accepts list of string', async () => {
    const requestOptions: RequestOptions = {
      queryParameters: { myParam: ['c', 'd'] },
    };

    const req = (await client.customPost(
      {
        path: '/test/requestOptions',
        parameters: { query: 'parameters' },
        body: { facet: 'filters' },
      },
      requestOptions
    )) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/test/requestOptions');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({ facet: 'filters' });
    expect(req.searchParams).toStrictEqual({
      query: 'parameters',
      myParam: 'c,d',
    });
  });

  test('requestOptions queryParameters accepts list of booleans', async () => {
    const requestOptions: RequestOptions = {
      queryParameters: { myParam: [true, true, false] },
    };

    const req = (await client.customPost(
      {
        path: '/test/requestOptions',
        parameters: { query: 'parameters' },
        body: { facet: 'filters' },
      },
      requestOptions
    )) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/test/requestOptions');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({ facet: 'filters' });
    expect(req.searchParams).toStrictEqual({
      query: 'parameters',
      myParam: 'true,true,false',
    });
  });

  test('requestOptions queryParameters accepts list of integers', async () => {
    const requestOptions: RequestOptions = {
      queryParameters: { myParam: [1, 2] },
    };

    const req = (await client.customPost(
      {
        path: '/test/requestOptions',
        parameters: { query: 'parameters' },
        body: { facet: 'filters' },
      },
      requestOptions
    )) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/test/requestOptions');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({ facet: 'filters' });
    expect(req.searchParams).toStrictEqual({
      query: 'parameters',
      myParam: '1,2',
    });
  });
});

describe('search', () => {
  test('search for a single hits request with minimal parameters', async () => {
    const req = (await client.search({
      requests: [{ indexName: 'cts_e2e_search_empty_index' }],
    })) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/indexes/*/queries');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({
      requests: [{ indexName: 'cts_e2e_search_empty_index' }],
    });
    expect(req.searchParams).toStrictEqual(undefined);

    const resp = await e2eClient.search({
      requests: [{ indexName: 'cts_e2e_search_empty_index' }],
    });

    const expectedBody = {
      results: [
        {
          hits: [],
          page: 0,
          nbHits: 0,
          nbPages: 0,
          hitsPerPage: 20,
          exhaustiveNbHits: true,
          exhaustiveTypo: true,
          exhaustive: { nbHits: true, typo: true },
          query: '',
          params: '',
          index: 'cts_e2e_search_empty_index',
          renderingContent: {},
        },
      ],
    };

    expect(expectedBody).toEqual(union(expectedBody, resp));
  });

  test('search for a single facet request with minimal parameters', async () => {
    const req = (await client.search({
      requests: [
        { indexName: 'cts_e2e_search_facet', type: 'facet', facet: 'editor' },
      ],
      strategy: 'stopIfEnoughMatches',
    })) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/indexes/*/queries');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({
      requests: [
        { indexName: 'cts_e2e_search_facet', type: 'facet', facet: 'editor' },
      ],
      strategy: 'stopIfEnoughMatches',
    });
    expect(req.searchParams).toStrictEqual(undefined);

    const resp = await e2eClient.search({
      requests: [
        { indexName: 'cts_e2e_search_facet', type: 'facet', facet: 'editor' },
      ],
      strategy: 'stopIfEnoughMatches',
    });

    const expectedBody = {
      results: [
        {
          exhaustiveFacetsCount: true,
          facetHits: [
            { count: 1, highlighted: 'goland', value: 'goland' },
            { count: 1, highlighted: 'neovim', value: 'neovim' },
            { count: 1, highlighted: 'vscode', value: 'vscode' },
          ],
        },
      ],
    };

    expect(expectedBody).toEqual(union(expectedBody, resp));
  });

  test('search for a single hits request with all parameters', async () => {
    const req = (await client.search({
      requests: [
        {
          indexName: 'theIndexName',
          query: 'myQuery',
          hitsPerPage: 50,
          type: 'default',
        },
      ],
    })) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/indexes/*/queries');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({
      requests: [
        {
          indexName: 'theIndexName',
          query: 'myQuery',
          hitsPerPage: 50,
          type: 'default',
        },
      ],
    });
    expect(req.searchParams).toStrictEqual(undefined);
  });

  test('search for a single facet request with all parameters', async () => {
    const req = (await client.search({
      requests: [
        {
          indexName: 'theIndexName',
          type: 'facet',
          facet: 'theFacet',
          facetQuery: 'theFacetQuery',
          query: 'theQuery',
          maxFacetHits: 50,
        },
      ],
      strategy: 'stopIfEnoughMatches',
    })) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/indexes/*/queries');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({
      requests: [
        {
          indexName: 'theIndexName',
          type: 'facet',
          facet: 'theFacet',
          facetQuery: 'theFacetQuery',
          query: 'theQuery',
          maxFacetHits: 50,
        },
      ],
      strategy: 'stopIfEnoughMatches',
    });
    expect(req.searchParams).toStrictEqual(undefined);
  });

  test('search for multiple mixed requests in multiple indices with minimal parameters', async () => {
    const req = (await client.search({
      requests: [
        { indexName: 'theIndexName' },
        { indexName: 'theIndexName2', type: 'facet', facet: 'theFacet' },
        { indexName: 'theIndexName', type: 'default' },
      ],
      strategy: 'stopIfEnoughMatches',
    })) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/indexes/*/queries');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({
      requests: [
        { indexName: 'theIndexName' },
        { indexName: 'theIndexName2', type: 'facet', facet: 'theFacet' },
        { indexName: 'theIndexName', type: 'default' },
      ],
      strategy: 'stopIfEnoughMatches',
    });
    expect(req.searchParams).toStrictEqual(undefined);
  });

  test('search for multiple mixed requests in multiple indices with all parameters', async () => {
    const req = (await client.search({
      requests: [
        {
          indexName: 'theIndexName',
          type: 'facet',
          facet: 'theFacet',
          facetQuery: 'theFacetQuery',
          query: 'theQuery',
          maxFacetHits: 50,
        },
        {
          indexName: 'theIndexName',
          query: 'myQuery',
          hitsPerPage: 50,
          type: 'default',
        },
      ],
      strategy: 'stopIfEnoughMatches',
    })) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/indexes/*/queries');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({
      requests: [
        {
          indexName: 'theIndexName',
          type: 'facet',
          facet: 'theFacet',
          facetQuery: 'theFacetQuery',
          query: 'theQuery',
          maxFacetHits: 50,
        },
        {
          indexName: 'theIndexName',
          query: 'myQuery',
          hitsPerPage: 50,
          type: 'default',
        },
      ],
      strategy: 'stopIfEnoughMatches',
    });
    expect(req.searchParams).toStrictEqual(undefined);
  });

  test('search filters accept all of the possible shapes', async () => {
    const req = (await client.search({
      requests: [
        {
          indexName: 'theIndexName',
          facetFilters: 'mySearch:filters',
          reRankingApplyFilter: 'mySearch:filters',
          tagFilters: 'mySearch:filters',
          numericFilters: 'mySearch:filters',
          optionalFilters: 'mySearch:filters',
        },
        {
          indexName: 'theIndexName',
          facetFilters: ['mySearch:filters', ['mySearch:filters']],
          reRankingApplyFilter: ['mySearch:filters', ['mySearch:filters']],
          tagFilters: ['mySearch:filters', ['mySearch:filters']],
          numericFilters: ['mySearch:filters', ['mySearch:filters']],
          optionalFilters: ['mySearch:filters', ['mySearch:filters']],
        },
      ],
    })) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/indexes/*/queries');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({
      requests: [
        {
          indexName: 'theIndexName',
          facetFilters: 'mySearch:filters',
          reRankingApplyFilter: 'mySearch:filters',
          tagFilters: 'mySearch:filters',
          numericFilters: 'mySearch:filters',
          optionalFilters: 'mySearch:filters',
        },
        {
          indexName: 'theIndexName',
          facetFilters: ['mySearch:filters', ['mySearch:filters']],
          reRankingApplyFilter: ['mySearch:filters', ['mySearch:filters']],
          tagFilters: ['mySearch:filters', ['mySearch:filters']],
          numericFilters: ['mySearch:filters', ['mySearch:filters']],
          optionalFilters: ['mySearch:filters', ['mySearch:filters']],
        },
      ],
    });
    expect(req.searchParams).toStrictEqual(undefined);
  });

  test('search with all search parameters', async () => {
    const req = (await client.search({
      requests: [
        {
          advancedSyntax: true,
          advancedSyntaxFeatures: ['exactPhrase'],
          allowTyposOnNumericTokens: true,
          alternativesAsExact: ['multiWordsSynonym'],
          analytics: true,
          analyticsTags: [''],
          aroundLatLng: '',
          aroundLatLngViaIP: true,
          aroundPrecision: 0,
          aroundRadius: 'all',
          attributeCriteriaComputedByMinProximity: true,
          attributesForFaceting: [''],
          attributesToHighlight: [''],
          attributesToRetrieve: [''],
          attributesToSnippet: [''],
          clickAnalytics: true,
          customRanking: [''],
          decompoundQuery: true,
          disableExactOnAttributes: [''],
          disableTypoToleranceOnAttributes: [''],
          distinct: 0,
          enableABTest: true,
          enablePersonalization: true,
          enableReRanking: true,
          enableRules: true,
          exactOnSingleWordQuery: 'attribute',
          explain: ['foo', 'bar'],
          facetFilters: [''],
          facetingAfterDistinct: true,
          facets: [''],
          filters: '',
          getRankingInfo: true,
          highlightPostTag: '',
          highlightPreTag: '',
          hitsPerPage: 1,
          ignorePlurals: false,
          indexName: 'theIndexName',
          insideBoundingBox: [
            [47.3165, 4.9665, 47.3424, 5.0201],
            [40.9234, 2.1185, 38.643, 1.9916],
          ],
          insidePolygon: [
            [47.3165, 4.9665, 47.3424, 5.0201, 47.32, 4.9],
            [40.9234, 2.1185, 38.643, 1.9916, 39.2587, 2.0104],
          ],
          keepDiacriticsOnCharacters: '',
          length: 1,
          maxValuesPerFacet: 0,
          minProximity: 1,
          minWordSizefor1Typo: 0,
          minWordSizefor2Typos: 0,
          minimumAroundRadius: 1,
          naturalLanguages: [''],
          numericFilters: [''],
          offset: 0,
          optionalFilters: [''],
          optionalWords: [''],
          page: 0,
          percentileComputation: true,
          personalizationImpact: 0,
          query: '',
          queryLanguages: [''],
          queryType: 'prefixAll',
          ranking: [''],
          reRankingApplyFilter: [''],
          relevancyStrictness: 0,
          removeStopWords: true,
          removeWordsIfNoResults: 'allOptional',
          renderingContent: {
            facetOrdering: {
              facets: { order: ['a', 'b'] },
              values: { a: { order: ['b'], sortRemainingBy: 'count' } },
            },
          },
          replaceSynonymsInHighlight: true,
          responseFields: [''],
          restrictHighlightAndSnippetArrays: true,
          restrictSearchableAttributes: [''],
          ruleContexts: [''],
          similarQuery: '',
          snippetEllipsisText: '',
          sortFacetValuesBy: '',
          sumOrFiltersScores: true,
          synonyms: true,
          tagFilters: [''],
          type: 'default',
          typoTolerance: 'min',
          userToken: '',
        },
      ],
    })) as unknown as EchoResponse;

    expect(req.path).toEqual('/1/indexes/*/queries');
    expect(req.method).toEqual('POST');
    expect(req.data).toEqual({
      requests: [
        {
          advancedSyntax: true,
          advancedSyntaxFeatures: ['exactPhrase'],
          allowTyposOnNumericTokens: true,
          alternativesAsExact: ['multiWordsSynonym'],
          analytics: true,
          analyticsTags: [''],
          aroundLatLng: '',
          aroundLatLngViaIP: true,
          aroundPrecision: 0,
          aroundRadius: 'all',
          attributeCriteriaComputedByMinProximity: true,
          attributesForFaceting: [''],
          attributesToHighlight: [''],
          attributesToRetrieve: [''],
          attributesToSnippet: [''],
          clickAnalytics: true,
          customRanking: [''],
          decompoundQuery: true,
          disableExactOnAttributes: [''],
          disableTypoToleranceOnAttributes: [''],
          distinct: 0,
          enableABTest: true,
          enablePersonalization: true,
          enableReRanking: true,
          enableRules: true,
          exactOnSingleWordQuery: 'attribute',
          explain: ['foo', 'bar'],
          facetFilters: [''],
          facetingAfterDistinct: true,
          facets: [''],
          filters: '',
          getRankingInfo: true,
          highlightPostTag: '',
          highlightPreTag: '',
          hitsPerPage: 1,
          ignorePlurals: false,
          indexName: 'theIndexName',
          insideBoundingBox: [
            [47.3165, 4.9665, 47.3424, 5.0201],
            [40.9234, 2.1185, 38.643, 1.9916],
          ],
          insidePolygon: [
            [47.3165, 4.9665, 47.3424, 5.0201, 47.32, 4.9],
            [40.9234, 2.1185, 38.643, 1.9916, 39.2587, 2.0104],
          ],
          keepDiacriticsOnCharacters: '',
          length: 1,
          maxValuesPerFacet: 0,
          minProximity: 1,
          minWordSizefor1Typo: 0,
          minWordSizefor2Typos: 0,
          minimumAroundRadius: 1,
          naturalLanguages: [''],
          numericFilters: [''],
          offset: 0,
          optionalFilters: [''],
          optionalWords: [''],
          page: 0,
          percentileComputation: true,
          personalizationImpact: 0,
          query: '',
          queryLanguages: [''],
          queryType: 'prefixAll',
          ranking: [''],
          reRankingApplyFilter: [''],
          relevancyStrictness: 0,
          removeStopWords: true,
          removeWordsIfNoResults: 'allOptional',
          renderingContent: {
            facetOrdering: {
              facets: { order: ['a', 'b'] },
              values: { a: { order: ['b'], sortRemainingBy: 'count' } },
            },
          },
          replaceSynonymsInHighlight: true,
          responseFields: [''],
          restrictHighlightAndSnippetArrays: true,
          restrictSearchableAttributes: [''],
          ruleContexts: [''],
          similarQuery: '',
          snippetEllipsisText: '',
          sortFacetValuesBy: '',
          sumOrFiltersScores: true,
          synonyms: true,
          tagFilters: [''],
          type: 'default',
          typoTolerance: 'min',
          userToken: '',
        },
      ],
    });
    expect(req.searchParams).toStrictEqual(undefined);
  });
});