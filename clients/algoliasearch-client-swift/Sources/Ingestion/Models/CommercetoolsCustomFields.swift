// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import AnyCodable
import Core
import Foundation

/// Custom fields from Commercetools to index in the records (see
/// https://docs.commercetools.com/tutorials/custom-types).
public struct CommercetoolsCustomFields: Codable, JSONEncodable, Hashable {
    /// Inventory custom fields.
    public var inventory: [String]?
    /// Price custom fields.
    public var price: [String]?
    /// Category custom fields.
    public var category: [String]?

    public init(inventory: [String]? = nil, price: [String]? = nil, category: [String]? = nil) {
        self.inventory = inventory
        self.price = price
        self.category = category
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case inventory
        case price
        case category
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(self.inventory, forKey: .inventory)
        try container.encodeIfPresent(self.price, forKey: .price)
        try container.encodeIfPresent(self.category, forKey: .category)
    }
}