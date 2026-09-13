// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameGenshinRecordClient } from "./mihoyoGameGenshinRecordClient.js";
export type {
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
  JsonObject,
  ApiResponseGenshinExternalContentData,
  ApiResponseGenshinRoleBasicInfoData,
  ApiResponseGenshinToolData,
  ApiResponseGcgBasicInfoData,
  ApiResponseGcgCardBackListData,
  ApiResponseGcgCardListData,
  ApiResponseGcgChallengeRecordData,
  ApiResponseGcgChallengeScheduleData,
  ApiResponseGcgDeckListData,
  ApiResponseGcgCoversData,
  ApiResponseGcgMatchListData,
  ApiResponseGenshinGameRecordCardData,
} from "./models/uigf/mihoyo/index.js";
export type {
  CharacterListRequest,
  CharacterList,
  Character,
  CharacterDetailRequest,
} from "./models/uigf/mihoyo/game/index.js";
export type {
  GenshinRecordIndexData,
  GenshinRecordRole,
  GenshinDailyNoteData,
  GenshinSpiralAbyssData,
  GenshinTheaterData,
  GenshinCharacterMasterData,
  GenshinStygianData,
  GenshinStygianPopularityData,
  GenshinActivityCalendarData,
  GenshinExternalContentData,
  GenshinRoleBasicInfoData,
  GenshinToolData,
  GcgBasicInfoData,
  GcgCardBackListData,
  GcgCardListData,
  GcgChallengeRecordData,
  GcgChallengeScheduleData,
  GcgDeckListData,
  GcgCoversData,
  GcgMatchListData,
  GenshinGameRecordCardData,
} from "./models/uigf/mihoyo/game/response/index.js";
export type { MihoyoGameGenshinRecordClientOptionalParams } from "./api/index.js";
export type { CardApiGetGameRecordCardOptionalParams } from "./api/cardApi/index.js";
export type {
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
} from "./api/gameRecordApi/index.js";
export type {
  GcgApiGetMatchListOptionalParams,
  GcgApiGetCoversOptionalParams,
  GcgApiGetDeckListOptionalParams,
  GcgApiGetChallengeScheduleOptionalParams,
  GcgApiGetChallengeRecordOptionalParams,
  GcgApiGetCardListOptionalParams,
  GcgApiGetCardBackListOptionalParams,
  GcgApiGetBasicInfoOptionalParams,
} from "./api/gcgApi/index.js";
export type {
  CardApiOperations,
  GameRecordApiOperations,
  GcgApiOperations,
} from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
