// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../static-helpers/serialization/serialize-record.js";
import { LoginCaptchaData, loginCaptchaDataDeserializer } from "./api/response/models.js";
import {
  TokenInfo,
  tokenInfoDeserializer,
  QrLoginTicket,
  qrLoginTicketDeserializer,
  QrLoginStatus,
  qrLoginStatusDeserializer,
  AuthTicketLoginData,
  authTicketLoginDataDeserializer,
} from "./passport/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseTokenInfo {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: TokenInfo;
}

export function apiResponseTokenInfoDeserializer(item: any): ApiResponseTokenInfo {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: tokenInfoDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseLoginCaptchaData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: LoginCaptchaData;
}

export function apiResponseLoginCaptchaDataDeserializer(item: any): ApiResponseLoginCaptchaData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: loginCaptchaDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseQrLoginTicket {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: QrLoginTicket;
}

export function apiResponseQrLoginTicketDeserializer(item: any): ApiResponseQrLoginTicket {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: qrLoginTicketDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseQrLoginStatus {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: QrLoginStatus;
}

export function apiResponseQrLoginStatusDeserializer(item: any): ApiResponseQrLoginStatus {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: qrLoginStatusDeserializer(item["data"]),
  };
}

/** A JSON object whose vendor-defined properties are preserved by generated clients. */
export interface JsonObject {
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function jsonObjectDeserializer(item: any): JsonObject {
  return {
    additionalProperties: serializeRecord(item, []),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseAuthTicketLoginData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: AuthTicketLoginData;
}

export function apiResponseAuthTicketLoginDataDeserializer(
  item: any,
): ApiResponseAuthTicketLoginData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: authTicketLoginDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponse {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: any;
}

export function apiResponseDeserializer(item: any): ApiResponse {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: item["data"],
  };
}
