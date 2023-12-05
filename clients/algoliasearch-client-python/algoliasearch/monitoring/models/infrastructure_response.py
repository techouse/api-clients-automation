# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from json import loads
from typing import Any, ClassVar, Dict, List, Optional

from pydantic import BaseModel

from algoliasearch.monitoring.models.infrastructure_response_metrics import (
    InfrastructureResponseMetrics,
)

try:
    from typing import Self
except ImportError:
    from typing_extensions import Self


class InfrastructureResponse(BaseModel):
    """
    InfrastructureResponse
    """

    metrics: Optional[InfrastructureResponseMetrics] = None
    __properties: ClassVar[List[str]] = ["metrics"]

    model_config = {"populate_by_name": True, "validate_assignment": True}

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of InfrastructureResponse from a JSON string"""
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
        # metrics
        if self.metrics:
            _dict["metrics"] = self.metrics.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of InfrastructureResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "metrics": InfrastructureResponseMetrics.from_dict(obj.get("metrics"))
                if obj.get("metrics") is not None
                else None
            }
        )
        return _obj
