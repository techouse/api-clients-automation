<?php

// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

namespace Algolia\AlgoliaSearch\Test\Client;

use Algolia\AlgoliaSearch\Api\SearchClient;
use Algolia\AlgoliaSearch\Configuration\SearchConfig;
use Algolia\AlgoliaSearch\Http\HttpClientInterface;
use Algolia\AlgoliaSearch\Http\Psr7\Response;
use Algolia\AlgoliaSearch\RetryStrategy\ApiWrapper;
use PHPUnit\Framework\Attributes\CoversClass;
use PHPUnit\Framework\Attributes\TestDox;
use PHPUnit\Framework\TestCase;
use Psr\Http\Message\RequestInterface;

/**
 * Client tests for SearchClient.
 *
 * @internal
 */
#[CoversClass(SearchClient::class)]
class SearchTest extends TestCase implements HttpClientInterface
{
    public const APP_ID = 'test-app-id';
    public const API_KEY = 'test-api-key';

    private $recordedRequest;

    public function sendRequest(RequestInterface $request, $timeout, $connectTimeout): Response
    {
        $this->recordedRequest = [
            'request' => $request,
            'responseTimeout' => $timeout * 1000,
            'connectTimeout' => $connectTimeout * 1000,
        ];

        return new Response(200, [], '{}');
    }

    #[TestDox('calls api with correct read host')]
    public function test0api(): void
    {
        $client = $this->createClient(
            'test-app-id',
            'test-api-key'
        );
        $this->assertIsObject($client);
        $client->customGet(
            'test',
        );
        $this->assertEquals(
            'test-app-id-dsn.algolia.net',
            $this->recordedRequest['request']->getUri()->getHost()
        );
    }

    #[TestDox('read transporter with POST method')]
    public function test1api(): void
    {
        $client = $this->createClient(
            'test-app-id',
            'test-api-key'
        );
        $this->assertIsObject($client);
        $client->searchSingleIndex(
            'indexName',
        );
        $this->assertEquals(
            'test-app-id-dsn.algolia.net',
            $this->recordedRequest['request']->getUri()->getHost()
        );
    }

    #[TestDox('calls api with correct write host')]
    public function test2api(): void
    {
        $client = $this->createClient(
            'test-app-id',
            'test-api-key'
        );
        $this->assertIsObject($client);
        $client->customPost(
            'test',
        );
        $this->assertEquals(
            'test-app-id.algolia.net',
            $this->recordedRequest['request']->getUri()->getHost()
        );
    }

    #[TestDox('tests the retry strategy')]
    public function test3api(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6676', 'http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6677', 'http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6678']));

        $res = $client->customGet(
            '1/test/retry/php',
        );
        $this->assertEquals(
            '{"message":"ok test server response"}',
            json_encode($res)
        );
    }

    #[TestDox('tests the retry strategy error')]
    public function test4api(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6676']));

        try {
            $res = $client->customGet(
                '1/test/hang/php',
            );
            $this->fail('Expected exception to be thrown');
        } catch (\Exception $e) {
            $this->assertEquals($e->getMessage(), 'Impossible to connect, please check your Algolia Application Id.');
        }
    }

    #[TestDox('calls api with default read timeouts')]
    public function test6api(): void
    {
        $client = $this->createClient(self::APP_ID, self::API_KEY);
        $client->customGet(
            '1/test',
        );
        $this->assertEquals(
            2000,
            $this->recordedRequest['connectTimeout']
        );

        $this->assertEquals(
            5000,
            $this->recordedRequest['responseTimeout']
        );
    }

    #[TestDox('calls api with default write timeouts')]
    public function test7api(): void
    {
        $client = $this->createClient(self::APP_ID, self::API_KEY);
        $client->customPost(
            '1/test',
        );
        $this->assertEquals(
            2000,
            $this->recordedRequest['connectTimeout']
        );

        $this->assertEquals(
            30000,
            $this->recordedRequest['responseTimeout']
        );
    }

    #[TestDox('calls api with correct user agent')]
    public function test0commonApi(): void
    {
        $client = $this->createClient(self::APP_ID, self::API_KEY);
        $client->customPost(
            '1/test',
        );
        $this->assertTrue(
            (bool) preg_match(
                '/^Algolia for PHP \(\d+\.\d+\.\d+(-?.*)?\)(; [a-zA-Z. ]+ (\(\d+((\.\d+)?\.\d+)?(-?.*)?\))?)*(; Search (\(\d+\.\d+\.\d+(-?.*)?\)))(; [a-zA-Z. ]+ (\(\d+((\.\d+)?\.\d+)?(-?.*)?\))?)*$/',
                $this->recordedRequest['request']->getHeader('User-Agent')[0]
            )
        );
    }

