// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import {
  SdkProtocolVersionComparisonData,
  sdkProtocolVersionComparisonDataDeserializer,
  SdkRedDotData,
  sdkRedDotDataDeserializer,
} from "./game/response/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseSdkProtocolVersionComparisonData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: SdkProtocolVersionComparisonData;
}

export function apiResponseSdkProtocolVersionComparisonDataDeserializer(
  item: any,
): ApiResponseSdkProtocolVersionComparisonData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: sdkProtocolVersionComparisonDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseSdkRedDotData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: SdkRedDotData;
}

export function apiResponseSdkRedDotDataDeserializer(item: any): ApiResponseSdkRedDotData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: sdkRedDotDataDeserializer(item["data"]),
  };
}
