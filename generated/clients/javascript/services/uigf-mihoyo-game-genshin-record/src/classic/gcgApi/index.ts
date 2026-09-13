// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinRecordContext } from "../../api/mihoyoGameGenshinRecordContext.js";
import {
  getMatchList,
  getCovers,
  getDeckList,
  getChallengeSchedule,
  getChallengeRecord,
  getCardList,
  getCardBackList,
  getBasicInfo,
} from "../../api/gcgApi/operations.js";
import {
  GcgApiGetMatchListOptionalParams,
  GcgApiGetCoversOptionalParams,
  GcgApiGetDeckListOptionalParams,
  GcgApiGetChallengeScheduleOptionalParams,
  GcgApiGetChallengeRecordOptionalParams,
  GcgApiGetCardListOptionalParams,
  GcgApiGetCardBackListOptionalParams,
  GcgApiGetBasicInfoOptionalParams,
} from "../../api/gcgApi/options.js";
import {
  ApiResponseGcgBasicInfoData,
  ApiResponseGcgCardBackListData,
  ApiResponseGcgCardListData,
  ApiResponseGcgChallengeRecordData,
  ApiResponseGcgChallengeScheduleData,
  ApiResponseGcgDeckListData,
  ApiResponseGcgCoversData,
  ApiResponseGcgMatchListData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a GcgApi operations. */
export interface GcgApiOperations {
  getMatchList: (
    cookie: string,
    ds: string,
    roleId: string,
    server: string,
    options?: GcgApiGetMatchListOptionalParams,
  ) => Promise<ApiResponseGcgMatchListData>;
  getCovers: (
    cookie: string,
    ds: string,
    roleId: string,
    server: string,
    options?: GcgApiGetCoversOptionalParams,
  ) => Promise<ApiResponseGcgCoversData>;
  getDeckList: (
    cookie: string,
    ds: string,
    roleId: string,
    server: string,
    options?: GcgApiGetDeckListOptionalParams,
  ) => Promise<ApiResponseGcgDeckListData>;
  getChallengeSchedule: (
    cookie: string,
    ds: string,
    roleId: string,
    server: string,
    options?: GcgApiGetChallengeScheduleOptionalParams,
  ) => Promise<ApiResponseGcgChallengeScheduleData>;
  getChallengeRecord: (
    cookie: string,
    ds: string,
    scheduleId: number,
    roleId: string,
    server: string,
    options?: GcgApiGetChallengeRecordOptionalParams,
  ) => Promise<ApiResponseGcgChallengeRecordData>;
  getCardList: (
    cookie: string,
    ds: string,
    limit: number,
    needAction: boolean,
    needAvatar: boolean,
    needStats: boolean,
    offset: number,
    roleId: string,
    server: string,
    options?: GcgApiGetCardListOptionalParams,
  ) => Promise<ApiResponseGcgCardListData>;
  getCardBackList: (
    cookie: string,
    ds: string,
    roleId: string,
    server: string,
    options?: GcgApiGetCardBackListOptionalParams,
  ) => Promise<ApiResponseGcgCardBackListData>;
  getBasicInfo: (
    cookie: string,
    ds: string,
    roleId: string,
    server: string,
    options?: GcgApiGetBasicInfoOptionalParams,
  ) => Promise<ApiResponseGcgBasicInfoData>;
}

function _getGcgApi(context: MihoyoGameGenshinRecordContext) {
  return {
    getMatchList: (
      cookie: string,
      ds: string,
      roleId: string,
      server: string,
      options?: GcgApiGetMatchListOptionalParams,
    ) => getMatchList(context, cookie, ds, roleId, server, options),
    getCovers: (
      cookie: string,
      ds: string,
      roleId: string,
      server: string,
      options?: GcgApiGetCoversOptionalParams,
    ) => getCovers(context, cookie, ds, roleId, server, options),
    getDeckList: (
      cookie: string,
      ds: string,
      roleId: string,
      server: string,
      options?: GcgApiGetDeckListOptionalParams,
    ) => getDeckList(context, cookie, ds, roleId, server, options),
    getChallengeSchedule: (
      cookie: string,
      ds: string,
      roleId: string,
      server: string,
      options?: GcgApiGetChallengeScheduleOptionalParams,
    ) => getChallengeSchedule(context, cookie, ds, roleId, server, options),
    getChallengeRecord: (
      cookie: string,
      ds: string,
      scheduleId: number,
      roleId: string,
      server: string,
      options?: GcgApiGetChallengeRecordOptionalParams,
    ) => getChallengeRecord(context, cookie, ds, scheduleId, roleId, server, options),
    getCardList: (
      cookie: string,
      ds: string,
      limit: number,
      needAction: boolean,
      needAvatar: boolean,
      needStats: boolean,
      offset: number,
      roleId: string,
      server: string,
      options?: GcgApiGetCardListOptionalParams,
    ) =>
      getCardList(
        context,
        cookie,
        ds,
        limit,
        needAction,
        needAvatar,
        needStats,
        offset,
        roleId,
        server,
        options,
      ),
    getCardBackList: (
      cookie: string,
      ds: string,
      roleId: string,
      server: string,
      options?: GcgApiGetCardBackListOptionalParams,
    ) => getCardBackList(context, cookie, ds, roleId, server, options),
    getBasicInfo: (
      cookie: string,
      ds: string,
      roleId: string,
      server: string,
      options?: GcgApiGetBasicInfoOptionalParams,
    ) => getBasicInfo(context, cookie, ds, roleId, server, options),
  };
}

export function _getGcgApiOperations(context: MihoyoGameGenshinRecordContext): GcgApiOperations {
  return {
    ..._getGcgApi(context),
  };
}
