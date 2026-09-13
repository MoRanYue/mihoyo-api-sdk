// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { logger } from "../logger.js";
import pkgJson from "@uigf/mihoyo-client/package.json" with { type: "json" };
import { Client, ClientOptions, getClient } from "@azure-rest/core-client";

export interface MihoyoPassportV4Context extends Client {}

/** Optional parameters for the client. */
export interface MihoyoPassportV4ClientOptionalParams extends ClientOptions {}

export function createMihoyoPassportV4(
  options: MihoyoPassportV4ClientOptionalParams = {},
): MihoyoPassportV4Context {
  const endpointUrl = options.endpoint ?? "https://passport-api-v4.mihoyo.com";
  const prefixFromOptions = options?.userAgentOptions?.userAgentPrefix;
  const userAgentInfo = `azsdk-js-mihoyo-client/${pkgJson.version}`;
  const userAgentPrefix = prefixFromOptions
    ? `${prefixFromOptions} ${userAgentInfo}`
    : `${userAgentInfo}`;
  const { apiVersion: _, ...updatedOptions } = {
    ...options,
    userAgentOptions: { userAgentPrefix },
    loggingOptions: { logger: options.loggingOptions?.logger ?? logger.info },
  };
  const clientContext = getClient(endpointUrl, undefined, updatedOptions);

  if (options.apiVersion) {
    logger.warning(
      "This client does not support client api-version, please change it at the operation level",
    );
  }
  return clientContext;
}
