# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""

from __future__ import annotations

from json import loads
from sys import version_info
from typing import Any, Dict, Optional

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr

if version_info >= (3, 11):
    from typing import Self
else:
    from typing_extensions import Self


from algoliasearch.recommend.models.condition import Condition
from algoliasearch.recommend.models.consequence import Consequence
from algoliasearch.recommend.models.rule_metadata import RuleMetadata


class RecommendRule(BaseModel):
    """
    Recommend rule.
    """

    metadata: Optional[RuleMetadata] = Field(default=None, alias="_metadata")
    object_id: Optional[StrictStr] = Field(
        default=None,
        description="Unique identifier of a rule object.",
        alias="objectID",
    )
    condition: Optional[Condition] = None
    consequence: Optional[Consequence] = None
    description: Optional[StrictStr] = Field(
        default=None,
        description="Description of the rule's purpose. This can be helpful for display in the Algolia dashboard.",
    )
    enabled: Optional[StrictBool] = Field(
        default=True,
        description="Indicates whether to enable the rule. If it isn't enabled, it isn't applied at query time.",
    )

    model_config = ConfigDict(
        use_enum_values=True, populate_by_name=True, validate_assignment=True
    )

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of RecommendRule from a JSON string"""
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
        if self.metadata:
            _dict["_metadata"] = self.metadata.to_dict()
        if self.condition:
            _dict["condition"] = self.condition.to_dict()
        if self.consequence:
            _dict["consequence"] = self.consequence.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of RecommendRule from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "_metadata": (
                    RuleMetadata.from_dict(obj.get("_metadata"))
                    if obj.get("_metadata") is not None
                    else None
                ),
                "objectID": obj.get("objectID"),
                "condition": (
                    Condition.from_dict(obj.get("condition"))
                    if obj.get("condition") is not None
                    else None
                ),
                "consequence": (
                    Consequence.from_dict(obj.get("consequence"))
                    if obj.get("consequence") is not None
                    else None
                ),
                "description": obj.get("description"),
                "enabled": obj.get("enabled"),
            }
        )
        return _obj
