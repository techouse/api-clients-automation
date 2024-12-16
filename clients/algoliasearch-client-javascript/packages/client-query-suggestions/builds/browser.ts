// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import { createXhrRequester } from '@algolia/requester-browser-xhr';

import {
  createBrowserLocalStorageCache,
  createFallbackableCache,
  createMemoryCache,
  createNullLogger,
} from '@algolia/client-common';

import type { ClientOptions } from '@algolia/client-common';

import { apiClientVersion, createQuerySuggestionsClient } from '../src/querySuggestionsClient';

import type { Region } from '../src/querySuggestionsClient';
import { REGIONS } from '../src/querySuggestionsClient';

export type { Region, RegionOptions } from '../src/querySuggestionsClient';

export { apiClientVersion } from '../src/querySuggestionsClient';

export * from '../model';

export function querySuggestionsClient(
  appId: string,
  apiKey: string,
  region: Region,
  options?: ClientOptions,
): QuerySuggestionsClient {
  if (!appId || typeof appId !== 'string') {
    throw new Error('`appId` is missing.');
  }

  if (!apiKey || typeof apiKey !== 'string') {
    throw new Error('`apiKey` is missing.');
  }

  if (!region || (region && (typeof region !== 'string' || !REGIONS.includes(region)))) {
    throw new Error(`\`region\` is required and must be one of the following: ${REGIONS.join(', ')}`);
  }

  return createQuerySuggestionsClient({
    appId,
    apiKey,
    region,
    timeouts: {
      connect: 1000,
      read: 2000,
      write: 30000,
    },
    logger: createNullLogger(),
    requester: createXhrRequester(),
    algoliaAgents: [{ segment: 'Browser' }],
    authMode: 'WithinQueryParameters',
    responsesCache: createMemoryCache(),
    requestsCache: createMemoryCache({ serializable: false }),
    hostsCache: createFallbackableCache({
      caches: [createBrowserLocalStorageCache({ key: `${apiClientVersion}-${appId}` }), createMemoryCache()],
    }),
    ...options,
  });
}

export type QuerySuggestionsClient = ReturnType<typeof createQuerySuggestionsClient>;
