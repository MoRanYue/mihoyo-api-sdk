"""Automatic Dynamic Secret signing for generated MiHoYo clients."""

from __future__ import annotations

import hashlib
import secrets
import time
from typing import Any, Mapping
from urllib.parse import urlsplit

from corehttp.runtime.pipeline import PipelineRequest
from corehttp.runtime.policies import SansIOHTTPPolicy

from ._ds_operation_map import DS_GENERATIONS


class DsSigner:
    """Creates client options that add DS only when a generated operation omits it."""

    @staticmethod
    def create_client_options(salt: str) -> dict[str, Any]:
        """Returns keyword arguments for a synchronous or asynchronous generated client."""
        return {"per_retry_policies": [DsSigningPolicy(salt)]}

    @staticmethod
    def configure(options: Mapping[str, Any], salt: str) -> dict[str, Any]:
        """Adds DS signing while preserving caller-supplied client options and policies."""
        configured = dict(options)
        existing = configured.get("per_retry_policies")
        if existing is None:
            policies = []
        elif isinstance(existing, (list, tuple)):
            policies = list(existing)
        else:
            policies = [existing]
        policies.append(DsSigningPolicy(salt))
        configured["per_retry_policies"] = policies
        return configured


class DsSigningPolicy(SansIOHTTPPolicy):
    """Signs a DS-protected request immediately before its transport attempt."""

    def __init__(self, salt: str) -> None:
        if not salt:
            raise ValueError("DS salt must be provided by the caller.")
        self._salt = salt

    def on_request(self, request: PipelineRequest) -> None:
        http_request = request.http_request
        parsed = urlsplit(http_request.url)
        generation = DS_GENERATIONS.get(parsed.path)
        if generation is None or http_request.headers.get("DS"):
            return

        timestamp = int(time.time())
        nonce = _create_nonce(generation)
        body = _read_body(http_request.content) if generation == 2 else ""
        payload = f"salt={self._salt}&t={timestamp}&r={nonce}"
        if generation == 2:
            payload += f"&b={body}&q={_canonicalize_query(parsed.query)}"
        digest = hashlib.md5(payload.encode("utf-8")).hexdigest()
        http_request.headers["DS"] = f"{timestamp},{nonce},{digest}"


def _canonicalize_query(query: str) -> str:
    return "&".join(sorted(query.split("&"))) if query else ""


def _create_nonce(generation: int) -> str:
    if generation == 2:
        return str(secrets.randbelow(100_001) + 100_000)
    alphabet = "0123456789abcdefghijklmnopqrstuvwxyz"
    return "".join(secrets.choice(alphabet) for _ in range(6))


def _read_body(content: Any) -> str:
    if content is None:
        return ""
    if isinstance(content, str):
        return content
    if isinstance(content, (bytes, bytearray, memoryview)):
        return bytes(content).decode("utf-8")
    raise TypeError("Automatic V2 DS signing requires a serialized string or byte request body.")
