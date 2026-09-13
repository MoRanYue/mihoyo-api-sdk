package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;

/**
 * Initializes a new instance of the ActivityClient type.
 */
public final class ActivityClientImpl {
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
     * The StrategyApisImpl object to access its operations.
     */
    private final StrategyApisImpl strategyApis;

    /**
     * Gets the StrategyApisImpl object to access its operations.
     * 
     * @return the StrategyApisImpl object.
     */
    public StrategyApisImpl getStrategyApis() {
        return this.strategyApis;
    }

    /**
     * The ZenlessFeedbackApisImpl object to access its operations.
     */
    private final ZenlessFeedbackApisImpl zenlessFeedbackApis;

    /**
     * Gets the ZenlessFeedbackApisImpl object to access its operations.
     * 
     * @return the ZenlessFeedbackApisImpl object.
     */
    public ZenlessFeedbackApisImpl getZenlessFeedbackApis() {
        return this.zenlessFeedbackApis;
    }

    /**
     * Initializes an instance of ActivityClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param instrumentation The instance of instrumentation to report telemetry.
     * @param endpoint Service host.
     */
    public ActivityClientImpl(HttpPipeline httpPipeline, Instrumentation instrumentation, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.instrumentation = instrumentation;
        this.endpoint = endpoint;
        this.strategyApis = new StrategyApisImpl(this);
        this.zenlessFeedbackApis = new ZenlessFeedbackApisImpl(this);
    }
}
