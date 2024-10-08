// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package com.algolia.e2e

import com.algolia.client.api.IngestionClient
import com.algolia.client.configuration.*
import com.algolia.client.model.ingestion.*
import com.algolia.client.transport.*
import com.algolia.utils.*
import io.github.cdimascio.dotenv.Dotenv
import io.ktor.http.*
import kotlinx.coroutines.test.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*
import org.skyscreamer.jsonassert.JSONAssert
import org.skyscreamer.jsonassert.JSONCompareMode
import kotlin.test.*

class IngestionTest {

  var client: IngestionClient

  init {
    if (System.getenv("CI") == "true") {
      this.client = IngestionClient(appId = System.getenv("ALGOLIA_APPLICATION_ID"), apiKey = System.getenv("ALGOLIA_ADMIN_KEY"), region = "us")
    } else {
      val dotenv = Dotenv.configure().directory("../../").load()
      this.client = IngestionClient(appId = dotenv["ALGOLIA_APPLICATION_ID"], apiKey = dotenv["ALGOLIA_ADMIN_KEY"], region = "us")
    }
  }

  @Test
  fun `enableTask`() = runTest {
    client.runTest(
      call = {
        enableTask(
          taskID = "76ab4c2a-ce17-496f-b7a6-506dc59ee498",
        )
      },
      response = {
        JSONAssert.assertEquals("{\"taskID\":\"76ab4c2a-ce17-496f-b7a6-506dc59ee498\"}", Json.encodeToString(it), JSONCompareMode.LENIENT)
      },
    )
  }

  @Test
  fun `enableTaskV1`() = runTest {
    client.runTest(
      call = {
        enableTaskV1(
          taskID = "76ab4c2a-ce17-496f-b7a6-506dc59ee498",
        )
      },
      response = {
        JSONAssert.assertEquals("{\"taskID\":\"76ab4c2a-ce17-496f-b7a6-506dc59ee498\"}", Json.encodeToString(it), JSONCompareMode.LENIENT)
      },
    )
  }

  @Test
  fun `getSource`() = runTest {
    client.runTest(
      call = {
        getSource(
          sourceID = "75eeb306-51d3-4e5e-a279-3c92bd8893ac",
        )
      },
      response = {
        JSONAssert.assertEquals("{\"sourceID\":\"75eeb306-51d3-4e5e-a279-3c92bd8893ac\",\"name\":\"cts_e2e_browse\",\"type\":\"json\",\"input\":{\"url\":\"https://raw.githubusercontent.com/prust/wikipedia-movie-data/master/movies.json\"}}", Json.encodeToString(it), JSONCompareMode.LENIENT)
      },
    )
  }

  @Test
  fun `getAuthentications with query params1`() = runTest {
    client.runTest(
      call = {
        listAuthentications(
          itemsPerPage = 2,
          page = 1,
          type = listOf(AuthenticationType.entries.first { it.value == "basic" }, AuthenticationType.entries.first { it.value == "algolia" }),
          platform = listOf(PlatformNone.entries.first { it.value == "none" }),
          sort = AuthenticationSortKeys.entries.first { it.value == "createdAt" },
          order = OrderKeys.entries.first { it.value == "asc" },
        )
      },
      response = {
        JSONAssert.assertEquals("{\"pagination\":{\"page\":1,\"itemsPerPage\":2},\"authentications\":[{\"authenticationID\":\"474f050f-a771-464c-a016-323538029f5f\",\"type\":\"algolia\",\"name\":\"algolia-auth-1677060483885\",\"input\":{},\"createdAt\":\"2023-02-22T10:08:04Z\",\"updatedAt\":\"2023-10-25T08:41:56Z\"},{}]}", Json.encodeToString(it), JSONCompareMode.LENIENT)
      },
    )
  }

  @Test
  fun `searchTasks`() = runTest {
    client.runTest(
      call = {
        searchTasks(
          taskSearch = TaskSearch(
            taskIDs = listOf("6c02aeb1-775e-418e-870b-1faccd4b2c0f", "947ac9c4-7e58-4c87-b1e7-14a68e99699a", "76ab4c2a-ce17-496f-b7a6-506dc59ee498"),
          ),
        )
      },
      response = {
        JSONAssert.assertEquals("[{\"taskID\":\"76ab4c2a-ce17-496f-b7a6-506dc59ee498\",\"sourceID\":\"75eeb306-51d3-4e5e-a279-3c92bd8893ac\",\"destinationID\":\"506d79fa-e29d-4bcf-907c-6b6a41172153\",\"enabled\":true,\"failureThreshold\":0,\"action\":\"replace\",\"createdAt\":\"2024-01-08T16:47:41Z\"}]", Json.encodeToString(it), JSONCompareMode.LENIENT)
      },
    )
  }

  @Test
  fun `searchTasksV1`() = runTest {
    client.runTest(
      call = {
        searchTasksV1(
          taskSearch = TaskSearch(
            taskIDs = listOf("6c02aeb1-775e-418e-870b-1faccd4b2c0f", "947ac9c4-7e58-4c87-b1e7-14a68e99699a", "76ab4c2a-ce17-496f-b7a6-506dc59ee498"),
          ),
        )
      },
      response = {
        JSONAssert.assertEquals("[{\"taskID\":\"76ab4c2a-ce17-496f-b7a6-506dc59ee498\",\"sourceID\":\"75eeb306-51d3-4e5e-a279-3c92bd8893ac\",\"destinationID\":\"506d79fa-e29d-4bcf-907c-6b6a41172153\",\"trigger\":{\"type\":\"onDemand\"},\"enabled\":true,\"failureThreshold\":0,\"action\":\"replace\",\"createdAt\":\"2024-01-08T16:47:41Z\"}]", Json.encodeToString(it), JSONCompareMode.LENIENT)
      },
    )
  }
}
