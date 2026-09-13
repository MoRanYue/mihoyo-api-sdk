// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../static-helpers/serialization/serialize-record.js";
import {
  ZenlessIndexData,
  zenlessIndexDataDeserializer,
  ZenlessDailyNoteData,
  zenlessDailyNoteDataDeserializer,
  ZenlessShiyuDefenseData,
  zenlessShiyuDefenseDataDeserializer,
  ZenlessAbyssSummaryData,
  zenlessAbyssSummaryDataDeserializer,
  ZenlessAbyssSeasonTwoSummaryData,
  zenlessAbyssSeasonTwoSummaryDataDeserializer,
  ZenlessActivityCalendarData,
  zenlessActivityCalendarDataDeserializer,
  ZenlessClimbingTowerDetailData,
  zenlessClimbingTowerDetailDataDeserializer,
  ZenlessExplorationDetailData,
  zenlessExplorationDetailDataDeserializer,
  ZenlessGachaCalendarData,
  zenlessGachaCalendarDataDeserializer,
  ZenlessDeadlyAssaultSummaryData,
  zenlessDeadlyAssaultSummaryDataDeserializer,
  ZenlessThresholdSimulationPeriodSummaryData,
  zenlessThresholdSimulationPeriodSummaryDataDeserializer,
} from "./game/response/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseJsonObject {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: JsonObject;
}

export function apiResponseJsonObjectDeserializer(item: any): ApiResponseJsonObject {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: jsonObjectDeserializer(item["data"]),
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
export interface ApiResponseZenlessIndexData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessIndexData;
}

export function apiResponseZenlessIndexDataDeserializer(item: any): ApiResponseZenlessIndexData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessIndexDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseZenlessDailyNoteData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessDailyNoteData;
}

export function apiResponseZenlessDailyNoteDataDeserializer(
  item: any,
): ApiResponseZenlessDailyNoteData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessDailyNoteDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGachaLogPage {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GachaLogPage;
}

export function apiResponseGachaLogPageDeserializer(item: any): ApiResponseGachaLogPage {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: gachaLogPageDeserializer(item["data"]),
  };
}

/** model interface GachaLogPage */
export interface GachaLogPage {
  page?: string;
  size?: string;
  total?: string;
  region?: string;
  list: GachaItem[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gachaLogPageDeserializer(item: any): GachaLogPage {
  return {
    additionalProperties: serializeRecord(item, ["page", "size", "total", "region", "list"]),
    page: item["page"],
    size: item["size"],
    total: item["total"],
    region: item["region"],
    list: gachaItemArrayDeserializer(item["list"]),
  };
}

export function gachaItemArrayDeserializer(result: Array<GachaItem>): any[] {
  return result.map((item) => {
    return gachaItemDeserializer(item);
  });
}

/** model interface GachaItem */
export interface GachaItem {
  uid?: string;
  gachaType?: string;
  itemId?: string;
  count?: string;
  time?: string;
  name?: string;
  itemType?: string;
  lang?: string;
  opGachaType?: string;
  rankType?: string;
  id: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gachaItemDeserializer(item: any): GachaItem {
  return {
    additionalProperties: serializeRecord(item, [
      "uid",
      "gacha_type",
      "item_id",
      "count",
      "time",
      "name",
      "item_type",
      "lang",
      "op_gacha_type",
      "rank_type",
      "id",
    ]),
    uid: item["uid"],
    gachaType: item["gacha_type"],
    itemId: item["item_id"],
    count: item["count"],
    time: item["time"],
    name: item["name"],
    itemType: item["item_type"],
    lang: item["lang"],
    opGachaType: item["op_gacha_type"],
    rankType: item["rank_type"],
    id: item["id"],
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseZenlessShiyuDefenseData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessShiyuDefenseData;
}

export function apiResponseZenlessShiyuDefenseDataDeserializer(
  item: any,
): ApiResponseZenlessShiyuDefenseData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessShiyuDefenseDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseZenlessAbyssSummaryData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessAbyssSummaryData;
}

export function apiResponseZenlessAbyssSummaryDataDeserializer(
  item: any,
): ApiResponseZenlessAbyssSummaryData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessAbyssSummaryDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseZenlessAbyssSeasonTwoSummaryData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessAbyssSeasonTwoSummaryData;
}

export function apiResponseZenlessAbyssSeasonTwoSummaryDataDeserializer(
  item: any,
): ApiResponseZenlessAbyssSeasonTwoSummaryData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessAbyssSeasonTwoSummaryDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseZenlessActivityCalendarData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessActivityCalendarData;
}

export function apiResponseZenlessActivityCalendarDataDeserializer(
  item: any,
): ApiResponseZenlessActivityCalendarData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessActivityCalendarDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseZenlessClimbingTowerDetailData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessClimbingTowerDetailData;
}

export function apiResponseZenlessClimbingTowerDetailDataDeserializer(
  item: any,
): ApiResponseZenlessClimbingTowerDetailData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessClimbingTowerDetailDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseZenlessExplorationDetailData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessExplorationDetailData;
}

export function apiResponseZenlessExplorationDetailDataDeserializer(
  item: any,
): ApiResponseZenlessExplorationDetailData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessExplorationDetailDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseZenlessGachaCalendarData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessGachaCalendarData;
}

export function apiResponseZenlessGachaCalendarDataDeserializer(
  item: any,
): ApiResponseZenlessGachaCalendarData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessGachaCalendarDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseZenlessDeadlyAssaultSummaryData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessDeadlyAssaultSummaryData;
}

export function apiResponseZenlessDeadlyAssaultSummaryDataDeserializer(
  item: any,
): ApiResponseZenlessDeadlyAssaultSummaryData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessDeadlyAssaultSummaryDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseZenlessThresholdSimulationPeriodSummaryData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ZenlessThresholdSimulationPeriodSummaryData;
}

export function apiResponseZenlessThresholdSimulationPeriodSummaryDataDeserializer(
  item: any,
): ApiResponseZenlessThresholdSimulationPeriodSummaryData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: zenlessThresholdSimulationPeriodSummaryDataDeserializer(item["data"]),
  };
}
