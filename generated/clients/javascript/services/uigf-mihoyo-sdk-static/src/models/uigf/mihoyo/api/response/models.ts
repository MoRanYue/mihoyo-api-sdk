// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface SdkPorteData */
export interface SdkPorteData {
  vals?: Record<string, string>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkPorteDataDeserializer(item: any): SdkPorteData {
  return {
    additionalProperties: serializeRecord(item, ["vals"]),
    vals: !item["vals"]
      ? item["vals"]
      : Object.fromEntries(Object.entries(item["vals"]).map(([k, p]: [string, any]) => [k, p])),
  };
}

/** model interface SdkFeCnConfigData */
export interface SdkFeCnConfigData {
  vals?: Record<string, string>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkFeCnConfigDataDeserializer(item: any): SdkFeCnConfigData {
  return {
    additionalProperties: serializeRecord(item, ["vals"]),
    vals: !item["vals"]
      ? item["vals"]
      : Object.fromEntries(Object.entries(item["vals"]).map(([k, p]: [string, any]) => [k, p])),
  };
}
