// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package suggestions

import (
	"encoding/json"
	"fmt"
)

// Languages - Languages for deduplicating singular and plural suggestions. If specified, only the more popular form is included.
type Languages struct {
	ArrayOfString *[]string
	Bool          *bool
}

// []stringAsLanguages is a convenience function that returns []string wrapped in Languages.
func ArrayOfStringAsLanguages(v []string) *Languages {
	return &Languages{
		ArrayOfString: &v,
	}
}

// boolAsLanguages is a convenience function that returns bool wrapped in Languages.
func BoolAsLanguages(v bool) *Languages {
	return &Languages{
		Bool: &v,
	}
}

// Unmarshal JSON data into one of the pointers in the struct.
func (dst *Languages) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal data into ArrayOfString
	err = newStrictDecoder(data).Decode(&dst.ArrayOfString)
	if err == nil && validateStruct(dst.ArrayOfString) == nil {
		return nil // found the correct type
	} else {
		dst.ArrayOfString = nil
	}
	// try to unmarshal data into Bool
	err = newStrictDecoder(data).Decode(&dst.Bool)
	if err == nil && validateStruct(dst.Bool) == nil {
		return nil // found the correct type
	} else {
		dst.Bool = nil
	}

	return fmt.Errorf("Data failed to match schemas in oneOf(Languages)")
}

// Marshal data from the first non-nil pointers in the struct to JSON.
func (src Languages) MarshalJSON() ([]byte, error) {
	if src.ArrayOfString != nil {
		serialized, err := json.Marshal(&src.ArrayOfString)
		if err != nil {
			return nil, fmt.Errorf("failed to unmarshal one of ArrayOfString of Languages: %w", err)
		}

		return serialized, nil
	}

	if src.Bool != nil {
		serialized, err := json.Marshal(&src.Bool)
		if err != nil {
			return nil, fmt.Errorf("failed to unmarshal one of Bool of Languages: %w", err)
		}

		return serialized, nil
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance.
func (obj Languages) GetActualInstance() any {
	if obj.ArrayOfString != nil {
		return *obj.ArrayOfString
	}

	if obj.Bool != nil {
		return *obj.Bool
	}

	// all schemas are nil
	return nil
}
