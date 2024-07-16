// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package e2e

import (
	"encoding/json"
	"gotests/tests"
	"os"
	"testing"

	"github.com/kinbiko/jsonassert"
	"github.com/stretchr/testify/require"

	"github.com/joho/godotenv"

	"github.com/algolia/algoliasearch-client-go/v4/algolia/abtesting"
)

func createE2EAbtestingClient(t *testing.T) *abtesting.APIClient {
	t.Helper()

	appID := os.Getenv("ALGOLIA_APPLICATION_ID")
	if appID == "" && os.Getenv("CI") != "true" {
		err := godotenv.Load("../../../../.env")
		require.NoError(t, err)
		appID = os.Getenv("ALGOLIA_APPLICATION_ID")
	}
	apiKey := os.Getenv("ALGOLIA_ADMIN_KEY")
	client, err := abtesting.NewClient(appID, apiKey, abtesting.US)
	require.NoError(t, err)

	return client
}

func TestAbtestingE2E_ListABTests(t *testing.T) {
	t.Run("listABTests with parameters", func(t *testing.T) {
		client := createE2EAbtestingClient(t)
		res, err := client.ListABTests(client.NewApiListABTestsRequest().WithOffset(0).WithLimit(21).WithIndexPrefix("cts_e2e ab").WithIndexSuffix("t"))
		require.NoError(t, err)
		_ = res

		rawBody, err := json.Marshal(res)
		require.NoError(t, err)

		var rawBodyMap any
		err = json.Unmarshal(rawBody, &rawBodyMap)
		require.NoError(t, err)

		expectedBodyRaw := `{"abtests":[{"abTestID":85635,"createdAt":"2024-05-13T10:12:27.739233Z","endAt":"2124-05-13T00:00:00Z","name":"cts_e2e_abtest","status":"active","variants":[{"addToCartCount":0,"clickCount":0,"conversionCount":0,"description":"this abtest is used for api client automation tests and will expire in 2124","index":"cts_e2e_search_facet","purchaseCount":0,"trafficPercentage":25},{"addToCartCount":0,"clickCount":0,"conversionCount":0,"description":"","index":"cts_e2e abtest","purchaseCount":0,"trafficPercentage":75}]}],"count":1,"total":1}`
		var expectedBody any
		err = json.Unmarshal([]byte(expectedBodyRaw), &expectedBody)
		require.NoError(t, err)

		unionBody := tests.Union(expectedBody, rawBodyMap)
		unionBodyRaw, err := json.Marshal(unionBody)
		require.NoError(t, err)

		jsonassert.New(t).Assertf(string(unionBodyRaw), expectedBodyRaw)
	})
}
