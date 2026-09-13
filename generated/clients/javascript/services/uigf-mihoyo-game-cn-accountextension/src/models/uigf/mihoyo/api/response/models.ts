// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface RedDotBatchData */
export interface RedDotBatchData {
  gameStatus?: RedDotGameStatus;
  status?: boolean;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function redDotBatchDataDeserializer(item: any): RedDotBatchData {
  return {
    additionalProperties: serializeRecord(item, ["game_status", "status"]),
    gameStatus: !item["game_status"]
      ? item["game_status"]
      : redDotGameStatusDeserializer(item["game_status"]),
    status: item["status"],
  };
}

/** model interface RedDotGameStatus */
export interface RedDotGameStatus {
  bbsCn?: boolean;
  hk4ECn?: boolean;
  napCn?: boolean;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function redDotGameStatusDeserializer(item: any): RedDotGameStatus {
  return {
    additionalProperties: serializeRecord(item, ["bbs_cn", "hk4e_cn", "nap_cn"]),
    bbsCn: item["bbs_cn"],
    hk4ECn: item["hk4e_cn"],
    napCn: item["nap_cn"],
  };
}

/** model interface PatchData */
export interface PatchData {
  dialogContent?: string;
  dialogContentEn?: string;
  dialogNum?: number;
  dialogPeriod?: number;
  dialogPeriodType?: number;
  dialogTitle?: string;
  fileName?: string;
  fileUrl?: string;
  imPageIds?: any[];
  md5?: string;
  patchAction?: number;
  patchId?: number;
  patchStrategyId?: number;
  patchVersion?: string;
  updateRecommendedIntensity?: string;
  updateType?: number;
  userDefined?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function patchDataDeserializer(item: any): PatchData {
  return {
    additionalProperties: serializeRecord(item, [
      "dialog_content",
      "dialog_content_en",
      "dialog_num",
      "dialog_period",
      "dialog_period_type",
      "dialog_title",
      "file_name",
      "file_url",
      "im_page_ids",
      "md5",
      "patch_action",
      "patch_id",
      "patch_strategy_id",
      "patch_version",
      "update_recommended_intensity",
      "update_type",
      "user_defined",
    ]),
    dialogContent: item["dialog_content"],
    dialogContentEn: item["dialog_content_en"],
    dialogNum: item["dialog_num"],
    dialogPeriod: item["dialog_period"],
    dialogPeriodType: item["dialog_period_type"],
    dialogTitle: item["dialog_title"],
    fileName: item["file_name"],
    fileUrl: item["file_url"],
    imPageIds: !item["im_page_ids"]
      ? item["im_page_ids"]
      : item["im_page_ids"].map((p: any) => {
          return p;
        }),
    md5: item["md5"],
    patchAction: item["patch_action"],
    patchId: item["patch_id"],
    patchStrategyId: item["patch_strategy_id"],
    patchVersion: item["patch_version"],
    updateRecommendedIntensity: item["update_recommended_intensity"],
    updateType: item["update_type"],
    userDefined: item["user_defined"],
  };
}
