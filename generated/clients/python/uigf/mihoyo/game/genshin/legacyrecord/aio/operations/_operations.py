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
from ...operations._operations import (
    build_legacy_card_api_get_game_record_card_request,
    build_web_card_api_get_game_record_card_request,
)
from .._configuration import LegacyRecordClientConfiguration

T = TypeVar("T")
ClsType = Optional[Callable[[PipelineResponse[HttpRequest, AsyncHttpResponse], T, dict[str, Any]], Any]]
List = list


class LegacyCardApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.LegacyRecordClient`'s
        :attr:`legacy_card_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: LegacyRecordClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_game_record_card(
        self, *, cookie: str, ds: str, uid: str, **kwargs: Any
    ) -> _models5.ApiResponseGenshinGameRecordCardData:
        """get_game_record_card.

        :keyword cookie: Required.
        :paramtype cookie: str
        :keyword ds: Required.
        :paramtype ds: str
        :keyword uid: Required.
        :paramtype uid: str
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

        cls: ClsType[_models5.ApiResponseGenshinGameRecordCardData] = kwargs.pop("cls", None)

        _request = build_legacy_card_api_get_game_record_card_request(
            cookie=cookie,
            ds=ds,
            uid=uid,
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
            deserialized = _deserialize(_models5.ApiResponseGenshinGameRecordCardData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore


class WebCardApiOperations:  # pylint: disable=docstring-missing-param
    """
    .. warning::
        **DO NOT** instantiate this class directly.

        Instead, you should access the following operations through
        :class:`~uigf.mihoyo.passport.aio.LegacyRecordClient`'s
        :attr:`web_card_api` attribute.
    """

    def __init__(self, *args, **kwargs) -> None:
        input_args = list(args)
        self._client: AsyncPipelineClient = input_args.pop(0) if input_args else kwargs.pop("client")
        self._config: LegacyRecordClientConfiguration = input_args.pop(0) if input_args else kwargs.pop("config")
        self._serialize: Serializer = input_args.pop(0) if input_args else kwargs.pop("serializer")
        self._deserialize: Deserializer = input_args.pop(0) if input_args else kwargs.pop("deserializer")

    async def get_game_record_card(
        self, *, uid: str, cookie: Optional[str] = None, **kwargs: Any
    ) -> _models5.ApiResponseGenshinGameRecordCardData:
        """get_game_record_card.

        :keyword uid: Required.
        :paramtype uid: str
        :keyword cookie: Default value is None.
        :paramtype cookie: str
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

        cls: ClsType[_models5.ApiResponseGenshinGameRecordCardData] = kwargs.pop("cls", None)

        _request = build_web_card_api_get_game_record_card_request(
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
            deserialized = _deserialize(_models5.ApiResponseGenshinGameRecordCardData, response.json())

        if cls:
            return cls(pipeline_response, deserialized, {})  # type: ignore

        return deserialized  # type: ignore
