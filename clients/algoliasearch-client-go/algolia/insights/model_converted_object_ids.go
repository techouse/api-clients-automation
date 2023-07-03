// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package insights

import (
	"encoding/json"
	"fmt"
)

// ConvertedObjectIDs Use this event to track when users convert on items unrelated to a previous Algolia request. For example, if you don't use Algolia to build your category pages, use this event.  To track conversion events related to Algolia requests, use the \"Converted object IDs after search\" event.
type ConvertedObjectIDs struct {
	// Can contain up to 64 ASCII characters.   Consider naming events consistently—for example, by adopting Segment's [object-action](https://segment.com/academy/collecting-data/naming-conventions-for-clean-data/#the-object-action-framework) framework.
	EventName string          `json:"eventName" validate:"required"`
	EventType ConversionEvent `json:"eventType" validate:"required"`
	// Name of the Algolia index.
	Index string `json:"index" validate:"required"`
	// List of object identifiers for items of an Algolia index.
	ObjectIDs []string `json:"objectIDs" validate:"required"`
	// Anonymous or pseudonymous user identifier.   > **Note**: Never include personally identifiable information in user tokens.
	UserToken string `json:"userToken" validate:"required"`
	// Time of the event in milliseconds in [Unix epoch time](https://wikipedia.org/wiki/Unix_time). By default, the Insights API uses the time it receives an event as its timestamp.
	Timestamp *int64 `json:"timestamp,omitempty"`
}

type ConvertedObjectIDsOption func(f *ConvertedObjectIDs)

func WithConvertedObjectIDsTimestamp(val int64) ConvertedObjectIDsOption {
	return func(f *ConvertedObjectIDs) {
		f.Timestamp = &val
	}
}

// NewConvertedObjectIDs instantiates a new ConvertedObjectIDs object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConvertedObjectIDs(eventName string, eventType ConversionEvent, index string, objectIDs []string, userToken string, opts ...ConvertedObjectIDsOption) *ConvertedObjectIDs {
	this := &ConvertedObjectIDs{}
	this.EventName = eventName
	this.EventType = eventType
	this.Index = index
	this.ObjectIDs = objectIDs
	this.UserToken = userToken
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewConvertedObjectIDsWithDefaults instantiates a new ConvertedObjectIDs object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConvertedObjectIDsWithDefaults() *ConvertedObjectIDs {
	this := &ConvertedObjectIDs{}
	return this
}

// GetEventName returns the EventName field value
func (o *ConvertedObjectIDs) GetEventName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.EventName
}

// GetEventNameOk returns a tuple with the EventName field value
// and a boolean to check if the value has been set.
func (o *ConvertedObjectIDs) GetEventNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.EventName, true
}

// SetEventName sets field value
func (o *ConvertedObjectIDs) SetEventName(v string) {
	o.EventName = v
}

// GetEventType returns the EventType field value
func (o *ConvertedObjectIDs) GetEventType() ConversionEvent {
	if o == nil {
		var ret ConversionEvent
		return ret
	}

	return o.EventType
}

// GetEventTypeOk returns a tuple with the EventType field value
// and a boolean to check if the value has been set.
func (o *ConvertedObjectIDs) GetEventTypeOk() (*ConversionEvent, bool) {
	if o == nil {
		return nil, false
	}
	return &o.EventType, true
}

// SetEventType sets field value
func (o *ConvertedObjectIDs) SetEventType(v ConversionEvent) {
	o.EventType = v
}

// GetIndex returns the Index field value
func (o *ConvertedObjectIDs) GetIndex() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Index
}

// GetIndexOk returns a tuple with the Index field value
// and a boolean to check if the value has been set.
func (o *ConvertedObjectIDs) GetIndexOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Index, true
}

// SetIndex sets field value
func (o *ConvertedObjectIDs) SetIndex(v string) {
	o.Index = v
}

// GetObjectIDs returns the ObjectIDs field value
func (o *ConvertedObjectIDs) GetObjectIDs() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.ObjectIDs
}

// GetObjectIDsOk returns a tuple with the ObjectIDs field value
// and a boolean to check if the value has been set.
func (o *ConvertedObjectIDs) GetObjectIDsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ObjectIDs, true
}

// SetObjectIDs sets field value
func (o *ConvertedObjectIDs) SetObjectIDs(v []string) {
	o.ObjectIDs = v
}

// GetUserToken returns the UserToken field value
func (o *ConvertedObjectIDs) GetUserToken() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.UserToken
}

// GetUserTokenOk returns a tuple with the UserToken field value
// and a boolean to check if the value has been set.
func (o *ConvertedObjectIDs) GetUserTokenOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UserToken, true
}

// SetUserToken sets field value
func (o *ConvertedObjectIDs) SetUserToken(v string) {
	o.UserToken = v
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise.
func (o *ConvertedObjectIDs) GetTimestamp() int64 {
	if o == nil || o.Timestamp == nil {
		var ret int64
		return ret
	}
	return *o.Timestamp
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConvertedObjectIDs) GetTimestampOk() (*int64, bool) {
	if o == nil || o.Timestamp == nil {
		return nil, false
	}
	return o.Timestamp, true
}

// HasTimestamp returns a boolean if a field has been set.
func (o *ConvertedObjectIDs) HasTimestamp() bool {
	if o != nil && o.Timestamp != nil {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given int64 and assigns it to the Timestamp field.
func (o *ConvertedObjectIDs) SetTimestamp(v int64) {
	o.Timestamp = &v
}

func (o ConvertedObjectIDs) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["eventName"] = o.EventName
	}
	if true {
		toSerialize["eventType"] = o.EventType
	}
	if true {
		toSerialize["index"] = o.Index
	}
	if true {
		toSerialize["objectIDs"] = o.ObjectIDs
	}
	if true {
		toSerialize["userToken"] = o.UserToken
	}
	if o.Timestamp != nil {
		toSerialize["timestamp"] = o.Timestamp
	}
	return json.Marshal(toSerialize)
}

func (o ConvertedObjectIDs) String() string {
	out := ""
	out += fmt.Sprintf("  eventName=%v\n", o.EventName)
	out += fmt.Sprintf("  eventType=%v\n", o.EventType)
	out += fmt.Sprintf("  index=%v\n", o.Index)
	out += fmt.Sprintf("  objectIDs=%v\n", o.ObjectIDs)
	out += fmt.Sprintf("  userToken=%v\n", o.UserToken)
	out += fmt.Sprintf("  timestamp=%v\n", o.Timestamp)
	return fmt.Sprintf("ConvertedObjectIDs {\n%s}", out)
}

type NullableConvertedObjectIDs struct {
	value *ConvertedObjectIDs
	isSet bool
}

func (v NullableConvertedObjectIDs) Get() *ConvertedObjectIDs {
	return v.value
}

func (v *NullableConvertedObjectIDs) Set(val *ConvertedObjectIDs) {
	v.value = val
	v.isSet = true
}

func (v NullableConvertedObjectIDs) IsSet() bool {
	return v.isSet
}

func (v *NullableConvertedObjectIDs) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConvertedObjectIDs(val *ConvertedObjectIDs) *NullableConvertedObjectIDs {
	return &NullableConvertedObjectIDs{value: val, isSet: true}
}

func (v NullableConvertedObjectIDs) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConvertedObjectIDs) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}