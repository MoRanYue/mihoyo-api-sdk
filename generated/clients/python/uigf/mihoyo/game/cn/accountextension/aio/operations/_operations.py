# coding=utf-8
from collections.abc import MutableMapping
from typing import Any, Callable, Optional, TypeVar

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

from ...... import models as _models5
from ......passport._utils.model_base import _deserialize
from ......passport._utils.serialization import Deserializer, Serializer
from ...operations._operations import build_patch_api_get_patch_request, build_red_dot_api_get_batch_request
from .._configuration import AccountExtensionClientConfiguration

T = TypeVar("T")
ClsType = Optional[Callable[[PipelineResponse[HttpRequest, AsyncHttpResponse], T, dict[str, Any]], Any]]
List = list


class RedDotApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.AccountExtensionClient`'s
        :attr:`red_dot_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: AccountExtensionClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_batch(
        self,
        *,
        ds: str,
        authkey: str,
        authkey_ver: int,
        game_biz: str,
        sign_type: int,
        users: str,
        cookie: Optional[str] = None,
        **kwargs: Any
    ) -> _models5.ApiResponseRedDotBatchData:
        """get_batch.

        :keyword ds: Required.
        :paramtype ds: str
        :keyword authkey: Required.
        :paramtype authkey: str
        :keyword authkey_ver: Required.
        :paramtype authkey_ver: int
        :keyword game_biz: Required.
        :paramtype game_biz: str
        :keyword sign_type: Required.
        :paramtype sign_type: int
        :keyword users: Required.
        :paramtype users: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
        :return: ApiResponseRedDotBatchData. The ApiResponseRedDotBatchData is compatible with
         MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponseRedDotBatchData
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

        cls: ClsType[_models5.ApiResponseRedDotBatchData] = kwargs.pop("cls", None)

        _request = build_red_dot_api_get_batch_request(
            ds=ds,
            authkey=authkey,
            authkey_ver=authkey_ver,
            game_biz=game_biz,
            sign_type=sign_type,
            users=users,
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
            deserialized = _deserialize(_models5.ApiResponseRedDotBatchData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class PatchApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.AccountExtensionClient`'s
        :attr:`patch_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: AccountExtensionClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_patch(
        self, *, app_id: int, app_version: str, channel: str, game_version: str, **kwargs: Any
    ) -> _models5.ApiResponsePatchData:
        """get_patch.

        :keyword app_id: Required.
        :paramtype app_id: int
        :keyword app_version: Required.
        :paramtype app_version: str
        :keyword channel: Required.
        :paramtype channel: str
        :keyword game_version: Required.
        :paramtype game_version: str
        :return: ApiResponsePatchData. The ApiResponsePatchData is compatible with MutableMapping
        :rtype: ~uigf.mihoyo.models.ApiResponsePatchData
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

        cls: ClsType[_models5.ApiResponsePatchData] = kwargs.pop("cls", None)

        _request = build_patch_api_get_patch_request(
            app_id=app_id,
            app_version=app_version,
            channel=channel,
            game_version=game_version,
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
            deserialized = _deserialize(_models5.ApiResponsePatchData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore
