// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package search

import (
	"encoding/json"
	"fmt"
)

// BatchResponse struct for BatchResponse
type BatchResponse struct {
	// taskID of the task to wait for.
	TaskID int64 `json:"taskID"`
	// List of objectID.
	ObjectIDs []string `json:"objectIDs"`
}

// NewBatchResponse instantiates a new BatchResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBatchResponse(taskID int64, objectIDs []string) *BatchResponse {
	this := &BatchResponse{}
	this.TaskID = taskID
	this.ObjectIDs = objectIDs
	return this
}

// NewBatchResponseWithDefaults instantiates a new BatchResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBatchResponseWithDefaults() *BatchResponse {
	this := &BatchResponse{}
	return this
}

// GetTaskID returns the TaskID field value
func (o *BatchResponse) GetTaskID() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.TaskID
}

// GetTaskIDOk returns a tuple with the TaskID field value
// and a boolean to check if the value has been set.
func (o *BatchResponse) GetTaskIDOk() (*int64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TaskID, true
}

// SetTaskID sets field value
func (o *BatchResponse) SetTaskID(v int64) {
	o.TaskID = v
}

// GetObjectIDs returns the ObjectIDs field value
func (o *BatchResponse) GetObjectIDs() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.ObjectIDs
}

// GetObjectIDsOk returns a tuple with the ObjectIDs field value
// and a boolean to check if the value has been set.
func (o *BatchResponse) GetObjectIDsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ObjectIDs, true
}

// SetObjectIDs sets field value
func (o *BatchResponse) SetObjectIDs(v []string) {
	o.ObjectIDs = v
}

func (o BatchResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["taskID"] = o.TaskID
	}
	if true {
		toSerialize["objectIDs"] = o.ObjectIDs
	}
	return json.Marshal(toSerialize)
}

func (o BatchResponse) String() string {
	out := "BatchResponse {\n"
	out += fmt.Sprintf("  taskID=%v\n", o.TaskID)
	out += fmt.Sprintf("  objectIDs=%v\n", o.ObjectIDs)
	out += "}"
	return out
}

type NullableBatchResponse struct {
	value *BatchResponse
	isSet bool
}

func (v NullableBatchResponse) Get() *BatchResponse {
	return v.value
}

func (v *NullableBatchResponse) Set(val *BatchResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableBatchResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableBatchResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBatchResponse(val *BatchResponse) *NullableBatchResponse {
	return &NullableBatchResponse{value: val, isSet: true}
}

func (v NullableBatchResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBatchResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}