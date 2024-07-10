<?php

// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

namespace Algolia\AlgoliaSearch\Test\Client;

use Algolia\AlgoliaSearch\Api\RecommendClient;
use Algolia\AlgoliaSearch\Configuration\RecommendConfig;
use Algolia\AlgoliaSearch\Http\HttpClientInterface;
use Algolia\AlgoliaSearch\Http\Psr7\Response;
use Algolia\AlgoliaSearch\RetryStrategy\ApiWrapper;
use PHPUnit\Framework\Attributes\CoversClass;
use PHPUnit\Framework\Attributes\TestDox;
use PHPUnit\Framework\TestCase;
use Psr\Http\Message\RequestInterface;

/**
 * Client tests for RecommendClient.
 *
 * @internal
 */
#[CoversClass(RecommendClient::class)]
class RecommendTest extends TestCase implements HttpClientInterface
{
    public const APP_ID = 'test-app-id';
    public const API_KEY = 'test-api-key';

    private $recordedRequest;

    public function sendRequest(RequestInterface $request, $timeout, $connectTimeout)
    {
        $this->recordedRequest = [
            'request' => $request,
            'responseTimeout' => $timeout * 1000,
            'connectTimeout' => $connectTimeout * 1000,
        ];

        return new Response(200, [], '{}');
    }

    #[TestDox('calls api with correct read host')]
    public function test0api()
    {
        $client = $this->createClient(
            'test-app-id',
            'test-api-key',
            null
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

    #[TestDox('calls api with correct write host')]
    public function test1api()
    {
        $client = $this->createClient(
            'test-app-id',
            'test-api-key',
            null
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

    #[TestDox('calls api with correct user agent')]
    public function test0commonApi()
    {
        $client = $this->createClient(self::APP_ID, self::API_KEY);
        $client->customPost(
            '1/test',
        );
        $this->assertTrue(
            (bool) preg_match(
                '/^Algolia for PHP \(\d+\.\d+\.\d+(-?.*)?\)(; [a-zA-Z. ]+ (\(\d+((\.\d+)?\.\d+)?(-?.*)?\))?)*(; Recommend (\(\d+\.\d+\.\d+(-?.*)?\)))(; [a-zA-Z. ]+ (\(\d+((\.\d+)?\.\d+)?(-?.*)?\))?)*$/',
                $this->recordedRequest['request']->getHeader('User-Agent')[0]
            )
        );
    }

    #[TestDox('calls api with default read timeouts')]
    public function test1commonApi()
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
    public function test2commonApi()
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

    /**
     * @param mixed $appId
     * @param mixed $apiKey
     *
     * @return RecommendClient
     */
    private function createClient($appId, $apiKey)
    {
        $config = RecommendConfig::create($appId, $apiKey);
        $clusterHosts = RecommendClient::getClusterHosts($config);
        $api = new ApiWrapper($this, $config, $clusterHosts);

        return new RecommendClient($api, $config);
    }
}
