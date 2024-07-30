// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

public struct SearchBatchRequest: Codable, JSONEncodable {
    public var action: SearchAction
    /// Operation arguments (varies with specified `action`).
    public var body: AnyCodable

    public init(action: SearchAction, body: AnyCodable) {
        self.action = action
        self.body = body
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case action
        case body
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(self.action, forKey: .action)
        try container.encode(self.body, forKey: .body)
    }
}

extension SearchBatchRequest: Equatable {
    public static func ==(lhs: SearchBatchRequest, rhs: SearchBatchRequest) -> Bool {
        lhs.action == rhs.action &&
            lhs.body == rhs.body
    }
}

extension SearchBatchRequest: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.action.hashValue)
        hasher.combine(self.body.hashValue)
    }
}