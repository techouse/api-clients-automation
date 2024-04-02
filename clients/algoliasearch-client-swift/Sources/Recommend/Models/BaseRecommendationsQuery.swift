// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

public struct BaseRecommendationsQuery: Codable, JSONEncodable {
    public var model: RecommendationModels
    /// Unique record identifier.
    public var objectID: String
    public var queryParameters: RecommendSearchParamsObject?
    public var fallbackParameters: RecommendSearchParamsObject?

    public init(
        model: RecommendationModels,
        objectID: String,
        queryParameters: RecommendSearchParamsObject? = nil,
        fallbackParameters: RecommendSearchParamsObject? = nil
    ) {
        self.model = model
        self.objectID = objectID
        self.queryParameters = queryParameters
        self.fallbackParameters = fallbackParameters
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case model
        case objectID
        case queryParameters
        case fallbackParameters
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(self.model, forKey: .model)
        try container.encode(self.objectID, forKey: .objectID)
        try container.encodeIfPresent(self.queryParameters, forKey: .queryParameters)
        try container.encodeIfPresent(self.fallbackParameters, forKey: .fallbackParameters)
    }
}

extension BaseRecommendationsQuery: Equatable {
    public static func ==(lhs: BaseRecommendationsQuery, rhs: BaseRecommendationsQuery) -> Bool {
        lhs.model == rhs.model &&
            lhs.objectID == rhs.objectID &&
            lhs.queryParameters == rhs.queryParameters &&
            lhs.fallbackParameters == rhs.fallbackParameters
    }
}

extension BaseRecommendationsQuery: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.model.hashValue)
        hasher.combine(self.objectID.hashValue)
        hasher.combine(self.queryParameters?.hashValue)
        hasher.combine(self.fallbackParameters?.hashValue)
    }
}
