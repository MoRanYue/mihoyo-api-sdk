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

from ..... import models as _models4
from .....api.request import models as _api_request_models6, types as _types_api_request_models6
from .....passport._utils.model_base import SdkJSONEncoder, _deserialize
from .....passport._utils.serialization import Deserializer, Serializer
from .._configuration import ActivityClientConfiguration

T = TypeVar("T")
ClsType = Optional[Callable[[PipelineResponse[HttpRequest, HttpResponse], T, dict[str, Any]], Any]]
List = list

_SERIALIZER = Serializer()
_SERIALIZER.client_side_validation = False


def build_strategy_api_get_latest_content_request(  # pylint: disable=name-too-long
    *, app_sn: str, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/common/blackboard/ys_strategy/v1/content/latest"

    # Construct parameters
    _params["app_sn"] = _SERIALIZER.query("app_sn", app_sn, "str")

    # Construct headers
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_strategy_api_get_home_info_request(*, app_sn: str, **kwargs: Any) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/common/blackboard/ys_strategy/v1/home/index/info"

    # Construct parameters
    _params["app_sn"] = _SERIALIZER.query("app_sn", app_sn, "str")

    # Construct headers
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_strategy_api_get_home_navbar_request(  # pylint: disable=name-too-long
    *, app_sn: str, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/common/blackboard/ys_strategy/v1/home/index/navbar"

    # Construct parameters
    _params["app_sn"] = _SERIALIZER.query("app_sn", app_sn, "str")

    # Construct headers
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_zenless_feedback_api_get_current_schedule_request(  # pylint: disable=name-too-long
    *, region: str, source: int, tool_type: int, uid: int, cookie: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})
    _params = case_insensitive_dict(kwargs.pop("params", {}) or {})

    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/event/nap_feedback/user/get_cur_schedule"

    # Construct parameters
    _params["region"] = _SERIALIZER.query("region", region, "str")
    _params["source"] = _SERIALIZER.query("source", source, "int")
    _params["tool_type"] = _SERIALIZER.query("tool_type", tool_type, "int")
    _params["uid"] = _SERIALIZER.query("uid", uid, "int")

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="GET", url=_url, params=_params, headers=_headers, **kwargs)


def build_zenless_feedback_api_collect_request(  # pylint: disable=name-too-long
    *, cookie: Optional[str] = None, **kwargs: Any
) -> HttpRequest:
    _headers = case_insensitive_dict(kwargs.pop("headers", {}) or {})

    content_type: Optional[str] = kwargs.pop("content_type", _headers.pop("Content-Type", None))
    accept = _headers.pop("Accept", "application/json")

    # Construct URL
    _url = "/event/nap_feedback/user/collect_feedback"

    # Construct headers
    if cookie is not None:
        _headers["Cookie"] = _SERIALIZER.header("cookie", cookie, "str")
    if content_type is not None:
        _headers["Content-Type"] = _SERIALIZER.header("content_type", content_type, "str")
    _headers["Accept"] = _SERIALIZER.header("accept", accept, "str")

    return HttpRequest(method="POST", url=_url, headers=_headers, **kwargs)


class StrategyApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.ActivityClient`'s
        :attr:`strategy_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: ActivityClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_latest_content(self, *, app_sn: str, **kwargs: Any) -> _models4.ApiResponseStrategyLatestContentData:
        """get_latest_content.

        :keyword app_sn: Required.
        :paramtype app_sn: str
        :return: ApiResponseStrategyLatestContentData. The ApiResponseStrategyLatestContentData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseStrategyLatestContentData
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

        cls: ClsType[_models4.ApiResponseStrategyLatestContentData] = kwargs.pop("cls", None)

        _request = build_strategy_api_get_latest_content_request(
            app_sn=app_sn,
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
            deserialized = _deserialize(_models4.ApiResponseStrategyLatestContentData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_home_info(self, *, app_sn: str, **kwargs: Any) -> _models4.ApiResponseStrategyHomeInfoData:
        """get_home_info.

        :keyword app_sn: Required.
        :paramtype app_sn: str
        :return: ApiResponseStrategyHomeInfoData. The ApiResponseStrategyHomeInfoData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseStrategyHomeInfoData
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

        cls: ClsType[_models4.ApiResponseStrategyHomeInfoData] = kwargs.pop("cls", None)

        _request = build_strategy_api_get_home_info_request(
            app_sn=app_sn,
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
            deserialized = _deserialize(_models4.ApiResponseStrategyHomeInfoData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    def get_home_navbar(self, *, app_sn: str, **kwargs: Any) -> _models4.ApiResponseStrategyHomeNavbarData:
        """get_home_navbar.

        :keyword app_sn: Required.
        :paramtype app_sn: str
        :return: ApiResponseStrategyHomeNavbarData. The ApiResponseStrategyHomeNavbarData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseStrategyHomeNavbarData
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

        cls: ClsType[_models4.ApiResponseStrategyHomeNavbarData] = kwargs.pop("cls", None)

        _request = build_strategy_api_get_home_navbar_request(
            app_sn=app_sn,
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
            deserialized = _deserialize(_models4.ApiResponseStrategyHomeNavbarData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class ZenlessFeedbackApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.ActivityClient`'s
        :attr:`zenless_feedback_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: PipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: ActivityClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    def get_current_schedule(
        self, *, region: str, source: int, tool_type: int, uid: int, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseZenlessFeedbackScheduleData:
        """get_current_schedule.

        :keyword region: Required.
        :paramtype region: str
        :keyword source: Required.
        :paramtype source: int
        :keyword tool_type: Required.
        :paramtype tool_type: int
        :keyword uid: Required.
        :paramtype uid: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :return: ApiResponseZenlessFeedbackScheduleData. The ApiResponseZenlessFeedbackScheduleData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseZenlessFeedbackScheduleData
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

        cls: ClsType[_models4.ApiResponseZenlessFeedbackScheduleData] = kwargs.pop("cls", None)

        _request = build_zenless_feedback_api_get_current_schedule_request(
            region=region,
            source=source,
            tool_type=tool_type,
            uid=uid,
            cookie=cookie,
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
            deserialized = _deserialize(_models4.ApiResponseZenlessFeedbackScheduleData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    def collect(
        self,
        body: _api_request_models6.ZenlessFeedbackCollectionRequest,
        *,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """collect.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.ZenlessFeedbackCollectionRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def collect(
        self,
        body: _types_api_request_models6.ZenlessFeedbackCollectionRequest,
        *,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """collect.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.ZenlessFeedbackCollectionRequest
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    def collect(
        self, body: IO[bytes], *, cookie: Optional[str] = None, content_type: str = "application/json", **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """collect.

        :param body: Required.
        :type body: IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    def collect(
        self,
        body: Union[
            _api_request_models6.ZenlessFeedbackCollectionRequest,
            _types_api_request_models6.ZenlessFeedbackCollectionRequest,
            IO[bytes],
        ],
        *,
        cookie: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """collect.

        :param body: Is either a ZenlessFeedbackCollectionRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.ZenlessFeedbackCollectionRequest or
         ~uigf.mihoyo.api.request.types.ZenlessFeedbackCollectionRequest or IO[bytes]
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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
        cls: ClsType[_models4.ApiResponseEmptyData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_zenless_feedback_api_collect_request(
            cookie=cookie,
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
            deserialized = _deserialize(_models4.ApiResponseEmptyData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore
