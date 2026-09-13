# coding=utf-8

from copy import deepcopy
import sys
from typing import Any

from corehttp.rest import HttpRequest, HttpResponse
from corehttp.runtime import PipelineClient, policies

from ...passport._utils.serialization import Deserializer, Serializer
from ._configuration import StaticClientConfiguration
from .operations import (
    StaticApiHubOperations,
    StaticMiscApiOperations,
    StaticPreloadApiOperations,
    StaticSearchApiOperations,
)

if sys.version_info >= (3, 11):
    from typing import Self
else:
    from typing_extensions import Self  # type: ignore


class StaticClient:  # pylint: disable=client-accepts-api-version-keyword
    """DS-protected community metadata is served from a separate static API host.

    :ivar static_api_hub: StaticApiHubOperations operations
    :vartype static_api_hub: uigf.mihoyo.passport.operations.StaticApiHubOperations
    :ivar static_misc_api: StaticMiscApiOperations operations
    :vartype static_misc_api: uigf.mihoyo.passport.operations.StaticMiscApiOperations
    :ivar static_preload_api: StaticPreloadApiOperations operations
    :vartype static_preload_api: uigf.mihoyo.passport.operations.StaticPreloadApiOperations
    :ivar static_search_api: StaticSearchApiOperations operations
    :vartype static_search_api: uigf.mihoyo.passport.operations.StaticSearchApiOperations
    :keyword endpoint: Service host. Default value is "https://bbs-api-static.miyoushe.com".
    :paramtype endpoint: str
    """

    def __init__(  # pylint: disable=missing-client-constructor-parameter-credential
        self, *, endpoint: str = "https://bbs-api-static.miyoushe.com", **kwargs: Any
    ) -> None:
        _endpoint = "{endpoint}"
        self._config = StaticClientConfiguration(endpoint=endpoint, **kwargs)

        _policies = kwargs.pop("policies", None)
        if _policies is None:
            _policies = [
                self._config.headers_policy,
                self._config.user_agent_policy,
                self._config.proxy_policy,
                policies.ContentDecodePolicy(**kwargs),
                self._config.retry_policy,
                self._config.authentication_policy,
                self._config.logging_policy,
            ]
        self._client: PipelineClient = PipelineClient(endpoint=_endpoint, policies=_policies, **kwargs)

        self._serialize = Serializer()
        self._deserialize = Deserializer()
        self._serialize.client_side_validation = False
        self.static_api_hub = StaticApiHubOperations(self._client, self._config, self._serialize, self._deserialize)
        self.static_misc_api = StaticMiscApiOperations(self._client, self._config, self._serialize, self._deserialize)
        self.static_preload_api = StaticPreloadApiOperations(
            self._client, self._config, self._serialize, self._deserialize
        )
        self.static_search_api = StaticSearchApiOperations(
            self._client, self._config, self._serialize, self._deserialize
        )

    def send_request(self, request: HttpRequest, *, stream: bool = False, **kwargs: Any) -> HttpResponse:
        """Runs the network request through the client's chained policies.

        >>> from corehttp.rest import HttpRequest
        >>> request = HttpRequest("GET", "https://www.example.org/")
        <HttpRequest [GET], url: 'https://www.example.org/'>
        >>> response = client.send_request(request)
        <HttpResponse: 200 OK>

        For more information on this code flow, see https://aka.ms/azsdk/dpcodegen/python/send_request

        :param request: The network request you want to make. Required.
        :type request: ~corehttp.rest.HttpRequest
        :keyword bool stream: Whether the response payload will be streamed. Defaults to False.
        :return: The response of your network call. Does not do error handling on your response.
        :rtype: ~corehttp.rest.HttpResponse
        """

        request_copy = deepcopy(request)
        path_format_arguments = {
            "endpoint": self._serialize.url("self._config.endpoint", self._config.endpoint, "str", skip_quote=True),
        }

        request_copy.url = self._client.format_url(request_copy.url, **path_format_arguments)
        return self._client.send_request(request_copy, stream=stream, **kwargs)  # type: ignore

    def close(self) -> None:
        self._client.close()

    def __enter__(self) -> Self:
        self._client.__enter__()
        return self

    def __exit__(self, *exc_details: Any) -> None:
        self._client.__exit__(*exc_details)
