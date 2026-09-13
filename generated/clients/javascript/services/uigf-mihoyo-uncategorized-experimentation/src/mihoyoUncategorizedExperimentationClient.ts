// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUncategorizedExperimentationContext,
  MihoyoUncategorizedExperimentationClientOptionalParams,
  createMihoyoUncategorizedExperimentation,
} from "./api/index.js";
import {
  ExperimentApiOperations,
  _getExperimentApiOperations,
} from "./classic/experimentApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUncategorizedExperimentationClientOptionalParams } from "./api/mihoyoUncategorizedExperimentationContext.js";

export class MihoyoUncategorizedExperimentationClient {
  private _client: MihoyoUncategorizedExperimentationContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUncategorizedExperimentationClientOptionalParams = {}) {
    this._client = createMihoyoUncategorizedExperimentation(options);
    this.pipeline = this._client.pipeline;
    this.experimentApi = _getExperimentApiOperations(this._client);
  }

  /** The operation groups for experimentApi */
  public readonly experimentApi: ExperimentApiOperations;
}
