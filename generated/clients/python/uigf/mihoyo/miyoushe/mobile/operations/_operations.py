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

from .... import models as _models3
from ....api.request import models as _api_request_models5, types as _types_api_request_models5
from ....passport._utils.model_base import SdkJSONEncoder, _deserialize
from ....passport._utils.serialization import Deserializer, Serializer
from .._configuration import MobileClientConfiguration

T = TypeVar("T")
ClsType = Optional[Callable[[PipelineResponse[HttpRequest, HttpResponse], T, dict[str, Any]], Any]]
List = list

_SERIALIZER = Serializer()
_SERIALIZER.client_side_validation = False


def build_mobile_api_hub_get_app_splash_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/apihub/api/getAppSplash"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_mobile_api_hub_get_game_list_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/apihub/api/getGameList"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_mobile_api_hub_get_myself_page_config_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/apihub/api/myselfPageConfig"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_mobile_api_hub_get_unread_message_count_request(  # pylint: disable=name-too-long
    *, first_view_ts: int, uid: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/apihub/api/unreadMessageCnt"

    # Construct parameters
    _params["first_view_ts"] = _SERIALIZER.query("first_view_ts", first_view_ts, "int")
    _params["uid"] = _SERIALIZER.query("uid", uid, "int")

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_mobile_api_hub_get_user_missions_state_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/apihub/sapi/getUserMissionsState"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_mobile_api_hub_device_login_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/apihub/api/deviceLogin"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    if content_type is not None:
        _headers["Content-Type"] = _SERIALIZER.header("content_type", content_type, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="POST", url=_url, headers=_headers, **kwargs)


def build_mobile_api_hub_device_logout_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/apihub/api/deviceLogout"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    if content_type is not None:
        _headers["Content-Type"] = _SERIALIZER.header("content_type", content_type, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="POST", url=_url, headers=_headers, **kwargs)


def build_mobile_api_hub_get_app_startup_data_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/apihub/api/getAppStartupData"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    if content_type is not None:
        _headers["Content-Type"] = _SERIALIZER.header("content_type", content_type, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="POST", url=_url, headers=_headers, **kwargs)


def build_mobile_api_hub_prepare_window_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/apihub/api/window/prepare"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    if content_type is not None:
        _headers["Content-Type"] = _SERIALIZER.header("content_type", content_type, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="POST", url=_url, headers=_headers, **kwargs)


