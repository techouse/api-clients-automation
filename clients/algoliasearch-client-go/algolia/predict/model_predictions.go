// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package predict

import (
	"encoding/json"
	"fmt"
)

// Predictions struct for Predictions
type Predictions struct {
	FunnelStage *PredictionsFunnelStage `json:"funnel_stage,omitempty"`
	OrderValue  *PredictionsOrderValue  `json:"order_value,omitempty"`
	Affinities  *PredictionsAffinities  `json:"affinities,omitempty"`
}

type PredictionsOption func(f *Predictions)

func WithPredictionsFunnelStage(val PredictionsFunnelStage) PredictionsOption {
	return func(f *Predictions) {
		f.FunnelStage = &val
	}
}

func WithPredictionsOrderValue(val PredictionsOrderValue) PredictionsOption {
	return func(f *Predictions) {
		f.OrderValue = &val
	}
}

func WithPredictionsAffinities(val PredictionsAffinities) PredictionsOption {
	return func(f *Predictions) {
		f.Affinities = &val
	}
}

// NewPredictions instantiates a new Predictions object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPredictions(opts ...PredictionsOption) *Predictions {
	this := &Predictions{}
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewPredictionsWithDefaults instantiates a new Predictions object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPredictionsWithDefaults() *Predictions {
	this := &Predictions{}
	return this
}

// GetFunnelStage returns the FunnelStage field value if set, zero value otherwise.
func (o *Predictions) GetFunnelStage() PredictionsFunnelStage {
	if o == nil || o.FunnelStage == nil {
		var ret PredictionsFunnelStage
		return ret
	}
	return *o.FunnelStage
}

// GetFunnelStageOk returns a tuple with the FunnelStage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Predictions) GetFunnelStageOk() (*PredictionsFunnelStage, bool) {
	if o == nil || o.FunnelStage == nil {
		return nil, false
	}
	return o.FunnelStage, true
}

// HasFunnelStage returns a boolean if a field has been set.
func (o *Predictions) HasFunnelStage() bool {
	if o != nil && o.FunnelStage != nil {
		return true
	}

	return false
}

// SetFunnelStage gets a reference to the given PredictionsFunnelStage and assigns it to the FunnelStage field.
func (o *Predictions) SetFunnelStage(v PredictionsFunnelStage) {
	o.FunnelStage = &v
}

// GetOrderValue returns the OrderValue field value if set, zero value otherwise.
func (o *Predictions) GetOrderValue() PredictionsOrderValue {
	if o == nil || o.OrderValue == nil {
		var ret PredictionsOrderValue
		return ret
	}
	return *o.OrderValue
}

// GetOrderValueOk returns a tuple with the OrderValue field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Predictions) GetOrderValueOk() (*PredictionsOrderValue, bool) {
	if o == nil || o.OrderValue == nil {
		return nil, false
	}
	return o.OrderValue, true
}

// HasOrderValue returns a boolean if a field has been set.
func (o *Predictions) HasOrderValue() bool {
	if o != nil && o.OrderValue != nil {
		return true
	}

	return false
}

// SetOrderValue gets a reference to the given PredictionsOrderValue and assigns it to the OrderValue field.
func (o *Predictions) SetOrderValue(v PredictionsOrderValue) {
	o.OrderValue = &v
}

// GetAffinities returns the Affinities field value if set, zero value otherwise.
func (o *Predictions) GetAffinities() PredictionsAffinities {
	if o == nil || o.Affinities == nil {
		var ret PredictionsAffinities
		return ret
	}
	return *o.Affinities
}

// GetAffinitiesOk returns a tuple with the Affinities field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Predictions) GetAffinitiesOk() (*PredictionsAffinities, bool) {
	if o == nil || o.Affinities == nil {
		return nil, false
	}
	return o.Affinities, true
}

// HasAffinities returns a boolean if a field has been set.
func (o *Predictions) HasAffinities() bool {
	if o != nil && o.Affinities != nil {
		return true
	}

	return false
}

// SetAffinities gets a reference to the given PredictionsAffinities and assigns it to the Affinities field.
func (o *Predictions) SetAffinities(v PredictionsAffinities) {
	o.Affinities = &v
}

func (o Predictions) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if o.FunnelStage != nil {
		toSerialize["funnel_stage"] = o.FunnelStage
	}
	if o.OrderValue != nil {
		toSerialize["order_value"] = o.OrderValue
	}
	if o.Affinities != nil {
		toSerialize["affinities"] = o.Affinities
	}
	return json.Marshal(toSerialize)
}

func (o Predictions) String() string {
	out := "Predictions {\n"
	out += fmt.Sprintf("  funnel_stage=%v\n", o.FunnelStage)
	out += fmt.Sprintf("  order_value=%v\n", o.OrderValue)
	out += fmt.Sprintf("  affinities=%v\n", o.Affinities)
	out += "}"
	return out
}

type NullablePredictions struct {
	value *Predictions
	isSet bool
}

func (v NullablePredictions) Get() *Predictions {
	return v.value
}

func (v *NullablePredictions) Set(val *Predictions) {
	v.value = val
	v.isSet = true
}

func (v NullablePredictions) IsSet() bool {
	return v.isSet
}

func (v *NullablePredictions) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePredictions(val *Predictions) *NullablePredictions {
	return &NullablePredictions{value: val, isSet: true}
}

func (v NullablePredictions) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePredictions) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}