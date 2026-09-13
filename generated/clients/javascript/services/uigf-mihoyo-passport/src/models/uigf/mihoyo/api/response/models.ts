// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface LoginCaptchaData */
export interface LoginCaptchaData {
  actionType?: string;
  countdown?: number;
  sentNew?: boolean;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function loginCaptchaDataDeserializer(item: any): LoginCaptchaData {
  return {
    additionalProperties: serializeRecord(item, ["action_type", "countdown", "sent_new"]),
    actionType: item["action_type"],
    countdown: item["countdown"],
    sentNew: item["sent_new"],
  };
}
