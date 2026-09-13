# pylint: disable=too-many-lines
# coding=utf-8

from typing import Any, Union
from typing_extensions import Required, TypedDict


class CommunityTelemetryUploadRequest(TypedDict, total=False):
    """CommunityTelemetryUploadRequest.

    :ivar content: Required.
    :vartype content: str
    :ivar sign: Required.
    :vartype sign: str
    """

    content: Required[str]
    """Required."""
    sign: Required[str]
    """Required."""


class TelemetryEvent(TypedDict, total=False):
    """TelemetryEvent.

    :ivar applicationId:
    :vartype applicationId: int
    :ivar applicationName:
    :vartype applicationName: str
    :ivar eventId:
    :vartype eventId: int
    :ivar eventName:
    :vartype eventName: str
    :ivar eventTime:
    :vartype eventTime: str
    """

    applicationId: int
    applicationName: str
    eventId: int
    eventName: str
    eventTime: str


class GameCrashTelemetryEvent(TelemetryEvent):
    """GameCrashTelemetryEvent.

    :ivar applicationId:
    :vartype applicationId: int
    :ivar applicationName:
    :vartype applicationName: str
    :ivar eventId:
    :vartype eventId: int
    :ivar eventName:
    :vartype eventName: str
    :ivar eventTime:
    :vartype eventTime: str
    :ivar msgID:
    :vartype msgID: str
    :ivar uploadContent:
    :vartype uploadContent: "GameCrashTelemetryUploadContent"
    """

    msgID: str
    uploadContent: "GameCrashTelemetryUploadContent"


class GameCrashTelemetryUploadContent(TypedDict, total=False):
    """GameCrashTelemetryUploadContent.

    :ivar auid:
    :vartype auid: str
    :ivar clientIp:
    :vartype clientIp: str
    :ivar cpuInfo:
    :vartype cpuInfo: str
    :ivar deviceModel:
    :vartype deviceModel: str
    :ivar deviceName:
    :vartype deviceName: str
    :ivar error_code:
    :vartype error_code: int
    :ivar errorCategory:
    :vartype errorCategory: str
    :ivar errorCode:
    :vartype errorCode: str
    :ivar errorLevel:
    :vartype errorLevel: str
    :ivar exceptionSerialNum:
    :vartype exceptionSerialNum: int
    :ivar frame:
    :vartype frame: str
    :ivar gpuInfo:
    :vartype gpuInfo: str
    :ivar graphicsLevel:
    :vartype graphicsLevel: str
    :ivar graphicsVersion:
    :vartype graphicsVersion: str
    :ivar guid:
    :vartype guid: str
    :ivar isRelease:
    :vartype isRelease: bool
    :ivar logType:
    :vartype logType: str
    :ivar memoryInfo:
    :vartype memoryInfo: str
    :ivar message:
    :vartype message: str
    :ivar notifyUser:
    :vartype notifyUser: str
    :ivar operatingSystem:
    :vartype operatingSystem: str
    :ivar projectNick:
    :vartype projectNick: str
    :ivar serverName:
    :vartype serverName: str
    :ivar stackTrace:
    :vartype stackTrace: str
    :ivar subErrorCode:
    :vartype subErrorCode: str
    :ivar time:
    :vartype time: int
    :ivar user_id:
    :vartype user_id: int
    :ivar userName:
    :vartype userName: str
    :ivar userNick:
    :vartype userNick: str
    :ivar version:
    :vartype version: str
    """

    auid: str
    clientIp: str
    cpuInfo: str
    deviceModel: str
    deviceName: str
    error_code: int
    errorCategory: str
    errorCode: str
    errorLevel: str
    exceptionSerialNum: int
    frame: str
    gpuInfo: str
    graphicsLevel: str
    graphicsVersion: str
    guid: str
    isRelease: bool
    logType: str
    memoryInfo: str
    message: str
    notifyUser: str
    operatingSystem: str
    projectNick: str
    serverName: str
    stackTrace: str
    subErrorCode: str
    time: int
    user_id: int
    userName: str
    userNick: str
    version: str


