# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from json import loads
from typing import Annotated, Any, ClassVar, Dict, List, Optional

from pydantic import BaseModel, Field, StrictStr

try:
    from typing import Self
except ImportError:
    from typing_extensions import Self


class SearchForFacetValuesRequest(BaseModel):
    """
    SearchForFacetValuesRequest
    """

    params: Optional[StrictStr] = Field(
        default="", description="Search parameters as a URL-encoded query string."
    )
    facet_query: Optional[StrictStr] = Field(
        default="",
        description="Text to search inside the facet's values.",
        alias="facetQuery",
    )
    max_facet_hits: Optional[Annotated[int, Field(le=100, strict=True)]] = Field(
        default=10,
        description="Maximum number of facet hits to return when [searching for facet values](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#search-for-facet-values).",
        alias="maxFacetHits",
    )
    __properties: ClassVar[List[str]] = ["params", "facetQuery", "maxFacetHits"]

    model_config = {"populate_by_name": True, "validate_assignment": True}

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of SearchForFacetValuesRequest from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of SearchForFacetValuesRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "params": obj.get("params") if obj.get("params") is not None else "",
                "facetQuery": obj.get("facetQuery")
                if obj.get("facetQuery") is not None
                else "",
                "maxFacetHits": obj.get("maxFacetHits")
                if obj.get("maxFacetHits") is not None
                else 10,
            }
        )
        return _obj
