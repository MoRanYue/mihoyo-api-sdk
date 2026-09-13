# API contract scope

This repository defines HTTP routes, methods, parameters, request and response
schemas, and required authentication headers for the supported API surfaces.

The following intentionally remain outside the SDK:

- dynamic-secret salts and vendor/private signing keys;
- saved cookies, account tokens, device fingerprints, CAPTCHA solutions, and payment data;
- implementation that fabricates client telemetry or bypasses official authentication,
  CAPTCHA, purchase, or rate-limit controls.

Generated clients should accept these values from a legitimate caller and expose the
headers documented by each operation.

The `runtime/ds.ts` Node.js module implements only the documented, reusable V1/V2
DS payload construction and MD5 digest process. Its salt is a required call-time
parameter; it does not contain a salt registry or credential-retrieval workflow.

`@UIGF.Mihoyo.Security.requiresDs("v1" | "v2")` is a custom TypeSpec decorator. The
local `@uigf/typespec-ds` emitter resolves it to DS operation metadata, and the
OpenAPI post-processor turns that metadata into `x-uigf-ds`. This keeps signing
selection attached to the TypeSpec operation instead of relying on a hand-maintained
SDK-side endpoint list.
