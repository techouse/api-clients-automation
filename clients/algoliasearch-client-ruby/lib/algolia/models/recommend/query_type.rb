# Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

require "date"
require "time"

module Algolia
  module Recommend
    class QueryType
      PREFIX_LAST = "prefixLast".freeze
      PREFIX_ALL = "prefixAll".freeze
      PREFIX_NONE = "prefixNone".freeze

      def self.all_vars
        @all_vars ||= [PREFIX_LAST, PREFIX_ALL, PREFIX_NONE].freeze
      end

      # Builds the enum from string
      # @param [String] The enum value in the form of the string
      # @return [String] The enum value
      def self.build_from_hash(value)
        new.build_from_hash(value)
      end

      # Builds the enum from string
      # @param [String] The enum value in the form of the string
      # @return [String] The enum value
      def build_from_hash(value)
        return value if QueryType.all_vars.include?(value)
        raise "Invalid ENUM value #{value} for class #QueryType"
      end
    end
  end
end
