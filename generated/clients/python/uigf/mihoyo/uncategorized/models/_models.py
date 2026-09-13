# coding=utf-8
# pylint: disable=useless-super-delegation

from typing import Any, Mapping, Optional, TYPE_CHECKING, Union, overload

from ...models import ApiResponseArray
from ...passport._utils.model_base import Model as _Model, rest_field

if TYPE_CHECKING:
    from .. import models as _models
List = list


class ComboTokenRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ComboTokenRequest.

    :ivar biz: Required.
    :vartype biz: str
    """

    biz: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        biz: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ComboTokenUploadCredentials(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ComboTokenUploadCredentials.

    :ivar access_key_id:
    :vartype access_key_id: str
    :ivar access_key_secret:
    :vartype access_key_secret: str
    :ivar bucket:
    :vartype bucket: str
    :ivar dir:
    :vartype dir: str
    :ivar endpoint:
    :vartype endpoint: str
    :ivar expire:
    :vartype expire: str
    :ivar expire_str:
    :vartype expire_str: str
    :ivar oss_callback_url:
    :vartype oss_callback_url: str
    :ivar region:
    :vartype region: str
    :ivar security_token:
    :vartype security_token: str
    """

    access_key_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    access_key_secret: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    bucket: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dir: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    endpoint: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    expire: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    expire_str: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    oss_callback_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    region: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    security_token: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        access_key_id: Optional[str] = None,
        access_key_secret: Optional[str] = None,
        bucket: Optional[str] = None,
        dir: Optional[str] = None,
        endpoint: Optional[str] = None,
        expire: Optional[str] = None,
        expire_str: Optional[str] = None,
        oss_callback_url: Optional[str] = None,
        region: Optional[str] = None,
        security_token: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ExperimentAssignment(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ExperimentAssignment.

    :ivar code:
    :vartype code: int
    :ivar config_id:
    :vartype config_id: str
    :ivar configs:
    :vartype configs: dict[str, any]
    :ivar experiment_white_list:
    :vartype experiment_white_list: bool
    :ivar period_id:
    :vartype period_id: str
    :ivar scene_white_list:
    :vartype scene_white_list: bool
    :ivar type:
    :vartype type: int
    :ivar version:
    :vartype version: str
    """

    code: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    config_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    configs: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    experiment_white_list: Optional[bool] = rest_field(
        name="experimentWhiteList", visibility=["read", "create", "update", "delete", "query"]
    )
    period_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    scene_white_list: Optional[bool] = rest_field(
        name="sceneWhiteList", visibility=["read", "create", "update", "delete", "query"]
    )
    type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        code: Optional[int] = None,
        config_id: Optional[str] = None,
        configs: Optional[dict[str, Any]] = None,
        experiment_white_list: Optional[bool] = None,
        period_id: Optional[str] = None,
        scene_white_list: Optional[bool] = None,
        type: Optional[int] = None,
        version: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ExperimentListRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ExperimentListRequest.

    :ivar app_id: Required. Is either a str type or a int type.
    :vartype app_id: str or int
    :ivar app_sign: Required.
    :vartype app_sign: str
    :ivar experiment_id:
    :vartype experiment_id: str
    :ivar params: Required.
    :vartype params: list[~uigf.mihoyo.uncategorized.models.ExperimentParameter]
    :ivar scene_id:
    :vartype scene_id: str
    :ivar uid: Required.
    :vartype uid: str
    """

    app_id: Union[str, int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required. Is either a str type or a int type."""
    app_sign: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    experiment_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    params: list["_models.ExperimentParameter"] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    scene_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    uid: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        app_id: Union[str, int],
        app_sign: str,
        params: list["_models.ExperimentParameter"],
        uid: str,
        experiment_id: Optional[str] = None,
        scene_id: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ExperimentListResponse(ApiResponseArray):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ExperimentListResponse.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: list[~uigf.mihoyo.uncategorized.models.ExperimentAssignment]
    :ivar success:
    :vartype success: bool
    """

    success: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: list["_models.ExperimentAssignment"],
        success: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ExperimentParameter(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ExperimentParameter.

    :ivar k: Required.
    :vartype k: str
    :ivar v: Required.
    :vartype v: str
    """

    k: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    v: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        k: str,
        v: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class H5LogRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """H5LogRequest.

    :ivar data: Required.
    :vartype data: str
    """

    data: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        data: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class UgcTokenInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """UgcTokenInfo.

    :ivar expire:
    :vartype expire: str
    :ivar level:
    :vartype level: str
    :ivar nickname:
    :vartype nickname: str
    :ivar region:
    :vartype region: str
    :ivar ugc_token:
    :vartype ugc_token: str
    :ivar uid:
    :vartype uid: str
    """

    expire: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    level: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    nickname: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    region: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    ugc_token: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    uid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        expire: Optional[str] = None,
        level: Optional[str] = None,
        nickname: Optional[str] = None,
        region: Optional[str] = None,
        ugc_token: Optional[str] = None,
        uid: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class UploadResponse(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """UploadResponse.

    :ivar code: Required.
    :vartype code: int
    :ivar message: Required.
    :vartype message: str
    """

    code: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        code: int,
        message: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)
