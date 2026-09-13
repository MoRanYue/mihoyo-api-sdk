// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import {
  AuthKeyData,
  authKeyDataDeserializer,
  ReleaseData,
  releaseDataDeserializer,
} from "./api/response/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGameRoleList {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GameRoleList;
}

export function apiResponseGameRoleListDeserializer(item: any): ApiResponseGameRoleList {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: gameRoleListDeserializer(item["data"]),
  };
}

/** model interface GameRoleList */
export interface GameRoleList {
  list: GameRole[];
}

export function gameRoleListDeserializer(item: any): GameRoleList {
  return {
    list: gameRoleArrayDeserializer(item["list"]),
  };
}

export function gameRoleArrayDeserializer(result: Array<GameRole>): any[] {
  return result.map((item) => {
    return gameRoleDeserializer(item);
  });
}

/** Standard game account identity reused by record APIs. */
export interface GameRole {
  gameBiz: string;
  region: string;
  gameUid: string;
  nickname?: string;
  level?: number;
  isChosen?: boolean;
  regionName?: string;
  gameName?: string;
}

export function gameRoleDeserializer(item: any): GameRole {
  return {
    gameBiz: item["game_biz"],
    region: item["region"],
    gameUid: item["game_uid"],
    nickname: item["nickname"],
    level: item["level"],
    isChosen: item["is_chosen"],
    regionName: item["region_name"],
    gameName: item["game_name"],
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseAuthKeyData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: AuthKeyData;
}

export function apiResponseAuthKeyDataDeserializer(item: any): ApiResponseAuthKeyData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: authKeyDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseReleaseData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: ReleaseData;
}

export function apiResponseReleaseDataDeserializer(item: any): ApiResponseReleaseData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: releaseDataDeserializer(item["data"]),
  };
}
