using Algolia.Search.Clients;
using Algolia.Search.Http;
using Algolia.Search.Models.QuerySuggestions;
using Action = Algolia.Search.Models.Search.Action;

public class SnippetQuerySuggestionsClient
{
  /// <summary>
  /// Snippet for the CreateConfig method.
  ///
  /// createConfig0
  /// </summary>
  public async Task SnippetForCreateConfig0()
  {
    // Initialize the client
    var client = new QuerySuggestionsClient(
      new QuerySuggestionsConfig("YOUR_APP_ID", "YOUR_API_KEY", "YOUR_APP_ID_REGION")
    );

    // Call the API
    var response = await client.CreateConfigAsync(
      new QuerySuggestionsConfigurationWithIndex
      {
        IndexName = "theIndexName",
        SourceIndices = new List<SourceIndex>
        {
          new SourceIndex
          {
            IndexName = "testIndex",
            Facets = new List<Facet> { new Facet { Attribute = "test", } },
            Generate = new List<List<string>>
            {
              new List<string> { "facetA", "facetB" },
              new List<string> { "facetC" }
            },
          }
        },
        Languages = new Languages(new List<string> { "french" }),
        Exclude = new List<string> { "test" },
      }
    );
  }

  /// <summary>
  /// Snippet for the CustomDelete method.
  ///
  /// allow del method for a custom path with minimal parameters
  /// </summary>
  public async Task SnippetForCustomDelete0()
  {
    // Initialize the client
    var client = new QuerySuggestionsClient(
      new QuerySuggestionsConfig("YOUR_APP_ID", "YOUR_API_KEY", "YOUR_APP_ID_REGION")
    );

    // Call the API
    var response = await client.CustomDeleteAsync("/test/minimal");
  }

  /// <summary>
  /// Snippet for the CustomGet method.
  ///
  /// allow get method for a custom path with minimal parameters
  /// </summary>
  public async Task SnippetForCustomGet0()
  {
    // Initialize the client
    var client = new QuerySuggestionsClient(
      new QuerySuggestionsConfig("YOUR_APP_ID", "YOUR_API_KEY", "YOUR_APP_ID_REGION")
    );

    // Call the API
    var response = await client.CustomGetAsync("/test/minimal");
  }

  /// <summary>
  /// Snippet for the CustomPost method.
  ///
  /// allow post method for a custom path with minimal parameters
  /// </summary>
  public async Task SnippetForCustomPost0()
  {
    // Initialize the client
    var client = new QuerySuggestionsClient(
      new QuerySuggestionsConfig("YOUR_APP_ID", "YOUR_API_KEY", "YOUR_APP_ID_REGION")
    );

    // Call the API
    var response = await client.CustomPostAsync("/test/minimal");
  }

  /// <summary>
  /// Snippet for the CustomPut method.
  ///
  /// allow put method for a custom path with minimal parameters
  /// </summary>
  public async Task SnippetForCustomPut0()
  {
    // Initialize the client
    var client = new QuerySuggestionsClient(
      new QuerySuggestionsConfig("YOUR_APP_ID", "YOUR_API_KEY", "YOUR_APP_ID_REGION")
    );

    // Call the API
    var response = await client.CustomPutAsync("/test/minimal");
  }

  /// <summary>
  /// Snippet for the DeleteConfig method.
  ///
  /// deleteConfig0
  /// </summary>
  public async Task SnippetForDeleteConfig0()
  {
    // Initialize the client
    var client = new QuerySuggestionsClient(
      new QuerySuggestionsConfig("YOUR_APP_ID", "YOUR_API_KEY", "YOUR_APP_ID_REGION")
    );

    // Call the API
    var response = await client.DeleteConfigAsync("theIndexName");
  }

  /// <summary>
  /// Snippet for the GetAllConfigs method.
  ///
  /// getAllConfigs0
  /// </summary>
  public async Task SnippetForGetAllConfigs0()
  {
    // Initialize the client
    var client = new QuerySuggestionsClient(
      new QuerySuggestionsConfig("YOUR_APP_ID", "YOUR_API_KEY", "YOUR_APP_ID_REGION")
    );

    // Call the API
    var response = await client.GetAllConfigsAsync();
  }

  /// <summary>
  /// Snippet for the GetConfig method.
  ///
  /// getConfig0
  /// </summary>
  public async Task SnippetForGetConfig0()
  {
    // Initialize the client
    var client = new QuerySuggestionsClient(
      new QuerySuggestionsConfig("YOUR_APP_ID", "YOUR_API_KEY", "YOUR_APP_ID_REGION")
    );

    // Call the API
    var response = await client.GetConfigAsync("theIndexName");
  }

  /// <summary>
  /// Snippet for the GetConfigStatus method.
  ///
  /// getConfigStatus0
  /// </summary>
  public async Task SnippetForGetConfigStatus0()
  {
    // Initialize the client
    var client = new QuerySuggestionsClient(
      new QuerySuggestionsConfig("YOUR_APP_ID", "YOUR_API_KEY", "YOUR_APP_ID_REGION")
    );

    // Call the API
    var response = await client.GetConfigStatusAsync("theIndexName");
  }

  /// <summary>
  /// Snippet for the GetLogFile method.
  ///
  /// getLogFile0
  /// </summary>
  public async Task SnippetForGetLogFile0()
  {
    // Initialize the client
    var client = new QuerySuggestionsClient(
      new QuerySuggestionsConfig("YOUR_APP_ID", "YOUR_API_KEY", "YOUR_APP_ID_REGION")
    );

    // Call the API
    var response = await client.GetLogFileAsync("theIndexName");
  }

  /// <summary>
  /// Snippet for the UpdateConfig method.
  ///
  /// updateConfig0
  /// </summary>
  public async Task SnippetForUpdateConfig0()
  {
    // Initialize the client
    var client = new QuerySuggestionsClient(
      new QuerySuggestionsConfig("YOUR_APP_ID", "YOUR_API_KEY", "YOUR_APP_ID_REGION")
    );

    // Call the API
    var response = await client.UpdateConfigAsync(
      "theIndexName",
      new QuerySuggestionsConfiguration
      {
        SourceIndices = new List<SourceIndex>
        {
          new SourceIndex
          {
            IndexName = "testIndex",
            Facets = new List<Facet> { new Facet { Attribute = "test", } },
            Generate = new List<List<string>>
            {
              new List<string> { "facetA", "facetB" },
              new List<string> { "facetC" }
            },
          }
        },
        Languages = new Languages(new List<string> { "french" }),
        Exclude = new List<string> { "test" },
      }
    );
  }
}
