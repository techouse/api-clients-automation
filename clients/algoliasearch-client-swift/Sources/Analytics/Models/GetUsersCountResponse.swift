// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

public struct GetUsersCountResponse: Codable, JSONEncodable {
    /// Number of unique users.
    public var count: Int
    /// Daily number of unique users.
    public var dates: [DailyUsers]

    public init(count: Int, dates: [DailyUsers]) {
        self.count = count
        self.dates = dates
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case count
        case dates
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(self.count, forKey: .count)
        try container.encode(self.dates, forKey: .dates)
    }
}

extension GetUsersCountResponse: Equatable {
    public static func ==(lhs: GetUsersCountResponse, rhs: GetUsersCountResponse) -> Bool {
        lhs.count == rhs.count &&
            lhs.dates == rhs.dates
    }
}

extension GetUsersCountResponse: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.count.hashValue)
        hasher.combine(self.dates.hashValue)
    }
}
