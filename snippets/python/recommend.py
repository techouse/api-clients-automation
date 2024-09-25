# Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
# >IMPORT
from algoliasearch.recommend.client import RecommendClientSync
# IMPORT<


def snippet_for_custom_delete():
    """
    Snippet for the customDelete method.

    allow del method for a custom path with minimal parameters
    """
    # >SEPARATOR customDelete default
    # Initialize the client
    # In an asynchronous context, you can use RecommendClient instead, which exposes the exact same methods.
    client = RecommendClientSync("ALGOLIA_APPLICATION_ID", "ALGOLIA_API_KEY")

    # Call the API
    response = client.custom_delete(
        path="test/minimal",
    )

    print(response)

    # Skip deserialization
    raw_response = client.custom_delete_with_http_info(
        path="test/minimal",
    )

    print(raw_response.raw_data)

    # >LOG
    # use the class directly
    print(response)

    # print the JSON response
    print(response.to_json())
    # SEPARATOR<


def snippet_for_custom_get():
    """
    Snippet for the customGet method.

    allow get method for a custom path with minimal parameters
    """
    # >SEPARATOR customGet default
    # Initialize the client
    # In an asynchronous context, you can use RecommendClient instead, which exposes the exact same methods.
    client = RecommendClientSync("ALGOLIA_APPLICATION_ID", "ALGOLIA_API_KEY")

    # Call the API
    response = client.custom_get(
        path="test/minimal",
    )

    print(response)

    # Skip deserialization
    raw_response = client.custom_get_with_http_info(
        path="test/minimal",
    )

    print(raw_response.raw_data)

    # >LOG
    # use the class directly
    print(response)

    # print the JSON response
    print(response.to_json())
    # SEPARATOR<


def snippet_for_custom_post():
    """
    Snippet for the customPost method.

    allow post method for a custom path with minimal parameters
    """
    # >SEPARATOR customPost default
    # Initialize the client
    # In an asynchronous context, you can use RecommendClient instead, which exposes the exact same methods.
    client = RecommendClientSync("ALGOLIA_APPLICATION_ID", "ALGOLIA_API_KEY")

    # Call the API
    response = client.custom_post(
        path="test/minimal",
    )

    print(response)

    # Skip deserialization
    raw_response = client.custom_post_with_http_info(
        path="test/minimal",
    )

    print(raw_response.raw_data)

    # >LOG
    # use the class directly
    print(response)

    # print the JSON response
    print(response.to_json())
    # SEPARATOR<


def snippet_for_custom_put():
    """
    Snippet for the customPut method.

    allow put method for a custom path with minimal parameters
    """
    # >SEPARATOR customPut default
    # Initialize the client
    # In an asynchronous context, you can use RecommendClient instead, which exposes the exact same methods.
    client = RecommendClientSync("ALGOLIA_APPLICATION_ID", "ALGOLIA_API_KEY")

    # Call the API
    response = client.custom_put(
        path="test/minimal",
    )

    print(response)

    # Skip deserialization
    raw_response = client.custom_put_with_http_info(
        path="test/minimal",
    )

    print(raw_response.raw_data)

    # >LOG
    # use the class directly
    print(response)

    # print the JSON response
    print(response.to_json())
    # SEPARATOR<


def snippet_for_delete_recommend_rule():
    """
    Snippet for the deleteRecommendRule method.

    deleteRecommendRule
    """
    # >SEPARATOR deleteRecommendRule default
    # Initialize the client
    # In an asynchronous context, you can use RecommendClient instead, which exposes the exact same methods.
    client = RecommendClientSync("ALGOLIA_APPLICATION_ID", "ALGOLIA_API_KEY")

    # Call the API
    response = client.delete_recommend_rule(
        index_name="<YOUR_INDEX_NAME>",
        model="related-products",
        object_id="objectID",
    )

    print(response)

    # Skip deserialization
    raw_response = client.delete_recommend_rule_with_http_info(
        index_name="<YOUR_INDEX_NAME>",
        model="related-products",
        object_id="objectID",
    )

    print(raw_response.raw_data)

    # >LOG
    # use the class directly
    print(response)

    # print the JSON response
    print(response.to_json())
    # SEPARATOR<


