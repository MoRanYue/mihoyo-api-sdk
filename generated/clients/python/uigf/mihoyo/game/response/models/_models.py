# pylint: disable=too-many-lines
# coding=utf-8
# pylint: disable=useless-super-delegation

from typing import Any, Mapping, Optional, TYPE_CHECKING, overload

from ....passport._utils.model_base import Model as _Model, rest_field

if TYPE_CHECKING:
    from .. import models as _models
List = list


class AnnouncementAlertData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Genshin announcement alert state shared by regular and UGC announcements.

    :ivar alert:
    :vartype alert: bool
    :ivar alert_id:
    :vartype alert_id: int
    :ivar extra_remind:
    :vartype extra_remind: bool
    :ivar remind:
    :vartype remind: bool
    :ivar remind_text:
    :vartype remind_text: str
    """

    alert: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    alert_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    extra_remind: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    remind: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    remind_text: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        alert: Optional[bool] = None,
        alert_id: Optional[int] = None,
        extra_remind: Optional[bool] = None,
        remind: Optional[bool] = None,
        remind_text: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class AnnouncementCalendarType(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AnnouncementCalendarType.

    :ivar enabled:
    :vartype enabled: bool
    :ivar mi18_n_name:
    :vartype mi18_n_name: str
    :ivar remind:
    :vartype remind: bool
    """

    enabled: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    mi18_n_name: Optional[str] = rest_field(
        name="mi18n_name", visibility=["read", "create", "update", "delete", "query"]
    )
    remind: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        enabled: Optional[bool] = None,
        mi18_n_name: Optional[str] = None,
        remind: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class AnnouncementContentData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AnnouncementContentData.

    :ivar list:
    :vartype list: list[~uigf.mihoyo.game.response.models.AnnouncementContentItem]
    :ivar pic_list:
    :vartype pic_list: list[any]
    :ivar pic_total:
    :vartype pic_total: int
    :ivar total:
    :vartype total: int
    """

    list: Optional[list["_models.AnnouncementContentItem"]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    pic_list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    pic_total: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    total: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        list: Optional[list["_models.AnnouncementContentItem"]] = None,
        pic_list: Optional[list[Any]] = None,
        pic_total: Optional[int] = None,
        total: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class AnnouncementContentItem(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AnnouncementContentItem.

    :ivar ann_id:
    :vartype ann_id: int
    :ivar banner:
    :vartype banner: str
    :ivar content:
    :vartype content: str
    :ivar lang:
    :vartype lang: str
    :ivar remind_text:
    :vartype remind_text: str
    :ivar subtitle:
    :vartype subtitle: str
    :ivar title:
    :vartype title: str
    """

    ann_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    banner: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    content: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    lang: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    remind_text: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    subtitle: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    title: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        ann_id: Optional[int] = None,
        banner: Optional[str] = None,
        content: Optional[str] = None,
        lang: Optional[str] = None,
        remind_text: Optional[str] = None,
        subtitle: Optional[str] = None,
        title: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class AnnouncementGroup(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AnnouncementGroup.

    :ivar list:
    :vartype list: list[~uigf.mihoyo.game.response.models.AnnouncementItem]
    :ivar type_id:
    :vartype type_id: int
    :ivar type_label:
    :vartype type_label: str
    """

    list: Optional[list["_models.AnnouncementItem"]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    type_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    type_label: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        list: Optional[list["_models.AnnouncementItem"]] = None,
        type_id: Optional[int] = None,
        type_label: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class AnnouncementItem(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AnnouncementItem.

    :ivar alert:
    :vartype alert: int
    :ivar ann_id:
    :vartype ann_id: int
    :ivar banner:
    :vartype banner: str
    :ivar content:
    :vartype content: str
    :ivar country:
    :vartype country: str
    :ivar end_time:
    :vartype end_time: str
    :ivar extra_remind:
    :vartype extra_remind: int
    :ivar has_content:
    :vartype has_content: bool
    :ivar lang:
    :vartype lang: str
    :ivar login_alert:
    :vartype login_alert: int
    :ivar logout_remind:
    :vartype logout_remind: int
    :ivar logout_remind_ver:
    :vartype logout_remind_ver: int
    :ivar need_remind_text:
    :vartype need_remind_text: int
    :ivar remind:
    :vartype remind: int
    :ivar remind_consumption_type:
    :vartype remind_consumption_type: int
    :ivar remind_text:
    :vartype remind_text: str
    :ivar remind_ver:
    :vartype remind_ver: int
    :ivar start_time:
    :vartype start_time: str
    :ivar subtitle:
    :vartype subtitle: str
    :ivar tag_end_time:
    :vartype tag_end_time: str
    :ivar tag_icon:
    :vartype tag_icon: str
    :ivar tag_icon_hover:
    :vartype tag_icon_hover: str
    :ivar tag_label:
    :vartype tag_label: str
    :ivar tag_start_time:
    :vartype tag_start_time: str
    :ivar title:
    :vartype title: str
    :ivar type:
    :vartype type: int
    :ivar type_label:
    :vartype type_label: str
    :ivar weak_remind:
    :vartype weak_remind: int
    """

    alert: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    ann_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    banner: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    content: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    country: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    end_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    extra_remind: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    has_content: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    lang: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    login_alert: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    logout_remind: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    logout_remind_ver: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    need_remind_text: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    remind: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    remind_consumption_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    remind_text: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    remind_ver: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    start_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    subtitle: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    tag_end_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    tag_icon: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    tag_icon_hover: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    tag_label: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    tag_start_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    title: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    type_label: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    weak_remind: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(  # pylint: disable=too-many-locals
        self,
        *,
        alert: Optional[int] = None,
        ann_id: Optional[int] = None,
        banner: Optional[str] = None,
        content: Optional[str] = None,
        country: Optional[str] = None,
        end_time: Optional[str] = None,
        extra_remind: Optional[int] = None,
        has_content: Optional[bool] = None,
        lang: Optional[str] = None,
        login_alert: Optional[int] = None,
        logout_remind: Optional[int] = None,
        logout_remind_ver: Optional[int] = None,
        need_remind_text: Optional[int] = None,
        remind: Optional[int] = None,
        remind_consumption_type: Optional[int] = None,
        remind_text: Optional[str] = None,
        remind_ver: Optional[int] = None,
        start_time: Optional[str] = None,
        subtitle: Optional[str] = None,
        tag_end_time: Optional[str] = None,
        tag_icon: Optional[str] = None,
        tag_icon_hover: Optional[str] = None,
        tag_label: Optional[str] = None,
        tag_start_time: Optional[str] = None,
        title: Optional[str] = None,
        type: Optional[int] = None,
        type_label: Optional[str] = None,
        weak_remind: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class AnnouncementListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AnnouncementListData.

    :ivar alert:
    :vartype alert: bool
    :ivar alert_id:
    :vartype alert_id: int
    :ivar banner:
    :vartype banner: str
    :ivar calendar_type:
    :vartype calendar_type: ~uigf.mihoyo.game.response.models.AnnouncementCalendarType
    :ivar list:
    :vartype list: list[~uigf.mihoyo.game.response.models.AnnouncementGroup]
    :ivar pic_alert:
    :vartype pic_alert: bool
    :ivar pic_alert_id:
    :vartype pic_alert_id: int
    :ivar pic_list:
    :vartype pic_list: list[any]
    :ivar pic_total:
    :vartype pic_total: int
    :ivar pic_type_list:
    :vartype pic_type_list: list[any]
    :ivar static_sign:
    :vartype static_sign: str
    :ivar t:
    :vartype t: str
    :ivar timezone:
    :vartype timezone: int
    :ivar total:
    :vartype total: int
    :ivar type_list:
    :vartype type_list: list[~uigf.mihoyo.game.response.models.AnnouncementType]
    :ivar use_webp:
    :vartype use_webp: str
    """

    alert: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    alert_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    banner: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    calendar_type: Optional["_models.AnnouncementCalendarType"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    list: Optional[list["_models.AnnouncementGroup"]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    pic_alert: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    pic_alert_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    pic_list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    pic_total: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    pic_type_list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    static_sign: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    t: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    timezone: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    total: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    type_list: Optional[list["_models.AnnouncementType"]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    use_webp: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        alert: Optional[bool] = None,
        alert_id: Optional[int] = None,
        banner: Optional[str] = None,
        calendar_type: Optional["_models.AnnouncementCalendarType"] = None,
        list: Optional[list["_models.AnnouncementGroup"]] = None,
        pic_alert: Optional[bool] = None,
        pic_alert_id: Optional[int] = None,
        pic_list: Optional[list[Any]] = None,
        pic_total: Optional[int] = None,
        pic_type_list: Optional[list[Any]] = None,
        static_sign: Optional[str] = None,
        t: Optional[str] = None,
        timezone: Optional[int] = None,
        total: Optional[int] = None,
        type_list: Optional[list["_models.AnnouncementType"]] = None,
        use_webp: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class AnnouncementPictureData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AnnouncementPictureData.

    :ivar list:
    :vartype list: list[any]
    :ivar total:
    :vartype total: int
    """

    list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    total: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        list: Optional[list[Any]] = None,
        total: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class AnnouncementType(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AnnouncementType.

    :ivar id:
    :vartype id: int
    :ivar mi18_n_name:
    :vartype mi18_n_name: str
    :ivar name:
    :vartype name: str
    """

    id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    mi18_n_name: Optional[str] = rest_field(
        name="mi18n_name", visibility=["read", "create", "update", "delete", "query"]
    )
    name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        id: Optional[int] = None,  # pylint: disable=redefined-builtin
        mi18_n_name: Optional[str] = None,
        name: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GateAddress(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Gateway IP and port candidates returned by the CN dispatch service.

    :ivar ip:
    :vartype ip: str
    :ivar port:
    :vartype port: int
    """

    ip: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    port: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        ip: Optional[str] = None,
        port: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GateAddressData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GateAddressData.

    :ivar address_list:
    :vartype address_list: list[~uigf.mihoyo.game.response.models.GateAddress]
    """

    address_list: Optional[list["_models.GateAddress"]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        address_list: Optional[list["_models.GateAddress"]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GcgBasicInfoData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GcgBasicInfoData.

    :ivar action_card_num_gained:
    :vartype action_card_num_gained: int
    :ivar action_card_num_total:
    :vartype action_card_num_total: int
    :ivar avatar_card_num_gained:
    :vartype avatar_card_num_gained: int
    :ivar avatar_card_num_total:
    :vartype avatar_card_num_total: int
    :ivar challenge_basic:
    :vartype challenge_basic: dict[str, any]
    :ivar covers:
    :vartype covers: list[dict[str, any]]
    :ivar hornor_character:
    :vartype hornor_character: any
    :ivar is_hide_covers:
    :vartype is_hide_covers: bool
    :ivar is_hide_replays:
    :vartype is_hide_replays: bool
    :ivar level:
    :vartype level: int
    :ivar nickname:
    :vartype nickname: str
    :ivar replays:
    :vartype replays: list[dict[str, any]]
    """

    action_card_num_gained: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    action_card_num_total: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    avatar_card_num_gained: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    avatar_card_num_total: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    challenge_basic: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    covers: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    hornor_character: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_hide_covers: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_hide_replays: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    level: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    nickname: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    replays: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        action_card_num_gained: Optional[int] = None,
        action_card_num_total: Optional[int] = None,
        avatar_card_num_gained: Optional[int] = None,
        avatar_card_num_total: Optional[int] = None,
        challenge_basic: Optional[dict[str, Any]] = None,
        covers: Optional[list[dict[str, Any]]] = None,
        hornor_character: Optional[Any] = None,
        is_hide_covers: Optional[bool] = None,
        is_hide_replays: Optional[bool] = None,
        level: Optional[int] = None,
        nickname: Optional[str] = None,
        replays: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GcgCardBackListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GcgCardBackListData.

    :ivar card_back_list:
    :vartype card_back_list: list[dict[str, any]]
    """

    card_back_list: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        card_back_list: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GcgCardListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GcgCardListData.

    :ivar card_list:
    :vartype card_list: list[dict[str, any]]
    :ivar is_last:
    :vartype is_last: bool
    :ivar next_offset:
    :vartype next_offset: int
    :ivar stats:
    :vartype stats: dict[str, any]
    """

    card_list: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_last: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    next_offset: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    stats: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        card_list: Optional[list[dict[str, Any]]] = None,
        is_last: Optional[bool] = None,
        next_offset: Optional[int] = None,
        stats: Optional[dict[str, Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GcgChallengeRecordData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GcgChallengeRecordData.

    :ivar basic:
    :vartype basic: dict[str, any]
    :ivar deck_list:
    :vartype deck_list: list[any]
    :ivar honor_character:
    :vartype honor_character: list[any]
    :ivar recommend_url:
    :vartype recommend_url: str
    """

    basic: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    deck_list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    honor_character: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    recommend_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        basic: Optional[dict[str, Any]] = None,
        deck_list: Optional[list[Any]] = None,
        honor_character: Optional[list[Any]] = None,
        recommend_url: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GcgChallengeScheduleData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GcgChallengeScheduleData.

    :ivar schedule_list:
    :vartype schedule_list: list[dict[str, any]]
    """

    schedule_list: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        schedule_list: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GcgCoversData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GcgCoversData.

    :ivar covers:
    :vartype covers: list[dict[str, any]]
    """

    covers: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        covers: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GcgDeckListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GcgDeckListData.

    :ivar deck_list:
    :vartype deck_list: list[dict[str, any]]
    :ivar level:
    :vartype level: int
    :ivar nickname:
    :vartype nickname: str
    :ivar role_id:
    :vartype role_id: str
    """

    deck_list: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    level: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    nickname: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    role_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        deck_list: Optional[list[dict[str, Any]]] = None,
        level: Optional[int] = None,
        nickname: Optional[str] = None,
        role_id: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GcgMatchListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GcgMatchListData.

    :ivar favourite_matches:
    :vartype favourite_matches: list[any]
    :ivar recent_matches:
    :vartype recent_matches: list[dict[str, any]]
    """

    favourite_matches: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    recent_matches: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        favourite_matches: Optional[list[Any]] = None,
        recent_matches: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinActivityCalendarData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinActivityCalendarData.

    :ivar act_list:
    :vartype act_list: list[dict[str, any]]
    :ivar avatar_card_pool_list:
    :vartype avatar_card_pool_list: list[dict[str, any]]
    :ivar fixed_act_list:
    :vartype fixed_act_list: list[dict[str, any]]
    :ivar mixed_card_pool_list:
    :vartype mixed_card_pool_list: list[any]
    :ivar selected_act_list:
    :vartype selected_act_list: list[dict[str, any]]
    :ivar selected_avatar_card_pool_list:
    :vartype selected_avatar_card_pool_list: list[dict[str, any]]
    :ivar selected_mixed_card_pool_list:
    :vartype selected_mixed_card_pool_list: list[any]
    :ivar weapon_card_pool_list:
    :vartype weapon_card_pool_list: list[dict[str, any]]
    """

    act_list: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    avatar_card_pool_list: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    fixed_act_list: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    mixed_card_pool_list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    selected_act_list: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    selected_avatar_card_pool_list: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    selected_mixed_card_pool_list: Optional[list[Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    weapon_card_pool_list: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        act_list: Optional[list[dict[str, Any]]] = None,
        avatar_card_pool_list: Optional[list[dict[str, Any]]] = None,
        fixed_act_list: Optional[list[dict[str, Any]]] = None,
        mixed_card_pool_list: Optional[list[Any]] = None,
        selected_act_list: Optional[list[dict[str, Any]]] = None,
        selected_avatar_card_pool_list: Optional[list[dict[str, Any]]] = None,
        selected_mixed_card_pool_list: Optional[list[Any]] = None,
        weapon_card_pool_list: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinCharacterMasterData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinCharacterMasterData.

    :ivar is_unlock:
    :vartype is_unlock: bool
    :ivar list:
    :vartype list: list[dict[str, any]]
    """

    is_unlock: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    list: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        is_unlock: Optional[bool] = None,
        list: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinDailyNoteData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinDailyNoteData.

    :ivar archon_quest_progress:
    :vartype archon_quest_progress: dict[str, any]
    :ivar calendar_url:
    :vartype calendar_url: str
    :ivar current_expedition_num:
    :vartype current_expedition_num: int
    :ivar current_home_coin:
    :vartype current_home_coin: int
    :ivar current_resin:
    :vartype current_resin: int
    :ivar daily_task:
    :vartype daily_task: dict[str, any]
    :ivar expeditions:
    :vartype expeditions: list[dict[str, any]]
    :ivar finished_task_num:
    :vartype finished_task_num: int
    :ivar home_coin_recovery_time:
    :vartype home_coin_recovery_time: str
    :ivar is_extra_task_reward_received:
    :vartype is_extra_task_reward_received: bool
    :ivar max_expedition_num:
    :vartype max_expedition_num: int
    :ivar max_home_coin:
    :vartype max_home_coin: int
    :ivar max_resin:
    :vartype max_resin: int
    :ivar remain_resin_discount_num:
    :vartype remain_resin_discount_num: int
    :ivar resin_discount_num_limit:
    :vartype resin_discount_num_limit: int
    :ivar resin_recovery_time:
    :vartype resin_recovery_time: str
    :ivar total_task_num:
    :vartype total_task_num: int
    :ivar transformer:
    :vartype transformer: dict[str, any]
    :ivar week_active_progress:
    :vartype week_active_progress: dict[str, any]
    """

    archon_quest_progress: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    calendar_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    current_expedition_num: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    current_home_coin: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    current_resin: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    daily_task: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    expeditions: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    finished_task_num: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    home_coin_recovery_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_extra_task_reward_received: Optional[bool] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    max_expedition_num: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    max_home_coin: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    max_resin: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    remain_resin_discount_num: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    resin_discount_num_limit: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    resin_recovery_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    total_task_num: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    transformer: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    week_active_progress: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        archon_quest_progress: Optional[dict[str, Any]] = None,
        calendar_url: Optional[str] = None,
        current_expedition_num: Optional[int] = None,
        current_home_coin: Optional[int] = None,
        current_resin: Optional[int] = None,
        daily_task: Optional[dict[str, Any]] = None,
        expeditions: Optional[list[dict[str, Any]]] = None,
        finished_task_num: Optional[int] = None,
        home_coin_recovery_time: Optional[str] = None,
        is_extra_task_reward_received: Optional[bool] = None,
        max_expedition_num: Optional[int] = None,
        max_home_coin: Optional[int] = None,
        max_resin: Optional[int] = None,
        remain_resin_discount_num: Optional[int] = None,
        resin_discount_num_limit: Optional[int] = None,
        resin_recovery_time: Optional[str] = None,
        total_task_num: Optional[int] = None,
        transformer: Optional[dict[str, Any]] = None,
        week_active_progress: Optional[dict[str, Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinExternalContentData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinExternalContentData.

    :ivar caculator_url:
    :vartype caculator_url: str
    :ivar lineup_url:
    :vartype lineup_url: str
    :ivar strategy_url:
    :vartype strategy_url: str
    :ivar wiki_url:
    :vartype wiki_url: str
    """

    caculator_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    lineup_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    strategy_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    wiki_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        caculator_url: Optional[str] = None,
        lineup_url: Optional[str] = None,
        strategy_url: Optional[str] = None,
        wiki_url: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinGameRecordCardData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinGameRecordCardData.

    :ivar list:
    :vartype list: list[dict[str, any]]
    """

    list: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        list: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinRecordIndexData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinRecordIndexData.

    :ivar avatars:
    :vartype avatars: list[dict[str, any]]
    :ivar city_explorations:
    :vartype city_explorations: list[any]
    :ivar homes:
    :vartype homes: list[dict[str, any]]
    :ivar query_tool_image:
    :vartype query_tool_image: str
    :ivar query_tool_link:
    :vartype query_tool_link: str
    :ivar role:
    :vartype role: ~uigf.mihoyo.game.response.models.GenshinRecordRole
    :ivar stats:
    :vartype stats: dict[str, any]
    :ivar world_exploration_display:
    :vartype world_exploration_display: list[dict[str, any]]
    :ivar world_explorations:
    :vartype world_explorations: list[dict[str, any]]
    """

    avatars: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    city_explorations: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    homes: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    query_tool_image: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    query_tool_link: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    role: Optional["_models.GenshinRecordRole"] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    stats: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    world_exploration_display: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    world_explorations: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        avatars: Optional[list[dict[str, Any]]] = None,
        city_explorations: Optional[list[Any]] = None,
        homes: Optional[list[dict[str, Any]]] = None,
        query_tool_image: Optional[str] = None,
        query_tool_link: Optional[str] = None,
        role: Optional["_models.GenshinRecordRole"] = None,
        stats: Optional[dict[str, Any]] = None,
        world_exploration_display: Optional[list[dict[str, Any]]] = None,
        world_explorations: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinRecordRole(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinRecordRole.

    :ivar avatar_url:
    :vartype avatar_url: str
    :ivar game_head_icon:
    :vartype game_head_icon: str
    :ivar level:
    :vartype level: int
    :ivar nickname:
    :vartype nickname: str
    :ivar region:
    :vartype region: str
    """

    avatar_url: Optional[str] = rest_field(name="AvatarUrl", visibility=["read", "create", "update", "delete", "query"])
    game_head_icon: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    level: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    nickname: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    region: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        avatar_url: Optional[str] = None,
        game_head_icon: Optional[str] = None,
        level: Optional[int] = None,
        nickname: Optional[str] = None,
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


class GenshinRoleBasicInfoData(GenshinRecordRole):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinRoleBasicInfoData.

    :ivar avatar_url:
    :vartype avatar_url: str
    :ivar game_head_icon:
    :vartype game_head_icon: str
    :ivar level:
    :vartype level: int
    :ivar nickname:
    :vartype nickname: str
    :ivar region:
    :vartype region: str
    :ivar card_play_level:
    :vartype card_play_level: int
    """

    card_play_level: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        avatar_url: Optional[str] = None,
        game_head_icon: Optional[str] = None,
        level: Optional[int] = None,
        nickname: Optional[str] = None,
        region: Optional[str] = None,
        card_play_level: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinSpiralAbyssData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinSpiralAbyssData.

    :ivar damage_rank:
    :vartype damage_rank: list[any]
    :ivar defeat_rank:
    :vartype defeat_rank: list[any]
    :ivar end_time:
    :vartype end_time: str
    :ivar energy_skill_rank:
    :vartype energy_skill_rank: list[any]
    :ivar floors:
    :vartype floors: list[any]
    :ivar is_just_skipped_floor:
    :vartype is_just_skipped_floor: bool
    :ivar is_unlock:
    :vartype is_unlock: bool
    :ivar max_floor:
    :vartype max_floor: str
    :ivar normal_skill_rank:
    :vartype normal_skill_rank: list[any]
    :ivar reveal_rank:
    :vartype reveal_rank: list[any]
    :ivar schedule_id:
    :vartype schedule_id: int
    :ivar skipped_floor:
    :vartype skipped_floor: str
    :ivar start_time:
    :vartype start_time: str
    :ivar take_damage_rank:
    :vartype take_damage_rank: list[any]
    :ivar total_battle_times:
    :vartype total_battle_times: int
    :ivar total_star:
    :vartype total_star: int
    :ivar total_win_times:
    :vartype total_win_times: int
    """

    damage_rank: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    defeat_rank: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    end_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    energy_skill_rank: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    floors: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_just_skipped_floor: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_unlock: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    max_floor: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    normal_skill_rank: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    reveal_rank: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    schedule_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    skipped_floor: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    start_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    take_damage_rank: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    total_battle_times: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    total_star: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    total_win_times: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        damage_rank: Optional[list[Any]] = None,
        defeat_rank: Optional[list[Any]] = None,
        end_time: Optional[str] = None,
        energy_skill_rank: Optional[list[Any]] = None,
        floors: Optional[list[Any]] = None,
        is_just_skipped_floor: Optional[bool] = None,
        is_unlock: Optional[bool] = None,
        max_floor: Optional[str] = None,
        normal_skill_rank: Optional[list[Any]] = None,
        reveal_rank: Optional[list[Any]] = None,
        schedule_id: Optional[int] = None,
        skipped_floor: Optional[str] = None,
        start_time: Optional[str] = None,
        take_damage_rank: Optional[list[Any]] = None,
        total_battle_times: Optional[int] = None,
        total_star: Optional[int] = None,
        total_win_times: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinStygianData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinStygianData.

    :ivar data:
    :vartype data: list[dict[str, any]]
    :ivar is_unlock:
    :vartype is_unlock: bool
    :ivar links:
    :vartype links: dict[str, any]
    """

    data: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_unlock: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    links: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        data: Optional[list[dict[str, Any]]] = None,
        is_unlock: Optional[bool] = None,
        links: Optional[dict[str, Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinStygianPopularityData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinStygianPopularityData.

    :ivar avatar_list:
    :vartype avatar_list: list[dict[str, any]]
    """

    avatar_list: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        avatar_list: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinTheaterData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinTheaterData.

    :ivar data:
    :vartype data: list[dict[str, any]]
    :ivar is_unlock:
    :vartype is_unlock: bool
    :ivar links:
    :vartype links: dict[str, any]
    :ivar tarot_card_state:
    :vartype tarot_card_state: dict[str, any]
    """

    data: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_unlock: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    links: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    tarot_card_state: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        data: Optional[list[dict[str, Any]]] = None,
        is_unlock: Optional[bool] = None,
        links: Optional[dict[str, Any]] = None,
        tarot_card_state: Optional[dict[str, Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GenshinToolData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GenshinToolData.

    :ivar tools:
    :vartype tools: list[dict[str, any]]
    """

    tools: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        tools: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GranterFatigueRemind(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GranterFatigueRemind.

    :ivar durations:
    :vartype durations: list[int]
    :ivar nickname:
    :vartype nickname: str
    :ivar reset_point:
    :vartype reset_point: int
    """

    durations: Optional[list[int]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    nickname: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    reset_point: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        durations: Optional[list[int]] = None,
        nickname: Optional[str] = None,
        reset_point: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GranterLoginData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GranterLoginData.

    :ivar account_type:
    :vartype account_type: int
    :ivar combo_id:
    :vartype combo_id: str
    :ivar combo_token:
    :vartype combo_token: str
    :ivar data:
    :vartype data: str
    :ivar fatigue_remind:
    :vartype fatigue_remind: ~uigf.mihoyo.game.response.models.GranterFatigueRemind
    :ivar heartbeat:
    :vartype heartbeat: bool
    :ivar open_id:
    :vartype open_id: str
    """

    account_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    combo_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    combo_token: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    data: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    fatigue_remind: Optional["_models.GranterFatigueRemind"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    heartbeat: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    open_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        account_type: Optional[int] = None,
        combo_id: Optional[str] = None,
        combo_token: Optional[str] = None,
        data: Optional[str] = None,
        fatigue_remind: Optional["_models.GranterFatigueRemind"] = None,
        heartbeat: Optional[bool] = None,
        open_id: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkComboConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """Genshin SDK bootstrap configuration payloads. Dynamic settings remain maps.

    :ivar vals:
    :vartype vals: dict[str, str]
    """

    vals: Optional[dict[str, str]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        vals: Optional[dict[str, str]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkGranterConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkGranterConfigData.

    :ivar announce_url:
    :vartype announce_url: str
    :ivar app_name:
    :vartype app_name: str
    :ivar disable_ysdk_guard:
    :vartype disable_ysdk_guard: bool
    :ivar enable_announce_pic_popup:
    :vartype enable_announce_pic_popup: bool
    :ivar enable_user_center:
    :vartype enable_user_center: bool
    :ivar functional_switch_configs:
    :vartype functional_switch_configs: dict[str, any]
    :ivar log_level:
    :vartype log_level: str
    :ivar protocol:
    :vartype protocol: bool
    :ivar push_alias_type:
    :vartype push_alias_type: int
    :ivar qr_app_icons:
    :vartype qr_app_icons: ~uigf.mihoyo.game.response.models.SdkGranterQrAppIcons
    :ivar qr_cloud_display_name:
    :vartype qr_cloud_display_name: str
    :ivar qr_enabled:
    :vartype qr_enabled: bool
    :ivar qr_enabled_apps:
    :vartype qr_enabled_apps: ~uigf.mihoyo.game.response.models.SdkGranterQrEnabledApps
    :ivar ugc_protocol:
    :vartype ugc_protocol: bool
    :ivar widget_config:
    :vartype widget_config: any
    """

    announce_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    app_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    disable_ysdk_guard: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    enable_announce_pic_popup: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    enable_user_center: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    functional_switch_configs: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    log_level: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    protocol: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    push_alias_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    qr_app_icons: Optional["_models.SdkGranterQrAppIcons"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    qr_cloud_display_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    qr_enabled: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    qr_enabled_apps: Optional["_models.SdkGranterQrEnabledApps"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    ugc_protocol: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    widget_config: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        announce_url: Optional[str] = None,
        app_name: Optional[str] = None,
        disable_ysdk_guard: Optional[bool] = None,
        enable_announce_pic_popup: Optional[bool] = None,
        enable_user_center: Optional[bool] = None,
        functional_switch_configs: Optional[dict[str, Any]] = None,
        log_level: Optional[str] = None,
        protocol: Optional[bool] = None,
        push_alias_type: Optional[int] = None,
        qr_app_icons: Optional["_models.SdkGranterQrAppIcons"] = None,
        qr_cloud_display_name: Optional[str] = None,
        qr_enabled: Optional[bool] = None,
        qr_enabled_apps: Optional["_models.SdkGranterQrEnabledApps"] = None,
        ugc_protocol: Optional[bool] = None,
        widget_config: Optional[Any] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkGranterQrAppIcons(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkGranterQrAppIcons.

    :ivar app:
    :vartype app: str
    :ivar bbs:
    :vartype bbs: str
    :ivar cloud:
    :vartype cloud: str
    """

    app: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    bbs: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    cloud: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        app: Optional[str] = None,
        bbs: Optional[str] = None,
        cloud: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkGranterQrEnabledApps(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkGranterQrEnabledApps.

    :ivar bbs:
    :vartype bbs: bool
    :ivar cloud:
    :vartype cloud: bool
    """

    bbs: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    cloud: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        bbs: Optional[bool] = None,
        cloud: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkPrecacheConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkPrecacheConfigData.

    :ivar vals:
    :vartype vals: dict[str, str]
    """

    vals: Optional[dict[str, str]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        vals: Optional[dict[str, str]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkProtocolVersion(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkProtocolVersion.

    :ivar app_id:
    :vartype app_id: int
    :ivar create_time:
    :vartype create_time: str
    :ivar full_priv_proto:
    :vartype full_priv_proto: str
    :ivar id:
    :vartype id: int
    :ivar language:
    :vartype language: str
    :ivar major:
    :vartype major: int
    :ivar minimum:
    :vartype minimum: int
    :ivar priv_proto:
    :vartype priv_proto: str
    :ivar teenager_proto:
    :vartype teenager_proto: str
    :ivar third_proto:
    :vartype third_proto: str
    :ivar user_proto:
    :vartype user_proto: str
    """

    app_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    create_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    full_priv_proto: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    language: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    major: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    minimum: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    priv_proto: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    teenager_proto: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    third_proto: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    user_proto: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        app_id: Optional[int] = None,
        create_time: Optional[str] = None,
        full_priv_proto: Optional[str] = None,
        id: Optional[int] = None,  # pylint: disable=redefined-builtin
        language: Optional[str] = None,
        major: Optional[int] = None,
        minimum: Optional[int] = None,
        priv_proto: Optional[str] = None,
        teenager_proto: Optional[str] = None,
        third_proto: Optional[str] = None,
        user_proto: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkProtocolVersionComparisonData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkProtocolVersionComparisonData.

    :ivar modified:
    :vartype modified: bool
    :ivar protocol:
    :vartype protocol: ~uigf.mihoyo.game.response.models.SdkProtocolVersion
    """

    modified: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    protocol: Optional["_models.SdkProtocolVersion"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        modified: Optional[bool] = None,
        protocol: Optional["_models.SdkProtocolVersion"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkRedDotData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkRedDotData.

    :ivar infos:
    :vartype infos: list[~uigf.mihoyo.game.response.models.SdkRedDotInfo]
    """

    infos: Optional[list["_models.SdkRedDotInfo"]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        infos: Optional[list["_models.SdkRedDotInfo"]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkRedDotInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkRedDotInfo.

    :ivar content_id:
    :vartype content_id: int
    :ivar display:
    :vartype display: bool
    :ivar red_point_type:
    :vartype red_point_type: int
    """

    content_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    display: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    red_point_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        content_id: Optional[int] = None,
        display: Optional[bool] = None,
        red_point_type: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkShieldConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkShieldConfigData.

    :ivar bbs_auth_login:
    :vartype bbs_auth_login: bool
    :ivar bbs_auth_login_ignore:
    :vartype bbs_auth_login_ignore: list[any]
    :ivar client:
    :vartype client: str
    :ivar disable_mmt:
    :vartype disable_mmt: bool
    :ivar disable_regist:
    :vartype disable_regist: bool
    :ivar enable_age_gate:
    :vartype enable_age_gate: bool
    :ivar enable_age_gate_ignore:
    :vartype enable_age_gate_ignore: list[any]
    :ivar enable_br_age_gate:
    :vartype enable_br_age_gate: bool
    :ivar enable_br_age_gate_ignore:
    :vartype enable_br_age_gate_ignore: list[any]
    :ivar enable_cx_bind_account:
    :vartype enable_cx_bind_account: bool
    :ivar enable_douyin_flash_login:
    :vartype enable_douyin_flash_login: bool
    :ivar enable_email_captcha:
    :vartype enable_email_captcha: bool
    :ivar enable_eu_age_gate:
    :vartype enable_eu_age_gate: bool
    :ivar enable_eu_age_gate_ignore:
    :vartype enable_eu_age_gate_ignore: list[any]
    :ivar enable_flash_login:
    :vartype enable_flash_login: bool
    :ivar enable_logo18:
    :vartype enable_logo18: bool
    :ivar enable_ps_bind_account:
    :vartype enable_ps_bind_account: bool
    :ivar fetch_instance_id:
    :vartype fetch_instance_id: bool
    :ivar firebase_blacklist_devices_switch:
    :vartype firebase_blacklist_devices_switch: bool
    :ivar firebase_blacklist_devices_version:
    :vartype firebase_blacklist_devices_version: int
    :ivar game_key:
    :vartype game_key: str
    :ivar guest:
    :vartype guest: bool
    :ivar hoyolab_auth_login:
    :vartype hoyolab_auth_login: bool
    :ivar hoyolab_auth_login_ignore:
    :vartype hoyolab_auth_login_ignore: list[any]
    :ivar hoyoplay_auth_login:
    :vartype hoyoplay_auth_login: bool
    :ivar id:
    :vartype id: int
    :ivar identity:
    :vartype identity: str
    :ivar ignore_versions:
    :vartype ignore_versions: str
    :ivar initialize_firebase:
    :vartype initialize_firebase: bool
    :ivar logo_height:
    :vartype logo_height: str
    :ivar logo_width:
    :vartype logo_width: str
    :ivar name:
    :vartype name: str
    :ivar scene:
    :vartype scene: str
    :ivar server_guest:
    :vartype server_guest: bool
    :ivar thirdparty:
    :vartype thirdparty: list[str]
    :ivar thirdparty_ignore:
    :vartype thirdparty_ignore: dict[str, any]
    :ivar thirdparty_login_configs:
    :vartype thirdparty_login_configs: dict[str, any]
    :ivar vn_webview_realname_enabled:
    :vartype vn_webview_realname_enabled: bool
    """

    bbs_auth_login: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    bbs_auth_login_ignore: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    client: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    disable_mmt: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    disable_regist: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    enable_age_gate: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    enable_age_gate_ignore: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    enable_br_age_gate: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    enable_br_age_gate_ignore: Optional[list[Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    enable_cx_bind_account: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    enable_douyin_flash_login: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    enable_email_captcha: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    enable_eu_age_gate: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    enable_eu_age_gate_ignore: Optional[list[Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    enable_flash_login: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    enable_logo18: Optional[bool] = rest_field(
        name="enable_logo_18", visibility=["read", "create", "update", "delete", "query"]
    )
    enable_ps_bind_account: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    fetch_instance_id: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    firebase_blacklist_devices_switch: Optional[bool] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    firebase_blacklist_devices_version: Optional[int] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    game_key: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    guest: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    hoyolab_auth_login: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    hoyolab_auth_login_ignore: Optional[list[Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    hoyoplay_auth_login: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    identity: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    ignore_versions: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    initialize_firebase: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    logo_height: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    logo_width: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    scene: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    server_guest: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    thirdparty: Optional[list[str]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    thirdparty_ignore: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    thirdparty_login_configs: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    vn_webview_realname_enabled: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(  # pylint: disable=too-many-locals
        self,
        *,
        bbs_auth_login: Optional[bool] = None,
        bbs_auth_login_ignore: Optional[list[Any]] = None,
        client: Optional[str] = None,
        disable_mmt: Optional[bool] = None,
        disable_regist: Optional[bool] = None,
        enable_age_gate: Optional[bool] = None,
        enable_age_gate_ignore: Optional[list[Any]] = None,
        enable_br_age_gate: Optional[bool] = None,
        enable_br_age_gate_ignore: Optional[list[Any]] = None,
        enable_cx_bind_account: Optional[bool] = None,
        enable_douyin_flash_login: Optional[bool] = None,
        enable_email_captcha: Optional[bool] = None,
        enable_eu_age_gate: Optional[bool] = None,
        enable_eu_age_gate_ignore: Optional[list[Any]] = None,
        enable_flash_login: Optional[bool] = None,
        enable_logo18: Optional[bool] = None,
        enable_ps_bind_account: Optional[bool] = None,
        fetch_instance_id: Optional[bool] = None,
        firebase_blacklist_devices_switch: Optional[bool] = None,
        firebase_blacklist_devices_version: Optional[int] = None,
        game_key: Optional[str] = None,
        guest: Optional[bool] = None,
        hoyolab_auth_login: Optional[bool] = None,
        hoyolab_auth_login_ignore: Optional[list[Any]] = None,
        hoyoplay_auth_login: Optional[bool] = None,
        id: Optional[int] = None,  # pylint: disable=redefined-builtin
        identity: Optional[str] = None,
        ignore_versions: Optional[str] = None,
        initialize_firebase: Optional[bool] = None,
        logo_height: Optional[str] = None,
        logo_width: Optional[str] = None,
        name: Optional[str] = None,
        scene: Optional[str] = None,
        server_guest: Optional[bool] = None,
        thirdparty: Optional[list[str]] = None,
        thirdparty_ignore: Optional[dict[str, Any]] = None,
        thirdparty_login_configs: Optional[dict[str, Any]] = None,
        vn_webview_realname_enabled: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessAbyssSeasonTwoSummaryData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessAbyssSeasonTwoSummaryData.

    :ivar abyss_collect:
    :vartype abyss_collect: list[dict[str, any]]
    :ivar abyss_duty:
    :vartype abyss_duty: dict[str, any]
    :ivar abyss_level:
    :vartype abyss_level: dict[str, any]
    :ivar abyss_max:
    :vartype abyss_max: dict[str, any]
    :ivar abyss_task:
    :vartype abyss_task: dict[str, any]
    :ivar abyss_task_force_investigation_max:
    :vartype abyss_task_force_investigation_max: dict[str, any]
    :ivar hide_abyss_duty:
    :vartype hide_abyss_duty: bool
    :ivar refresh_time:
    :vartype refresh_time: int
    :ivar special_mission:
    :vartype special_mission: dict[str, any]
    :ivar unlock:
    :vartype unlock: bool
    """

    abyss_collect: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    abyss_duty: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    abyss_level: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    abyss_max: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    abyss_task: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    abyss_task_force_investigation_max: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    hide_abyss_duty: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    refresh_time: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    special_mission: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    unlock: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        abyss_collect: Optional[list[dict[str, Any]]] = None,
        abyss_duty: Optional[dict[str, Any]] = None,
        abyss_level: Optional[dict[str, Any]] = None,
        abyss_max: Optional[dict[str, Any]] = None,
        abyss_task: Optional[dict[str, Any]] = None,
        abyss_task_force_investigation_max: Optional[dict[str, Any]] = None,
        hide_abyss_duty: Optional[bool] = None,
        refresh_time: Optional[int] = None,
        special_mission: Optional[dict[str, Any]] = None,
        unlock: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessAbyssSummaryData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessAbyssSummaryData.

    :ivar abyss_collect:
    :vartype abyss_collect: list[dict[str, any]]
    :ivar abyss_duty:
    :vartype abyss_duty: any
    :ivar abyss_level:
    :vartype abyss_level: dict[str, any]
    :ivar abyss_nest:
    :vartype abyss_nest: dict[str, any]
    :ivar abyss_point:
    :vartype abyss_point: dict[str, any]
    :ivar abyss_talent:
    :vartype abyss_talent: dict[str, any]
    :ivar abyss_throne:
    :vartype abyss_throne: dict[str, any]
    :ivar refresh_time:
    :vartype refresh_time: int
    :ivar unlock:
    :vartype unlock: bool
    """

    abyss_collect: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    abyss_duty: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    abyss_level: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    abyss_nest: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    abyss_point: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    abyss_talent: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    abyss_throne: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    refresh_time: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    unlock: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        abyss_collect: Optional[list[dict[str, Any]]] = None,
        abyss_duty: Optional[Any] = None,
        abyss_level: Optional[dict[str, Any]] = None,
        abyss_nest: Optional[dict[str, Any]] = None,
        abyss_point: Optional[dict[str, Any]] = None,
        abyss_talent: Optional[dict[str, Any]] = None,
        abyss_throne: Optional[dict[str, Any]] = None,
        refresh_time: Optional[int] = None,
        unlock: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessActivityCalendarData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessActivityCalendarData.

    :ivar activity_list:
    :vartype activity_list: list[dict[str, any]]
    """

    activity_list: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        activity_list: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessClimbingTowerDetailData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessClimbingTowerDetailData.

    :ivar climbing_tower_s1:
    :vartype climbing_tower_s1: any
    :ivar climbing_tower_s2:
    :vartype climbing_tower_s2: any
    :ivar climbing_tower_s3:
    :vartype climbing_tower_s3: any
    :ivar climbing_tower_s4:
    :vartype climbing_tower_s4: any
    """

    climbing_tower_s1: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    climbing_tower_s2: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    climbing_tower_s3: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    climbing_tower_s4: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        climbing_tower_s1: Optional[Any] = None,
        climbing_tower_s2: Optional[Any] = None,
        climbing_tower_s3: Optional[Any] = None,
        climbing_tower_s4: Optional[Any] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessDailyNoteData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessDailyNoteData.

    :ivar abyss_refresh:
    :vartype abyss_refresh: int
    :ivar bounty_commission:
    :vartype bounty_commission: dict[str, any]
    :ivar cafe_state:
    :vartype cafe_state: str
    :ivar card_sign:
    :vartype card_sign: str
    :ivar coffee:
    :vartype coffee: any
    :ivar energy:
    :vartype energy: dict[str, any]
    :ivar is_other_sub:
    :vartype is_other_sub: bool
    :ivar is_sub:
    :vartype is_sub: bool
    :ivar member_card:
    :vartype member_card: dict[str, any]
    :ivar survey_points:
    :vartype survey_points: any
    :ivar temple_running:
    :vartype temple_running: dict[str, any]
    :ivar vhs_sale:
    :vartype vhs_sale: dict[str, any]
    :ivar vitality:
    :vartype vitality: dict[str, any]
    :ivar weekly_task:
    :vartype weekly_task: any
    """

    abyss_refresh: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    bounty_commission: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    cafe_state: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    card_sign: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    coffee: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    energy: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_other_sub: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_sub: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    member_card: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    survey_points: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    temple_running: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    vhs_sale: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    vitality: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    weekly_task: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        abyss_refresh: Optional[int] = None,
        bounty_commission: Optional[dict[str, Any]] = None,
        cafe_state: Optional[str] = None,
        card_sign: Optional[str] = None,
        coffee: Optional[Any] = None,
        energy: Optional[dict[str, Any]] = None,
        is_other_sub: Optional[bool] = None,
        is_sub: Optional[bool] = None,
        member_card: Optional[dict[str, Any]] = None,
        survey_points: Optional[Any] = None,
        temple_running: Optional[dict[str, Any]] = None,
        vhs_sale: Optional[dict[str, Any]] = None,
        vitality: Optional[dict[str, Any]] = None,
        weekly_task: Optional[Any] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessDeadlyAssaultSummaryData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessDeadlyAssaultSummaryData.

    :ivar avatar_icon:
    :vartype avatar_icon: str
    :ivar end_time:
    :vartype end_time: dict[str, any]
    :ivar list:
    :vartype list: list[any]
    :ivar nick_name:
    :vartype nick_name: str
    :ivar room_max_score:
    :vartype room_max_score: int
    :ivar start_time:
    :vartype start_time: dict[str, any]
    :ivar total_max_score:
    :vartype total_max_score: int
    """

    avatar_icon: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    end_time: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    nick_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    room_max_score: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    start_time: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    total_max_score: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        avatar_icon: Optional[str] = None,
        end_time: Optional[dict[str, Any]] = None,
        list: Optional[list[Any]] = None,
        nick_name: Optional[str] = None,
        room_max_score: Optional[int] = None,
        start_time: Optional[dict[str, Any]] = None,
        total_max_score: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessExplorationDetailData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessExplorationDetailData.

    :ivar area_collections:
    :vartype area_collections: list[dict[str, any]]
    :ivar cat_notes:
    :vartype cat_notes: list[dict[str, any]]
    """

    area_collections: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    cat_notes: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        area_collections: Optional[list[dict[str, Any]]] = None,
        cat_notes: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessGachaCalendarData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessGachaCalendarData.

    :ivar avatar_gacha_schedule_list:
    :vartype avatar_gacha_schedule_list: list[dict[str, any]]
    :ivar weapon_gacha_schedule_list:
    :vartype weapon_gacha_schedule_list: list[dict[str, any]]
    """

    avatar_gacha_schedule_list: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    weapon_gacha_schedule_list: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        avatar_gacha_schedule_list: Optional[list[dict[str, Any]]] = None,
        weapon_gacha_schedule_list: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessIndexData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessIndexData.

    :ivar area_collections:
    :vartype area_collections: list[dict[str, any]]
    :ivar avatar_list:
    :vartype avatar_list: list[dict[str, any]]
    :ivar award_state:
    :vartype award_state: str
    :ivar buddy_list:
    :vartype buddy_list: list[dict[str, any]]
    :ivar cat_notes_list:
    :vartype cat_notes_list: list[any]
    :ivar challenge_schedule_list:
    :vartype challenge_schedule_list: list[dict[str, any]]
    :ivar cur_head_icon_url:
    :vartype cur_head_icon_url: str
    :ivar game_data_show:
    :vartype game_data_show: dict[str, any]
    :ivar stats:
    :vartype stats: dict[str, any]
    """

    area_collections: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    avatar_list: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    award_state: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    buddy_list: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    cat_notes_list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    challenge_schedule_list: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    cur_head_icon_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    game_data_show: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    stats: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        area_collections: Optional[list[dict[str, Any]]] = None,
        avatar_list: Optional[list[dict[str, Any]]] = None,
        award_state: Optional[str] = None,
        buddy_list: Optional[list[dict[str, Any]]] = None,
        cat_notes_list: Optional[list[Any]] = None,
        challenge_schedule_list: Optional[list[dict[str, Any]]] = None,
        cur_head_icon_url: Optional[str] = None,
        game_data_show: Optional[dict[str, Any]] = None,
        stats: Optional[dict[str, Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessLedgerMonthInfoData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessLedgerMonthInfoData.

    :ivar current_month:
    :vartype current_month: str
    :ivar data_month:
    :vartype data_month: str
    :ivar month_data:
    :vartype month_data: dict[str, any]
    :ivar optional_month:
    :vartype optional_month: list[str]
    :ivar region:
    :vartype region: str
    :ivar role_info:
    :vartype role_info: dict[str, any]
    :ivar uid:
    :vartype uid: str
    """

    current_month: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    data_month: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    month_data: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    optional_month: Optional[list[str]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    region: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    role_info: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    uid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        current_month: Optional[str] = None,
        data_month: Optional[str] = None,
        month_data: Optional[dict[str, Any]] = None,
        optional_month: Optional[list[str]] = None,
        region: Optional[str] = None,
        role_info: Optional[dict[str, Any]] = None,
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


class ZenlessShiyuDefenseData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessShiyuDefenseData.

    :ivar hadal_info_v2:
    :vartype hadal_info_v2: dict[str, any]
    :ivar hadal_ver:
    :vartype hadal_ver: str
    :ivar icon:
    :vartype icon: str
    :ivar nick_name:
    :vartype nick_name: str
    """

    hadal_info_v2: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    hadal_ver: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    icon: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    nick_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        hadal_info_v2: Optional[dict[str, Any]] = None,
        hadal_ver: Optional[str] = None,
        icon: Optional[str] = None,
        nick_name: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessThresholdSimulationPeriodSummaryData(
    _Model
):  # pylint: disable=name-too-long,docstring-keyword-should-match-keyword-only
    """ZenlessThresholdSimulationPeriodSummaryData.

    :ivar has_detail_record:
    :vartype has_detail_record: bool
    :ivar void_front_battle_abstract_info_brief:
    :vartype void_front_battle_abstract_info_brief: dict[str, any]
    :ivar void_front_id:
    :vartype void_front_id: int
    """

    has_detail_record: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    void_front_battle_abstract_info_brief: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    void_front_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        has_detail_record: Optional[bool] = None,
        void_front_battle_abstract_info_brief: Optional[dict[str, Any]] = None,
        void_front_id: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)
