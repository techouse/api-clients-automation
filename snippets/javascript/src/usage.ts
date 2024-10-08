// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
/* eslint no-console: ["error", { allow: ["log"] }] */

// >IMPORT
import { usageClient } from '@algolia/client-usage';
// IMPORT<

// Snippet for the customDelete method.
//
// allow del method for a custom path with minimal parameters
export async function snippetForCustomDelete(): Promise<void> {
  // >SEPARATOR customDelete default
  // Initialize the client
  const client = usageClient('YOUR_APP_ID', 'YOUR_API_KEY');

  // Call the API
  const response = await client.customDelete({ path: 'test/minimal' });

  // >LOG
  // use typed response
  console.log(response);
  // SEPARATOR<
}

// Snippet for the customGet method.
//
// allow get method for a custom path with minimal parameters
export async function snippetForCustomGet(): Promise<void> {
  // >SEPARATOR customGet default
  // Initialize the client
  const client = usageClient('YOUR_APP_ID', 'YOUR_API_KEY');

  // Call the API
  const response = await client.customGet({ path: 'test/minimal' });

  // >LOG
  // use typed response
  console.log(response);
  // SEPARATOR<
}

// Snippet for the customPost method.
//
// allow post method for a custom path with minimal parameters
export async function snippetForCustomPost(): Promise<void> {
  // >SEPARATOR customPost default
  // Initialize the client
  const client = usageClient('YOUR_APP_ID', 'YOUR_API_KEY');

  // Call the API
  const response = await client.customPost({ path: 'test/minimal' });

  // >LOG
  // use typed response
  console.log(response);
  // SEPARATOR<
}

// Snippet for the customPut method.
//
// allow put method for a custom path with minimal parameters
export async function snippetForCustomPut(): Promise<void> {
  // >SEPARATOR customPut default
  // Initialize the client
  const client = usageClient('YOUR_APP_ID', 'YOUR_API_KEY');

  // Call the API
  const response = await client.customPut({ path: 'test/minimal' });

  // >LOG
  // use typed response
  console.log(response);
  // SEPARATOR<
}

// Snippet for the getIndexUsage method.
//
// getIndexUsage with minimal parameters
export async function snippetForGetIndexUsage(): Promise<void> {
  // >SEPARATOR getIndexUsage default
  // Initialize the client
  const client = usageClient('YOUR_APP_ID', 'YOUR_API_KEY');

  // Call the API
  const response = await client.getIndexUsage({
    statistic: 'queries_operations',
    indexName: 'myIndexName',
    startDate: '2024-04-03T12:46:43Z',
    endDate: '2024-04-05T12:46:43Z',
  });

  // >LOG
  // use typed response
  console.log(response);
  // SEPARATOR<
}

// Snippet for the getUsage method.
//
// getUsage with minimal parameters
export async function snippetForGetUsage(): Promise<void> {
  // >SEPARATOR getUsage default
  // Initialize the client
  const client = usageClient('YOUR_APP_ID', 'YOUR_API_KEY');

  // Call the API
  const response = await client.getUsage({
    statistic: 'queries_operations',
    startDate: '2024-04-03T12:46:43Z',
    endDate: '2024-04-05T12:46:43Z',
  });

  // >LOG
  // use typed response
  console.log(response);
  // SEPARATOR<
}

// Snippet for the setClientApiKey method.
//
// switch API key
export function snippetForSetClientApiKey(): void {
  // >SEPARATOR setClientApiKey default
  // Initialize the client
  const client = usageClient('YOUR_APP_ID', 'YOUR_API_KEY');

  // Call the API
  client.setClientApiKey({ apiKey: 'updated-api-key' });

  // >LOG
  // SEPARATOR<
}
