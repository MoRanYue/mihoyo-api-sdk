// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { OperationOptions } from "@azure-rest/core-client";

/** Optional parameters. */
export interface ZenlessApiGetThresholdSimulationDetailOptionalParams extends OperationOptions {}

/** Optional parameters. */
export interface ZenlessApiGetThresholdSimulationSummaryOptionalParams extends OperationOptions {}

/** Optional parameters. */
export interface ZenlessApiGetDeadlyAssaultOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface ZenlessApiGetShiyuDefenseOptionalParams extends OperationOptions {
  ds?: string;
  withoutV2Detail?: boolean;
  scheduleType?: number;
  needDetail?: boolean;
  needAll?: boolean;
}

/** Optional parameters. */
export interface ZenlessApiGetGachaRecordOptionalParams extends OperationOptions {
  endId?: number;
  lang?: string;
}

/** Optional parameters. */
export interface ZenlessApiGetDailyNoteOptionalParams extends OperationOptions {}

/** Optional parameters. */
export interface ZenlessApiGetIndexOptionalParams extends OperationOptions {
  ds?: string;
}