def snippet_for_get_recommend_rule():
    """
    Snippet for the getRecommendRule method.

    getRecommendRule
    """
    # >SEPARATOR getRecommendRule default
    # Initialize the client
    # In an asynchronous context, you can use RecommendClient instead, which exposes the exact same methods.
    client = RecommendClientSync("ALGOLIA_APPLICATION_ID", "ALGOLIA_API_KEY")

    # Call the API
    response = client.get_recommend_rule(
        index_name="<YOUR_INDEX_NAME>",
        model="related-products",
        object_id="objectID",
    )

    print(response)

    # Skip deserialization
    raw_response = client.get_recommend_rule_with_http_info(
        index_name="<YOUR_INDEX_NAME>",
        model="related-products",
        object_id="objectID",
    )

    print(raw_response.raw_data)

    # >LOG
    # use the class directly
    print(response)

    # print the JSON response
    print(response.to_json())
    # SEPARATOR<


def snippet_for_get_recommend_status():
    """
    Snippet for the getRecommendStatus method.

    getRecommendStatus
    """
    # >SEPARATOR getRecommendStatus default
    # Initialize the client
    # In an asynchronous context, you can use RecommendClient instead, which exposes the exact same methods.
    client = RecommendClientSync("ALGOLIA_APPLICATION_ID", "ALGOLIA_API_KEY")

    # Call the API
    response = client.get_recommend_status(
        index_name="<YOUR_INDEX_NAME>",
        model="related-products",
        task_id=12345,
    )

    print(response)

    # Skip deserialization
    raw_response = client.get_recommend_status_with_http_info(
        index_name="<YOUR_INDEX_NAME>",
        model="related-products",
        task_id=12345,
    )

    print(raw_response.raw_data)

    # >LOG
    # use the class directly
    print(response)

    # print the JSON response
    print(response.to_json())
    # SEPARATOR<


def snippet_for_get_recommendations():
    """
    Snippet for the getRecommendations method.

    get recommendations for recommend model with minimal parameters
    """
    # >SEPARATOR getRecommendations default
    # Initialize the client
    # In an asynchronous context, you can use RecommendClient instead, which exposes the exact same methods.
    client = RecommendClientSync("ALGOLIA_APPLICATION_ID", "ALGOLIA_API_KEY")

    # Call the API
    response = client.get_recommendations(
        get_recommendations_params={
            "requests": [
                {
                    "indexName": "<YOUR_INDEX_NAME>",
                    "objectID": "objectID",
                    "model": "related-products",
                    "threshold": 42.1,
                },
            ],
        },
    )

    print(response)

    # Skip deserialization
    raw_response = client.get_recommendations_with_http_info(
        get_recommendations_params={
            "requests": [
                {
                    "indexName": "<YOUR_INDEX_NAME>",
                    "objectID": "objectID",
                    "model": "related-products",
                    "threshold": 42.1,
                },
            ],
        },
    )

    print(raw_response.raw_data)

    # >LOG
    # use the class directly
    print(response)

    # print the JSON response
    print(response.to_json())
    # SEPARATOR<


def snippet_for_search_recommend_rules():
    """
    Snippet for the searchRecommendRules method.

    searchRecommendRules
    """
    # >SEPARATOR searchRecommendRules default
    # Initialize the client
    # In an asynchronous context, you can use RecommendClient instead, which exposes the exact same methods.
    client = RecommendClientSync("ALGOLIA_APPLICATION_ID", "ALGOLIA_API_KEY")

    # Call the API
    response = client.search_recommend_rules(
        index_name="<YOUR_INDEX_NAME>",
        model="related-products",
    )

    print(response)

    # Skip deserialization
    raw_response = client.search_recommend_rules_with_http_info(
        index_name="<YOUR_INDEX_NAME>",
        model="related-products",
    )

    print(raw_response.raw_data)

    # >LOG
    # use the class directly
    print(response)

    # print the JSON response
    print(response.to_json())
    # SEPARATOR<


def snippet_for_set_client_api_key():
    """
    Snippet for the setClientApiKey method.

    switch API key
    """
    # >SEPARATOR setClientApiKey default
    # Initialize the client
    # In an asynchronous context, you can use RecommendClient instead, which exposes the exact same methods.
    client = RecommendClientSync("ALGOLIA_APPLICATION_ID", "ALGOLIA_API_KEY")

    # Call the API
    client.set_client_api_key(
        api_key="updated-api-key",
    )

    # Skip deserialization
    client.set_client_api_key_with_http_info(
        api_key="updated-api-key",
    )

    # >LOG
    # SEPARATOR<
