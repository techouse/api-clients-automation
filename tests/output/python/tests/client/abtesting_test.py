# Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
from os import environ
from re import compile
from json import loads

from algoliasearch.http.transporter import EchoTransporter
from algoliasearch.http.transporter_sync import EchoTransporterSync
from algoliasearch.http.hosts import Host, HostsCollection
from algoliasearch.abtesting.client import AbtestingClient
from algoliasearch.abtesting.client import AbtestingClientSync
from algoliasearch.abtesting.config import AbtestingConfig


class TestAbtestingClient:
    def create_client(self) -> AbtestingClient:
        _config = AbtestingConfig("appId", "apiKey", "us")
        return AbtestingClient.create_with_config(
            config=_config, transporter=EchoTransporter(_config)
        )

    async def test_common_api_0(self):
        """
        calls api with correct user agent
        """
        _client = self.create_client()

        _req = await _client.custom_post_with_http_info(
            path="1/test",
        )
        regex_user_agent = compile(
            "^Algolia for Python \\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*(; Abtesting (\\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)))(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*$"
        )
        assert regex_user_agent.match(_req.headers.get("user-agent")) is not None

    async def test_common_api_1(self):
        """
        the user agent contains the latest version
        """
        _client = self.create_client()

        _req = await _client.custom_post_with_http_info(
            path="1/test",
        )
        regex_user_agent = compile("^Algolia for Python \\(4.8.0\\).*")
        assert regex_user_agent.match(_req.headers.get("user-agent")) is not None

    async def test_common_api_2(self):
        """
        calls api with default read timeouts
        """
        _client = self.create_client()

        _req = await _client.custom_get_with_http_info(
            path="1/test",
        )
        assert _req.timeouts.get("connect") == 2000
        assert _req.timeouts.get("response") == 5000

    async def test_common_api_3(self):
        """
        calls api with default write timeouts
        """
        _client = self.create_client()

        _req = await _client.custom_post_with_http_info(
            path="1/test",
        )
        assert _req.timeouts.get("connect") == 2000
        assert _req.timeouts.get("response") == 30000

    async def test_parameters_0(self):
        """
        fallbacks to the alias when region is not given
        """

        _config = AbtestingConfig("my-app-id", "my-api-key")
        _client = AbtestingClient.create_with_config(
            config=_config, transporter=EchoTransporter(_config)
        )
        _req = await _client.get_ab_test_with_http_info(
            id=123,
        )
        assert _req.host == "analytics.algolia.com"

    async def test_parameters_1(self):
        """
        uses the correct region
        """

        _config = AbtestingConfig("my-app-id", "my-api-key", "us")
        _client = AbtestingClient.create_with_config(
            config=_config, transporter=EchoTransporter(_config)
        )
        _req = await _client.get_ab_test_with_http_info(
            id=123,
        )
        assert _req.host == "analytics.us.algolia.com"

    async def test_parameters_2(self):
        """
        throws when incorrect region is given
        """

        try:
            _config = AbtestingConfig("my-app-id", "my-api-key", "not_a_region")
            _client = AbtestingClient.create_with_config(
                config=_config, transporter=EchoTransporter(_config)
            )
            assert False
        except (ValueError, Exception) as e:
            assert str(e) == "`region` must be one of the following: de, us"

    async def test_set_client_api_key_0(self):
        """
        switch API key
        """

        _config = AbtestingConfig("test-app-id", "test-api-key", "us")
        _config.hosts = HostsCollection(
            [
                Host(
                    url="localhost"
                    if environ.get("CI") == "true"
                    else "host.docker.internal",
                    scheme="http",
                    port=6683,
                )
            ]
        )
        _client = AbtestingClient.create_with_config(config=_config)
        _req = await _client.custom_get(
            path="check-api-key/1",
        )
        assert (
            _req
            if isinstance(_req, dict)
            else [elem.to_dict() for elem in _req]
            if isinstance(_req, list)
            else _req.to_dict()
        ) == loads("""{"headerAPIKeyValue":"test-api-key"}""")
        await _client.set_client_api_key(
            api_key="updated-api-key",
        )
        _req = await _client.custom_get(
            path="check-api-key/2",
        )
        assert (
            _req
            if isinstance(_req, dict)
            else [elem.to_dict() for elem in _req]
            if isinstance(_req, list)
            else _req.to_dict()
        ) == loads("""{"headerAPIKeyValue":"updated-api-key"}""")


