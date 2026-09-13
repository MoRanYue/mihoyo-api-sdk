# pylint: disable=too-many-lines
# coding=utf-8
# pylint: disable=useless-super-delegation

from typing import Any, Mapping, Optional, TYPE_CHECKING, Union, overload

from ....passport._utils.model_base import Model as _Model, rest_field

if TYPE_CHECKING:
    from .. import models as _models
List = list


class CommunityTelemetryUploadRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """CommunityTelemetryUploadRequest.

    :ivar content: Required.
    :vartype content: str
    :ivar sign: Required.
    :vartype sign: str
    """

    content: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    sign: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        content: str,
        sign: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class TelemetryEvent(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """TelemetryEvent.

    :ivar application_id:
    :vartype application_id: int
    :ivar application_name:
    :vartype application_name: str
    :ivar event_id:
    :vartype event_id: int
    :ivar event_name:
    :vartype event_name: str
    :ivar event_time:
    :vartype event_time: str
    """

    application_id: Optional[int] = rest_field(
        name="applicationId", visibility=["read", "create", "update", "delete", "query"]
    )
    application_name: Optional[str] = rest_field(
        name="applicationName", visibility=["read", "create", "update", "delete", "query"]
    )
    event_id: Optional[int] = rest_field(name="eventId", visibility=["read", "create", "update", "delete", "query"])
    event_name: Optional[str] = rest_field(name="eventName", visibility=["read", "create", "update", "delete", "query"])
    event_time: Optional[str] = rest_field(name="eventTime", visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        application_id: Optional[int] = None,
        application_name: Optional[str] = None,
        event_id: Optional[int] = None,
        event_name: Optional[str] = None,
        event_time: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GameCrashTelemetryEvent(TelemetryEvent):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameCrashTelemetryEvent.

    :ivar application_id:
    :vartype application_id: int
    :ivar application_name:
    :vartype application_name: str
    :ivar event_id:
    :vartype event_id: int
    :ivar event_name:
    :vartype event_name: str
    :ivar event_time:
    :vartype event_time: str
    :ivar msg_id:
    :vartype msg_id: str
    :ivar upload_content:
    :vartype upload_content: ~uigf.mihoyo.api.request.models.GameCrashTelemetryUploadContent
    """

    msg_id: Optional[str] = rest_field(name="msgID", visibility=["read", "create", "update", "delete", "query"])
    upload_content: Optional["_models.GameCrashTelemetryUploadContent"] = rest_field(
        name="uploadContent", visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        application_id: Optional[int] = None,
        application_name: Optional[str] = None,
        event_id: Optional[int] = None,
        event_name: Optional[str] = None,
        event_time: Optional[str] = None,
        msg_id: Optional[str] = None,
        upload_content: Optional["_models.GameCrashTelemetryUploadContent"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GameCrashTelemetryUploadContent(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameCrashTelemetryUploadContent.

    :ivar auid:
    :vartype auid: str
    :ivar client_ip:
    :vartype client_ip: str
    :ivar cpu_info:
    :vartype cpu_info: str
    :ivar device_model:
    :vartype device_model: str
    :ivar device_name:
    :vartype device_name: str
    :ivar error_code_numeric:
    :vartype error_code_numeric: int
    :ivar error_category:
    :vartype error_category: str
    :ivar error_code:
    :vartype error_code: str
    :ivar error_level:
    :vartype error_level: str
    :ivar exception_serial_num:
    :vartype exception_serial_num: int
    :ivar frame:
    :vartype frame: str
    :ivar gpu_info:
    :vartype gpu_info: str
    :ivar graphics_level:
    :vartype graphics_level: str
    :ivar graphics_version:
    :vartype graphics_version: str
    :ivar guid:
    :vartype guid: str
    :ivar is_release:
    :vartype is_release: bool
    :ivar log_type:
    :vartype log_type: str
    :ivar memory_info:
    :vartype memory_info: str
    :ivar message:
    :vartype message: str
    :ivar notify_user:
    :vartype notify_user: str
    :ivar operating_system:
    :vartype operating_system: str
    :ivar project_nick:
    :vartype project_nick: str
    :ivar server_name:
    :vartype server_name: str
    :ivar stack_trace:
    :vartype stack_trace: str
    :ivar sub_error_code:
    :vartype sub_error_code: str
    :ivar time:
    :vartype time: int
    :ivar user_id:
    :vartype user_id: int
    :ivar user_name:
    :vartype user_name: str
    :ivar user_nick:
    :vartype user_nick: str
    :ivar version:
    :vartype version: str
    """

    auid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    client_ip: Optional[str] = rest_field(name="clientIp", visibility=["read", "create", "update", "delete", "query"])
    cpu_info: Optional[str] = rest_field(name="cpuInfo", visibility=["read", "create", "update", "delete", "query"])
    device_model: Optional[str] = rest_field(
        name="deviceModel", visibility=["read", "create", "update", "delete", "query"]
    )
    device_name: Optional[str] = rest_field(
        name="deviceName", visibility=["read", "create", "update", "delete", "query"]
    )
    error_code_numeric: Optional[int] = rest_field(
        name="error_code", visibility=["read", "create", "update", "delete", "query"]
    )
    error_category: Optional[str] = rest_field(
        name="errorCategory", visibility=["read", "create", "update", "delete", "query"]
    )
    error_code: Optional[str] = rest_field(name="errorCode", visibility=["read", "create", "update", "delete", "query"])
    error_level: Optional[str] = rest_field(
        name="errorLevel", visibility=["read", "create", "update", "delete", "query"]
    )
    exception_serial_num: Optional[int] = rest_field(
        name="exceptionSerialNum", visibility=["read", "create", "update", "delete", "query"]
    )
    frame: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    gpu_info: Optional[str] = rest_field(name="gpuInfo", visibility=["read", "create", "update", "delete", "query"])
    graphics_level: Optional[str] = rest_field(
        name="graphicsLevel", visibility=["read", "create", "update", "delete", "query"]
    )
    graphics_version: Optional[str] = rest_field(
        name="graphicsVersion", visibility=["read", "create", "update", "delete", "query"]
    )
    guid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_release: Optional[bool] = rest_field(
        name="isRelease", visibility=["read", "create", "update", "delete", "query"]
    )
    log_type: Optional[str] = rest_field(name="logType", visibility=["read", "create", "update", "delete", "query"])
    memory_info: Optional[str] = rest_field(
        name="memoryInfo", visibility=["read", "create", "update", "delete", "query"]
    )
    message: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    notify_user: Optional[str] = rest_field(
        name="notifyUser", visibility=["read", "create", "update", "delete", "query"]
    )
    operating_system: Optional[str] = rest_field(
        name="operatingSystem", visibility=["read", "create", "update", "delete", "query"]
    )
    project_nick: Optional[str] = rest_field(
        name="projectNick", visibility=["read", "create", "update", "delete", "query"]
    )
    server_name: Optional[str] = rest_field(
        name="serverName", visibility=["read", "create", "update", "delete", "query"]
    )
    stack_trace: Optional[str] = rest_field(
        name="stackTrace", visibility=["read", "create", "update", "delete", "query"]
    )
    sub_error_code: Optional[str] = rest_field(
        name="subErrorCode", visibility=["read", "create", "update", "delete", "query"]
    )
    time: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    user_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    user_name: Optional[str] = rest_field(name="userName", visibility=["read", "create", "update", "delete", "query"])
    user_nick: Optional[str] = rest_field(name="userNick", visibility=["read", "create", "update", "delete", "query"])
    version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(  # pylint: disable=too-many-locals
        self,
        *,
        auid: Optional[str] = None,
        client_ip: Optional[str] = None,
        cpu_info: Optional[str] = None,
        device_model: Optional[str] = None,
        device_name: Optional[str] = None,
        error_code_numeric: Optional[int] = None,
        error_category: Optional[str] = None,
        error_code: Optional[str] = None,
        error_level: Optional[str] = None,
        exception_serial_num: Optional[int] = None,
        frame: Optional[str] = None,
        gpu_info: Optional[str] = None,
        graphics_level: Optional[str] = None,
        graphics_version: Optional[str] = None,
        guid: Optional[str] = None,
        is_release: Optional[bool] = None,
        log_type: Optional[str] = None,
        memory_info: Optional[str] = None,
        message: Optional[str] = None,
        notify_user: Optional[str] = None,
        operating_system: Optional[str] = None,
        project_nick: Optional[str] = None,
        server_name: Optional[str] = None,
        stack_trace: Optional[str] = None,
        sub_error_code: Optional[str] = None,
        time: Optional[int] = None,
        user_id: Optional[int] = None,
        user_name: Optional[str] = None,
        user_nick: Optional[str] = None,
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


class GameCustomTelemetryEvent(TelemetryEvent):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameCustomTelemetryEvent.

    :ivar application_id:
    :vartype application_id: int
    :ivar application_name:
    :vartype application_name: str
    :ivar event_id:
    :vartype event_id: int
    :ivar event_name:
    :vartype event_name: str
    :ivar event_time:
    :vartype event_time: str
    :ivar msg_id:
    :vartype msg_id: str
    :ivar upload_content:
    :vartype upload_content: ~uigf.mihoyo.api.request.models.GameCustomTelemetryUploadContent
    """

    msg_id: Optional[str] = rest_field(name="msgID", visibility=["read", "create", "update", "delete", "query"])
    upload_content: Optional["_models.GameCustomTelemetryUploadContent"] = rest_field(
        name="uploadContent", visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        application_id: Optional[int] = None,
        application_name: Optional[str] = None,
        event_id: Optional[int] = None,
        event_name: Optional[str] = None,
        event_time: Optional[str] = None,
        msg_id: Optional[str] = None,
        upload_content: Optional["_models.GameCustomTelemetryUploadContent"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GameCustomTelemetryUploadContent(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameCustomTelemetryUploadContent.

    :ivar auid:
    :vartype auid: str
    :ivar client_ip:
    :vartype client_ip: str
    :ivar cpu_info:
    :vartype cpu_info: str
    :ivar device_id:
    :vartype device_id: str
    :ivar device_model:
    :vartype device_model: str
    :ivar device_name:
    :vartype device_name: str
    :ivar gpu_info:
    :vartype gpu_info: str
    :ivar is_release:
    :vartype is_release: bool
    :ivar memory_info:
    :vartype memory_info: str
    :ivar msg:
    :vartype msg: str
    :ivar msg_key:
    :vartype msg_key: str
    :ivar operating_system:
    :vartype operating_system: str
    :ivar platform:
    :vartype platform: int
    :ivar server_name:
    :vartype server_name: str
    :ivar user_id:
    :vartype user_id: int
    :ivar version:
    :vartype version: str
    """

    auid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    client_ip: Optional[str] = rest_field(name="clientIp", visibility=["read", "create", "update", "delete", "query"])
    cpu_info: Optional[str] = rest_field(name="cpuInfo", visibility=["read", "create", "update", "delete", "query"])
    device_id: Optional[str] = rest_field(name="deviceId", visibility=["read", "create", "update", "delete", "query"])
    device_model: Optional[str] = rest_field(
        name="deviceModel", visibility=["read", "create", "update", "delete", "query"]
    )
    device_name: Optional[str] = rest_field(
        name="deviceName", visibility=["read", "create", "update", "delete", "query"]
    )
    gpu_info: Optional[str] = rest_field(name="gpuInfo", visibility=["read", "create", "update", "delete", "query"])
    is_release: Optional[bool] = rest_field(
        name="isRelease", visibility=["read", "create", "update", "delete", "query"]
    )
    memory_info: Optional[str] = rest_field(
        name="memoryInfo", visibility=["read", "create", "update", "delete", "query"]
    )
    msg: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    msg_key: Optional[str] = rest_field(name="msgKey", visibility=["read", "create", "update", "delete", "query"])
    operating_system: Optional[str] = rest_field(
        name="operatingSystem", visibility=["read", "create", "update", "delete", "query"]
    )
    platform: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    server_name: Optional[str] = rest_field(
        name="serverName", visibility=["read", "create", "update", "delete", "query"]
    )
    user_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        auid: Optional[str] = None,
        client_ip: Optional[str] = None,
        cpu_info: Optional[str] = None,
        device_id: Optional[str] = None,
        device_model: Optional[str] = None,
        device_name: Optional[str] = None,
        gpu_info: Optional[str] = None,
        is_release: Optional[bool] = None,
        memory_info: Optional[str] = None,
        msg: Optional[str] = None,
        msg_key: Optional[str] = None,
        operating_system: Optional[str] = None,
        platform: Optional[int] = None,
        server_name: Optional[str] = None,
        user_id: Optional[int] = None,
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


class GameSdkCamelDeviceInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameSdkCamelDeviceInfo.

    :ivar device_id:
    :vartype device_id: str
    :ivar device_model:
    :vartype device_model: str
    :ivar device_name:
    :vartype device_name: str
    :ivar device_sci_x:
    :vartype device_sci_x: int
    :ivar device_sci_y:
    :vartype device_sci_y: int
    :ivar dpi:
    :vartype dpi: int
    :ivar network_type:
    :vartype network_type: str
    :ivar platform:
    :vartype platform: int
    :ivar platform_name:
    :vartype platform_name: str
    :ivar processor_count:
    :vartype processor_count: int
    :ivar processor_type:
    :vartype processor_type: str
    :ivar ram_capacity:
    :vartype ram_capacity: int
    :ivar ram_remain:
    :vartype ram_remain: int
    :ivar system_info:
    :vartype system_info: str
    :ivar system_lang:
    :vartype system_lang: str
    """

    device_id: Optional[str] = rest_field(name="deviceId", visibility=["read", "create", "update", "delete", "query"])
    device_model: Optional[str] = rest_field(
        name="deviceModel", visibility=["read", "create", "update", "delete", "query"]
    )
    device_name: Optional[str] = rest_field(
        name="deviceName", visibility=["read", "create", "update", "delete", "query"]
    )
    device_sci_x: Optional[int] = rest_field(
        name="deviceSciX", visibility=["read", "create", "update", "delete", "query"]
    )
    device_sci_y: Optional[int] = rest_field(
        name="deviceSciY", visibility=["read", "create", "update", "delete", "query"]
    )
    dpi: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    network_type: Optional[str] = rest_field(
        name="networkType", visibility=["read", "create", "update", "delete", "query"]
    )
    platform: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    platform_name: Optional[str] = rest_field(
        name="platformName", visibility=["read", "create", "update", "delete", "query"]
    )
    processor_count: Optional[int] = rest_field(
        name="processorCount", visibility=["read", "create", "update", "delete", "query"]
    )
    processor_type: Optional[str] = rest_field(
        name="processorType", visibility=["read", "create", "update", "delete", "query"]
    )
    ram_capacity: Optional[int] = rest_field(
        name="ramCapacity", visibility=["read", "create", "update", "delete", "query"]
    )
    ram_remain: Optional[int] = rest_field(name="ramRemain", visibility=["read", "create", "update", "delete", "query"])
    system_info: Optional[str] = rest_field(
        name="systemInfo", visibility=["read", "create", "update", "delete", "query"]
    )
    system_lang: Optional[str] = rest_field(
        name="systemLang", visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        device_id: Optional[str] = None,
        device_model: Optional[str] = None,
        device_name: Optional[str] = None,
        device_sci_x: Optional[int] = None,
        device_sci_y: Optional[int] = None,
        dpi: Optional[int] = None,
        network_type: Optional[str] = None,
        platform: Optional[int] = None,
        platform_name: Optional[str] = None,
        processor_count: Optional[int] = None,
        processor_type: Optional[str] = None,
        ram_capacity: Optional[int] = None,
        ram_remain: Optional[int] = None,
        system_info: Optional[str] = None,
        system_lang: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GameSdkLogInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameSdkLogInfo.

    :ivar action_id:
    :vartype action_id: int
    :ivar action_name:
    :vartype action_name: str
    :ivar c_body:
    :vartype c_body: str
    :ivar log_time:
    :vartype log_time: str
    :ivar platform_type:
    :vartype platform_type: str
    :ivar region:
    :vartype region: str
    """

    action_id: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    action_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    c_body: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    log_time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    platform_type: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    region: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        action_id: Optional[int] = None,
        action_name: Optional[str] = None,
        c_body: Optional[str] = None,
        log_time: Optional[str] = None,
        platform_type: Optional[str] = None,
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


class GameSdkSnakeDeviceInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameSdkSnakeDeviceInfo.

    :ivar bundle_id:
    :vartype bundle_id: str
    :ivar channel_id:
    :vartype channel_id: str
    :ivar channel_subid:
    :vartype channel_subid: str
    :ivar channel_subid_int:
    :vartype channel_subid_int: int
    :ivar current_cps:
    :vartype current_cps: str
    :ivar device_fp:
    :vartype device_fp: str
    :ivar device_id:
    :vartype device_id: str
    :ivar device_model:
    :vartype device_model: str
    :ivar device_name:
    :vartype device_name: str
    :ivar ip:
    :vartype ip: str
    :ivar network_type:
    :vartype network_type: str
    :ivar os:
    :vartype os: str
    :ivar plat:
    :vartype plat: int
    :ivar register_cps:
    :vartype register_cps: str
    :ivar uapc:
    :vartype uapc: str
    """

    bundle_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    channel_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    channel_subid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    channel_subid_int: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    current_cps: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_fp: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_model: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    ip: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    network_type: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    os: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    plat: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    register_cps: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    uapc: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        bundle_id: Optional[str] = None,
        channel_id: Optional[str] = None,
        channel_subid: Optional[str] = None,
        channel_subid_int: Optional[int] = None,
        current_cps: Optional[str] = None,
        device_fp: Optional[str] = None,
        device_id: Optional[str] = None,
        device_model: Optional[str] = None,
        device_name: Optional[str] = None,
        ip: Optional[str] = None,
        network_type: Optional[str] = None,
        os: Optional[str] = None,
        plat: Optional[int] = None,
        register_cps: Optional[str] = None,
        uapc: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GameSdkTelemetryEvent(TelemetryEvent):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameSdkTelemetryEvent.

    :ivar application_id:
    :vartype application_id: int
    :ivar application_name:
    :vartype application_name: str
    :ivar event_id:
    :vartype event_id: int
    :ivar event_name:
    :vartype event_name: str
    :ivar event_time:
    :vartype event_time: str
    :ivar msg_id:
    :vartype msg_id: str
    :ivar upload_content:
    :vartype upload_content: ~uigf.mihoyo.api.request.models.GameSdkTelemetryUploadContent
    """

    msg_id: Optional[str] = rest_field(name="msgId", visibility=["read", "create", "update", "delete", "query"])
    upload_content: Optional["_models.GameSdkTelemetryUploadContent"] = rest_field(
        name="uploadContent", visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        application_id: Optional[int] = None,
        application_name: Optional[str] = None,
        event_id: Optional[int] = None,
        event_name: Optional[str] = None,
        event_time: Optional[str] = None,
        msg_id: Optional[str] = None,
        upload_content: Optional["_models.GameSdkTelemetryUploadContent"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GameSdkTelemetryUploadContent(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameSdkTelemetryUploadContent.

    :ivar snake_device_info:
    :vartype snake_device_info: ~uigf.mihoyo.api.request.models.GameSdkSnakeDeviceInfo
    :ivar camel_device_info:
    :vartype camel_device_info: ~uigf.mihoyo.api.request.models.GameSdkCamelDeviceInfo
    :ivar event_time_ms:
    :vartype event_time_ms: str
    :ivar launch_trace_id:
    :vartype launch_trace_id: str
    :ivar log_info:
    :vartype log_info: ~uigf.mihoyo.api.request.models.GameSdkLogInfo
    :ivar telemetry_info:
    :vartype telemetry_info: ~uigf.mihoyo.api.request.models.SdkTelemetryInfo
    :ivar user_info:
    :vartype user_info: ~uigf.mihoyo.api.request.models.GameSdkUserInfo
    :ivar version_info:
    :vartype version_info: ~uigf.mihoyo.api.request.models.GameSdkVersionInfo
    """

    snake_device_info: Optional["_models.GameSdkSnakeDeviceInfo"] = rest_field(
        name="device_info", visibility=["read", "create", "update", "delete", "query"]
    )
    camel_device_info: Optional["_models.GameSdkCamelDeviceInfo"] = rest_field(
        name="deviceInfo", visibility=["read", "create", "update", "delete", "query"]
    )
    event_time_ms: Optional[str] = rest_field(
        name="eventTimeMs", visibility=["read", "create", "update", "delete", "query"]
    )
    launch_trace_id: Optional[str] = rest_field(
        name="launchTraceId", visibility=["read", "create", "update", "delete", "query"]
    )
    log_info: Optional["_models.GameSdkLogInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    telemetry_info: Optional["_models.SdkTelemetryInfo"] = rest_field(
        name="telemetryInfo", visibility=["read", "create", "update", "delete", "query"]
    )
    user_info: Optional["_models.GameSdkUserInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    version_info: Optional["_models.GameSdkVersionInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        snake_device_info: Optional["_models.GameSdkSnakeDeviceInfo"] = None,
        camel_device_info: Optional["_models.GameSdkCamelDeviceInfo"] = None,
        event_time_ms: Optional[str] = None,
        launch_trace_id: Optional[str] = None,
        log_info: Optional["_models.GameSdkLogInfo"] = None,
        telemetry_info: Optional["_models.SdkTelemetryInfo"] = None,
        user_info: Optional["_models.GameSdkUserInfo"] = None,
        version_info: Optional["_models.GameSdkVersionInfo"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class GameSdkUserInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameSdkUserInfo.

    :ivar account_type:
    :vartype account_type: str
    :ivar level:
    :vartype level: str
    :ivar open_id:
    :vartype open_id: str
    :ivar tag:
    :vartype tag: str
    :ivar uid:
    :vartype uid: str
    """

    account_type: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    level: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    open_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    tag: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    uid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        account_type: Optional[str] = None,
        level: Optional[str] = None,
        open_id: Optional[str] = None,
        tag: Optional[str] = None,
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


class GameSdkVersionInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """GameSdkVersionInfo.

    :ivar client_version:
    :vartype client_version: str
    :ivar log_version:
    :vartype log_version: str
    :ivar sdk_env:
    :vartype sdk_env: int
    :ivar sdk_version:
    :vartype sdk_version: str
    """

    client_version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    log_version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    sdk_env: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    sdk_version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        client_version: Optional[str] = None,
        log_version: Optional[str] = None,
        sdk_env: Optional[int] = None,
        sdk_version: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class H5CollectorEventExtraInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """H5CollectorEventExtraInfo.

    :ivar season:
    :vartype season: str
    """

    season: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        season: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class H5CollectorEventInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """H5CollectorEventInfo.

    :ivar event_action:
    :vartype event_action: str
    :ivar event_category:
    :vartype event_category: str
    :ivar event_label:
    :vartype event_label: str
    :ivar event_value: Is either a str type or a int type.
    :vartype event_value: str or int
    :ivar extra_info:
    :vartype extra_info: ~uigf.mihoyo.api.request.models.H5CollectorEventExtraInfo
    :ivar timestamp:
    :vartype timestamp: int
    """

    event_action: Optional[str] = rest_field(
        name="eventAction", visibility=["read", "create", "update", "delete", "query"]
    )
    event_category: Optional[str] = rest_field(
        name="eventCategory", visibility=["read", "create", "update", "delete", "query"]
    )
    event_label: Optional[str] = rest_field(
        name="eventLabel", visibility=["read", "create", "update", "delete", "query"]
    )
    event_value: Optional[Union[str, int]] = rest_field(
        name="eventValue", visibility=["read", "create", "update", "delete", "query"]
    )
    """Is either a str type or a int type."""
    extra_info: Optional["_models.H5CollectorEventExtraInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    timestamp: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        event_action: Optional[str] = None,
        event_category: Optional[str] = None,
        event_label: Optional[str] = None,
        event_value: Optional[Union[str, int]] = None,
        extra_info: Optional["_models.H5CollectorEventExtraInfo"] = None,
        timestamp: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class H5CollectorPageExtraInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """H5CollectorPageExtraInfo.

    :ivar app_id:
    :vartype app_id: str
    :ivar app_version:
    :vartype app_version: str
    :ivar business_url:
    :vartype business_url: str
    :ivar device_fp:
    :vartype device_fp: str
    :ivar device_id:
    :vartype device_id: str
    :ivar environment:
    :vartype environment: str
    :ivar game_biz:
    :vartype game_biz: str
    :ivar is_v2_platform:
    :vartype is_v2_platform: str
    :ivar is_app:
    :vartype is_app: str
    :ivar language:
    :vartype language: str
    :ivar lifecycle_id:
    :vartype lifecycle_id: str
    :ivar sdk_version:
    :vartype sdk_version: str
    :ivar sync_login_status:
    :vartype sync_login_status: bool
    :ivar theme:
    :vartype theme: str
    :ivar token_type:
    :vartype token_type: int
    :ivar view_type:
    :vartype view_type: int
    """

    app_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    app_version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    business_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_fp: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    environment: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    game_biz: Optional[str] = rest_field(name="gameBiz", visibility=["read", "create", "update", "delete", "query"])
    is_v2_platform: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is_app: Optional[str] = rest_field(name="isApp", visibility=["read", "create", "update", "delete", "query"])
    language: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    lifecycle_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    sdk_version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    sync_login_status: Optional[bool] = rest_field(
        name="syncLoginStatus", visibility=["read", "create", "update", "delete", "query"]
    )
    theme: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    token_type: Optional[int] = rest_field(name="tokenType", visibility=["read", "create", "update", "delete", "query"])
    view_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        app_id: Optional[str] = None,
        app_version: Optional[str] = None,
        business_url: Optional[str] = None,
        device_fp: Optional[str] = None,
        device_id: Optional[str] = None,
        environment: Optional[str] = None,
        game_biz: Optional[str] = None,
        is_v2_platform: Optional[str] = None,
        is_app: Optional[str] = None,
        language: Optional[str] = None,
        lifecycle_id: Optional[str] = None,
        sdk_version: Optional[str] = None,
        sync_login_status: Optional[bool] = None,
        theme: Optional[str] = None,
        token_type: Optional[int] = None,
        view_type: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class H5CollectorPageInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """H5CollectorPageInfo.

    :ivar app_id:
    :vartype app_id: str
    :ivar document_referrer:
    :vartype document_referrer: str
    :ivar extra_info:
    :vartype extra_info: ~uigf.mihoyo.api.request.models.H5CollectorPageExtraInfo
    :ivar page_fullurl:
    :vartype page_fullurl: str
    :ivar page_name:
    :vartype page_name: str
    :ivar page_url:
    :vartype page_url: str
    """

    app_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    document_referrer: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    extra_info: Optional["_models.H5CollectorPageExtraInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    page_fullurl: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    page_name: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    page_url: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        app_id: Optional[str] = None,
        document_referrer: Optional[str] = None,
        extra_info: Optional["_models.H5CollectorPageExtraInfo"] = None,
        page_fullurl: Optional[str] = None,
        page_name: Optional[str] = None,
        page_url: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class H5CollectorUploadRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """H5CollectorUploadRequest.

    :ivar analysis_version: Required.
    :vartype analysis_version: str
    :ivar data_belong: Required.
    :vartype data_belong: str
    :ivar event_info: Required.
    :vartype event_info: ~uigf.mihoyo.api.request.models.H5CollectorEventInfo
    :ivar mia_session_id: Required.
    :vartype mia_session_id: str
    :ivar mia_session_step: Required.
    :vartype mia_session_step: str
    :ivar page_info: Required.
    :vartype page_info: ~uigf.mihoyo.api.request.models.H5CollectorPageInfo
    :ivar type: Required.
    :vartype type: str
    :ivar user_info: Required.
    :vartype user_info: ~uigf.mihoyo.api.request.models.H5CollectorUserInfo
    """

    analysis_version: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    data_belong: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    event_info: "_models.H5CollectorEventInfo" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    mia_session_id: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    mia_session_step: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    page_info: "_models.H5CollectorPageInfo" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    type: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    user_info: "_models.H5CollectorUserInfo" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        analysis_version: str,
        data_belong: str,
        event_info: "_models.H5CollectorEventInfo",
        mia_session_id: str,
        mia_session_step: str,
        page_info: "_models.H5CollectorPageInfo",
        type: str,
        user_info: "_models.H5CollectorUserInfo",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class H5CollectorUserInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """H5CollectorUserInfo.

    :ivar account_id:
    :vartype account_id: str
    :ivar auth_key:
    :vartype auth_key: str
    :ivar device:
    :vartype device: str
    :ivar device_id:
    :vartype device_id: str
    :ivar game_biz:
    :vartype game_biz: str
    :ivar game_region:
    :vartype game_region: str
    :ivar game_uid:
    :vartype game_uid: str
    :ivar lang:
    :vartype lang: str
    :ivar platform:
    :vartype platform: str
    :ivar uuid:
    :vartype uuid: str
    """

    account_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    auth_key: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_id: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    game_biz: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    game_region: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    game_uid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    lang: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    platform: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    uuid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        account_id: Optional[str] = None,
        auth_key: Optional[str] = None,
        device: Optional[str] = None,
        device_id: Optional[str] = None,
        game_biz: Optional[str] = None,
        game_region: Optional[str] = None,
        game_uid: Optional[str] = None,
        lang: Optional[str] = None,
        platform: Optional[str] = None,
        uuid: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class LegacyCrashReport(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """LegacyCrashReport.

    :ivar auid:
    :vartype auid: str
    :ivar back_buffer:
    :vartype back_buffer: str
    :ivar build_url:
    :vartype build_url: str
    :ivar client_ip:
    :vartype client_ip: str
    :ivar cpu_info:
    :vartype cpu_info: str
    :ivar device_model:
    :vartype device_model: str
    :ivar device_name:
    :vartype device_name: str
    :ivar error_category:
    :vartype error_category: str
    :ivar error_code:
    :vartype error_code: str
    :ivar error_code_to_platform:
    :vartype error_code_to_platform: int
    :ivar error_level:
    :vartype error_level: str
    :ivar exception_serial_num:
    :vartype exception_serial_num: str
    :ivar frame:
    :vartype frame: str
    :ivar g_buffer:
    :vartype g_buffer: str
    :ivar gpu_info:
    :vartype gpu_info: str
    :ivar graphics_level:
    :vartype graphics_level: str
    :ivar graphics_version:
    :vartype graphics_version: str
    :ivar guid:
    :vartype guid: str
    :ivar is2_g:
    :vartype is2_g: bool
    :ivar login_time:
    :vartype login_time: int
    :ivar log_str:
    :vartype log_str: str
    :ivar log_type:
    :vartype log_type: str
    :ivar memory_info:
    :vartype memory_info: str
    :ivar need_show_err_dlg:
    :vartype need_show_err_dlg: bool
    :ivar notify_user_name:
    :vartype notify_user_name: str
    :ivar operating_system:
    :vartype operating_system: str
    :ivar platform_type:
    :vartype platform_type: int
    :ivar pos:
    :vartype pos: str
    :ivar server_name:
    :vartype server_name: str
    :ivar stack_trace:
    :vartype stack_trace: str
    :ivar sub_error_code:
    :vartype sub_error_code: int
    :ivar time:
    :vartype time: str
    :ivar title:
    :vartype title: str
    :ivar uid:
    :vartype uid: int
    :ivar user_name:
    :vartype user_name: str
    :ivar version:
    :vartype version: str
    """

    auid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    back_buffer: Optional[str] = rest_field(
        name="backBuffer", visibility=["read", "create", "update", "delete", "query"]
    )
    build_url: Optional[str] = rest_field(name="buildUrl", visibility=["read", "create", "update", "delete", "query"])
    client_ip: Optional[str] = rest_field(name="clientIp", visibility=["read", "create", "update", "delete", "query"])
    cpu_info: Optional[str] = rest_field(name="cpuInfo", visibility=["read", "create", "update", "delete", "query"])
    device_model: Optional[str] = rest_field(
        name="deviceModel", visibility=["read", "create", "update", "delete", "query"]
    )
    device_name: Optional[str] = rest_field(
        name="deviceName", visibility=["read", "create", "update", "delete", "query"]
    )
    error_category: Optional[str] = rest_field(
        name="errorCategory", visibility=["read", "create", "update", "delete", "query"]
    )
    error_code: Optional[str] = rest_field(name="errorCode", visibility=["read", "create", "update", "delete", "query"])
    error_code_to_platform: Optional[int] = rest_field(
        name="errorCodeToPlatform", visibility=["read", "create", "update", "delete", "query"]
    )
    error_level: Optional[str] = rest_field(
        name="errorLevel", visibility=["read", "create", "update", "delete", "query"]
    )
    exception_serial_num: Optional[str] = rest_field(
        name="exceptionSerialNum", visibility=["read", "create", "update", "delete", "query"]
    )
    frame: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    g_buffer: Optional[str] = rest_field(name="gBuffer", visibility=["read", "create", "update", "delete", "query"])
    gpu_info: Optional[str] = rest_field(name="gpuInfo", visibility=["read", "create", "update", "delete", "query"])
    graphics_level: Optional[str] = rest_field(
        name="graphicsLevel", visibility=["read", "create", "update", "delete", "query"]
    )
    graphics_version: Optional[str] = rest_field(
        name="graphicsVersion", visibility=["read", "create", "update", "delete", "query"]
    )
    guid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    is2_g: Optional[bool] = rest_field(name="is2g", visibility=["read", "create", "update", "delete", "query"])
    login_time: Optional[int] = rest_field(name="loginTime", visibility=["read", "create", "update", "delete", "query"])
    log_str: Optional[str] = rest_field(name="logStr", visibility=["read", "create", "update", "delete", "query"])
    log_type: Optional[str] = rest_field(name="logType", visibility=["read", "create", "update", "delete", "query"])
    memory_info: Optional[str] = rest_field(
        name="memoryInfo", visibility=["read", "create", "update", "delete", "query"]
    )
    need_show_err_dlg: Optional[bool] = rest_field(
        name="needShowErrDlg", visibility=["read", "create", "update", "delete", "query"]
    )
    notify_user_name: Optional[str] = rest_field(
        name="notifyUserName", visibility=["read", "create", "update", "delete", "query"]
    )
    operating_system: Optional[str] = rest_field(
        name="operatingSystem", visibility=["read", "create", "update", "delete", "query"]
    )
    platform_type: Optional[int] = rest_field(
        name="platformType", visibility=["read", "create", "update", "delete", "query"]
    )
    pos: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    server_name: Optional[str] = rest_field(
        name="serverName", visibility=["read", "create", "update", "delete", "query"]
    )
    stack_trace: Optional[str] = rest_field(
        name="stackTrace", visibility=["read", "create", "update", "delete", "query"]
    )
    sub_error_code: Optional[int] = rest_field(
        name="subErrorCode", visibility=["read", "create", "update", "delete", "query"]
    )
    time: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    title: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    uid: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    user_name: Optional[str] = rest_field(name="userName", visibility=["read", "create", "update", "delete", "query"])
    version: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(  # pylint: disable=too-many-locals
        self,
        *,
        auid: Optional[str] = None,
        back_buffer: Optional[str] = None,
        build_url: Optional[str] = None,
        client_ip: Optional[str] = None,
        cpu_info: Optional[str] = None,
        device_model: Optional[str] = None,
        device_name: Optional[str] = None,
        error_category: Optional[str] = None,
        error_code: Optional[str] = None,
        error_code_to_platform: Optional[int] = None,
        error_level: Optional[str] = None,
        exception_serial_num: Optional[str] = None,
        frame: Optional[str] = None,
        g_buffer: Optional[str] = None,
        gpu_info: Optional[str] = None,
        graphics_level: Optional[str] = None,
        graphics_version: Optional[str] = None,
        guid: Optional[str] = None,
        is2_g: Optional[bool] = None,
        login_time: Optional[int] = None,
        log_str: Optional[str] = None,
        log_type: Optional[str] = None,
        memory_info: Optional[str] = None,
        need_show_err_dlg: Optional[bool] = None,
        notify_user_name: Optional[str] = None,
        operating_system: Optional[str] = None,
        platform_type: Optional[int] = None,
        pos: Optional[str] = None,
        server_name: Optional[str] = None,
        stack_trace: Optional[str] = None,
        sub_error_code: Optional[int] = None,
        time: Optional[str] = None,
        title: Optional[str] = None,
        uid: Optional[int] = None,
        user_name: Optional[str] = None,
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


class LoginTelemetryDeviceInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """LoginTelemetryDeviceInfo.

    :ivar bundle_id:
    :vartype bundle_id: str
    :ivar client_type:
    :vartype client_type: str
    :ivar cps:
    :vartype cps: str
    :ivar device_fp:
    :vartype device_fp: str
    :ivar device_id:
    :vartype device_id: str
    :ivar device_model:
    :vartype device_model: str
    :ivar device_name:
    :vartype device_name: str
    :ivar ip:
    :vartype ip: str
    :ivar isp:
    :vartype isp: str
    :ivar platform:
    :vartype platform: str
    :ivar register_cps:
    :vartype register_cps: str
    :ivar sci_x:
    :vartype sci_x: int
    :ivar sci_y:
    :vartype sci_y: int
    :ivar source_device_id:
    :vartype source_device_id: str
    :ivar system_info:
    :vartype system_info: str
    """

    bundle_id: Optional[str] = rest_field(name="bundleId", visibility=["read", "create", "update", "delete", "query"])
    client_type: Optional[str] = rest_field(
        name="clientType", visibility=["read", "create", "update", "delete", "query"]
    )
    cps: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_fp: Optional[str] = rest_field(name="deviceFp", visibility=["read", "create", "update", "delete", "query"])
    device_id: Optional[str] = rest_field(name="deviceId", visibility=["read", "create", "update", "delete", "query"])
    device_model: Optional[str] = rest_field(
        name="deviceModel", visibility=["read", "create", "update", "delete", "query"]
    )
    device_name: Optional[str] = rest_field(
        name="deviceName", visibility=["read", "create", "update", "delete", "query"]
    )
    ip: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    isp: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    platform: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    register_cps: Optional[str] = rest_field(
        name="registerCPS", visibility=["read", "create", "update", "delete", "query"]
    )
    sci_x: Optional[int] = rest_field(name="sciX", visibility=["read", "create", "update", "delete", "query"])
    sci_y: Optional[int] = rest_field(name="sciY", visibility=["read", "create", "update", "delete", "query"])
    source_device_id: Optional[str] = rest_field(
        name="sourceDeviceId", visibility=["read", "create", "update", "delete", "query"]
    )
    system_info: Optional[str] = rest_field(
        name="systemInfo", visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        bundle_id: Optional[str] = None,
        client_type: Optional[str] = None,
        cps: Optional[str] = None,
        device_fp: Optional[str] = None,
        device_id: Optional[str] = None,
        device_model: Optional[str] = None,
        device_name: Optional[str] = None,
        ip: Optional[str] = None,
        isp: Optional[str] = None,
        platform: Optional[str] = None,
        register_cps: Optional[str] = None,
        sci_x: Optional[int] = None,
        sci_y: Optional[int] = None,
        source_device_id: Optional[str] = None,
        system_info: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class LoginTelemetryEvent(TelemetryEvent):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """LoginTelemetryEvent.

    :ivar application_id:
    :vartype application_id: int
    :ivar application_name:
    :vartype application_name: str
    :ivar event_id:
    :vartype event_id: int
    :ivar event_name:
    :vartype event_name: str
    :ivar event_time:
    :vartype event_time: str
    :ivar msg_id:
    :vartype msg_id: str
    :ivar upload_content:
    :vartype upload_content: ~uigf.mihoyo.api.request.models.LoginTelemetryUploadContent
    """

    msg_id: Optional[str] = rest_field(name="msgId", visibility=["read", "create", "update", "delete", "query"])
    upload_content: Optional["_models.LoginTelemetryUploadContent"] = rest_field(
        name="uploadContent", visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        application_id: Optional[int] = None,
        application_name: Optional[str] = None,
        event_id: Optional[int] = None,
        event_name: Optional[str] = None,
        event_time: Optional[str] = None,
        msg_id: Optional[str] = None,
        upload_content: Optional["_models.LoginTelemetryUploadContent"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class LoginTelemetryLogInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """LoginTelemetryLogInfo.

    :ivar action_id:
    :vartype action_id: int
    :ivar action_name:
    :vartype action_name: str
    :ivar c_body:
    :vartype c_body: str
    :ivar log_time:
    :vartype log_time: str
    """

    action_id: Optional[int] = rest_field(name="actionId", visibility=["read", "create", "update", "delete", "query"])
    action_name: Optional[str] = rest_field(
        name="actionName", visibility=["read", "create", "update", "delete", "query"]
    )
    c_body: Optional[str] = rest_field(name="cBody", visibility=["read", "create", "update", "delete", "query"])
    log_time: Optional[str] = rest_field(name="logTime", visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        action_id: Optional[int] = None,
        action_name: Optional[str] = None,
        c_body: Optional[str] = None,
        log_time: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class LoginTelemetryUploadContent(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """LoginTelemetryUploadContent.

    :ivar deviceinfo:
    :vartype deviceinfo: ~uigf.mihoyo.api.request.models.LoginTelemetryDeviceInfo
    :ivar loginfo:
    :vartype loginfo: ~uigf.mihoyo.api.request.models.LoginTelemetryLogInfo
    :ivar userinfo:
    :vartype userinfo: ~uigf.mihoyo.api.request.models.LoginTelemetryUserInfo
    :ivar versioninfo:
    :vartype versioninfo: ~uigf.mihoyo.api.request.models.LoginTelemetryVersionInfo
    """

    deviceinfo: Optional["_models.LoginTelemetryDeviceInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    loginfo: Optional["_models.LoginTelemetryLogInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    userinfo: Optional["_models.LoginTelemetryUserInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    versioninfo: Optional["_models.LoginTelemetryVersionInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        deviceinfo: Optional["_models.LoginTelemetryDeviceInfo"] = None,
        loginfo: Optional["_models.LoginTelemetryLogInfo"] = None,
        userinfo: Optional["_models.LoginTelemetryUserInfo"] = None,
        versioninfo: Optional["_models.LoginTelemetryVersionInfo"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class LoginTelemetryUserInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """LoginTelemetryUserInfo.

    :ivar account_id:
    :vartype account_id: str
    :ivar account_type:
    :vartype account_type: int
    :ivar channel_id:
    :vartype channel_id: int
    :ivar mid:
    :vartype mid: str
    :ivar user_id:
    :vartype user_id: int
    """

    account_id: Optional[str] = rest_field(name="accountId", visibility=["read", "create", "update", "delete", "query"])
    account_type: Optional[int] = rest_field(
        name="accountType", visibility=["read", "create", "update", "delete", "query"]
    )
    channel_id: Optional[int] = rest_field(name="channelId", visibility=["read", "create", "update", "delete", "query"])
    mid: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    user_id: Optional[int] = rest_field(name="userId", visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        account_id: Optional[str] = None,
        account_type: Optional[int] = None,
        channel_id: Optional[int] = None,
        mid: Optional[str] = None,
        user_id: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class LoginTelemetryVersionInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """LoginTelemetryVersionInfo.

    :ivar client_version:
    :vartype client_version: str
    :ivar log_version:
    :vartype log_version: str
    :ivar sdk_version:
    :vartype sdk_version: str
    """

    client_version: Optional[str] = rest_field(
        name="clientVersion", visibility=["read", "create", "update", "delete", "query"]
    )
    log_version: Optional[str] = rest_field(
        name="logVersion", visibility=["read", "create", "update", "delete", "query"]
    )
    sdk_version: Optional[str] = rest_field(
        name="sdkVersion", visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        client_version: Optional[str] = None,
        log_version: Optional[str] = None,
        sdk_version: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileDeviceSessionRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileDeviceSessionRequest.

    :ivar app_version: Required.
    :vartype app_version: str
    :ivar device_id: Required.
    :vartype device_id: str
    :ivar device_name: Required.
    :vartype device_name: str
    :ivar os_version: Required.
    :vartype os_version: str
    :ivar platform: Required.
    :vartype platform: str
    :ivar registration_id: Required.
    :vartype registration_id: str
    """

    app_version: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    device_id: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    device_name: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    os_version: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    platform: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    registration_id: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        app_version: str,
        device_id: str,
        device_name: str,
        os_version: str,
        platform: str,
        registration_id: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileLoginRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileLoginRequest.

    :ivar source_id: Required.
    :vartype source_id: str
    :ivar source_key: Required.
    :vartype source_key: str
    :ivar source_name: Required.
    :vartype source_name: str
    :ivar source_type: Required.
    :vartype source_type: int
    """

    source_id: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    source_key: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    source_name: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    source_type: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        source_id: str,
        source_key: str,
        source_name: str,
        source_type: int,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobilePreloadConfigRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobilePreloadConfigRequest.

    :ivar client_version: Required.
    :vartype client_version: str
    :ivar platform: Required.
    :vartype platform: str
    :ivar rn_app: Required.
    :vartype rn_app: str
    :ivar rn_infos: Required.
    :vartype rn_infos: list[~uigf.mihoyo.api.request.models.MobilePreloadResourceInfo]
    """

    client_version: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    platform: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    rn_app: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    rn_infos: list["_models.MobilePreloadResourceInfo"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Required."""

    @overload
    def __init__(
        self,
        *,
        client_version: str,
        platform: str,
        rn_app: str,
        rn_infos: list["_models.MobilePreloadResourceInfo"],
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobilePreloadResourceInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobilePreloadResourceInfo.

    :ivar module_name: Required.
    :vartype module_name: str
    :ivar resource_url: Required.
    :vartype resource_url: str
    :ivar rn_version: Required.
    :vartype rn_version: str
    :ivar sha1: Required.
    :vartype sha1: str
    """

    module_name: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    resource_url: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    rn_version: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    sha1: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        module_name: str,
        resource_url: str,
        rn_version: str,
        sha1: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileStartupImageTemplateRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileStartupImageTemplateRequest.

    :ivar client_type:
    :vartype client_type: int
    """

    client_type: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        client_type: Optional[int] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileStartupRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileStartupRequest.

    :ivar req_list: Required.
    :vartype req_list: list[~uigf.mihoyo.api.request.models.MobileStartupRequestItem]
    """

    req_list: list["_models.MobileStartupRequestItem"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    """Required."""

    @overload
    def __init__(
        self,
        *,
        req_list: list["_models.MobileStartupRequestItem"],
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileStartupRequestItem(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileStartupRequestItem.

    :ivar api_url: Required.
    :vartype api_url: str
    :ivar req: Required.
    :vartype req: ~uigf.mihoyo.api.request.models.MobileStartupRequestPayload
    """

    api_url: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    req: "_models.MobileStartupRequestPayload" = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        api_url: str,
        req: "_models.MobileStartupRequestPayload",
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileStartupRequestPayload(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileStartupRequestPayload.

    :ivar fetch_image_template_list_req:
    :vartype fetch_image_template_list_req:
     ~uigf.mihoyo.api.request.models.MobileStartupImageTemplateRequest
    :ivar get_all_game_role_keyword_req:
    :vartype get_all_game_role_keyword_req: dict[str, any]
    :ivar get_all_static_resource_versions_req:
    :vartype get_all_static_resource_versions_req: dict[str, any]
    :ivar get_app_config_request:
    :vartype get_app_config_request: dict[str, any]
    :ivar get_app_media_data_req:
    :vartype get_app_media_data_req: dict[str, any]
    :ivar get_link_card_whitelist_req:
    :vartype get_link_card_whitelist_req: dict[str, any]
    :ivar get_teenager_info_req:
    :vartype get_teenager_info_req: dict[str, any]
    :ivar recent_emoticon_list_req:
    :vartype recent_emoticon_list_req: dict[str, any]
    """

    fetch_image_template_list_req: Optional["_models.MobileStartupImageTemplateRequest"] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    get_all_game_role_keyword_req: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    get_all_static_resource_versions_req: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    get_app_config_request: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    get_app_media_data_req: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    get_link_card_whitelist_req: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    get_teenager_info_req: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )
    recent_emoticon_list_req: Optional[dict[str, Any]] = rest_field(
        visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        fetch_image_template_list_req: Optional["_models.MobileStartupImageTemplateRequest"] = None,
        get_all_game_role_keyword_req: Optional[dict[str, Any]] = None,
        get_all_static_resource_versions_req: Optional[dict[str, Any]] = None,
        get_app_config_request: Optional[dict[str, Any]] = None,
        get_app_media_data_req: Optional[dict[str, Any]] = None,
        get_link_card_whitelist_req: Optional[dict[str, Any]] = None,
        get_teenager_info_req: Optional[dict[str, Any]] = None,
        recent_emoticon_list_req: Optional[dict[str, Any]] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileWindowPrepareRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileWindowPrepareRequest.

    :ivar focus_game: Required.
    :vartype focus_game: list[str]
    """

    focus_game: list[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        focus_game: list[str],
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class MobileWindowShowRequest(
    MobileWindowPrepareRequest
):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """MobileWindowShowRequest.

    :ivar focus_game: Required.
    :vartype focus_game: list[str]
    :ivar install_status: Required.
    :vartype install_status: dict[str, any]
    :ivar ticket: Required.
    :vartype ticket: str
    """

    install_status: dict[str, Any] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    ticket: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        focus_game: list[str],
        install_status: dict[str, Any],
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


class SdkTelemetryDeviceInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkTelemetryDeviceInfo.

    :ivar address_mac:
    :vartype address_mac: str
    :ivar bundle_id:
    :vartype bundle_id: str
    :ivar cps:
    :vartype cps: str
    :ivar device_fp:
    :vartype device_fp: str
    :ivar snake_device_sci_x:
    :vartype snake_device_sci_x: int
    :ivar snake_device_sci_y:
    :vartype snake_device_sci_y: int
    :ivar device_id:
    :vartype device_id: str
    :ivar device_model:
    :vartype device_model: str
    :ivar device_name:
    :vartype device_name: str
    :ivar device_sci_x:
    :vartype device_sci_x: int
    :ivar device_sci_y:
    :vartype device_sci_y: int
    :ivar dpi:
    :vartype dpi: int
    :ivar gpu_mem_size:
    :vartype gpu_mem_size: int
    :ivar gpu_name:
    :vartype gpu_name: str
    :ivar ip:
    :vartype ip: str
    :ivar isp:
    :vartype isp: str
    :ivar snake_network_type:
    :vartype snake_network_type: str
    :ivar network_type:
    :vartype network_type: str
    :ivar platform: Is either a str type or a int type.
    :vartype platform: str or int
    :ivar platform_name:
    :vartype platform_name: str
    :ivar processor_count:
    :vartype processor_count: int
    :ivar processor_frequency:
    :vartype processor_frequency: float
    :ivar processor_type:
    :vartype processor_type: str
    :ivar ram_capacity: Is either a int type or a float type.
    :vartype ram_capacity: int or float
    :ivar ram_remain: Is either a int type or a float type.
    :vartype ram_remain: int or float
    :ivar register_cps:
    :vartype register_cps: str
    :ivar rom_capacity: Is either a int type or a float type.
    :vartype rom_capacity: int or float
    :ivar rom_remain:
    :vartype rom_remain: float
    :ivar soft_sci_x:
    :vartype soft_sci_x: int
    :ivar soft_sci_y:
    :vartype soft_sci_y: int
    :ivar system_info:
    :vartype system_info: str
    :ivar system_lang:
    :vartype system_lang: str
    :ivar uapc:
    :vartype uapc: str
    :ivar wmac:
    :vartype wmac: str
    """

    address_mac: Optional[str] = rest_field(
        name="addressMac", visibility=["read", "create", "update", "delete", "query"]
    )
    bundle_id: Optional[str] = rest_field(name="bundleId", visibility=["read", "create", "update", "delete", "query"])
    cps: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    device_fp: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    snake_device_sci_x: Optional[int] = rest_field(
        name="device_sciX", visibility=["read", "create", "update", "delete", "query"]
    )
    snake_device_sci_y: Optional[int] = rest_field(
        name="device_sciY", visibility=["read", "create", "update", "delete", "query"]
    )
    device_id: Optional[str] = rest_field(name="deviceId", visibility=["read", "create", "update", "delete", "query"])
    device_model: Optional[str] = rest_field(
        name="deviceModel", visibility=["read", "create", "update", "delete", "query"]
    )
    device_name: Optional[str] = rest_field(
        name="deviceName", visibility=["read", "create", "update", "delete", "query"]
    )
    device_sci_x: Optional[int] = rest_field(
        name="deviceSciX", visibility=["read", "create", "update", "delete", "query"]
    )
    device_sci_y: Optional[int] = rest_field(
        name="deviceSciY", visibility=["read", "create", "update", "delete", "query"]
    )
    dpi: Optional[int] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    gpu_mem_size: Optional[int] = rest_field(
        name="gpuMemSize", visibility=["read", "create", "update", "delete", "query"]
    )
    gpu_name: Optional[str] = rest_field(name="gpuName", visibility=["read", "create", "update", "delete", "query"])
    ip: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    isp: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    snake_network_type: Optional[str] = rest_field(
        name="network_type", visibility=["read", "create", "update", "delete", "query"]
    )
    network_type: Optional[str] = rest_field(
        name="networkType", visibility=["read", "create", "update", "delete", "query"]
    )
    platform: Optional[Union[str, int]] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Is either a str type or a int type."""
    platform_name: Optional[str] = rest_field(
        name="platformName", visibility=["read", "create", "update", "delete", "query"]
    )
    processor_count: Optional[int] = rest_field(
        name="processorCount", visibility=["read", "create", "update", "delete", "query"]
    )
    processor_frequency: Optional[float] = rest_field(
        name="processorFrequency", visibility=["read", "create", "update", "delete", "query"]
    )
    processor_type: Optional[str] = rest_field(
        name="processorType", visibility=["read", "create", "update", "delete", "query"]
    )
    ram_capacity: Optional[Union[int, float]] = rest_field(
        name="ramCapacity", visibility=["read", "create", "update", "delete", "query"]
    )
    """Is either a int type or a float type."""
    ram_remain: Optional[Union[int, float]] = rest_field(
        name="ramRemain", visibility=["read", "create", "update", "delete", "query"]
    )
    """Is either a int type or a float type."""
    register_cps: Optional[str] = rest_field(
        name="registerCPS", visibility=["read", "create", "update", "delete", "query"]
    )
    rom_capacity: Optional[Union[int, float]] = rest_field(
        name="romCapacity", visibility=["read", "create", "update", "delete", "query"]
    )
    """Is either a int type or a float type."""
    rom_remain: Optional[float] = rest_field(
        name="romRemain", visibility=["read", "create", "update", "delete", "query"]
    )
    soft_sci_x: Optional[int] = rest_field(name="soft_sciX", visibility=["read", "create", "update", "delete", "query"])
    soft_sci_y: Optional[int] = rest_field(name="soft_sciY", visibility=["read", "create", "update", "delete", "query"])
    system_info: Optional[str] = rest_field(
        name="systemInfo", visibility=["read", "create", "update", "delete", "query"]
    )
    system_lang: Optional[str] = rest_field(
        name="systemLang", visibility=["read", "create", "update", "delete", "query"]
    )
    uapc: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    wmac: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(  # pylint: disable=too-many-locals
        self,
        *,
        address_mac: Optional[str] = None,
        bundle_id: Optional[str] = None,
        cps: Optional[str] = None,
        device_fp: Optional[str] = None,
        snake_device_sci_x: Optional[int] = None,
        snake_device_sci_y: Optional[int] = None,
        device_id: Optional[str] = None,
        device_model: Optional[str] = None,
        device_name: Optional[str] = None,
        device_sci_x: Optional[int] = None,
        device_sci_y: Optional[int] = None,
        dpi: Optional[int] = None,
        gpu_mem_size: Optional[int] = None,
        gpu_name: Optional[str] = None,
        ip: Optional[str] = None,
        isp: Optional[str] = None,
        snake_network_type: Optional[str] = None,
        network_type: Optional[str] = None,
        platform: Optional[Union[str, int]] = None,
        platform_name: Optional[str] = None,
        processor_count: Optional[int] = None,
        processor_frequency: Optional[float] = None,
        processor_type: Optional[str] = None,
        ram_capacity: Optional[Union[int, float]] = None,
        ram_remain: Optional[Union[int, float]] = None,
        register_cps: Optional[str] = None,
        rom_capacity: Optional[Union[int, float]] = None,
        rom_remain: Optional[float] = None,
        soft_sci_x: Optional[int] = None,
        soft_sci_y: Optional[int] = None,
        system_info: Optional[str] = None,
        system_lang: Optional[str] = None,
        uapc: Optional[str] = None,
        wmac: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkTelemetryInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkTelemetryInfo.

    :ivar area:
    :vartype area: str
    :ivar lifecycle_id:
    :vartype lifecycle_id: str
    :ivar telemetry_version:
    :vartype telemetry_version: str
    """

    area: Optional[str] = rest_field(visibility=["read", "create", "update", "delete", "query"])
    lifecycle_id: Optional[str] = rest_field(
        name="lifecycleId", visibility=["read", "create", "update", "delete", "query"]
    )
    telemetry_version: Optional[str] = rest_field(
        name="telemetryVersion", visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        area: Optional[str] = None,
        lifecycle_id: Optional[str] = None,
        telemetry_version: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkTelemetryLogInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkTelemetryLogInfo.

    :ivar action_id:
    :vartype action_id: int
    :ivar action_name:
    :vartype action_name: str
    :ivar c_body:
    :vartype c_body: str
    :ivar log_time:
    :vartype log_time: str
    """

    action_id: Optional[int] = rest_field(name="actionId", visibility=["read", "create", "update", "delete", "query"])
    action_name: Optional[str] = rest_field(
        name="actionName", visibility=["read", "create", "update", "delete", "query"]
    )
    c_body: Optional[str] = rest_field(name="cBody", visibility=["read", "create", "update", "delete", "query"])
    log_time: Optional[str] = rest_field(name="logTime", visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        action_id: Optional[int] = None,
        action_name: Optional[str] = None,
        c_body: Optional[str] = None,
        log_time: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkTelemetryUploadContent(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkTelemetryUploadContent.

    :ivar device_info:
    :vartype device_info: ~uigf.mihoyo.api.request.models.SdkTelemetryDeviceInfo
    :ivar event_time_ms:
    :vartype event_time_ms: str
    :ivar launch_trace_id:
    :vartype launch_trace_id: str
    :ivar log_info:
    :vartype log_info: ~uigf.mihoyo.api.request.models.SdkTelemetryLogInfo
    :ivar telemetry_info:
    :vartype telemetry_info: ~uigf.mihoyo.api.request.models.SdkTelemetryInfo
    :ivar user_info:
    :vartype user_info: ~uigf.mihoyo.api.request.models.SdkTelemetryUserInfo
    :ivar version_info:
    :vartype version_info: ~uigf.mihoyo.api.request.models.SdkTelemetryVersionInfo
    """

    device_info: Optional["_models.SdkTelemetryDeviceInfo"] = rest_field(
        name="deviceInfo", visibility=["read", "create", "update", "delete", "query"]
    )
    event_time_ms: Optional[str] = rest_field(
        name="eventTimeMs", visibility=["read", "create", "update", "delete", "query"]
    )
    launch_trace_id: Optional[str] = rest_field(
        name="launchTraceId", visibility=["read", "create", "update", "delete", "query"]
    )
    log_info: Optional["_models.SdkTelemetryLogInfo"] = rest_field(
        name="logInfo", visibility=["read", "create", "update", "delete", "query"]
    )
    telemetry_info: Optional["_models.SdkTelemetryInfo"] = rest_field(
        name="telemetryInfo", visibility=["read", "create", "update", "delete", "query"]
    )
    user_info: Optional["_models.SdkTelemetryUserInfo"] = rest_field(
        name="userInfo", visibility=["read", "create", "update", "delete", "query"]
    )
    version_info: Optional["_models.SdkTelemetryVersionInfo"] = rest_field(
        name="versionInfo", visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        device_info: Optional["_models.SdkTelemetryDeviceInfo"] = None,
        event_time_ms: Optional[str] = None,
        launch_trace_id: Optional[str] = None,
        log_info: Optional["_models.SdkTelemetryLogInfo"] = None,
        telemetry_info: Optional["_models.SdkTelemetryInfo"] = None,
        user_info: Optional["_models.SdkTelemetryUserInfo"] = None,
        version_info: Optional["_models.SdkTelemetryVersionInfo"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkTelemetryUploadEvent(TelemetryEvent):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkTelemetryUploadEvent.

    :ivar application_id:
    :vartype application_id: int
    :ivar application_name:
    :vartype application_name: str
    :ivar event_id:
    :vartype event_id: int
    :ivar event_name:
    :vartype event_name: str
    :ivar event_time:
    :vartype event_time: str
    :ivar msg_id:
    :vartype msg_id: str
    :ivar upload_content:
    :vartype upload_content: ~uigf.mihoyo.api.request.models.SdkTelemetryUploadContent
    """

    msg_id: Optional[str] = rest_field(name="msgId", visibility=["read", "create", "update", "delete", "query"])
    upload_content: Optional["_models.SdkTelemetryUploadContent"] = rest_field(
        name="uploadContent", visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        application_id: Optional[int] = None,
        application_name: Optional[str] = None,
        event_id: Optional[int] = None,
        event_name: Optional[str] = None,
        event_time: Optional[str] = None,
        msg_id: Optional[str] = None,
        upload_content: Optional["_models.SdkTelemetryUploadContent"] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkTelemetryUserInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkTelemetryUserInfo.

    :ivar account_id:
    :vartype account_id: str
    :ivar account_type:
    :vartype account_type: str
    :ivar channel_id:
    :vartype channel_id: str
    :ivar user_id:
    :vartype user_id: str
    """

    account_id: Optional[str] = rest_field(name="accountId", visibility=["read", "create", "update", "delete", "query"])
    account_type: Optional[str] = rest_field(
        name="accountType", visibility=["read", "create", "update", "delete", "query"]
    )
    channel_id: Optional[str] = rest_field(name="channelId", visibility=["read", "create", "update", "delete", "query"])
    user_id: Optional[str] = rest_field(name="userId", visibility=["read", "create", "update", "delete", "query"])

    @overload
    def __init__(
        self,
        *,
        account_id: Optional[str] = None,
        account_type: Optional[str] = None,
        channel_id: Optional[str] = None,
        user_id: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class SdkTelemetryVersionInfo(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """SdkTelemetryVersionInfo.

    :ivar client_version:
    :vartype client_version: str
    :ivar log_version:
    :vartype log_version: str
    """

    client_version: Optional[str] = rest_field(
        name="clientVersion", visibility=["read", "create", "update", "delete", "query"]
    )
    log_version: Optional[str] = rest_field(
        name="logVersion", visibility=["read", "create", "update", "delete", "query"]
    )

    @overload
    def __init__(
        self,
        *,
        client_version: Optional[str] = None,
        log_version: Optional[str] = None,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)


class ZenlessFeedbackCollectionRequest(_Model):  # pylint: disable=docstring-keyword-should-match-keyword-only
    """ZenlessFeedbackCollectionRequest.

    :ivar region: Required.
    :vartype region: str
    :ivar schedule_id: Required.
    :vartype schedule_id: str
    :ivar score: Required.
    :vartype score: int
    :ivar source: Required.
    :vartype source: int
    :ivar tool_type: Required.
    :vartype tool_type: int
    :ivar uid: Required.
    :vartype uid: str
    """

    region: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    schedule_id: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    score: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    source: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    tool_type: int = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""
    uid: str = rest_field(visibility=["read", "create", "update", "delete", "query"])
    """Required."""

    @overload
    def __init__(
        self,
        *,
        region: str,
        schedule_id: str,
        score: int,
        source: int,
        tool_type: int,
        uid: str,
    ) -> None: ...

    @overload
    def __init__(self, mapping: Mapping[str, Any]) -> None:
        """
        :param mapping: raw JSON to initialize the model.
        :type mapping: Mapping[str, Any]
        """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)