    #[TestDox('the user agent contains the latest version')]
    public function test1commonApi(): void
    {
        $client = $this->createClient(self::APP_ID, self::API_KEY);
        $client->customPost(
            '1/test',
        );
        $this->assertTrue(
            (bool) preg_match(
                '/^Algolia for PHP \(4.11.1\).*/',
                $this->recordedRequest['request']->getHeader('User-Agent')[0]
            )
        );
    }

    #[TestDox('call deleteObjects without error')]
    public function test0deleteObjects(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6680']));

        $res = $client->deleteObjects(
            'cts_e2e_deleteObjects_php',
            [
                '1',

                '2',
            ],
        );
        $this->assertEquals(
            '[{"taskID":666,"objectIDs":["1","2"]}]',
            json_encode($res)
        );
    }

    #[TestDox('generate secured api key basic')]
    public function test0generateSecuredApiKey(): void
    {
        $client = $this->createClient(self::APP_ID, self::API_KEY);

        $res = $client->generateSecuredApiKey(
            '2640659426d5107b6e47d75db9cbaef8',
            ['validUntil' => 2524604400,
                'restrictIndices' => [
                    'Movies',
                ],
            ],
        );
        $this->assertEquals(
            'NjFhZmE0OGEyMTI3OThiODc0OTlkOGM0YjcxYzljY2M2NmU2NDE5ZWY0NDZjMWJhNjA2NzBkMjAwOTI2YWQyZnJlc3RyaWN0SW5kaWNlcz1Nb3ZpZXMmdmFsaWRVbnRpbD0yNTI0NjA0NDAw',
            $res
        );
    }

    #[TestDox('generate secured api key with searchParams')]
    public function test1generateSecuredApiKey(): void
    {
        $client = $this->createClient(self::APP_ID, self::API_KEY);

        $res = $client->generateSecuredApiKey(
            '2640659426d5107b6e47d75db9cbaef8',
            ['validUntil' => 2524604400,
                'restrictIndices' => [
                    'Movies',

                    'cts_e2e_settings',
                ],
                'restrictSources' => '192.168.1.0/24',
                'filters' => 'category:Book OR category:Ebook AND _tags:published',
                'userToken' => 'user123',
                'searchParams' => ['query' => 'batman',
                    'typoTolerance' => 'strict',
                    'aroundRadius' => 'all',
                    'mode' => 'neuralSearch',
                    'hitsPerPage' => 10,
                    'optionalWords' => [
                        'one',

                        'two',
                    ],
                ],
            ],
        );
        $this->assertEquals(
            'MzAxMDUwYjYyODMxODQ3ZWM1ZDYzNTkxZmNjNDg2OGZjMjAzYjQyOTZhMGQ1NDJhMDFiNGMzYTYzODRhNmMxZWFyb3VuZFJhZGl1cz1hbGwmZmlsdGVycz1jYXRlZ29yeSUzQUJvb2slMjBPUiUyMGNhdGVnb3J5JTNBRWJvb2slMjBBTkQlMjBfdGFncyUzQXB1Ymxpc2hlZCZoaXRzUGVyUGFnZT0xMCZtb2RlPW5ldXJhbFNlYXJjaCZvcHRpb25hbFdvcmRzPW9uZSUyQ3R3byZxdWVyeT1iYXRtYW4mcmVzdHJpY3RJbmRpY2VzPU1vdmllcyUyQ2N0c19lMmVfc2V0dGluZ3MmcmVzdHJpY3RTb3VyY2VzPTE5Mi4xNjguMS4wJTJGMjQmdHlwb1RvbGVyYW5jZT1zdHJpY3QmdXNlclRva2VuPXVzZXIxMjMmdmFsaWRVbnRpbD0yNTI0NjA0NDAw',
            $res
        );
    }

    #[TestDox('indexExists')]
    public function test0indexExists(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6681']));

        $res = $client->indexExists(
            'indexExistsYES',
        );
        $this->assertEquals(
            true,
            $res
        );
    }

    #[TestDox('indexNotExists')]
    public function test1indexExists(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6681']));

        $res = $client->indexExists(
            'indexExistsNO',
        );
        $this->assertEquals(
            false,
            $res
        );
    }

    #[TestDox('indexExistsWithError')]
    public function test2indexExists(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6681']));

        try {
            $res = $client->indexExists(
                'indexExistsERROR',
            );
            $this->fail('Expected exception to be thrown');
        } catch (\Exception $e) {
            $this->assertEquals($e->getMessage(), 'Invalid API key');
        }
    }

