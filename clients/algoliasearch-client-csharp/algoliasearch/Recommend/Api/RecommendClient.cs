//
// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
//

using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;
using Algolia.Search.Recommend.Client;
using Algolia.Search.Recommend.Models;
using Algolia.Search.Transport;
using Algolia.Search.Http;
using Algolia.Search.Client;

namespace Algolia.Search.Recommend.Api
{

  /// <summary>
  /// Represents a collection of functions to interact with the API endpoints
  /// </summary>
  public interface IRecommendClient
  {
    /// <summary>
    /// Send requests to the Algolia REST API.
    /// </summary>
    /// <remarks>
    /// This method allow you to send requests to the Algolia REST API.
    /// </remarks>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="path">Path of the endpoint, anything after \&quot;/1\&quot; must be specified.</param>
    /// <param name="parameters">Query parameters to apply to the current query. (optional)</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of Object</returns>
    Task<Object> CustomDeleteAsync(string path, Dictionary<string, Object> parameters = default(Dictionary<string, Object>), RequestOptions options = null, CancellationToken cancellationToken = default);
    /// <summary>
    /// Send requests to the Algolia REST API.
    /// </summary>
    /// <remarks>
    /// This method allow you to send requests to the Algolia REST API.
    /// </remarks>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="path">Path of the endpoint, anything after \&quot;/1\&quot; must be specified.</param>
    /// <param name="parameters">Query parameters to apply to the current query. (optional)</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of Object</returns>
    Task<Object> CustomGetAsync(string path, Dictionary<string, Object> parameters = default(Dictionary<string, Object>), RequestOptions options = null, CancellationToken cancellationToken = default);
    /// <summary>
    /// Send requests to the Algolia REST API.
    /// </summary>
    /// <remarks>
    /// This method allow you to send requests to the Algolia REST API.
    /// </remarks>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="path">Path of the endpoint, anything after \&quot;/1\&quot; must be specified.</param>
    /// <param name="parameters">Query parameters to apply to the current query. (optional)</param>
    /// <param name="body">Parameters to send with the custom request. (optional)</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of Object</returns>
    Task<Object> CustomPostAsync(string path, Dictionary<string, Object> parameters = default(Dictionary<string, Object>), Object body = default(Object), RequestOptions options = null, CancellationToken cancellationToken = default);
    /// <summary>
    /// Send requests to the Algolia REST API.
    /// </summary>
    /// <remarks>
    /// This method allow you to send requests to the Algolia REST API.
    /// </remarks>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="path">Path of the endpoint, anything after \&quot;/1\&quot; must be specified.</param>
    /// <param name="parameters">Query parameters to apply to the current query. (optional)</param>
    /// <param name="body">Parameters to send with the custom request. (optional)</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of Object</returns>
    Task<Object> CustomPutAsync(string path, Dictionary<string, Object> parameters = default(Dictionary<string, Object>), Object body = default(Object), RequestOptions options = null, CancellationToken cancellationToken = default);
    /// <summary>
    /// Delete a Recommend rule.
    /// </summary>
    /// <remarks>
    /// Delete a [Recommend rule](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).
    /// </remarks>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="indexName">Index on which to perform the request.</param>
    /// <param name="model">[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). </param>
    /// <param name="objectID">Unique record (object) identifier.</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of DeletedAtResponse</returns>
    Task<DeletedAtResponse> DeleteRecommendRuleAsync(string indexName, RecommendModels model, string objectID, RequestOptions options = null, CancellationToken cancellationToken = default);
    /// <summary>
    /// Get a Recommend rule.
    /// </summary>
    /// <remarks>
    /// Return a [Recommend rule](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).
    /// </remarks>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="indexName">Index on which to perform the request.</param>
    /// <param name="model">[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). </param>
    /// <param name="objectID">Unique record (object) identifier.</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of RuleResponse</returns>
    Task<RuleResponse> GetRecommendRuleAsync(string indexName, RecommendModels model, string objectID, RequestOptions options = null, CancellationToken cancellationToken = default);
    /// <summary>
    /// Get a Recommend task's status.
    /// </summary>
    /// <remarks>
    /// Some operations, such as deleting a Recommend rule, will respond with a &#x60;taskID&#x60; value. Use this value here to check the status of that task.
    /// </remarks>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="indexName">Index on which to perform the request.</param>
    /// <param name="model">[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). </param>
    /// <param name="taskID">Unique identifier of a task. Numeric value (up to 64bits).</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of GetRecommendTaskResponse</returns>
    Task<GetRecommendTaskResponse> GetRecommendStatusAsync(string indexName, RecommendModels model, long taskID, RequestOptions options = null, CancellationToken cancellationToken = default);
    /// <summary>
    /// Get recommendations and trending items.
    /// </summary>
    /// <remarks>
    /// Returns results from either recommendation or trending models:    - **Recommendations** are provided by the [Related Products](https://www.algolia.com/doc/guides/algolia-recommend/overview/#related-products-and-related-content) and [Frequently Bought Together](https://www.algolia.com/doc/guides/algolia-recommend/overview/#frequently-bought-together) models   - **Trending** models are [Trending Items and Trending Facet Values](https://www.algolia.com/doc/guides/algolia-recommend/overview/#trending-items-and-trending-facet-values). 
    /// </remarks>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="getRecommendationsParams"></param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of GetRecommendationsResponse</returns>
    Task<GetRecommendationsResponse> GetRecommendationsAsync(GetRecommendationsParams getRecommendationsParams, RequestOptions options = null, CancellationToken cancellationToken = default);
    /// <summary>
    /// List Recommend rules.
    /// </summary>
    /// <remarks>
    /// List [Recommend rules](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).
    /// </remarks>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="indexName">Index on which to perform the request.</param>
    /// <param name="model">[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). </param>
    /// <param name="searchRecommendRulesParams"> (optional)</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of SearchRecommendRulesResponse</returns>
    Task<SearchRecommendRulesResponse> SearchRecommendRulesAsync(string indexName, RecommendModels model, SearchRecommendRulesParams searchRecommendRulesParams = default(SearchRecommendRulesParams), RequestOptions options = null, CancellationToken cancellationToken = default);
  }


