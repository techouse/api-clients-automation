// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package recommend

import (
	"encoding/json"
	"fmt"
)

// BannerImageUrl url for a search banner image.
type BannerImageUrl struct {
	Url *string `json:"url,omitempty"`
}

type BannerImageUrlOption func(f *BannerImageUrl)

func WithBannerImageUrlUrl(val string) BannerImageUrlOption {
	return func(f *BannerImageUrl) {
		f.Url = &val
	}
}

// NewBannerImageUrl instantiates a new BannerImageUrl object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewBannerImageUrl(opts ...BannerImageUrlOption) *BannerImageUrl {
	this := &BannerImageUrl{}
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewEmptyBannerImageUrl return a pointer to an empty BannerImageUrl object.
func NewEmptyBannerImageUrl() *BannerImageUrl {
	return &BannerImageUrl{}
}

// GetUrl returns the Url field value if set, zero value otherwise.
func (o *BannerImageUrl) GetUrl() string {
	if o == nil || o.Url == nil {
		var ret string
		return ret
	}
	return *o.Url
}

// GetUrlOk returns a tuple with the Url field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BannerImageUrl) GetUrlOk() (*string, bool) {
	if o == nil || o.Url == nil {
		return nil, false
	}
	return o.Url, true
}

// HasUrl returns a boolean if a field has been set.
func (o *BannerImageUrl) HasUrl() bool {
	if o != nil && o.Url != nil {
		return true
	}

	return false
}

// SetUrl gets a reference to the given string and assigns it to the Url field.
func (o *BannerImageUrl) SetUrl(v string) *BannerImageUrl {
	o.Url = &v
	return o
}

func (o BannerImageUrl) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if o.Url != nil {
		toSerialize["url"] = o.Url
	}
	serialized, err := json.Marshal(toSerialize)
	if err != nil {
		return nil, fmt.Errorf("failed to marshal BannerImageUrl: %w", err)
	}

	return serialized, nil
}

func (o BannerImageUrl) String() string {
	out := ""
	out += fmt.Sprintf("  url=%v\n", o.Url)
	return fmt.Sprintf("BannerImageUrl {\n%s}", out)
}
