# coding=utf-8

from typing_extensions import Required, TypedDict


class AuthTicketLoginRequest(TypedDict, total=False):
    """AuthTicketLoginRequest.

    :ivar ticket: Required.
    :vartype ticket: str
    """

    ticket: Required[str]
    """Required."""


class DeviceContext(TypedDict, total=False):
    """DeviceContext.

    :ivar device: Required.
    :vartype device: str
    :ivar device_fp:
    :vartype device_fp: str
    :ivar device_name:
    :vartype device_name: str
    :ivar device_model:
    :vartype device_model: str
    :ivar device_id:
    :vartype device_id: str
    :ivar app_id:
    :vartype app_id: str
    """

    device: Required[str]
    """Required."""
    device_fp: str
    device_name: str
    device_model: str
    device_id: str
    app_id: str


class AuthTicketRequest(DeviceContext):
    """AuthTicketRequest.

    :ivar device: Required.
    :vartype device: str
    :ivar device_fp:
    :vartype device_fp: str
    :ivar device_name:
    :vartype device_name: str
    :ivar device_model:
    :vartype device_model: str
    :ivar device_id:
    :vartype device_id: str
    :ivar app_id:
    :vartype app_id: str
    :ivar game_biz: Required.
    :vartype game_biz: str
    """

    game_biz: Required[str]
    """Required."""


class GameTokenRequest(TypedDict, total=False):
    """GameTokenRequest.

    :ivar account_id: Required.
    :vartype account_id: int
    :ivar game_token: Required.
    :vartype game_token: str
    """

    account_id: Required[int]
    """Required."""
    game_token: Required[str]
    """Required."""


class LoginCaptchaRequest(TypedDict, total=False):
    """LoginCaptchaRequest.

    :ivar area_code: Required.
    :vartype area_code: str
    :ivar mobile: Required.
    :vartype mobile: str
    """

    area_code: Required[str]
    """Required."""
    mobile: Required[str]
    """Required."""


class LoginToken(TypedDict, total=False):
    """LoginToken.

    :ivar token:
    :vartype token: str
    :ivar token_type:
    :vartype token_type: int
    """

    token: str
    token_type: int


class MobileCaptchaLoginRequest(TypedDict, total=False):
    """MobileCaptchaLoginRequest.

    :ivar action_type: Required.
    :vartype action_type: str
    :ivar area_code: Required.
    :vartype area_code: str
    :ivar captcha: Required.
    :vartype captcha: str
    :ivar mobile: Required.
    :vartype mobile: str
    """

    action_type: Required[str]
    """Required."""
    area_code: Required[str]
    """Required."""
    captcha: Required[str]
    """Required."""
    mobile: Required[str]
    """Required."""


class QrLoginCreateRequest(TypedDict, total=False):
    """QrLoginCreateRequest.

    :ivar device: Required.
    :vartype device: str
    :ivar device_fp:
    :vartype device_fp: str
    :ivar device_name:
    :vartype device_name: str
    :ivar device_model:
    :vartype device_model: str
    :ivar device_id:
    :vartype device_id: str
    :ivar app_id: Required.
    :vartype app_id: str
    """

    device: Required[str]
    """Required."""
    device_fp: str
    device_name: str
    device_model: str
    device_id: str
    app_id: Required[str]
    """Required."""


class QrLoginStatusRequest(TypedDict, total=False):
    """QrLoginStatusRequest.

    :ivar device: Required.
    :vartype device: str
    :ivar device_fp:
    :vartype device_fp: str
    :ivar device_name:
    :vartype device_name: str
    :ivar device_model:
    :vartype device_model: str
    :ivar device_id:
    :vartype device_id: str
    :ivar ticket: Required.
    :vartype ticket: str
    :ivar app_id: Required.
    :vartype app_id: str
    """

    device: Required[str]
    """Required."""
    device_fp: str
    device_name: str
    device_model: str
    device_id: str
    ticket: Required[str]
    """Required."""
    app_id: Required[str]
    """Required."""


class TokenExchangeRequest(TypedDict, total=False):
    """TokenExchangeRequest.

    :ivar dst_token_type: Required.
    :vartype dst_token_type: int
    :ivar mid: Required.
    :vartype mid: str
    :ivar src_token: Required.
    :vartype src_token: "LoginToken"
    """

    dst_token_type: Required[int]
    """Required."""
    mid: Required[str]
    """Required."""
    src_token: Required["LoginToken"]
    """Required."""
