// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import {
  SdkComboConfigData,
  sdkComboConfigDataDeserializer,
  SdkPrecacheConfigData,
  sdkPrecacheConfigDataDeserializer,
  SdkGranterConfigData,
  sdkGranterConfigDataDeserializer,
  SdkShieldConfigData,
  sdkShieldConfigDataDeserializer,
} from "./game/response/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseSdkComboConfigData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: SdkComboConfigData;
}

export function apiResponseSdkComboConfigDataDeserializer(
  item: any,
): ApiResponseSdkComboConfigData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: sdkComboConfigDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseSdkPrecacheConfigData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: SdkPrecacheConfigData;
}

export function apiResponseSdkPrecacheConfigDataDeserializer(
  item: any,
): ApiResponseSdkPrecacheConfigData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: sdkPrecacheConfigDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseSdkGranterConfigData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: SdkGranterConfigData;
}

export function apiResponseSdkGranterConfigDataDeserializer(
  item: any,
): ApiResponseSdkGranterConfigData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: sdkGranterConfigDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseSdkShieldConfigData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: SdkShieldConfigData;
}

export function apiResponseSdkShieldConfigDataDeserializer(
  item: any,
): ApiResponseSdkShieldConfigData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: sdkShieldConfigDataDeserializer(item["data"]),
  };
}
