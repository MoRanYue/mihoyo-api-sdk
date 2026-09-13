/**
 * API request payloads. Event and analytics fields are optional because they
 * vary by event.
 */
namespace UIGF.Mihoyo.Api.Request;

model ZenlessFeedbackCollectionRequest extends Record<unknown> {
  region: string;
  schedule_id: string;
  score: int32;
  source: int32;
  tool_type: int32;
  uid: string;
}

model MobileDeviceSessionRequest extends Record<unknown> {
  app_version: string;
  device_id: string;
  device_name: string;
  os_version: string;
  platform: string;
  registration_id: string;
}

model MobileStartupImageTemplateRequest extends Record<unknown> {
  client_type?: int32;
}

model MobileStartupRequestPayload extends Record<unknown> {
  fetch_image_template_list_req?: MobileStartupImageTemplateRequest;
  get_all_game_role_keyword_req?: Record<unknown>;
  get_all_static_resource_versions_req?: Record<unknown>;
  get_app_config_request?: Record<unknown>;
  get_app_media_data_req?: Record<unknown>;
  get_link_card_whitelist_req?: Record<unknown>;
  get_teenager_info_req?: Record<unknown>;
  recent_emoticon_list_req?: Record<unknown>;
}

model MobileStartupRequestItem extends Record<unknown> {
  api_url: string;
  req: MobileStartupRequestPayload;
}

model MobileStartupRequest extends Record<unknown> {
  req_list: MobileStartupRequestItem[];
}

model MobileWindowPrepareRequest extends Record<unknown> {
  focus_game: string[];
}

model MobileWindowShowRequest extends MobileWindowPrepareRequest {
  install_status: Record<unknown>;
  ticket: string;
}

model MobileLoginRequest extends Record<unknown> {
  source_id: string;
  source_key: string;
  source_name: string;
  source_type: int32;
}

model MobilePreloadResourceInfo extends Record<unknown> {
  module_name: string;
  resource_url: string;
  rn_version: string;
  sha1: string;
}

model MobilePreloadConfigRequest extends Record<unknown> {
  client_version: string;
  platform: string;
  rn_app: string;
  rn_infos: MobilePreloadResourceInfo[];
}

model H5CollectorEventExtraInfo extends Record<unknown> {
  season?: string;
}

model H5CollectorEventInfo extends Record<unknown> {
  eventAction?: string;
  eventCategory?: string;
  eventLabel?: string;
  eventValue?: string | int32;
  extra_info?: H5CollectorEventExtraInfo;
  timestamp?: int64;
}

model H5CollectorPageExtraInfo extends Record<unknown> {
  app_id?: string;
  app_version?: string;
  business_url?: string;
  device_fp?: string;
  device_id?: string;
  environment?: string;
  gameBiz?: string;
  is_v2_platform?: string;
  isApp?: string;
  language?: string;
  lifecycle_id?: string;
  sdk_version?: string;
  syncLoginStatus?: boolean;
  theme?: string;
  tokenType?: int32;
  view_type?: int32;
}

model H5CollectorPageInfo extends Record<unknown> {
  app_id?: string;
  document_referrer?: string;
  extra_info?: H5CollectorPageExtraInfo;
  page_fullurl?: string;
  page_name?: string;
  page_url?: string;
}

model H5CollectorUserInfo extends Record<unknown> {
  account_id?: string;
  auth_key?: string;
  device?: string;
  device_id?: string;
  game_biz?: string;
  game_region?: string;
  game_uid?: string;
  lang?: string;
  platform?: string;
  uuid?: string;
}

model H5CollectorUploadRequest extends Record<unknown> {
  analysis_version: string;
  data_belong: string;
  event_info: H5CollectorEventInfo;
  mia_session_id: string;
  mia_session_step: string;
  page_info: H5CollectorPageInfo;
  type: string;
  user_info: H5CollectorUserInfo;
}

