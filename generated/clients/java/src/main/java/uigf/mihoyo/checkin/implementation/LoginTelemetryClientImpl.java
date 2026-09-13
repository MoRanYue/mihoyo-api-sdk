package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;

/**
 * Initializes a new instance of the LoginTelemetryClient type.
 */
public final class LoginTelemetryClientImpl {
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
     * The LoginTelemetryUploadApisImpl object to access its operations.
     */
    private final LoginTelemetryUploadApisImpl loginTelemetryUploadApis;

    /**
     * Gets the LoginTelemetryUploadApisImpl object to access its operations.
     * 
     * @return the LoginTelemetryUploadApisImpl object.
     */
    public LoginTelemetryUploadApisImpl getLoginTelemetryUploadApis() {
        return this.loginTelemetryUploadApis;
    }

    /**
     * Initializes an instance of LoginTelemetryClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param instrumentation The instance of instrumentation to report telemetry.
     * @param endpoint Service host.
     */
    public LoginTelemetryClientImpl(HttpPipeline httpPipeline, Instrumentation instrumentation, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.instrumentation = instrumentation;
        this.endpoint = endpoint;
        this.loginTelemetryUploadApis = new LoginTelemetryUploadApisImpl(this);
    }
}
