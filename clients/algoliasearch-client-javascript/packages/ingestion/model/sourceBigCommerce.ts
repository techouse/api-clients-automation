// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import type { BigCommerceChannel } from './bigCommerceChannel';
import type { BigCommerceMetafield } from './bigCommerceMetafield';

export type SourceBigCommerce = {
  /**
   * Store hash identifying your BigCommerce store.
   */
  storeHash: string;

  channel?: BigCommerceChannel;

  customFields?: Array<string>;

  productMetafields?: Array<BigCommerceMetafield>;

  variantMetafields?: Array<BigCommerceMetafield>;
};
