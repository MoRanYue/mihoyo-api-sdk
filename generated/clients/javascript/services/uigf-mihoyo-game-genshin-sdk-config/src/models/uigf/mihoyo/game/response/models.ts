// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** Genshin SDK bootstrap configuration payloads. Dynamic settings remain maps. */
export interface SdkComboConfigData {
  vals?: Record<string, string>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkComboConfigDataDeserializer(item: any): SdkComboConfigData {
  return {
    additionalProperties: serializeRecord(item, ["vals"]),
    vals: !item["vals"]
      ? item["vals"]
      : Object.fromEntries(Object.entries(item["vals"]).map(([k, p]: [string, any]) => [k, p])),
  };
}

/** model interface SdkPrecacheConfigData */
export interface SdkPrecacheConfigData {
  vals?: Record<string, string>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkPrecacheConfigDataDeserializer(item: any): SdkPrecacheConfigData {
  return {
    additionalProperties: serializeRecord(item, ["vals"]),
    vals: !item["vals"]
      ? item["vals"]
      : Object.fromEntries(Object.entries(item["vals"]).map(([k, p]: [string, any]) => [k, p])),
  };
}

/** model interface SdkGranterConfigData */
export interface SdkGranterConfigData {
  announceUrl?: string;
  appName?: string;
  disableYsdkGuard?: boolean;
  enableAnnouncePicPopup?: boolean;
  enableUserCenter?: boolean;
  functionalSwitchConfigs?: Record<string, any>;
  logLevel?: string;
  protocol?: boolean;
  pushAliasType?: number;
  qrAppIcons?: SdkGranterQrAppIcons;
  qrCloudDisplayName?: string;
  qrEnabled?: boolean;
  qrEnabledApps?: SdkGranterQrEnabledApps;
  ugcProtocol?: boolean;
  widgetConfig?: any;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkGranterConfigDataDeserializer(item: any): SdkGranterConfigData {
  return {
    additionalProperties: serializeRecord(item, [
      "announce_url",
      "app_name",
      "disable_ysdk_guard",
      "enable_announce_pic_popup",
      "enable_user_center",
      "functional_switch_configs",
      "log_level",
      "protocol",
      "push_alias_type",
      "qr_app_icons",
      "qr_cloud_display_name",
      "qr_enabled",
      "qr_enabled_apps",
      "ugc_protocol",
      "widget_config",
    ]),
    announceUrl: item["announce_url"],
    appName: item["app_name"],
    disableYsdkGuard: item["disable_ysdk_guard"],
    enableAnnouncePicPopup: item["enable_announce_pic_popup"],
    enableUserCenter: item["enable_user_center"],
    functionalSwitchConfigs: !item["functional_switch_configs"]
      ? item["functional_switch_configs"]
      : Object.fromEntries(
          Object.entries(item["functional_switch_configs"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    logLevel: item["log_level"],
    protocol: item["protocol"],
    pushAliasType: item["push_alias_type"],
    qrAppIcons: !item["qr_app_icons"]
      ? item["qr_app_icons"]
      : sdkGranterQrAppIconsDeserializer(item["qr_app_icons"]),
    qrCloudDisplayName: item["qr_cloud_display_name"],
    qrEnabled: item["qr_enabled"],
    qrEnabledApps: !item["qr_enabled_apps"]
      ? item["qr_enabled_apps"]
      : sdkGranterQrEnabledAppsDeserializer(item["qr_enabled_apps"]),
    ugcProtocol: item["ugc_protocol"],
    widgetConfig: item["widget_config"],
  };
}

/** model interface SdkGranterQrAppIcons */
export interface SdkGranterQrAppIcons {
  app?: string;
  bbs?: string;
  cloud?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkGranterQrAppIconsDeserializer(item: any): SdkGranterQrAppIcons {
  return {
    additionalProperties: serializeRecord(item, ["app", "bbs", "cloud"]),
    app: item["app"],
    bbs: item["bbs"],
    cloud: item["cloud"],
  };
}

/** model interface SdkGranterQrEnabledApps */
export interface SdkGranterQrEnabledApps {
  bbs?: boolean;
  cloud?: boolean;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkGranterQrEnabledAppsDeserializer(item: any): SdkGranterQrEnabledApps {
  return {
    additionalProperties: serializeRecord(item, ["bbs", "cloud"]),
    bbs: item["bbs"],
    cloud: item["cloud"],
  };
}

/** model interface SdkShieldConfigData */
export interface SdkShieldConfigData {
  bbsAuthLogin?: boolean;
  bbsAuthLoginIgnore?: any[];
  client?: string;
  disableMmt?: boolean;
  disableRegist?: boolean;
  enableAgeGate?: boolean;
  enableAgeGateIgnore?: any[];
  enableBrAgeGate?: boolean;
  enableBrAgeGateIgnore?: any[];
  enableCxBindAccount?: boolean;
  enableDouyinFlashLogin?: boolean;
  enableEmailCaptcha?: boolean;
  enableEuAgeGate?: boolean;
  enableEuAgeGateIgnore?: any[];
  enableFlashLogin?: boolean;
  enableLogo18?: boolean;
  enablePsBindAccount?: boolean;
  fetchInstanceId?: boolean;
  firebaseBlacklistDevicesSwitch?: boolean;
  firebaseBlacklistDevicesVersion?: number;
  gameKey?: string;
  guest?: boolean;
  hoyolabAuthLogin?: boolean;
  hoyolabAuthLoginIgnore?: any[];
  hoyoplayAuthLogin?: boolean;
  id?: number;
  identity?: string;
  ignoreVersions?: string;
  initializeFirebase?: boolean;
  logoHeight?: string;
  logoWidth?: string;
  name?: string;
  scene?: string;
  serverGuest?: boolean;
  thirdparty?: string[];
  thirdpartyIgnore?: Record<string, any>;
  thirdpartyLoginConfigs?: Record<string, any>;
  vnWebviewRealnameEnabled?: boolean;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkShieldConfigDataDeserializer(item: any): SdkShieldConfigData {
  return {
    additionalProperties: serializeRecord(item, [
      "bbs_auth_login",
      "bbs_auth_login_ignore",
      "client",
      "disable_mmt",
      "disable_regist",
      "enable_age_gate",
      "enable_age_gate_ignore",
      "enable_br_age_gate",
      "enable_br_age_gate_ignore",
      "enable_cx_bind_account",
      "enable_douyin_flash_login",
      "enable_email_captcha",
      "enable_eu_age_gate",
      "enable_eu_age_gate_ignore",
      "enable_flash_login",
      "enable_logo_18",
      "enable_ps_bind_account",
      "fetch_instance_id",
      "firebase_blacklist_devices_switch",
      "firebase_blacklist_devices_version",
      "game_key",
      "guest",
      "hoyolab_auth_login",
      "hoyolab_auth_login_ignore",
      "hoyoplay_auth_login",
      "id",
      "identity",
      "ignore_versions",
      "initialize_firebase",
      "logo_height",
      "logo_width",
      "name",
      "scene",
      "server_guest",
      "thirdparty",
      "thirdparty_ignore",
      "thirdparty_login_configs",
      "vn_webview_realname_enabled",
    ]),
    bbsAuthLogin: item["bbs_auth_login"],
    bbsAuthLoginIgnore: !item["bbs_auth_login_ignore"]
      ? item["bbs_auth_login_ignore"]
      : item["bbs_auth_login_ignore"].map((p: any) => {
          return p;
        }),
    client: item["client"],
    disableMmt: item["disable_mmt"],
    disableRegist: item["disable_regist"],
    enableAgeGate: item["enable_age_gate"],
    enableAgeGateIgnore: !item["enable_age_gate_ignore"]
      ? item["enable_age_gate_ignore"]
      : item["enable_age_gate_ignore"].map((p: any) => {
          return p;
        }),
    enableBrAgeGate: item["enable_br_age_gate"],
    enableBrAgeGateIgnore: !item["enable_br_age_gate_ignore"]
      ? item["enable_br_age_gate_ignore"]
      : item["enable_br_age_gate_ignore"].map((p: any) => {
          return p;
        }),
    enableCxBindAccount: item["enable_cx_bind_account"],
    enableDouyinFlashLogin: item["enable_douyin_flash_login"],
    enableEmailCaptcha: item["enable_email_captcha"],
    enableEuAgeGate: item["enable_eu_age_gate"],
    enableEuAgeGateIgnore: !item["enable_eu_age_gate_ignore"]
      ? item["enable_eu_age_gate_ignore"]
      : item["enable_eu_age_gate_ignore"].map((p: any) => {
          return p;
        }),
    enableFlashLogin: item["enable_flash_login"],
    enableLogo18: item["enable_logo_18"],
    enablePsBindAccount: item["enable_ps_bind_account"],
    fetchInstanceId: item["fetch_instance_id"],
    firebaseBlacklistDevicesSwitch: item["firebase_blacklist_devices_switch"],
    firebaseBlacklistDevicesVersion: item["firebase_blacklist_devices_version"],
    gameKey: item["game_key"],
    guest: item["guest"],
    hoyolabAuthLogin: item["hoyolab_auth_login"],
    hoyolabAuthLoginIgnore: !item["hoyolab_auth_login_ignore"]
      ? item["hoyolab_auth_login_ignore"]
      : item["hoyolab_auth_login_ignore"].map((p: any) => {
          return p;
        }),
    hoyoplayAuthLogin: item["hoyoplay_auth_login"],
    id: item["id"],
    identity: item["identity"],
    ignoreVersions: item["ignore_versions"],
    initializeFirebase: item["initialize_firebase"],
    logoHeight: item["logo_height"],
    logoWidth: item["logo_width"],
    name: item["name"],
    scene: item["scene"],
    serverGuest: item["server_guest"],
    thirdparty: !item["thirdparty"]
      ? item["thirdparty"]
      : item["thirdparty"].map((p: any) => {
          return p;
        }),
    thirdpartyIgnore: !item["thirdparty_ignore"]
      ? item["thirdparty_ignore"]
      : Object.fromEntries(
          Object.entries(item["thirdparty_ignore"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    thirdpartyLoginConfigs: !item["thirdparty_login_configs"]
      ? item["thirdparty_login_configs"]
      : Object.fromEntries(
          Object.entries(item["thirdparty_login_configs"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    vnWebviewRealnameEnabled: item["vn_webview_realname_enabled"],
  };
}
