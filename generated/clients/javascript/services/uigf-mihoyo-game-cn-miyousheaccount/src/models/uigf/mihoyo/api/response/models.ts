// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface AuthKeyData */
export interface AuthKeyData {
  authkey?: string;
  authkeyVer?: number;
  signType?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function authKeyDataDeserializer(item: any): AuthKeyData {
  return {
    additionalProperties: serializeRecord(item, ["authkey", "authkey_ver", "sign_type"]),
    authkey: item["authkey"],
    authkeyVer: item["authkey_ver"],
    signType: item["sign_type"],
  };
}

/** model interface ReleaseData */
export interface ReleaseData {
  dialog?: string;
  dialogContent?: string;
  dialogContentEn?: string;
  dialogNum?: number;
  dialogPeriod?: number;
  dialogPeriodType?: number;
  dialogTitle?: string;
  dialogTitleEn?: string;
  hasUpdate?: boolean;
  hypGameIds?: any[];
  loopWay?: string;
  packageMd5?: string;
  packageName?: string;
  packageSize?: string;
  packageUrl?: string;
  packageVersion?: string;
  silent?: string;
  strategyId?: number;
  updateRecommendedIntensity?: string;
  updateType?: number;
  userDefined?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function releaseDataDeserializer(item: any): ReleaseData {
  return {
    additionalProperties: serializeRecord(item, [
      "dialog",
      "dialog_content",
      "dialog_content_en",
      "dialog_num",
      "dialog_period",
      "dialog_period_type",
      "dialog_title",
      "dialog_title_en",
      "has_update",
      "hyp_game_ids",
      "loop_way",
      "package_md5",
      "package_name",
      "package_size",
      "package_url",
      "package_version",
      "silent",
      "strategy_id",
      "update_recommended_intensity",
      "update_type",
      "user_defined",
    ]),
    dialog: item["dialog"],
    dialogContent: item["dialog_content"],
    dialogContentEn: item["dialog_content_en"],
    dialogNum: item["dialog_num"],
    dialogPeriod: item["dialog_period"],
    dialogPeriodType: item["dialog_period_type"],
    dialogTitle: item["dialog_title"],
    dialogTitleEn: item["dialog_title_en"],
    hasUpdate: item["has_update"],
    hypGameIds: !item["hyp_game_ids"]
      ? item["hyp_game_ids"]
      : item["hyp_game_ids"].map((p: any) => {
          return p;
        }),
    loopWay: item["loop_way"],
    packageMd5: item["package_md5"],
    packageName: item["package_name"],
    packageSize: item["package_size"],
    packageUrl: item["package_url"],
    packageVersion: item["package_version"],
    silent: item["silent"],
    strategyId: item["strategy_id"],
    updateRecommendedIntensity: item["update_recommended_intensity"],
    updateType: item["update_type"],
    userDefined: item["user_defined"],
  };
}
