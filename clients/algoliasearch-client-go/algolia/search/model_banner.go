// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
package search

import (
	"encoding/json"
	"fmt"
)

// Banner a search banner with image and url.
type Banner struct {
	Image *BannerImage `json:"image,omitempty"`
	Link  *BannerLink  `json:"link,omitempty"`
}

type BannerOption func(f *Banner)

func WithBannerImage(val BannerImage) BannerOption {
	return func(f *Banner) {
		f.Image = &val
	}
}

func WithBannerLink(val BannerLink) BannerOption {
	return func(f *Banner) {
		f.Link = &val
	}
}

// NewBanner instantiates a new Banner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewBanner(opts ...BannerOption) *Banner {
	this := &Banner{}
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewEmptyBanner return a pointer to an empty Banner object.
func NewEmptyBanner() *Banner {
	return &Banner{}
}

// GetImage returns the Image field value if set, zero value otherwise.
func (o *Banner) GetImage() BannerImage {
	if o == nil || o.Image == nil {
		var ret BannerImage
		return ret
	}
	return *o.Image
}

// GetImageOk returns a tuple with the Image field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Banner) GetImageOk() (*BannerImage, bool) {
	if o == nil || o.Image == nil {
		return nil, false
	}
	return o.Image, true
}

// HasImage returns a boolean if a field has been set.
func (o *Banner) HasImage() bool {
	if o != nil && o.Image != nil {
		return true
	}

	return false
}

// SetImage gets a reference to the given BannerImage and assigns it to the Image field.
func (o *Banner) SetImage(v *BannerImage) *Banner {
	o.Image = v
	return o
}

// GetLink returns the Link field value if set, zero value otherwise.
func (o *Banner) GetLink() BannerLink {
	if o == nil || o.Link == nil {
		var ret BannerLink
		return ret
	}
	return *o.Link
}

// GetLinkOk returns a tuple with the Link field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Banner) GetLinkOk() (*BannerLink, bool) {
	if o == nil || o.Link == nil {
		return nil, false
	}
	return o.Link, true
}

// HasLink returns a boolean if a field has been set.
func (o *Banner) HasLink() bool {
	if o != nil && o.Link != nil {
		return true
	}

	return false
}

// SetLink gets a reference to the given BannerLink and assigns it to the Link field.
func (o *Banner) SetLink(v *BannerLink) *Banner {
	o.Link = v
	return o
}

func (o Banner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if o.Image != nil {
		toSerialize["image"] = o.Image
	}
	if o.Link != nil {
		toSerialize["link"] = o.Link
	}
	serialized, err := json.Marshal(toSerialize)
	if err != nil {
		return nil, fmt.Errorf("failed to marshal Banner: %w", err)
	}

	return serialized, nil
}

func (o Banner) String() string {
	out := ""
	out += fmt.Sprintf("  image=%v\n", o.Image)
	out += fmt.Sprintf("  link=%v\n", o.Link)
	return fmt.Sprintf("Banner {\n%s}", out)
}
