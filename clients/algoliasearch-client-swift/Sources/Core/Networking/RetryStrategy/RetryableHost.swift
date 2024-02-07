//
//  RetryableHost.swift
//
//
//  Created by Algolia on 19/02/2020.
//

import Foundation

public struct RetryableHost {
    /// The url to target.
    public let url: URL

    let supportedCallTypes: CallTypeSupport
    var isUp: Bool
    var lastUpdated: Date
    var retryCount: Int

    public init(url: URL) {
        self.init(url: url, callType: .universal)
    }

    public init(url: URL, callType: CallTypeSupport = .universal) {
        self.url = url
        supportedCallTypes = callType
        isUp = true
        lastUpdated = .init()
        retryCount = 0
    }

    public func supports(_ callType: CallType) -> Bool {
        switch callType {
        case .read:
            return supportedCallTypes.contains(.read)
        case .write:
            return supportedCallTypes.contains(.write)
        }
    }

    mutating func reset() {
        lastUpdated = .init()
        isUp = true
        retryCount = 0
    }

    mutating func hasTimedOut() {
        isUp = true
        lastUpdated = .init()
        retryCount += 1
    }

    mutating func hasFailed() {
        isUp = false
        lastUpdated = .init()
    }
}

public extension RetryableHost {
    struct CallTypeSupport: OptionSet {
        public let rawValue: Int
        public static let read = CallTypeSupport(rawValue: 1 << 0)
        public static let write = CallTypeSupport(rawValue: 1 << 1)
        public static let universal: CallTypeSupport = [.read, .write]

        public init(rawValue: Int) {
            self.rawValue = rawValue
        }
    }
}

extension RetryableHost.CallTypeSupport: CustomDebugStringConvertible {
    public var debugDescription: String {
        var components: [String] = []
        if contains(.read) {
            components.append("read")
        }
        if contains(.write) {
            components.append("write")
        }
        return "[\(components.joined(separator: ", "))]"
    }
}

extension RetryableHost: CustomDebugStringConvertible {
    public var debugDescription: String {
        "Host \(supportedCallTypes.debugDescription) \(url) up: \(isUp) retry count: \(retryCount) updated: \(lastUpdated)"
    }
}

public extension Array where Element == RetryableHost {
    /** Reset all hosts down for more than specified interval.
     */
    mutating func resetExpired(expirationDelay: TimeInterval) {
        var updatedHosts: [RetryableHost] = []
        for host in self {
            var mutableHost = host
            let timeDelayExpired = Date().timeIntervalSince(host.lastUpdated)
            if timeDelayExpired > expirationDelay {
                mutableHost.reset()
            }
            updatedHosts.append(mutableHost)
        }
        self = updatedHosts
    }

    mutating func resetAll(for callType: CallType) {
        var updatedHosts: [RetryableHost] = []
        for host in self {
            var mutableHost = host
            if mutableHost.supports(callType) {
                mutableHost.reset()
            }
            updatedHosts.append(mutableHost)
        }
        self = updatedHosts
    }
}