package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;

/**
 * Initializes a new instance of the H5MinorClient type.
 */
public final class H5MinorClientImpl {
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
     * The H5MinorBatchApisImpl object to access its operations.
     */
    private final H5MinorBatchApisImpl h5MinorBatchApis;

    /**
     * Gets the H5MinorBatchApisImpl object to access its operations.
     * 
     * @return the H5MinorBatchApisImpl object.
     */
    public H5MinorBatchApisImpl getH5MinorBatchApis() {
        return this.h5MinorBatchApis;
    }

    /**
     * Initializes an instance of H5MinorClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param instrumentation The instance of instrumentation to report telemetry.
     * @param endpoint Service host.
     */
    public H5MinorClientImpl(HttpPipeline httpPipeline, Instrumentation instrumentation, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.instrumentation = instrumentation;
        this.endpoint = endpoint;
        this.h5MinorBatchApis = new H5MinorBatchApisImpl(this);
    }
}
