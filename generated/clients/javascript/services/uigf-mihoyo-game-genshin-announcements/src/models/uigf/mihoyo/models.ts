// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import {
  AnnouncementListData,
  announcementListDataDeserializer,
  AnnouncementAlertData,
  announcementAlertDataDeserializer,
  AnnouncementPictureData,
  announcementPictureDataDeserializer,
} from "./game/response/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseAnnouncementListData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: AnnouncementListData;
}

export function apiResponseAnnouncementListDataDeserializer(
  item: any,
): ApiResponseAnnouncementListData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: announcementListDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseAnnouncementAlertData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: AnnouncementAlertData;
}

export function apiResponseAnnouncementAlertDataDeserializer(
  item: any,
): ApiResponseAnnouncementAlertData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: announcementAlertDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseAnnouncementPictureData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: AnnouncementPictureData;
}

export function apiResponseAnnouncementPictureDataDeserializer(
  item: any,
): ApiResponseAnnouncementPictureData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: announcementPictureDataDeserializer(item["data"]),
  };
}
