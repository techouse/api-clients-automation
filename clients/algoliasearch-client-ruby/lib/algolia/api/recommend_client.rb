# Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

module Algolia
  class RecommendClient
    attr_accessor :api_client

    def initialize(config = nil)
      raise "`config` is missing." if config.nil?
      raise "`app_id` is missing." if config.app_id.nil? || config.app_id == ""
      raise "`api_key` is missing." if config.api_key.nil? || config.api_key == ""

      @api_client = Algolia::ApiClient.new(config)
    end

    def self.create(app_id, api_key, opts = {})
      hosts = []
      hosts << Transport::StatefulHost.new("#{app_id}-dsn.algolia.net", accept: CallType::READ)
      hosts << Transport::StatefulHost.new("#{app_id}.algolia.net", accept: CallType::WRITE)

      hosts += 1
        .upto(3)
        .map do |i|
          Transport::StatefulHost.new("#{app_id}-#{i}.algolianet.com", accept: CallType::READ | CallType::WRITE)
        end
        .shuffle

      config = Algolia::Configuration.new(app_id, api_key, hosts, "Recommend", opts)
      create_with_config(config)
    end

    def self.create_with_config(config)
      new(config)
    end

    # This method allow you to send requests to the Algolia REST API.

    # @param path [String] Path of the endpoint, anything after \&quot;/1\&quot; must be specified. (required)
    # @param parameters [Hash<String, Object>] Query parameters to apply to the current query.
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Http::Response] the response
    def custom_delete_with_http_info(path, parameters = nil, request_options = {})
      # verify the required parameter 'path' is set
      if @api_client.config.client_side_validation && path.nil?
        raise ArgumentError, "Parameter `path` is required when calling `custom_delete`."
      end

      path = "/{path}".sub("{" + "path" + "}", path.to_s)
      query_params = {}
      query_params = query_params.merge(parameters) unless parameters.nil?
      query_params = query_params.merge(request_options[:query_params]) unless request_options[:query_params].nil?
      header_params = {}
      header_params = header_params.merge(request_options[:header_params]) unless request_options[:header_params].nil?

      post_body = request_options[:debug_body]

      new_options = request_options.merge(
        :operation => :"RecommendClient.custom_delete",
        :header_params => header_params,
        :query_params => query_params,
        :body => post_body,
        :use_read_transporter => false
      )

      @api_client.call_api(:DELETE, path, new_options)
    end

    # This method allow you to send requests to the Algolia REST API.

    # @param path [String] Path of the endpoint, anything after \&quot;/1\&quot; must be specified. (required)
    # @param parameters [Hash<String, Object>] Query parameters to apply to the current query.
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Object]
    def custom_delete(path, parameters = nil, request_options = {})
      response = custom_delete_with_http_info(path, parameters, request_options)
      @api_client.deserialize(response.body, request_options[:debug_return_type] || "Object")
    end

    # This method allow you to send requests to the Algolia REST API.

    # @param path [String] Path of the endpoint, anything after \&quot;/1\&quot; must be specified. (required)
    # @param parameters [Hash<String, Object>] Query parameters to apply to the current query.
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Http::Response] the response
    def custom_get_with_http_info(path, parameters = nil, request_options = {})
      # verify the required parameter 'path' is set
      if @api_client.config.client_side_validation && path.nil?
        raise ArgumentError, "Parameter `path` is required when calling `custom_get`."
      end

      path = "/{path}".sub("{" + "path" + "}", path.to_s)
      query_params = {}
      query_params = query_params.merge(parameters) unless parameters.nil?
      query_params = query_params.merge(request_options[:query_params]) unless request_options[:query_params].nil?
      header_params = {}
      header_params = header_params.merge(request_options[:header_params]) unless request_options[:header_params].nil?

      post_body = request_options[:debug_body]

      new_options = request_options.merge(
        :operation => :"RecommendClient.custom_get",
        :header_params => header_params,
        :query_params => query_params,
        :body => post_body,
        :use_read_transporter => false
      )

      @api_client.call_api(:GET, path, new_options)
    end

    # This method allow you to send requests to the Algolia REST API.

    # @param path [String] Path of the endpoint, anything after \&quot;/1\&quot; must be specified. (required)
    # @param parameters [Hash<String, Object>] Query parameters to apply to the current query.
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Object]
    def custom_get(path, parameters = nil, request_options = {})
      response = custom_get_with_http_info(path, parameters, request_options)
      @api_client.deserialize(response.body, request_options[:debug_return_type] || "Object")
    end

    # This method allow you to send requests to the Algolia REST API.

    # @param path [String] Path of the endpoint, anything after \&quot;/1\&quot; must be specified. (required)
    # @param parameters [Hash<String, Object>] Query parameters to apply to the current query.
    # @param body [Object] Parameters to send with the custom request.
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Http::Response] the response
    def custom_post_with_http_info(path, parameters = nil, body = nil, request_options = {})
      # verify the required parameter 'path' is set
      if @api_client.config.client_side_validation && path.nil?
        raise ArgumentError, "Parameter `path` is required when calling `custom_post`."
      end

      path = "/{path}".sub("{" + "path" + "}", path.to_s)
      query_params = {}
      query_params = query_params.merge(parameters) unless parameters.nil?
      query_params = query_params.merge(request_options[:query_params]) unless request_options[:query_params].nil?
      header_params = {}
      header_params = header_params.merge(request_options[:header_params]) unless request_options[:header_params].nil?

      post_body = request_options[:debug_body] || @api_client.object_to_http_body(body)

      new_options = request_options.merge(
        :operation => :"RecommendClient.custom_post",
        :header_params => header_params,
        :query_params => query_params,
        :body => post_body,
        :use_read_transporter => false
      )

      @api_client.call_api(:POST, path, new_options)
    end

    # This method allow you to send requests to the Algolia REST API.

    # @param path [String] Path of the endpoint, anything after \&quot;/1\&quot; must be specified. (required)
    # @param parameters [Hash<String, Object>] Query parameters to apply to the current query.
    # @param body [Object] Parameters to send with the custom request.
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Object]
    def custom_post(path, parameters = nil, body = nil, request_options = {})
      response = custom_post_with_http_info(path, parameters, body, request_options)
      @api_client.deserialize(response.body, request_options[:debug_return_type] || "Object")
    end

    # This method allow you to send requests to the Algolia REST API.

    # @param path [String] Path of the endpoint, anything after \&quot;/1\&quot; must be specified. (required)
    # @param parameters [Hash<String, Object>] Query parameters to apply to the current query.
    # @param body [Object] Parameters to send with the custom request.
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Http::Response] the response
    def custom_put_with_http_info(path, parameters = nil, body = nil, request_options = {})
      # verify the required parameter 'path' is set
      if @api_client.config.client_side_validation && path.nil?
        raise ArgumentError, "Parameter `path` is required when calling `custom_put`."
      end

      path = "/{path}".sub("{" + "path" + "}", path.to_s)
      query_params = {}
      query_params = query_params.merge(parameters) unless parameters.nil?
      query_params = query_params.merge(request_options[:query_params]) unless request_options[:query_params].nil?
      header_params = {}
      header_params = header_params.merge(request_options[:header_params]) unless request_options[:header_params].nil?

      post_body = request_options[:debug_body] || @api_client.object_to_http_body(body)

      new_options = request_options.merge(
        :operation => :"RecommendClient.custom_put",
        :header_params => header_params,
        :query_params => query_params,
        :body => post_body,
        :use_read_transporter => false
      )

      @api_client.call_api(:PUT, path, new_options)
    end

    # This method allow you to send requests to the Algolia REST API.

    # @param path [String] Path of the endpoint, anything after \&quot;/1\&quot; must be specified. (required)
    # @param parameters [Hash<String, Object>] Query parameters to apply to the current query.
    # @param body [Object] Parameters to send with the custom request.
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Object]
    def custom_put(path, parameters = nil, body = nil, request_options = {})
      response = custom_put_with_http_info(path, parameters, body, request_options)
      @api_client.deserialize(response.body, request_options[:debug_return_type] || "Object")
    end

    # Deletes a Recommend rule from a recommendation scenario.
    #
    # Required API Key ACLs:
    #   - editSettings
    # @param index_name [String] Name of the index on which to perform the operation. (required)
    # @param model [RecommendModels] [Recommend model](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
    # @param object_id [String] Unique record identifier. (required)
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Http::Response] the response
    def delete_recommend_rule_with_http_info(index_name, model, object_id, request_options = {})
      # verify the required parameter 'index_name' is set
      if @api_client.config.client_side_validation && index_name.nil?
        raise ArgumentError, "Parameter `index_name` is required when calling `delete_recommend_rule`."
      end
      # verify the required parameter 'model' is set
      if @api_client.config.client_side_validation && model.nil?
        raise ArgumentError, "Parameter `model` is required when calling `delete_recommend_rule`."
      end
      # verify the required parameter 'object_id' is set
      if @api_client.config.client_side_validation && object_id.nil?
        raise ArgumentError, "Parameter `object_id` is required when calling `delete_recommend_rule`."
      end

      path = "/1/indexes/{indexName}/{model}/recommend/rules/{objectID}"
        .sub("{" + "indexName" + "}", Transport.encode_uri(index_name.to_s))
        .sub("{" + "model" + "}", Transport.encode_uri(model.to_s))
        .sub("{" + "objectID" + "}", Transport.encode_uri(object_id.to_s))
      query_params = {}
      query_params = query_params.merge(request_options[:query_params]) unless request_options[:query_params].nil?
      header_params = {}
      header_params = header_params.merge(request_options[:header_params]) unless request_options[:header_params].nil?

      post_body = request_options[:debug_body]

      new_options = request_options.merge(
        :operation => :"RecommendClient.delete_recommend_rule",
        :header_params => header_params,
        :query_params => query_params,
        :body => post_body,
        :use_read_transporter => false
      )

      @api_client.call_api(:DELETE, path, new_options)
    end

    # Deletes a Recommend rule from a recommendation scenario.
    #
    # Required API Key ACLs:
    #   - editSettings
    # @param index_name [String] Name of the index on which to perform the operation. (required)
    # @param model [RecommendModels] [Recommend model](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
    # @param object_id [String] Unique record identifier. (required)
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [DeletedAtResponse]
    def delete_recommend_rule(index_name, model, object_id, request_options = {})
      response = delete_recommend_rule_with_http_info(index_name, model, object_id, request_options)
      @api_client.deserialize(response.body, request_options[:debug_return_type] || "Recommend::DeletedAtResponse")
    end

    # Retrieves a Recommend rule that you previously created in the Algolia dashboard.
    #
    # Required API Key ACLs:
    #   - settings
    # @param index_name [String] Name of the index on which to perform the operation. (required)
    # @param model [RecommendModels] [Recommend model](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
    # @param object_id [String] Unique record identifier. (required)
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Http::Response] the response
    def get_recommend_rule_with_http_info(index_name, model, object_id, request_options = {})
      # verify the required parameter 'index_name' is set
      if @api_client.config.client_side_validation && index_name.nil?
        raise ArgumentError, "Parameter `index_name` is required when calling `get_recommend_rule`."
      end
      # verify the required parameter 'model' is set
      if @api_client.config.client_side_validation && model.nil?
        raise ArgumentError, "Parameter `model` is required when calling `get_recommend_rule`."
      end
      # verify the required parameter 'object_id' is set
      if @api_client.config.client_side_validation && object_id.nil?
        raise ArgumentError, "Parameter `object_id` is required when calling `get_recommend_rule`."
      end

      path = "/1/indexes/{indexName}/{model}/recommend/rules/{objectID}"
        .sub("{" + "indexName" + "}", Transport.encode_uri(index_name.to_s))
        .sub("{" + "model" + "}", Transport.encode_uri(model.to_s))
        .sub("{" + "objectID" + "}", Transport.encode_uri(object_id.to_s))
      query_params = {}
      query_params = query_params.merge(request_options[:query_params]) unless request_options[:query_params].nil?
      header_params = {}
      header_params = header_params.merge(request_options[:header_params]) unless request_options[:header_params].nil?

      post_body = request_options[:debug_body]

      new_options = request_options.merge(
        :operation => :"RecommendClient.get_recommend_rule",
        :header_params => header_params,
        :query_params => query_params,
        :body => post_body,
        :use_read_transporter => false
      )

      @api_client.call_api(:GET, path, new_options)
    end

    # Retrieves a Recommend rule that you previously created in the Algolia dashboard.
    #
    # Required API Key ACLs:
    #   - settings
    # @param index_name [String] Name of the index on which to perform the operation. (required)
    # @param model [RecommendModels] [Recommend model](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
    # @param object_id [String] Unique record identifier. (required)
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [RecommendRule]
    def get_recommend_rule(index_name, model, object_id, request_options = {})
      response = get_recommend_rule_with_http_info(index_name, model, object_id, request_options)
      @api_client.deserialize(response.body, request_options[:debug_return_type] || "Recommend::RecommendRule")
    end

    # Checks the status of a given task.  Deleting a Recommend rule is asynchronous. When you delete a rule, a task is created on a queue and completed depending on the load on the server. The API response includes a task ID that you can use to check the status.
    #
    # Required API Key ACLs:
    #   - editSettings
    # @param index_name [String] Name of the index on which to perform the operation. (required)
    # @param model [RecommendModels] [Recommend model](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
    # @param task_id [Integer] Unique task identifier. (required)
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Http::Response] the response
    def get_recommend_status_with_http_info(index_name, model, task_id, request_options = {})
      # verify the required parameter 'index_name' is set
      if @api_client.config.client_side_validation && index_name.nil?
        raise ArgumentError, "Parameter `index_name` is required when calling `get_recommend_status`."
      end
      # verify the required parameter 'model' is set
      if @api_client.config.client_side_validation && model.nil?
        raise ArgumentError, "Parameter `model` is required when calling `get_recommend_status`."
      end
      # verify the required parameter 'task_id' is set
      if @api_client.config.client_side_validation && task_id.nil?
        raise ArgumentError, "Parameter `task_id` is required when calling `get_recommend_status`."
      end

      path = "/1/indexes/{indexName}/{model}/task/{taskID}"
        .sub("{" + "indexName" + "}", Transport.encode_uri(index_name.to_s))
        .sub("{" + "model" + "}", Transport.encode_uri(model.to_s))
        .sub("{" + "taskID" + "}", Transport.encode_uri(task_id.to_s))
      query_params = {}
      query_params = query_params.merge(request_options[:query_params]) unless request_options[:query_params].nil?
      header_params = {}
      header_params = header_params.merge(request_options[:header_params]) unless request_options[:header_params].nil?

      post_body = request_options[:debug_body]

      new_options = request_options.merge(
        :operation => :"RecommendClient.get_recommend_status",
        :header_params => header_params,
        :query_params => query_params,
        :body => post_body,
        :use_read_transporter => false
      )

      @api_client.call_api(:GET, path, new_options)
    end

    # Checks the status of a given task.  Deleting a Recommend rule is asynchronous. When you delete a rule, a task is created on a queue and completed depending on the load on the server. The API response includes a task ID that you can use to check the status.
    #
    # Required API Key ACLs:
    #   - editSettings
    # @param index_name [String] Name of the index on which to perform the operation. (required)
    # @param model [RecommendModels] [Recommend model](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
    # @param task_id [Integer] Unique task identifier. (required)
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [GetRecommendTaskResponse]
    def get_recommend_status(index_name, model, task_id, request_options = {})
      response = get_recommend_status_with_http_info(index_name, model, task_id, request_options)
      @api_client.deserialize(
        response.body,
        request_options[:debug_return_type] || "Recommend::GetRecommendTaskResponse"
      )
    end

    # Retrieves recommendations from selected AI models.
    #
    # Required API Key ACLs:
    #   - search
    # @param get_recommendations_params [GetRecommendationsParams]  (required)
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Http::Response] the response
    def get_recommendations_with_http_info(get_recommendations_params, request_options = {})
      # verify the required parameter 'get_recommendations_params' is set
      if @api_client.config.client_side_validation && get_recommendations_params.nil?
        raise ArgumentError, "Parameter `get_recommendations_params` is required when calling `get_recommendations`."
      end

      path = "/1/indexes/*/recommendations"
      query_params = {}
      query_params = query_params.merge(request_options[:query_params]) unless request_options[:query_params].nil?
      header_params = {}
      header_params = header_params.merge(request_options[:header_params]) unless request_options[:header_params].nil?

      post_body = request_options[:debug_body] || @api_client.object_to_http_body(get_recommendations_params)

      new_options = request_options.merge(
        :operation => :"RecommendClient.get_recommendations",
        :header_params => header_params,
        :query_params => query_params,
        :body => post_body,
        :use_read_transporter => true
      )

      @api_client.call_api(:POST, path, new_options)
    end

    # Retrieves recommendations from selected AI models.
    #
    # Required API Key ACLs:
    #   - search
    # @param get_recommendations_params [GetRecommendationsParams]  (required)
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [GetRecommendationsResponse]
    def get_recommendations(get_recommendations_params, request_options = {})
      response = get_recommendations_with_http_info(get_recommendations_params, request_options)
      @api_client.deserialize(
        response.body,
        request_options[:debug_return_type] || "Recommend::GetRecommendationsResponse"
      )
    end

    # Searches for Recommend rules.  Use an empty query to list all rules for this recommendation scenario.
    #
    # Required API Key ACLs:
    #   - settings
    # @param index_name [String] Name of the index on which to perform the operation. (required)
    # @param model [RecommendModels] [Recommend model](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
    # @param search_recommend_rules_params [SearchRecommendRulesParams]
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [Http::Response] the response
    def search_recommend_rules_with_http_info(
      index_name,
      model,
      search_recommend_rules_params = nil,
      request_options = {}
    )
      # verify the required parameter 'index_name' is set
      if @api_client.config.client_side_validation && index_name.nil?
        raise ArgumentError, "Parameter `index_name` is required when calling `search_recommend_rules`."
      end
      # verify the required parameter 'model' is set
      if @api_client.config.client_side_validation && model.nil?
        raise ArgumentError, "Parameter `model` is required when calling `search_recommend_rules`."
      end

      path = "/1/indexes/{indexName}/{model}/recommend/rules/search"
        .sub("{" + "indexName" + "}", Transport.encode_uri(index_name.to_s))
        .sub("{" + "model" + "}", Transport.encode_uri(model.to_s))
      query_params = {}
      query_params = query_params.merge(request_options[:query_params]) unless request_options[:query_params].nil?
      header_params = {}
      header_params = header_params.merge(request_options[:header_params]) unless request_options[:header_params].nil?

      post_body = request_options[:debug_body] || @api_client.object_to_http_body(search_recommend_rules_params)

      new_options = request_options.merge(
        :operation => :"RecommendClient.search_recommend_rules",
        :header_params => header_params,
        :query_params => query_params,
        :body => post_body,
        :use_read_transporter => true
      )

      @api_client.call_api(:POST, path, new_options)
    end

    # Searches for Recommend rules.  Use an empty query to list all rules for this recommendation scenario.
    #
    # Required API Key ACLs:
    #   - settings
    # @param index_name [String] Name of the index on which to perform the operation. (required)
    # @param model [RecommendModels] [Recommend model](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
    # @param search_recommend_rules_params [SearchRecommendRulesParams]
    # @param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
    # @return [SearchRecommendRulesResponse]
    def search_recommend_rules(index_name, model, search_recommend_rules_params = nil, request_options = {})
      response = search_recommend_rules_with_http_info(
        index_name,
        model,
        search_recommend_rules_params,
        request_options
      )
      @api_client.deserialize(
        response.body,
        request_options[:debug_return_type] || "Recommend::SearchRecommendRulesResponse"
      )
    end

  end
end
