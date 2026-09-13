// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../static-helpers/serialization/serialize-record.js";
import { JsonObject, jsonObjectDeserializer } from "../models.js";

/** model interface AuthTicketRequest */
export interface AuthTicketRequest extends DeviceContext {
  gameBiz: string;
}

export function authTicketRequestSerializer(item: AuthTicketRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    device: item["device"],
    device_fp: item["deviceFp"],
    device_name: item["deviceName"],
    device_model: item["deviceModel"],
    device_id: item["deviceId"],
    app_id: item["appId"],
    game_biz: item["gameBiz"],
  };
}

/** model interface DeviceContext */
export interface DeviceContext {
  device: string;
  deviceFp?: string;
  deviceName?: string;
  deviceModel?: string;
  deviceId?: string;
  appId?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function deviceContextSerializer(item: DeviceContext): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    device: item["device"],
    device_fp: item["deviceFp"],
    device_name: item["deviceName"],
    device_model: item["deviceModel"],
    device_id: item["deviceId"],
    app_id: item["appId"],
  };
}

/** model interface TokenInfo */
export interface TokenInfo {
  accountId?: number;
  uid?: string;
  token?: string;
  gameToken?: string;
  stoken?: string;
  ltoken?: string;
  cookieToken?: string;
  mid?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function tokenInfoDeserializer(item: any): TokenInfo {
  return {
    additionalProperties: serializeRecord(item, [
      "account_id",
      "uid",
      "token",
      "game_token",
      "stoken",
      "ltoken",
      "cookie_token",
      "mid",
    ]),
    accountId: item["account_id"],
    uid: item["uid"],
    token: item["token"],
    gameToken: item["game_token"],
    stoken: item["stoken"],
    ltoken: item["ltoken"],
    cookieToken: item["cookie_token"],
    mid: item["mid"],
  };
}

/** model interface LoginCaptchaRequest */
export interface LoginCaptchaRequest {
  areaCode: string;
  mobile: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function loginCaptchaRequestSerializer(item: LoginCaptchaRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    area_code: item["areaCode"],
    mobile: item["mobile"],
  };
}

/** model interface QrLoginCreateRequest */
export interface QrLoginCreateRequest extends DeviceContext {
  appId: string;
}

export function qrLoginCreateRequestSerializer(item: QrLoginCreateRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    device: item["device"],
    device_fp: item["deviceFp"],
    device_name: item["deviceName"],
    device_model: item["deviceModel"],
    device_id: item["deviceId"],
    app_id: item["appId"],
  };
}

/** model interface QrLoginTicket */
export interface QrLoginTicket {
  ticket: string;
  url?: string;
  expiresIn?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function qrLoginTicketDeserializer(item: any): QrLoginTicket {
  return {
    additionalProperties: serializeRecord(item, ["ticket", "url", "expires_in"]),
    ticket: item["ticket"],
    url: item["url"],
    expiresIn: item["expires_in"],
  };
}

/** model interface QrLoginStatusRequest */
export interface QrLoginStatusRequest extends DeviceContext {
  ticket: string;
  appId: string;
}

export function qrLoginStatusRequestSerializer(item: QrLoginStatusRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    device: item["device"],
    device_fp: item["deviceFp"],
    device_name: item["deviceName"],
    device_model: item["deviceModel"],
    device_id: item["deviceId"],
    app_id: item["appId"],
    ticket: item["ticket"],
  };
}

