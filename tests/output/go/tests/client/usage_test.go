// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package client

import (
	"encoding/json"
	"regexp"
	"testing"

	"github.com/stretchr/testify/require"

	"gotests/tests"

	"github.com/algolia/algoliasearch-client-go/v4/algolia/call"
	"github.com/algolia/algoliasearch-client-go/v4/algolia/transport"
	"github.com/algolia/algoliasearch-client-go/v4/algolia/usage"
)

func createUsageClient(t *testing.T) (*usage.APIClient, *tests.EchoRequester) {
	echo := &tests.EchoRequester{}
	cfg := usage.UsageConfiguration{
		Configuration: transport.Configuration{
			AppID:     "appID",
			ApiKey:    "apiKey",
			Requester: echo,
		},
	}
	client, err := usage.NewClientWithConfig(cfg)
	require.NoError(t, err)

	return client, echo
}

// calls api with correct read host
func TestUsageapi0(t *testing.T) {
	var err error
	var res any
	_ = res
	echo := &tests.EchoRequester{}
	var client *usage.APIClient
	var cfg usage.UsageConfiguration
	_ = client
	_ = echo
	cfg = usage.UsageConfiguration{
		Configuration: transport.Configuration{
			AppID:     "test-app-id",
			ApiKey:    "test-api-key",
			Requester: echo,
		},
	}
	client, err = usage.NewClientWithConfig(cfg)
	require.NoError(t, err)
	res, err = client.CustomGet(client.NewApiCustomGetRequest(
		"test",
	))
	require.NoError(t, err)
	require.Equal(t, "usage.algolia.com", echo.Host)
}

// calls api with correct write host
func TestUsageapi1(t *testing.T) {
	var err error
	var res any
	_ = res
	echo := &tests.EchoRequester{}
	var client *usage.APIClient
	var cfg usage.UsageConfiguration
	_ = client
	_ = echo
	cfg = usage.UsageConfiguration{
		Configuration: transport.Configuration{
			AppID:     "test-app-id",
			ApiKey:    "test-api-key",
			Requester: echo,
		},
	}
	client, err = usage.NewClientWithConfig(cfg)
	require.NoError(t, err)
	res, err = client.CustomPost(client.NewApiCustomPostRequest(
		"test",
	))
	require.NoError(t, err)
	require.Equal(t, "usage.algolia.com", echo.Host)
}

// calls api with correct user agent
func TestUsagecommonApi0(t *testing.T) {
	var err error
	var res any
	_ = res
	client, echo := createUsageClient(t)
	_ = echo
	res, err = client.CustomPost(client.NewApiCustomPostRequest(
		"1/test",
	))
	require.NoError(t, err)
	require.Regexp(t, regexp.MustCompile(`^Algolia for Go \(\d+\.\d+\.\d+(-?.*)?\)(; [a-zA-Z. ]+ (\(\d+((\.\d+)?\.\d+)?(-?.*)?\))?)*(; Usage (\(\d+\.\d+\.\d+(-?.*)?\)))(; [a-zA-Z. ]+ (\(\d+((\.\d+)?\.\d+)?(-?.*)?\))?)*$`), echo.Header.Get("User-Agent"))
}

// the user agent contains the latest version
func TestUsagecommonApi1(t *testing.T) {
	var err error
	var res any
	_ = res
	client, echo := createUsageClient(t)
	_ = echo
	res, err = client.CustomPost(client.NewApiCustomPostRequest(
		"1/test",
	))
	require.NoError(t, err)
	require.Regexp(t, regexp.MustCompile(`^Algolia for Go \(4.3.0\).*`), echo.Header.Get("User-Agent"))
}

// calls api with default read timeouts
func TestUsagecommonApi2(t *testing.T) {
	var err error
	var res any
	_ = res
	client, echo := createUsageClient(t)
	_ = echo
	res, err = client.CustomGet(client.NewApiCustomGetRequest(
		"1/test",
	))
	require.NoError(t, err)
	require.Equal(t, int64(2000), echo.ConnectTimeout.Milliseconds())
	require.Equal(t, int64(5000), echo.Timeout.Milliseconds())
}

// calls api with default write timeouts
func TestUsagecommonApi3(t *testing.T) {
	var err error
	var res any
	_ = res
	client, echo := createUsageClient(t)
	_ = echo
	res, err = client.CustomPost(client.NewApiCustomPostRequest(
		"1/test",
	))
	require.NoError(t, err)
	require.Equal(t, int64(2000), echo.ConnectTimeout.Milliseconds())
	require.Equal(t, int64(30000), echo.Timeout.Milliseconds())
}

// client throws with invalid parameters
func TestUsageparameters0(t *testing.T) {
	var err error
	var res any
	_ = res
	echo := &tests.EchoRequester{}
	var client *usage.APIClient
	var cfg usage.UsageConfiguration
	_ = client
	_ = echo
	cfg = usage.UsageConfiguration{
		Configuration: transport.Configuration{
			AppID:     "",
			ApiKey:    "",
			Requester: echo,
		},
	}
	client, err = usage.NewClientWithConfig(cfg)
	require.EqualError(t, err, "`appId` is missing.")
	cfg = usage.UsageConfiguration{
		Configuration: transport.Configuration{
			AppID:     "",
			ApiKey:    "my-api-key",
			Requester: echo,
		},
	}
	client, err = usage.NewClientWithConfig(cfg)
	require.EqualError(t, err, "`appId` is missing.")
	cfg = usage.UsageConfiguration{
		Configuration: transport.Configuration{
			AppID:     "my-app-id",
			ApiKey:    "",
			Requester: echo,
		},
	}
	client, err = usage.NewClientWithConfig(cfg)
	require.EqualError(t, err, "`apiKey` is missing.")
}

// switch API key
func TestUsagesetClientApiKey0(t *testing.T) {
	var err error
	var res any
	_ = res
	echo := &tests.EchoRequester{}
	var client *usage.APIClient
	var cfg usage.UsageConfiguration
	_ = client
	_ = echo
	cfg = usage.UsageConfiguration{
		Configuration: transport.Configuration{
			AppID:  "test-app-id",
			ApiKey: "test-api-key",
			Hosts:  []transport.StatefulHost{transport.NewStatefulHost("http", "localhost:6683", call.IsReadWrite)},
		},
	}
	client, err = usage.NewClientWithConfig(cfg)
	require.NoError(t, err)
	{
		res, err = client.CustomGet(client.NewApiCustomGetRequest(
			"check-api-key/1",
		))
		require.NoError(t, err)
		rawBody, err := json.Marshal(res)
		require.NoError(t, err)
		require.JSONEq(t, `{"headerAPIKeyValue":"test-api-key"}`, string(rawBody))
	}
	{
		err = client.SetClientApiKey(
			"updated-api-key",
		)
		require.NoError(t, err)
	}
	{
		res, err = client.CustomGet(client.NewApiCustomGetRequest(
			"check-api-key/2",
		))
		require.NoError(t, err)
		rawBody, err := json.Marshal(res)
		require.NoError(t, err)
		require.JSONEq(t, `{"headerAPIKeyValue":"updated-api-key"}`, string(rawBody))
	}
}
