// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.
import XCTest

import DotEnv
import Utils

@testable import Abtesting
@testable import Core

final class AbtestingClientRequestsTestsE2E: XCTestCase {
    static var APPLICATION_ID = "my_application_id"
    static var API_KEY = "my_api_key"
    static var client: AbtestingClient?

    override class func setUp() {
        if !(Bool(ProcessInfo.processInfo.environment["CI"] ?? "false") ?? false) {
            do {
                let currentFileURL = try XCTUnwrap(URL(string: #file))

                let packageDirectoryURL = currentFileURL
                    .deletingLastPathComponent()
                    .deletingLastPathComponent()
                    .deletingLastPathComponent()
                    .deletingLastPathComponent()
                    .deletingLastPathComponent()

                let dotEnvURL = packageDirectoryURL
                    .appendingPathComponent(".env")
                dump(dotEnvURL.absoluteString)
                try DotEnv.load(path: dotEnvURL.absoluteString, encoding: .utf8, overwrite: true)
            } catch {
                XCTFail("Unable to load .env file")
            }
        }

        do {
            self.APPLICATION_ID = try XCTUnwrap(ProcessInfo.processInfo.environment["ALGOLIA_APPLICATION_ID"])
        } catch {
            XCTFail("Please provide an `ALGOLIA_APPLICATION_ID` env var for e2e tests")
        }

        do {
            self.API_KEY = try XCTUnwrap(ProcessInfo.processInfo.environment["ALGOLIA_ADMIN_KEY"])
        } catch {
            XCTFail("Please provide an `ALGOLIA_ADMIN_KEY` env var for e2e tests")
        }

        e2eClient = try? AbtestingClient(appID: self.APPLICATION_ID, apiKey: self.API_KEY, region: .us)
    }

    /// listABTests with parameters
    func testListABTestsTest1() async throws {
        guard let client = AbtestingClientRequestsTestsE2E.client else {
            XCTFail("E2E client is not initialized")
            return
        }

        let e2eResponse = try await e2eClient.listABTestsWithHTTPInfo(
            offset: 0,
            limit: 21,
            indexPrefix: "cts_e2e ab",
            indexSuffix: "t"
        )
        let e2eResponseBody = try XCTUnwrap(e2eResponse.body)
        let e2eResponseBodyData = try CodableHelper.jsonEncoder.encode(e2eResponseBody)

        let e2eExpectedBodyData =
            try XCTUnwrap(
                "{\"abtests\":[{\"abTestID\":85635,\"createdAt\":\"2024-05-13T10:12:27.739233Z\",\"endAt\":\"2124-05-13T00:00:00Z\",\"name\":\"cts_e2e_abtest\",\"status\":\"active\",\"variants\":[{\"addToCartCount\":0,\"clickCount\":0,\"conversionCount\":0,\"description\":\"this abtest is used for api client automation tests and will expire in 2124\",\"index\":\"cts_e2e_search_facet\",\"purchaseCount\":0,\"trafficPercentage\":25},{\"addToCartCount\":0,\"clickCount\":0,\"conversionCount\":0,\"description\":\"\",\"index\":\"cts_e2e abtest\",\"purchaseCount\":0,\"trafficPercentage\":75}]}],\"count\":1,\"total\":1}"
                    .data(using: .utf8)
            )

        XCTLenientAssertEqual(received: e2eResponseBodyData, expected: e2eExpectedBodyData)

        XCTAssertEqual(e2eResponse.statusCode, 200)
    }
}