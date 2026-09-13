// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinLoginContext,
  MihoyoGameGenshinLoginClientOptionalParams,
  createMihoyoGameGenshinLogin,
} from "./api/index.js";
import { GranterApiOperations, _getGranterApiOperations } from "./classic/granterApi/index.js";
import { PandaQrApiOperations, _getPandaQrApiOperations } from "./classic/pandaQrApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinLoginClientOptionalParams } from "./api/mihoyoGameGenshinLoginContext.js";

export class MihoyoGameGenshinLoginClient {
  private _client: MihoyoGameGenshinLoginContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinLoginClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinLogin(options);
    this.pipeline = this._client.pipeline;
    this.granterApi = _getGranterApiOperations(this._client);
    this.pandaQrApi = _getPandaQrApiOperations(this._client);
  }

  /** The operation groups for granterApi */
  public readonly granterApi: GranterApiOperations;
  /** The operation groups for pandaQrApi */
  public readonly pandaQrApi: PandaQrApiOperations;
}
