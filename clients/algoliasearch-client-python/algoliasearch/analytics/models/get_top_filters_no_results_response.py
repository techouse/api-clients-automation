# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from json import loads
from typing import Any, ClassVar, Dict, List

from pydantic import BaseModel, Field

from algoliasearch.analytics.models.get_top_filters_no_results_values import (
    GetTopFiltersNoResultsValues,
)

try:
    from typing import Self
except ImportError:
    from typing_extensions import Self


class GetTopFiltersNoResultsResponse(BaseModel):
    """
    GetTopFiltersNoResultsResponse
    """

    values: List[GetTopFiltersNoResultsValues] = Field(
        description="Filters with no results."
    )
    __properties: ClassVar[List[str]] = ["values"]

    model_config = {"populate_by_name": True, "validate_assignment": True}

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of GetTopFiltersNoResultsResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of
        # each item in values (list)
        _items = []
        if self.values:
            for _item in self.values:
                if _item:
                    _items.append(_item.to_dict())
            _dict["values"] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of GetTopFiltersNoResultsResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "values": [
                    GetTopFiltersNoResultsValues.from_dict(_item)
                    for _item in obj.get("values")
                ]
                if obj.get("values") is not None
                else None
            }
        )
        return _obj
