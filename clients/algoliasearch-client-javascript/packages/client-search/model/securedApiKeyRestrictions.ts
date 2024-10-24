// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import type { SearchParamsObject } from './searchParamsObject';

export type SecuredApiKeyRestrictions = {
  searchParams?: SearchParamsObject;

  /**
   * Filters that apply to every search made with the secured API key. Extra filters added at search time will be combined with `AND`. For example, if you set `group:admin` as fixed filter on your generated API key, and add `groups:visitors` to the search query, the complete set of filters will be `group:admin AND groups:visitors`.
   */
  filters?: string;

  /**
   * Timestamp when the secured API key expires, measured in seconds since the Unix epoch.
   */
  validUntil?: number;

  /**
   * Index names or patterns that this API key can access. By default, an API key can access all indices in the same application.  You can use leading and trailing wildcard characters (`*`):  - `dev_*` matches all indices starting with \"dev_\". - `*_dev` matches all indices ending with \"_dev\". - `*_products_*` matches all indices containing \"_products_\".
   */
  restrictIndices?: Array<string>;

  /**
   * IP network that are allowed to use this key.  You can only add a single source, but you can provide a range of IP addresses. Use this to protect against API key leaking and reuse.
   */
  restrictSources?: string;

  /**
   * Pseudonymous user identifier to restrict usage of this API key to specific users.  By default, rate limits are set based on IP addresses. This can be an issue if many users search from the same IP address. To avoid this, add a user token to each generated API key.
   */
  userToken?: string;
};
