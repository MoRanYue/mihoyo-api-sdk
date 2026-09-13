package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;

/**
 * Initializes a new instance of the MobileClient type.
 */
public final class MobileClientImpl {
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
     * The MobileApiHubsImpl object to access its operations.
     */
    private final MobileApiHubsImpl mobileApiHubs;

    /**
     * Gets the MobileApiHubsImpl object to access its operations.
     * 
     * @return the MobileApiHubsImpl object.
     */
    public MobileApiHubsImpl getMobileApiHubs() {
        return this.mobileApiHubs;
    }

    /**
     * The MobileChatApisImpl object to access its operations.
     */
    private final MobileChatApisImpl mobileChatApis;

    /**
     * Gets the MobileChatApisImpl object to access its operations.
     * 
     * @return the MobileChatApisImpl object.
     */
    public MobileChatApisImpl getMobileChatApis() {
        return this.mobileChatApis;
    }

    /**
     * The MobileForumApisImpl object to access its operations.
     */
    private final MobileForumApisImpl mobileForumApis;

    /**
     * Gets the MobileForumApisImpl object to access its operations.
     * 
     * @return the MobileForumApisImpl object.
     */
    public MobileForumApisImpl getMobileForumApis() {
        return this.mobileForumApis;
    }

    /**
     * The MobileMiscApisImpl object to access its operations.
     */
    private final MobileMiscApisImpl mobileMiscApis;

    /**
     * Gets the MobileMiscApisImpl object to access its operations.
     * 
     * @return the MobileMiscApisImpl object.
     */
    public MobileMiscApisImpl getMobileMiscApis() {
        return this.mobileMiscApis;
    }

    /**
     * The MobilePainterApisImpl object to access its operations.
     */
    private final MobilePainterApisImpl mobilePainterApis;

    /**
     * Gets the MobilePainterApisImpl object to access its operations.
     * 
     * @return the MobilePainterApisImpl object.
     */
    public MobilePainterApisImpl getMobilePainterApis() {
        return this.mobilePainterApis;
    }

    /**
     * The MobilePostApisImpl object to access its operations.
     */
    private final MobilePostApisImpl mobilePostApis;

    /**
     * Gets the MobilePostApisImpl object to access its operations.
     * 
     * @return the MobilePostApisImpl object.
     */
    public MobilePostApisImpl getMobilePostApis() {
        return this.mobilePostApis;
    }

    /**
     * The MobileReceptionApisImpl object to access its operations.
     */
    private final MobileReceptionApisImpl mobileReceptionApis;

    /**
     * Gets the MobileReceptionApisImpl object to access its operations.
     * 
     * @return the MobileReceptionApisImpl object.
     */
    public MobileReceptionApisImpl getMobileReceptionApis() {
        return this.mobileReceptionApis;
    }

    /**
     * The MobileTeenagerApisImpl object to access its operations.
     */
    private final MobileTeenagerApisImpl mobileTeenagerApis;

    /**
     * Gets the MobileTeenagerApisImpl object to access its operations.
     * 
     * @return the MobileTeenagerApisImpl object.
     */
    public MobileTeenagerApisImpl getMobileTeenagerApis() {
        return this.mobileTeenagerApis;
    }

    /**
     * The MobileTimelineApisImpl object to access its operations.
     */
    private final MobileTimelineApisImpl mobileTimelineApis;

    /**
     * Gets the MobileTimelineApisImpl object to access its operations.
     * 
     * @return the MobileTimelineApisImpl object.
     */
    public MobileTimelineApisImpl getMobileTimelineApis() {
        return this.mobileTimelineApis;
    }

    /**
     * The MobileUserApisImpl object to access its operations.
     */
    private final MobileUserApisImpl mobileUserApis;

    /**
     * Gets the MobileUserApisImpl object to access its operations.
     * 
     * @return the MobileUserApisImpl object.
     */
    public MobileUserApisImpl getMobileUserApis() {
        return this.mobileUserApis;
    }

    /**
     * The MobileUserInstantApisImpl object to access its operations.
     */
    private final MobileUserInstantApisImpl mobileUserInstantApis;

    /**
     * Gets the MobileUserInstantApisImpl object to access its operations.
     * 
     * @return the MobileUserInstantApisImpl object.
     */
    public MobileUserInstantApisImpl getMobileUserInstantApis() {
        return this.mobileUserInstantApis;
    }

    /**
     * The MobilePreloadApisImpl object to access its operations.
     */
    private final MobilePreloadApisImpl mobilePreloadApis;

    /**
     * Gets the MobilePreloadApisImpl object to access its operations.
     * 
     * @return the MobilePreloadApisImpl object.
     */
    public MobilePreloadApisImpl getMobilePreloadApis() {
        return this.mobilePreloadApis;
    }

    /**
     * Initializes an instance of MobileClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param instrumentation The instance of instrumentation to report telemetry.
     * @param endpoint Service host.
     */
    public MobileClientImpl(HttpPipeline httpPipeline, Instrumentation instrumentation, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.instrumentation = instrumentation;
        this.endpoint = endpoint;
        this.mobileApiHubs = new MobileApiHubsImpl(this);
        this.mobileChatApis = new MobileChatApisImpl(this);
        this.mobileForumApis = new MobileForumApisImpl(this);
        this.mobileMiscApis = new MobileMiscApisImpl(this);
        this.mobilePainterApis = new MobilePainterApisImpl(this);
        this.mobilePostApis = new MobilePostApisImpl(this);
        this.mobileReceptionApis = new MobileReceptionApisImpl(this);
        this.mobileTeenagerApis = new MobileTeenagerApisImpl(this);
        this.mobileTimelineApis = new MobileTimelineApisImpl(this);
        this.mobileUserApis = new MobileUserApisImpl(this);
        this.mobileUserInstantApis = new MobileUserInstantApisImpl(this);
        this.mobilePreloadApis = new MobilePreloadApisImpl(this);
    }
}
