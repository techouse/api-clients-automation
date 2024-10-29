// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
using System.Text.Json;
using System.Text.RegularExpressions;
using Algolia.Search.Clients;
using Algolia.Search.Http;
using Algolia.Search.Models.Analytics;
using Algolia.Search.Models.Common;
using Algolia.Search.Serializer;
using Algolia.Search.Tests.Utils;
using Algolia.Search.Transport;
using Quibble.Xunit;
using Xunit;

namespace Algolia.Search.client;

public class AnalyticsClientTests
{
  private readonly EchoHttpRequester _echo;
  private Exception _ex;

  public AnalyticsClientTests()
  {
    _echo = new EchoHttpRequester();
  }

  [Fact]
  public void Dispose() { }

  [Fact(DisplayName = "calls api with correct user agent")]
  public async Task CommonApiTest0()
  {
    var client = new AnalyticsClient(new AnalyticsConfig("appId", "apiKey", "us"), _echo);
    await client.CustomPostAsync("1/test");
    EchoResponse result = _echo.LastResponse;
    {
      var regexp = new Regex(
        "^Algolia for Csharp \\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*(; Analytics (\\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)))(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*$"
      );
      Assert.Matches(regexp, result.Headers["user-agent"]);
    }
  }

  [Fact(DisplayName = "the user agent contains the latest version")]
  public async Task CommonApiTest1()
  {
    var client = new AnalyticsClient(new AnalyticsConfig("appId", "apiKey", "us"), _echo);
    await client.CustomPostAsync("1/test");
    EchoResponse result = _echo.LastResponse;
    {
      var regexp = new Regex("^Algolia for Csharp \\(7.7.0\\).*");
      Assert.Matches(regexp, result.Headers["user-agent"]);
    }
  }

  [Fact(DisplayName = "calls api with default read timeouts")]
  public async Task CommonApiTest2()
  {
    var client = new AnalyticsClient(new AnalyticsConfig("appId", "apiKey", "us"), _echo);
    await client.CustomGetAsync("1/test");
    EchoResponse result = _echo.LastResponse;

    Assert.Equal(2000, result.ConnectTimeout.TotalMilliseconds);
    Assert.Equal(5000, result.ResponseTimeout.TotalMilliseconds);
  }

  [Fact(DisplayName = "calls api with default write timeouts")]
  public async Task CommonApiTest3()
  {
    var client = new AnalyticsClient(new AnalyticsConfig("appId", "apiKey", "us"), _echo);
    await client.CustomPostAsync("1/test");
    EchoResponse result = _echo.LastResponse;

    Assert.Equal(2000, result.ConnectTimeout.TotalMilliseconds);
    Assert.Equal(30000, result.ResponseTimeout.TotalMilliseconds);
  }

  [Fact(DisplayName = "fallbacks to the alias when region is not given")]
  public async Task ParametersTest0()
  {
    var client = new AnalyticsClient(new AnalyticsConfig("my-app-id", "my-api-key"), _echo);

    await client.GetAverageClickPositionAsync("my-index");
    EchoResponse result = _echo.LastResponse;

    Assert.Equal("analytics.algolia.com", result.Host);
  }

  [Fact(DisplayName = "uses the correct region")]
  public async Task ParametersTest1()
  {
    var client = new AnalyticsClient(new AnalyticsConfig("my-app-id", "my-api-key", "de"), _echo);

    await client.CustomPostAsync("test");
    EchoResponse result = _echo.LastResponse;

    Assert.Equal("analytics.de.algolia.com", result.Host);
  }

  [Fact(DisplayName = "throws when incorrect region is given")]
  public async Task ParametersTest2()
  {
    _ex = await Assert.ThrowsAnyAsync<Exception>(async () =>
    {
      var client = new AnalyticsClient(
        new AnalyticsConfig("my-app-id", "my-api-key", "not_a_region"),
        _echo
      );
    });
    Assert.Equal(
      "`region` must be one of the following: de, us".ToLowerInvariant(),
      _ex.Message.ToLowerInvariant()
    );
  }

  [Fact(DisplayName = "getAverageClickPosition throws without index")]
  public async Task ParametersTest3()
  {
    var client = new AnalyticsClient(new AnalyticsConfig("appId", "apiKey", "us"), _echo);
    _ex = await Assert.ThrowsAnyAsync<Exception>(async () =>
    {
      await client.GetClickPositionsAsync(null);
      EchoResponse result = _echo.LastResponse;
    });
    Assert.Equal(
      "Parameter `index` is required when calling `getClickPositions`.".ToLowerInvariant(),
      _ex.Message.ToLowerInvariant()
    );
  }

  [Fact(DisplayName = "switch API key")]
  public async Task SetClientApiKeyTest0()
  {
    AnalyticsConfig _config = new AnalyticsConfig("test-app-id", "test-api-key", "us")
    {
      CustomHosts = new List<StatefulHost>
      {
        new()
        {
          Scheme = HttpScheme.Http,
          Url =
            Environment.GetEnvironmentVariable("CI") == "true"
              ? "localhost"
              : "host.docker.internal",
          Port = 6683,
          Up = true,
          LastUse = DateTime.UtcNow,
          Accept = CallType.Read | CallType.Write,
        },
      },
    };
    var client = new AnalyticsClient(_config);

    {
      var res = await client.CustomGetAsync("check-api-key/1");

      JsonAssert.EqualOverrideDefault(
        "{\"headerAPIKeyValue\":\"test-api-key\"}",
        JsonSerializer.Serialize(res, JsonConfig.Options),
        new JsonDiffConfig(false)
      );
    }
    {
      client.SetClientApiKey("updated-api-key");
    }
    {
      var res = await client.CustomGetAsync("check-api-key/2");

      JsonAssert.EqualOverrideDefault(
        "{\"headerAPIKeyValue\":\"updated-api-key\"}",
        JsonSerializer.Serialize(res, JsonConfig.Options),
        new JsonDiffConfig(false)
      );
    }
  }
}
