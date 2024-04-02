// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

/// Configured tasks and pagination information.
public struct ListTasksResponse: Codable, JSONEncodable {
    public var tasks: [Task]
    public var pagination: Pagination

    public init(tasks: [Task], pagination: Pagination) {
        self.tasks = tasks
        self.pagination = pagination
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case tasks
        case pagination
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(self.tasks, forKey: .tasks)
        try container.encode(self.pagination, forKey: .pagination)
    }
}

extension ListTasksResponse: Equatable {
    public static func ==(lhs: ListTasksResponse, rhs: ListTasksResponse) -> Bool {
        lhs.tasks == rhs.tasks &&
            lhs.pagination == rhs.pagination
    }
}

extension ListTasksResponse: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.tasks.hashValue)
        hasher.combine(self.pagination.hashValue)
    }
}
