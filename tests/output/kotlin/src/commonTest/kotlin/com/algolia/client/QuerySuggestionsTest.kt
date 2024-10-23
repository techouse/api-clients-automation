// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package com.algolia.client

import com.algolia.client.api.QuerySuggestionsClient
import com.algolia.client.configuration.*
import com.algolia.client.extensions.*
import com.algolia.client.model.querysuggestions.*
import com.algolia.client.transport.*
import com.algolia.utils.*
import io.ktor.http.*
import kotlinx.coroutines.test.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*
import kotlin.test.*

class QuerySuggestionsTest {

  @Test
  fun `calls api with correct user agent`() = runTest {
    val client = QuerySuggestionsClient(appId = "appId", apiKey = "apiKey", region = "us")
    client.runTest(
      call = {
        customPost(
          path = "1/test",
        )
      },
      intercept = {
        val regexp = "^Algolia for Kotlin \\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*(; QuerySuggestions (\\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)))(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*$".toRegex()
        val header = it.headers["User-Agent"].orEmpty()
        assertTrue(actual = header.matches(regexp), message = "Expected $header to match the following regex: $regexp")
      },
    )
  }

  @Test
  fun `the user agent contains the latest version`() = runTest {
    val client = QuerySuggestionsClient(appId = "appId", apiKey = "apiKey", region = "us")
    client.runTest(
      call = {
        customPost(
          path = "1/test",
        )
      },
      intercept = {
        val regexp = "^Algolia for Kotlin \\(3.6.4\\).*".toRegex()
        val header = it.headers["User-Agent"].orEmpty()
        assertTrue(actual = header.matches(regexp), message = "Expected $header to match the following regex: $regexp")
      },
    )
  }

  @Test
  fun `calls api with default read timeouts`() = runTest {
    val client = QuerySuggestionsClient(appId = "appId", apiKey = "apiKey", region = "us")
    client.runTest(
      call = {
        customGet(
          path = "1/test",
        )
      },
      intercept = {
        assertEquals(2000, it.connectTimeout)
        assertEquals(5000, it.socketTimeout)
      },
    )
  }

  @Test
  fun `calls api with default write timeouts`() = runTest {
    val client = QuerySuggestionsClient(appId = "appId", apiKey = "apiKey", region = "us")
    client.runTest(
      call = {
        customPost(
          path = "1/test",
        )
      },
      intercept = {
        assertEquals(2000, it.connectTimeout)
        assertEquals(30000, it.socketTimeout)
      },
    )
  }

  @Test
  fun `throws when region is not given`() = runTest {
    assertFails {
      val client = QuerySuggestionsClient(appId = "my-app-id", apiKey = "my-api-key", "")
    }.let { error -> assertError(error, "`region` is required and must be one of the following: eu, us".replace("%localhost%", if (System.getenv("CI") == "true") "localhost" else "host.docker.internal")) }
  }

  @Test
  fun `throws when incorrect region is given`() = runTest {
    assertFails {
      val client = QuerySuggestionsClient(appId = "my-app-id", apiKey = "my-api-key", "not_a_region")
    }.let { error -> assertError(error, "`region` is required and must be one of the following: eu, us".replace("%localhost%", if (System.getenv("CI") == "true") "localhost" else "host.docker.internal")) }
  }

  @Test
  fun `does not throw when region is given`() = runTest {
    val client = QuerySuggestionsClient(appId = "my-app-id", apiKey = "my-api-key", "us")
  }

  @Test
  fun `switch API key`() = runTest {
    val client = QuerySuggestionsClient(appId = "test-app-id", apiKey = "test-api-key", "us", options = ClientOptions(hosts = listOf(Host(url = if (System.getenv("CI") == "true") "localhost" else "host.docker.internal", protocol = "http", port = 6683))))
    client.runTest(
      call = {
        customGet(
          path = "check-api-key/1",
        )
      },

      response = {
        val response = Json.encodeToString(it)
        assertEquals("{\"headerAPIKeyValue\":\"test-api-key\"}", response)
      },
    )
    client.runTest(
      call = {
        setClientApiKey(
          apiKey = "updated-api-key",
        )
      },
      intercept = {
      },
    )
    client.runTest(
      call = {
        customGet(
          path = "check-api-key/2",
        )
      },

      response = {
        val response = Json.encodeToString(it)
        assertEquals("{\"headerAPIKeyValue\":\"updated-api-key\"}", response)
      },
    )
  }
}
