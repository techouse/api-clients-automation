// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package search

import (
	"encoding/json"
	"fmt"
)

// FacetHits struct for FacetHits
type FacetHits struct {
	// Raw value of the facet.
	Value string `json:"value"`
	// Markup text with occurrences highlighted.
	Highlighted string `json:"highlighted"`
	// How many objects contain this facet value. This takes into account the extra search parameters specified in the query. Like for a regular search query, the counts may not be exhaustive.
	Count int32 `json:"count"`
}

// NewFacetHits instantiates a new FacetHits object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFacetHits(value string, highlighted string, count int32) *FacetHits {
	this := &FacetHits{}
	this.Value = value
	this.Highlighted = highlighted
	this.Count = count
	return this
}

// NewFacetHitsWithDefaults instantiates a new FacetHits object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFacetHitsWithDefaults() *FacetHits {
	this := &FacetHits{}
	return this
}

// GetValue returns the Value field value
func (o *FacetHits) GetValue() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Value
}

// GetValueOk returns a tuple with the Value field value
// and a boolean to check if the value has been set.
func (o *FacetHits) GetValueOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Value, true
}

// SetValue sets field value
func (o *FacetHits) SetValue(v string) {
	o.Value = v
}

// GetHighlighted returns the Highlighted field value
func (o *FacetHits) GetHighlighted() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Highlighted
}

// GetHighlightedOk returns a tuple with the Highlighted field value
// and a boolean to check if the value has been set.
func (o *FacetHits) GetHighlightedOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Highlighted, true
}

// SetHighlighted sets field value
func (o *FacetHits) SetHighlighted(v string) {
	o.Highlighted = v
}

// GetCount returns the Count field value
func (o *FacetHits) GetCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Count
}

// GetCountOk returns a tuple with the Count field value
// and a boolean to check if the value has been set.
func (o *FacetHits) GetCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Count, true
}

// SetCount sets field value
func (o *FacetHits) SetCount(v int32) {
	o.Count = v
}

func (o FacetHits) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["value"] = o.Value
	}
	if true {
		toSerialize["highlighted"] = o.Highlighted
	}
	if true {
		toSerialize["count"] = o.Count
	}
	return json.Marshal(toSerialize)
}

func (o FacetHits) String() string {
	out := "FacetHits {\n"
	out += fmt.Sprintf("  value=%v\n", o.Value)
	out += fmt.Sprintf("  highlighted=%v\n", o.Highlighted)
	out += fmt.Sprintf("  count=%v\n", o.Count)
	out += "}"
	return out
}

type NullableFacetHits struct {
	value *FacetHits
	isSet bool
}

func (v NullableFacetHits) Get() *FacetHits {
	return v.value
}

func (v *NullableFacetHits) Set(val *FacetHits) {
	v.value = val
	v.isSet = true
}

func (v NullableFacetHits) IsSet() bool {
	return v.isSet
}

func (v *NullableFacetHits) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFacetHits(val *FacetHits) *NullableFacetHits {
	return &NullableFacetHits{value: val, isSet: true}
}

func (v NullableFacetHits) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFacetHits) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}