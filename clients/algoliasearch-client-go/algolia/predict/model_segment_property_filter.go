// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package predict

import (
	"encoding/json"
	"fmt"
)

// SegmentPropertyFilter Filter for user profile properties.
type SegmentPropertyFilter struct {
	Operator *SegmentFilterOperatorNumerical `json:"operator,omitempty"`
	Value    SegmentPropertyFilterValue      `json:"value"`
}

type SegmentPropertyFilterOption func(f *SegmentPropertyFilter)

func WithSegmentPropertyFilterOperator(val SegmentFilterOperatorNumerical) SegmentPropertyFilterOption {
	return func(f *SegmentPropertyFilter) {
		f.Operator = &val
	}
}

// NewSegmentPropertyFilter instantiates a new SegmentPropertyFilter object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSegmentPropertyFilter(value SegmentPropertyFilterValue, opts ...SegmentPropertyFilterOption) *SegmentPropertyFilter {
	this := &SegmentPropertyFilter{}
	var operator SegmentFilterOperatorNumerical = SEGMENTFILTEROPERATORNUMERICAL_EQ
	this.Operator = &operator
	this.Value = value
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewSegmentPropertyFilterWithDefaults instantiates a new SegmentPropertyFilter object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSegmentPropertyFilterWithDefaults() *SegmentPropertyFilter {
	this := &SegmentPropertyFilter{}
	var operator SegmentFilterOperatorNumerical = SEGMENTFILTEROPERATORNUMERICAL_EQ
	this.Operator = &operator
	return this
}

// GetOperator returns the Operator field value if set, zero value otherwise.
func (o *SegmentPropertyFilter) GetOperator() SegmentFilterOperatorNumerical {
	if o == nil || o.Operator == nil {
		var ret SegmentFilterOperatorNumerical
		return ret
	}
	return *o.Operator
}

// GetOperatorOk returns a tuple with the Operator field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SegmentPropertyFilter) GetOperatorOk() (*SegmentFilterOperatorNumerical, bool) {
	if o == nil || o.Operator == nil {
		return nil, false
	}
	return o.Operator, true
}

// HasOperator returns a boolean if a field has been set.
func (o *SegmentPropertyFilter) HasOperator() bool {
	if o != nil && o.Operator != nil {
		return true
	}

	return false
}

// SetOperator gets a reference to the given SegmentFilterOperatorNumerical and assigns it to the Operator field.
func (o *SegmentPropertyFilter) SetOperator(v SegmentFilterOperatorNumerical) {
	o.Operator = &v
}

// GetValue returns the Value field value
func (o *SegmentPropertyFilter) GetValue() SegmentPropertyFilterValue {
	if o == nil {
		var ret SegmentPropertyFilterValue
		return ret
	}

	return o.Value
}

// GetValueOk returns a tuple with the Value field value
// and a boolean to check if the value has been set.
func (o *SegmentPropertyFilter) GetValueOk() (*SegmentPropertyFilterValue, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Value, true
}

// SetValue sets field value
func (o *SegmentPropertyFilter) SetValue(v SegmentPropertyFilterValue) {
	o.Value = v
}

func (o SegmentPropertyFilter) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if o.Operator != nil {
		toSerialize["operator"] = o.Operator
	}
	if true {
		toSerialize["value"] = o.Value
	}
	return json.Marshal(toSerialize)
}

func (o SegmentPropertyFilter) String() string {
	out := "SegmentPropertyFilter {\n"
	out += fmt.Sprintf("  operator=%v\n", o.Operator)
	out += fmt.Sprintf("  value=%v\n", o.Value)
	out += "}"
	return out
}

type NullableSegmentPropertyFilter struct {
	value *SegmentPropertyFilter
	isSet bool
}

func (v NullableSegmentPropertyFilter) Get() *SegmentPropertyFilter {
	return v.value
}

func (v *NullableSegmentPropertyFilter) Set(val *SegmentPropertyFilter) {
	v.value = val
	v.isSet = true
}

func (v NullableSegmentPropertyFilter) IsSet() bool {
	return v.isSet
}

func (v *NullableSegmentPropertyFilter) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSegmentPropertyFilter(val *SegmentPropertyFilter) *NullableSegmentPropertyFilter {
	return &NullableSegmentPropertyFilter{value: val, isSet: true}
}

func (v NullableSegmentPropertyFilter) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSegmentPropertyFilter) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}