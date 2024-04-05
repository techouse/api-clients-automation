// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

public struct GetUsage400ResponseErrorErrorsInner: Codable, JSONEncodable {
    public var code: String?
    public var message: String
    public var line: Int?
    public var position: Int?

    public init(code: String? = nil, message: String, line: Int? = nil, position: Int? = nil) {
        self.code = code
        self.message = message
        self.line = line
        self.position = position
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case code
        case message
        case line
        case position
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(self.code, forKey: .code)
        try container.encode(self.message, forKey: .message)
        try container.encodeIfPresent(self.line, forKey: .line)
        try container.encodeIfPresent(self.position, forKey: .position)
    }
}

extension GetUsage400ResponseErrorErrorsInner: Equatable {
    public static func ==(lhs: GetUsage400ResponseErrorErrorsInner, rhs: GetUsage400ResponseErrorErrorsInner) -> Bool {
        lhs.code == rhs.code &&
            lhs.message == rhs.message &&
            lhs.line == rhs.line &&
            lhs.position == rhs.position
    }
}

extension GetUsage400ResponseErrorErrorsInner: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.code?.hashValue)
        hasher.combine(self.message.hashValue)
        hasher.combine(self.line?.hashValue)
        hasher.combine(self.position?.hashValue)
    }
}
