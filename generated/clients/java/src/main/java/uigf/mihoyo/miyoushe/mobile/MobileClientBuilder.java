package uigf.mihoyo.miyoushe.mobile;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ServiceClientBuilder;
import io.clientcore.core.http.client.HttpClient;
import io.clientcore.core.http.models.ProxyOptions;
import io.clientcore.core.http.pipeline.HttpInstrumentationOptions;
import io.clientcore.core.http.pipeline.HttpInstrumentationPolicy;
import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.http.pipeline.HttpPipelineBuilder;
import io.clientcore.core.http.pipeline.HttpPipelinePolicy;
import io.clientcore.core.http.pipeline.HttpRedirectOptions;
import io.clientcore.core.http.pipeline.HttpRedirectPolicy;
import io.clientcore.core.http.pipeline.HttpRetryOptions;
import io.clientcore.core.http.pipeline.HttpRetryPolicy;
import io.clientcore.core.instrumentation.Instrumentation;
import io.clientcore.core.instrumentation.SdkInstrumentationOptions;
import io.clientcore.core.traits.ConfigurationTrait;
import io.clientcore.core.traits.EndpointTrait;
import io.clientcore.core.traits.HttpTrait;
import io.clientcore.core.traits.ProxyTrait;
import io.clientcore.core.utils.CoreUtils;
import io.clientcore.core.utils.configuration.Configuration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import uigf.mihoyo.checkin.implementation.MobileClientImpl;

/**
 * A builder for creating a new instance of the MobileClient type.
 */
@ServiceClientBuilder(
    serviceClients = {
        MobileApiHubClient.class,
        MobileChatApiClient.class,
        MobileForumApiClient.class,
        MobileMiscApiClient.class,
        MobilePainterApiClient.class,
        MobilePostApiClient.class,
        MobileReceptionApiClient.class,
        MobileTeenagerApiClient.class,
        MobileTimelineApiClient.class,
        MobileUserApiClient.class,
        MobileUserInstantApiClient.class,
        MobilePreloadApiClient.class })
