// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import {
  StrategyLatestContentData,
  strategyLatestContentDataDeserializer,
  StrategyHomeInfoData,
  strategyHomeInfoDataDeserializer,
  StrategyHomeNavbarData,
  strategyHomeNavbarDataDeserializer,
  ZenlessFeedbackScheduleData,
  zenlessFeedbackScheduleDataDeserializer,
  EmptyData,
  emptyDataDeserializer,
} from "./api/response/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseStrategyLatestContentData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: StrategyLatestContentData;
}

export function apiResponseStrategyLatestContentDataDeserializer(
  item: any,
): ApiResponseStrategyLatestContentData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: strategyLatestContentDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseStrategyHomeInfoData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: StrategyHomeInfoData;
}

export function apiResponseStrategyHomeInfoDataDeserializer(
  item: any,
): ApiResponseStrategyHomeInfoData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: strategyHomeInfoDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseStrategyHomeNavbarData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: StrategyHomeNavbarData;
}

export function apiResponseStrategyHomeNavbarDataDeserializer(
  item: any,
): ApiResponseStrategyHomeNavbarData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: strategyHomeNavbarDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseZenlessFeedbackScheduleData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessFeedbackScheduleData;
}

export function apiResponseZenlessFeedbackScheduleDataDeserializer(
  item: any,
): ApiResponseZenlessFeedbackScheduleData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessFeedbackScheduleDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseEmptyData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: EmptyData;
}

export function apiResponseEmptyDataDeserializer(item: any): ApiResponseEmptyData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: emptyDataDeserializer(item["data"]),
  };
}
