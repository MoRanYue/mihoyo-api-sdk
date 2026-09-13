// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoUtilityDeviceClient } from "./mihoyoUtilityDeviceClient.js";
export type {
  ApiResponseDeviceExtensionList,
  ApiResponseDeviceFingerprint,
} from "./models/uigf/mihoyo/index.js";
export type {
  DeviceFingerprintRequest,
  DeviceFingerprint,
} from "./models/uigf/mihoyo/game/index.js";
export type { DeviceExtensionList } from "./models/uigf/mihoyo/utility/device/index.js";
export type { MihoyoUtilityDeviceClientOptionalParams } from "./api/index.js";
export type {
  FingerprintApiGetFingerprintOptionalParams,
  FingerprintApiGetExtensionListOptionalParams,
} from "./api/fingerprintApi/index.js";
export type { FingerprintApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
