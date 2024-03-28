// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package ingestion

import (
	"encoding/json"
	"fmt"
)

// MappingFormatSchema Mapping format schema.
type MappingFormatSchema string

// List of MappingFormatSchema.
const (
	MAPPINGFORMATSCHEMA_MAPPINGKIT_V1 MappingFormatSchema = "mappingkit/v1"
)

// All allowed values of MappingFormatSchema enum.
var AllowedMappingFormatSchemaEnumValues = []MappingFormatSchema{
	"mappingkit/v1",
}

func (v *MappingFormatSchema) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return fmt.Errorf("failed to unmarshal value '%s' for enum 'MappingFormatSchema': %w", string(src), err)
	}
	enumTypeValue := MappingFormatSchema(value)
	for _, existing := range AllowedMappingFormatSchemaEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid MappingFormatSchema", value)
}

// NewMappingFormatSchemaFromValue returns a pointer to a valid MappingFormatSchema
// for the value passed as argument, or an error if the value passed is not allowed by the enum.
func NewMappingFormatSchemaFromValue(v string) (*MappingFormatSchema, error) {
	ev := MappingFormatSchema(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for MappingFormatSchema: valid values are %v", v, AllowedMappingFormatSchemaEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise.
func (v MappingFormatSchema) IsValid() bool {
	for _, existing := range AllowedMappingFormatSchemaEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to MappingFormatSchema value.
func (v MappingFormatSchema) Ptr() *MappingFormatSchema {
	return &v
}

type NullableMappingFormatSchema struct {
	value *MappingFormatSchema
	isSet bool
}

func (v NullableMappingFormatSchema) Get() *MappingFormatSchema {
	return v.value
}

func (v *NullableMappingFormatSchema) Set(val *MappingFormatSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableMappingFormatSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableMappingFormatSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMappingFormatSchema(val *MappingFormatSchema) *NullableMappingFormatSchema {
	return &NullableMappingFormatSchema{value: val, isSet: true}
}

func (v NullableMappingFormatSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value) //nolint:wrapcheck
}

func (v *NullableMappingFormatSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value) //nolint:wrapcheck
}