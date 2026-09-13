// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { OperationOptions } from "@azure-rest/core-client";

/** Optional parameters. */
export interface ZenlessLedgerApiGetMonthDetailOptionalParams extends OperationOptions {
  pageSize?: number;
  uid?: string;
  region?: string;
  roleId?: string;
  server?: string;
  month?: string;
  lang?: string;
}

/** Optional parameters. */
export interface ZenlessLedgerApiGetMonthInfoOptionalParams extends OperationOptions {
  uid?: string;
  region?: string;
  roleId?: string;
  server?: string;
  month?: string;
  lang?: string;
}
