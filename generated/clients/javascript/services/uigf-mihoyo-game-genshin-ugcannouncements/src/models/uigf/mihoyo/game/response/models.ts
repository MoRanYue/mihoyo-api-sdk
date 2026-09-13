// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** Genshin announcement alert state shared by regular and UGC announcements. */
export interface AnnouncementAlertData {
  alert?: boolean;
  alertId?: number;
  extraRemind?: boolean;
  remind?: boolean;
  remindText?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function announcementAlertDataDeserializer(item: any): AnnouncementAlertData {
  return {
    additionalProperties: serializeRecord(item, [
      "alert",
      "alert_id",
      "extra_remind",
      "remind",
      "remind_text",
    ]),
    alert: item["alert"],
    alertId: item["alert_id"],
    extraRemind: item["extra_remind"],
    remind: item["remind"],
    remindText: item["remind_text"],
  };
}
