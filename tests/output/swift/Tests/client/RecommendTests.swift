import XCTest

#if canImport(AnyCodable)
    import AnyCodable
#endif
import Utils

@testable import Core
@testable import Recommend

final class RecommendClientClientTests: XCTestCase {
    let APPLICATION_ID = "my_application_id"
    let API_KEY = "my_api_key"

    /**
     calls api with correct read host
     */
    func testApiTest0() async throws {
        let configuration: Recommend.Configuration = try Recommend.Configuration(appId: "test-app-id", apiKey: "test-api-key")
        let transporter = Transporter(configuration: configuration, requestBuilder: EchoRequestBuilder())
        let client = RecommendClient(configuration: configuration, transporter: transporter)
        let response = try await client.customGetWithHTTPInfo(
            path: "/test"
        )
        let responseBodyData = try XCTUnwrap(response.bodyData)
        let echoResponse = try CodableHelper.jsonDecoder.decode(EchoResponse.self, from: responseBodyData)

        XCTAssertEqual("test-app-id-dsn.algolia.net", echoResponse.host)
    }

    /**
     calls api with correct write host
     */
    func testApiTest1() async throws {
        let configuration: Recommend.Configuration = try Recommend.Configuration(appId: "test-app-id", apiKey: "test-api-key")
        let transporter = Transporter(configuration: configuration, requestBuilder: EchoRequestBuilder())
        let client = RecommendClient(configuration: configuration, transporter: transporter)
        let response = try await client.customPostWithHTTPInfo(
            path: "/test"
        )
        let responseBodyData = try XCTUnwrap(response.bodyData)
        let echoResponse = try CodableHelper.jsonDecoder.decode(EchoResponse.self, from: responseBodyData)

        XCTAssertEqual("test-app-id.algolia.net", echoResponse.host)
    }

    /**
     calls api with correct user agent
     */
    func testCommonApiTest0() async throws {
        let configuration: Recommend.Configuration = try Recommend.Configuration(appId: APPLICATION_ID, apiKey: API_KEY)
        let transporter = Transporter(configuration: configuration, requestBuilder: EchoRequestBuilder())
        let client = RecommendClient(configuration: configuration, transporter: transporter)

        let response = try await client.customPostWithHTTPInfo(
            path: "/test"
        )
        let responseBodyData = try XCTUnwrap(response.bodyData)
        let echoResponse = try CodableHelper.jsonDecoder.decode(EchoResponse.self, from: responseBodyData)

        let pattern = "^Algolia for Swift \\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*(; Recommend (\\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)))(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*$"
        let rule = StringRule(pattern: pattern)
        let userAgent = try XCTUnwrap(echoResponse.headers?["User-Agent"])
        guard let userAgent = userAgent else {
            XCTFail("Expected user-agent header")
            return
        }

        XCTAssertNoThrow(try Validator.validate(userAgent, against: rule), "Expected " + userAgent + " to match the following regex: " + pattern)
    }

    /**
     calls api with default read timeouts
     */
    func testCommonApiTest1() async throws {
        let configuration: Recommend.Configuration = try Recommend.Configuration(appId: APPLICATION_ID, apiKey: API_KEY)
        let transporter = Transporter(configuration: configuration, requestBuilder: EchoRequestBuilder())
        let client = RecommendClient(configuration: configuration, transporter: transporter)

        let response = try await client.customGetWithHTTPInfo(
            path: "/test"
        )
        let responseBodyData = try XCTUnwrap(response.bodyData)
        let echoResponse = try CodableHelper.jsonDecoder.decode(EchoResponse.self, from: responseBodyData)

        XCTAssertEqual(TimeInterval(5000 / 1000), echoResponse.timeout)
    }

    /**
     calls api with default write timeouts
     */
    func testCommonApiTest2() async throws {
        let configuration: Recommend.Configuration = try Recommend.Configuration(appId: APPLICATION_ID, apiKey: API_KEY)
        let transporter = Transporter(configuration: configuration, requestBuilder: EchoRequestBuilder())
        let client = RecommendClient(configuration: configuration, transporter: transporter)

        let response = try await client.customPostWithHTTPInfo(
            path: "/test"
        )
        let responseBodyData = try XCTUnwrap(response.bodyData)
        let echoResponse = try CodableHelper.jsonDecoder.decode(EchoResponse.self, from: responseBodyData)

        XCTAssertEqual(TimeInterval(30000 / 1000), echoResponse.timeout)
    }
}