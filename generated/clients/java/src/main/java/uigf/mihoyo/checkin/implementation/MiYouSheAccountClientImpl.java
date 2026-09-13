package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;

/**
 * Initializes a new instance of the MiYouSheAccountClient type.
 */
public final class MiYouSheAccountClientImpl {
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
     * The MiYouSheBindingApisImpl object to access its operations.
     */
    private final MiYouSheBindingApisImpl miYouSheBindingApis;

    /**
     * Gets the MiYouSheBindingApisImpl object to access its operations.
     * 
     * @return the MiYouSheBindingApisImpl object.
     */
    public MiYouSheBindingApisImpl getMiYouSheBindingApis() {
        return this.miYouSheBindingApis;
    }

    /**
     * The AuthKeyApisImpl object to access its operations.
     */
    private final AuthKeyApisImpl authKeyApis;

    /**
     * Gets the AuthKeyApisImpl object to access its operations.
     * 
     * @return the AuthKeyApisImpl object.
     */
    public AuthKeyApisImpl getAuthKeyApis() {
        return this.authKeyApis;
    }

    /**
     * The ReleaseApisImpl object to access its operations.
     */
    private final ReleaseApisImpl releaseApis;

    /**
     * Gets the ReleaseApisImpl object to access its operations.
     * 
     * @return the ReleaseApisImpl object.
     */
    public ReleaseApisImpl getReleaseApis() {
        return this.releaseApis;
    }

    /**
     * Initializes an instance of MiYouSheAccountClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param instrumentation The instance of instrumentation to report telemetry.
     * @param endpoint Service host.
     */
    public MiYouSheAccountClientImpl(HttpPipeline httpPipeline, Instrumentation instrumentation, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.instrumentation = instrumentation;
        this.endpoint = endpoint;
        this.miYouSheBindingApis = new MiYouSheBindingApisImpl(this);
        this.authKeyApis = new AuthKeyApisImpl(this);
        this.releaseApis = new ReleaseApisImpl(this);
    }
}
