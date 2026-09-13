// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { OperationOptions } from "@azure-rest/core-client";

/** Optional parameters. */
export interface LedgerApiGetMonthDetailOptionalParams extends OperationOptions {
  ds?: string;
  limit?: number;
}

/** Optional parameters. */
export interface LedgerApiGetMonthInfoOptionalParams extends OperationOptions {
  ds?: string;
  month?: number;
}
