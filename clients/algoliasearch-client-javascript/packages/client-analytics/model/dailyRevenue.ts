// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import type { CurrenciesValue } from './currenciesValue';

export type DailyRevenue = {
  /**
   * Revenue associated with this search, broken-down by currencies.
   */
  currencies: Record<string, CurrenciesValue>;

  /**
   * Date in the format YYYY-MM-DD.
   */
  date: string;
};