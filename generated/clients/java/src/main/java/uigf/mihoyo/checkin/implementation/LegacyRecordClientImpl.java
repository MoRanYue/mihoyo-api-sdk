package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;

/**
 * Initializes a new instance of the LegacyRecordClient type.
 */
public final class LegacyRecordClientImpl {
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
     * The LegacyCardApisImpl object to access its operations.
     */
    private final LegacyCardApisImpl legacyCardApis;

    /**
     * Gets the LegacyCardApisImpl object to access its operations.
     * 
     * @return the LegacyCardApisImpl object.
     */
    public LegacyCardApisImpl getLegacyCardApis() {
        return this.legacyCardApis;
    }

    /**
     * The WebCardApisImpl object to access its operations.
     */
    private final WebCardApisImpl webCardApis;

    /**
     * Gets the WebCardApisImpl object to access its operations.
     * 
     * @return the WebCardApisImpl object.
     */
    public WebCardApisImpl getWebCardApis() {
        return this.webCardApis;
    }

    /**
     * Initializes an instance of LegacyRecordClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param instrumentation The instance of instrumentation to report telemetry.
     * @param endpoint Service host.
     */
    public LegacyRecordClientImpl(HttpPipeline httpPipeline, Instrumentation instrumentation, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.instrumentation = instrumentation;
        this.endpoint = endpoint;
        this.legacyCardApis = new LegacyCardApisImpl(this);
        this.webCardApis = new WebCardApisImpl(this);
    }
}
