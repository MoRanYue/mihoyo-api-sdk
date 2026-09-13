// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../static-helpers/serialization/serialize-record.js";
import { ApiResponseArray } from "../models.js";

/** model interface ExperimentListRequest */
export interface ExperimentListRequest {
  appId: string | number;
  appSign: string;
  experimentId?: string;
  params: ExperimentParameter[];
  sceneId?: string;
  uid: string;
}

export function experimentListRequestSerializer(item: ExperimentListRequest): any {
  return {
    app_id: _experimentListRequestAppIdSerializer(item["appId"]),
    app_sign: item["appSign"],
    experiment_id: item["experimentId"],
    params: experimentParameterArraySerializer(item["params"]),
    scene_id: item["sceneId"],
    uid: item["uid"],
  };
}

/** Alias for _ExperimentListRequestAppId */
export type _ExperimentListRequestAppId = string | number;

export function _experimentListRequestAppIdSerializer(item: _ExperimentListRequestAppId): any {
  return item;
}

export function experimentParameterArraySerializer(result: Array<ExperimentParameter>): any[] {
  return result.map((item) => {
    return experimentParameterSerializer(item);
  });
}

/** model interface ExperimentParameter */
export interface ExperimentParameter {
  k: string;
  v: string;
}

export function experimentParameterSerializer(item: ExperimentParameter): any {
  return { k: item["k"], v: item["v"] };
}

/** model interface ExperimentListResponse */
export interface ExperimentListResponse extends ApiResponseArray {
  success?: boolean;
}

export function experimentListResponseDeserializer(item: any): ExperimentListResponse {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: experimentAssignmentArrayDeserializer(item["data"]),
    success: item["success"],
  };
}

export function experimentAssignmentArrayDeserializer(result: Array<ExperimentAssignment>): any[] {
  return result.map((item) => {
    return experimentAssignmentDeserializer(item);
  });
}

/** model interface ExperimentAssignment */
export interface ExperimentAssignment {
  code?: number;
  configId?: string;
  configs?: Record<string, any>;
  experimentWhiteList?: boolean;
  periodId?: string;
  sceneWhiteList?: boolean;
  type?: number;
  version?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function experimentAssignmentDeserializer(item: any): ExperimentAssignment {
  return {
    additionalProperties: serializeRecord(item, [
      "code",
      "config_id",
      "configs",
      "experimentWhiteList",
      "period_id",
      "sceneWhiteList",
      "type",
      "version",
    ]),
    code: item["code"],
    configId: item["config_id"],
    configs: !item["configs"]
      ? item["configs"]
      : Object.fromEntries(Object.entries(item["configs"]).map(([k, p]: [string, any]) => [k, p])),
    experimentWhiteList: item["experimentWhiteList"],
    periodId: item["period_id"],
    sceneWhiteList: item["sceneWhiteList"],
    type: item["type"],
    version: item["version"],
  };
}
