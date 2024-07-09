# Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
# >IMPORT
require "algolia"

# IMPORT<

# Snippet for the customDelete method.
#
# allow del method for a custom path with minimal parameters
def snippet_for_custom_delete
  # >SEPARATOR customDelete default
  # Initialize the client
  client = Algolia::UsageClient.create("YOUR_APP_ID", "YOUR_API_KEY")

  # Call the API
  response = client.custom_delete("test/minimal")

  # use the class directly
  puts(response)

  # print the JSON response
  puts(response.to_json)
  # SEPARATOR<
end

# Snippet for the customGet method.
#
# allow get method for a custom path with minimal parameters
def snippet_for_custom_get
  # >SEPARATOR customGet default
  # Initialize the client
  client = Algolia::UsageClient.create("YOUR_APP_ID", "YOUR_API_KEY")

  # Call the API
  response = client.custom_get("test/minimal")

  # use the class directly
  puts(response)

  # print the JSON response
  puts(response.to_json)
  # SEPARATOR<
end

# Snippet for the customPost method.
#
# allow post method for a custom path with minimal parameters
def snippet_for_custom_post
  # >SEPARATOR customPost default
  # Initialize the client
  client = Algolia::UsageClient.create("YOUR_APP_ID", "YOUR_API_KEY")

  # Call the API
  response = client.custom_post("test/minimal")

  # use the class directly
  puts(response)

  # print the JSON response
  puts(response.to_json)
  # SEPARATOR<
end

# Snippet for the customPut method.
#
# allow put method for a custom path with minimal parameters
def snippet_for_custom_put
  # >SEPARATOR customPut default
  # Initialize the client
  client = Algolia::UsageClient.create("YOUR_APP_ID", "YOUR_API_KEY")

  # Call the API
  response = client.custom_put("test/minimal")

  # use the class directly
  puts(response)

  # print the JSON response
  puts(response.to_json)
  # SEPARATOR<
end

# Snippet for the getIndexUsage method.
#
# getIndexUsage with minimal parameters
def snippet_for_get_index_usage
  # >SEPARATOR getIndexUsage default
  # Initialize the client
  client = Algolia::UsageClient.create("YOUR_APP_ID", "YOUR_API_KEY")

  # Call the API
  response = client.get_index_usage("queries_operations", "myIndexName", "2024-04-03T12:46:43Z", "2024-04-05T12:46:43Z")

  # use the class directly
  puts(response)

  # print the JSON response
  puts(response.to_json)
  # SEPARATOR<
end

# Snippet for the getUsage method.
#
# getUsage with minimal parameters
def snippet_for_get_usage
  # >SEPARATOR getUsage default
  # Initialize the client
  client = Algolia::UsageClient.create("YOUR_APP_ID", "YOUR_API_KEY")

  # Call the API
  response = client.get_usage("queries_operations", "2024-04-03T12:46:43Z", "2024-04-05T12:46:43Z")

  # use the class directly
  puts(response)

  # print the JSON response
  puts(response.to_json)
  # SEPARATOR<
end
