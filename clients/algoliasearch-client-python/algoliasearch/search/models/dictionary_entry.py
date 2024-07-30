# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""

from __future__ import annotations

from json import loads
from typing import Any, ClassVar, Dict, List, Optional, Self

from pydantic import BaseModel, ConfigDict, Field, StrictStr

from algoliasearch.search.models.dictionary_entry_state import DictionaryEntryState
from algoliasearch.search.models.supported_language import SupportedLanguage


class DictionaryEntry(BaseModel):
    """
    Dictionary entry.
    """

    object_id: StrictStr = Field(
        description="Unique identifier for the dictionary entry.", alias="objectID"
    )
    language: Optional[SupportedLanguage] = None
    word: Optional[StrictStr] = Field(
        default=None,
        description="Matching dictionary word for `stopwords` and `compounds` dictionaries.",
    )
    words: Optional[List[StrictStr]] = Field(
        default=None,
        description="Matching words in the `plurals` dictionary including declensions.",
    )
    decomposition: Optional[List[StrictStr]] = Field(
        default=None,
        description="Invividual components of a compound word in the `compounds` dictionary.",
    )
    state: Optional[DictionaryEntryState] = None
    additional_properties: Dict[str, Any] = {}
    __properties: ClassVar[List[str]] = [
        "objectID",
        "language",
        "word",
        "words",
        "decomposition",
        "state",
    ]

    model_config = ConfigDict(
        use_enum_values=True, populate_by_name=True, validate_assignment=True
    )

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of DictionaryEntry from a JSON string"""
        return cls.from_dict(loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * Fields in `self.additional_properties` are added to the output dict.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={
                "additional_properties",
            },
            exclude_none=True,
        )
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of DictionaryEntry from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "objectID": obj.get("objectID"),
                "language": obj.get("language"),
                "word": obj.get("word"),
                "words": obj.get("words"),
                "decomposition": obj.get("decomposition"),
                "state": obj.get("state"),
            }
        )
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj
