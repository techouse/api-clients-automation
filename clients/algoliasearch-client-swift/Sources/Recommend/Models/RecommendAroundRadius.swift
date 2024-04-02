// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

/// Maximum radius for a search around a central location.  This parameter works in combination with the
/// &#x60;aroundLatLng&#x60; and &#x60;aroundLatLngViaIP&#x60; parameters. By default, the search radius is determined
/// automatically from the density of hits around the central location. The search radius is small if there are many
/// hits close to the central coordinates.
public enum RecommendAroundRadius: Codable, JSONEncodable, AbstractEncodable {
    case int(Int)
    case recommendAroundRadiusAll(RecommendAroundRadiusAll)

    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        switch self {
        case let .int(value):
            try container.encode(value)
        case let .recommendAroundRadiusAll(value):
            try container.encode(value)
        }
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        if let value = try? container.decode(Int.self) {
            self = .int(value)
        } else if let value = try? container.decode(RecommendAroundRadiusAll.self) {
            self = .recommendAroundRadiusAll(value)
        } else {
            throw DecodingError.typeMismatch(
                Self.Type.self,
                .init(
                    codingPath: decoder.codingPath,
                    debugDescription: "Unable to decode instance of RecommendAroundRadius"
                )
            )
        }
    }

    public func GetActualInstance() -> Encodable {
        switch self {
        case let .int(value):
            value as Int
        case let .recommendAroundRadiusAll(value):
            value as RecommendAroundRadiusAll
        }
    }
}

extension RecommendAroundRadius: Equatable {}
extension RecommendAroundRadius: Hashable {}