model LegacyCrashReport extends Record<unknown> {
  auid?: string;
  backBuffer?: string;
  buildUrl?: string;
  clientIp?: string;
  cpuInfo?: string;
  deviceModel?: string;
  deviceName?: string;
  errorCategory?: string;
  errorCode?: string;
  errorCodeToPlatform?: int32;
  errorLevel?: string;
  exceptionSerialNum?: string;
  frame?: string;
  gBuffer?: string;
  gpuInfo?: string;
  graphicsLevel?: string;
  graphicsVersion?: string;
  guid?: string;
  is2g?: boolean;
  loginTime?: int64;
  logStr?: string;
  logType?: string;
  memoryInfo?: string;
  needShowErrDlg?: boolean;
  notifyUserName?: string;
  operatingSystem?: string;
  platformType?: int32;
  pos?: string;
  serverName?: string;
  stackTrace?: string;
  subErrorCode?: int32;
  time?: string;
  title?: string;
  uid?: int64;
  userName?: string;
  version?: string;
}

model TelemetryEvent extends Record<unknown> {
  applicationId?: int32;
  applicationName?: string;
  eventId?: int32;
  eventName?: string;
  eventTime?: string;
}

model SdkTelemetryDeviceInfo extends Record<unknown> {
  addressMac?: string;
  bundleId?: string;
  cps?: string;
  device_fp?: string;
  @encodedName("application/json", "device_sciX")
  snake_device_sci_x?: int32;
  @encodedName("application/json", "device_sciY")
  snake_device_sci_y?: int32;
  deviceId?: string;
  deviceModel?: string;
  deviceName?: string;
  deviceSciX?: int32;
  deviceSciY?: int32;
  dpi?: int32;
  gpuMemSize?: int32;
  gpuName?: string;
  ip?: string;
  isp?: string;
  @encodedName("application/json", "network_type")
  snake_network_type?: string;
  networkType?: string;
  platform?: string | int32;
  platformName?: string;
  processorCount?: int32;
  processorFrequency?: float64;
  processorType?: string;
  ramCapacity?: int64 | float64;
  ramRemain?: int64 | float64;
  registerCPS?: string;
  romCapacity?: int64 | float64;
  romRemain?: float64;
  soft_sciX?: int32;
  soft_sciY?: int32;
  systemInfo?: string;
  systemLang?: string;
  uapc?: string;
  wmac?: string;
}

model SdkTelemetryLogInfo extends Record<unknown> {
  actionId?: int32;
  actionName?: string;
  cBody?: string;
  logTime?: string;
}

model SdkTelemetryInfo extends Record<unknown> {
  area?: string;
  lifecycleId?: string;
  telemetryVersion?: string;
}

model SdkTelemetryUserInfo extends Record<unknown> {
  accountId?: string;
  accountType?: string;
  channelId?: string;
  userId?: string;
}

model SdkTelemetryVersionInfo extends Record<unknown> {
  clientVersion?: string;
  logVersion?: string;
}

model SdkTelemetryUploadContent extends Record<unknown> {
  deviceInfo?: SdkTelemetryDeviceInfo;
  eventTimeMs?: string;
  launchTraceId?: string;
  logInfo?: SdkTelemetryLogInfo;
  telemetryInfo?: SdkTelemetryInfo;
  userInfo?: SdkTelemetryUserInfo;
  versionInfo?: SdkTelemetryVersionInfo;
}

model SdkTelemetryUploadEvent extends TelemetryEvent {
  msgId?: string;
  uploadContent?: SdkTelemetryUploadContent;
}

model GameCrashTelemetryUploadContent extends Record<unknown> {
  auid?: string;
  clientIp?: string;
  cpuInfo?: string;
  deviceModel?: string;
  deviceName?: string;
  @encodedName("application/json", "error_code")
  error_code_numeric?: int32;
  errorCategory?: string;
  errorCode?: string;
  errorLevel?: string;
  exceptionSerialNum?: int64;
  frame?: string;
  gpuInfo?: string;
  graphicsLevel?: string;
  graphicsVersion?: string;
  guid?: string;
  isRelease?: boolean;
  logType?: string;
  memoryInfo?: string;
  message?: string;
  notifyUser?: string;
  operatingSystem?: string;
  projectNick?: string;
  serverName?: string;
  stackTrace?: string;
  subErrorCode?: string;
  time?: int64;
  user_id?: int64;
  userName?: string;
  userNick?: string;
  version?: string;
}

model GameCrashTelemetryEvent extends TelemetryEvent {
  msgID?: string;
  uploadContent?: GameCrashTelemetryUploadContent;
}

