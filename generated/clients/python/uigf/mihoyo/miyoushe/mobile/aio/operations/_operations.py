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
from corehttp.rest import AsyncHttpResponse, HttpRequest
from corehttp.runtime import AsyncPipelineClient
from corehttp.runtime.pipeline import PipelineResponse
from corehttp.utils import case_insensitive_dict

from ..... import models as _models4
from .....api.request import models as _api_request_models6, types as _types_api_request_models6
from .....passport._utils.model_base import SdkJSONEncoder, _deserialize
from .....passport._utils.serialization import Deserializer, Serializer
from ...operations._operations import (
    build_mobile_api_hub_device_login_request,
    build_mobile_api_hub_device_logout_request,
    build_mobile_api_hub_get_app_splash_request,
    build_mobile_api_hub_get_app_startup_data_request,
    build_mobile_api_hub_get_game_list_request,
    build_mobile_api_hub_get_myself_page_config_request,
    build_mobile_api_hub_get_unread_message_count_request,
    build_mobile_api_hub_get_user_missions_state_request,
    build_mobile_api_hub_prepare_window_request,
    build_mobile_api_hub_show_window_request,
    build_mobile_chat_api_get_user_settings_request,
    build_mobile_forum_api_get_discussion_by_game_request,
    build_mobile_misc_api_get_recent_emoticons_request,
    build_mobile_painter_api_get_feed_posts_request,
    build_mobile_painter_api_get_user_instant_list_request,
    build_mobile_painter_api_get_villa_site_push_request,
    build_mobile_post_api_get_publish_video_permission_request,
    build_mobile_preload_api_get_latest_config_request,
    build_mobile_reception_api_get_game_center_request,
    build_mobile_teenager_api_get_info_request,
    build_mobile_timeline_api_get_unread_info_request,
    build_mobile_user_api_get_notification_settings_request,
    build_mobile_user_api_get_reply_permission_request,
    build_mobile_user_api_get_user_businesses_request,
    build_mobile_user_api_get_user_full_info_request,
    build_mobile_user_api_login_request,
    build_mobile_user_instant_api_get_entity_review_request,
)
from .._configuration import MobileClientConfiguration

T = TypeVar("T")
ClsType = Optional[Callable[[PipelineResponse[HttpRequest, AsyncHttpResponse], T, dict[str, Any]], Any]]
List = list


class MobileApiHubOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_api_hub` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_app_splash(
        self, *, ds: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileAppSplashData:
        """get_app_splash.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileAppSplashData] = kwargs.pop("cls", None)

        _request = build_mobile_api_hub_get_app_splash_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileAppSplashData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    async def get_game_list(
        self, *, ds: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileGameListData:
        """get_game_list.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileGameListData] = kwargs.pop("cls", None)

        _request = build_mobile_api_hub_get_game_list_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileGameListData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    async def get_myself_page_config(
        self, *, ds: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileMyselfPageConfigData:
        """get_myself_page_config.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileMyselfPageConfigData] = kwargs.pop("cls", None)

        _request = build_mobile_api_hub_get_myself_page_config_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileMyselfPageConfigData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    async def get_unread_message_count(
        self, *, ds: str, first_view_ts: int, uid: int, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileUnreadMessageData:
        """get_unread_message_count.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword first_view_ts: Required.
        :paramtype first_view_ts: int
        :keyword uid: Required.
        :paramtype uid: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileUnreadMessageData] = kwargs.pop("cls", None)

        _request = build_mobile_api_hub_get_unread_message_count_request(
            ds=ds,
            first_view_ts=first_view_ts,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileUnreadMessageData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    async def get_user_missions_state(
        self, *, ds: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileMissionsStateData:
        """get_user_missions_state.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileMissionsStateData] = kwargs.pop("cls", None)

        _request = build_mobile_api_hub_get_user_missions_state_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileMissionsStateData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    async def device_login(
        self,
        body: _api_request_models6.MobileDeviceSessionRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """device_login.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileDeviceSessionRequest
        :keyword ds: Required.
        :paramtype ds: str
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
    async def device_login(
        self,
        body: _types_api_request_models6.MobileDeviceSessionRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """device_login.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileDeviceSessionRequest
        :keyword ds: Required.
        :paramtype ds: str
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
    async def device_login(
        self,
        body: IO[bytes],
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """device_login.

        :param body: Required.
        :type body: IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    async def device_login(
        self,
        body: Union[
            _api_request_models6.MobileDeviceSessionRequest,
            _types_api_request_models6.MobileDeviceSessionRequest,
            IO[bytes],
        ],
        *,
        ds: str,
        cookie: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """device_login.

        :param body: Is either a MobileDeviceSessionRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileDeviceSessionRequest or
         ~uigf.mihoyo.api.request.types.MobileDeviceSessionRequest or IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
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

        _request = build_mobile_api_hub_device_login_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
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

    @overload
    async def device_logout(
        self,
        body: _api_request_models6.MobileDeviceSessionRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """device_logout.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileDeviceSessionRequest
        :keyword ds: Required.
        :paramtype ds: str
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
    async def device_logout(
        self,
        body: _types_api_request_models6.MobileDeviceSessionRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """device_logout.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileDeviceSessionRequest
        :keyword ds: Required.
        :paramtype ds: str
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
    async def device_logout(
        self,
        body: IO[bytes],
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """device_logout.

        :param body: Required.
        :type body: IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    async def device_logout(
        self,
        body: Union[
            _api_request_models6.MobileDeviceSessionRequest,
            _types_api_request_models6.MobileDeviceSessionRequest,
            IO[bytes],
        ],
        *,
        ds: str,
        cookie: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """device_logout.

        :param body: Is either a MobileDeviceSessionRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileDeviceSessionRequest or
         ~uigf.mihoyo.api.request.types.MobileDeviceSessionRequest or IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
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

        _request = build_mobile_api_hub_device_logout_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
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

    @overload
    async def get_app_startup_data(
        self,
        body: _api_request_models6.MobileStartupRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobileStartupData:
        """get_app_startup_data.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileStartupRequest
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileStartupData. The ApiResponseMobileStartupData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileStartupData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    async def get_app_startup_data(
        self,
        body: _types_api_request_models6.MobileStartupRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobileStartupData:
        """get_app_startup_data.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileStartupRequest
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileStartupData. The ApiResponseMobileStartupData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileStartupData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    async def get_app_startup_data(
        self,
        body: IO[bytes],
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobileStartupData:
        """get_app_startup_data.

        :param body: Required.
        :type body: IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileStartupData. The ApiResponseMobileStartupData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileStartupData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    async def get_app_startup_data(
        self,
        body: Union[
            _api_request_models6.MobileStartupRequest, _types_api_request_models6.MobileStartupRequest, IO[bytes]
        ],
        *,
        ds: str,
        cookie: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseMobileStartupData:
        """get_app_startup_data.

        :param body: Is either a MobileStartupRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileStartupRequest or
         ~uigf.mihoyo.api.request.types.MobileStartupRequest or IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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
        cls: ClsType[_models4.ApiResponseMobileStartupData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_mobile_api_hub_get_app_startup_data_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileStartupData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    async def prepare_window(
        self,
        body: _api_request_models6.MobileWindowPrepareRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobileWindowPrepareData:
        """prepare_window.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileWindowPrepareRequest
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowPrepareData. The ApiResponseMobileWindowPrepareData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowPrepareData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    async def prepare_window(
        self,
        body: _types_api_request_models6.MobileWindowPrepareRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobileWindowPrepareData:
        """prepare_window.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileWindowPrepareRequest
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowPrepareData. The ApiResponseMobileWindowPrepareData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowPrepareData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    async def prepare_window(
        self,
        body: IO[bytes],
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobileWindowPrepareData:
        """prepare_window.

        :param body: Required.
        :type body: IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowPrepareData. The ApiResponseMobileWindowPrepareData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowPrepareData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    async def prepare_window(
        self,
        body: Union[
            _api_request_models6.MobileWindowPrepareRequest,
            _types_api_request_models6.MobileWindowPrepareRequest,
            IO[bytes],
        ],
        *,
        ds: str,
        cookie: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseMobileWindowPrepareData:
        """prepare_window.

        :param body: Is either a MobileWindowPrepareRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileWindowPrepareRequest or
         ~uigf.mihoyo.api.request.types.MobileWindowPrepareRequest or IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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
        cls: ClsType[_models4.ApiResponseMobileWindowPrepareData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_mobile_api_hub_prepare_window_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileWindowPrepareData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    async def show_window(
        self,
        body: _api_request_models6.MobileWindowShowRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobileWindowShowData:
        """show_window.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileWindowShowRequest
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowShowData. The ApiResponseMobileWindowShowData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowShowData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    async def show_window(
        self,
        body: _types_api_request_models6.MobileWindowShowRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobileWindowShowData:
        """show_window.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileWindowShowRequest
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowShowData. The ApiResponseMobileWindowShowData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowShowData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    async def show_window(
        self,
        body: IO[bytes],
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobileWindowShowData:
        """show_window.

        :param body: Required.
        :type body: IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobileWindowShowData. The ApiResponseMobileWindowShowData is compatible
         with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobileWindowShowData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    async def show_window(
        self,
        body: Union[
            _api_request_models6.MobileWindowShowRequest, _types_api_request_models6.MobileWindowShowRequest, IO[bytes]
        ],
        *,
        ds: str,
        cookie: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseMobileWindowShowData:
        """show_window.

        :param body: Is either a MobileWindowShowRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileWindowShowRequest or
         ~uigf.mihoyo.api.request.types.MobileWindowShowRequest or IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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
        cls: ClsType[_models4.ApiResponseMobileWindowShowData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_mobile_api_hub_show_window_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileWindowShowData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileChatApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_chat_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_user_settings(
        self, *, ds: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileUserSettingsData:
        """get_user_settings.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileUserSettingsData] = kwargs.pop("cls", None)

        _request = build_mobile_chat_api_get_user_settings_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileUserSettingsData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileForumApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_forum_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_discussion_by_game(
        self, *, ds: str, gids: int, version: int, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileDiscussionData:
        """get_discussion_by_game.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword gids: Required.
        :paramtype gids: int
        :keyword version: Required.
        :paramtype version: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileDiscussionData] = kwargs.pop("cls", None)

        _request = build_mobile_forum_api_get_discussion_by_game_request(
            ds=ds,
            gids=gids,
            version=version,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileDiscussionData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileMiscApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_misc_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_recent_emoticons(
        self, *, ds: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileEmoticonData:
        """get_recent_emoticons.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileEmoticonData] = kwargs.pop("cls", None)

        _request = build_mobile_misc_api_get_recent_emoticons_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileEmoticonData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobilePainterApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_painter_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_feed_posts(
        self,
        *,
        ds: str,
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
        **kwargs: Any
    ) -> _models4.ApiResponseMobileFeedPostsData:
        """get_feed_posts.

        :keyword ds: Required.
        :paramtype ds: str
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

        cls: ClsType[_models4.ApiResponseMobileFeedPostsData] = kwargs.pop("cls", None)

        _request = build_mobile_painter_api_get_feed_posts_request(
            ds=ds,
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
            headers=_headers,
            params=_params,
        )
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }
        _request.url = self._client.format_url(_request.url, **path_format_arguments)

        _decompress = kwargs.pop("decompress", True)
        _stream = kwargs.pop("stream", False)
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileFeedPostsData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    async def get_user_instant_list(
        self,
        *,
        ds: str,
        game_region: str,
        game_uid: int,
        offset: int,
        size: int,
        uid: int,
        view_type: int,
        cookie: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseMobileUserInstantListData:
        """get_user_instant_list.

        :keyword ds: Required.
        :paramtype ds: str
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

        cls: ClsType[_models4.ApiResponseMobileUserInstantListData] = kwargs.pop("cls", None)

        _request = build_mobile_painter_api_get_user_instant_list_request(
            ds=ds,
            game_region=game_region,
            game_uid=game_uid,
            offset=offset,
            size=size,
            uid=uid,
            view_type=view_type,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileUserInstantListData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    async def get_villa_site_push(
        self, *, ds: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileVillaSitePushData:
        """get_villa_site_push.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileVillaSitePushData] = kwargs.pop("cls", None)

        _request = build_mobile_painter_api_get_villa_site_push_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileVillaSitePushData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobilePostApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_post_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_publish_video_permission(
        self, *, ds: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileVideoPermissionData:
        """get_publish_video_permission.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileVideoPermissionData] = kwargs.pop("cls", None)

        _request = build_mobile_post_api_get_publish_video_permission_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileVideoPermissionData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileReceptionApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_reception_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_game_center(
        self, *, ds: str, cpu: str, device: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileGameCenterData:
        """get_game_center.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cpu: Required.
        :paramtype cpu: str
        :keyword device: Required.
        :paramtype device: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileGameCenterData] = kwargs.pop("cls", None)

        _request = build_mobile_reception_api_get_game_center_request(
            ds=ds,
            cpu=cpu,
            device=device,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileGameCenterData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileTeenagerApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_teenager_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_info(
        self, *, ds: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileTeenagerInfoData:
        """get_info.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileTeenagerInfoData] = kwargs.pop("cls", None)

        _request = build_mobile_teenager_api_get_info_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileTeenagerInfoData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileTimelineApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_timeline_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_unread_info(
        self, *, ds: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileUnreadInfoData:
        """get_unread_info.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileUnreadInfoData] = kwargs.pop("cls", None)

        _request = build_mobile_timeline_api_get_unread_info_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileUnreadInfoData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobileUserApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_user_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_user_businesses(
        self, *, ds: str, uid: int, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileBusinessesData:
        """get_user_businesses.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword uid: Required.
        :paramtype uid: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileBusinessesData] = kwargs.pop("cls", None)

        _request = build_mobile_user_api_get_user_businesses_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileBusinessesData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    async def get_user_full_info(
        self, *, ds: str, uid: int, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseCommunityUser:
        """get_user_full_info.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword uid: Required.
        :paramtype uid: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseCommunityUser] = kwargs.pop("cls", None)

        _request = build_mobile_user_api_get_user_full_info_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseCommunityUser, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    async def get_notification_settings(
        self, *, ds: str, uid: int, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileNotificationSettingsData:
        """get_notification_settings.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword uid: Required.
        :paramtype uid: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileNotificationSettingsData] = kwargs.pop("cls", None)

        _request = build_mobile_user_api_get_notification_settings_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileNotificationSettingsData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    async def get_reply_permission(
        self, *, ds: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileReplyPermissionData:
        """get_reply_permission.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileReplyPermissionData] = kwargs.pop("cls", None)

        _request = build_mobile_user_api_get_reply_permission_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileReplyPermissionData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore

    @overload
    async def login(
        self,
        body: _api_request_models6.MobileLoginRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """login.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileLoginRequest
        :keyword ds: Required.
        :paramtype ds: str
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
    async def login(
        self,
        body: _types_api_request_models6.MobileLoginRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """login.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobileLoginRequest
        :keyword ds: Required.
        :paramtype ds: str
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
    async def login(
        self,
        body: IO[bytes],
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """login.

        :param body: Required.
        :type body: IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseEmptyData. The ApiResponseEmptyData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseEmptyData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    async def login(
        self,
        body: Union[_api_request_models6.MobileLoginRequest, _types_api_request_models6.MobileLoginRequest, IO[bytes]],
        *,
        ds: str,
        cookie: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseEmptyData:
        """login.

        :param body: Is either a MobileLoginRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobileLoginRequest or
         ~uigf.mihoyo.api.request.types.MobileLoginRequest or IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
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

        _request = build_mobile_user_api_login_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
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


class MobileUserInstantApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_user_instant_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_entity_review(
        self, *, ds: str, offset: int, size: int, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models4.ApiResponseMobileEntityReviewData:
        """get_entity_review.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword offset: Required.
        :paramtype offset: int
        :keyword size: Required.
        :paramtype size: int
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models4.ApiResponseMobileEntityReviewData] = kwargs.pop("cls", None)

        _request = build_mobile_user_instant_api_get_entity_review_request(
            ds=ds,
            offset=offset,
            size=size,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobileEntityReviewData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class MobilePreloadApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.MobileClient`'s
        :attr:`mobile_preload_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: MobileClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    @overload
    async def get_latest_config(
        self,
        body: _api_request_models6.MobilePreloadConfigRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobilePreloadConfigData:
        """get_latest_config.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.models.MobilePreloadConfigRequest
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobilePreloadConfigData. The ApiResponseMobilePreloadConfigData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobilePreloadConfigData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    async def get_latest_config(
        self,
        body: _types_api_request_models6.MobilePreloadConfigRequest,
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobilePreloadConfigData:
        """get_latest_config.

        :param body: Required.
        :type body: ~uigf.mihoyo.api.request.types.MobilePreloadConfigRequest
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for JSON body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobilePreloadConfigData. The ApiResponseMobilePreloadConfigData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobilePreloadConfigData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    @overload
    async def get_latest_config(
        self,
        body: IO[bytes],
        *,
        ds: str,
        cookie: Optional[str] = None,
        content_type: str = "application/json",
        **kwargs: Any
    ) -> _models4.ApiResponseMobilePreloadConfigData:
        """get_latest_config.

        :param body: Required.
        :type body: IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :keyword content_type: Body Parameter content-type. Content type parameter for binary body.
         Default value is "application/json".
        :paramtype content_type: str
        :return: ApiResponseMobilePreloadConfigData. The ApiResponseMobilePreloadConfigData is
         compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseMobilePreloadConfigData
        :raises ~corehttp.exceptions.HttpResponseError:
        """

    async def get_latest_config(
        self,
        body: Union[
            _api_request_models6.MobilePreloadConfigRequest,
            _types_api_request_models6.MobilePreloadConfigRequest,
            IO[bytes],
        ],
        *,
        ds: str,
        cookie: Optional[str] = None,
        **kwargs: Any
    ) -> _models4.ApiResponseMobilePreloadConfigData:
        """get_latest_config.

        :param body: Is either a MobilePreloadConfigRequest type or a IO[bytes] type. Required.
        :type body: ~uigf.mihoyo.api.request.models.MobilePreloadConfigRequest or
         ~uigf.mihoyo.api.request.types.MobilePreloadConfigRequest or IO[bytes]
        :keyword ds: Required.
        :paramtype ds: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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
        cls: ClsType[_models4.ApiResponseMobilePreloadConfigData] = kwargs.pop("cls", None)

        content_type = content_type or "application/json"
        _content = None
        if isinstance(body, (IOBase, bytes)):
            _content = body
        else:
            _content = json.dumps(body, cls=SdkJSONEncoder, exclude_readonly=True)  # type: ignore

        _request = build_mobile_preload_api_get_latest_config_request(
            ds=ds,
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
        pipeline_response: PipelineResponse = await self._client.pipeline.run(_request, stream=_stream, **kwargs)

        response = pipeline_response.http_response

        if response.status_code not in [200]:
            if _stream:
                try:
                    await response.read()  # Load the body in memory and close the socket
                except (StreamConsumedError, StreamClosedError):
                    pass
            map_error(status_code=response.status_code, response=response, error_map=error_map)
            raise HttpResponseError(response=response)

        if _stream:
            deserialized = response.iter_bytes() if _decompress else response.iter_raw()
        else:
            deserialized = _deserialize(_models4.ApiResponseMobilePreloadConfigData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore
