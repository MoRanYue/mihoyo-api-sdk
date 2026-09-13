// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { OperationOptions } from "@azure-rest/core-client";

/** Optional parameters. */
export interface GameRecordApiGetToolOptionalParams extends OperationOptions {
  ds?: string;
  challenge?: string;
}

/** Optional parameters. */
export interface GameRecordApiGetRoleBasicInfoOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface GameRecordApiGetExternalContentOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface GameRecordApiGetCharacterTpsOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface GameRecordApiGetActivityCalendarOptionalParams extends OperationOptions {
  ds?: string;
  challenge?: string;
}

/** Optional parameters. */
export interface GameRecordApiGetStygianPopularityOptionalParams extends OperationOptions {}

/** Optional parameters. */
export interface GameRecordApiGetStygianOnslaughtOptionalParams extends OperationOptions {
  ds?: string;
  scheduleType?: number;
  needDetail?: boolean;
  needAll?: boolean;
}

/** Optional parameters. */
export interface GameRecordApiGetCharacterMasterOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface GameRecordApiGetImaginariumTheaterOptionalParams extends OperationOptions {
  ds?: string;
  active?: number;
  scheduleType?: number;
  needDetail?: boolean;
  needAll?: boolean;
}

/** Optional parameters. */
export interface GameRecordApiGetSpiralAbyssOptionalParams extends OperationOptions {
  ds?: string;
  scheduleType?: number;
  needDetail?: boolean;
  needAll?: boolean;
}

/** Optional parameters. */
export interface GameRecordApiGetDailyNoteOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface GameRecordApiGetCharacterDetailsOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface GameRecordApiListCharactersOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface GameRecordApiGetIndexOptionalParams extends OperationOptions {
  ds?: string;
  avatarListType?: number;
}
