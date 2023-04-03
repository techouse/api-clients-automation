// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package recommend

import (
	"encoding/json"
	"fmt"
)

// MatchLevel Indicates how well the attribute matched the search query.
type MatchLevel string

// List of matchLevel
const (
	MATCHLEVEL_NONE    MatchLevel = "none"
	MATCHLEVEL_PARTIAL MatchLevel = "partial"
	MATCHLEVEL_FULL    MatchLevel = "full"
)

// All allowed values of MatchLevel enum
var AllowedMatchLevelEnumValues = []MatchLevel{
	"none",
	"partial",
	"full",
}

func (v *MatchLevel) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := MatchLevel(value)
	for _, existing := range AllowedMatchLevelEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid MatchLevel", value)
}

// NewMatchLevelFromValue returns a pointer to a valid MatchLevel
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewMatchLevelFromValue(v string) (*MatchLevel, error) {
	ev := MatchLevel(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for MatchLevel: valid values are %v", v, AllowedMatchLevelEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v MatchLevel) IsValid() bool {
	for _, existing := range AllowedMatchLevelEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to matchLevel value
func (v MatchLevel) Ptr() *MatchLevel {
	return &v
}

type NullableMatchLevel struct {
	value *MatchLevel
	isSet bool
}

func (v NullableMatchLevel) Get() *MatchLevel {
	return v.value
}

func (v *NullableMatchLevel) Set(val *MatchLevel) {
	v.value = val
	v.isSet = true
}

func (v NullableMatchLevel) IsSet() bool {
	return v.isSet
}

func (v *NullableMatchLevel) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMatchLevel(val *MatchLevel) *NullableMatchLevel {
	return &NullableMatchLevel{value: val, isSet: true}
}

func (v NullableMatchLevel) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMatchLevel) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}