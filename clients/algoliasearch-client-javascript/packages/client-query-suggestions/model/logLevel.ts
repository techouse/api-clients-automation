// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

/**
 * Type of log entry.  - `SKIP`. A query is skipped because it doesn\'t match the conditions for successful inclusion. For example, when a query doesn\'t generate enough search results. - `INFO`. An informative log entry. - `ERROR`. The Query Suggestions process encountered an error.
 */
export type LogLevel = 'ERROR' | 'INFO' | 'SKIP';
