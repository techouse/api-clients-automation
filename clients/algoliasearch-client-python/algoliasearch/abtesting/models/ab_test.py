# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""

from __future__ import annotations

from json import loads
from sys import version_info
from typing import Any, Dict, List, Optional, Union

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr

if version_info >= (3, 11):
    from typing import Self
else:
    from typing_extensions import Self


from algoliasearch.abtesting.models.ab_test_configuration import ABTestConfiguration
from algoliasearch.abtesting.models.status import Status
from algoliasearch.abtesting.models.variant import Variant


class ABTest(BaseModel):
    """
    ABTest
    """

    ab_test_id: StrictInt = Field(
        description="Unique A/B test identifier.", alias="abTestID"
    )
    click_significance: Optional[Union[StrictFloat, StrictInt]] = Field(
        default=None, alias="clickSignificance"
    )
    conversion_significance: Optional[Union[StrictFloat, StrictInt]] = Field(
        default=None, alias="conversionSignificance"
    )
    add_to_cart_significance: Optional[Union[StrictFloat, StrictInt]] = Field(
        default=None, alias="addToCartSignificance"
    )
    purchase_significance: Optional[Union[StrictFloat, StrictInt]] = Field(
        default=None, alias="purchaseSignificance"
    )
    revenue_significance: Optional[Dict[str, Union[StrictFloat, StrictInt]]] = Field(
        default=None, alias="revenueSignificance"
    )
    updated_at: StrictStr = Field(
        description="Date and time when the A/B test was last updated, in RFC 3339 format.",
        alias="updatedAt",
    )
    created_at: StrictStr = Field(
        description="Date and time when the A/B test was created, in RFC 3339 format.",
        alias="createdAt",
    )
    end_at: StrictStr = Field(
        description="End date and time of the A/B test, in RFC 3339 format.",
        alias="endAt",
    )
    name: StrictStr = Field(description="A/B test name.")
    status: Status
    variants: List[Variant] = Field(
        description="A/B test variants.  The first variant is your _control_ index, typically your production index. The second variant is an index with changed settings that you want to test against the control. "
    )
    configuration: Optional[ABTestConfiguration] = None

    model_config = ConfigDict(
        use_enum_values=True, populate_by_name=True, validate_assignment=True
    )

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of ABTest from a JSON string"""
        return cls.from_dict(loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={},
            exclude_none=True,
        )
        _items = []
        if self.variants:
            for _item in self.variants:
                if _item:
                    _items.append(_item.to_dict())
            _dict["variants"] = _items
        if self.configuration:
            _dict["configuration"] = self.configuration.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of ABTest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "abTestID": obj.get("abTestID"),
                "clickSignificance": obj.get("clickSignificance"),
                "conversionSignificance": obj.get("conversionSignificance"),
                "addToCartSignificance": obj.get("addToCartSignificance"),
                "purchaseSignificance": obj.get("purchaseSignificance"),
                "revenueSignificance": obj.get("revenueSignificance"),
                "updatedAt": obj.get("updatedAt"),
                "createdAt": obj.get("createdAt"),
                "endAt": obj.get("endAt"),
                "name": obj.get("name"),
                "status": obj.get("status"),
                "variants": (
                    [Variant.from_dict(_item) for _item in obj.get("variants")]
                    if obj.get("variants") is not None
                    else None
                ),
                "configuration": (
                    ABTestConfiguration.from_dict(obj.get("configuration"))
                    if obj.get("configuration") is not None
                    else None
                ),
            }
        )
        return _obj
