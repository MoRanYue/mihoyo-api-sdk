package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;

/**
 * Initializes a new instance of the StaticClient type.
 */
public final class StaticClientImpl {
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
     * The StaticApiHubsImpl object to access its operations.
     */
    private final StaticApiHubsImpl staticApiHubs;

    /**
     * Gets the StaticApiHubsImpl object to access its operations.
     * 
     * @return the StaticApiHubsImpl object.
     */
    public StaticApiHubsImpl getStaticApiHubs() {
        return this.staticApiHubs;
    }

    /**
     * The StaticMiscApisImpl object to access its operations.
     */
    private final StaticMiscApisImpl staticMiscApis;

    /**
     * Gets the StaticMiscApisImpl object to access its operations.
     * 
     * @return the StaticMiscApisImpl object.
     */
    public StaticMiscApisImpl getStaticMiscApis() {
        return this.staticMiscApis;
    }

    /**
     * The StaticPreloadApisImpl object to access its operations.
     */
    private final StaticPreloadApisImpl staticPreloadApis;

    /**
     * Gets the StaticPreloadApisImpl object to access its operations.
     * 
     * @return the StaticPreloadApisImpl object.
     */
    public StaticPreloadApisImpl getStaticPreloadApis() {
        return this.staticPreloadApis;
    }

    /**
     * The StaticSearchApisImpl object to access its operations.
     */
    private final StaticSearchApisImpl staticSearchApis;

    /**
     * Gets the StaticSearchApisImpl object to access its operations.
     * 
     * @return the StaticSearchApisImpl object.
     */
    public StaticSearchApisImpl getStaticSearchApis() {
        return this.staticSearchApis;
    }

    /**
     * Initializes an instance of StaticClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param instrumentation The instance of instrumentation to report telemetry.
     * @param endpoint Service host.
     */
    public StaticClientImpl(HttpPipeline httpPipeline, Instrumentation instrumentation, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.instrumentation = instrumentation;
        this.endpoint = endpoint;
        this.staticApiHubs = new StaticApiHubsImpl(this);
        this.staticMiscApis = new StaticMiscApisImpl(this);
        this.staticPreloadApis = new StaticPreloadApisImpl(this);
        this.staticSearchApis = new StaticSearchApisImpl(this);
    }
}
