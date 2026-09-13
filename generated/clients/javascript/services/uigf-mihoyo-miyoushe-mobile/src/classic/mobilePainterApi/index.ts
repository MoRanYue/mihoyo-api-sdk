// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import {
  getVillaSitePush,
  getUserInstantList,
  getFeedPosts,
} from "../../api/mobilePainterApi/operations.js";
import {
  MobilePainterApiGetVillaSitePushOptionalParams,
  MobilePainterApiGetUserInstantListOptionalParams,
  MobilePainterApiGetFeedPostsOptionalParams,
} from "../../api/mobilePainterApi/options.js";
import {
  ApiResponseMobileFeedPostsData,
  ApiResponseMobileUserInstantListData,
  ApiResponseMobileVillaSitePushData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobilePainterApi operations. */
export interface MobilePainterApiOperations {
  getVillaSitePush: (
    ds: string,
    options?: MobilePainterApiGetVillaSitePushOptionalParams,
  ) => Promise<ApiResponseMobileVillaSitePushData>;
  getUserInstantList: (
    ds: string,
    gameRegion: string,
    gameUid: number,
    offset: number,
    size: number,
    uid: number,
    viewType: number,
    options?: MobilePainterApiGetUserInstantListOptionalParams,
  ) => Promise<ApiResponseMobileUserInstantListData>;
  getFeedPosts: (
    ds: string,
    algorithmType: number,
    cpu: string,
    device: string,
    filter: string,
    freshAction: number,
    gids: number,
    isFirstInitialize: boolean,
    isTriggeredByResource: boolean,
    lastId: string,
    options?: MobilePainterApiGetFeedPostsOptionalParams,
  ) => Promise<ApiResponseMobileFeedPostsData>;
}

function _getMobilePainterApi(context: MihoyoMiYouSheMobileContext) {
  return {
    getVillaSitePush: (ds: string, options?: MobilePainterApiGetVillaSitePushOptionalParams) =>
      getVillaSitePush(context, ds, options),
    getUserInstantList: (
      ds: string,
      gameRegion: string,
      gameUid: number,
      offset: number,
      size: number,
      uid: number,
      viewType: number,
      options?: MobilePainterApiGetUserInstantListOptionalParams,
    ) => getUserInstantList(context, ds, gameRegion, gameUid, offset, size, uid, viewType, options),
    getFeedPosts: (
      ds: string,
      algorithmType: number,
      cpu: string,
      device: string,
      filter: string,
      freshAction: number,
      gids: number,
      isFirstInitialize: boolean,
      isTriggeredByResource: boolean,
      lastId: string,
      options?: MobilePainterApiGetFeedPostsOptionalParams,
    ) =>
      getFeedPosts(
        context,
        ds,
        algorithmType,
        cpu,
        device,
        filter,
        freshAction,
        gids,
        isFirstInitialize,
        isTriggeredByResource,
        lastId,
        options,
      ),
  };
}

export function _getMobilePainterApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobilePainterApiOperations {
  return {
    ..._getMobilePainterApi(context),
  };
}
