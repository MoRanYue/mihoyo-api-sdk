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
    options?: MobilePainterApiGetVillaSitePushOptionalParams,
  ) => Promise<ApiResponseMobileVillaSitePushData>;
  getUserInstantList: (
    gameRegion: string,
    gameUid: number,
    offset: number,
    size: number,
    uid: number,
    viewType: number,
    options?: MobilePainterApiGetUserInstantListOptionalParams,
  ) => Promise<ApiResponseMobileUserInstantListData>;
  getFeedPosts: (
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
    getVillaSitePush: (options?: MobilePainterApiGetVillaSitePushOptionalParams) =>
      getVillaSitePush(context, options),
    getUserInstantList: (
      gameRegion: string,
      gameUid: number,
      offset: number,
      size: number,
      uid: number,
      viewType: number,
      options?: MobilePainterApiGetUserInstantListOptionalParams,
    ) => getUserInstantList(context, gameRegion, gameUid, offset, size, uid, viewType, options),
    getFeedPosts: (
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
