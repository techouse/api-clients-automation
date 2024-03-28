// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import type { Languages } from './languages';
import type { SourceIndex } from './sourceIndex';

/**
 * Query Suggestions configuration.
 */
export type QuerySuggestionsConfiguration = {
  /**
   * Algolia indices from which to get the popular searches for query suggestions.
   */
  sourceIndices: SourceIndex[];

  languages?: Languages;

  exclude?: string[] | null;

  /**
   * Whether to turn on personalized query suggestions.
   */
  enablePersonalization?: boolean;

  /**
   * Whether to include suggestions with special characters.
   */
  allowSpecialCharacters?: boolean;
};
