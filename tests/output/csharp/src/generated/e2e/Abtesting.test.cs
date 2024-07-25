// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
using System.Text.Json;
using Algolia.Search.Clients;
using Algolia.Search.Http;
using Algolia.Search.Models.Abtesting;
using Algolia.Search.Serializer;
using Algolia.Search.Tests.Utils;
using dotenv.net;
using Quibble.Xunit;
using Xunit;
using Action = Algolia.Search.Models.Ingestion.Action;

namespace Algolia.Search.e2e;

public class AbtestingClientRequestTestsE2E
{
  private readonly AbtestingClient client;

  public AbtestingClientRequestTestsE2E()
  {
    DotEnv.Load(
      options: new DotEnvOptions(
        ignoreExceptions: true,
        probeForEnv: true,
        probeLevelsToSearch: 8,
        envFilePaths: new[] { ".env" }
      )
    );

    var appId = Environment.GetEnvironmentVariable("ALGOLIA_APPLICATION_ID");
    if (appId == null)
    {
      throw new Exception("please provide an `ALGOLIA_APPLICATION_ID` env var for e2e tests");
    }

    var apiKey = Environment.GetEnvironmentVariable("ALGOLIA_ADMIN_KEY");
    if (apiKey == null)
    {
      throw new Exception("please provide an `ALGOLIA_ADMIN_KEY` env var for e2e tests");
    }

    client = new AbtestingClient(new AbtestingConfig(appId, apiKey, "us"));
  }

  [Fact]
  public void Dispose() { }

  [Fact(DisplayName = "listABTests with parameters")]
  public async Task ListABTestsTest1()
  {
    try
    {
      var resp = await client.ListABTestsAsync(0, 21, "cts_e2e ab", "t");
      // Check status code 200
      Assert.NotNull(resp);

      JsonAssert.EqualOverrideDefault(
        "{\"abtests\":[{\"abTestID\":85635,\"createdAt\":\"2024-05-13T10:12:27.739233Z\",\"endAt\":\"2124-05-13T00:00:00Z\",\"name\":\"cts_e2e_abtest\",\"status\":\"active\",\"variants\":[{\"addToCartCount\":0,\"clickCount\":0,\"conversionCount\":0,\"description\":\"this abtest is used for api client automation tests and will expire in 2124\",\"index\":\"cts_e2e_search_facet\",\"purchaseCount\":0,\"trafficPercentage\":25},{\"addToCartCount\":0,\"clickCount\":0,\"conversionCount\":0,\"description\":\"\",\"index\":\"cts_e2e abtest\",\"purchaseCount\":0,\"trafficPercentage\":75}]}],\"count\":1,\"total\":1}",
        JsonSerializer.Serialize(resp, JsonConfig.Options),
        new JsonDiffConfig(true)
      );
    }
    catch (Exception e)
    {
      Assert.Fail("An exception was thrown: " + e.Message);
    }
  }
}
