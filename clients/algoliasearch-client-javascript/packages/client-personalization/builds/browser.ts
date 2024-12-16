// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import { createXhrRequester } from '@algolia/requester-browser-xhr';

import {
  createBrowserLocalStorageCache,
  createFallbackableCache,
  createMemoryCache,
  createNullLogger,
} from '@algolia/client-common';

import type { ClientOptions } from '@algolia/client-common';

import { apiClientVersion, createPersonalizationClient } from '../src/personalizationClient';

import type { Region } from '../src/personalizationClient';
import { REGIONS } from '../src/personalizationClient';

export type { Region, RegionOptions } from '../src/personalizationClient';

export { apiClientVersion } from '../src/personalizationClient';

export * from '../model';

export function personalizationClient(
  appId: string,
  apiKey: string,
  region: Region,
  options?: ClientOptions,
): PersonalizationClient {
  if (!appId || typeof appId !== 'string') {
    throw new Error('`appId` is missing.');
  }

  if (!apiKey || typeof apiKey !== 'string') {
    throw new Error('`apiKey` is missing.');
  }

  if (!region || (region && (typeof region !== 'string' || !REGIONS.includes(region)))) {
    throw new Error(`\`region\` is required and must be one of the following: ${REGIONS.join(', ')}`);
  }

  return createPersonalizationClient({
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

export type PersonalizationClient = ReturnType<typeof createPersonalizationClient>;