class GameCustomTelemetryEvent(TelemetryEvent):
    """GameCustomTelemetryEvent.

    :ivar applicationId:
    :vartype applicationId: int
    :ivar applicationName:
    :vartype applicationName: str
    :ivar eventId:
    :vartype eventId: int
    :ivar eventName:
    :vartype eventName: str
    :ivar eventTime:
    :vartype eventTime: str
    :ivar msgID:
    :vartype msgID: str
    :ivar uploadContent:
    :vartype uploadContent: "GameCustomTelemetryUploadContent"
    """

    msgID: str
    uploadContent: "GameCustomTelemetryUploadContent"


class GameCustomTelemetryUploadContent(TypedDict, total=False):
    """GameCustomTelemetryUploadContent.

    :ivar auid:
    :vartype auid: str
    :ivar clientIp:
    :vartype clientIp: str
    :ivar cpuInfo:
    :vartype cpuInfo: str
    :ivar deviceId:
    :vartype deviceId: str
    :ivar deviceModel:
    :vartype deviceModel: str
    :ivar deviceName:
    :vartype deviceName: str
    :ivar gpuInfo:
    :vartype gpuInfo: str
    :ivar isRelease:
    :vartype isRelease: bool
    :ivar memoryInfo:
    :vartype memoryInfo: str
    :ivar msg:
    :vartype msg: str
    :ivar msgKey:
    :vartype msgKey: str
    :ivar operatingSystem:
    :vartype operatingSystem: str
    :ivar platform:
    :vartype platform: int
    :ivar serverName:
    :vartype serverName: str
    :ivar user_id:
    :vartype user_id: int
    :ivar version:
    :vartype version: str
    """

    auid: str
    clientIp: str
    cpuInfo: str
    deviceId: str
    deviceModel: str
    deviceName: str
    gpuInfo: str
    isRelease: bool
    memoryInfo: str
    msg: str
    msgKey: str
    operatingSystem: str
    platform: int
    serverName: str
    user_id: int
    version: str


class GameSdkCamelDeviceInfo(TypedDict, total=False):
    """GameSdkCamelDeviceInfo.

    :ivar deviceId:
    :vartype deviceId: str
    :ivar deviceModel:
    :vartype deviceModel: str
    :ivar deviceName:
    :vartype deviceName: str
    :ivar deviceSciX:
    :vartype deviceSciX: int
    :ivar deviceSciY:
    :vartype deviceSciY: int
    :ivar dpi:
    :vartype dpi: int
    :ivar networkType:
    :vartype networkType: str
    :ivar platform:
    :vartype platform: int
    :ivar platformName:
    :vartype platformName: str
    :ivar processorCount:
    :vartype processorCount: int
    :ivar processorType:
    :vartype processorType: str
    :ivar ramCapacity:
    :vartype ramCapacity: int
    :ivar ramRemain:
    :vartype ramRemain: int
    :ivar systemInfo:
    :vartype systemInfo: str
    :ivar systemLang:
    :vartype systemLang: str
    """

    deviceId: str
    deviceModel: str
    deviceName: str
    deviceSciX: int
    deviceSciY: int
    dpi: int
    networkType: str
    platform: int
    platformName: str
    processorCount: int
    processorType: str
    ramCapacity: int
    ramRemain: int
    systemInfo: str
    systemLang: str


class GameSdkLogInfo(TypedDict, total=False):
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

    action_id: int
    action_name: str
    c_body: str
    log_time: str
    platform_type: str
    region: str


class GameSdkSnakeDeviceInfo(TypedDict, total=False):
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

    bundle_id: str
    channel_id: str
    channel_subid: str
    channel_subid_int: int
    current_cps: str
    device_fp: str
    device_id: str
    device_model: str
    device_name: str
    ip: str
    network_type: str
    os: str
    plat: int
    register_cps: str
    uapc: str


