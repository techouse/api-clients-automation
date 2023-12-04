# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

import json
import pprint
from typing import Any, ClassVar, Dict, List

from pydantic import BaseModel, Field

from algoliasearch.analytics.models.search_no_click_event import SearchNoClickEvent

try:
    from typing import Self
except ImportError:
    from typing_extensions import Self


class GetSearchesNoClicksResponse(BaseModel):
    """
    GetSearchesNoClicksResponse
    """

    searches: List[SearchNoClickEvent] = Field(description="Searches with no clicks.")
    __properties: ClassVar[List[str]] = ["searches"]

    model_config = {"populate_by_name": True, "validate_assignment": True}

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True,
        # exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of GetSearchesNoClicksResponse from a JSON string"""
        return cls.from_dict(json.loads(json_str))

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
        # each item in searches (list)
        _items = []
        if self.searches:
            for _item in self.searches:
                if _item:
                    _items.append(_item.to_dict())
            _dict["searches"] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of GetSearchesNoClicksResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "searches": [
                    SearchNoClickEvent.from_dict(_item) for _item in obj.get("searches")
                ]
                if obj.get("searches") is not None
                else None
            }
        )
        return _obj