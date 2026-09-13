// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import {
  StaticResourceData,
  staticResourceDataDeserializer,
  StaticResourceVersionsData,
  staticResourceVersionsDataDeserializer,
  StaticLatestVersionData,
  staticLatestVersionDataDeserializer,
  StaticPreKeywordData,
  staticPreKeywordDataDeserializer,
} from "./api/response/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseStaticResourceData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: StaticResourceData;
}

export function apiResponseStaticResourceDataDeserializer(
  item: any,
): ApiResponseStaticResourceData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: staticResourceDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseStaticResourceVersionsData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: StaticResourceVersionsData;
}

export function apiResponseStaticResourceVersionsDataDeserializer(
  item: any,
): ApiResponseStaticResourceVersionsData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: staticResourceVersionsDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseStaticLatestVersionData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: StaticLatestVersionData;
}

export function apiResponseStaticLatestVersionDataDeserializer(
  item: any,
): ApiResponseStaticLatestVersionData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: staticLatestVersionDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseStaticPreKeywordData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: StaticPreKeywordData;
}

export function apiResponseStaticPreKeywordDataDeserializer(
  item: any,
): ApiResponseStaticPreKeywordData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: staticPreKeywordDataDeserializer(item["data"]),
  };
}