  /// <summary>
  /// Represents a collection of functions to interact with the API endpoints
  /// </summary>
  public partial class RecommendClient : IRecommendClient
  {
    private readonly HttpTransport _transport;
    private readonly AlgoliaConfig _config;

    /// <summary>
    /// Create a new Recommend client for the given appID and apiKey.
    /// </summary>
    /// <param name="applicationId">Your application</param>
    /// <param name="apiKey">Your API key</param>
    public RecommendClient(string applicationId, string apiKey) : this(new RecommendConfig(applicationId, apiKey), new AlgoliaHttpRequester())
    {
    }

    /// <summary>
    /// Initialize a client with custom config
    /// </summary>
    /// <param name="config">Algolia configuration</param>
    public RecommendClient(RecommendConfig config) : this(config, new AlgoliaHttpRequester())
    {
    }

    /// <summary>
    /// Initialize the client with custom config and custom Requester
    /// </summary>
    /// <param name="config">Algolia Config</param>
    /// <param name="httpRequester">Your Http requester implementation of <see cref="IHttpRequester"/></param>
    public RecommendClient(RecommendConfig config, IHttpRequester httpRequester)
    {
      if (httpRequester == null)
      {
        throw new ArgumentNullException(nameof(httpRequester), "An httpRequester is required");
      }

      if (config == null)
      {
        throw new ArgumentNullException(nameof(config), "A config is required");
      }

      if (string.IsNullOrWhiteSpace(config.AppId))
      {
        throw new ArgumentNullException(nameof(config.AppId), "Application ID is required");
      }

      if (string.IsNullOrWhiteSpace(config.ApiKey))
      {
        throw new ArgumentNullException(nameof(config.ApiKey), "An API key is required");
      }

      _config = config;
      _transport = new HttpTransport(config, httpRequester);
    }


