<?php

namespace Algolia\AlgoliaSearch\Snippets;

class SnippetSearchClient
{
    /**
     * Snippet for the AddApiKey method.
     *
     * addApiKey0
     */
    public function snippetForAddApiKey()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->addApiKey(
            ['acl' => [
                'search',

                'addObject',
            ],
                'description' => 'my new api key',
                'validity' => 300,
                'maxQueriesPerIPPerHour' => 100,
                'maxHitsPerQuery' => 20,
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the AddOrUpdateObject method.
     *
     * addOrUpdateObject0
     */
    public function snippetForAddOrUpdateObject()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->addOrUpdateObject(
            'indexName',
            'uniqueID',
            ['key' => 'value',
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the AppendSource method.
     *
     * appendSource0
     */
    public function snippetForAppendSource()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->appendSource(
            ['source' => 'theSource',
                'description' => 'theDescription',
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the AssignUserId method.
     *
     * assignUserId0
     */
    public function snippetForAssignUserId()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->assignUserId(
            'userID',
            ['cluster' => 'theCluster',
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the Batch method.
     *
     * allows batch method with `addObject` action
     */
    public function snippetForBatch()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->batch(
            'theIndexName',
            ['requests' => [
                ['action' => 'addObject',
                    'body' => ['key' => 'value',
                    ],
                ],
            ],
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the BatchAssignUserIds method.
     *
     * batchAssignUserIds0
     */
    public function snippetForBatchAssignUserIds()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->batchAssignUserIds(
            'userID',
            ['cluster' => 'theCluster',
                'users' => [
                    'user1',

                    'user2',
                ],
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the BatchDictionaryEntries method.
     *
     * get batchDictionaryEntries results with minimal parameters
     */
    public function snippetForBatchDictionaryEntries()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->batchDictionaryEntries(
            'compounds',
            ['requests' => [
                ['action' => 'addEntry',
                    'body' => ['objectID' => '1',
                        'language' => 'en',
                    ],
                ],

                ['action' => 'deleteEntry',
                    'body' => ['objectID' => '2',
                        'language' => 'fr',
                    ],
                ],
            ],
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the Browse method.
     *
     * browse with minimal parameters
     */
    public function snippetForBrowse()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->browse(
            'cts_e2e_browse',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the ClearAllSynonyms method.
     *
     * clearAllSynonyms0
     */
    public function snippetForClearAllSynonyms()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->clearAllSynonyms(
            'indexName',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the ClearObjects method.
     *
     * clearObjects0
     */
    public function snippetForClearObjects()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->clearObjects(
            'theIndexName',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the ClearRules method.
     *
     * clearRules0
     */
    public function snippetForClearRules()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->clearRules(
            'indexName',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the CustomDelete method.
     *
     * allow del method for a custom path with minimal parameters
     */
    public function snippetForCustomDelete()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->customDelete(
            '/test/minimal',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the CustomGet method.
     *
     * allow get method for a custom path with minimal parameters
     */
    public function snippetForCustomGet()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->customGet(
            '/test/minimal',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the CustomPost method.
     *
     * allow post method for a custom path with minimal parameters
     */
    public function snippetForCustomPost()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->customPost(
            '/test/minimal',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the CustomPut method.
     *
     * allow put method for a custom path with minimal parameters
     */
    public function snippetForCustomPut()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->customPut(
            '/test/minimal',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the DeleteApiKey method.
     *
     * deleteApiKey0
     */
    public function snippetForDeleteApiKey()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->deleteApiKey(
            'myTestApiKey',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the DeleteBy method.
     *
     * deleteBy0
     */
    public function snippetForDeleteBy()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->deleteBy(
            'theIndexName',
            ['filters' => 'brand:brandName',
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the DeleteIndex method.
     *
     * deleteIndex0
     */
    public function snippetForDeleteIndex()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->deleteIndex(
            'theIndexName',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the DeleteObject method.
     *
     * deleteObject0
     */
    public function snippetForDeleteObject()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->deleteObject(
            'theIndexName',
            'uniqueID',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the DeleteRule method.
     *
     * delete rule simple case
     */
    public function snippetForDeleteRule()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->deleteRule(
            'indexName',
            'id1',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the DeleteSource method.
     *
     * deleteSource0
     */
    public function snippetForDeleteSource()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->deleteSource(
            'theSource',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the DeleteSynonym method.
     *
     * deleteSynonym0
     */
    public function snippetForDeleteSynonym()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->deleteSynonym(
            'indexName',
            'id1',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetApiKey method.
     *
     * getApiKey0
     */
    public function snippetForGetApiKey()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getApiKey(
            'myTestApiKey',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetDictionaryLanguages method.
     *
     * get getDictionaryLanguages
     */
    public function snippetForGetDictionaryLanguages()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getDictionaryLanguages();

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetDictionarySettings method.
     *
     * get getDictionarySettings results
     */
    public function snippetForGetDictionarySettings()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getDictionarySettings();

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetLogs method.
     *
     * getLogs with minimal parameters
     */
    public function snippetForGetLogs()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getLogs();

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetObject method.
     *
     * getObject0
     */
    public function snippetForGetObject()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getObject(
            'theIndexName',
            'uniqueID',
            [
                'attr1',

                'attr2',
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetObjects method.
     *
     * getObjects0
     */
    public function snippetForGetObjects()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getObjects(
            ['requests' => [
                ['attributesToRetrieve' => [
                    'attr1',

                    'attr2',
                ],
                    'objectID' => 'uniqueID',
                    'indexName' => 'theIndexName',
                ],
            ],
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetRule method.
     *
     * getRule0
     */
    public function snippetForGetRule()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getRule(
            'indexName',
            'id1',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetSettings method.
     *
     * getSettings0
     */
    public function snippetForGetSettings()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getSettings(
            'cts_e2e_settings',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetSources method.
     *
     * getSources0
     */
    public function snippetForGetSources()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getSources();

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetSynonym method.
     *
     * getSynonym0
     */
    public function snippetForGetSynonym()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getSynonym(
            'indexName',
            'id1',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetTask method.
     *
     * getTask0
     */
    public function snippetForGetTask()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getTask(
            'theIndexName',
            123,
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetTopUserIds method.
     *
     * getTopUserIds0
     */
    public function snippetForGetTopUserIds()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getTopUserIds();

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetUserId method.
     *
     * getUserId0
     */
    public function snippetForGetUserId()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->getUserId(
            'uniqueID',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the HasPendingMappings method.
     *
     * hasPendingMappings with minimal parameters
     */
    public function snippetForHasPendingMappings()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->hasPendingMappings();

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the ListApiKeys method.
     *
     * listApiKeys0
     */
    public function snippetForListApiKeys()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->listApiKeys();

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the ListClusters method.
     *
     * listClusters0
     */
    public function snippetForListClusters()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->listClusters();

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the ListIndices method.
     *
     * listIndices with minimal parameters
     */
    public function snippetForListIndices()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->listIndices();

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the ListUserIds method.
     *
     * listUserIds with minimal parameters
     */
    public function snippetForListUserIds()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->listUserIds();

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the MultipleBatch method.
     *
     * multipleBatch0
     */
    public function snippetForMultipleBatch()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->multipleBatch(
            ['requests' => [
                ['action' => 'addObject',
                    'body' => ['key' => 'value',
                    ],
                    'indexName' => 'theIndexName',
                ],
            ],
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the OperationIndex method.
     *
     * operationIndex0
     */
    public function snippetForOperationIndex()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->operationIndex(
            'theIndexName',
            ['operation' => 'copy',
                'destination' => 'dest',
                'scope' => [
                    'rules',

                    'settings',
                ],
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the PartialUpdateObject method.
     *
     * partialUpdateObject0
     */
    public function snippetForPartialUpdateObject()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->partialUpdateObject(
            'theIndexName',
            'uniqueID',
            ['id1' => 'test',
                'id2' => ['_operation' => 'AddUnique',
                    'value' => 'test2',
                ],
            ],
            true,
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the RemoveUserId method.
     *
     * removeUserId0
     */
    public function snippetForRemoveUserId()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->removeUserId(
            'uniqueID',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the ReplaceSources method.
     *
     * replaceSources0
     */
    public function snippetForReplaceSources()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->replaceSources(
            [
                ['source' => 'theSource',
                    'description' => 'theDescription',
                ],
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the RestoreApiKey method.
     *
     * restoreApiKey0
     */
    public function snippetForRestoreApiKey()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->restoreApiKey(
            'myApiKey',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SaveObject method.
     *
     * saveObject0
     */
    public function snippetForSaveObject()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->saveObject(
            'theIndexName',
            ['objectID' => 'id',
                'test' => 'val',
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SaveRule method.
     *
     * saveRule with minimal parameters
     */
    public function snippetForSaveRule()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->saveRule(
            'indexName',
            'id1',
            ['objectID' => 'id1',
                'conditions' => [
                    ['pattern' => 'apple',
                        'anchoring' => 'contains',
                    ],
                ],
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SaveRules method.
     *
     * saveRules with minimal parameters
     */
    public function snippetForSaveRules()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->saveRules(
            'indexName',
            [
                ['objectID' => 'a-rule-id',
                    'conditions' => [
                        ['pattern' => 'smartphone',
                            'anchoring' => 'contains',
                        ],
                    ],
                ],

                ['objectID' => 'a-second-rule-id',
                    'conditions' => [
                        ['pattern' => 'apple',
                            'anchoring' => 'contains',
                        ],
                    ],
                ],
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SaveSynonym method.
     *
     * saveSynonym0
     */
    public function snippetForSaveSynonym()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->saveSynonym(
            'indexName',
            'id1',
            ['objectID' => 'id1',
                'type' => 'synonym',
                'synonyms' => [
                    'car',

                    'vehicule',

                    'auto',
                ],
            ],
            true,
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SaveSynonyms method.
     *
     * saveSynonyms0
     */
    public function snippetForSaveSynonyms()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->saveSynonyms(
            'indexName',
            [
                ['objectID' => 'id1',
                    'type' => 'synonym',
                    'synonyms' => [
                        'car',

                        'vehicule',

                        'auto',
                    ],
                ],

                ['objectID' => 'id2',
                    'type' => 'onewaysynonym',
                    'input' => 'iphone',
                    'synonyms' => [
                        'ephone',

                        'aphone',

                        'yphone',
                    ],
                ],
            ],
            true,
            false,
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the Search method.
     *
     * search for a single hits request with minimal parameters
     */
    public function snippetForSearch()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->search(
            ['requests' => [
                ['indexName' => 'cts_e2e_search_empty_index',
                ],
            ],
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SearchDictionaryEntries method.
     *
     * get searchDictionaryEntries results with minimal parameters
     */
    public function snippetForSearchDictionaryEntries()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->searchDictionaryEntries(
            'compounds',
            ['query' => 'foo',
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SearchForFacetValues method.
     *
     * get searchForFacetValues results with minimal parameters
     */
    public function snippetForSearchForFacetValues()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->searchForFacetValues(
            'indexName',
            'facetName',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SearchRules method.
     *
     * searchRules0
     */
    public function snippetForSearchRules()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->searchRules(
            'indexName',
            ['query' => 'something',
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SearchSingleIndex method.
     *
     * search with minimal parameters
     */
    public function snippetForSearchSingleIndex()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->searchSingleIndex(
            'indexName',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SearchSynonyms method.
     *
     * searchSynonyms with minimal parameters
     */
    public function snippetForSearchSynonyms()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->searchSynonyms(
            'indexName',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SearchUserIds method.
     *
     * searchUserIds0
     */
    public function snippetForSearchUserIds()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->searchUserIds(
            ['query' => 'test',
                'clusterName' => 'theClusterName',
                'page' => 5,
                'hitsPerPage' => 10,
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SetDictionarySettings method.
     *
     * get setDictionarySettings results with minimal parameters
     */
    public function snippetForSetDictionarySettings()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->setDictionarySettings(
            ['disableStandardEntries' => ['plurals' => ['fr' => false,
                'en' => false,
                'ru' => true,
            ],
            ],
            ],
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SetSettings method.
     *
     * setSettings with minimal parameters
     */
    public function snippetForSetSettings()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->setSettings(
            'cts_e2e_settings',
            ['paginationLimitedTo' => 10,
            ],
            true,
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the UpdateApiKey method.
     *
     * updateApiKey0
     */
    public function snippetForUpdateApiKey()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\SearchClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>');

        // Call the API
        $response = $client->updateApiKey(
            'myApiKey',
            ['acl' => [
                'search',

                'addObject',
            ],
                'validity' => 300,
                'maxQueriesPerIPPerHour' => 100,
                'maxHitsPerQuery' => 20,
            ],
        );

        // play with the response
        var_dump($response);
    }
}