    #[TestDox('client throws with invalid parameters')]
    public function test0parameters(): void
    {
        try {
            $client = $this->createClient(
                null,
                null
            );

            $this->fail('Expected exception to be thrown');
        } catch (\Exception $e) {
            $this->assertEquals($e->getMessage(), '`appId` is missing.');
        }

        try {
            $client = $this->createClient(
                null,
                'my-api-key'
            );

            $this->fail('Expected exception to be thrown');
        } catch (\Exception $e) {
            $this->assertEquals($e->getMessage(), '`appId` is missing.');
        }

        try {
            $client = $this->createClient(
                'my-app-id',
                null
            );

            $this->fail('Expected exception to be thrown');
        } catch (\Exception $e) {
            $this->assertEquals($e->getMessage(), '`apiKey` is missing.');
        }
    }

    #[TestDox('`addApiKey` throws with invalid parameters')]
    public function test1parameters(): void
    {
        $client = $this->createClient(self::APP_ID, self::API_KEY);

        try {
            $client->addApiKey(
                null,
            );
            $this->fail('Expected exception to be thrown');
        } catch (\Exception $e) {
            $this->assertEquals($e->getMessage(), 'Parameter `apiKey` is required when calling `addApiKey`.');
        }
    }

    #[TestDox('`addOrUpdateObject` throws with invalid parameters')]
    public function test2parameters(): void
    {
        $client = $this->createClient(self::APP_ID, self::API_KEY);

        try {
            $client->addOrUpdateObject(
                null,
                'my-object-id',
                [],
            );
            $this->fail('Expected exception to be thrown');
        } catch (\Exception $e) {
            $this->assertEquals($e->getMessage(), 'Parameter `indexName` is required when calling `addOrUpdateObject`.');
        }

        try {
            $client->addOrUpdateObject(
                'my-index-name',
                null,
                [],
            );
            $this->fail('Expected exception to be thrown');
        } catch (\Exception $e) {
            $this->assertEquals($e->getMessage(), 'Parameter `objectID` is required when calling `addOrUpdateObject`.');
        }

        try {
            $client->addOrUpdateObject(
                'my-index-name',
                'my-object-id',
                null,
            );
            $this->fail('Expected exception to be thrown');
        } catch (\Exception $e) {
            $this->assertEquals($e->getMessage(), 'Parameter `body` is required when calling `addOrUpdateObject`.');
        }
    }

    #[TestDox('call partialUpdateObjects with createIfNotExists=true')]
    public function test0partialUpdateObjects(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6680']));

        $res = $client->partialUpdateObjects(
            'cts_e2e_partialUpdateObjects_php',
            [
                ['objectID' => '1',
                    'name' => 'Adam',
                ],

                ['objectID' => '2',
                    'name' => 'Benoit',
                ],
            ],
            true,
        );
        $this->assertEquals(
            '[{"taskID":444,"objectIDs":["1","2"]}]',
            json_encode($res)
        );
    }

    #[TestDox('call partialUpdateObjects with createIfNotExists=false')]
    public function test1partialUpdateObjects(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6680']));

        $res = $client->partialUpdateObjects(
            'cts_e2e_partialUpdateObjects_php',
            [
                ['objectID' => '3',
                    'name' => 'Cyril',
                ],

                ['objectID' => '4',
                    'name' => 'David',
                ],
            ],
            false,
        );
        $this->assertEquals(
            '[{"taskID":555,"objectIDs":["3","4"]}]',
            json_encode($res)
        );
    }

    #[TestDox('call replaceAllObjects without error')]
    public function test0replaceAllObjects(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6679']));

        $res = $client->replaceAllObjects(
            'cts_e2e_replace_all_objects_php',
            [
                ['objectID' => '1',
                    'name' => 'Adam',
                ],

                ['objectID' => '2',
                    'name' => 'Benoit',
                ],

                ['objectID' => '3',
                    'name' => 'Cyril',
                ],

                ['objectID' => '4',
                    'name' => 'David',
                ],

                ['objectID' => '5',
                    'name' => 'Eva',
                ],

                ['objectID' => '6',
                    'name' => 'Fiona',
                ],

                ['objectID' => '7',
                    'name' => 'Gael',
                ],

                ['objectID' => '8',
                    'name' => 'Hugo',
                ],

                ['objectID' => '9',
                    'name' => 'Igor',
                ],

                ['objectID' => '10',
                    'name' => 'Julia',
                ],
            ],
            3,
        );
        $this->assertEquals(
            '{"copyOperationResponse":{"taskID":125,"updatedAt":"2021-01-01T00:00:00.000Z"},"batchResponses":[{"taskID":127,"objectIDs":["1","2","3"]},{"taskID":130,"objectIDs":["4","5","6"]},{"taskID":133,"objectIDs":["7","8","9"]},{"taskID":134,"objectIDs":["10"]}],"moveOperationResponse":{"taskID":777,"updatedAt":"2021-01-01T00:00:00.000Z"}}',
            json_encode($res)
        );
    }

