// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import type { DailyConversionRates } from './dailyConversionRates';

export type GetConversionRateResponse = {
  /**
   * Conversion rate, calculated as number of tracked searches with at least one conversion event divided by the number of tracked searches. If null, Algolia didn\'t receive any search requests with `clickAnalytics` set to true.
   */
  rate: number | null;

  /**
   * Number of tracked searches. Tracked searches are search requests where the `clickAnalytics` parameter is true.
   */
  trackedSearchCount: number;

  /**
   * Number of conversions from this search.
   */
  conversionCount: number;

  /**
   * Daily conversion rates.
   */
  dates: DailyConversionRates[];
};