class GameSdkTelemetryEvent(TelemetryEvent):
    """GameSdkTelemetryEvent.

    :ivar applicationId:
    :vartype applicationId: int
    :ivar applicationName:
    :vartype applicationName: str
    :ivar eventId:
    :vartype eventId: int
    :ivar eventName:
    :vartype eventName: str
    :ivar eventTime:
    :vartype eventTime: str
    :ivar msgId:
    :vartype msgId: str
    :ivar uploadContent:
    :vartype uploadContent: "GameSdkTelemetryUploadContent"
    """

    msgId: str
    uploadContent: "GameSdkTelemetryUploadContent"


class GameSdkTelemetryUploadContent(TypedDict, total=False):
    """GameSdkTelemetryUploadContent.

    :ivar device_info:
    :vartype device_info: "GameSdkSnakeDeviceInfo"
    :ivar deviceInfo:
    :vartype deviceInfo: "GameSdkCamelDeviceInfo"
    :ivar eventTimeMs:
    :vartype eventTimeMs: str
    :ivar launchTraceId:
    :vartype launchTraceId: str
    :ivar log_info:
    :vartype log_info: "GameSdkLogInfo"
    :ivar telemetryInfo:
    :vartype telemetryInfo: "SdkTelemetryInfo"
    :ivar user_info:
    :vartype user_info: "GameSdkUserInfo"
    :ivar version_info:
    :vartype version_info: "GameSdkVersionInfo"
    """

    device_info: "GameSdkSnakeDeviceInfo"
    deviceInfo: "GameSdkCamelDeviceInfo"
    eventTimeMs: str
    launchTraceId: str
    log_info: "GameSdkLogInfo"
    telemetryInfo: "SdkTelemetryInfo"
    user_info: "GameSdkUserInfo"
    version_info: "GameSdkVersionInfo"


class GameSdkUserInfo(TypedDict, total=False):
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

    account_type: str
    level: str
    open_id: str
    tag: str
    uid: str


class GameSdkVersionInfo(TypedDict, total=False):
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

    client_version: str
    log_version: str
    sdk_env: int
    sdk_version: str


class H5CollectorEventExtraInfo(TypedDict, total=False):
    """H5CollectorEventExtraInfo.

    :ivar season:
    :vartype season: str
    """

    season: str


class H5CollectorEventInfo(TypedDict, total=False):
    """H5CollectorEventInfo.

    :ivar eventAction:
    :vartype eventAction: str
    :ivar eventCategory:
    :vartype eventCategory: str
    :ivar eventLabel:
    :vartype eventLabel: str
    :ivar eventValue: Is either a str type or a int type.
    :vartype eventValue: Union[str, int]
    :ivar extra_info:
    :vartype extra_info: "H5CollectorEventExtraInfo"
    :ivar timestamp:
    :vartype timestamp: int
    """

    eventAction: str
    eventCategory: str
    eventLabel: str
    eventValue: Union[str, int]
    """Is either a str type or a int type."""
    extra_info: "H5CollectorEventExtraInfo"
    timestamp: int


