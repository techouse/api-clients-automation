# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""

from __future__ import annotations

from json import loads
from sys import version_info
from typing import Any, Dict, List, Optional

from pydantic import BaseModel, ConfigDict

if version_info >= (3, 11):
    from typing import Self
else:
    from typing_extensions import Self


from algoliasearch.query_suggestions.models.languages import Languages
from algoliasearch.query_suggestions.models.source_index import SourceIndex

_ALIASES = {
    "app_id": "appID",
    "index_name": "indexName",
    "source_indices": "sourceIndices",
    "languages": "languages",
    "exclude": "exclude",
    "enable_personalization": "enablePersonalization",
    "allow_special_characters": "allowSpecialCharacters",
}


def _alias_generator(name: str) -> str:
    return _ALIASES.get(name, name)


class ConfigurationResponse(BaseModel):
    """
    API response for retrieving Query Suggestions configurations.
    """

    app_id: str
    """ Algolia application ID to which this Query Suggestions configuration belongs. """
    index_name: str
    """ Name of the Query Suggestions index (case-sensitive). """
    source_indices: List[SourceIndex]
    """ Algolia indices from which to get the popular searches for query suggestions. """
    languages: Languages
    exclude: List[str]
    enable_personalization: bool
    """ Whether to turn on personalized query suggestions. """
    allow_special_characters: bool
    """ Whether to include suggestions with special characters. """

    model_config = ConfigDict(
        use_enum_values=True,
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
        alias_generator=_alias_generator,
    )

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ConfigurationResponse from a JSON string"""
        return cls.from_dict(loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias."""
        return self.model_dump(
            by_alias=True,
            exclude_none=True,
            exclude_unset=True,
        )

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ConfigurationResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        obj["sourceIndices"] = (
            [SourceIndex.from_dict(_item) for _item in obj["sourceIndices"]]
            if obj.get("sourceIndices") is not None
            else None
        )
        obj["languages"] = (
            Languages.from_dict(obj["languages"])
            if obj.get("languages") is not None
            else None
        )

        return cls.model_validate(obj)