public final class MobileClientBuilder implements HttpTrait<MobileClientBuilder>, ProxyTrait<MobileClientBuilder>,
    ConfigurationTrait<MobileClientBuilder>, EndpointTrait<MobileClientBuilder> {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private static final String SDK_NAME = "name";

    @Metadata(properties = { MetadataProperties.GENERATED })
    private static final String SDK_VERSION = "version";

    @Metadata(properties = { MetadataProperties.GENERATED })
    private static final Map<String, String> PROPERTIES = CoreUtils.getProperties("uigf-mihoyo-checkin.properties");

    @Metadata(properties = { MetadataProperties.GENERATED })
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Create an instance of the MobileClientBuilder.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP client used to send the request.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private HttpClient httpClient;

    /**
     * {@inheritDoc}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public MobileClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The retry options to configure retry policy for failed requests.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private HttpRetryOptions retryOptions;

    /**
     * {@inheritDoc}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public MobileClientBuilder httpRetryOptions(HttpRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * {@inheritDoc}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public MobileClientBuilder addHttpPipelinePolicy(HttpPipelinePolicy customPolicy) {
        Objects.requireNonNull(customPolicy, "'customPolicy' cannot be null.");
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /*
     * The redirect options to configure redirect policy
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private HttpRedirectOptions redirectOptions;

    /**
     * {@inheritDoc}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public MobileClientBuilder httpRedirectOptions(HttpRedirectOptions redirectOptions) {
        this.redirectOptions = redirectOptions;
        return this;
    }

    /*
     * The instrumentation configuration for HTTP requests and responses.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private HttpInstrumentationOptions httpInstrumentationOptions;

    /**
     * {@inheritDoc}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public MobileClientBuilder httpInstrumentationOptions(HttpInstrumentationOptions httpInstrumentationOptions) {
        this.httpInstrumentationOptions = httpInstrumentationOptions;
        return this;
    }

    /*
     * The proxy options used during construction of the service client.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ProxyOptions proxyOptions;

    /**
     * {@inheritDoc}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public MobileClientBuilder proxyOptions(ProxyOptions proxyOptions) {
        this.proxyOptions = proxyOptions;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service client.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Configuration configuration;

    /**
     * {@inheritDoc}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public MobileClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The service endpoint
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String endpoint;

    /**
     * {@inheritDoc}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public MobileClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Builds an instance of MobileClientImpl with the provided parameters.
     * 
     * @return an instance of MobileClientImpl.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileClientImpl buildInnerClient() {
        this.validateClient();
        String localEndpoint = (endpoint != null) ? endpoint : "https://passport-api.mihoyo.com";
        HttpInstrumentationOptions localHttpInstrumentationOptions = this.httpInstrumentationOptions == null
            ? new HttpInstrumentationOptions()
            : this.httpInstrumentationOptions;
        SdkInstrumentationOptions sdkInstrumentationOptions
            = new SdkInstrumentationOptions(PROPERTIES.getOrDefault(SDK_NAME, "UnknownName"))
                .setSdkVersion(PROPERTIES.get(SDK_VERSION))
                .setEndpoint(localEndpoint);
        Instrumentation instrumentation
            = Instrumentation.create(localHttpInstrumentationOptions, sdkInstrumentationOptions);
        MobileClientImpl client = new MobileClientImpl(createHttpPipeline(), instrumentation, localEndpoint);
        return client;
    }

    @Metadata(properties = { MetadataProperties.GENERATED })
    private void validateClient() {
        // This method is invoked from 'buildInnerClient'/'buildClient' method.
        // Developer can customize this method, to validate that the necessary conditions are met for the new client.
    }

    @Metadata(properties = { MetadataProperties.GENERATED })
    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration
            = (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        HttpInstrumentationOptions localHttpInstrumentationOptions = this.httpInstrumentationOptions == null
            ? new HttpInstrumentationOptions()
            : this.httpInstrumentationOptions;
        HttpPipelineBuilder httpPipelineBuilder = new HttpPipelineBuilder();
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        policies.add(redirectOptions == null ? new HttpRedirectPolicy() : new HttpRedirectPolicy(redirectOptions));
        policies.add(retryOptions == null ? new HttpRetryPolicy() : new HttpRetryPolicy(retryOptions));
        this.pipelinePolicies.stream().forEach(p -> policies.add(p));
        policies.add(new HttpInstrumentationPolicy(localHttpInstrumentationOptions));
        policies.forEach(httpPipelineBuilder::addPolicy);
        return httpPipelineBuilder.httpClient(httpClient).build();
    }

    /**
     * Builds an instance of MobileApiHubClient class.
     * 
     * @return an instance of MobileApiHubClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileApiHubClient buildMobileApiHubClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobileApiHubClient(innerClient.getMobileApiHubs(), innerClient.getInstrumentation());
    }

    /**
     * Builds an instance of MobileChatApiClient class.
     * 
     * @return an instance of MobileChatApiClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileChatApiClient buildMobileChatApiClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobileChatApiClient(innerClient.getMobileChatApis(), innerClient.getInstrumentation());
    }

    /**
     * Builds an instance of MobileForumApiClient class.
     * 
     * @return an instance of MobileForumApiClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileForumApiClient buildMobileForumApiClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobileForumApiClient(innerClient.getMobileForumApis(), innerClient.getInstrumentation());
    }

    /**
     * Builds an instance of MobileMiscApiClient class.
     * 
     * @return an instance of MobileMiscApiClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileMiscApiClient buildMobileMiscApiClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobileMiscApiClient(innerClient.getMobileMiscApis(), innerClient.getInstrumentation());
    }

    /**
     * Builds an instance of MobilePainterApiClient class.
     * 
     * @return an instance of MobilePainterApiClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobilePainterApiClient buildMobilePainterApiClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobilePainterApiClient(innerClient.getMobilePainterApis(), innerClient.getInstrumentation());
    }

    /**
     * Builds an instance of MobilePostApiClient class.
     * 
     * @return an instance of MobilePostApiClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobilePostApiClient buildMobilePostApiClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobilePostApiClient(innerClient.getMobilePostApis(), innerClient.getInstrumentation());
    }

    /**
     * Builds an instance of MobileReceptionApiClient class.
     * 
     * @return an instance of MobileReceptionApiClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileReceptionApiClient buildMobileReceptionApiClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobileReceptionApiClient(innerClient.getMobileReceptionApis(), innerClient.getInstrumentation());
    }

    /**
     * Builds an instance of MobileTeenagerApiClient class.
     * 
     * @return an instance of MobileTeenagerApiClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileTeenagerApiClient buildMobileTeenagerApiClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobileTeenagerApiClient(innerClient.getMobileTeenagerApis(), innerClient.getInstrumentation());
    }

    /**
     * Builds an instance of MobileTimelineApiClient class.
     * 
     * @return an instance of MobileTimelineApiClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileTimelineApiClient buildMobileTimelineApiClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobileTimelineApiClient(innerClient.getMobileTimelineApis(), innerClient.getInstrumentation());
    }

    /**
     * Builds an instance of MobileUserApiClient class.
     * 
     * @return an instance of MobileUserApiClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileUserApiClient buildMobileUserApiClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobileUserApiClient(innerClient.getMobileUserApis(), innerClient.getInstrumentation());
    }

    /**
     * Builds an instance of MobileUserInstantApiClient class.
     * 
     * @return an instance of MobileUserInstantApiClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileUserInstantApiClient buildMobileUserInstantApiClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobileUserInstantApiClient(innerClient.getMobileUserInstantApis(), innerClient.getInstrumentation());
    }

    /**
     * Builds an instance of MobilePreloadApiClient class.
     * 
     * @return an instance of MobilePreloadApiClient.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobilePreloadApiClient buildMobilePreloadApiClient() {
        MobileClientImpl innerClient = buildInnerClient();
        return new MobilePreloadApiClient(innerClient.getMobilePreloadApis(), innerClient.getInstrumentation());
    }
}
