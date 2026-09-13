// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinDispatchGateContext,
  MihoyoGameGenshinDispatchGateClientOptionalParams,
  createMihoyoGameGenshinDispatchGate,
} from "./api/index.js";
import { GateApiOperations, _getGateApiOperations } from "./classic/gateApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinDispatchGateClientOptionalParams } from "./api/mihoyoGameGenshinDispatchGateContext.js";

export class MihoyoGameGenshinDispatchGateClient {
  private _client: MihoyoGameGenshinDispatchGateContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinDispatchGateClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinDispatchGate(options);
    this.pipeline = this._client.pipeline;
    this.gateApi = _getGateApiOperations(this._client);
  }

  /** The operation groups for gateApi */
  public readonly gateApi: GateApiOperations;
}
