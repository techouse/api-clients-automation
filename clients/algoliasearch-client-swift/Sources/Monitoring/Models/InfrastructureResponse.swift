// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

public struct InfrastructureResponse: Codable, JSONEncodable {
    public var metrics: InfrastructureResponseMetrics?

    public init(metrics: InfrastructureResponseMetrics? = nil) {
        self.metrics = metrics
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case metrics
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(self.metrics, forKey: .metrics)
    }
}

extension InfrastructureResponse: Equatable {
    public static func ==(lhs: InfrastructureResponse, rhs: InfrastructureResponse) -> Bool {
        lhs.metrics == rhs.metrics
    }
}

extension InfrastructureResponse: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.metrics?.hashValue)
    }
}
