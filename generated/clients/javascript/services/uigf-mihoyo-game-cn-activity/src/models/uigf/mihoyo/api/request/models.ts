// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface ZenlessFeedbackCollectionRequest */
export interface ZenlessFeedbackCollectionRequest {
  region: string;
  scheduleId: string;
  score: number;
  source: number;
  toolType: number;
  uid: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessFeedbackCollectionRequestSerializer(
  item: ZenlessFeedbackCollectionRequest,
): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    region: item["region"],
    schedule_id: item["scheduleId"],
    score: item["score"],
    source: item["source"],
    tool_type: item["toolType"],
    uid: item["uid"],
  };
}
