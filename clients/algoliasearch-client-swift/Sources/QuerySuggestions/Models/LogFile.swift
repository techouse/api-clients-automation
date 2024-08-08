// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

public struct LogFile: Codable, JSONEncodable {
    /// Date and time of the log entry, in RFC 3339 format.
    public var timestamp: String?
    public var level: ModelLogLevel?
    /// Details about this log entry.
    public var message: String?
    /// Level indicating the position of a suggestion in a hierarchy of records.  For example, a `contextLevel` of 1
    /// indicates that this suggestion belongs to a previous suggestion with `contextLevel` 0.
    public var contextLevel: Int?

    public init(
        timestamp: String? = nil,
        level: ModelLogLevel? = nil,
        message: String? = nil,
        contextLevel: Int? = nil
    ) {
        self.timestamp = timestamp
        self.level = level
        self.message = message
        self.contextLevel = contextLevel
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case timestamp
        case level
        case message
        case contextLevel
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(self.timestamp, forKey: .timestamp)
        try container.encodeIfPresent(self.level, forKey: .level)
        try container.encodeIfPresent(self.message, forKey: .message)
        try container.encodeIfPresent(self.contextLevel, forKey: .contextLevel)
    }
}

extension LogFile: Equatable {
    public static func ==(lhs: LogFile, rhs: LogFile) -> Bool {
        lhs.timestamp == rhs.timestamp &&
            lhs.level == rhs.level &&
            lhs.message == rhs.message &&
            lhs.contextLevel == rhs.contextLevel
    }
}

extension LogFile: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.timestamp?.hashValue)
        hasher.combine(self.level?.hashValue)
        hasher.combine(self.message?.hashValue)
        hasher.combine(self.contextLevel?.hashValue)
    }
}