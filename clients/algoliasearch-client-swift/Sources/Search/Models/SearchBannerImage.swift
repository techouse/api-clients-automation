// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

/// image of a search banner.
public struct SearchBannerImage: Codable, JSONEncodable {
    public var urls: [SearchBannerImageUrl]?
    public var title: String?

    public init(urls: [SearchBannerImageUrl]? = nil, title: String? = nil) {
        self.urls = urls
        self.title = title
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case urls
        case title
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(self.urls, forKey: .urls)
        try container.encodeIfPresent(self.title, forKey: .title)
    }
}

extension SearchBannerImage: Equatable {
    public static func ==(lhs: SearchBannerImage, rhs: SearchBannerImage) -> Bool {
        lhs.urls == rhs.urls &&
            lhs.title == rhs.title
    }
}

extension SearchBannerImage: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.urls?.hashValue)
        hasher.combine(self.title?.hashValue)
    }
}
