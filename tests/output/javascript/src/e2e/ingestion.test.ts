// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
import { describe, expect, test } from 'vitest';

import { union } from '../helpers.js';

import { algoliasearch } from 'algoliasearch';
import * as dotenv from 'dotenv';

dotenv.config({ path: '../../.env' });

if (!process.env.ALGOLIA_APPLICATION_ID) {
  throw new Error('please provide an `ALGOLIA_APPLICATION_ID` env var for e2e tests');
}

if (!process.env.ALGOLIA_ADMIN_KEY) {
  throw new Error('please provide an `ALGOLIA_ADMIN_KEY` env var for e2e tests');
}

const client = algoliasearch(process.env.ALGOLIA_APPLICATION_ID, process.env.ALGOLIA_ADMIN_KEY).initIngestion({
  region: 'us',
});

describe('enableTask', () => {
  test('enableTask', async () => {
    const resp = await client.enableTask({ taskID: '76ab4c2a-ce17-496f-b7a6-506dc59ee498' });

    const expectedBody = { taskID: '76ab4c2a-ce17-496f-b7a6-506dc59ee498' };

    expect(expectedBody).toEqual(union(expectedBody, resp));
  });
});

describe('enableTaskV1', () => {
  test('enableTaskV1', async () => {
    const resp = await client.enableTaskV1({ taskID: '76ab4c2a-ce17-496f-b7a6-506dc59ee498' });

    const expectedBody = { taskID: '76ab4c2a-ce17-496f-b7a6-506dc59ee498' };

    expect(expectedBody).toEqual(union(expectedBody, resp));
  });
});

describe('getSource', () => {
  test('getSource', async () => {
    const resp = await client.getSource({ sourceID: '75eeb306-51d3-4e5e-a279-3c92bd8893ac' });

    const expectedBody = {
      sourceID: '75eeb306-51d3-4e5e-a279-3c92bd8893ac',
      name: 'cts_e2e_browse',
      type: 'json',
      input: { url: 'https://raw.githubusercontent.com/prust/wikipedia-movie-data/master/movies.json' },
    };

    expect(expectedBody).toEqual(union(expectedBody, resp));
  });
});

describe('listAuthentications', () => {
  test('getAuthentications with query params', async () => {
    const resp = await client.listAuthentications({
      itemsPerPage: 2,
      page: 1,
      type: ['basic', 'algolia'],
      platform: ['none'],
      sort: 'createdAt',
      order: 'asc',
    });

    const expectedBody = {
      pagination: { page: 1, itemsPerPage: 2 },
      authentications: [
        {
          authenticationID: '474f050f-a771-464c-a016-323538029f5f',
          type: 'algolia',
          name: 'algolia-auth-1677060483885',
          input: {},
          createdAt: '2023-02-22T10:08:04Z',
          updatedAt: '2023-10-25T08:41:56Z',
        },
        {},
      ],
    };

    expect(expectedBody).toEqual(union(expectedBody, resp));
  });
});

describe('searchTasks', () => {
  test('searchTasks', async () => {
    const resp = await client.searchTasks({
      taskIDs: [
        '6c02aeb1-775e-418e-870b-1faccd4b2c0f',
        '947ac9c4-7e58-4c87-b1e7-14a68e99699a',
        '76ab4c2a-ce17-496f-b7a6-506dc59ee498',
      ],
    });

    const expectedBody = [
      {
        taskID: '76ab4c2a-ce17-496f-b7a6-506dc59ee498',
        sourceID: '75eeb306-51d3-4e5e-a279-3c92bd8893ac',
        destinationID: '506d79fa-e29d-4bcf-907c-6b6a41172153',
        enabled: true,
        failureThreshold: 0,
        action: 'replace',
        createdAt: '2024-01-08T16:47:41Z',
      },
    ];

    expect(expectedBody).toEqual(union(expectedBody, resp));
  });
});

describe('searchTasksV1', () => {
  test('searchTasksV1', async () => {
    const resp = await client.searchTasksV1({
      taskIDs: [
        '6c02aeb1-775e-418e-870b-1faccd4b2c0f',
        '947ac9c4-7e58-4c87-b1e7-14a68e99699a',
        '76ab4c2a-ce17-496f-b7a6-506dc59ee498',
      ],
    });

    const expectedBody = [
      {
        taskID: '76ab4c2a-ce17-496f-b7a6-506dc59ee498',
        sourceID: '75eeb306-51d3-4e5e-a279-3c92bd8893ac',
        destinationID: '506d79fa-e29d-4bcf-907c-6b6a41172153',
        trigger: { type: 'onDemand' },
        enabled: true,
        failureThreshold: 0,
        action: 'replace',
        createdAt: '2024-01-08T16:47:41Z',
      },
    ];

    expect(expectedBody).toEqual(union(expectedBody, resp));
  });
});
