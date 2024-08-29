# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""

from __future__ import annotations

from enum import Enum
from json import loads
from sys import version_info

if version_info >= (3, 11):
    from typing import Self
else:
    from typing_extensions import Self


class SupportedLanguage(str, Enum):
    """
    ISO code for a supported language.
    """

    """
    allowed enum values
    """
    AF = "af"
    AR = "ar"
    AZ = "az"
    BG = "bg"
    BN = "bn"
    CA = "ca"
    CS = "cs"
    CY = "cy"
    DA = "da"
    DE = "de"
    EL = "el"
    EN = "en"
    EO = "eo"
    ES = "es"
    ET = "et"
    EU = "eu"
    FA = "fa"
    FI = "fi"
    FO = "fo"
    FR = "fr"
    GA = "ga"
    GL = "gl"
    HE = "he"
    HI = "hi"
    HU = "hu"
    HY = "hy"
    ID = "id"
    IS = "is"
    IT = "it"
    JA = "ja"
    KA = "ka"
    KK = "kk"
    KO = "ko"
    KU = "ku"
    KY = "ky"
    LT = "lt"
    LV = "lv"
    MI = "mi"
    MN = "mn"
    MR = "mr"
    MS = "ms"
    MT = "mt"
    NB = "nb"
    NL = "nl"
    NO = "no"
    NS = "ns"
    PL = "pl"
    PS = "ps"
    PT = "pt"
    PT_MINUS_BR = "pt-br"
    QU = "qu"
    RO = "ro"
    RU = "ru"
    SK = "sk"
    SQ = "sq"
    SV = "sv"
    SW = "sw"
    TA = "ta"
    TE = "te"
    TH = "th"
    TL = "tl"
    TN = "tn"
    TR = "tr"
    TT = "tt"
    UK = "uk"
    UR = "ur"
    UZ = "uz"
    ZH = "zh"

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of SupportedLanguage from a JSON string"""
        return cls(loads(json_str))
