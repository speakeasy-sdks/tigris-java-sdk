/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tigrisdata.tigris_core.utils.HTTPClient;
import com.tigrisdata.tigris_core.utils.HTTPRequest;
import com.tigrisdata.tigris_core.utils.JSON;
import com.tigrisdata.tigris_core.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

/**
 * The Observability section has APIs that provides full visibility into the health, metrics, and monitoring of the Server.
 */
public class System {
	
	private SDKConfiguration sdkConfiguration;

	public System(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Health Check
     * This endpoint can be used to check the liveness of the server.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.HealthAPIHealthResponse getHealth() throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/health");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.HealthAPIHealthResponse res = new com.tigrisdata.tigris_core.models.operations.HealthAPIHealthResponse(contentType, httpRes.statusCode(), httpRes) {{
            healthCheckResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.HealthCheckResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.HealthCheckResponse.class);
                res.healthCheckResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }

    /**
     * Information about the server
     * Provides the information about the server. This information includes returning the server version, etc.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.ObservabilityGetInfoResponse getServerInfo() throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/observability/info");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.ObservabilityGetInfoResponse res = new com.tigrisdata.tigris_core.models.operations.ObservabilityGetInfoResponse(contentType, httpRes.statusCode(), httpRes) {{
            getInfoResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.GetInfoResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.GetInfoResponse.class);
                res.getInfoResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }

    /**
     * Queries current namespace quota usage
     * Returns current namespace quota limits
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaUsageResponse observabilityQuotaUsage(com.tigrisdata.tigris_core.models.shared.QuotaUsageRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/observability/quota/usage");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaUsageResponse res = new com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaUsageResponse(contentType, httpRes.statusCode(), httpRes) {{
            quotaUsageResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.QuotaUsageResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.QuotaUsageResponse.class);
                res.quotaUsageResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }

    /**
     * Queries current namespace quota limits
     * Returns current namespace quota limits
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaLimitsResponse queryQuotaLimits(com.tigrisdata.tigris_core.models.shared.QuotaLimitsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/observability/quota/limits");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaLimitsResponse res = new com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaLimitsResponse(contentType, httpRes.statusCode(), httpRes) {{
            quotaLimitsResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.QuotaLimitsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.QuotaLimitsResponse.class);
                res.quotaLimitsResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }

    /**
     * Queries time series metrics
     * Queries time series metrics
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.ObservabilityQueryTimeSeriesMetricsResponse queryTimeSeriesMetrics(com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/observability/metrics/timeseries/query");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.ObservabilityQueryTimeSeriesMetricsResponse res = new com.tigrisdata.tigris_core.models.operations.ObservabilityQueryTimeSeriesMetricsResponse(contentType, httpRes.statusCode(), httpRes) {{
            queryTimeSeriesMetricsResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsResponse.class);
                res.queryTimeSeriesMetricsResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }
}