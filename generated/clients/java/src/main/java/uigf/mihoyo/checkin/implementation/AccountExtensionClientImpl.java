package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;

/**
 * Initializes a new instance of the AccountExtensionClient type.
 */
public final class AccountExtensionClientImpl {
    /**
     * Service host.
     */
    private final String endpoint;

    /**
     * Gets Service host.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Gets The instance of instrumentation to report telemetry.
     * 
     * @return the instrumentation value.
     */
    public Instrumentation getInstrumentation() {
        return this.instrumentation;
    }

    /**
     * The RedDotApisImpl object to access its operations.
     */
    private final RedDotApisImpl redDotApis;

    /**
     * Gets the RedDotApisImpl object to access its operations.
     * 
     * @return the RedDotApisImpl object.
     */
    public RedDotApisImpl getRedDotApis() {
        return this.redDotApis;
    }

    /**
     * The PatchApisImpl object to access its operations.
     */
    private final PatchApisImpl patchApis;

    /**
     * Gets the PatchApisImpl object to access its operations.
     * 
     * @return the PatchApisImpl object.
     */
    public PatchApisImpl getPatchApis() {
        return this.patchApis;
    }

    /**
     * Initializes an instance of AccountExtensionClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param instrumentation The instance of instrumentation to report telemetry.
     * @param endpoint Service host.
     */
    public AccountExtensionClientImpl(HttpPipeline httpPipeline, Instrumentation instrumentation, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.instrumentation = instrumentation;
        this.endpoint = endpoint;
        this.redDotApis = new RedDotApisImpl(this);
        this.patchApis = new PatchApisImpl(this);
    }
}
