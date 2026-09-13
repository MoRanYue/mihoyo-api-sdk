// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../static-helpers/serialization/serialize-record.js";
import { CharacterList, characterListDeserializer } from "./game/models.js";
import {
  GenshinRecordIndexData,
  genshinRecordIndexDataDeserializer,
  GenshinDailyNoteData,
  genshinDailyNoteDataDeserializer,
  GenshinSpiralAbyssData,
  genshinSpiralAbyssDataDeserializer,
  GenshinTheaterData,
  genshinTheaterDataDeserializer,
  GenshinCharacterMasterData,
  genshinCharacterMasterDataDeserializer,
  GenshinStygianData,
  genshinStygianDataDeserializer,
  GenshinStygianPopularityData,
  genshinStygianPopularityDataDeserializer,
  GenshinActivityCalendarData,
  genshinActivityCalendarDataDeserializer,
  GenshinExternalContentData,
  genshinExternalContentDataDeserializer,
  GenshinRoleBasicInfoData,
  genshinRoleBasicInfoDataDeserializer,
  GenshinToolData,
  genshinToolDataDeserializer,
  GcgBasicInfoData,
  gcgBasicInfoDataDeserializer,
  GcgCardBackListData,
  gcgCardBackListDataDeserializer,
  GcgCardListData,
  gcgCardListDataDeserializer,
  GcgChallengeRecordData,
  gcgChallengeRecordDataDeserializer,
  GcgChallengeScheduleData,
  gcgChallengeScheduleDataDeserializer,
  GcgDeckListData,
  gcgDeckListDataDeserializer,
  GcgCoversData,
  gcgCoversDataDeserializer,
  GcgMatchListData,
  gcgMatchListDataDeserializer,
  GenshinGameRecordCardData,
  genshinGameRecordCardDataDeserializer,
} from "./game/response/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGenshinRecordIndexData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinRecordIndexData;
}

export function apiResponseGenshinRecordIndexDataDeserializer(
  item: any,
): ApiResponseGenshinRecordIndexData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinRecordIndexDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseCharacterList {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: CharacterList;
}

export function apiResponseCharacterListDeserializer(item: any): ApiResponseCharacterList {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: characterListDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGenshinDailyNoteData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinDailyNoteData;
}

export function apiResponseGenshinDailyNoteDataDeserializer(
  item: any,
): ApiResponseGenshinDailyNoteData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinDailyNoteDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGenshinSpiralAbyssData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinSpiralAbyssData;
}

export function apiResponseGenshinSpiralAbyssDataDeserializer(
  item: any,
): ApiResponseGenshinSpiralAbyssData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinSpiralAbyssDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGenshinTheaterData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinTheaterData;
}

export function apiResponseGenshinTheaterDataDeserializer(
  item: any,
): ApiResponseGenshinTheaterData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinTheaterDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGenshinCharacterMasterData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinCharacterMasterData;
}

export function apiResponseGenshinCharacterMasterDataDeserializer(
  item: any,
): ApiResponseGenshinCharacterMasterData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinCharacterMasterDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGenshinStygianData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinStygianData;
}

export function apiResponseGenshinStygianDataDeserializer(
  item: any,
): ApiResponseGenshinStygianData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinStygianDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGenshinStygianPopularityData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinStygianPopularityData;
}

export function apiResponseGenshinStygianPopularityDataDeserializer(
  item: any,
): ApiResponseGenshinStygianPopularityData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinStygianPopularityDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGenshinActivityCalendarData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinActivityCalendarData;
}

export function apiResponseGenshinActivityCalendarDataDeserializer(
  item: any,
): ApiResponseGenshinActivityCalendarData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinActivityCalendarDataDeserializer(item["data"]),
  };
}

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
export interface ApiResponseGenshinExternalContentData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinExternalContentData;
}

export function apiResponseGenshinExternalContentDataDeserializer(
  item: any,
): ApiResponseGenshinExternalContentData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinExternalContentDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGenshinRoleBasicInfoData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinRoleBasicInfoData;
}

export function apiResponseGenshinRoleBasicInfoDataDeserializer(
  item: any,
): ApiResponseGenshinRoleBasicInfoData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinRoleBasicInfoDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGenshinToolData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinToolData;
}

export function apiResponseGenshinToolDataDeserializer(item: any): ApiResponseGenshinToolData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinToolDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGcgBasicInfoData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GcgBasicInfoData;
}

export function apiResponseGcgBasicInfoDataDeserializer(item: any): ApiResponseGcgBasicInfoData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: gcgBasicInfoDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGcgCardBackListData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GcgCardBackListData;
}

export function apiResponseGcgCardBackListDataDeserializer(
  item: any,
): ApiResponseGcgCardBackListData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: gcgCardBackListDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGcgCardListData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GcgCardListData;
}

export function apiResponseGcgCardListDataDeserializer(item: any): ApiResponseGcgCardListData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: gcgCardListDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGcgChallengeRecordData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GcgChallengeRecordData;
}

export function apiResponseGcgChallengeRecordDataDeserializer(
  item: any,
): ApiResponseGcgChallengeRecordData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: gcgChallengeRecordDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGcgChallengeScheduleData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GcgChallengeScheduleData;
}

export function apiResponseGcgChallengeScheduleDataDeserializer(
  item: any,
): ApiResponseGcgChallengeScheduleData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: gcgChallengeScheduleDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGcgDeckListData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GcgDeckListData;
}

export function apiResponseGcgDeckListDataDeserializer(item: any): ApiResponseGcgDeckListData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: gcgDeckListDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGcgCoversData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GcgCoversData;
}

export function apiResponseGcgCoversDataDeserializer(item: any): ApiResponseGcgCoversData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: gcgCoversDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGcgMatchListData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GcgMatchListData;
}

export function apiResponseGcgMatchListDataDeserializer(item: any): ApiResponseGcgMatchListData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: gcgMatchListDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGenshinGameRecordCardData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GenshinGameRecordCardData;
}

export function apiResponseGenshinGameRecordCardDataDeserializer(
  item: any,
): ApiResponseGenshinGameRecordCardData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: genshinGameRecordCardDataDeserializer(item["data"]),
  };
}
