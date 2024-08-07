// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

/// API request body for updating a task.
public struct TaskUpdate: Codable, JSONEncodable {
    /// Universally unique identifier (UUID) of a destination resource.
    public var destinationID: String?
    public var trigger: TriggerUpdateInput?
    public var input: TaskInput?
    /// Whether the task is enabled.
    public var enabled: Bool?
    /// Maximum accepted percentage of failures for a task run to finish successfully.
    public var failureThreshold: Int?

    public init(
        destinationID: String? = nil,
        trigger: TriggerUpdateInput? = nil,
        input: TaskInput? = nil,
        enabled: Bool? = nil,
        failureThreshold: Int? = nil
    ) {
        self.destinationID = destinationID
        self.trigger = trigger
        self.input = input
        self.enabled = enabled
        self.failureThreshold = failureThreshold
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case destinationID
        case trigger
        case input
        case enabled
        case failureThreshold
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(self.destinationID, forKey: .destinationID)
        try container.encodeIfPresent(self.trigger, forKey: .trigger)
        try container.encodeIfPresent(self.input, forKey: .input)
        try container.encodeIfPresent(self.enabled, forKey: .enabled)
        try container.encodeIfPresent(self.failureThreshold, forKey: .failureThreshold)
    }
}

extension TaskUpdate: Equatable {
    public static func ==(lhs: TaskUpdate, rhs: TaskUpdate) -> Bool {
        lhs.destinationID == rhs.destinationID &&
            lhs.trigger == rhs.trigger &&
            lhs.input == rhs.input &&
            lhs.enabled == rhs.enabled &&
            lhs.failureThreshold == rhs.failureThreshold
    }
}

extension TaskUpdate: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.destinationID?.hashValue)
        hasher.combine(self.trigger?.hashValue)
        hasher.combine(self.input?.hashValue)
        hasher.combine(self.enabled?.hashValue)
        hasher.combine(self.failureThreshold?.hashValue)
    }
}
