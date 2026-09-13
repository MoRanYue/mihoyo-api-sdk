# pylint: disable=too-many-lines
# coding=utf-8
from collections.abc import MutableMapping
from io import IOBase
import json
from typing import Any, Callable, IO, Optional, TypeVar, Union, overload

from corehttp.exceptions import (
    ClientAuthenticationError,
    HttpResponseError,
    ResourceExistsError,
    ResourceNotFoundError,
    ResourceNotModifiedError,
    StreamClosedError,
    StreamConsumedError,
    map_error,
)
from corehttp.rest import HttpRequest, HttpResponse
from corehttp.runtime import PipelineClient
from corehttp.runtime.pipeline import PipelineResponse
from corehttp.utils import case_insensitive_dict

from .... import models as _models3, types as _types_models3
from ..... import models as _models4
from .....passport._utils.model_base import SdkJSONEncoder, _deserialize
from .....passport._utils.serialization import Deserializer, Serializer
from .._configuration import RecordClientConfiguration

T = TypeVar("T")
ClsType = Optional[Callable[[PipelineResponse[HttpRequest, HttpResponse], T, dict[str, Any]], Any]]
List = list

_SERIALIZER = Serializer()
_SERIALIZER.client_side_validation = False


def build_game_record_api_get_index_request(
    *,
    cookie: str,
    server: str,
    role_id: str,
    ds: Optional[str] = None,
    avatar_list_type: Optional[int] = None,
    **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/index"

    # Construct parameters
    if avatar_list_type is not None:
        _params["avatar_list_type"] = _SERIALIZER.query("avatar_list_type", avatar_list_type, "int")
    _params["server"] = _SERIALIZER.query("server", server, "str")
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_game_record_api_list_characters_request(  # pylint: disable=name-too-long
    *, cookie: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/character/list"

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    if content_type is not None:
        _headers["Content-Type"] = _SERIALIZER.header("content_type", content_type, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="POST", url=_url, headers=_headers, **kwargs)


def build_game_record_api_get_character_details_request(  # pylint: disable=name-too-long
    *, cookie: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/character/detail"

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    if content_type is not None:
        _headers["Content-Type"] = _SERIALIZER.header("content_type", content_type, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="POST", url=_url, headers=_headers, **kwargs)


def build_game_record_api_get_daily_note_request(  # pylint: disable=name-too-long
    *, cookie: str, server: str, role_id: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/dailyNote"

    # Construct parameters
    _params["server"] = _SERIALIZER.query("server", server, "str")
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_game_record_api_get_spiral_abyss_request(  # pylint: disable=name-too-long
    *,
    cookie: str,
    server: str,
    role_id: str,
    ds: Optional[str] = None,
    schedule_type: Optional[int] = None,
    need_detail: Optional[bool] = None,
    need_all: Optional[bool] = None,
    **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/spiralAbyss"

    # Construct parameters
    if schedule_type is not None:
        _params["schedule_type"] = _SERIALIZER.query("schedule_type", schedule_type, "int")
    if need_detail is not None:
        _params["need_detail"] = _SERIALIZER.query("need_detail", need_detail, "bool")
    if need_all is not None:
        _params["need_all"] = _SERIALIZER.query("need_all", need_all, "bool")
    _params["server"] = _SERIALIZER.query("server", server, "str")
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_game_record_api_get_imaginarium_theater_request(  # pylint: disable=name-too-long
    *,
    cookie: str,
    server: str,
    role_id: str,
    ds: Optional[str] = None,
    active: Optional[int] = None,
    schedule_type: Optional[int] = None,
    need_detail: Optional[bool] = None,
    need_all: Optional[bool] = None,
    **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/role_combat"

    # Construct parameters
    if active is not None:
        _params["active"] = _SERIALIZER.query("active", active, "int")
    if schedule_type is not None:
        _params["schedule_type"] = _SERIALIZER.query("schedule_type", schedule_type, "int")
    if need_detail is not None:
        _params["need_detail"] = _SERIALIZER.query("need_detail", need_detail, "bool")
    if need_all is not None:
        _params["need_all"] = _SERIALIZER.query("need_all", need_all, "bool")
    _params["server"] = _SERIALIZER.query("server", server, "str")
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_game_record_api_get_character_master_request(  # pylint: disable=name-too-long
    *, cookie: str, server: str, role_id: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/char_master"

    # Construct parameters
    _params["server"] = _SERIALIZER.query("server", server, "str")
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_game_record_api_get_stygian_onslaught_request(  # pylint: disable=name-too-long
    *,
    cookie: str,
    server: str,
    role_id: str,
    ds: Optional[str] = None,
    schedule_type: Optional[int] = None,
    need_detail: Optional[bool] = None,
    need_all: Optional[bool] = None,
    **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/hard_challenge"

    # Construct parameters
    if schedule_type is not None:
        _params["schedule_type"] = _SERIALIZER.query("schedule_type", schedule_type, "int")
    if need_detail is not None:
        _params["need_detail"] = _SERIALIZER.query("need_detail", need_detail, "bool")
    if need_all is not None:
        _params["need_all"] = _SERIALIZER.query("need_all", need_all, "bool")
    _params["server"] = _SERIALIZER.query("server", server, "str")
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_game_record_api_get_stygian_popularity_request(  # pylint: disable=name-too-long
    *, server: str, role_id: int, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/hard_challenge/popularity"

    # Construct parameters
    _params["server"] = _SERIALIZER.query("server", server, "str")
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "int")

    # Construct headers
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_game_record_api_get_activity_calendar_request(  # pylint: disable=name-too-long
    *, cookie: str, ds: Optional[str] = None, challenge: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/act_calendar"

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    if challenge is not None:
        _headers["x-rpc-challenge"] = _SERIALIZER.header("challenge", challenge, "str")
    if content_type is not None:
        _headers["Content-Type"] = _SERIALIZER.header("content_type", content_type, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="POST", url=_url, headers=_headers, **kwargs)


def build_game_record_api_get_character_tps_request(  # pylint: disable=name-too-long
    *, cookie: str, server: str, role_id: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/tps"

    # Construct parameters
    _params["server"] = _SERIALIZER.query("server", server, "str")
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_game_record_api_get_external_content_request(  # pylint: disable=name-too-long
    *, cookie: str, item_id: int, item_type: int, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/external_content"

    # Construct parameters
    _params["item_id"] = _SERIALIZER.query("item_id", item_id, "int")
    _params["item_type"] = _SERIALIZER.query("item_type", item_type, "int")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_game_record_api_get_role_basic_info_request(  # pylint: disable=name-too-long
    *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/roleBasicInfo"

    # Construct parameters
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")
    _params["server"] = _SERIALIZER.query("server", server, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_game_record_api_get_tool_request(
    *, cookie: str, ds: Optional[str] = None, challenge: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/tool"

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    if challenge is not None:
        _headers["x-rpc-challenge"] = _SERIALIZER.header("challenge", challenge, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_gcg_api_get_basic_info_request(
    *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/gcg/basicInfo"

    # Construct parameters
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")
    _params["server"] = _SERIALIZER.query("server", server, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_gcg_api_get_card_back_list_request(
    *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/gcg/cardBackList"

    # Construct parameters
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")
    _params["server"] = _SERIALIZER.query("server", server, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_gcg_api_get_card_list_request(
    *,
    cookie: str,
    limit: int,
    need_action: bool,
    need_avatar: bool,
    need_stats: bool,
    offset: int,
    role_id: str,
    server: str,
    ds: Optional[str] = None,
    **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/gcg/cardList"

    # Construct parameters
    _params["limit"] = _SERIALIZER.query("limit", limit, "int")
    _params["need_action"] = _SERIALIZER.query("need_action", need_action, "bool")
    _params["need_avatar"] = _SERIALIZER.query("need_avatar", need_avatar, "bool")
    _params["need_stats"] = _SERIALIZER.query("need_stats", need_stats, "bool")
    _params["offset"] = _SERIALIZER.query("offset", offset, "int")
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")
    _params["server"] = _SERIALIZER.query("server", server, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_gcg_api_get_challenge_record_request(  # pylint: disable=name-too-long
    *, cookie: str, schedule_id: int, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/gcg/challenge/record"

    # Construct parameters
    _params["schedule_id"] = _SERIALIZER.query("schedule_id", schedule_id, "int")
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")
    _params["server"] = _SERIALIZER.query("server", server, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_gcg_api_get_challenge_schedule_request(  # pylint: disable=name-too-long
    *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/gcg/challenge/schedule"

    # Construct parameters
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")
    _params["server"] = _SERIALIZER.query("server", server, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_gcg_api_get_deck_list_request(
    *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/gcg/deckList"

    # Construct parameters
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")
    _params["server"] = _SERIALIZER.query("server", server, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_gcg_api_get_covers_request(
    *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/gcg/getGCGCovers"

    # Construct parameters
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")
    _params["server"] = _SERIALIZER.query("server", server, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_gcg_api_get_match_list_request(
    *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/genshin/api/gcg/matchList"

    # Construct parameters
    _params["role_id"] = _SERIALIZER.query("role_id", role_id, "str")
    _params["server"] = _SERIALIZER.query("server", server, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_card_api_get_game_record_card_request(  # pylint: disable=name-too-long
    *, cookie: str, uid: str, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/game_record/app/card/wapi/getGameRecordCard"

    # Construct parameters
    _params["uid"] = _SERIALIZER.query("uid", uid, "str")

    # Construct headers
    _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


class GameRecordApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.RecordClient`'s
        :attr:`game_record_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: RecordClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_index(
        self,
        *,
        cookie: str,
        server: str,
        role_id: str,
        ds: Optional[str] = None,
        avatar_list_type: Optional[int] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseGenshinRecordIndexData:
        """get_index.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword server: Required.
        :paramtype server: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword avatar_list_type: Default value is None.
        :paramtype avatar_list_type: int
        :return: ApiResponseGenshinRecordIndexData. The ApiResponseGenshinRecordIndexData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinRecordIndexData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGenshinRecordIndexData] = kwargs.pop("cls", None)

        _request = build_game_record_api_get_index_request(
            cookie=cookie,
            server=server,
            role_id=role_id,
            ds=ds,
            avatar_list_type=avatar_list_type,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinRecordIndexData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    def list_characters(
        self,
        body: _models3.CharacterListRequest,
        *,
        cookie: str,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseCharacterList:
        """list_characters.

        :param body: Required.
        :type body: ~uigf.mihoyo.game.models.CharacterListRequest
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseCharacterList. The ApiResponseCharacterList is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseCharacterList
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def list_characters(
        self,
        body: _types_models3.CharacterListRequest,
        *,
        cookie: str,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseCharacterList:
        """list_characters.

        :param body: Required.
        :type body: ~uigf.mihoyo.game.types.CharacterListRequest
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseCharacterList. The ApiResponseCharacterList is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseCharacterList
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def list_characters(
        self,
        body: IO[bytes],
        *,
        cookie: str,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseCharacterList:
        """list_characters.

        :param body: Required.
        :type body: IO[bytes]
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseCharacterList. The ApiResponseCharacterList is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseCharacterList
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    def list_characters(
        self,
        body: Union[_models3.CharacterListRequest, _types_models3.CharacterListRequest, IO[bytes]],
        *,
        cookie: str,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseCharacterList:
        """list_characters.

        :param body: Is either a CharacterListRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.game.models.CharacterListRequest or
         ~uigf.mihoyo.game.types.CharacterListRequest or IO[bytes]
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseCharacterList. The ApiResponseCharacterList is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseCharacterList
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
        _params = kwargs.pop("params", {}) or {}

        content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
        cls: ClsType[_models4.ApiResponseCharacterList] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_game_record_api_list_characters_request(
            cookie=cookie,
            ds=ds,
            content_type=content_type,
            content=_content,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseCharacterList, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    def get_character_details(
        self,
        body: _models3.CharacterDetailRequest,
        *,
        cookie: str,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseCharacterList:
        """Character IDs should be sent in batches of at most 40, as used by TeyvatGuide.

        :param body: Required.
        :type body: ~uigf.mihoyo.game.models.CharacterDetailRequest
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseCharacterList. The ApiResponseCharacterList is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseCharacterList
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def get_character_details(
        self,
        body: _types_models3.CharacterDetailRequest,
        *,
        cookie: str,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseCharacterList:
        """Character IDs should be sent in batches of at most 40, as used by TeyvatGuide.

        :param body: Required.
        :type body: ~uigf.mihoyo.game.types.CharacterDetailRequest
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseCharacterList. The ApiResponseCharacterList is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseCharacterList
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def get_character_details(
        self,
        body: IO[bytes],
        *,
        cookie: str,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseCharacterList:
        """Character IDs should be sent in batches of at most 40, as used by TeyvatGuide.

        :param body: Required.
        :type body: IO[bytes]
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseCharacterList. The ApiResponseCharacterList is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseCharacterList
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    def get_character_details(
        self,
        body: Union[_models3.CharacterDetailRequest, _types_models3.CharacterDetailRequest, IO[bytes]],
        *,
        cookie: str,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseCharacterList:
        """Character IDs should be sent in batches of at most 40, as used by TeyvatGuide.

        :param body: Is either a CharacterDetailRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.game.models.CharacterDetailRequest or
         ~uigf.mihoyo.game.types.CharacterDetailRequest or IO[bytes]
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseCharacterList. The ApiResponseCharacterList is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseCharacterList
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
        _params = kwargs.pop("params", {}) or {}

        content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
        cls: ClsType[_models4.ApiResponseCharacterList] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_game_record_api_get_character_details_request(
            cookie=cookie,
            ds=ds,
            content_type=content_type,
            content=_content,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseCharacterList, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_daily_note(
        self, *, cookie: str, server: str, role_id: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGenshinDailyNoteData:
        """get_daily_note.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword server: Required.
        :paramtype server: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGenshinDailyNoteData. The ApiResponseGenshinDailyNoteData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinDailyNoteData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGenshinDailyNoteData] = kwargs.pop("cls", None)

        _request = build_game_record_api_get_daily_note_request(
            cookie=cookie,
            server=server,
            role_id=role_id,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinDailyNoteData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_spiral_abyss(
        self,
        *,
        cookie: str,
        server: str,
        role_id: str,
        ds: Optional[str] = None,
        schedule_type: Optional[int] = None,
        need_detail: Optional[bool] = None,
        need_all: Optional[bool] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseGenshinSpiralAbyssData:
        """get_spiral_abyss.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword server: Required.
        :paramtype server: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword schedule_type: Default value is None.
        :paramtype schedule_type: int
        :keyword need_detail: Default value is None.
        :paramtype need_detail: bool
        :keyword need_all: Default value is None.
        :paramtype need_all: bool
        :return: ApiResponseGenshinSpiralAbyssData. The ApiResponseGenshinSpiralAbyssData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinSpiralAbyssData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGenshinSpiralAbyssData] = kwargs.pop("cls", None)

        _request = build_game_record_api_get_spiral_abyss_request(
            cookie=cookie,
            server=server,
            role_id=role_id,
            ds=ds,
            schedule_type=schedule_type,
            need_detail=need_detail,
            need_all=need_all,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinSpiralAbyssData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_imaginarium_theater(
        self,
        *,
        cookie: str,
        server: str,
        role_id: str,
        ds: Optional[str] = None,
        active: Optional[int] = None,
        schedule_type: Optional[int] = None,
        need_detail: Optional[bool] = None,
        need_all: Optional[bool] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseGenshinTheaterData:
        """get_imaginarium_theater.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword server: Required.
        :paramtype server: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword active: Default value is None.
        :paramtype active: int
        :keyword schedule_type: Default value is None.
        :paramtype schedule_type: int
        :keyword need_detail: Default value is None.
        :paramtype need_detail: bool
        :keyword need_all: Default value is None.
        :paramtype need_all: bool
        :return: ApiResponseGenshinTheaterData. The ApiResponseGenshinTheaterData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinTheaterData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGenshinTheaterData] = kwargs.pop("cls", None)

        _request = build_game_record_api_get_imaginarium_theater_request(
            cookie=cookie,
            server=server,
            role_id=role_id,
            ds=ds,
            active=active,
            schedule_type=schedule_type,
            need_detail=need_detail,
            need_all=need_all,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinTheaterData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_character_master(
        self, *, cookie: str, server: str, role_id: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGenshinCharacterMasterData:
        """get_character_master.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword server: Required.
        :paramtype server: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGenshinCharacterMasterData. The ApiResponseGenshinCharacterMasterData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinCharacterMasterData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGenshinCharacterMasterData] = kwargs.pop("cls", None)

        _request = build_game_record_api_get_character_master_request(
            cookie=cookie,
            server=server,
            role_id=role_id,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinCharacterMasterData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_stygian_onslaught(
        self,
        *,
        cookie: str,
        server: str,
        role_id: str,
        ds: Optional[str] = None,
        schedule_type: Optional[int] = None,
        need_detail: Optional[bool] = None,
        need_all: Optional[bool] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseGenshinStygianData:
        """get_stygian_onslaught.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword server: Required.
        :paramtype server: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword schedule_type: Default value is None.
        :paramtype schedule_type: int
        :keyword need_detail: Default value is None.
        :paramtype need_detail: bool
        :keyword need_all: Default value is None.
        :paramtype need_all: bool
        :return: ApiResponseGenshinStygianData. The ApiResponseGenshinStygianData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinStygianData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGenshinStygianData] = kwargs.pop("cls", None)

        _request = build_game_record_api_get_stygian_onslaught_request(
            cookie=cookie,
            server=server,
            role_id=role_id,
            ds=ds,
            schedule_type=schedule_type,
            need_detail=need_detail,
            need_all=need_all,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinStygianData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_stygian_popularity(
        self, *, server: str, role_id: int, **kwargs: Any
    ) -> _models4.ApiResponseGenshinStygianPopularityData:
        """get_stygian_popularity.

        :keyword server: Required.
        :paramtype server: str
        :keyword role_id: Required.
        :paramtype role_id: int
        :return: ApiResponseGenshinStygianPopularityData. The ApiResponseGenshinStygianPopularityData
         is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinStygianPopularityData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGenshinStygianPopularityData] = kwargs.pop("cls", None)

        _request = build_game_record_api_get_stygian_popularity_request(
            server=server,
            role_id=role_id,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinStygianPopularityData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    def get_activity_calendar(
        self,
        body: _models3.CharacterListRequest,
        *,
        cookie: str,
        ds: Optional[str] = None,
        challenge: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseGenshinActivityCalendarData:
        """get_activity_calendar.

        :param body: Required.
        :type body: ~uigf.mihoyo.game.models.CharacterListRequest
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword challenge: Default value is None.
        :paramtype challenge: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseGenshinActivityCalendarData. The ApiResponseGenshinActivityCalendarData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinActivityCalendarData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def get_activity_calendar(
        self,
        body: _types_models3.CharacterListRequest,
        *,
        cookie: str,
        ds: Optional[str] = None,
        challenge: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseGenshinActivityCalendarData:
        """get_activity_calendar.

        :param body: Required.
        :type body: ~uigf.mihoyo.game.types.CharacterListRequest
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword challenge: Default value is None.
        :paramtype challenge: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseGenshinActivityCalendarData. The ApiResponseGenshinActivityCalendarData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinActivityCalendarData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def get_activity_calendar(
        self,
        body: IO[bytes],
        *,
        cookie: str,
        ds: Optional[str] = None,
        challenge: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseGenshinActivityCalendarData:
        """get_activity_calendar.

        :param body: Required.
        :type body: IO[bytes]
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword challenge: Default value is None.
        :paramtype challenge: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseGenshinActivityCalendarData. The ApiResponseGenshinActivityCalendarData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinActivityCalendarData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    def get_activity_calendar(
        self,
        body: Union[_models3.CharacterListRequest, _types_models3.CharacterListRequest, IO[bytes]],
        *,
        cookie: str,
        ds: Optional[str] = None,
        challenge: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseGenshinActivityCalendarData:
        """get_activity_calendar.

        :param body: Is either a CharacterListRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.game.models.CharacterListRequest or
         ~uigf.mihoyo.game.types.CharacterListRequest or IO[bytes]
        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword challenge: Default value is None.
        :paramtype challenge: str
        :return: ApiResponseGenshinActivityCalendarData. The ApiResponseGenshinActivityCalendarData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinActivityCalendarData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
        _params = kwargs.pop("params", {}) or {}

        content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
        cls: ClsType[_models4.ApiResponseGenshinActivityCalendarData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_game_record_api_get_activity_calendar_request(
            cookie=cookie,
            ds=ds,
            challenge=challenge,
            content_type=content_type,
            content=_content,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinActivityCalendarData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_character_tps(
        self, *, cookie: str, server: str, role_id: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseJsonObject:
        """get_character_tps.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword server: Required.
        :paramtype server: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseJsonObject. The ApiResponseJsonObject is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseJsonObject
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseJsonObject] = kwargs.pop("cls", None)

        _request = build_game_record_api_get_character_tps_request(
            cookie=cookie,
            server=server,
            role_id=role_id,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseJsonObject, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_external_content(
        self, *, cookie: str, item_id: int, item_type: int, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGenshinExternalContentData:
        """get_external_content.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword item_id: Required.
        :paramtype item_id: int
        :keyword item_type: Required.
        :paramtype item_type: int
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGenshinExternalContentData. The ApiResponseGenshinExternalContentData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinExternalContentData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGenshinExternalContentData] = kwargs.pop("cls", None)

        _request = build_game_record_api_get_external_content_request(
            cookie=cookie,
            item_id=item_id,
            item_type=item_type,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinExternalContentData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_role_basic_info(
        self, *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGenshinRoleBasicInfoData:
        """get_role_basic_info.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword server: Required.
        :paramtype server: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGenshinRoleBasicInfoData. The ApiResponseGenshinRoleBasicInfoData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinRoleBasicInfoData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGenshinRoleBasicInfoData] = kwargs.pop("cls", None)

        _request = build_game_record_api_get_role_basic_info_request(
            cookie=cookie,
            role_id=role_id,
            server=server,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinRoleBasicInfoData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_tool(
        self, *, cookie: str, ds: Optional[str] = None, challenge: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGenshinToolData:
        """get_tool.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword challenge: Default value is None.
        :paramtype challenge: str
        :return: ApiResponseGenshinToolData. The ApiResponseGenshinToolData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinToolData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGenshinToolData] = kwargs.pop("cls", None)

        _request = build_game_record_api_get_tool_request(
            cookie=cookie,
            ds=ds,
            challenge=challenge,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinToolData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class GcgApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.RecordClient`'s
        :attr:`gcg_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: RecordClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_basic_info(
        self, *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGcgBasicInfoData:
        """get_basic_info.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword server: Required.
        :paramtype server: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGcgBasicInfoData. The ApiResponseGcgBasicInfoData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGcgBasicInfoData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGcgBasicInfoData] = kwargs.pop("cls", None)

        _request = build_gcg_api_get_basic_info_request(
            cookie=cookie,
            role_id=role_id,
            server=server,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGcgBasicInfoData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_card_back_list(
        self, *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGcgCardBackListData:
        """get_card_back_list.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword server: Required.
        :paramtype server: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGcgCardBackListData. The ApiResponseGcgCardBackListData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGcgCardBackListData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGcgCardBackListData] = kwargs.pop("cls", None)

        _request = build_gcg_api_get_card_back_list_request(
            cookie=cookie,
            role_id=role_id,
            server=server,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGcgCardBackListData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_card_list(
        self,
        *,
        cookie: str,
        limit: int,
        need_action: bool,
        need_avatar: bool,
        need_stats: bool,
        offset: int,
        role_id: str,
        server: str,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseGcgCardListData:
        """get_card_list.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword limit: Required.
        :paramtype limit: int
        :keyword need_action: Required.
        :paramtype need_action: bool
        :keyword need_avatar: Required.
        :paramtype need_avatar: bool
        :keyword need_stats: Required.
        :paramtype need_stats: bool
        :keyword offset: Required.
        :paramtype offset: int
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword server: Required.
        :paramtype server: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGcgCardListData. The ApiResponseGcgCardListData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGcgCardListData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGcgCardListData] = kwargs.pop("cls", None)

        _request = build_gcg_api_get_card_list_request(
            cookie=cookie,
            limit=limit,
            need_action=need_action,
            need_avatar=need_avatar,
            need_stats=need_stats,
            offset=offset,
            role_id=role_id,
            server=server,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGcgCardListData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_challenge_record(
        self, *, cookie: str, schedule_id: int, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGcgChallengeRecordData:
        """get_challenge_record.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword schedule_id: Required.
        :paramtype schedule_id: int
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword server: Required.
        :paramtype server: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGcgChallengeRecordData. The ApiResponseGcgChallengeRecordData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGcgChallengeRecordData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGcgChallengeRecordData] = kwargs.pop("cls", None)

        _request = build_gcg_api_get_challenge_record_request(
            cookie=cookie,
            schedule_id=schedule_id,
            role_id=role_id,
            server=server,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGcgChallengeRecordData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_challenge_schedule(
        self, *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGcgChallengeScheduleData:
        """get_challenge_schedule.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword server: Required.
        :paramtype server: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGcgChallengeScheduleData. The ApiResponseGcgChallengeScheduleData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGcgChallengeScheduleData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGcgChallengeScheduleData] = kwargs.pop("cls", None)

        _request = build_gcg_api_get_challenge_schedule_request(
            cookie=cookie,
            role_id=role_id,
            server=server,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGcgChallengeScheduleData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_deck_list(
        self, *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGcgDeckListData:
        """get_deck_list.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword server: Required.
        :paramtype server: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGcgDeckListData. The ApiResponseGcgDeckListData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGcgDeckListData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGcgDeckListData] = kwargs.pop("cls", None)

        _request = build_gcg_api_get_deck_list_request(
            cookie=cookie,
            role_id=role_id,
            server=server,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGcgDeckListData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_covers(
        self, *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGcgCoversData:
        """get_covers.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword server: Required.
        :paramtype server: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGcgCoversData. The ApiResponseGcgCoversData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGcgCoversData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGcgCoversData] = kwargs.pop("cls", None)

        _request = build_gcg_api_get_covers_request(
            cookie=cookie,
            role_id=role_id,
            server=server,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGcgCoversData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_match_list(
        self, *, cookie: str, role_id: str, server: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGcgMatchListData:
        """get_match_list.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword role_id: Required.
        :paramtype role_id: str
        :keyword server: Required.
        :paramtype server: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGcgMatchListData. The ApiResponseGcgMatchListData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGcgMatchListData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGcgMatchListData] = kwargs.pop("cls", None)

        _request = build_gcg_api_get_match_list_request(
            cookie=cookie,
            role_id=role_id,
            server=server,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGcgMatchListData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class CardApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.RecordClient`'s
        :attr:`card_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: RecordClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_game_record_card(
        self, *, cookie: str, uid: str, ds: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseGenshinGameRecordCardData:
        """get_game_record_card.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword uid: Required.
        :paramtype uid: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseGenshinGameRecordCardData. The ApiResponseGenshinGameRecordCardData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseGenshinGameRecordCardData
        :raises ~corehttp.exceptions.HttpResponseError:
        """
        error_map: MutableMapping = {
            401: ClientAuthenticationError,
            404: ResourceNotFoundError,
            409: ResourceExistsError,
            304: ResourceNotModifiedError,
        }
        error_map.update(kwargs.pop("error_map", {}) or {})

        _headers = kwargs.pop("headers", {}) or {}
        _params = kwargs.pop("params", {}) or {}

        cls: ClsType[_models4.ApiResponseGenshinGameRecordCardData] = kwargs.pop("cls", None)

        _request = build_card_api_get_game_record_card_request(
            cookie=cookie,
            uid=uid,
            ds=ds,
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseGenshinGameRecordCardData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore
