// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import type { Condition } from './condition';
import type { Consequence } from './consequence';
import type { RuleMetadata } from './ruleMetadata';

/**
 * Recommend rule.
 */
export type RecommendRule = {
  _metadata?: RuleMetadata;

  /**
   * Unique identifier of a rule object.
   */
  objectID?: string;

  condition?: Condition;

  consequence?: Consequence;

  /**
   * Description of the rule\'s purpose. This can be helpful for display in the Algolia dashboard.
   */
  description?: string;

  /**
   * Indicates whether to enable the rule. If it isn\'t enabled, it isn\'t applied at query time.
   */
  enabled?: boolean;
};
