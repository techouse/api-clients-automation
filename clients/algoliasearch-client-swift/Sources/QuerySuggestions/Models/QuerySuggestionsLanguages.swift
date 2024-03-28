// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

/// Languages for deduplicating singular and plural suggestions. If specified, only the more popular form is included.
public enum QuerySuggestionsLanguages: Codable, JSONEncodable, AbstractEncodable {
    case arrayOfString([String])
    case bool(Bool)

    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        switch self {
        case let .arrayOfString(value):
            try container.encode(value)
        case let .bool(value):
            try container.encode(value)
        }
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        if let value = try? container.decode([String].self) {
            self = .arrayOfString(value)
        } else if let value = try? container.decode(Bool.self) {
            self = .bool(value)
        } else {
            throw DecodingError.typeMismatch(
                Self.Type.self,
                .init(
                    codingPath: decoder.codingPath,
                    debugDescription: "Unable to decode instance of QuerySuggestionsLanguages"
                )
            )
        }
    }

    public func GetActualInstance() -> Encodable {
        switch self {
        case let .arrayOfString(value):
            value as [String]
        case let .bool(value):
            value as Bool
        }
    }
}
