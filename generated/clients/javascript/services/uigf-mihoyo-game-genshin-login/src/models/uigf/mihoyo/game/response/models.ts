// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface GranterLoginData */
export interface GranterLoginData {
  accountType?: number;
  comboId?: string;
  comboToken?: string;
  data?: string;
  fatigueRemind?: GranterFatigueRemind;
  heartbeat?: boolean;
  openId?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function granterLoginDataDeserializer(item: any): GranterLoginData {
  return {
    additionalProperties: serializeRecord(item, [
      "account_type",
      "combo_id",
      "combo_token",
      "data",
      "fatigue_remind",
      "heartbeat",
      "open_id",
    ]),
    accountType: item["account_type"],
    comboId: item["combo_id"],
    comboToken: item["combo_token"],
    data: item["data"],
    fatigueRemind: !item["fatigue_remind"]
      ? item["fatigue_remind"]
      : granterFatigueRemindDeserializer(item["fatigue_remind"]),
    heartbeat: item["heartbeat"],
    openId: item["open_id"],
  };
}

/** model interface GranterFatigueRemind */
export interface GranterFatigueRemind {
  durations?: number[];
  nickname?: string;
  resetPoint?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function granterFatigueRemindDeserializer(item: any): GranterFatigueRemind {
  return {
    additionalProperties: serializeRecord(item, ["durations", "nickname", "reset_point"]),
    durations: !item["durations"]
      ? item["durations"]
      : item["durations"].map((p: any) => {
          return p;
        }),
    nickname: item["nickname"],
    resetPoint: item["reset_point"],
  };
}
