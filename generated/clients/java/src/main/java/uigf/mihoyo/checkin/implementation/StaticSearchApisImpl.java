package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.HeaderParam;
import io.clientcore.core.http.annotations.HostParam;
import io.clientcore.core.http.annotations.HttpRequestInformation;
import io.clientcore.core.http.annotations.QueryParam;
import io.clientcore.core.http.annotations.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;
import java.lang.reflect.InvocationTargetException;
import uigf.mihoyo.ApiResponseStaticPreKeywordData;

/**
 * An instance of this class provides access to all the operations defined in StaticSearchApis.
 */
public final class StaticSearchApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final StaticSearchApisService service;

    /**
     * The service client containing this operation class.
     */
    private final StaticClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of StaticSearchApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    StaticSearchApisImpl(StaticClientImpl client) {
        this.service = StaticSearchApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for StaticClientStaticSearchApis to be used by the proxy service to
     * perform REST calls.
     */
    @ServiceInterface(name = "StaticClientStaticSearchApis", host = "{endpoint}")
    public interface StaticSearchApisService {
        static StaticSearchApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.StaticSearchApisServiceImpl");
                return (StaticSearchApisService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/search/api/search/pre_keyword",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseStaticPreKeywordData> getPreKeyword(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("game_id") int gameId,
            @HeaderParam("Accept") String accept, RequestContext requestContext);
    }

    /**
     * The getPreKeyword operation.
     * 
     * @param gameId The gameId parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseStaticPreKeywordData> getPreKeywordWithResponse(int gameId, String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Static.StaticSearchApi.getPreKeyword",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getPreKeyword(this.client.getEndpoint(), cookie, ds, gameId, accept, updatedContext);
            });
    }
}
