# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from enum import Enum
from json import loads

try:
    from typing import Self
except ImportError:
    from typing_extensions import Self


class SearchStrategy(str, Enum):
    """
    - `none`: executes all queries. - `stopIfEnoughMatches`: executes queries one by one, stopping further query execution as soon as a query matches at least the `hitsPerPage` number of results.
    """

    """
    allowed enum values
    """
    NONE = "none"
    STOPIFENOUGHMATCHES = "stopIfEnoughMatches"

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of SearchStrategy from a JSON string"""
        return cls(loads(json_str))
