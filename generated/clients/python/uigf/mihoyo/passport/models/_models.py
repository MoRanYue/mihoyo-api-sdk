# coding=utf-8
# pylint: disable=useless-super-delegation

from typing import Any, Mapping, Optional, TYPE_CHECKING, overload

from .._utils.model_base import Model as _Model, rest_field

if TYPE_CHECKING:
    from .. import models as _models
    from ... import models as _models2
List = list


class AuthTicketLoginData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AuthTicketLoginData.

    :ivar login_ticket:
    :vartype login_ticket: str
    :ivar need_realperson:
    :vartype need_realperson: bool
    :ivar oauth_hw_open_id:
    :vartype oauth_hw_open_id: str
    :ivar reactivate_info:
    :vartype reactivate_info: ~uigf.mihoyo.passport.models.ReactivateInfo
    :ivar realname_info:
    :vartype realname_info: ~uigf.mihoyo.passport.models.RealnameInfo
    :ivar token:
    :vartype token: ~uigf.mihoyo.passport.models.LoginToken
    :ivar user_info:
    :vartype user_info: ~uigf.mihoyo.passport.models.LoginUserInfo
    """

    login_ticket: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    need_realperson: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    oauth_hw_open_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    reactivate_info: Optional["_models.ReactivateInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    realname_info: Optional["_models.RealnameInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    token: Optional["_models.LoginToken"] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    user_info: Optional["_models.LoginUserInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        login_ticket: Optional[str] = None,
        need_realperson: Optional[bool] = None,
        oauth_hw_open_id: Optional[str] = None,
        reactivate_info: Optional["_models.ReactivateInfo"] = None,
        realname_info: Optional["_models.RealnameInfo"] = None,
        token: Optional["_models.LoginToken"] = None,
        user_info: Optional["_models.LoginUserInfo"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class AuthTicketLoginRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AuthTicketLoginRequest.

    :ivar ticket: Required.
    :vartype ticket: str
    """

    ticket: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        ticket: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class DeviceContext(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
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

    device: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    device_fp: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_model: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    app_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        device: str,
        device_fp: Optional[str] = None,
        device_name: Optional[str] = None,
        device_model: Optional[str] = None,
        device_id: Optional[str] = None,
        app_id: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class AuthTicketRequest(DeviceContext):  # pylint: disable=docstring-keyword-should-match-keyword-only
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

    game_biz: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        device: str,
        game_biz: str,
        device_fp: Optional[str] = None,
        device_name: Optional[str] = None,
        device_model: Optional[str] = None,
        device_id: Optional[str] = None,
        app_id: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GameTokenRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameTokenRequest.

    :ivar account_id: Required.
    :vartype account_id: int
    :ivar game_token: Required.
    :vartype game_token: str
    """

    account_id: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    game_token: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        account_id: int,
        game_token: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class LoginCaptchaRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """LoginCaptchaRequest.

    :ivar area_code: Required.
    :vartype area_code: str
    :ivar mobile: Required.
    :vartype mobile: str
    """

    area_code: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    mobile: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        area_code: str,
        mobile: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class LoginToken(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """LoginToken.

    :ivar token:
    :vartype token: str
    :ivar token_type:
    :vartype token_type: int
    """

    token: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    token_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        token: Optional[str] = None,
        token_type: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class LoginUserInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """LoginUserInfo.

    :ivar account_name:
    :vartype account_name: str
    :ivar aid:
    :vartype aid: str
    :ivar area_code:
    :vartype area_code: str
    :ivar country:
    :vartype country: str
    :ivar email:
    :vartype email: str
    :ivar identity_code:
    :vartype identity_code: str
    :ivar is_adult:
    :vartype is_adult: int
    :ivar is_email_verify:
    :vartype is_email_verify: int
    :ivar links:
    :vartype links: list[any]
    :ivar mid:
    :vartype mid: str
    :ivar mobile:
    :vartype mobile: str
    :ivar password_time:
    :vartype password_time: str
    :ivar realname:
    :vartype realname: str
    :ivar rebind_area_code:
    :vartype rebind_area_code: str
    :ivar rebind_mobile:
    :vartype rebind_mobile: str
    :ivar rebind_mobile_time:
    :vartype rebind_mobile_time: str
    :ivar safe_area_code:
    :vartype safe_area_code: str
    :ivar safe_mobile:
    :vartype safe_mobile: str
    :ivar unmasked_email:
    :vartype unmasked_email: str
    :ivar unmasked_email_type:
    :vartype unmasked_email_type: int
    """

    account_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    aid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    area_code: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    country: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    email: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    identity_code: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_adult: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_email_verify: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    links: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    mid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    mobile: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    password_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    realname: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    rebind_area_code: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    rebind_mobile: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    rebind_mobile_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    safe_area_code: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    safe_mobile: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    unmasked_email: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    unmasked_email_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        account_name: Optional[str] = None,
        aid: Optional[str] = None,
        area_code: Optional[str] = None,
        country: Optional[str] = None,
        email: Optional[str] = None,
        identity_code: Optional[str] = None,
        is_adult: Optional[int] = None,
        is_email_verify: Optional[int] = None,
        links: Optional[list[Any]] = None,
        mid: Optional[str] = None,
        mobile: Optional[str] = None,
        password_time: Optional[str] = None,
        realname: Optional[str] = None,
        rebind_area_code: Optional[str] = None,
        rebind_mobile: Optional[str] = None,
        rebind_mobile_time: Optional[str] = None,
        safe_area_code: Optional[str] = None,
        safe_mobile: Optional[str] = None,
        unmasked_email: Optional[str] = None,
        unmasked_email_type: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileCaptchaLoginRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
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

    action_type: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    area_code: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    captcha: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    mobile: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        action_type: str,
        area_code: str,
        captcha: str,
        mobile: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class QrLoginCreateRequest(DeviceContext):  # pylint: disable=docstring-keyword-should-match-keyword-only
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

    app_id: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        device: str,
        app_id: str,
        device_fp: Optional[str] = None,
        device_name: Optional[str] = None,
        device_model: Optional[str] = None,
        device_id: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class QrLoginStatus(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """QrLoginStatus.

    :ivar stat:
    :vartype stat: str
    :ivar status:
    :vartype status: str
    :ivar payload:
    :vartype payload: ~uigf.mihoyo.models.JsonObject
    """

    stat: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    status: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    payload: Optional["_models2.JsonObject"] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        stat: Optional[str] = None,
        status: Optional[str] = None,
        payload: Optional["_models2.JsonObject"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class QrLoginStatusRequest(DeviceContext):  # pylint: disable=docstring-keyword-should-match-keyword-only
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

    ticket: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    app_id: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        device: str,
        ticket: str,
        app_id: str,
        device_fp: Optional[str] = None,
        device_name: Optional[str] = None,
        device_model: Optional[str] = None,
        device_id: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class QrLoginTicket(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """QrLoginTicket.

    :ivar ticket: Required.
    :vartype ticket: str
    :ivar url:
    :vartype url: str
    :ivar expires_in:
    :vartype expires_in: int
    """

    ticket: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    expires_in: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        ticket: str,
        url: Optional[str] = None,
        expires_in: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ReactivateInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ReactivateInfo.

    :ivar delete_after_days:
    :vartype delete_after_days: str
    :ivar deleting_biz_account:
    :vartype deleting_biz_account: bool
    :ivar reactivate_biz:
    :vartype reactivate_biz: str
    :ivar required:
    :vartype required: bool
    :ivar ticket:
    :vartype ticket: str
    """

    delete_after_days: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    deleting_biz_account: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    reactivate_biz: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    required: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    ticket: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        delete_after_days: Optional[str] = None,
        deleting_biz_account: Optional[bool] = None,
        reactivate_biz: Optional[str] = None,
        required: Optional[bool] = None,
        ticket: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class RealnameInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """RealnameInfo.

    :ivar action_ticket:
    :vartype action_ticket: str
    :ivar action_type:
    :vartype action_type: str
    :ivar required:
    :vartype required: bool
    """

    action_ticket: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    action_type: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    required: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        action_ticket: Optional[str] = None,
        action_type: Optional[str] = None,
        required: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class TokenExchangeRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """TokenExchangeRequest.

    :ivar dst_token_type: Required.
    :vartype dst_token_type: int
    :ivar mid: Required.
    :vartype mid: str
    :ivar src_token: Required.
    :vartype src_token: ~uigf.mihoyo.passport.models.LoginToken
    """

    dst_token_type: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    mid: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    src_token: "_models.LoginToken" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        dst_token_type: int,
        mid: str,
        src_token: "_models.LoginToken",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class TokenInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """TokenInfo.

    :ivar account_id:
    :vartype account_id: int
    :ivar uid:
    :vartype uid: str
    :ivar token:
    :vartype token: str
    :ivar game_token:
    :vartype game_token: str
    :ivar stoken:
    :vartype stoken: str
    :ivar ltoken:
    :vartype ltoken: str
    :ivar cookie_token:
    :vartype cookie_token: str
    :ivar mid:
    :vartype mid: str
    """

    account_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    uid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    token: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    game_token: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    stoken: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    ltoken: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    cookie_token: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    mid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        account_id: Optional[int] = None,
        uid: Optional[str] = None,
        token: Optional[str] = None,
        game_token: Optional[str] = None,
        stoken: Optional[str] = None,
        ltoken: Optional[str] = None,
        cookie_token: Optional[str] = None,
        mid: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)