    /// <summary>
    /// Send requests to the Algolia REST API. This method allow you to send requests to the Algolia REST API.
    /// </summary>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="path">Path of the endpoint, anything after \&quot;/1\&quot; must be specified.</param>
    /// <param name="parameters">Query parameters to apply to the current query. (optional)</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of Object</returns>
    public async Task<Object> CustomDeleteAsync(string path, Dictionary<string, Object> parameters = default(Dictionary<string, Object>), RequestOptions options = null, CancellationToken cancellationToken = default)
    {
      // verify the required parameter 'path' is set
      if (path == null)
        throw new ApiException(400, "Missing required parameter 'path' when calling RecommendClient->CustomDelete");


      RequestOptions requestOptions = new RequestOptions();
      requestOptions.PathParameters.Add("path", ClientUtils.ParameterToString(path));
      if (parameters != null)
      {
        requestOptions.QueryParameters = ClientUtils.ParameterToDictionary("", "parameters", parameters);
      }


      return await _transport.ExecuteRequestAsync<Object>(new HttpMethod("DELETE"), "/1{path}", requestOptions, cancellationToken).ConfigureAwait(false);
    }


    /// <summary>
    /// Send requests to the Algolia REST API. This method allow you to send requests to the Algolia REST API.
    /// </summary>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="path">Path of the endpoint, anything after \&quot;/1\&quot; must be specified.</param>
    /// <param name="parameters">Query parameters to apply to the current query. (optional)</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of Object</returns>
    public async Task<Object> CustomGetAsync(string path, Dictionary<string, Object> parameters = default(Dictionary<string, Object>), RequestOptions options = null, CancellationToken cancellationToken = default)
    {
      // verify the required parameter 'path' is set
      if (path == null)
        throw new ApiException(400, "Missing required parameter 'path' when calling RecommendClient->CustomGet");


      RequestOptions requestOptions = new RequestOptions();
      requestOptions.PathParameters.Add("path", ClientUtils.ParameterToString(path));
      if (parameters != null)
      {
        requestOptions.QueryParameters = ClientUtils.ParameterToDictionary("", "parameters", parameters);
      }


      return await _transport.ExecuteRequestAsync<Object>(new HttpMethod("GET"), "/1{path}", requestOptions, cancellationToken).ConfigureAwait(false);
    }


    /// <summary>
    /// Send requests to the Algolia REST API. This method allow you to send requests to the Algolia REST API.
    /// </summary>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="path">Path of the endpoint, anything after \&quot;/1\&quot; must be specified.</param>
    /// <param name="parameters">Query parameters to apply to the current query. (optional)</param>
    /// <param name="body">Parameters to send with the custom request. (optional)</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of Object</returns>
    public async Task<Object> CustomPostAsync(string path, Dictionary<string, Object> parameters = default(Dictionary<string, Object>), Object body = default(Object), RequestOptions options = null, CancellationToken cancellationToken = default)
    {
      // verify the required parameter 'path' is set
      if (path == null)
        throw new ApiException(400, "Missing required parameter 'path' when calling RecommendClient->CustomPost");


      RequestOptions requestOptions = new RequestOptions();
      requestOptions.PathParameters.Add("path", ClientUtils.ParameterToString(path));
      if (parameters != null)
      {
        requestOptions.QueryParameters = ClientUtils.ParameterToDictionary("", "parameters", parameters);
      }
      requestOptions.Data = body;


      return await _transport.ExecuteRequestAsync<Object>(new HttpMethod("POST"), "/1{path}", requestOptions, cancellationToken).ConfigureAwait(false);
    }


    /// <summary>
    /// Send requests to the Algolia REST API. This method allow you to send requests to the Algolia REST API.
    /// </summary>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="path">Path of the endpoint, anything after \&quot;/1\&quot; must be specified.</param>
    /// <param name="parameters">Query parameters to apply to the current query. (optional)</param>
    /// <param name="body">Parameters to send with the custom request. (optional)</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of Object</returns>
    public async Task<Object> CustomPutAsync(string path, Dictionary<string, Object> parameters = default(Dictionary<string, Object>), Object body = default(Object), RequestOptions options = null, CancellationToken cancellationToken = default)
    {
      // verify the required parameter 'path' is set
      if (path == null)
        throw new ApiException(400, "Missing required parameter 'path' when calling RecommendClient->CustomPut");


      RequestOptions requestOptions = new RequestOptions();
      requestOptions.PathParameters.Add("path", ClientUtils.ParameterToString(path));
      if (parameters != null)
      {
        requestOptions.QueryParameters = ClientUtils.ParameterToDictionary("", "parameters", parameters);
      }
      requestOptions.Data = body;


      return await _transport.ExecuteRequestAsync<Object>(new HttpMethod("PUT"), "/1{path}", requestOptions, cancellationToken).ConfigureAwait(false);
    }


