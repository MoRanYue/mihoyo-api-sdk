// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { OperationOptions } from "@azure-rest/core-client";

/** Optional parameters. */
export interface ApiHubSetPostVoteOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface ApiHubSignInOptionalParams extends OperationOptions {
  ds?: string;
  challenge?: string;
}

/** Optional parameters. */
export interface ApiHubGetHomeOptionalParams extends OperationOptions {
  cpu?: string;
  device?: string;
  exposedResourceTickets?: string;
  isTriggeredByResource?: boolean;
  parts?: string;
  version?: string;
}

/** Optional parameters. */
export interface ApiHubGetVoteResultsOptionalParams extends OperationOptions {}

/** Optional parameters. */
export interface ApiHubGetVotesOptionalParams extends OperationOptions {}

/** Optional parameters. */
export interface ApiHubGetMissionStateOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface ApiHubGetShareConfigOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface ApiHubGetMissionsOptionalParams extends OperationOptions {
  ds?: string;
}

/** Optional parameters. */
export interface ApiHubGetGameListOptionalParams extends OperationOptions {}

/** Optional parameters. */
export interface ApiHubGetAppConfigOptionalParams extends OperationOptions {
  gid?: string;
}

/** Optional parameters. */
export interface ApiHubGetAllGamesForumsOptionalParams extends OperationOptions {}