    #[TestDox('call saveObjects without error')]
    public function test0saveObjects(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6680']));

        $res = $client->saveObjects(
            'cts_e2e_saveObjects_php',
            [
                ['objectID' => '1',
                    'name' => 'Adam',
                ],

                ['objectID' => '2',
                    'name' => 'Benoit',
                ],
            ],
        );
        $this->assertEquals(
            '[{"taskID":333,"objectIDs":["1","2"]}]',
            json_encode($res)
        );
    }

    #[TestDox('saveObjects should report errors')]
    public function test1saveObjects(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'wrong-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6680']));

        try {
            $res = $client->saveObjects(
                'cts_e2e_saveObjects_php',
                [
                    ['objectID' => '1',
                        'name' => 'Adam',
                    ],

                    ['objectID' => '2',
                        'name' => 'Benoit',
                    ],
                ],
            );
            $this->fail('Expected exception to be thrown');
        } catch (\Exception $e) {
            $this->assertEquals($e->getMessage(), 'Invalid Application-ID or API key');
        }
    }

    #[TestDox('switch API key')]
    public function test0setClientApiKey(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6683']));

        $res = $client->customGet(
            'check-api-key/1',
        );
        $this->assertEquals(
            '{"headerAPIKeyValue":"test-api-key"}',
            json_encode($res)
        );

        $client->setClientApiKey(
            'updated-api-key',
        );

        $res = $client->customGet(
            'check-api-key/2',
        );
        $this->assertEquals(
            '{"headerAPIKeyValue":"updated-api-key"}',
            json_encode($res)
        );
    }

    #[TestDox('wait for api key helper - add')]
    public function test0waitForApiKey(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6681']));

        $res = $client->waitForApiKey(
            'api-key-add-operation-test-php',
            'add',
        );
        $this->assertEquals(
            '{"value":"api-key-add-operation-test-php","description":"my new api key","acl":["search","addObject"],"validity":300,"maxQueriesPerIPPerHour":100,"maxHitsPerQuery":20,"createdAt":1720094400}',
            json_encode($res)
        );
    }

    #[TestDox('wait for api key - update')]
    public function test1waitForApiKey(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6681']));

        $res = $client->waitForApiKey(
            'api-key-update-operation-test-php',
            'update',
            ['description' => 'my updated api key',
                'acl' => [
                    'search',

                    'addObject',

                    'deleteObject',
                ],
                'indexes' => [
                    'Movies',

                    'Books',
                ],
                'referers' => [
                    '*google.com',

                    '*algolia.com',
                ],
                'validity' => 305,
                'maxQueriesPerIPPerHour' => 95,
                'maxHitsPerQuery' => 20,
            ],
        );
        $this->assertEquals(
            '{"value":"api-key-update-operation-test-php","description":"my updated api key","acl":["search","addObject","deleteObject"],"indexes":["Movies","Books"],"referers":["*google.com","*algolia.com"],"validity":305,"maxQueriesPerIPPerHour":95,"maxHitsPerQuery":20,"createdAt":1720094400}',
            json_encode($res)
        );
    }

    #[TestDox('wait for api key - delete')]
    public function test2waitForApiKey(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6681']));

        $res = $client->waitForApiKey(
            'api-key-delete-operation-test-php',
            'delete',
        );
        $this->assertEquals(
            null,
            $res
        );
    }

    #[TestDox('wait for an application-level task')]
    public function test0waitForAppTask(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6681']));

        $res = $client->waitForAppTask(
            123,
        );
        $this->assertEquals(
            '{"status":"published"}',
            json_encode($res)
        );
    }

    #[TestDox('wait for task')]
    public function test0waitForTask(): void
    {
        $client = SearchClient::createWithConfig(SearchConfig::create('test-app-id', 'test-api-key')->setFullHosts(['http://'.('true' == getenv('CI') ? 'localhost' : 'host.docker.internal').':6681']));

        $res = $client->waitForTask(
            'wait-task-php',
            123,
        );
        $this->assertEquals(
            '{"status":"published"}',
            json_encode($res)
        );
    }

    /**
     * @param mixed $appId
     * @param mixed $apiKey
     */
    private function createClient($appId, $apiKey): SearchClient
    {
        $config = SearchConfig::create($appId, $apiKey);
        $clusterHosts = SearchClient::getClusterHosts($config);
        $api = new ApiWrapper($this, $config, $clusterHosts);

        return new SearchClient($api, $config);
    }
}