class TestAbtestingClientSync:
    def create_client(self) -> AbtestingClientSync:
        _config = AbtestingConfig("appId", "apiKey", "us")
        return AbtestingClientSync.create_with_config(
            config=_config, transporter=EchoTransporterSync(_config)
        )

    def test_common_api_0(self):
        """
        calls api with correct user agent
        """
        _client = self.create_client()

        _req = _client.custom_post_with_http_info(
            path="1/test",
        )
        regex_user_agent = compile(
            "^Algolia for Python \\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*(; Abtesting (\\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)))(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*$"
        )
        assert regex_user_agent.match(_req.headers.get("user-agent")) is not None

    def test_common_api_1(self):
        """
        the user agent contains the latest version
        """
        _client = self.create_client()

        _req = _client.custom_post_with_http_info(
            path="1/test",
        )
        regex_user_agent = compile("^Algolia for Python \\(4.8.0\\).*")
        assert regex_user_agent.match(_req.headers.get("user-agent")) is not None

    def test_common_api_2(self):
        """
        calls api with default read timeouts
        """
        _client = self.create_client()

        _req = _client.custom_get_with_http_info(
            path="1/test",
        )
        assert _req.timeouts.get("connect") == 2000
        assert _req.timeouts.get("response") == 5000

    def test_common_api_3(self):
        """
        calls api with default write timeouts
        """
        _client = self.create_client()

        _req = _client.custom_post_with_http_info(
            path="1/test",
        )
        assert _req.timeouts.get("connect") == 2000
        assert _req.timeouts.get("response") == 30000

    def test_parameters_0(self):
        """
        fallbacks to the alias when region is not given
        """

        _config = AbtestingConfig("my-app-id", "my-api-key")
        _client = AbtestingClientSync.create_with_config(
            config=_config, transporter=EchoTransporterSync(_config)
        )
        _req = _client.get_ab_test_with_http_info(
            id=123,
        )
        assert _req.host == "analytics.algolia.com"

    def test_parameters_1(self):
        """
        uses the correct region
        """

        _config = AbtestingConfig("my-app-id", "my-api-key", "us")
        _client = AbtestingClientSync.create_with_config(
            config=_config, transporter=EchoTransporterSync(_config)
        )
        _req = _client.get_ab_test_with_http_info(
            id=123,
        )
        assert _req.host == "analytics.us.algolia.com"

    def test_parameters_2(self):
        """
        throws when incorrect region is given
        """

        try:
            _config = AbtestingConfig("my-app-id", "my-api-key", "not_a_region")
            _client = AbtestingClientSync.create_with_config(
                config=_config, transporter=EchoTransporterSync(_config)
            )
            assert False
        except (ValueError, Exception) as e:
            assert str(e) == "`region` must be one of the following: de, us"

    def test_set_client_api_key_0(self):
        """
        switch API key
        """

        _config = AbtestingConfig("test-app-id", "test-api-key", "us")
        _config.hosts = HostsCollection(
            [
                Host(
                    url="localhost"
                    if environ.get("CI") == "true"
                    else "host.docker.internal",
                    scheme="http",
                    port=6683,
                )
            ]
        )
        _client = AbtestingClientSync.create_with_config(config=_config)
        _req = _client.custom_get(
            path="check-api-key/1",
        )
        assert (
            _req
            if isinstance(_req, dict)
            else [elem.to_dict() for elem in _req]
            if isinstance(_req, list)
            else _req.to_dict()
        ) == loads("""{"headerAPIKeyValue":"test-api-key"}""")
        _client.set_client_api_key(
            api_key="updated-api-key",
        )
        _req = _client.custom_get(
            path="check-api-key/2",
        )
        assert (
            _req
            if isinstance(_req, dict)
            else [elem.to_dict() for elem in _req]
            if isinstance(_req, list)
            else _req.to_dict()
        ) == loads("""{"headerAPIKeyValue":"updated-api-key"}""")
