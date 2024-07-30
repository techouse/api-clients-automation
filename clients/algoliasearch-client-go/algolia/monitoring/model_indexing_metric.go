// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package monitoring

import (
	"encoding/json"
	"fmt"
)

// IndexingMetric struct for IndexingMetric.
type IndexingMetric struct {
	Indexing *map[string][]TimeEntry `json:"indexing,omitempty"`
}

type IndexingMetricOption func(f *IndexingMetric)

func WithIndexingMetricIndexing(val map[string][]TimeEntry) IndexingMetricOption {
	return func(f *IndexingMetric) {
		f.Indexing = &val
	}
}

// NewIndexingMetric instantiates a new IndexingMetric object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewIndexingMetric(opts ...IndexingMetricOption) *IndexingMetric {
	this := &IndexingMetric{}
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewEmptyIndexingMetric return a pointer to an empty IndexingMetric object.
func NewEmptyIndexingMetric() *IndexingMetric {
	return &IndexingMetric{}
}

// GetIndexing returns the Indexing field value if set, zero value otherwise.
func (o *IndexingMetric) GetIndexing() map[string][]TimeEntry {
	if o == nil || o.Indexing == nil {
		var ret map[string][]TimeEntry
		return ret
	}
	return *o.Indexing
}

// GetIndexingOk returns a tuple with the Indexing field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IndexingMetric) GetIndexingOk() (*map[string][]TimeEntry, bool) {
	if o == nil || o.Indexing == nil {
		return nil, false
	}
	return o.Indexing, true
}

// HasIndexing returns a boolean if a field has been set.
func (o *IndexingMetric) HasIndexing() bool {
	if o != nil && o.Indexing != nil {
		return true
	}

	return false
}

// SetIndexing gets a reference to the given map[string][]TimeEntry and assigns it to the Indexing field.
func (o *IndexingMetric) SetIndexing(v map[string][]TimeEntry) *IndexingMetric {
	o.Indexing = &v
	return o
}

func (o IndexingMetric) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if o.Indexing != nil {
		toSerialize["indexing"] = o.Indexing
	}
	serialized, err := json.Marshal(toSerialize)
	if err != nil {
		return nil, fmt.Errorf("failed to marshal IndexingMetric: %w", err)
	}

	return serialized, nil
}

func (o IndexingMetric) String() string {
	out := ""
	out += fmt.Sprintf("  indexing=%v\n", o.Indexing)
	return fmt.Sprintf("IndexingMetric {\n%s}", out)
}
