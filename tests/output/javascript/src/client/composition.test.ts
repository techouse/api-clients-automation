// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
/* eslint-disable eslint/no-unused-vars */
import { describe, expect, test } from 'vitest';

import { compositionClient } from '@algolia/client-composition';
import type { EchoResponse } from '@algolia/requester-testing';
import { nodeEchoRequester } from '@algolia/requester-testing';

const appId = 'test-app-id';
const apiKey = 'test-api-key';

function createClient() {
  return compositionClient(appId, apiKey, { requester: nodeEchoRequester() });
}

describe('api', () => {
  test('calls api with correct read host', async () => {
    const client = compositionClient('test-app-id', 'test-api-key', {
      requester: nodeEchoRequester(),
    });

    const result = (await client.customGet({ path: 'test' })) as unknown as EchoResponse;

    expect(result.host).toEqual('test-app-id-dsn.algolia.net');
  }, 15000);

  test('calls api with correct write host', async () => {
    const client = compositionClient('test-app-id', 'test-api-key', {
      requester: nodeEchoRequester(),
    });

    const result = (await client.customPost({ path: 'test' })) as unknown as EchoResponse;

    expect(result.host).toEqual('test-app-id.algolia.net');
  }, 15000);
});

describe('commonApi', () => {
  test('calls api with correct user agent', async () => {
    const client = createClient();

    const result = (await client.customPost({ path: '1/test' })) as unknown as EchoResponse;

    expect(decodeURIComponent(result.algoliaAgent)).toMatch(
      /^Algolia for JavaScript \(\d+\.\d+\.\d+(-?.*)?\)(; [a-zA-Z. ]+ (\(\d+((\.\d+)?\.\d+)?(-?.*)?\))?)*(; Composition (\(\d+\.\d+\.\d+(-?.*)?\)))(; [a-zA-Z. ]+ (\(\d+((\.\d+)?\.\d+)?(-?.*)?\))?)*$/,
    );
  }, 15000);

  test('the user agent contains the latest version', async () => {
    const client = createClient();

    const result = (await client.customPost({ path: '1/test' })) as unknown as EchoResponse;

    expect(decodeURIComponent(result.algoliaAgent)).toMatch(/^Algolia for JavaScript \(0.0.1-alpha.0\).*/);
  }, 15000);

  test('calls api with default read timeouts', async () => {
    const client = createClient();

    const result = (await client.customGet({ path: '1/test' })) as unknown as EchoResponse;

    expect(result).toEqual(expect.objectContaining({ connectTimeout: 2000, responseTimeout: 5000 }));
  }, 15000);

  test('calls api with default write timeouts', async () => {
    const client = createClient();

    const result = (await client.customPost({ path: '1/test' })) as unknown as EchoResponse;

    expect(result).toEqual(expect.objectContaining({ connectTimeout: 2000, responseTimeout: 30000 }));
  }, 15000);
});

describe('setClientApiKey', () => {
  test('switch API key', async () => {
    const client = compositionClient('test-app-id', 'test-api-key', {
      hosts: [
        {
          url: 'localhost',
          port: 6683,
          accept: 'readWrite',
          protocol: 'http',
        },
      ],
    });

    {
      const result = await client.customGet({ path: 'check-api-key/1' });

      expect(result).toEqual({ headerAPIKeyValue: 'test-api-key' });
    }
    {
      client.setClientApiKey({ apiKey: 'updated-api-key' });
    }
    {
      const result = await client.customGet({ path: 'check-api-key/2' });

      expect(result).toEqual({ headerAPIKeyValue: 'updated-api-key' });
    }
  }, 15000);
});

describe('init', () => {
  test('sets authMode', async () => {
    const qpClient = compositionClient('foo', 'bar', {
      requester: nodeEchoRequester(),
      authMode: 'WithinQueryParameters',
    });
    const headerClient = compositionClient('foo', 'bar', { requester: nodeEchoRequester(), authMode: 'WithinHeaders' });

    const qpResult = (await qpClient.customGet({
      path: '1/foo',
    })) as unknown as EchoResponse;
    expect(qpResult.searchParams).toEqual({
      'x-algolia-api-key': 'bar',
      'x-algolia-application-id': 'foo',
    });

    const headerResult = (await headerClient.customGet({
      path: '1/bar',
    })) as unknown as EchoResponse;
    expect(headerResult.headers).toEqual({
      accept: 'application/json',
      'content-type': 'text/plain',
      'x-algolia-api-key': 'bar',
      'x-algolia-application-id': 'foo',
    });
  });
});
