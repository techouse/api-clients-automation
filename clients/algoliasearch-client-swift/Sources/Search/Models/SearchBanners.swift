// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

/// banners defined in the merchandising studio for the given search.
public struct SearchBanners: Codable, JSONEncodable {
    public var banners: SearchBanner?

    public init(banners: SearchBanner? = nil) {
        self.banners = banners
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case banners
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(self.banners, forKey: .banners)
    }
}

extension SearchBanners: Equatable {
    public static func ==(lhs: SearchBanners, rhs: SearchBanners) -> Bool {
        lhs.banners == rhs.banners
    }
}

extension SearchBanners: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.banners?.hashValue)
    }
}