    /// <summary>
    /// Delete a Recommend rule. Delete a [Recommend rule](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).
    /// </summary>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="indexName">Index on which to perform the request.</param>
    /// <param name="model">[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). </param>
    /// <param name="objectID">Unique record (object) identifier.</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of DeletedAtResponse</returns>
    public async Task<DeletedAtResponse> DeleteRecommendRuleAsync(string indexName, RecommendModels model, string objectID, RequestOptions options = null, CancellationToken cancellationToken = default)
    {
      // verify the required parameter 'indexName' is set
      if (indexName == null)
        throw new ApiException(400, "Missing required parameter 'indexName' when calling RecommendClient->DeleteRecommendRule");

      // verify the required parameter 'model' is set
      if (model == null)
        throw new ApiException(400, "Missing required parameter 'model' when calling RecommendClient->DeleteRecommendRule");

      // verify the required parameter 'objectID' is set
      if (objectID == null)
        throw new ApiException(400, "Missing required parameter 'objectID' when calling RecommendClient->DeleteRecommendRule");


      RequestOptions requestOptions = new RequestOptions();
      requestOptions.PathParameters.Add("indexName", ClientUtils.ParameterToString(indexName));
      requestOptions.PathParameters.Add("model", ClientUtils.ParameterToString(model));
      requestOptions.PathParameters.Add("objectID", ClientUtils.ParameterToString(objectID));


      return await _transport.ExecuteRequestAsync<DeletedAtResponse>(new HttpMethod("DELETE"), "/1/indexes/{indexName}/{model}/recommend/rules/{objectID}", requestOptions, cancellationToken).ConfigureAwait(false);
    }


    /// <summary>
    /// Get a Recommend rule. Return a [Recommend rule](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).
    /// </summary>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="indexName">Index on which to perform the request.</param>
    /// <param name="model">[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). </param>
    /// <param name="objectID">Unique record (object) identifier.</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of RuleResponse</returns>
    public async Task<RuleResponse> GetRecommendRuleAsync(string indexName, RecommendModels model, string objectID, RequestOptions options = null, CancellationToken cancellationToken = default)
    {
      // verify the required parameter 'indexName' is set
      if (indexName == null)
        throw new ApiException(400, "Missing required parameter 'indexName' when calling RecommendClient->GetRecommendRule");

      // verify the required parameter 'model' is set
      if (model == null)
        throw new ApiException(400, "Missing required parameter 'model' when calling RecommendClient->GetRecommendRule");

      // verify the required parameter 'objectID' is set
      if (objectID == null)
        throw new ApiException(400, "Missing required parameter 'objectID' when calling RecommendClient->GetRecommendRule");


      RequestOptions requestOptions = new RequestOptions();
      requestOptions.PathParameters.Add("indexName", ClientUtils.ParameterToString(indexName));
      requestOptions.PathParameters.Add("model", ClientUtils.ParameterToString(model));
      requestOptions.PathParameters.Add("objectID", ClientUtils.ParameterToString(objectID));


      return await _transport.ExecuteRequestAsync<RuleResponse>(new HttpMethod("GET"), "/1/indexes/{indexName}/{model}/recommend/rules/{objectID}", requestOptions, cancellationToken).ConfigureAwait(false);
    }


