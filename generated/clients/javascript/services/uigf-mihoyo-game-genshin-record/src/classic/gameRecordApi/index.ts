// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinRecordContext } from "../../api/mihoyoGameGenshinRecordContext.js";
import {
  getTool,
  getRoleBasicInfo,
  getExternalContent,
  getCharacterTps,
  getActivityCalendar,
  getStygianPopularity,
  getStygianOnslaught,
  getCharacterMaster,
  getImaginariumTheater,
  getSpiralAbyss,
  getDailyNote,
  getCharacterDetails,
  listCharacters,
  getIndex,
} from "../../api/gameRecordApi/operations.js";
import {
  GameRecordApiGetToolOptionalParams,
  GameRecordApiGetRoleBasicInfoOptionalParams,
  GameRecordApiGetExternalContentOptionalParams,
  GameRecordApiGetCharacterTpsOptionalParams,
  GameRecordApiGetActivityCalendarOptionalParams,
  GameRecordApiGetStygianPopularityOptionalParams,
  GameRecordApiGetStygianOnslaughtOptionalParams,
  GameRecordApiGetCharacterMasterOptionalParams,
  GameRecordApiGetImaginariumTheaterOptionalParams,
  GameRecordApiGetSpiralAbyssOptionalParams,
  GameRecordApiGetDailyNoteOptionalParams,
  GameRecordApiGetCharacterDetailsOptionalParams,
  GameRecordApiListCharactersOptionalParams,
  GameRecordApiGetIndexOptionalParams,
} from "../../api/gameRecordApi/options.js";
import {
  CharacterListRequest,
  CharacterDetailRequest,
} from "../../models/uigf/mihoyo/game/models.js";
import {
  ApiResponseGenshinRecordIndexData,
  ApiResponseCharacterList,
  ApiResponseGenshinDailyNoteData,
  ApiResponseGenshinSpiralAbyssData,
  ApiResponseGenshinTheaterData,
  ApiResponseGenshinCharacterMasterData,
  ApiResponseGenshinStygianData,
  ApiResponseGenshinStygianPopularityData,
  ApiResponseGenshinActivityCalendarData,
  ApiResponseJsonObject,
  ApiResponseGenshinExternalContentData,
  ApiResponseGenshinRoleBasicInfoData,
  ApiResponseGenshinToolData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a GameRecordApi operations. */
export interface GameRecordApiOperations {
  getTool: (
    cookie: string,
    ds: string,
    options?: GameRecordApiGetToolOptionalParams,
  ) => Promise<ApiResponseGenshinToolData>;
  getRoleBasicInfo: (
    cookie: string,
    ds: string,
    roleId: string,
    server: string,
    options?: GameRecordApiGetRoleBasicInfoOptionalParams,
  ) => Promise<ApiResponseGenshinRoleBasicInfoData>;
  getExternalContent: (
    cookie: string,
    ds: string,
    itemId: number,
    itemType: number,
    options?: GameRecordApiGetExternalContentOptionalParams,
  ) => Promise<ApiResponseGenshinExternalContentData>;
  getCharacterTps: (
    cookie: string,
    ds: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetCharacterTpsOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getActivityCalendar: (
    cookie: string,
    ds: string,
    body: CharacterListRequest,
    options?: GameRecordApiGetActivityCalendarOptionalParams,
  ) => Promise<ApiResponseGenshinActivityCalendarData>;
  getStygianPopularity: (
    server: string,
    roleId: number,
    options?: GameRecordApiGetStygianPopularityOptionalParams,
  ) => Promise<ApiResponseGenshinStygianPopularityData>;
  getStygianOnslaught: (
    cookie: string,
    ds: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetStygianOnslaughtOptionalParams,
  ) => Promise<ApiResponseGenshinStygianData>;
  getCharacterMaster: (
    cookie: string,
    ds: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetCharacterMasterOptionalParams,
  ) => Promise<ApiResponseGenshinCharacterMasterData>;
  getImaginariumTheater: (
    cookie: string,
    ds: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetImaginariumTheaterOptionalParams,
  ) => Promise<ApiResponseGenshinTheaterData>;
  getSpiralAbyss: (
    cookie: string,
    ds: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetSpiralAbyssOptionalParams,
  ) => Promise<ApiResponseGenshinSpiralAbyssData>;
  getDailyNote: (
    cookie: string,
    ds: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetDailyNoteOptionalParams,
  ) => Promise<ApiResponseGenshinDailyNoteData>;
  /** Character IDs should be sent in batches of at most 40, as used by TeyvatGuide. */
  getCharacterDetails: (
    cookie: string,
    ds: string,
    body: CharacterDetailRequest,
    options?: GameRecordApiGetCharacterDetailsOptionalParams,
  ) => Promise<ApiResponseCharacterList>;
  listCharacters: (
    cookie: string,
    ds: string,
    body: CharacterListRequest,
    options?: GameRecordApiListCharactersOptionalParams,
  ) => Promise<ApiResponseCharacterList>;
  getIndex: (
    cookie: string,
    ds: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetIndexOptionalParams,
  ) => Promise<ApiResponseGenshinRecordIndexData>;
}

function _getGameRecordApi(context: MihoyoGameGenshinRecordContext) {
  return {
    getTool: (cookie: string, ds: string, options?: GameRecordApiGetToolOptionalParams) =>
      getTool(context, cookie, ds, options),
    getRoleBasicInfo: (
      cookie: string,
      ds: string,
      roleId: string,
      server: string,
      options?: GameRecordApiGetRoleBasicInfoOptionalParams,
    ) => getRoleBasicInfo(context, cookie, ds, roleId, server, options),
    getExternalContent: (
      cookie: string,
      ds: string,
      itemId: number,
      itemType: number,
      options?: GameRecordApiGetExternalContentOptionalParams,
    ) => getExternalContent(context, cookie, ds, itemId, itemType, options),
    getCharacterTps: (
      cookie: string,
      ds: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetCharacterTpsOptionalParams,
    ) => getCharacterTps(context, cookie, ds, server, roleId, options),
    getActivityCalendar: (
      cookie: string,
      ds: string,
      body: CharacterListRequest,
      options?: GameRecordApiGetActivityCalendarOptionalParams,
    ) => getActivityCalendar(context, cookie, ds, body, options),
    getStygianPopularity: (
      server: string,
      roleId: number,
      options?: GameRecordApiGetStygianPopularityOptionalParams,
    ) => getStygianPopularity(context, server, roleId, options),
    getStygianOnslaught: (
      cookie: string,
      ds: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetStygianOnslaughtOptionalParams,
    ) => getStygianOnslaught(context, cookie, ds, server, roleId, options),
    getCharacterMaster: (
      cookie: string,
      ds: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetCharacterMasterOptionalParams,
    ) => getCharacterMaster(context, cookie, ds, server, roleId, options),
    getImaginariumTheater: (
      cookie: string,
      ds: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetImaginariumTheaterOptionalParams,
    ) => getImaginariumTheater(context, cookie, ds, server, roleId, options),
    getSpiralAbyss: (
      cookie: string,
      ds: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetSpiralAbyssOptionalParams,
    ) => getSpiralAbyss(context, cookie, ds, server, roleId, options),
    getDailyNote: (
      cookie: string,
      ds: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetDailyNoteOptionalParams,
    ) => getDailyNote(context, cookie, ds, server, roleId, options),
    getCharacterDetails: (
      cookie: string,
      ds: string,
      body: CharacterDetailRequest,
      options?: GameRecordApiGetCharacterDetailsOptionalParams,
    ) => getCharacterDetails(context, cookie, ds, body, options),
    listCharacters: (
      cookie: string,
      ds: string,
      body: CharacterListRequest,
      options?: GameRecordApiListCharactersOptionalParams,
    ) => listCharacters(context, cookie, ds, body, options),
    getIndex: (
      cookie: string,
      ds: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetIndexOptionalParams,
    ) => getIndex(context, cookie, ds, server, roleId, options),
  };
}

export function _getGameRecordApiOperations(
  context: MihoyoGameGenshinRecordContext,
): GameRecordApiOperations {
  return {
    ..._getGameRecordApi(context),
  };
}
