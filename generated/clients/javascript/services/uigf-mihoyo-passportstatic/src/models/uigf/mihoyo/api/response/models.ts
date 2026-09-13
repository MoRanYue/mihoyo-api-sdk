// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface PassportSwitchStatusData */
export interface PassportSwitchStatusData {
  enabled?: Record<string, any>;
  switchStatusMap?: Record<string, any>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function passportSwitchStatusDataDeserializer(item: any): PassportSwitchStatusData {
  return {
    additionalProperties: serializeRecord(item, ["enabled", "switch_status_map"]),
    enabled: !item["enabled"]
      ? item["enabled"]
      : Object.fromEntries(Object.entries(item["enabled"]).map(([k, p]: [string, any]) => [k, p])),
    switchStatusMap: !item["switch_status_map"]
      ? item["switch_status_map"]
      : Object.fromEntries(
          Object.entries(item["switch_status_map"]).map(([k, p]: [string, any]) => [k, p]),
        ),
  };
}
