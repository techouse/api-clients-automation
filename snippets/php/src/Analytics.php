<?php

namespace Algolia\AlgoliaSearch\Snippets;

class SnippetAnalyticsClient
{
    /**
     * Snippet for the CustomDelete method.
     *
     * allow del method for a custom path with minimal parameters
     */
    public function snippetForCustomDelete()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

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
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

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
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

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
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->customPut(
            '/test/minimal',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetAverageClickPosition method.
     *
     * get getAverageClickPosition with minimal parameters
     */
    public function snippetForGetAverageClickPosition()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getAverageClickPosition(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetClickPositions method.
     *
     * get getClickPositions with minimal parameters
     */
    public function snippetForGetClickPositions()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getClickPositions(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetClickThroughRate method.
     *
     * get getClickThroughRate with minimal parameters
     */
    public function snippetForGetClickThroughRate()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getClickThroughRate(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetConversationRate method.
     *
     * get getConversationRate with minimal parameters
     */
    public function snippetForGetConversationRate()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getConversationRate(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetNoClickRate method.
     *
     * get getNoClickRate with minimal parameters
     */
    public function snippetForGetNoClickRate()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getNoClickRate(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetNoResultsRate method.
     *
     * get getNoResultsRate with minimal parameters
     */
    public function snippetForGetNoResultsRate()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getNoResultsRate(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetSearchesCount method.
     *
     * get getSearchesCount with minimal parameters
     */
    public function snippetForGetSearchesCount()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getSearchesCount(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetSearchesNoClicks method.
     *
     * get getSearchesNoClicks with minimal parameters
     */
    public function snippetForGetSearchesNoClicks()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getSearchesNoClicks(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetSearchesNoResults method.
     *
     * get getSearchesNoResults with minimal parameters
     */
    public function snippetForGetSearchesNoResults()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getSearchesNoResults(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetStatus method.
     *
     * get getStatus with minimal parameters
     */
    public function snippetForGetStatus()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getStatus(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetTopCountries method.
     *
     * get getTopCountries with minimal parameters
     */
    public function snippetForGetTopCountries()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getTopCountries(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetTopFilterAttributes method.
     *
     * get getTopFilterAttributes with minimal parameters
     */
    public function snippetForGetTopFilterAttributes()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getTopFilterAttributes(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetTopFilterForAttribute method.
     *
     * get getTopFilterForAttribute with minimal parameters
     */
    public function snippetForGetTopFilterForAttribute()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getTopFilterForAttribute(
            'myAttribute',
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetTopFiltersNoResults method.
     *
     * get getTopFiltersNoResults with minimal parameters
     */
    public function snippetForGetTopFiltersNoResults()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getTopFiltersNoResults(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetTopHits method.
     *
     * get getTopHits with minimal parameters
     */
    public function snippetForGetTopHits()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getTopHits(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetTopSearches method.
     *
     * get getTopSearches with minimal parameters
     */
    public function snippetForGetTopSearches()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getTopSearches(
            'index',
        );

        // play with the response
        var_dump($response);
    }

    /**
     * Snippet for the GetUsersCount method.
     *
     * get getUsersCount with minimal parameters
     */
    public function snippetForGetUsersCount()
    {
        // Initialize the client
        $client = Algolia\AlgoliaSearch\Api\AnalyticsClient::create('<YOUR_APP_ID>', '<YOUR_API_KEY>', 'YOUR_APP_ID_REGION');

        // Call the API
        $response = $client->getUsersCount(
            'index',
        );

        // play with the response
        var_dump($response);
    }
}