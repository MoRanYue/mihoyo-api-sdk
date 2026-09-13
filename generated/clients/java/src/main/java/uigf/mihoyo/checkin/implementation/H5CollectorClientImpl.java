package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;

/**
 * Initializes a new instance of the H5CollectorClient type.
 */
public final class H5CollectorClientImpl {
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
     * The H5CollectorUploadApisImpl object to access its operations.
     */
    private final H5CollectorUploadApisImpl h5CollectorUploadApis;

    /**
     * Gets the H5CollectorUploadApisImpl object to access its operations.
     * 
     * @return the H5CollectorUploadApisImpl object.
     */
    public H5CollectorUploadApisImpl getH5CollectorUploadApis() {
        return this.h5CollectorUploadApis;
    }

    /**
     * Initializes an instance of H5CollectorClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param instrumentation The instance of instrumentation to report telemetry.
     * @param endpoint Service host.
     */
    public H5CollectorClientImpl(HttpPipeline httpPipeline, Instrumentation instrumentation, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.instrumentation = instrumentation;
        this.endpoint = endpoint;
        this.h5CollectorUploadApis = new H5CollectorUploadApisImpl(this);
    }
}
