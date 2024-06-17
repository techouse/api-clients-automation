/** Search API The Algolia Search API lets you search, configure, and mange your indices and records. ## Client
  * libraries Use Algolia's API clients and libraries to reliably integrate Algolia's APIs with your apps. The official
  * API clients are covered by Algolia's [Service Level Agreement](https://www.algolia.com/policies/sla/). See:
  * [Algolia's ecosystem](https://www.algolia.com/doc/guides/getting-started/how-algolia-works/in-depth/ecosystem/) ##
  * Base URLs The base URLs for requests to the Search API are: - `https://{APPLICATION_ID}.algolia.net` -
  * `https://{APPLICATION_ID}-dsn.algolia.net`. If your subscription includes a [Distributed Search
  * Network](https://dashboard.algolia.com/infra), this ensures that requests are sent to servers closest to users. Both
  * URLs provide high availability by distributing requests with load balancing. **All requests must use HTTPS.** ##
  * Retry strategy To guarantee a high availability, implement a retry strategy for all API requests using the URLs of
  * your servers as fallbacks: - `https://{APPLICATION_ID}-1.algolianet.com` -
  * `https://{APPLICATION_ID}-2.algolianet.com` - `https://{APPLICATION_ID}-3.algolianet.com` These URLs use a different
  * DNS provider than the primary URLs. You should randomize this list to ensure an even load across the three servers.
  * All Algolia API clients implement this retry strategy. ## Authentication To authenticate your API requests, add
  * these headers: - `x-algolia-application-id`. Your Algolia application ID. - `x-algolia-api-key`. An API key with the
  * necessary permissions to make the request. The required access control list (ACL) to make a request is listed in
  * each endpoint's reference. You can find your application ID and API key in the [Algolia
  * dashboard](https://dashboard.algolia.com/account). ## Request format Depending on the endpoint, request bodies are
  * either JSON objects or arrays of JSON objects, ## Parameters Parameters are passed as query parameters for GET and
  * DELETE requests, and in the request body for POST and PUT requests. Query parameters must be
  * [URL-encoded](https://developer.mozilla.org/en-US/docs/Glossary/Percent-encoding). Non-ASCII characters must be
  * UTF-8 encoded. Plus characters (`+`) are interpreted as spaces. Arrays as query parameters must be one of: - A
  * comma-separated string: `attributesToRetrieve=title,description` - A URL-encoded JSON array:
  * `attributesToRetrieve=%5B%22title%22,%22description%22%D` ## Response status and errors The Search API returns JSON
  * responses. Since JSON doesn't guarantee any specific ordering, don't rely on the order of attributes in the API
  * response. Successful responses return a `2xx` status. Client errors return a `4xx` status. Server errors are
  * indicated by a `5xx` status. Error responses have a `message` property with more information. ## Version The current
  * version of the Search API is version 1, as indicated by the `/1/` in each endpoint's URL.
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.search

/** SecuredApiKeyRestrictions
  *
  * @param filters
  *   Filters that apply to every search made with the secured API key. Extra filters added at search time will be
  *   combined with `AND`. For example, if you set `group:admin` as fixed filter on your generated API key, and add
  *   `groups:visitors` to the search query, the complete set of filters will be `group:admin AND groups:visitors`.
  * @param validUntil
  *   Timestamp when the secured API key expires, measured in seconds since the Unix epoch.
  * @param restrictIndices
  *   Index names or patterns that this API key can access. By default, an API key can access all indices in the same
  *   application. You can use leading and trailing wildcard characters (`*`): - `dev_*` matches all indices starting
  *   with \"dev_\". - `*_dev` matches all indices ending with \"_dev\". - `*_products_*` matches all indices containing
  *   \"_products_\".
  * @param restrictSources
  *   IP network that are allowed to use this key. You can only add a single source, but you can provide a range of IP
  *   addresses. Use this to protect against API key leaking and reuse.
  * @param userToken
  *   Pseudonymous user identifier to restrict usage of this API key to specific users. By default, rate limits are set
  *   based on IP addresses. This can be an issue if many users search from the same IP address. To avoid this, add a
  *   user token to each generated API key.
  */
case class SecuredApiKeyRestrictions(
    searchParams: Option[SearchParamsObject] = scala.None,
    filters: Option[String] = scala.None,
    validUntil: Option[Long] = scala.None,
    restrictIndices: Option[Seq[String]] = scala.None,
    restrictSources: Option[String] = scala.None,
    userToken: Option[String] = scala.None
)