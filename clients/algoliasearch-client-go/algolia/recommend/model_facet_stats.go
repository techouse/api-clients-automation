// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package recommend

import (
	"encoding/json"
	"fmt"
)

// FacetStats struct for FacetStats.
type FacetStats struct {
	// Minimum value in the results.
	Min *float64 `json:"min,omitempty"`
	// Maximum value in the results.
	Max *float64 `json:"max,omitempty"`
	// Average facet value in the results.
	Avg *float64 `json:"avg,omitempty"`
	// Sum of all values in the results.
	Sum *float64 `json:"sum,omitempty"`
}

type FacetStatsOption func(f *FacetStats)

func WithFacetStatsMin(val float64) FacetStatsOption {
	return func(f *FacetStats) {
		f.Min = &val
	}
}

func WithFacetStatsMax(val float64) FacetStatsOption {
	return func(f *FacetStats) {
		f.Max = &val
	}
}

func WithFacetStatsAvg(val float64) FacetStatsOption {
	return func(f *FacetStats) {
		f.Avg = &val
	}
}

func WithFacetStatsSum(val float64) FacetStatsOption {
	return func(f *FacetStats) {
		f.Sum = &val
	}
}

// NewFacetStats instantiates a new FacetStats object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewFacetStats(opts ...FacetStatsOption) *FacetStats {
	this := &FacetStats{}
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewEmptyFacetStats return a pointer to an empty FacetStats object.
func NewEmptyFacetStats() *FacetStats {
	return &FacetStats{}
}

// GetMin returns the Min field value if set, zero value otherwise.
func (o *FacetStats) GetMin() float64 {
	if o == nil || o.Min == nil {
		var ret float64
		return ret
	}
	return *o.Min
}

// GetMinOk returns a tuple with the Min field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FacetStats) GetMinOk() (*float64, bool) {
	if o == nil || o.Min == nil {
		return nil, false
	}
	return o.Min, true
}

// HasMin returns a boolean if a field has been set.
func (o *FacetStats) HasMin() bool {
	if o != nil && o.Min != nil {
		return true
	}

	return false
}

// SetMin gets a reference to the given float64 and assigns it to the Min field.
func (o *FacetStats) SetMin(v float64) *FacetStats {
	o.Min = &v
	return o
}

// GetMax returns the Max field value if set, zero value otherwise.
func (o *FacetStats) GetMax() float64 {
	if o == nil || o.Max == nil {
		var ret float64
		return ret
	}
	return *o.Max
}

// GetMaxOk returns a tuple with the Max field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FacetStats) GetMaxOk() (*float64, bool) {
	if o == nil || o.Max == nil {
		return nil, false
	}
	return o.Max, true
}

// HasMax returns a boolean if a field has been set.
func (o *FacetStats) HasMax() bool {
	if o != nil && o.Max != nil {
		return true
	}

	return false
}

// SetMax gets a reference to the given float64 and assigns it to the Max field.
func (o *FacetStats) SetMax(v float64) *FacetStats {
	o.Max = &v
	return o
}

// GetAvg returns the Avg field value if set, zero value otherwise.
func (o *FacetStats) GetAvg() float64 {
	if o == nil || o.Avg == nil {
		var ret float64
		return ret
	}
	return *o.Avg
}

// GetAvgOk returns a tuple with the Avg field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FacetStats) GetAvgOk() (*float64, bool) {
	if o == nil || o.Avg == nil {
		return nil, false
	}
	return o.Avg, true
}

// HasAvg returns a boolean if a field has been set.
func (o *FacetStats) HasAvg() bool {
	if o != nil && o.Avg != nil {
		return true
	}

	return false
}

// SetAvg gets a reference to the given float64 and assigns it to the Avg field.
func (o *FacetStats) SetAvg(v float64) *FacetStats {
	o.Avg = &v
	return o
}

// GetSum returns the Sum field value if set, zero value otherwise.
func (o *FacetStats) GetSum() float64 {
	if o == nil || o.Sum == nil {
		var ret float64
		return ret
	}
	return *o.Sum
}

// GetSumOk returns a tuple with the Sum field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FacetStats) GetSumOk() (*float64, bool) {
	if o == nil || o.Sum == nil {
		return nil, false
	}
	return o.Sum, true
}

// HasSum returns a boolean if a field has been set.
func (o *FacetStats) HasSum() bool {
	if o != nil && o.Sum != nil {
		return true
	}

	return false
}

// SetSum gets a reference to the given float64 and assigns it to the Sum field.
func (o *FacetStats) SetSum(v float64) *FacetStats {
	o.Sum = &v
	return o
}

func (o FacetStats) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if o.Min != nil {
		toSerialize["min"] = o.Min
	}
	if o.Max != nil {
		toSerialize["max"] = o.Max
	}
	if o.Avg != nil {
		toSerialize["avg"] = o.Avg
	}
	if o.Sum != nil {
		toSerialize["sum"] = o.Sum
	}
	serialized, err := json.Marshal(toSerialize)
	if err != nil {
		return nil, fmt.Errorf("failed to marshal FacetStats: %w", err)
	}

	return serialized, nil
}

func (o FacetStats) String() string {
	out := ""
	out += fmt.Sprintf("  min=%v\n", o.Min)
	out += fmt.Sprintf("  max=%v\n", o.Max)
	out += fmt.Sprintf("  avg=%v\n", o.Avg)
	out += fmt.Sprintf("  sum=%v\n", o.Sum)
	return fmt.Sprintf("FacetStats {\n%s}", out)
}