def build_mobile_api_hub_show_window_request(
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/apihub/api/window/show"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    if content_type is not None:
        _headers["Content-Type"] = _SERIALIZER.header("content_type", content_type, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="POST", url=_url, headers=_headers, **kwargs)


def build_mobile_chat_api_get_user_settings_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/chat/api/getUserSettings"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_mobile_forum_api_get_discussion_by_game_request(  # pylint: disable=name-too-long
    *, gids: int, version: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/forum/api/getDiscussionByGame"

    # Construct parameters
    _params["gids"] = _SERIALIZER.query("gids", gids, "int")
    _params["version"] = _SERIALIZER.query("version", version, "int")

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_mobile_misc_api_get_recent_emoticons_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/misc/api/recentEmoticonList"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_mobile_painter_api_get_feed_posts_request(  # pylint: disable=name-too-long
    *,
    algorithm_type: int,
    cpu: str,
    device: str,
    filter: str,
    fresh_action: int,
    gids: int,
    is_first_initialize: bool,
    is_triggered_by_resource: bool,
    last_id: str,
    cookie: Optional[str] = None,
    ds: Optional[str] = None,
    **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/painter/api/feeds/posts"

    # Construct parameters
    _params["algorithm_type"] = _SERIALIZER.query("algorithm_type", algorithm_type, "int")
    _params["cpu"] = _SERIALIZER.query("cpu", cpu, "str")
    _params["device"] = _SERIALIZER.query("device", device, "str")
    _params["filter"] = _SERIALIZER.query("filter", filter, "str")
    _params["fresh_action"] = _SERIALIZER.query("fresh_action", fresh_action, "int")
    _params["gids"] = _SERIALIZER.query("gids", gids, "int")
    _params["is_first_initialize"] = _SERIALIZER.query("is_first_initialize", is_first_initialize, "bool")
    _params["is_triggered_by_resource"] = _SERIALIZER.query(
        "is_triggered_by_resource", is_triggered_by_resource, "bool"
    )
    _params["last_id"] = _SERIALIZER.query("last_id", last_id, "str")

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_mobile_painter_api_get_user_instant_list_request(  # pylint: disable=name-too-long
    *,
    game_region: str,
    game_uid: int,
    offset: int,
    size: int,
    uid: int,
    view_type: int,
    cookie: Optional[str] = None,
    ds: Optional[str] = None,
    **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/painter/api/user_instant/list"

    # Construct parameters
    _params["game_region"] = _SERIALIZER.query("game_region", game_region, "str")
    _params["game_uid"] = _SERIALIZER.query("game_uid", game_uid, "int")
    _params["offset"] = _SERIALIZER.query("offset", offset, "int")
    _params["size"] = _SERIALIZER.query("size", size, "int")
    _params["uid"] = _SERIALIZER.query("uid", uid, "int")
    _params["view_type"] = _SERIALIZER.query("view_type", view_type, "int")

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_mobile_painter_api_get_villa_site_push_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/painter/api/villa/notification/site_push"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_mobile_post_api_get_publish_video_permission_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/post/api/check/publishVideoPerm"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_mobile_reception_api_get_game_center_request(  # pylint: disable=name-too-long
    *, cpu: str, device: str, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/reception/api/gameCenter"

    # Construct parameters
    _params["cpu"] = _SERIALIZER.query("cpu", cpu, "str")
    _params["device"] = _SERIALIZER.query("device", device, "str")

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_mobile_teenager_api_get_info_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/teenager/api/info"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_mobile_timeline_api_get_unread_info_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/timeline/api/getUnreadInfo"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_mobile_user_api_get_user_businesses_request(  # pylint: disable=name-too-long
    *, uid: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/user/api/getUserBusinesses"

    # Construct parameters
    _params["uid"] = _SERIALIZER.query("uid", uid, "int")

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_mobile_user_api_get_user_full_info_request(  # pylint: disable=name-too-long
    *, uid: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/user/api/getUserFullInfo"

    # Construct parameters
    _params["uid"] = _SERIALIZER.query("uid", uid, "int")

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_mobile_user_api_get_notification_settings_request(  # pylint: disable=name-too-long
    *, uid: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/user/api/notify/settings"

    # Construct parameters
    _params["uid"] = _SERIALIZER.query("uid", uid, "int")

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_mobile_user_api_get_reply_permission_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/user/api/replyPermission"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, headers=_headers, **kwargs)


def build_mobile_user_api_login_request(
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/user/api/login"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    if content_type is not None:
        _headers["Content-Type"] = _SERIALIZER.header("content_type", content_type, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="POST", url=_url, headers=_headers, **kwargs)


def build_mobile_user_instant_api_get_entity_review_request(  # pylint: disable=name-too-long
    *, offset: int, size: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/user_instant/api/entity/review"

    # Construct parameters
    _params["offset"] = _SERIALIZER.query("offset", offset, "int")
    _params["size"] = _SERIALIZER.query("size", size, "int")

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_mobile_preload_api_get_latest_config_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/preload_resource/api/rn/get_latest_config"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if ds is not None:
        _headers["DS"] = _SERIALIZER.header("ds", ds, "str")
    if content_type is not None:
        _headers["Content-Type"] = _SERIALIZER.header("content_type", content_type, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="POST", url=_url, headers=_headers, **kwargs)


class MobileApiHubOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_api_hub` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_app_splash(
        self, *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileAppSplashData:
        """get_app_splash.

        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileAppSplashData. The ApiResponseMobileAppSplashData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileAppSplashData
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

        cls: ClsType[_models3.ApiResponseMobileAppSplashData] = kwargs.pop("cls", None)

        _request = build_mobile_api_hub_get_app_splash_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileAppSplashData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_game_list(
        self, *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileGameListData:
        """get_game_list.

        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileGameListData. The ApiResponseMobileGameListData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileGameListData
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

        cls: ClsType[_models3.ApiResponseMobileGameListData] = kwargs.pop("cls", None)

        _request = build_mobile_api_hub_get_game_list_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileGameListData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_myself_page_config(
        self, *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileMyselfPageConfigData:
        """get_myself_page_config.

        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileMyselfPageConfigData. The ApiResponseMobileMyselfPageConfigData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileMyselfPageConfigData
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

        cls: ClsType[_models3.ApiResponseMobileMyselfPageConfigData] = kwargs.pop("cls", None)

        _request = build_mobile_api_hub_get_myself_page_config_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileMyselfPageConfigData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_unread_message_count(
        self, *, first_view_ts: int, uid: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileUnreadMessageData:
        """get_unread_message_count.

        :keyword first_view_ts: Required.
        :paramtype first_view_ts: int
        :keyword uid: Required.
        :paramtype uid: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileUnreadMessageData. The ApiResponseMobileUnreadMessageData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileUnreadMessageData
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

        cls: ClsType[_models3.ApiResponseMobileUnreadMessageData] = kwargs.pop("cls", None)

        _request = build_mobile_api_hub_get_unread_message_count_request(
            first_view_ts=first_view_ts,
            uid=uid,
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileUnreadMessageData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_user_missions_state(
        self, *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileMissionsStateData:
        """get_user_missions_state.

        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileMissionsStateData. The ApiResponseMobileMissionsStateData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileMissionsStateData
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

        cls: ClsType[_models3.ApiResponseMobileMissionsStateData] = kwargs.pop("cls", None)

        _request = build_mobile_api_hub_get_user_missions_state_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileMissionsStateData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    def device_login(
        self,
        body: _api_request_models5.MobileDeviceSessionRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """device_login.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileDeviceSessionRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def device_login(
        self,
        body: _types_api_request_models5.MobileDeviceSessionRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """device_login.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileDeviceSessionRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def device_login(
        self,
        body: IO[bytes],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """device_login.

        :param body: Required.
        :type body: IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    def device_login(
        self,
        body: Union[
            _api_request_models5.MobileDeviceSessionRequest,
            _types_api_request_models5.MobileDeviceSessionRequest,
            IO[bytes],
        ],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """device_login.

        :param body: Is either a MobileDeviceSessionRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileDeviceSessionRequest or
         ~uigf.mihoyo.api.request.types.MobileDeviceSessionRequest or IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
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
        cls: ClsType[_models3.ApiResponseEmptyData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_mobile_api_hub_device_login_request(
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
            deserialized = _deserialize(_models3.ApiResponseEmptyData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    def device_logout(
        self,
        body: _api_request_models5.MobileDeviceSessionRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """device_logout.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileDeviceSessionRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def device_logout(
        self,
        body: _types_api_request_models5.MobileDeviceSessionRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """device_logout.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileDeviceSessionRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def device_logout(
        self,
        body: IO[bytes],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """device_logout.

        :param body: Required.
        :type body: IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    def device_logout(
        self,
        body: Union[
            _api_request_models5.MobileDeviceSessionRequest,
            _types_api_request_models5.MobileDeviceSessionRequest,
            IO[bytes],
        ],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """device_logout.

        :param body: Is either a MobileDeviceSessionRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileDeviceSessionRequest or
         ~uigf.mihoyo.api.request.types.MobileDeviceSessionRequest or IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
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
        cls: ClsType[_models3.ApiResponseEmptyData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_mobile_api_hub_device_logout_request(
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
            deserialized = _deserialize(_models3.ApiResponseEmptyData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    def get_app_startup_data(
        self,
        body: _api_request_models5.MobileStartupRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobileStartupData:
        """get_app_startup_data.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileStartupRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileStartupData. The ApiResponseMobileStartupData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileStartupData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def get_app_startup_data(
        self,
        body: _types_api_request_models5.MobileStartupRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobileStartupData:
        """get_app_startup_data.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileStartupRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileStartupData. The ApiResponseMobileStartupData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileStartupData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def get_app_startup_data(
        self,
        body: IO[bytes],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobileStartupData:
        """get_app_startup_data.

        :param body: Required.
        :type body: IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileStartupData. The ApiResponseMobileStartupData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileStartupData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    def get_app_startup_data(
        self,
        body: Union[
            _api_request_models5.MobileStartupRequest, _types_api_request_models5.MobileStartupRequest, IO[bytes]
        ],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models3.ApiResponseMobileStartupData:
        """get_app_startup_data.

        :param body: Is either a MobileStartupRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileStartupRequest or
         ~uigf.mihoyo.api.request.types.MobileStartupRequest or IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileStartupData. The ApiResponseMobileStartupData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileStartupData
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
        cls: ClsType[_models3.ApiResponseMobileStartupData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_mobile_api_hub_get_app_startup_data_request(
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
            deserialized = _deserialize(_models3.ApiResponseMobileStartupData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    def prepare_window(
        self,
        body: _api_request_models5.MobileWindowPrepareRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobileWindowPrepareData:
        """prepare_window.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileWindowPrepareRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowPrepareData. The ApiResponseMobileWindowPrepareData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowPrepareData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def prepare_window(
        self,
        body: _types_api_request_models5.MobileWindowPrepareRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobileWindowPrepareData:
        """prepare_window.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileWindowPrepareRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowPrepareData. The ApiResponseMobileWindowPrepareData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowPrepareData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def prepare_window(
        self,
        body: IO[bytes],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobileWindowPrepareData:
        """prepare_window.

        :param body: Required.
        :type body: IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowPrepareData. The ApiResponseMobileWindowPrepareData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowPrepareData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    def prepare_window(
        self,
        body: Union[
            _api_request_models5.MobileWindowPrepareRequest,
            _types_api_request_models5.MobileWindowPrepareRequest,
            IO[bytes],
        ],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models3.ApiResponseMobileWindowPrepareData:
        """prepare_window.

        :param body: Is either a MobileWindowPrepareRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileWindowPrepareRequest or
         ~uigf.mihoyo.api.request.types.MobileWindowPrepareRequest or IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileWindowPrepareData. The ApiResponseMobileWindowPrepareData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowPrepareData
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
        cls: ClsType[_models3.ApiResponseMobileWindowPrepareData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_mobile_api_hub_prepare_window_request(
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
            deserialized = _deserialize(_models3.ApiResponseMobileWindowPrepareData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    def show_window(
        self,
        body: _api_request_models5.MobileWindowShowRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobileWindowShowData:
        """show_window.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileWindowShowRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowShowData. The ApiResponseMobileWindowShowData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowShowData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def show_window(
        self,
        body: _types_api_request_models5.MobileWindowShowRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobileWindowShowData:
        """show_window.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileWindowShowRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowShowData. The ApiResponseMobileWindowShowData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowShowData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def show_window(
        self,
        body: IO[bytes],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobileWindowShowData:
        """show_window.

        :param body: Required.
        :type body: IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowShowData. The ApiResponseMobileWindowShowData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowShowData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    def show_window(
        self,
        body: Union[
            _api_request_models5.MobileWindowShowRequest, _types_api_request_models5.MobileWindowShowRequest, IO[bytes]
        ],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models3.ApiResponseMobileWindowShowData:
        """show_window.

        :param body: Is either a MobileWindowShowRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileWindowShowRequest or
         ~uigf.mihoyo.api.request.types.MobileWindowShowRequest or IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileWindowShowData. The ApiResponseMobileWindowShowData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowShowData
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
        cls: ClsType[_models3.ApiResponseMobileWindowShowData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_mobile_api_hub_show_window_request(
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
            deserialized = _deserialize(_models3.ApiResponseMobileWindowShowData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileChatApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_chat_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_user_settings(
        self, *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileUserSettingsData:
        """get_user_settings.

        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileUserSettingsData. The ApiResponseMobileUserSettingsData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileUserSettingsData
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

        cls: ClsType[_models3.ApiResponseMobileUserSettingsData] = kwargs.pop("cls", None)

        _request = build_mobile_chat_api_get_user_settings_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileUserSettingsData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileForumApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_forum_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_discussion_by_game(
        self, *, gids: int, version: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileDiscussionData:
        """get_discussion_by_game.

        :keyword gids: Required.
        :paramtype gids: int
        :keyword version: Required.
        :paramtype version: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileDiscussionData. The ApiResponseMobileDiscussionData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileDiscussionData
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

        cls: ClsType[_models3.ApiResponseMobileDiscussionData] = kwargs.pop("cls", None)

        _request = build_mobile_forum_api_get_discussion_by_game_request(
            gids=gids,
            version=version,
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileDiscussionData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileMiscApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_misc_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_recent_emoticons(
        self, *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileEmoticonData:
        """get_recent_emoticons.

        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileEmoticonData. The ApiResponseMobileEmoticonData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileEmoticonData
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

        cls: ClsType[_models3.ApiResponseMobileEmoticonData] = kwargs.pop("cls", None)

        _request = build_mobile_misc_api_get_recent_emoticons_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileEmoticonData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobilePainterApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_painter_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_feed_posts(
        self,
        *,
        algorithm_type: int,
        cpu: str,
        device: str,
        filter: str,
        fresh_action: int,
        gids: int,
        is_first_initialize: bool,
        is_triggered_by_resource: bool,
        last_id: str,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models3.ApiResponseMobileFeedPostsData:
        """get_feed_posts.

        :keyword algorithm_type: Required.
        :paramtype algorithm_type: int
        :keyword cpu: Required.
        :paramtype cpu: str
        :keyword device: Required.
        :paramtype device: str
        :keyword filter: Required.
        :paramtype filter: str
        :keyword fresh_action: Required.
        :paramtype fresh_action: int
        :keyword gids: Required.
        :paramtype gids: int
        :keyword is_first_initialize: Required.
        :paramtype is_first_initialize: bool
        :keyword is_triggered_by_resource: Required.
        :paramtype is_triggered_by_resource: bool
        :keyword last_id: Required.
        :paramtype last_id: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileFeedPostsData. The ApiResponseMobileFeedPostsData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileFeedPostsData
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

        cls: ClsType[_models3.ApiResponseMobileFeedPostsData] = kwargs.pop("cls", None)

        _request = build_mobile_painter_api_get_feed_posts_request(
            algorithm_type=algorithm_type,
            cpu=cpu,
            device=device,
            filter=filter,
            fresh_action=fresh_action,
            gids=gids,
            is_first_initialize=is_first_initialize,
            is_triggered_by_resource=is_triggered_by_resource,
            last_id=last_id,
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileFeedPostsData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_user_instant_list(
        self,
        *,
        game_region: str,
        game_uid: int,
        offset: int,
        size: int,
        uid: int,
        view_type: int,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models3.ApiResponseMobileUserInstantListData:
        """get_user_instant_list.

        :keyword game_region: Required.
        :paramtype game_region: str
        :keyword game_uid: Required.
        :paramtype game_uid: int
        :keyword offset: Required.
        :paramtype offset: int
        :keyword size: Required.
        :paramtype size: int
        :keyword uid: Required.
        :paramtype uid: int
        :keyword view_type: Required.
        :paramtype view_type: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileUserInstantListData. The ApiResponseMobileUserInstantListData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileUserInstantListData
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

        cls: ClsType[_models3.ApiResponseMobileUserInstantListData] = kwargs.pop("cls", None)

        _request = build_mobile_painter_api_get_user_instant_list_request(
            game_region=game_region,
            game_uid=game_uid,
            offset=offset,
            size=size,
            uid=uid,
            view_type=view_type,
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileUserInstantListData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_villa_site_push(
        self, *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileVillaSitePushData:
        """get_villa_site_push.

        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileVillaSitePushData. The ApiResponseMobileVillaSitePushData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileVillaSitePushData
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

        cls: ClsType[_models3.ApiResponseMobileVillaSitePushData] = kwargs.pop("cls", None)

        _request = build_mobile_painter_api_get_villa_site_push_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileVillaSitePushData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobilePostApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_post_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_publish_video_permission(
        self, *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileVideoPermissionData:
        """get_publish_video_permission.

        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileVideoPermissionData. The ApiResponseMobileVideoPermissionData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileVideoPermissionData
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

        cls: ClsType[_models3.ApiResponseMobileVideoPermissionData] = kwargs.pop("cls", None)

        _request = build_mobile_post_api_get_publish_video_permission_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileVideoPermissionData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileReceptionApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_reception_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_game_center(
        self, *, cpu: str, device: str, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileGameCenterData:
        """get_game_center.

        :keyword cpu: Required.
        :paramtype cpu: str
        :keyword device: Required.
        :paramtype device: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileGameCenterData. The ApiResponseMobileGameCenterData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileGameCenterData
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

        cls: ClsType[_models3.ApiResponseMobileGameCenterData] = kwargs.pop("cls", None)

        _request = build_mobile_reception_api_get_game_center_request(
            cpu=cpu,
            device=device,
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileGameCenterData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileTeenagerApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_teenager_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_info(
        self, *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileTeenagerInfoData:
        """get_info.

        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileTeenagerInfoData. The ApiResponseMobileTeenagerInfoData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileTeenagerInfoData
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

        cls: ClsType[_models3.ApiResponseMobileTeenagerInfoData] = kwargs.pop("cls", None)

        _request = build_mobile_teenager_api_get_info_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileTeenagerInfoData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileTimelineApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_timeline_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_unread_info(
        self, *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileUnreadInfoData:
        """get_unread_info.

        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileUnreadInfoData. The ApiResponseMobileUnreadInfoData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileUnreadInfoData
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

        cls: ClsType[_models3.ApiResponseMobileUnreadInfoData] = kwargs.pop("cls", None)

        _request = build_mobile_timeline_api_get_unread_info_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileUnreadInfoData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileUserApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_user_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_user_businesses(
        self, *, uid: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileBusinessesData:
        """get_user_businesses.

        :keyword uid: Required.
        :paramtype uid: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileBusinessesData. The ApiResponseMobileBusinessesData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileBusinessesData
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

        cls: ClsType[_models3.ApiResponseMobileBusinessesData] = kwargs.pop("cls", None)

        _request = build_mobile_user_api_get_user_businesses_request(
            uid=uid,
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileBusinessesData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_user_full_info(
        self, *, uid: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseCommunityUser:
        """get_user_full_info.

        :keyword uid: Required.
        :paramtype uid: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseCommunityUser. The ApiResponseCommunityUser is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseCommunityUser
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

        cls: ClsType[_models3.ApiResponseCommunityUser] = kwargs.pop("cls", None)

        _request = build_mobile_user_api_get_user_full_info_request(
            uid=uid,
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseCommunityUser, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_notification_settings(
        self, *, uid: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileNotificationSettingsData:
        """get_notification_settings.

        :keyword uid: Required.
        :paramtype uid: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileNotificationSettingsData. The
         ApiResponseMobileNotificationSettingsData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileNotificationSettingsData
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

        cls: ClsType[_models3.ApiResponseMobileNotificationSettingsData] = kwargs.pop("cls", None)

        _request = build_mobile_user_api_get_notification_settings_request(
            uid=uid,
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileNotificationSettingsData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_reply_permission(
        self, *, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileReplyPermissionData:
        """get_reply_permission.

        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileReplyPermissionData. The ApiResponseMobileReplyPermissionData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileReplyPermissionData
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

        cls: ClsType[_models3.ApiResponseMobileReplyPermissionData] = kwargs.pop("cls", None)

        _request = build_mobile_user_api_get_reply_permission_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileReplyPermissionData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    def login(
        self,
        body: _api_request_models5.MobileLoginRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """login.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileLoginRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def login(
        self,
        body: _types_api_request_models5.MobileLoginRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """login.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileLoginRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def login(
        self,
        body: IO[bytes],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """login.

        :param body: Required.
        :type body: IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    def login(
        self,
        body: Union[_api_request_models5.MobileLoginRequest, _types_api_request_models5.MobileLoginRequest, IO[bytes]],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models3.ApiResponseEmptyData:
        """login.

        :param body: Is either a MobileLoginRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileLoginRequest or
         ~uigf.mihoyo.api.request.types.MobileLoginRequest or IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
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
        cls: ClsType[_models3.ApiResponseEmptyData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_mobile_user_api_login_request(
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
            deserialized = _deserialize(_models3.ApiResponseEmptyData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileUserInstantApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_user_instant_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_entity_review(
        self, *, offset: int, size: int, cookie: Optional[str] = None, ds: Optional[str] = None, **kwargs: Any
    ) -> _models3.ApiResponseMobileEntityReviewData:
        """get_entity_review.

        :keyword offset: Required.
        :paramtype offset: int
        :keyword size: Required.
        :paramtype size: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobileEntityReviewData. The ApiResponseMobileEntityReviewData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileEntityReviewData
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

        cls: ClsType[_models3.ApiResponseMobileEntityReviewData] = kwargs.pop("cls", None)

        _request = build_mobile_user_instant_api_get_entity_review_request(
            offset=offset,
            size=size,
            cookie=cookie,
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
            deserialized = _deserialize(_models3.ApiResponseMobileEntityReviewData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobilePreloadApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.MobileClient`'s
        :attr:`mobile_preload_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    @overload
    def get_latest_config(
        self,
        body: _api_request_models5.MobilePreloadConfigRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobilePreloadConfigData:
        """get_latest_config.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobilePreloadConfigRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobilePreloadConfigData. The ApiResponseMobilePreloadConfigData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobilePreloadConfigData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def get_latest_config(
        self,
        body: _types_api_request_models5.MobilePreloadConfigRequest,
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobilePreloadConfigData:
        """get_latest_config.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobilePreloadConfigRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobilePreloadConfigData. The ApiResponseMobilePreloadConfigData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobilePreloadConfigData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def get_latest_config(
        self,
        body: IO[bytes],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models3.ApiResponseMobilePreloadConfigData:
        """get_latest_config.

        :param body: Required.
        :type body: IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobilePreloadConfigData. The ApiResponseMobilePreloadConfigData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobilePreloadConfigData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    def get_latest_config(
        self,
        body: Union[
            _api_request_models5.MobilePreloadConfigRequest,
            _types_api_request_models5.MobilePreloadConfigRequest,
            IO[bytes],
        ],
        *,
        cookie: Optional[str] = None,
        ds: Optional[str] = None,
        **kwargs: Any
    ) -> _models3.ApiResponseMobilePreloadConfigData:
        """get_latest_config.

        :param body: Is either a MobilePreloadConfigRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobilePreloadConfigRequest or
         ~uigf.mihoyo.api.request.types.MobilePreloadConfigRequest or IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword ds: Default value is None.
        :paramtype ds: str
        :return: ApiResponseMobilePreloadConfigData. The ApiResponseMobilePreloadConfigData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobilePreloadConfigData
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
        cls: ClsType[_models3.ApiResponseMobilePreloadConfigData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_mobile_preload_api_get_latest_config_request(
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
            deserialized = _deserialize(_models3.ApiResponseMobilePreloadConfigData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore
