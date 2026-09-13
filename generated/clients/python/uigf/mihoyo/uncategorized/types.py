# coding=utf-8

from typing import Union
from typing_extensions import Required, TypedDict


class ComboTokenRequest(TypedDict, total=False):
    """ComboTokenRequest.

    :ivar biz: Required.
    :vartype biz: str
    """

    biz: Required[str]
    """Required."""


class ExperimentListRequest(TypedDict, total=False):
    """ExperimentListRequest.

    :ivar app_id: Required. Is either a str type or a int type.
    :vartype app_id: Union[str, int]
    :ivar app_sign: Required.
    :vartype app_sign: str
    :ivar experiment_id:
    :vartype experiment_id: str
    :ivar params: Required.
    :vartype params: list["ExperimentParameter"]
    :ivar scene_id:
    :vartype scene_id: str
    :ivar uid: Required.
    :vartype uid: str
    """

    app_id: Required[Union[str, int]]
    """Required. Is either a str type or a int type."""
    app_sign: Required[str]
    """Required."""
    experiment_id: str
    params: Required[list["ExperimentParameter"]]
    """Required."""
    scene_id: str
    uid: Required[str]
    """Required."""


class ExperimentParameter(TypedDict, total=False):
    """ExperimentParameter.

    :ivar k: Required.
    :vartype k: str
    :ivar v: Required.
    :vartype v: str
    """

    k: Required[str]
    """Required."""
    v: Required[str]
    """Required."""


class H5LogRequest(TypedDict, total=False):
    """H5LogRequest.

    :ivar data: Required.
    :vartype data: str
    """

    data: Required[str]
    """Required."""
