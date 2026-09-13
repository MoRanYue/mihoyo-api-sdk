// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoMiYouSheMobileContext,
  MihoyoMiYouSheMobileClientOptionalParams,
  createMihoyoMiYouSheMobile,
} from "./api/index.js";
import {
  MobileApiHubOperations,
  _getMobileApiHubOperations,
} from "./classic/mobileApiHub/index.js";
import {
  MobileChatApiOperations,
  _getMobileChatApiOperations,
} from "./classic/mobileChatApi/index.js";
import {
  MobileForumApiOperations,
  _getMobileForumApiOperations,
} from "./classic/mobileForumApi/index.js";
import {
  MobileMiscApiOperations,
  _getMobileMiscApiOperations,
} from "./classic/mobileMiscApi/index.js";
import {
  MobilePainterApiOperations,
  _getMobilePainterApiOperations,
} from "./classic/mobilePainterApi/index.js";
import {
  MobilePostApiOperations,
  _getMobilePostApiOperations,
} from "./classic/mobilePostApi/index.js";
import {
  MobilePreloadApiOperations,
  _getMobilePreloadApiOperations,
} from "./classic/mobilePreloadApi/index.js";
import {
  MobileReceptionApiOperations,
  _getMobileReceptionApiOperations,
} from "./classic/mobileReceptionApi/index.js";
import {
  MobileTeenagerApiOperations,
  _getMobileTeenagerApiOperations,
} from "./classic/mobileTeenagerApi/index.js";
import {
  MobileTimelineApiOperations,
  _getMobileTimelineApiOperations,
} from "./classic/mobileTimelineApi/index.js";
import {
  MobileUserApiOperations,
  _getMobileUserApiOperations,
} from "./classic/mobileUserApi/index.js";
import {
  MobileUserInstantApiOperations,
  _getMobileUserInstantApiOperations,
} from "./classic/mobileUserInstantApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoMiYouSheMobileClientOptionalParams } from "./api/mihoyoMiYouSheMobileContext.js";

export class MihoyoMiYouSheMobileClient {
  private _client: MihoyoMiYouSheMobileContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoMiYouSheMobileClientOptionalParams = {}) {
    this._client = createMihoyoMiYouSheMobile(options);
    this.pipeline = this._client.pipeline;
    this.mobilePreloadApi = _getMobilePreloadApiOperations(this._client);
    this.mobileUserInstantApi = _getMobileUserInstantApiOperations(this._client);
    this.mobileUserApi = _getMobileUserApiOperations(this._client);
    this.mobileTimelineApi = _getMobileTimelineApiOperations(this._client);
    this.mobileTeenagerApi = _getMobileTeenagerApiOperations(this._client);
    this.mobileReceptionApi = _getMobileReceptionApiOperations(this._client);
    this.mobilePostApi = _getMobilePostApiOperations(this._client);
    this.mobilePainterApi = _getMobilePainterApiOperations(this._client);
    this.mobileMiscApi = _getMobileMiscApiOperations(this._client);
    this.mobileForumApi = _getMobileForumApiOperations(this._client);
    this.mobileChatApi = _getMobileChatApiOperations(this._client);
    this.mobileApiHub = _getMobileApiHubOperations(this._client);
  }

  /** The operation groups for mobilePreloadApi */
  public readonly mobilePreloadApi: MobilePreloadApiOperations;
  /** The operation groups for mobileUserInstantApi */
  public readonly mobileUserInstantApi: MobileUserInstantApiOperations;
  /** The operation groups for mobileUserApi */
  public readonly mobileUserApi: MobileUserApiOperations;
  /** The operation groups for mobileTimelineApi */
  public readonly mobileTimelineApi: MobileTimelineApiOperations;
  /** The operation groups for mobileTeenagerApi */
  public readonly mobileTeenagerApi: MobileTeenagerApiOperations;
  /** The operation groups for mobileReceptionApi */
  public readonly mobileReceptionApi: MobileReceptionApiOperations;
  /** The operation groups for mobilePostApi */
  public readonly mobilePostApi: MobilePostApiOperations;
  /** The operation groups for mobilePainterApi */
  public readonly mobilePainterApi: MobilePainterApiOperations;
  /** The operation groups for mobileMiscApi */
  public readonly mobileMiscApi: MobileMiscApiOperations;
  /** The operation groups for mobileForumApi */
  public readonly mobileForumApi: MobileForumApiOperations;
  /** The operation groups for mobileChatApi */
  public readonly mobileChatApi: MobileChatApiOperations;
  /** The operation groups for mobileApiHub */
  public readonly mobileApiHub: MobileApiHubOperations;
}
