package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class HealthAPIHealthResponse {
    public String contentType;
    public HealthAPIHealthResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.HealthCheckResponse healthCheckResponse;
    public HealthAPIHealthResponse withHealthCheckResponse(com.tigrisdata.tigris_core.models.shared.HealthCheckResponse healthCheckResponse) {
        this.healthCheckResponse = healthCheckResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public HealthAPIHealthResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public HealthAPIHealthResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public HealthAPIHealthResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