    /// <summary>
    /// Get a Recommend task's status. Some operations, such as deleting a Recommend rule, will respond with a &#x60;taskID&#x60; value. Use this value here to check the status of that task.
    /// </summary>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="indexName">Index on which to perform the request.</param>
    /// <param name="model">[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). </param>
    /// <param name="taskID">Unique identifier of a task. Numeric value (up to 64bits).</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of GetRecommendTaskResponse</returns>
    public async Task<GetRecommendTaskResponse> GetRecommendStatusAsync(string indexName, RecommendModels model, long taskID, RequestOptions options = null, CancellationToken cancellationToken = default)
    {
      // verify the required parameter 'indexName' is set
      if (indexName == null)
        throw new ApiException(400, "Missing required parameter 'indexName' when calling RecommendClient->GetRecommendStatus");

      // verify the required parameter 'model' is set
      if (model == null)
        throw new ApiException(400, "Missing required parameter 'model' when calling RecommendClient->GetRecommendStatus");


      RequestOptions requestOptions = new RequestOptions();
      requestOptions.PathParameters.Add("indexName", ClientUtils.ParameterToString(indexName));
      requestOptions.PathParameters.Add("model", ClientUtils.ParameterToString(model));
      requestOptions.PathParameters.Add("taskID", ClientUtils.ParameterToString(taskID));


      return await _transport.ExecuteRequestAsync<GetRecommendTaskResponse>(new HttpMethod("GET"), "/1/indexes/{indexName}/{model}/task/{taskID}", requestOptions, cancellationToken).ConfigureAwait(false);
    }


    /// <summary>
    /// Get recommendations and trending items. Returns results from either recommendation or trending models:    - **Recommendations** are provided by the [Related Products](https://www.algolia.com/doc/guides/algolia-recommend/overview/#related-products-and-related-content) and [Frequently Bought Together](https://www.algolia.com/doc/guides/algolia-recommend/overview/#frequently-bought-together) models   - **Trending** models are [Trending Items and Trending Facet Values](https://www.algolia.com/doc/guides/algolia-recommend/overview/#trending-items-and-trending-facet-values). 
    /// </summary>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="getRecommendationsParams"></param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of GetRecommendationsResponse</returns>
    public async Task<GetRecommendationsResponse> GetRecommendationsAsync(GetRecommendationsParams getRecommendationsParams, RequestOptions options = null, CancellationToken cancellationToken = default)
    {
      // verify the required parameter 'getRecommendationsParams' is set
      if (getRecommendationsParams == null)
        throw new ApiException(400, "Missing required parameter 'getRecommendationsParams' when calling RecommendClient->GetRecommendations");


      RequestOptions requestOptions = new RequestOptions();
      requestOptions.Data = getRecommendationsParams;

      requestOptions.UseReadTransporter = true;

      return await _transport.ExecuteRequestAsync<GetRecommendationsResponse>(new HttpMethod("POST"), "/1/indexes/*/recommendations", requestOptions, cancellationToken).ConfigureAwait(false);
    }


    /// <summary>
    /// List Recommend rules. List [Recommend rules](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).
    /// </summary>
    /// <exception cref="Algolia.Search.Recommend.Client.ApiException">Thrown when fails to make API call</exception>
    /// <param name="indexName">Index on which to perform the request.</param>
    /// <param name="model">[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). </param>
    /// <param name="searchRecommendRulesParams"> (optional)</param>
    /// <param name="options">Add extra http header or query parameters to Algolia.</param>
    /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
    /// <returns>Task of SearchRecommendRulesResponse</returns>
    public async Task<SearchRecommendRulesResponse> SearchRecommendRulesAsync(string indexName, RecommendModels model, SearchRecommendRulesParams searchRecommendRulesParams = default(SearchRecommendRulesParams), RequestOptions options = null, CancellationToken cancellationToken = default)
    {
      // verify the required parameter 'indexName' is set
      if (indexName == null)
        throw new ApiException(400, "Missing required parameter 'indexName' when calling RecommendClient->SearchRecommendRules");

      // verify the required parameter 'model' is set
      if (model == null)
        throw new ApiException(400, "Missing required parameter 'model' when calling RecommendClient->SearchRecommendRules");


      RequestOptions requestOptions = new RequestOptions();
      requestOptions.PathParameters.Add("indexName", ClientUtils.ParameterToString(indexName));
      requestOptions.PathParameters.Add("model", ClientUtils.ParameterToString(model));
      requestOptions.Data = searchRecommendRulesParams;

      requestOptions.UseReadTransporter = true;

      return await _transport.ExecuteRequestAsync<SearchRecommendRulesResponse>(new HttpMethod("POST"), "/1/indexes/{indexName}/{model}/recommend/rules/search", requestOptions, cancellationToken).ConfigureAwait(false);
    }

  }
}
