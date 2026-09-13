// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import {
  SdkPorteData,
  sdkPorteDataDeserializer,
  SdkFeCnConfigData,
  sdkFeCnConfigDataDeserializer,
} from "./api/response/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseSdkPorteData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: SdkPorteData;
}

export function apiResponseSdkPorteDataDeserializer(item: any): ApiResponseSdkPorteData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: sdkPorteDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseSdkFeCnConfigData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: SdkFeCnConfigData;
}

export function apiResponseSdkFeCnConfigDataDeserializer(item: any): ApiResponseSdkFeCnConfigData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: sdkFeCnConfigDataDeserializer(item["data"]),
  };
}