model GameSdkSnakeDeviceInfo extends Record<unknown> {
  bundle_id?: string;
  channel_id?: string;
  channel_subid?: string;
  channel_subid_int?: int32;
  current_cps?: string;
  device_fp?: string;
  device_id?: string;
  device_model?: string;
  device_name?: string;
  ip?: string;
  network_type?: string;
  os?: string;
  plat?: int32;
  register_cps?: string;
  uapc?: string;
}

model GameSdkCamelDeviceInfo extends Record<unknown> {
  deviceId?: string;
  deviceModel?: string;
  deviceName?: string;
  deviceSciX?: int32;
  deviceSciY?: int32;
  dpi?: int32;
  networkType?: string;
  platform?: int32;
  platformName?: string;
  processorCount?: int32;
  processorType?: string;
  ramCapacity?: int64;
  ramRemain?: int64;
  systemInfo?: string;
  systemLang?: string;
}

model GameSdkLogInfo extends Record<unknown> {
  action_id?: int32;
  action_name?: string;
  c_body?: string;
  log_time?: string;
  platform_type?: string;
  region?: string;
}

model GameSdkUserInfo extends Record<unknown> {
  account_type?: string;
  level?: string;
  open_id?: string;
  tag?: string;
  uid?: string;
}

model GameSdkVersionInfo extends Record<unknown> {
  client_version?: string;
  log_version?: string;
  sdk_env?: int32;
  sdk_version?: string;
}

model GameSdkTelemetryUploadContent extends Record<unknown> {
  @encodedName("application/json", "device_info")
  snake_device_info?: GameSdkSnakeDeviceInfo;
  @encodedName("application/json", "deviceInfo")
  camel_device_info?: GameSdkCamelDeviceInfo;
  eventTimeMs?: string;
  launchTraceId?: string;
  log_info?: GameSdkLogInfo;
  telemetryInfo?: SdkTelemetryInfo;
  user_info?: GameSdkUserInfo;
  version_info?: GameSdkVersionInfo;
}

model GameSdkTelemetryEvent extends TelemetryEvent {
  msgId?: string;
  uploadContent?: GameSdkTelemetryUploadContent;
}

model GameCustomTelemetryUploadContent extends Record<unknown> {
  auid?: string;
  clientIp?: string;
  cpuInfo?: string;
  deviceId?: string;
  deviceModel?: string;
  deviceName?: string;
  gpuInfo?: string;
  isRelease?: boolean;
  memoryInfo?: string;
  msg?: string;
  msgKey?: string;
  operatingSystem?: string;
  platform?: int32;
  serverName?: string;
  user_id?: int64;
  version?: string;
}

model GameCustomTelemetryEvent extends TelemetryEvent {
  msgID?: string;
  uploadContent?: GameCustomTelemetryUploadContent;
}

model LoginTelemetryDeviceInfo extends Record<unknown> {
  bundleId?: string;
  clientType?: string;
  cps?: string;
  deviceFp?: string;
  deviceId?: string;
  deviceModel?: string;
  deviceName?: string;
  ip?: string;
  isp?: string;
  platform?: string;
  registerCPS?: string;
  sciX?: int32;
  sciY?: int32;
  sourceDeviceId?: string;
  systemInfo?: string;
}

model LoginTelemetryLogInfo extends Record<unknown> {
  actionId?: int32;
  actionName?: string;
  cBody?: string;
  logTime?: string;
}

model LoginTelemetryUserInfo extends Record<unknown> {
  accountId?: string;
  accountType?: int32;
  channelId?: int32;
  mid?: string;
  userId?: int64;
}

model LoginTelemetryVersionInfo extends Record<unknown> {
  clientVersion?: string;
  logVersion?: string;
  sdkVersion?: string;
}

model LoginTelemetryUploadContent extends Record<unknown> {
  deviceinfo?: LoginTelemetryDeviceInfo;
  loginfo?: LoginTelemetryLogInfo;
  userinfo?: LoginTelemetryUserInfo;
  versioninfo?: LoginTelemetryVersionInfo;
}

model LoginTelemetryEvent extends TelemetryEvent {
  msgId?: string;
  uploadContent?: LoginTelemetryUploadContent;
}

model CommunityTelemetryUploadRequest extends Record<unknown> {
  content: string;
  sign: string;
}
