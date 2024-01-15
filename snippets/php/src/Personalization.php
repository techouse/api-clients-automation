<?php

namespace Algolia\AlgoliaSearch\Snippets;

class SnippetPersonalizationClient
{
    /**
     * Snippet for the CustomDelete method.
     *
     * allow del method for a custom path with minimal parameters
     */
    public function snippetForCustomDelete()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\PersonalizationClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

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
        $client = Algolia\AlgoliaSearch\Api\PersonalizationClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

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
        $client = Algolia\AlgoliaSearch\Api\PersonalizationClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

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
        $client = Algolia\AlgoliaSearch\Api\PersonalizationClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->customPut(
            '/test/minimal',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the DeleteUserProfile method.
     *
     * delete deleteUserProfile
     */
    public function snippetForDeleteUserProfile()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\PersonalizationClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->deleteUserProfile(
            'UserToken',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetPersonalizationStrategy method.
     *
     * get getPersonalizationStrategy
     */
    public function snippetForGetPersonalizationStrategy()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\PersonalizationClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getPersonalizationStrategy();

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetUserTokenProfile method.
     *
     * get getUserTokenProfile
     */
    public function snippetForGetUserTokenProfile()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\PersonalizationClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getUserTokenProfile(
            'UserToken',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the SetPersonalizationStrategy method.
     *
     * set setPersonalizationStrategy
     */
    public function snippetForSetPersonalizationStrategy()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\PersonalizationClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->setPersonalizationStrategy(
            ['eventScoring' => [
                ['score' => 42,
                    'eventName' => 'Algolia',
                    'eventType' => 'Event',
                ],
            ],
                'facetScoring' => [
                    ['score' => 42,
                        'facetName' => 'Event',
                    ],
                ],
                'personalizationImpact' => 42,
            ],
        );

        // play with the response
        var_dump($response);
    }
}