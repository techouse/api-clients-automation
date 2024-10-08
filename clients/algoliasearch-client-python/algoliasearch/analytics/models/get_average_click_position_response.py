# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""

from __future__ import annotations

from json import loads
from sys import version_info
from typing import Any, Dict, List, Optional, Union

from pydantic import BaseModel, ConfigDict, Field

if version_info >= (3, 11):
    from typing import Annotated, Self
else:
    from typing_extensions import Annotated, Self


from algoliasearch.analytics.models.daily_average_clicks import DailyAverageClicks


class GetAverageClickPositionResponse(BaseModel):
    """
    GetAverageClickPositionResponse
    """

    average: Optional[
        Union[
            Annotated[float, Field(strict=True, ge=1)],
            Annotated[int, Field(strict=True, ge=1)],
        ]
    ] = Field(
        description="Average position of a clicked search result in the list of search results. If null, Algolia didn't receive any search requests with `clickAnalytics` set to true. "
    )
    click_count: Annotated[int, Field(strict=True, ge=0)] = Field(
        description="Number of clicks associated with this search.", alias="clickCount"
    )
    dates: List[DailyAverageClicks] = Field(
        description="Daily average click positions."
    )

    model_config = ConfigDict(
        use_enum_values=True, populate_by_name=True, validate_assignment=True
    )

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of GetAverageClickPositionResponse from a JSON string"""
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
        if self.dates:
            for _item in self.dates:
                if _item:
                    _items.append(_item.to_dict())
            _dict["dates"] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of GetAverageClickPositionResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "average": obj.get("average"),
                "clickCount": obj.get("clickCount"),
                "dates": (
                    [DailyAverageClicks.from_dict(_item) for _item in obj.get("dates")]
                    if obj.get("dates") is not None
                    else None
                ),
            }
        )
        return _obj