class H5CollectorPageExtraInfo(TypedDict, total=False):
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
    :ivar gameBiz:
    :vartype gameBiz: str
    :ivar is_v2_platform:
    :vartype is_v2_platform: str
    :ivar isApp:
    :vartype isApp: str
    :ivar language:
    :vartype language: str
    :ivar lifecycle_id:
    :vartype lifecycle_id: str
    :ivar sdk_version:
    :vartype sdk_version: str
    :ivar syncLoginStatus:
    :vartype syncLoginStatus: bool
    :ivar theme:
    :vartype theme: str
    :ivar tokenType:
    :vartype tokenType: int
    :ivar view_type:
    :vartype view_type: int
    """

    app_id: str
    app_version: str
    business_url: str
    device_fp: str
    device_id: str
    environment: str
    gameBiz: str
    is_v2_platform: str
    isApp: str
    language: str
    lifecycle_id: str
    sdk_version: str
    syncLoginStatus: bool
    theme: str
    tokenType: int
    view_type: int


class H5CollectorPageInfo(TypedDict, total=False):
    """H5CollectorPageInfo.

    :ivar app_id:
    :vartype app_id: str
    :ivar document_referrer:
    :vartype document_referrer: str
    :ivar extra_info:
    :vartype extra_info: "H5CollectorPageExtraInfo"
    :ivar page_fullurl:
    :vartype page_fullurl: str
    :ivar page_name:
    :vartype page_name: str
    :ivar page_url:
    :vartype page_url: str
    """

    app_id: str
    document_referrer: str
    extra_info: "H5CollectorPageExtraInfo"
    page_fullurl: str
    page_name: str
    page_url: str


class H5CollectorUploadRequest(TypedDict, total=False):
    """H5CollectorUploadRequest.

    :ivar analysis_version: Required.
    :vartype analysis_version: str
    :ivar data_belong: Required.
    :vartype data_belong: str
    :ivar event_info: Required.
    :vartype event_info: "H5CollectorEventInfo"
    :ivar mia_session_id: Required.
    :vartype mia_session_id: str
    :ivar mia_session_step: Required.
    :vartype mia_session_step: str
    :ivar page_info: Required.
    :vartype page_info: "H5CollectorPageInfo"
    :ivar type: Required.
    :vartype type: str
    :ivar user_info: Required.
    :vartype user_info: "H5CollectorUserInfo"
    """

    analysis_version: Required[str]
    """Required."""
    data_belong: Required[str]
    """Required."""
    event_info: Required["H5CollectorEventInfo"]
    """Required."""
    mia_session_id: Required[str]
    """Required."""
    mia_session_step: Required[str]
    """Required."""
    page_info: Required["H5CollectorPageInfo"]
    """Required."""
    type: Required[str]
    """Required."""
    user_info: Required["H5CollectorUserInfo"]
    """Required."""


class H5CollectorUserInfo(TypedDict, total=False):
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

    account_id: str
    auth_key: str
    device: str
    device_id: str
    game_biz: str
    game_region: str
    game_uid: str
    lang: str
    platform: str
    uuid: str


class LegacyCrashReport(TypedDict, total=False):
    """LegacyCrashReport.

    :ivar auid:
    :vartype auid: str
    :ivar backBuffer:
    :vartype backBuffer: str
    :ivar buildUrl:
    :vartype buildUrl: str
    :ivar clientIp:
    :vartype clientIp: str
    :ivar cpuInfo:
    :vartype cpuInfo: str
    :ivar deviceModel:
    :vartype deviceModel: str
    :ivar deviceName:
    :vartype deviceName: str
    :ivar errorCategory:
    :vartype errorCategory: str
    :ivar errorCode:
    :vartype errorCode: str
    :ivar errorCodeToPlatform:
    :vartype errorCodeToPlatform: int
    :ivar errorLevel:
    :vartype errorLevel: str
    :ivar exceptionSerialNum:
    :vartype exceptionSerialNum: str
    :ivar frame:
    :vartype frame: str
    :ivar gBuffer:
    :vartype gBuffer: str
    :ivar gpuInfo:
    :vartype gpuInfo: str
    :ivar graphicsLevel:
    :vartype graphicsLevel: str
    :ivar graphicsVersion:
    :vartype graphicsVersion: str
    :ivar guid:
    :vartype guid: str
    :ivar is2g:
    :vartype is2g: bool
    :ivar loginTime:
    :vartype loginTime: int
    :ivar logStr:
    :vartype logStr: str
    :ivar logType:
    :vartype logType: str
    :ivar memoryInfo:
    :vartype memoryInfo: str
    :ivar needShowErrDlg:
    :vartype needShowErrDlg: bool
    :ivar notifyUserName:
    :vartype notifyUserName: str
    :ivar operatingSystem:
    :vartype operatingSystem: str
    :ivar platformType:
    :vartype platformType: int
    :ivar pos:
    :vartype pos: str
    :ivar serverName:
    :vartype serverName: str
    :ivar stackTrace:
    :vartype stackTrace: str
    :ivar subErrorCode:
    :vartype subErrorCode: int
    :ivar time:
    :vartype time: str
    :ivar title:
    :vartype title: str
    :ivar uid:
    :vartype uid: int
    :ivar userName:
    :vartype userName: str
    :ivar version:
    :vartype version: str
    """

    auid: str
    backBuffer: str
    buildUrl: str
    clientIp: str
    cpuInfo: str
    deviceModel: str
    deviceName: str
    errorCategory: str
    errorCode: str
    errorCodeToPlatform: int
    errorLevel: str
    exceptionSerialNum: str
    frame: str
    gBuffer: str
    gpuInfo: str
    graphicsLevel: str
    graphicsVersion: str
    guid: str
    is2g: bool
    loginTime: int
    logStr: str
    logType: str
    memoryInfo: str
    needShowErrDlg: bool
    notifyUserName: str
    operatingSystem: str
    platformType: int
    pos: str
    serverName: str
    stackTrace: str
    subErrorCode: int
    time: str
    title: str
    uid: int
    userName: str
    version: str


class LoginTelemetryDeviceInfo(TypedDict, total=False):
    """LoginTelemetryDeviceInfo.

    :ivar bundleId:
    :vartype bundleId: str
    :ivar clientType:
    :vartype clientType: str
    :ivar cps:
    :vartype cps: str
    :ivar deviceFp:
    :vartype deviceFp: str
    :ivar deviceId:
    :vartype deviceId: str
    :ivar deviceModel:
    :vartype deviceModel: str
    :ivar deviceName:
    :vartype deviceName: str
    :ivar ip:
    :vartype ip: str
    :ivar isp:
    :vartype isp: str
    :ivar platform:
    :vartype platform: str
    :ivar registerCPS:
    :vartype registerCPS: str
    :ivar sciX:
    :vartype sciX: int
    :ivar sciY:
    :vartype sciY: int
    :ivar sourceDeviceId:
    :vartype sourceDeviceId: str
    :ivar systemInfo:
    :vartype systemInfo: str
    """

    bundleId: str
    clientType: str
    cps: str
    deviceFp: str
    deviceId: str
    deviceModel: str
    deviceName: str
    ip: str
    isp: str
    platform: str
    registerCPS: str
    sciX: int
    sciY: int
    sourceDeviceId: str
    systemInfo: str


class LoginTelemetryEvent(TelemetryEvent):
    """LoginTelemetryEvent.

    :ivar applicationId:
    :vartype applicationId: int
    :ivar applicationName:
    :vartype applicationName: str
    :ivar eventId:
    :vartype eventId: int
    :ivar eventName:
    :vartype eventName: str
    :ivar eventTime:
    :vartype eventTime: str
    :ivar msgId:
    :vartype msgId: str
    :ivar uploadContent:
    :vartype uploadContent: "LoginTelemetryUploadContent"
    """

    msgId: str
    uploadContent: "LoginTelemetryUploadContent"


class LoginTelemetryLogInfo(TypedDict, total=False):
    """LoginTelemetryLogInfo.

    :ivar actionId:
    :vartype actionId: int
    :ivar actionName:
    :vartype actionName: str
    :ivar cBody:
    :vartype cBody: str
    :ivar logTime:
    :vartype logTime: str
    """

    actionId: int
    actionName: str
    cBody: str
    logTime: str


class LoginTelemetryUploadContent(TypedDict, total=False):
    """LoginTelemetryUploadContent.

    :ivar deviceinfo:
    :vartype deviceinfo: "LoginTelemetryDeviceInfo"
    :ivar loginfo:
    :vartype loginfo: "LoginTelemetryLogInfo"
    :ivar userinfo:
    :vartype userinfo: "LoginTelemetryUserInfo"
    :ivar versioninfo:
    :vartype versioninfo: "LoginTelemetryVersionInfo"
    """

    deviceinfo: "LoginTelemetryDeviceInfo"
    loginfo: "LoginTelemetryLogInfo"
    userinfo: "LoginTelemetryUserInfo"
    versioninfo: "LoginTelemetryVersionInfo"


class LoginTelemetryUserInfo(TypedDict, total=False):
    """LoginTelemetryUserInfo.

    :ivar accountId:
    :vartype accountId: str
    :ivar accountType:
    :vartype accountType: int
    :ivar channelId:
    :vartype channelId: int
    :ivar mid:
    :vartype mid: str
    :ivar userId:
    :vartype userId: int
    """

    accountId: str
    accountType: int
    channelId: int
    mid: str
    userId: int


class LoginTelemetryVersionInfo(TypedDict, total=False):
    """LoginTelemetryVersionInfo.

    :ivar clientVersion:
    :vartype clientVersion: str
    :ivar logVersion:
    :vartype logVersion: str
    :ivar sdkVersion:
    :vartype sdkVersion: str
    """

    clientVersion: str
    logVersion: str
    sdkVersion: str


class MobileDeviceSessionRequest(TypedDict, total=False):
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

    app_version: Required[str]
    """Required."""
    device_id: Required[str]
    """Required."""
    device_name: Required[str]
    """Required."""
    os_version: Required[str]
    """Required."""
    platform: Required[str]
    """Required."""
    registration_id: Required[str]
    """Required."""


class MobileLoginRequest(TypedDict, total=False):
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

    source_id: Required[str]
    """Required."""
    source_key: Required[str]
    """Required."""
    source_name: Required[str]
    """Required."""
    source_type: Required[int]
    """Required."""


class MobilePreloadConfigRequest(TypedDict, total=False):
    """MobilePreloadConfigRequest.

    :ivar client_version: Required.
    :vartype client_version: str
    :ivar platform: Required.
    :vartype platform: str
    :ivar rn_app: Required.
    :vartype rn_app: str
    :ivar rn_infos: Required.
    :vartype rn_infos: list["MobilePreloadResourceInfo"]
    """

    client_version: Required[str]
    """Required."""
    platform: Required[str]
    """Required."""
    rn_app: Required[str]
    """Required."""
    rn_infos: Required[list["MobilePreloadResourceInfo"]]
    """Required."""


class MobilePreloadResourceInfo(TypedDict, total=False):
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

    module_name: Required[str]
    """Required."""
    resource_url: Required[str]
    """Required."""
    rn_version: Required[str]
    """Required."""
    sha1: Required[str]
    """Required."""


class MobileStartupImageTemplateRequest(TypedDict, total=False):
    """MobileStartupImageTemplateRequest.

    :ivar client_type:
    :vartype client_type: int
    """

    client_type: int


class MobileStartupRequest(TypedDict, total=False):
    """MobileStartupRequest.

    :ivar req_list: Required.
    :vartype req_list: list["MobileStartupRequestItem"]
    """

    req_list: Required[list["MobileStartupRequestItem"]]
    """Required."""


class MobileStartupRequestItem(TypedDict, total=False):
    """MobileStartupRequestItem.

    :ivar api_url: Required.
    :vartype api_url: str
    :ivar req: Required.
    :vartype req: "MobileStartupRequestPayload"
    """

    api_url: Required[str]
    """Required."""
    req: Required["MobileStartupRequestPayload"]
    """Required."""


class MobileStartupRequestPayload(TypedDict, total=False):
    """MobileStartupRequestPayload.

    :ivar fetch_image_template_list_req:
    :vartype fetch_image_template_list_req: "MobileStartupImageTemplateRequest"
    :ivar get_all_game_role_keyword_req:
    :vartype get_all_game_role_keyword_req: dict[str, Any]
    :ivar get_all_static_resource_versions_req:
    :vartype get_all_static_resource_versions_req: dict[str, Any]
    :ivar get_app_config_request:
    :vartype get_app_config_request: dict[str, Any]
    :ivar get_app_media_data_req:
    :vartype get_app_media_data_req: dict[str, Any]
    :ivar get_link_card_whitelist_req:
    :vartype get_link_card_whitelist_req: dict[str, Any]
    :ivar get_teenager_info_req:
    :vartype get_teenager_info_req: dict[str, Any]
    :ivar recent_emoticon_list_req:
    :vartype recent_emoticon_list_req: dict[str, Any]
    """

    fetch_image_template_list_req: "MobileStartupImageTemplateRequest"
    get_all_game_role_keyword_req: dict[str, Any]
    get_all_static_resource_versions_req: dict[str, Any]
    get_app_config_request: dict[str, Any]
    get_app_media_data_req: dict[str, Any]
    get_link_card_whitelist_req: dict[str, Any]
    get_teenager_info_req: dict[str, Any]
    recent_emoticon_list_req: dict[str, Any]


class MobileWindowPrepareRequest(TypedDict, total=False):
    """MobileWindowPrepareRequest.

    :ivar focus_game: Required.
    :vartype focus_game: list[str]
    """

    focus_game: Required[list[str]]
    """Required."""


class MobileWindowShowRequest(MobileWindowPrepareRequest):
    """MobileWindowShowRequest.

    :ivar focus_game: Required.
    :vartype focus_game: list[str]
    :ivar install_status: Required.
    :vartype install_status: dict[str, Any]
    :ivar ticket: Required.
    :vartype ticket: str
    """

    install_status: Required[dict[str, Any]]
    """Required."""
    ticket: Required[str]
    """Required."""


class SdkTelemetryDeviceInfo(TypedDict, total=False):
    """SdkTelemetryDeviceInfo.

    :ivar addressMac:
    :vartype addressMac: str
    :ivar bundleId:
    :vartype bundleId: str
    :ivar cps:
    :vartype cps: str
    :ivar device_fp:
    :vartype device_fp: str
    :ivar device_sciX:
    :vartype device_sciX: int
    :ivar device_sciY:
    :vartype device_sciY: int
    :ivar deviceId:
    :vartype deviceId: str
    :ivar deviceModel:
    :vartype deviceModel: str
    :ivar deviceName:
    :vartype deviceName: str
    :ivar deviceSciX:
    :vartype deviceSciX: int
    :ivar deviceSciY:
    :vartype deviceSciY: int
    :ivar dpi:
    :vartype dpi: int
    :ivar gpuMemSize:
    :vartype gpuMemSize: int
    :ivar gpuName:
    :vartype gpuName: str
    :ivar ip:
    :vartype ip: str
    :ivar isp:
    :vartype isp: str
    :ivar network_type:
    :vartype network_type: str
    :ivar networkType:
    :vartype networkType: str
    :ivar platform: Is either a str type or a int type.
    :vartype platform: Union[str, int]
    :ivar platformName:
    :vartype platformName: str
    :ivar processorCount:
    :vartype processorCount: int
    :ivar processorFrequency:
    :vartype processorFrequency: float
    :ivar processorType:
    :vartype processorType: str
    :ivar ramCapacity: Is either a int type or a float type.
    :vartype ramCapacity: Union[int, float]
    :ivar ramRemain: Is either a int type or a float type.
    :vartype ramRemain: Union[int, float]
    :ivar registerCPS:
    :vartype registerCPS: str
    :ivar romCapacity: Is either a int type or a float type.
    :vartype romCapacity: Union[int, float]
    :ivar romRemain:
    :vartype romRemain: float
    :ivar soft_sciX:
    :vartype soft_sciX: int
    :ivar soft_sciY:
    :vartype soft_sciY: int
    :ivar systemInfo:
    :vartype systemInfo: str
    :ivar systemLang:
    :vartype systemLang: str
    :ivar uapc:
    :vartype uapc: str
    :ivar wmac:
    :vartype wmac: str
    """

    addressMac: str
    bundleId: str
    cps: str
    device_fp: str
    device_sciX: int
    device_sciY: int
    deviceId: str
    deviceModel: str
    deviceName: str
    deviceSciX: int
    deviceSciY: int
    dpi: int
    gpuMemSize: int
    gpuName: str
    ip: str
    isp: str
    network_type: str
    networkType: str
    platform: Union[str, int]
    """Is either a str type or a int type."""
    platformName: str
    processorCount: int
    processorFrequency: float
    processorType: str
    ramCapacity: Union[int, float]
    """Is either a int type or a float type."""
    ramRemain: Union[int, float]
    """Is either a int type or a float type."""
    registerCPS: str
    romCapacity: Union[int, float]
    """Is either a int type or a float type."""
    romRemain: float
    soft_sciX: int
    soft_sciY: int
    systemInfo: str
    systemLang: str
    uapc: str
    wmac: str


class SdkTelemetryInfo(TypedDict, total=False):
    """SdkTelemetryInfo.

    :ivar area:
    :vartype area: str
    :ivar lifecycleId:
    :vartype lifecycleId: str
    :ivar telemetryVersion:
    :vartype telemetryVersion: str
    """

    area: str
    lifecycleId: str
    telemetryVersion: str


class SdkTelemetryLogInfo(TypedDict, total=False):
    """SdkTelemetryLogInfo.

    :ivar actionId:
    :vartype actionId: int
    :ivar actionName:
    :vartype actionName: str
    :ivar cBody:
    :vartype cBody: str
    :ivar logTime:
    :vartype logTime: str
    """

    actionId: int
    actionName: str
    cBody: str
    logTime: str


class SdkTelemetryUploadContent(TypedDict, total=False):
    """SdkTelemetryUploadContent.

    :ivar deviceInfo:
    :vartype deviceInfo: "SdkTelemetryDeviceInfo"
    :ivar eventTimeMs:
    :vartype eventTimeMs: str
    :ivar launchTraceId:
    :vartype launchTraceId: str
    :ivar logInfo:
    :vartype logInfo: "SdkTelemetryLogInfo"
    :ivar telemetryInfo:
    :vartype telemetryInfo: "SdkTelemetryInfo"
    :ivar userInfo:
    :vartype userInfo: "SdkTelemetryUserInfo"
    :ivar versionInfo:
    :vartype versionInfo: "SdkTelemetryVersionInfo"
    """

    deviceInfo: "SdkTelemetryDeviceInfo"
    eventTimeMs: str
    launchTraceId: str
    logInfo: "SdkTelemetryLogInfo"
    telemetryInfo: "SdkTelemetryInfo"
    userInfo: "SdkTelemetryUserInfo"
    versionInfo: "SdkTelemetryVersionInfo"


class SdkTelemetryUploadEvent(TelemetryEvent):
    """SdkTelemetryUploadEvent.

    :ivar applicationId:
    :vartype applicationId: int
    :ivar applicationName:
    :vartype applicationName: str
    :ivar eventId:
    :vartype eventId: int
    :ivar eventName:
    :vartype eventName: str
    :ivar eventTime:
    :vartype eventTime: str
    :ivar msgId:
    :vartype msgId: str
    :ivar uploadContent:
    :vartype uploadContent: "SdkTelemetryUploadContent"
    """

    msgId: str
    uploadContent: "SdkTelemetryUploadContent"


class SdkTelemetryUserInfo(TypedDict, total=False):
    """SdkTelemetryUserInfo.

    :ivar accountId:
    :vartype accountId: str
    :ivar accountType:
    :vartype accountType: str
    :ivar channelId:
    :vartype channelId: str
    :ivar userId:
    :vartype userId: str
    """

    accountId: str
    accountType: str
    channelId: str
    userId: str


class SdkTelemetryVersionInfo(TypedDict, total=False):
    """SdkTelemetryVersionInfo.

    :ivar clientVersion:
    :vartype clientVersion: str
    :ivar logVersion:
    :vartype logVersion: str
    """

    clientVersion: str
    logVersion: str


class ZenlessFeedbackCollectionRequest(TypedDict, total=False):
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

    region: Required[str]
    """Required."""
    schedule_id: Required[str]
    """Required."""
    score: Required[int]
    """Required."""
    source: Required[int]
    """Required."""
    tool_type: Required[int]
    """Required."""
    uid: Required[str]
    """Required."""
