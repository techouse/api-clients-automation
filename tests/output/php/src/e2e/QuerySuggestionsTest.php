<?php

// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

namespace Algolia\AlgoliaSearch\Test\RequestE2E;

use Algolia\AlgoliaSearch\Api\QuerySuggestionsClient;
use Dotenv\Dotenv;
use PHPUnit\Framework\Attributes\CoversClass;
use PHPUnit\Framework\Attributes\TestDox;
use PHPUnit\Framework\TestCase;

// we only read .env file if we run locally
if (getenv('ALGOLIA_APPLICATION_ID')) {
    $_ENV = getenv();
} else {
    $dotenv = Dotenv::createImmutable('tests');
    $dotenv->load();
}

/**
 * @internal
 */
#[CoversClass(QuerySuggestionsClient::class)]
class QuerySuggestionsTest extends TestCase
{
    #[TestDox('Retrieve QS config e2e')]
    public function testGetConfig(): void
    {
        $client = $this->getClient();
        $resp = $client->getConfig(
            'cts_e2e_browse_query_suggestions',
        );

        $expected = json_decode('{"appID":"T8JK9S7I7X","allowSpecialCharacters":true,"enablePersonalization":false,"exclude":["^cocaines$"],"indexName":"cts_e2e_browse_query_suggestions","languages":[],"sourceIndices":[{"facets":[{"amount":1,"attribute":"title"}],"generate":[["year"]],"indexName":"cts_e2e_browse","minHits":5,"minLetters":4,"replicas":false}]}', true);

        $this->assertEquals($this->union($expected, $resp), $expected);
    }

    protected function union($expected, $received): mixed
    {
        if (is_array($expected)) {
            $res = [];
            // array and object are the same thing in PHP (magic ✨)
            foreach ($expected as $k => $v) {
                $res[$k] = $this->union($v, $received[$k]);
            }

            return $res;
        }

        return $received;
    }

    protected function getClient(): QuerySuggestionsClient
    {
        return QuerySuggestionsClient::create($_ENV['ALGOLIA_APPLICATION_ID'], $_ENV['ALGOLIA_ADMIN_KEY'], 'us');
    }
}
