// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface GenshinGameRecordCardData */
export interface GenshinGameRecordCardData {
  list?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinGameRecordCardDataDeserializer(item: any): GenshinGameRecordCardData {
  return {
    additionalProperties: serializeRecord(item, ["list"]),
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}
