# pylint: disable=too-many-lines
# coding=utf-8
# pylint: disable=useless-super-delegation

from typing import Any, Mapping, Optional, TYPE_CHECKING, overload

from ....passport._utils.model_base import Model as _Model, rest_field

if TYPE_CHECKING:
    from .. import models as _models
List = list


class AuthKeyData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """AuthKeyData.

    :ivar authkey:
    :vartype authkey: str
    :ivar authkey_ver:
    :vartype authkey_ver: int
    :ivar sign_type:
    :vartype sign_type: int
    """

    authkey: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    authkey_ver: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    sign_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        authkey: Optional[str] = None,
        authkey_ver: Optional[int] = None,
        sign_type: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class CommunityAppConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """CommunityAppConfigData.

    :ivar config:
    :vartype config: dict[str, str]
    """

    config: Optional[dict[str, str]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        config: Optional[dict[str, str]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class CommunityHomeData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """CommunityHomeData.

    :ivar album_card:
    :vartype album_card: list[any]
    :ivar background:
    :vartype background: dict[str, any]
    :ivar break_frame_card:
    :vartype break_frame_card: any
    :ivar carousels:
    :vartype carousels: any
    :ivar discussion:
    :vartype discussion: any
    :ivar exposed_resource_tickets:
    :vartype exposed_resource_tickets: list[any]
    :ivar game_receptions:
    :vartype game_receptions: list[dict[str, any]]
    :ivar hot_topics:
    :vartype hot_topics: any
    :ivar image_post_card:
    :vartype image_post_card: list[any]
    :ivar is_resource_unchanged:
    :vartype is_resource_unchanged: bool
    :ivar light_interactive_card:
    :vartype light_interactive_card: any
    :ivar link_card:
    :vartype link_card: list[any]
    :ivar link_topic_card:
    :vartype link_topic_card: list[any]
    :ivar lives:
    :vartype lives: list[any]
    :ivar navigator:
    :vartype navigator: list[dict[str, any]]
    :ivar official:
    :vartype official: dict[str, any]
    :ivar perspective_card:
    :vartype perspective_card: any
    :ivar posts:
    :vartype posts: list[any]
    :ivar recommend_villa:
    :vartype recommend_villa: any
    """

    album_card: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    background: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    break_frame_card: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    carousels: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    discussion: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    exposed_resource_tickets: Optional[list[Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    game_receptions: Optional[list[dict[str, Any]]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    hot_topics: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    image_post_card: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_resource_unchanged: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    light_interactive_card: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    link_card: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    link_topic_card: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    lives: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    navigator: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    official: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    perspective_card: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    posts: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    recommend_villa: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        album_card: Optional[list[Any]] = None,
        background: Optional[dict[str, Any]] = None,
        break_frame_card: Optional[Any] = None,
        carousels: Optional[Any] = None,
        discussion: Optional[Any] = None,
        exposed_resource_tickets: Optional[list[Any]] = None,
        game_receptions: Optional[list[dict[str, Any]]] = None,
        hot_topics: Optional[Any] = None,
        image_post_card: Optional[list[Any]] = None,
        is_resource_unchanged: Optional[bool] = None,
        light_interactive_card: Optional[Any] = None,
        link_card: Optional[list[Any]] = None,
        link_topic_card: Optional[list[Any]] = None,
        lives: Optional[list[Any]] = None,
        navigator: Optional[list[dict[str, Any]]] = None,
        official: Optional[dict[str, Any]] = None,
        perspective_card: Optional[Any] = None,
        posts: Optional[list[Any]] = None,
        recommend_villa: Optional[Any] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class EmptyData(_Model):
    """EmptyData."""


class LoginCaptchaData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """LoginCaptchaData.

    :ivar action_type:
    :vartype action_type: str
    :ivar countdown:
    :vartype countdown: int
    :ivar sent_new:
    :vartype sent_new: bool
    """

    action_type: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    countdown: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    sent_new: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        action_type: Optional[str] = None,
        countdown: Optional[int] = None,
        sent_new: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileAppSplashData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileAppSplashData.

    :ivar has_splash:
    :vartype has_splash: bool
    :ivar splashes:
    :vartype splashes: list[any]
    """

    has_splash: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    splashes: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        has_splash: Optional[bool] = None,
        splashes: Optional[list[Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileBusinessesData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileBusinessesData.

    :ivar businesses:
    :vartype businesses: list[str]
    """

    businesses: Optional[list[str]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        businesses: Optional[list[str]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileDiscussion(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileDiscussion.

    :ivar created_at:
    :vartype created_at: int
    :ivar default_feed_forum_id:
    :vartype default_feed_forum_id: int
    :ivar default_feed_tab:
    :vartype default_feed_tab: int
    :ivar desc:
    :vartype desc: str
    :ivar desc_type:
    :vartype desc_type: int
    :ivar discussion_id:
    :vartype discussion_id: int
    :ivar forums:
    :vartype forums: list[any]
    :ivar game_id:
    :vartype game_id: int
    :ivar hot_posts:
    :vartype hot_posts: list[any]
    :ivar icon:
    :vartype icon: str
    :ivar subject:
    :vartype subject: str
    :ivar talking_forum_id:
    :vartype talking_forum_id: str
    :ivar talking_prompt:
    :vartype talking_prompt: str
    :ivar updated_at:
    :vartype updated_at: int
    """

    created_at: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    default_feed_forum_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    default_feed_tab: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    desc: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    desc_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    discussion_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    forums: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    game_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    hot_posts: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    icon: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    subject: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    talking_forum_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    talking_prompt: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    updated_at: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        created_at: Optional[int] = None,
        default_feed_forum_id: Optional[int] = None,
        default_feed_tab: Optional[int] = None,
        desc: Optional[str] = None,
        desc_type: Optional[int] = None,
        discussion_id: Optional[int] = None,
        forums: Optional[list[Any]] = None,
        game_id: Optional[int] = None,
        hot_posts: Optional[list[Any]] = None,
        icon: Optional[str] = None,
        subject: Optional[str] = None,
        talking_forum_id: Optional[str] = None,
        talking_prompt: Optional[str] = None,
        updated_at: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileDiscussionData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileDiscussionData.

    :ivar discussion:
    :vartype discussion: ~uigf.mihoyo.api.response.models.MobileDiscussion
    """

    discussion: Optional["_models.MobileDiscussion"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        discussion: Optional["_models.MobileDiscussion"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileEmoticonData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileEmoticonData.

    :ivar list:
    :vartype list: list[any]
    """

    list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        list: Optional[list[Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileEntityReviewData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileEntityReviewData.

    :ivar is_last:
    :vartype is_last: bool
    :ivar list:
    :vartype list: list[any]
    :ivar next_offset:
    :vartype next_offset: int
    """

    is_last: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    next_offset: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        is_last: Optional[bool] = None,
        list: Optional[list[Any]] = None,
        next_offset: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileFeedPostsData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileFeedPostsData.

    :ivar databox:
    :vartype databox: dict[str, str]
    :ivar is_original:
    :vartype is_original: bool
    :ivar is_resource_unchanged:
    :vartype is_resource_unchanged: bool
    :ivar last_id:
    :vartype last_id: str
    :ivar list:
    :vartype list: list[dict[str, any]]
    """

    databox: Optional[dict[str, str]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_original: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_resource_unchanged: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    last_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    list: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        databox: Optional[dict[str, str]] = None,
        is_original: Optional[bool] = None,
        is_resource_unchanged: Optional[bool] = None,
        last_id: Optional[str] = None,
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


class MobileGame(_Model):
    """MobileGame."""


class MobileGameCenterData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileGameCenterData.

    :ivar auto_download_enable_map:
    :vartype auto_download_enable_map: dict[str, any]
    :ivar download_mode:
    :vartype download_mode: str
    :ivar game_download_experiment:
    :vartype game_download_experiment: dict[str, any]
    :ivar list:
    :vartype list: list[dict[str, any]]
    """

    auto_download_enable_map: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    download_mode: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    game_download_experiment: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    list: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        auto_download_enable_map: Optional[dict[str, Any]] = None,
        download_mode: Optional[str] = None,
        game_download_experiment: Optional[dict[str, Any]] = None,
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


class MobileGameListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileGameListData.

    :ivar list:
    :vartype list: list[~uigf.mihoyo.api.response.models.MobileGame]
    """

    list: Optional[list["_models.MobileGame"]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        list: Optional[list["_models.MobileGame"]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileMissionsStateData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileMissionsStateData.

    :ivar already_received_points:
    :vartype already_received_points: int
    :ivar can_get_points:
    :vartype can_get_points: int
    :ivar is_unclaimed:
    :vartype is_unclaimed: bool
    :ivar states:
    :vartype states: list[dict[str, any]]
    :ivar today_total_points:
    :vartype today_total_points: int
    :ivar total_points:
    :vartype total_points: int
    """

    already_received_points: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    can_get_points: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_unclaimed: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    states: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    today_total_points: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    total_points: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        already_received_points: Optional[int] = None,
        can_get_points: Optional[int] = None,
        is_unclaimed: Optional[bool] = None,
        states: Optional[list[dict[str, Any]]] = None,
        today_total_points: Optional[int] = None,
        total_points: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileMyselfPageConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileMyselfPageConfigData.

    :ivar app_personal_entry:
    :vartype app_personal_entry: dict[str, any]
    :ivar app_personal_unread:
    :vartype app_personal_unread: dict[str, any]
    """

    app_personal_entry: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    app_personal_unread: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        app_personal_entry: Optional[dict[str, Any]] = None,
        app_personal_unread: Optional[dict[str, Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileNotificationSettingsData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileNotificationSettingsData.

    :ivar settings:
    :vartype settings: dict[str, any]
    """

    settings: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        settings: Optional[dict[str, Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobilePreloadConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobilePreloadConfigData.

    :ivar need_preload:
    :vartype need_preload: bool
    :ivar need_update:
    :vartype need_update: bool
    :ivar rn_preload:
    :vartype rn_preload: list[dict[str, any]]
    :ivar rn_update_infos:
    :vartype rn_update_infos: list[any]
    """

    need_preload: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    need_update: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    rn_preload: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    rn_update_infos: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        need_preload: Optional[bool] = None,
        need_update: Optional[bool] = None,
        rn_preload: Optional[list[dict[str, Any]]] = None,
        rn_update_infos: Optional[list[Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileReplyPermissionData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileReplyPermissionData.

    :ivar instant:
    :vartype instant: list[any]
    :ivar max_image_number:
    :vartype max_image_number: int
    :ivar post:
    :vartype post: list[any]
    """

    instant: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    max_image_number: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    post: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        instant: Optional[list[Any]] = None,
        max_image_number: Optional[int] = None,
        post: Optional[list[Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileStartupData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileStartupData.

    :ivar resp_map:
    :vartype resp_map: dict[str, any]
    """

    resp_map: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        resp_map: Optional[dict[str, Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileTeenagerInfoData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileTeenagerInfoData.

    :ivar available_duration:
    :vartype available_duration: int
    :ivar disable_end_time:
    :vartype disable_end_time: int
    :ivar disable_start_time:
    :vartype disable_start_time: int
    :ivar is_enabled:
    :vartype is_enabled: bool
    :ivar is_force:
    :vartype is_force: bool
    :ivar is_real_name:
    :vartype is_real_name: bool
    :ivar is_teenager:
    :vartype is_teenager: bool
    :ivar loop_period:
    :vartype loop_period: int
    """

    available_duration: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    disable_end_time: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    disable_start_time: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_enabled: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_force: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_real_name: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_teenager: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    loop_period: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        available_duration: Optional[int] = None,
        disable_end_time: Optional[int] = None,
        disable_start_time: Optional[int] = None,
        is_enabled: Optional[bool] = None,
        is_force: Optional[bool] = None,
        is_real_name: Optional[bool] = None,
        is_teenager: Optional[bool] = None,
        loop_period: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileUnreadInfoData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileUnreadInfoData.

    :ivar latest_update_user_info:
    :vartype latest_update_user_info: ~uigf.mihoyo.api.response.models.MobileUnreadInfoUser
    :ivar unread_num:
    :vartype unread_num: int
    """

    latest_update_user_info: Optional["_models.MobileUnreadInfoUser"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    unread_num: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        latest_update_user_info: Optional["_models.MobileUnreadInfoUser"] = None,
        unread_num: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileUnreadInfoUser(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileUnreadInfoUser.

    :ivar avatar_url:
    :vartype avatar_url: str
    :ivar uid:
    :vartype uid: str
    """

    avatar_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    uid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        avatar_url: Optional[str] = None,
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


class MobileUnreadMessageData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileUnreadMessageData.

    :ivar chat_unread:
    :vartype chat_unread: dict[str, any]
    :ivar notification_unread:
    :vartype notification_unread: dict[str, any]
    :ivar sem_notification:
    :vartype sem_notification: dict[str, any]
    """

    chat_unread: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    notification_unread: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    sem_notification: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        chat_unread: Optional[dict[str, Any]] = None,
        notification_unread: Optional[dict[str, Any]] = None,
        sem_notification: Optional[dict[str, Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileUserInstantListData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileUserInstantListData.

    :ivar is_last:
    :vartype is_last: bool
    :ivar list:
    :vartype list: list[dict[str, any]]
    :ivar next_offset:
    :vartype next_offset: int
    :ivar top_post:
    :vartype top_post: any
    """

    is_last: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    list: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    next_offset: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    top_post: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        is_last: Optional[bool] = None,
        list: Optional[list[dict[str, Any]]] = None,
        next_offset: Optional[int] = None,
        top_post: Optional[Any] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileUserSettingsData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileUserSettingsData.

    :ivar is_merge_unfollow:
    :vartype is_merge_unfollow: bool
    :ivar is_receive_from_unfollow:
    :vartype is_receive_from_unfollow: bool
    """

    is_merge_unfollow: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_receive_from_unfollow: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        is_merge_unfollow: Optional[bool] = None,
        is_receive_from_unfollow: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileVideoPermissionData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileVideoPermissionData.

    :ivar can_publish:
    :vartype can_publish: bool
    :ivar toast:
    :vartype toast: str
    """

    can_publish: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    toast: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        can_publish: Optional[bool] = None,
        toast: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileVillaSitePushData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileVillaSitePushData.

    :ivar list:
    :vartype list: list[any]
    """

    list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        list: Optional[list[Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileWindowPrepareData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileWindowPrepareData.

    :ivar android_pkg:
    :vartype android_pkg: list[any]
    :ivar ios_app:
    :vartype ios_app: list[any]
    :ivar ticket:
    :vartype ticket: str
    """

    android_pkg: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    ios_app: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    ticket: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        android_pkg: Optional[list[Any]] = None,
        ios_app: Optional[list[Any]] = None,
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


class MobileWindowShowData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileWindowShowData.

    :ivar bubble_list:
    :vartype bubble_list: list[any]
    :ivar list:
    :vartype list: list[any]
    """

    bubble_list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    list: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        bubble_list: Optional[list[Any]] = None,
        list: Optional[list[Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class PassportSwitchStatusData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """PassportSwitchStatusData.

    :ivar enabled:
    :vartype enabled: dict[str, any]
    :ivar switch_status_map:
    :vartype switch_status_map: dict[str, any]
    """

    enabled: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    switch_status_map: Optional[dict[str, Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        enabled: Optional[dict[str, Any]] = None,
        switch_status_map: Optional[dict[str, Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class PatchData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """PatchData.

    :ivar dialog_content:
    :vartype dialog_content: str
    :ivar dialog_content_en:
    :vartype dialog_content_en: str
    :ivar dialog_num:
    :vartype dialog_num: int
    :ivar dialog_period:
    :vartype dialog_period: int
    :ivar dialog_period_type:
    :vartype dialog_period_type: int
    :ivar dialog_title:
    :vartype dialog_title: str
    :ivar file_name:
    :vartype file_name: str
    :ivar file_url:
    :vartype file_url: str
    :ivar im_page_ids:
    :vartype im_page_ids: list[any]
    :ivar md5:
    :vartype md5: str
    :ivar patch_action:
    :vartype patch_action: int
    :ivar patch_id:
    :vartype patch_id: int
    :ivar patch_strategy_id:
    :vartype patch_strategy_id: int
    :ivar patch_version:
    :vartype patch_version: str
    :ivar update_recommended_intensity:
    :vartype update_recommended_intensity: str
    :ivar update_type:
    :vartype update_type: int
    :ivar user_defined:
    :vartype user_defined: str
    """

    dialog_content: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_content_en: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_num: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_period: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_period_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_title: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    file_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    file_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    im_page_ids: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    md5: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    patch_action: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    patch_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    patch_strategy_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    patch_version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    update_recommended_intensity: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    update_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    user_defined: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        dialog_content: Optional[str] = None,
        dialog_content_en: Optional[str] = None,
        dialog_num: Optional[int] = None,
        dialog_period: Optional[int] = None,
        dialog_period_type: Optional[int] = None,
        dialog_title: Optional[str] = None,
        file_name: Optional[str] = None,
        file_url: Optional[str] = None,
        im_page_ids: Optional[list[Any]] = None,
        md5: Optional[str] = None,
        patch_action: Optional[int] = None,
        patch_id: Optional[int] = None,
        patch_strategy_id: Optional[int] = None,
        patch_version: Optional[str] = None,
        update_recommended_intensity: Optional[str] = None,
        update_type: Optional[int] = None,
        user_defined: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class RedDotBatchData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """RedDotBatchData.

    :ivar game_status:
    :vartype game_status: ~uigf.mihoyo.api.response.models.RedDotGameStatus
    :ivar status:
    :vartype status: bool
    """

    game_status: Optional["_models.RedDotGameStatus"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    status: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        game_status: Optional["_models.RedDotGameStatus"] = None,
        status: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class RedDotGameStatus(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """RedDotGameStatus.

    :ivar bbs_cn:
    :vartype bbs_cn: bool
    :ivar hk4_e_cn:
    :vartype hk4_e_cn: bool
    :ivar nap_cn:
    :vartype nap_cn: bool
    """

    bbs_cn: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    hk4_e_cn: Optional[bool] = rest_field(name="hk4e_cn", visibility=["read", "create", "update", "delete", "query"])
    nap_cn: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        bbs_cn: Optional[bool] = None,
        hk4_e_cn: Optional[bool] = None,
        nap_cn: Optional[bool] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ReleaseData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ReleaseData.

    :ivar dialog:
    :vartype dialog: str
    :ivar dialog_content:
    :vartype dialog_content: str
    :ivar dialog_content_en:
    :vartype dialog_content_en: str
    :ivar dialog_num:
    :vartype dialog_num: int
    :ivar dialog_period:
    :vartype dialog_period: int
    :ivar dialog_period_type:
    :vartype dialog_period_type: int
    :ivar dialog_title:
    :vartype dialog_title: str
    :ivar dialog_title_en:
    :vartype dialog_title_en: str
    :ivar has_update:
    :vartype has_update: bool
    :ivar hyp_game_ids:
    :vartype hyp_game_ids: list[any]
    :ivar loop_way:
    :vartype loop_way: str
    :ivar package_md5:
    :vartype package_md5: str
    :ivar package_name:
    :vartype package_name: str
    :ivar package_size:
    :vartype package_size: str
    :ivar package_url:
    :vartype package_url: str
    :ivar package_version:
    :vartype package_version: str
    :ivar silent:
    :vartype silent: str
    :ivar strategy_id:
    :vartype strategy_id: int
    :ivar update_recommended_intensity:
    :vartype update_recommended_intensity: str
    :ivar update_type:
    :vartype update_type: int
    :ivar user_defined:
    :vartype user_defined: str
    """

    dialog: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_content: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_content_en: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_num: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_period: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_period_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_title: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    dialog_title_en: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    has_update: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    hyp_game_ids: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    loop_way: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    package_md5: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    package_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    package_size: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    package_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    package_version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    silent: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    strategy_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    update_recommended_intensity: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    update_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    user_defined: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        dialog: Optional[str] = None,
        dialog_content: Optional[str] = None,
        dialog_content_en: Optional[str] = None,
        dialog_num: Optional[int] = None,
        dialog_period: Optional[int] = None,
        dialog_period_type: Optional[int] = None,
        dialog_title: Optional[str] = None,
        dialog_title_en: Optional[str] = None,
        has_update: Optional[bool] = None,
        hyp_game_ids: Optional[list[Any]] = None,
        loop_way: Optional[str] = None,
        package_md5: Optional[str] = None,
        package_name: Optional[str] = None,
        package_size: Optional[str] = None,
        package_url: Optional[str] = None,
        package_version: Optional[str] = None,
        silent: Optional[str] = None,
        strategy_id: Optional[int] = None,
        update_recommended_intensity: Optional[str] = None,
        update_type: Optional[int] = None,
        user_defined: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkFeCnConfigData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkFeCnConfigData.

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


class SdkPorteData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkPorteData.

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


class StaticLatestVersionData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """StaticLatestVersionData.

    :ivar version:
    :vartype version: str
    """

    version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
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


class StaticPreKeywordData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """StaticPreKeywordData.

    :ivar list:
    :vartype list: list[str]
    """

    list: Optional[list[str]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        list: Optional[list[str]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class StaticResourceData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """StaticResourceData.

    :ivar divider:
    :vartype divider: list[dict[str, any]]
    """

    divider: Optional[list[dict[str, Any]]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        divider: Optional[list[dict[str, Any]]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class StaticResourceVersionsData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """StaticResourceVersionsData.

    :ivar divider:
    :vartype divider: str
    :ivar emoticon_set:
    :vartype emoticon_set: str
    """

    divider: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    emoticon_set: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        divider: Optional[str] = None,
        emoticon_set: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class StrategyAnnouncement(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """StrategyAnnouncement.

    :ivar content:
    :vartype content: str
    :ivar version:
    :vartype version: int
    """

    content: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    version: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        content: Optional[str] = None,
        version: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class StrategyContentItem(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """StrategyContentItem.

    :ivar alias_name:
    :vartype alias_name: str
    :ivar article_time:
    :vartype article_time: str
    :ivar article_user_name:
    :vartype article_user_name: str
    :ivar avatar_url:
    :vartype avatar_url: str
    :ivar bbs_url:
    :vartype bbs_url: str
    :ivar content_id:
    :vartype content_id: int
    :ivar corner_mark:
    :vartype corner_mark: str
    :ivar ext:
    :vartype ext: str
    :ivar icon:
    :vartype icon: str
    :ivar summary:
    :vartype summary: str
    :ivar title:
    :vartype title: str
    """

    alias_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    article_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    article_user_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    avatar_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    bbs_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    content_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    corner_mark: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    ext: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    icon: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    summary: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    title: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        alias_name: Optional[str] = None,
        article_time: Optional[str] = None,
        article_user_name: Optional[str] = None,
        avatar_url: Optional[str] = None,
        bbs_url: Optional[str] = None,
        content_id: Optional[int] = None,
        corner_mark: Optional[str] = None,
        ext: Optional[str] = None,
        icon: Optional[str] = None,
        summary: Optional[str] = None,
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


class StrategyHomeImage(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """StrategyHomeImage.

    :ivar head_img:
    :vartype head_img: str
    :ivar logo:
    :vartype logo: str
    """

    head_img: Optional[str] = rest_field(name="headImg", visibility=["read", "create", "update", "delete", "query"])
    logo: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        head_img: Optional[str] = None,
        logo: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class StrategyHomeInfoData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """StrategyHomeInfoData.

    :ivar announce:
    :vartype announce: ~uigf.mihoyo.api.response.models.StrategyAnnouncement
    :ivar pop_window:
    :vartype pop_window: any
    :ivar search:
    :vartype search: ~uigf.mihoyo.api.response.models.StrategySearch
    :ivar speaker:
    :vartype speaker: any
    """

    announce: Optional["_models.StrategyAnnouncement"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    pop_window: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    search: Optional["_models.StrategySearch"] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    speaker: Optional[Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        announce: Optional["_models.StrategyAnnouncement"] = None,
        pop_window: Optional[Any] = None,
        search: Optional["_models.StrategySearch"] = None,
        speaker: Optional[Any] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class StrategyHomeNavbarData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """StrategyHomeNavbarData.

    :ivar home_img:
    :vartype home_img: ~uigf.mihoyo.api.response.models.StrategyHomeImage
    :ivar navbar:
    :vartype navbar: list[any]
    """

    home_img: Optional["_models.StrategyHomeImage"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    navbar: Optional[list[Any]] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        home_img: Optional["_models.StrategyHomeImage"] = None,
        navbar: Optional[list[Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class StrategyLatestContentData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """StrategyLatestContentData.

    :ivar list:
    :vartype list: list[~uigf.mihoyo.api.response.models.StrategyContentItem]
    """

    list: Optional[list["_models.StrategyContentItem"]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        list: Optional[list["_models.StrategyContentItem"]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class StrategySearch(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """StrategySearch.

    :ivar hot_words:
    :vartype hot_words: list[str]
    :ivar placeholder:
    :vartype placeholder: str
    """

    hot_words: Optional[list[str]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    placeholder: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        hot_words: Optional[list[str]] = None,
        placeholder: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessFeedbackScheduleData(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessFeedbackScheduleData.

    :ivar is_need_collect:
    :vartype is_need_collect: bool
    :ivar schedule_id:
    :vartype schedule_id: str
    """

    is_need_collect: Optional[bool] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    schedule_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        is_need_collect: Optional[bool] = None,
        schedule_id: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)