/** model interface QrLoginStatus */
export interface QrLoginStatus {
  stat?: string;
  status?: string;
  payload?: JsonObject;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function qrLoginStatusDeserializer(item: any): QrLoginStatus {
  return {
    additionalProperties: serializeRecord(item, ["stat", "status", "payload"]),
    stat: item["stat"],
    status: item["status"],
    payload: !item["payload"] ? item["payload"] : jsonObjectDeserializer(item["payload"]),
  };
}

/** model interface MobileCaptchaLoginRequest */
export interface MobileCaptchaLoginRequest {
  actionType: string;
  areaCode: string;
  captcha: string;
  mobile: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileCaptchaLoginRequestSerializer(item: MobileCaptchaLoginRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    action_type: item["actionType"],
    area_code: item["areaCode"],
    captcha: item["captcha"],
    mobile: item["mobile"],
  };
}

/** model interface AuthTicketLoginRequest */
export interface AuthTicketLoginRequest {
  ticket: string;
}

export function authTicketLoginRequestSerializer(item: AuthTicketLoginRequest): any {
  return { ticket: item["ticket"] };
}

/** model interface AuthTicketLoginData */
export interface AuthTicketLoginData {
  loginTicket?: string;
  needRealperson?: boolean;
  oauthHwOpenId?: string;
  reactivateInfo?: ReactivateInfo;
  realnameInfo?: RealnameInfo;
  token?: LoginToken;
  userInfo?: LoginUserInfo;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function authTicketLoginDataDeserializer(item: any): AuthTicketLoginData {
  return {
    additionalProperties: serializeRecord(item, [
      "login_ticket",
      "need_realperson",
      "oauth_hw_open_id",
      "reactivate_info",
      "realname_info",
      "token",
      "user_info",
    ]),
    loginTicket: item["login_ticket"],
    needRealperson: item["need_realperson"],
    oauthHwOpenId: item["oauth_hw_open_id"],
    reactivateInfo: !item["reactivate_info"]
      ? item["reactivate_info"]
      : reactivateInfoDeserializer(item["reactivate_info"]),
    realnameInfo: !item["realname_info"]
      ? item["realname_info"]
      : realnameInfoDeserializer(item["realname_info"]),
    token: !item["token"] ? item["token"] : loginTokenDeserializer(item["token"]),
    userInfo: !item["user_info"] ? item["user_info"] : loginUserInfoDeserializer(item["user_info"]),
  };
}

/** model interface ReactivateInfo */
export interface ReactivateInfo {
  deleteAfterDays?: string;
  deletingBizAccount?: boolean;
  reactivateBiz?: string;
  required?: boolean;
  ticket?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function reactivateInfoDeserializer(item: any): ReactivateInfo {
  return {
    additionalProperties: serializeRecord(item, [
      "delete_after_days",
      "deleting_biz_account",
      "reactivate_biz",
      "required",
      "ticket",
    ]),
    deleteAfterDays: item["delete_after_days"],
    deletingBizAccount: item["deleting_biz_account"],
    reactivateBiz: item["reactivate_biz"],
    required: item["required"],
    ticket: item["ticket"],
  };
}

/** model interface RealnameInfo */
export interface RealnameInfo {
  actionTicket?: string;
  actionType?: string;
  required?: boolean;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function realnameInfoDeserializer(item: any): RealnameInfo {
  return {
    additionalProperties: serializeRecord(item, ["action_ticket", "action_type", "required"]),
    actionTicket: item["action_ticket"],
    actionType: item["action_type"],
    required: item["required"],
  };
}

/** model interface LoginToken */
export interface LoginToken {
  token?: string;
  tokenType?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function loginTokenSerializer(item: LoginToken): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    token: item["token"],
    token_type: item["tokenType"],
  };
}

export function loginTokenDeserializer(item: any): LoginToken {
  return {
    additionalProperties: serializeRecord(item, ["token", "token_type"]),
    token: item["token"],
    tokenType: item["token_type"],
  };
}

/** model interface LoginUserInfo */
export interface LoginUserInfo {
  accountName?: string;
  aid?: string;
  areaCode?: string;
  country?: string;
  email?: string;
  identityCode?: string;
  isAdult?: number;
  isEmailVerify?: number;
  links?: any[];
  mid?: string;
  mobile?: string;
  passwordTime?: string;
  realname?: string;
  rebindAreaCode?: string;
  rebindMobile?: string;
  rebindMobileTime?: string;
  safeAreaCode?: string;
  safeMobile?: string;
  unmaskedEmail?: string;
  unmaskedEmailType?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function loginUserInfoDeserializer(item: any): LoginUserInfo {
  return {
    additionalProperties: serializeRecord(item, [
      "account_name",
      "aid",
      "area_code",
      "country",
      "email",
      "identity_code",
      "is_adult",
      "is_email_verify",
      "links",
      "mid",
      "mobile",
      "password_time",
      "realname",
      "rebind_area_code",
      "rebind_mobile",
      "rebind_mobile_time",
      "safe_area_code",
      "safe_mobile",
      "unmasked_email",
      "unmasked_email_type",
    ]),
    accountName: item["account_name"],
    aid: item["aid"],
    areaCode: item["area_code"],
    country: item["country"],
    email: item["email"],
    identityCode: item["identity_code"],
    isAdult: item["is_adult"],
    isEmailVerify: item["is_email_verify"],
    links: !item["links"]
      ? item["links"]
      : item["links"].map((p: any) => {
          return p;
        }),
    mid: item["mid"],
    mobile: item["mobile"],
    passwordTime: item["password_time"],
    realname: item["realname"],
    rebindAreaCode: item["rebind_area_code"],
    rebindMobile: item["rebind_mobile"],
    rebindMobileTime: item["rebind_mobile_time"],
    safeAreaCode: item["safe_area_code"],
    safeMobile: item["safe_mobile"],
    unmaskedEmail: item["unmasked_email"],
    unmaskedEmailType: item["unmasked_email_type"],
  };
}

/** model interface GameTokenRequest */
export interface GameTokenRequest {
  accountId: number;
  gameToken: string;
}

export function gameTokenRequestSerializer(item: GameTokenRequest): any {
  return { account_id: item["accountId"], game_token: item["gameToken"] };
}

/** model interface TokenExchangeRequest */
export interface TokenExchangeRequest {
  dstTokenType: number;
  mid: string;
  srcToken: LoginToken;
}

export function tokenExchangeRequestSerializer(item: TokenExchangeRequest): any {
  return {
    dst_token_type: item["dstTokenType"],
    mid: item["mid"],
    src_token: loginTokenSerializer(item["srcToken"]),
  };
}
