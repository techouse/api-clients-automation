from json import loads

from algoliasearch.http.transporter import EchoTransporter
from algoliasearch.personalization.client import PersonalizationClient
from algoliasearch.personalization.config import PersonalizationConfig


class TestPersonalizationClient:
    _config = PersonalizationConfig("test_app_id", "test_api_key", "us")
    _client = PersonalizationClient.create_with_config(
        config=_config, transporter=EchoTransporter(_config)
    )

    async def test_custom_delete_0(self):
        """
        allow del method for a custom path with minimal parameters
        """
        _req = await self._client.custom_delete_with_http_info(
            path="/test/minimal",
        )

        assert _req.path == "/1/test/minimal"
        assert _req.verb == "DELETE"
        assert _req.query_parameters.items() >= {}.items()
        assert _req.headers.items() >= {}.items()
        assert _req.data is None

    async def test_custom_delete_1(self):
        """
        allow del method for a custom path with all parameters
        """
        _req = await self._client.custom_delete_with_http_info(
            path="/test/all",
            parameters={
                "query": "parameters",
            },
        )

        assert _req.path == "/1/test/all"
        assert _req.verb == "DELETE"
        assert _req.query_parameters.items() >= {"query": "parameters"}.items()
        assert _req.headers.items() >= {}.items()
        assert _req.data is None

    async def test_custom_get_0(self):
        """
        allow get method for a custom path with minimal parameters
        """
        _req = await self._client.custom_get_with_http_info(
            path="/test/minimal",
        )

        assert _req.path == "/1/test/minimal"
        assert _req.verb == "GET"
        assert _req.query_parameters.items() >= {}.items()
        assert _req.headers.items() >= {}.items()
        assert _req.data is None

    async def test_custom_get_1(self):
        """
        allow get method for a custom path with all parameters
        """
        _req = await self._client.custom_get_with_http_info(
            path="/test/all",
            parameters={
                "query": "parameters",
            },
        )

        assert _req.path == "/1/test/all"
        assert _req.verb == "GET"
        assert _req.query_parameters.items() >= {"query": "parameters"}.items()
        assert _req.headers.items() >= {}.items()
        assert _req.data is None

    async def test_custom_post_0(self):
        """
        allow post method for a custom path with minimal parameters
        """
        _req = await self._client.custom_post_with_http_info(
            path="/test/minimal",
        )

        assert _req.path == "/1/test/minimal"
        assert _req.verb == "POST"
        assert _req.query_parameters.items() >= {}.items()
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads("""{}""")

    async def test_custom_post_1(self):
        """
        allow post method for a custom path with all parameters
        """
        _req = await self._client.custom_post_with_http_info(
            path="/test/all",
            parameters={
                "query": "parameters",
            },
            body={
                "body": "parameters",
            },
        )

        assert _req.path == "/1/test/all"
        assert _req.verb == "POST"
        assert _req.query_parameters.items() >= {"query": "parameters"}.items()
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads("""{"body":"parameters"}""")

    async def test_custom_post_2(self):
        """
        requestOptions can override default query parameters
        """
        _req = await self._client.custom_post_with_http_info(
            path="/test/requestOptions",
            parameters={
                "query": "parameters",
            },
            body={
                "facet": "filters",
            },
            request_options={
                "query_parameters": loads("""{"query":"myQueryParameter"}"""),
            },
        )

        assert _req.path == "/1/test/requestOptions"
        assert _req.verb == "POST"
        assert _req.query_parameters.items() >= {"query": "myQueryParameter"}.items()
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads("""{"facet":"filters"}""")

    async def test_custom_post_3(self):
        """
        requestOptions merges query parameters with default ones
        """
        _req = await self._client.custom_post_with_http_info(
            path="/test/requestOptions",
            parameters={
                "query": "parameters",
            },
            body={
                "facet": "filters",
            },
            request_options={
                "query_parameters": loads("""{"query2":"myQueryParameter"}"""),
            },
        )

        assert _req.path == "/1/test/requestOptions"
        assert _req.verb == "POST"
        assert (
            _req.query_parameters.items()
            >= {"query": "parameters", "query2": "myQueryParameter"}.items()
        )
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads("""{"facet":"filters"}""")

    async def test_custom_post_4(self):
        """
        requestOptions can override default headers
        """
        _req = await self._client.custom_post_with_http_info(
            path="/test/requestOptions",
            parameters={
                "query": "parameters",
            },
            body={
                "facet": "filters",
            },
            request_options={
                "headers": loads("""{"x-algolia-api-key":"myApiKey"}"""),
            },
        )

        assert _req.path == "/1/test/requestOptions"
        assert _req.verb == "POST"
        assert _req.query_parameters.items() >= {"query": "parameters"}.items()
        assert _req.headers.items() >= {"x-algolia-api-key": "myApiKey"}.items()
        assert loads(_req.data) == loads("""{"facet":"filters"}""")

    async def test_custom_post_5(self):
        """
        requestOptions merges headers with default ones
        """
        _req = await self._client.custom_post_with_http_info(
            path="/test/requestOptions",
            parameters={
                "query": "parameters",
            },
            body={
                "facet": "filters",
            },
            request_options={
                "headers": loads("""{"x-algolia-api-key":"myApiKey"}"""),
            },
        )

        assert _req.path == "/1/test/requestOptions"
        assert _req.verb == "POST"
        assert _req.query_parameters.items() >= {"query": "parameters"}.items()
        assert _req.headers.items() >= {"x-algolia-api-key": "myApiKey"}.items()
        assert loads(_req.data) == loads("""{"facet":"filters"}""")

    async def test_custom_post_6(self):
        """
        requestOptions queryParameters accepts booleans
        """
        _req = await self._client.custom_post_with_http_info(
            path="/test/requestOptions",
            parameters={
                "query": "parameters",
            },
            body={
                "facet": "filters",
            },
            request_options={
                "query_parameters": loads("""{"isItWorking":true}"""),
            },
        )

        assert _req.path == "/1/test/requestOptions"
        assert _req.verb == "POST"
        assert (
            _req.query_parameters.items()
            >= {"query": "parameters", "isItWorking": "true"}.items()
        )
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads("""{"facet":"filters"}""")

    async def test_custom_post_7(self):
        """
        requestOptions queryParameters accepts integers
        """
        _req = await self._client.custom_post_with_http_info(
            path="/test/requestOptions",
            parameters={
                "query": "parameters",
            },
            body={
                "facet": "filters",
            },
            request_options={
                "query_parameters": loads("""{"myParam":2}"""),
            },
        )

        assert _req.path == "/1/test/requestOptions"
        assert _req.verb == "POST"
        assert (
            _req.query_parameters.items()
            >= {"query": "parameters", "myParam": "2"}.items()
        )
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads("""{"facet":"filters"}""")

    async def test_custom_post_8(self):
        """
        requestOptions queryParameters accepts list of string
        """
        _req = await self._client.custom_post_with_http_info(
            path="/test/requestOptions",
            parameters={
                "query": "parameters",
            },
            body={
                "facet": "filters",
            },
            request_options={
                "query_parameters": loads("""{"myParam":["c","d"]}"""),
            },
        )

        assert _req.path == "/1/test/requestOptions"
        assert _req.verb == "POST"
        assert (
            _req.query_parameters.items()
            >= {"query": "parameters", "myParam": "c,d"}.items()
        )
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads("""{"facet":"filters"}""")

    async def test_custom_post_9(self):
        """
        requestOptions queryParameters accepts list of booleans
        """
        _req = await self._client.custom_post_with_http_info(
            path="/test/requestOptions",
            parameters={
                "query": "parameters",
            },
            body={
                "facet": "filters",
            },
            request_options={
                "query_parameters": loads("""{"myParam":[true,true,false]}"""),
            },
        )

        assert _req.path == "/1/test/requestOptions"
        assert _req.verb == "POST"
        assert (
            _req.query_parameters.items()
            >= {"query": "parameters", "myParam": "true,true,false"}.items()
        )
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads("""{"facet":"filters"}""")

    async def test_custom_post_10(self):
        """
        requestOptions queryParameters accepts list of integers
        """
        _req = await self._client.custom_post_with_http_info(
            path="/test/requestOptions",
            parameters={
                "query": "parameters",
            },
            body={
                "facet": "filters",
            },
            request_options={
                "query_parameters": loads("""{"myParam":[1,2]}"""),
            },
        )

        assert _req.path == "/1/test/requestOptions"
        assert _req.verb == "POST"
        assert (
            _req.query_parameters.items()
            >= {"query": "parameters", "myParam": "1,2"}.items()
        )
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads("""{"facet":"filters"}""")

    async def test_custom_put_0(self):
        """
        allow put method for a custom path with minimal parameters
        """
        _req = await self._client.custom_put_with_http_info(
            path="/test/minimal",
        )

        assert _req.path == "/1/test/minimal"
        assert _req.verb == "PUT"
        assert _req.query_parameters.items() >= {}.items()
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads("""{}""")

    async def test_custom_put_1(self):
        """
        allow put method for a custom path with all parameters
        """
        _req = await self._client.custom_put_with_http_info(
            path="/test/all",
            parameters={
                "query": "parameters",
            },
            body={
                "body": "parameters",
            },
        )

        assert _req.path == "/1/test/all"
        assert _req.verb == "PUT"
        assert _req.query_parameters.items() >= {"query": "parameters"}.items()
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads("""{"body":"parameters"}""")

    async def test_delete_user_profile_0(self):
        """
        delete deleteUserProfile
        """
        _req = await self._client.delete_user_profile_with_http_info(
            user_token="UserToken",
        )

        assert _req.path == "/1/profiles/UserToken"
        assert _req.verb == "DELETE"
        assert _req.query_parameters.items() >= {}.items()
        assert _req.headers.items() >= {}.items()
        assert _req.data is None

    async def test_get_personalization_strategy_0(self):
        """
        get getPersonalizationStrategy
        """
        _req = await self._client.get_personalization_strategy_with_http_info()

        assert _req.path == "/1/strategies/personalization"
        assert _req.verb == "GET"
        assert _req.query_parameters.items() >= {}.items()
        assert _req.headers.items() >= {}.items()
        assert _req.data is None

    async def test_get_user_token_profile_0(self):
        """
        get getUserTokenProfile
        """
        _req = await self._client.get_user_token_profile_with_http_info(
            user_token="UserToken",
        )

        assert _req.path == "/1/profiles/personalization/UserToken"
        assert _req.verb == "GET"
        assert _req.query_parameters.items() >= {}.items()
        assert _req.headers.items() >= {}.items()
        assert _req.data is None

    async def test_set_personalization_strategy_0(self):
        """
        set setPersonalizationStrategy
        """
        _req = await self._client.set_personalization_strategy_with_http_info(
            personalization_strategy_params={
                "eventScoring": [
                    {
                        "score": 42,
                        "eventName": "Algolia",
                        "eventType": "Event",
                    },
                ],
                "facetScoring": [
                    {
                        "score": 42,
                        "facetName": "Event",
                    },
                ],
                "personalizationImpact": 42,
            },
        )

        assert _req.path == "/1/strategies/personalization"
        assert _req.verb == "POST"
        assert _req.query_parameters.items() >= {}.items()
        assert _req.headers.items() >= {}.items()
        assert loads(_req.data) == loads(
            """{"eventScoring":[{"score":42,"eventName":"Algolia","eventType":"Event"}],"facetScoring":[{"score":42,"facetName":"Event"}],"personalizationImpact":42}"""
        )