// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package search

import (
	"encoding/json"
	"fmt"
)

// Value struct for Value
type Value struct {
	// Pinned order of facet lists.
	Order           []string         `json:"order,omitempty"`
	SortRemainingBy *SortRemainingBy `json:"sortRemainingBy,omitempty"`
}

type ValueOption func(f *Value)

func WithValueOrder(val []string) ValueOption {
	return func(f *Value) {
		f.Order = val
	}
}

func WithValueSortRemainingBy(val SortRemainingBy) ValueOption {
	return func(f *Value) {
		f.SortRemainingBy = &val
	}
}

// NewValue instantiates a new Value object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewValue(opts ...ValueOption) *Value {
	this := &Value{}
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewValueWithDefaults instantiates a new Value object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewValueWithDefaults() *Value {
	this := &Value{}
	return this
}

// GetOrder returns the Order field value if set, zero value otherwise.
func (o *Value) GetOrder() []string {
	if o == nil || o.Order == nil {
		var ret []string
		return ret
	}
	return o.Order
}

// GetOrderOk returns a tuple with the Order field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Value) GetOrderOk() ([]string, bool) {
	if o == nil || o.Order == nil {
		return nil, false
	}
	return o.Order, true
}

// HasOrder returns a boolean if a field has been set.
func (o *Value) HasOrder() bool {
	if o != nil && o.Order != nil {
		return true
	}

	return false
}

// SetOrder gets a reference to the given []string and assigns it to the Order field.
func (o *Value) SetOrder(v []string) {
	o.Order = v
}

// GetSortRemainingBy returns the SortRemainingBy field value if set, zero value otherwise.
func (o *Value) GetSortRemainingBy() SortRemainingBy {
	if o == nil || o.SortRemainingBy == nil {
		var ret SortRemainingBy
		return ret
	}
	return *o.SortRemainingBy
}

// GetSortRemainingByOk returns a tuple with the SortRemainingBy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Value) GetSortRemainingByOk() (*SortRemainingBy, bool) {
	if o == nil || o.SortRemainingBy == nil {
		return nil, false
	}
	return o.SortRemainingBy, true
}

// HasSortRemainingBy returns a boolean if a field has been set.
func (o *Value) HasSortRemainingBy() bool {
	if o != nil && o.SortRemainingBy != nil {
		return true
	}

	return false
}

// SetSortRemainingBy gets a reference to the given SortRemainingBy and assigns it to the SortRemainingBy field.
func (o *Value) SetSortRemainingBy(v SortRemainingBy) {
	o.SortRemainingBy = &v
}

func (o Value) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if o.Order != nil {
		toSerialize["order"] = o.Order
	}
	if o.SortRemainingBy != nil {
		toSerialize["sortRemainingBy"] = o.SortRemainingBy
	}
	return json.Marshal(toSerialize)
}

func (o Value) String() string {
	out := "Value {\n"
	out += fmt.Sprintf("  order=%v\n", o.Order)
	out += fmt.Sprintf("  sortRemainingBy=%v\n", o.SortRemainingBy)
	out += "}"
	return out
}

type NullableValue struct {
	value *Value
	isSet bool
}

func (v NullableValue) Get() *Value {
	return v.value
}

func (v *NullableValue) Set(val *Value) {
	v.value = val
	v.isSet = true
}

func (v NullableValue) IsSet() bool {
	return v.isSet
}

func (v *NullableValue) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableValue(val *Value) *NullableValue {
	return &NullableValue{value: val, isSet: true}
}

func (v NullableValue) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableValue) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}