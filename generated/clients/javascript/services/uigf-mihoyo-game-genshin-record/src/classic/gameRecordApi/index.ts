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
    options?: GameRecordApiGetToolOptionalParams,
  ) => Promise<ApiResponseGenshinToolData>;
  getRoleBasicInfo: (
    cookie: string,
    roleId: string,
    server: string,
    options?: GameRecordApiGetRoleBasicInfoOptionalParams,
  ) => Promise<ApiResponseGenshinRoleBasicInfoData>;
  getExternalContent: (
    cookie: string,
    itemId: number,
    itemType: number,
    options?: GameRecordApiGetExternalContentOptionalParams,
  ) => Promise<ApiResponseGenshinExternalContentData>;
  getCharacterTps: (
    cookie: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetCharacterTpsOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getActivityCalendar: (
    cookie: string,
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
    server: string,
    roleId: string,
    options?: GameRecordApiGetStygianOnslaughtOptionalParams,
  ) => Promise<ApiResponseGenshinStygianData>;
  getCharacterMaster: (
    cookie: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetCharacterMasterOptionalParams,
  ) => Promise<ApiResponseGenshinCharacterMasterData>;
  getImaginariumTheater: (
    cookie: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetImaginariumTheaterOptionalParams,
  ) => Promise<ApiResponseGenshinTheaterData>;
  getSpiralAbyss: (
    cookie: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetSpiralAbyssOptionalParams,
  ) => Promise<ApiResponseGenshinSpiralAbyssData>;
  getDailyNote: (
    cookie: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetDailyNoteOptionalParams,
  ) => Promise<ApiResponseGenshinDailyNoteData>;
  /** Character IDs should be sent in batches of at most 40, as used by TeyvatGuide. */
  getCharacterDetails: (
    cookie: string,
    body: CharacterDetailRequest,
    options?: GameRecordApiGetCharacterDetailsOptionalParams,
  ) => Promise<ApiResponseCharacterList>;
  listCharacters: (
    cookie: string,
    body: CharacterListRequest,
    options?: GameRecordApiListCharactersOptionalParams,
  ) => Promise<ApiResponseCharacterList>;
  getIndex: (
    cookie: string,
    server: string,
    roleId: string,
    options?: GameRecordApiGetIndexOptionalParams,
  ) => Promise<ApiResponseGenshinRecordIndexData>;
}

function _getGameRecordApi(context: MihoyoGameGenshinRecordContext) {
  return {
    getTool: (cookie: string, options?: GameRecordApiGetToolOptionalParams) =>
      getTool(context, cookie, options),
    getRoleBasicInfo: (
      cookie: string,
      roleId: string,
      server: string,
      options?: GameRecordApiGetRoleBasicInfoOptionalParams,
    ) => getRoleBasicInfo(context, cookie, roleId, server, options),
    getExternalContent: (
      cookie: string,
      itemId: number,
      itemType: number,
      options?: GameRecordApiGetExternalContentOptionalParams,
    ) => getExternalContent(context, cookie, itemId, itemType, options),
    getCharacterTps: (
      cookie: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetCharacterTpsOptionalParams,
    ) => getCharacterTps(context, cookie, server, roleId, options),
    getActivityCalendar: (
      cookie: string,
      body: CharacterListRequest,
      options?: GameRecordApiGetActivityCalendarOptionalParams,
    ) => getActivityCalendar(context, cookie, body, options),
    getStygianPopularity: (
      server: string,
      roleId: number,
      options?: GameRecordApiGetStygianPopularityOptionalParams,
    ) => getStygianPopularity(context, server, roleId, options),
    getStygianOnslaught: (
      cookie: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetStygianOnslaughtOptionalParams,
    ) => getStygianOnslaught(context, cookie, server, roleId, options),
    getCharacterMaster: (
      cookie: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetCharacterMasterOptionalParams,
    ) => getCharacterMaster(context, cookie, server, roleId, options),
    getImaginariumTheater: (
      cookie: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetImaginariumTheaterOptionalParams,
    ) => getImaginariumTheater(context, cookie, server, roleId, options),
    getSpiralAbyss: (
      cookie: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetSpiralAbyssOptionalParams,
    ) => getSpiralAbyss(context, cookie, server, roleId, options),
    getDailyNote: (
      cookie: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetDailyNoteOptionalParams,
    ) => getDailyNote(context, cookie, server, roleId, options),
    getCharacterDetails: (
      cookie: string,
      body: CharacterDetailRequest,
      options?: GameRecordApiGetCharacterDetailsOptionalParams,
    ) => getCharacterDetails(context, cookie, body, options),
    listCharacters: (
      cookie: string,
      body: CharacterListRequest,
      options?: GameRecordApiListCharactersOptionalParams,
    ) => listCharacters(context, cookie, body, options),
    getIndex: (
      cookie: string,
      server: string,
      roleId: string,
      options?: GameRecordApiGetIndexOptionalParams,
    ) => getIndex(context, cookie, server, roleId, options),
  };
}

export function _getGameRecordApiOperations(
  context: MihoyoGameGenshinRecordContext,
): GameRecordApiOperations {
  return {
    ..._getGameRecordApi(context),
  };
}
