// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../static-helpers/serialization/serialize-record.js";

/** model interface UgcTokenInfo */
export interface UgcTokenInfo {
  expire?: string;
  level?: string;
  nickname?: string;
  region?: string;
  ugcToken?: string;
  uid?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function ugcTokenInfoDeserializer(item: any): UgcTokenInfo {
  return {
    additionalProperties: serializeRecord(item, [
      "expire",
      "level",
      "nickname",
      "region",
      "ugc_token",
      "uid",
    ]),
    expire: item["expire"],
    level: item["level"],
    nickname: item["nickname"],
    region: item["region"],
    ugcToken: item["ugc_token"],
    uid: item["uid"],
  };
}
