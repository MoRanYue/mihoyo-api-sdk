# pylint: disable=too-many-lines
# coding=utf-8
# pylint: disable=useless-super-delegation

from typing import Any, Mapping, Optional, TYPE_CHECKING, overload

from ..passport._utils.model_base import Model as _Model, rest_field

if TYPE_CHECKING:
    from .. import models as _models
    from ..api.response import models as _api_response_models3
    from ..commerce import models as _commerce_models2
    from ..community import models as _community_models2
    from ..game import models as _game_models2
    from ..game.response import models as _game_response_models3
    from ..launcher import models as _launcher_models2
    from ..passport import models as _passport_models2
    from ..uncategorized import models as _uncategorized_models2
    from ..utility.device import models as _utility_device_models3
List = list


class Announcement(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Announcement.

    :ivar ann_id:
    :vartype ann_id: int
    :ivar title:
    :vartype title: str
    :ivar subtitle:
    :vartype subtitle: str
    :ivar banner:
    :vartype banner: str
    :ivar content:
    :vartype content: str
    :ivar start_time:
    :vartype start_time: str
    :ivar end_time:
    :vartype end_time: str
    :ivar type:
    :vartype type: int
    """

    ann_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    title: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    subtitle: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    banner: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    content: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    start_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    end_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        ann_id: Optional[int] = None,
        title: Optional[str] = None,
        subtitle: Optional[str] = None,
        banner: Optional[str] = None,
        content: Optional[str] = None,
        start_time: Optional[str] = None,
        end_time: Optional[str] = None,
        type: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class AnnouncementList(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AnnouncementList.

    :ivar list:
    :vartype list: list[~uigf.mihoyo.models.Announcement]
    :ivar alert:
    :vartype alert: bool
    """

    list: Optional[list["_models.Announcement"]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    alert: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        list: Optional[list["_models.Announcement"]] = None,
        alert: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponse(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: any
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: Any = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: Any,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseAnnouncementAlertData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.AnnouncementAlertData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.AnnouncementAlertData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.AnnouncementAlertData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseAnnouncementContentData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.AnnouncementContentData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.AnnouncementContentData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.AnnouncementContentData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseAnnouncementList(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.models.AnnouncementList
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_models.AnnouncementList" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_models.AnnouncementList",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseAnnouncementListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.AnnouncementListData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.AnnouncementListData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.AnnouncementListData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseAnnouncementPictureData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.AnnouncementPictureData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.AnnouncementPictureData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.AnnouncementPictureData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseArray(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: list[~uigf.mihoyo.uncategorized.models.ExperimentAssignment]
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: list["_uncategorized_models2.ExperimentAssignment"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: list["_uncategorized_models2.ExperimentAssignment"],
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseAuthKeyData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.AuthKeyData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.AuthKeyData" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.AuthKeyData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseAuthTicketLoginData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.passport.models.AuthTicketLoginData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_passport_models2.AuthTicketLoginData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_passport_models2.AuthTicketLoginData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseCharacterList(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.models.CharacterList
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_models2.CharacterList" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_models2.CharacterList",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseComboTokenUploadCredentials(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.uncategorized.models.ComboTokenUploadCredentials
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_uncategorized_models2.ComboTokenUploadCredentials" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_uncategorized_models2.ComboTokenUploadCredentials",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseCommunityAppConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.CommunityAppConfigData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.CommunityAppConfigData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.CommunityAppConfigData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseCommunityHomeData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.CommunityHomeData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.CommunityHomeData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.CommunityHomeData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseCommunityUser(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.models.CommunityUser
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_models.CommunityUser" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_models.CommunityUser",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseCurrencyAndCountry(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.commerce.models.CurrencyAndCountry
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_commerce_models2.CurrencyAndCountry" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_commerce_models2.CurrencyAndCountry",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseDeviceExtensionList(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.utility.device.models.DeviceExtensionList
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_utility_device_models3.DeviceExtensionList" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_utility_device_models3.DeviceExtensionList",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseDeviceFingerprint(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.models.DeviceFingerprint
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_models2.DeviceFingerprint" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_models2.DeviceFingerprint",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseEmptyData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.EmptyData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.EmptyData" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.EmptyData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseForumList(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.community.models.ForumList
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_community_models2.ForumList" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_community_models2.ForumList",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGachaLogPage(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.models.GachaLogPage
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_models.GachaLogPage" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_models.GachaLogPage",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGameRoleList(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.models.GameRoleList
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_models.GameRoleList" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_models.GameRoleList",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGateAddressData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GateAddressData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GateAddressData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GateAddressData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGcgBasicInfoData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GcgBasicInfoData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GcgBasicInfoData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GcgBasicInfoData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGcgCardBackListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GcgCardBackListData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GcgCardBackListData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GcgCardBackListData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGcgCardListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GcgCardListData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GcgCardListData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GcgCardListData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGcgChallengeRecordData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GcgChallengeRecordData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GcgChallengeRecordData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GcgChallengeRecordData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGcgChallengeScheduleData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GcgChallengeScheduleData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GcgChallengeScheduleData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GcgChallengeScheduleData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGcgCoversData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GcgCoversData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GcgCoversData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GcgCoversData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGcgDeckListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GcgDeckListData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GcgDeckListData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GcgDeckListData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGcgMatchListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GcgMatchListData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GcgMatchListData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GcgMatchListData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinActivityCalendarData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinActivityCalendarData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinActivityCalendarData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinActivityCalendarData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinCharacterMasterData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinCharacterMasterData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinCharacterMasterData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinCharacterMasterData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinDailyNoteData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinDailyNoteData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinDailyNoteData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinDailyNoteData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinExternalContentData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinExternalContentData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinExternalContentData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinExternalContentData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinGameRecordCardData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinGameRecordCardData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinGameRecordCardData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinGameRecordCardData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinRecordIndexData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinRecordIndexData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinRecordIndexData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinRecordIndexData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinRoleBasicInfoData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinRoleBasicInfoData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinRoleBasicInfoData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinRoleBasicInfoData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinSpiralAbyssData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinSpiralAbyssData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinSpiralAbyssData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinSpiralAbyssData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinStygianData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinStygianData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinStygianData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinStygianData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinStygianPopularityData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinStygianPopularityData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinStygianPopularityData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinStygianPopularityData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinTheaterData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinTheaterData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinTheaterData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinTheaterData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGenshinToolData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GenshinToolData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GenshinToolData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GenshinToolData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseGranterLoginData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.GranterLoginData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.GranterLoginData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.GranterLoginData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseJsonObject(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.models.JsonObject
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_models.JsonObject" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_models.JsonObject",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseLoginCaptchaData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.LoginCaptchaData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.LoginCaptchaData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.LoginCaptchaData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileAppSplashData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileAppSplashData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileAppSplashData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileAppSplashData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileBusinessesData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileBusinessesData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileBusinessesData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileBusinessesData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileDiscussionData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileDiscussionData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileDiscussionData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileDiscussionData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileEmoticonData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileEmoticonData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileEmoticonData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileEmoticonData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileEntityReviewData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileEntityReviewData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileEntityReviewData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileEntityReviewData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileFeedPostsData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileFeedPostsData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileFeedPostsData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileFeedPostsData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileGameCenterData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileGameCenterData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileGameCenterData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileGameCenterData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileGameListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileGameListData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileGameListData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileGameListData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileMissionsStateData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileMissionsStateData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileMissionsStateData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileMissionsStateData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileMyselfPageConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileMyselfPageConfigData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileMyselfPageConfigData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileMyselfPageConfigData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileNotificationSettingsData(
    _Model
):  # pylint: disable=name-too-long,docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileNotificationSettingsData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileNotificationSettingsData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileNotificationSettingsData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobilePreloadConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobilePreloadConfigData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobilePreloadConfigData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobilePreloadConfigData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileReplyPermissionData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileReplyPermissionData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileReplyPermissionData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileReplyPermissionData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileStartupData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileStartupData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileStartupData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileStartupData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileTeenagerInfoData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileTeenagerInfoData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileTeenagerInfoData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileTeenagerInfoData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileUnreadInfoData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileUnreadInfoData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileUnreadInfoData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileUnreadInfoData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileUnreadMessageData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileUnreadMessageData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileUnreadMessageData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileUnreadMessageData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileUserInstantListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileUserInstantListData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileUserInstantListData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileUserInstantListData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileUserSettingsData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileUserSettingsData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileUserSettingsData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileUserSettingsData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileVideoPermissionData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileVideoPermissionData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileVideoPermissionData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileVideoPermissionData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileVillaSitePushData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileVillaSitePushData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileVillaSitePushData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileVillaSitePushData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileWindowPrepareData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileWindowPrepareData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileWindowPrepareData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileWindowPrepareData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseMobileWindowShowData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.MobileWindowShowData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.MobileWindowShowData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.MobileWindowShowData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseOrderStatus(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.commerce.models.OrderStatus
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_commerce_models2.OrderStatus" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_commerce_models2.OrderStatus",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponsePandaQrResponse(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.models.PandaQrResponse
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_models2.PandaQrResponse" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_models2.PandaQrResponse",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponsePassportSwitchStatusData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.PassportSwitchStatusData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.PassportSwitchStatusData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.PassportSwitchStatusData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponsePatchData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.PatchData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.PatchData" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.PatchData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponsePost(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.community.models.Post
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_community_models2.Post" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_community_models2.Post",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponsePostList(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.community.models.PostList
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_community_models2.PostList" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_community_models2.PostList",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseQrLoginStatus(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.passport.models.QrLoginStatus
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_passport_models2.QrLoginStatus" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_passport_models2.QrLoginStatus",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseQrLoginTicket(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.passport.models.QrLoginTicket
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_passport_models2.QrLoginTicket" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_passport_models2.QrLoginTicket",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseRedDotBatchData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.RedDotBatchData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.RedDotBatchData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.RedDotBatchData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseReleaseData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.ReleaseData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.ReleaseData" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.ReleaseData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseSdkComboConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.SdkComboConfigData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.SdkComboConfigData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.SdkComboConfigData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseSdkFeCnConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.SdkFeCnConfigData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.SdkFeCnConfigData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.SdkFeCnConfigData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseSdkGranterConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.SdkGranterConfigData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.SdkGranterConfigData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.SdkGranterConfigData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseSdkPorteData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.SdkPorteData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.SdkPorteData" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.SdkPorteData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseSdkPrecacheConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.SdkPrecacheConfigData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.SdkPrecacheConfigData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.SdkPrecacheConfigData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseSdkProtocolVersionComparisonData(
    _Model
):  # pylint: disable=name-too-long,docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.SdkProtocolVersionComparisonData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.SdkProtocolVersionComparisonData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.SdkProtocolVersionComparisonData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseSdkRedDotData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.SdkRedDotData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.SdkRedDotData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.SdkRedDotData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseSdkShieldConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.SdkShieldConfigData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.SdkShieldConfigData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.SdkShieldConfigData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseShopGoods(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.commerce.models.ShopGoods
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_commerce_models2.ShopGoods" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_commerce_models2.ShopGoods",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseStaticLatestVersionData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.StaticLatestVersionData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.StaticLatestVersionData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.StaticLatestVersionData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseStaticPreKeywordData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.StaticPreKeywordData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.StaticPreKeywordData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.StaticPreKeywordData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseStaticResourceData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.StaticResourceData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.StaticResourceData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.StaticResourceData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseStaticResourceVersionsData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.StaticResourceVersionsData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.StaticResourceVersionsData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.StaticResourceVersionsData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseStrategyHomeInfoData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.StrategyHomeInfoData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.StrategyHomeInfoData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.StrategyHomeInfoData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseStrategyHomeNavbarData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.StrategyHomeNavbarData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.StrategyHomeNavbarData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.StrategyHomeNavbarData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseStrategyLatestContentData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.StrategyLatestContentData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.StrategyLatestContentData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.StrategyLatestContentData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseTokenInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.passport.models.TokenInfo
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_passport_models2.TokenInfo" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_passport_models2.TokenInfo",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseUgcTokenInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.uncategorized.models.UgcTokenInfo
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_uncategorized_models2.UgcTokenInfo" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_uncategorized_models2.UgcTokenInfo",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessAbyssSeasonTwoSummaryData(
    _Model
):  # pylint: disable=name-too-long,docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessAbyssSeasonTwoSummaryData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessAbyssSeasonTwoSummaryData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessAbyssSeasonTwoSummaryData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessAbyssSummaryData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessAbyssSummaryData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessAbyssSummaryData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessAbyssSummaryData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessActivityCalendarData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessActivityCalendarData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessActivityCalendarData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessActivityCalendarData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessClimbingTowerDetailData(
    _Model
):  # pylint: disable=name-too-long,docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessClimbingTowerDetailData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessClimbingTowerDetailData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessClimbingTowerDetailData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessDailyNoteData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessDailyNoteData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessDailyNoteData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessDailyNoteData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessDeadlyAssaultSummaryData(
    _Model
):  # pylint: disable=name-too-long,docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessDeadlyAssaultSummaryData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessDeadlyAssaultSummaryData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessDeadlyAssaultSummaryData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessExplorationDetailData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessExplorationDetailData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessExplorationDetailData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessExplorationDetailData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessFeedbackScheduleData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.api.response.models.ZenlessFeedbackScheduleData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_api_response_models3.ZenlessFeedbackScheduleData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_api_response_models3.ZenlessFeedbackScheduleData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessGachaCalendarData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessGachaCalendarData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessGachaCalendarData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessGachaCalendarData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessIndexData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessIndexData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessIndexData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessIndexData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessLedgerMonthInfoData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessLedgerMonthInfoData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessLedgerMonthInfoData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessLedgerMonthInfoData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessShiyuDefenseData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessShiyuDefenseData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessShiyuDefenseData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessShiyuDefenseData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ApiResponseZenlessThresholdSimulationPeriodSummaryData(
    _Model
):  # pylint: disable=name-too-long,docstring-keyword-should-match-keyword-only
    """Common response wrapper returned by MiHoYo and HoYoLAB services.

    :ivar retcode: Vendor result code. ``0`` normally represents success. Required.
    :vartype retcode: int
    :ivar message: Vendor diagnostic message. Required.
    :vartype message: str
    :ivar data: Endpoint-specific payload. Required.
    :vartype data: ~uigf.mihoyo.game.response.models.ZenlessThresholdSimulationPeriodSummaryData
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor result code. ``0`` normally represents success. Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Vendor diagnostic message. Required."""
    data: "_game_response_models3.ZenlessThresholdSimulationPeriodSummaryData" = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Endpoint-specific payload. Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_game_response_models3.ZenlessThresholdSimulationPeriodSummaryData",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class CommunityUser(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """A user profile returned by community-account APIs.

    :ivar uid: Required.
    :vartype uid: str
    :ivar nickname:
    :vartype nickname: str
    :ivar introduce:
    :vartype introduce: str
    :ivar avatar_url:
    :vartype avatar_url: str
    :ivar gender:
    :vartype gender: int
    :ivar level_exp:
    :vartype level_exp: ~uigf.mihoyo.models.JsonObject
    :ivar community_info:
    :vartype community_info: ~uigf.mihoyo.models.JsonObject
    """

    uid: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    nickname: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    introduce: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    avatar_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    gender: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    level_exp: Optional["_models.JsonObject"] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    community_info: Optional["_models.JsonObject"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        uid: str,
        nickname: Optional[str] = None,
        introduce: Optional[str] = None,
        avatar_url: Optional[str] = None,
        gender: Optional[int] = None,
        level_exp: Optional["_models.JsonObject"] = None,
        community_info: Optional["_models.JsonObject"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GachaItem(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GachaItem.

    :ivar uid:
    :vartype uid: str
    :ivar gacha_type:
    :vartype gacha_type: str
    :ivar item_id:
    :vartype item_id: str
    :ivar count:
    :vartype count: str
    :ivar time:
    :vartype time: str
    :ivar name:
    :vartype name: str
    :ivar item_type:
    :vartype item_type: str
    :ivar lang:
    :vartype lang: str
    :ivar op_gacha_type:
    :vartype op_gacha_type: str
    :ivar rank_type:
    :vartype rank_type: str
    :ivar id: Required.
    :vartype id: str
    """

    uid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    gacha_type: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    item_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    count: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    item_type: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    lang: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    op_gacha_type: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    rank_type: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    id: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        id: str,  # pylint: disable=redefined-builtin
        uid: Optional[str] = None,
        gacha_type: Optional[str] = None,
        item_id: Optional[str] = None,
        count: Optional[str] = None,
        time: Optional[str] = None,
        name: Optional[str] = None,
        item_type: Optional[str] = None,
        lang: Optional[str] = None,
        op_gacha_type: Optional[str] = None,
        rank_type: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GachaLogPage(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GachaLogPage.

    :ivar page:
    :vartype page: str
    :ivar size:
    :vartype size: str
    :ivar total:
    :vartype total: str
    :ivar region:
    :vartype region: str
    :ivar list: Required.
    :vartype list: list[~uigf.mihoyo.models.GachaItem]
    """

    page: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    size: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    total: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    region: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    list: list["_models.GachaItem"] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        list: list["_models.GachaItem"],
        page: Optional[str] = None,
        size: Optional[str] = None,
        total: Optional[str] = None,
        region: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GameRole(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Standard game account identity reused by record APIs.

    :ivar game_biz: Required.
    :vartype game_biz: str
    :ivar region: Required.
    :vartype region: str
    :ivar game_uid: Required.
    :vartype game_uid: str
    :ivar nickname:
    :vartype nickname: str
    :ivar level:
    :vartype level: int
    :ivar is_chosen:
    :vartype is_chosen: bool
    :ivar region_name:
    :vartype region_name: str
    :ivar game_name:
    :vartype game_name: str
    """

    game_biz: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    region: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    game_uid: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    nickname: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    level: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_chosen: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    region_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    game_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        game_biz: str,
        region: str,
        game_uid: str,
        nickname: Optional[str] = None,
        level: Optional[int] = None,
        is_chosen: Optional[bool] = None,
        region_name: Optional[str] = None,
        game_name: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GameRoleList(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameRoleList.

    :ivar list: Required.
    :vartype list: list[~uigf.mihoyo.models.GameRole]
    """

    list: list["_models.GameRole"] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        list: list["_models.GameRole"],
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class JsonObject(_Model):
    """A JSON object whose vendor-defined properties are preserved by generated clients."""


class LauncherResponseGameBasicInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common envelope used by the HoYoPlay and Sophon APIs.

    :ivar retcode: Required.
    :vartype retcode: int
    :ivar message: Required.
    :vartype message: str
    :ivar data: Required.
    :vartype data: ~uigf.mihoyo.launcher.models.GameBasicInfo
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    data: "_launcher_models2.GameBasicInfo" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_launcher_models2.GameBasicInfo",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class LauncherResponseJsonObject(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Common envelope used by the HoYoPlay and Sophon APIs.

    :ivar retcode: Required.
    :vartype retcode: int
    :ivar message: Required.
    :vartype message: str
    :ivar data: Required.
    :vartype data: ~uigf.mihoyo.models.JsonObject
    """

    retcode: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    message: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    data: "_models.JsonObject" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        retcode: int,
        message: str,
        data: "_models.JsonObject",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)
