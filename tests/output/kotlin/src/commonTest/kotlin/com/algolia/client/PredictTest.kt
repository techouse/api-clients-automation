package com.algolia.client

import com.algolia.client.api.PredictClient
import com.algolia.client.configuration.*
import com.algolia.client.model.predict.*
import com.algolia.client.transport.*
import com.algolia.extension.*
import com.algolia.utils.*
import io.ktor.http.*
import kotlinx.coroutines.test.*
import kotlinx.serialization.json.*
import kotlin.test.*

class PredictTest {

  @Test
  fun `calls api with correct user agent`() = runTest {
    val client = PredictClient(appId = "appId", apiKey = "apiKey", region = "eu")
    client.runTest(
      call = {
        post(
          path = "/test",
        )
      },
      intercept = {
        val regexp = "^Algolia for Kotlin \\(\\d+\\.\\d+\\.\\d+(-.*)?\\)(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-.*)?\\))?)*(; Predict (\\(\\d+\\.\\d+\\.\\d+(-.*)?\\)))(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-.*)?\\))?)*$".toRegex()
        val header = it.url.parameters["X-Algolia-Agent"]?.decodeURLPart().orEmpty()
        assertTrue(actual = header.matches(regexp), message = "Expected $header to match the following regex: $regexp")
      },
    )
  }

  @Test
  fun `calls api with default read timeouts`() = runTest {
    val client = PredictClient(appId = "appId", apiKey = "apiKey", region = "eu")
    client.runTest(
      call = {
        get(
          path = "/test",
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
    val client = PredictClient(appId = "appId", apiKey = "apiKey", region = "eu")
    client.runTest(
      call = {
        post(
          path = "/test",
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
      val client = PredictClient(appId = "my-app-id", apiKey = "my-api-key", "")
    }.let { error -> assertError(error, "`region` is required and must be one of the following: eu, us") }
  }

  @Test
  fun `throws when incorrect region is given`() = runTest {
    assertFails {
      val client = PredictClient(appId = "my-app-id", apiKey = "my-api-key", "not_a_region")
    }.let { error -> assertError(error, "`region` is required and must be one of the following: eu, us") }
  }

  @Test
  fun `does not throw when region is given`() = runTest {
    val client = PredictClient(appId = "my-app-id", apiKey = "my-api-key", "eu")
  }
}