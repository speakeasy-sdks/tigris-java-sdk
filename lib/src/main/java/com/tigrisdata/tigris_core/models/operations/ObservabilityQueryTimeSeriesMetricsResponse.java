package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ObservabilityQueryTimeSeriesMetricsResponse {
    public String contentType;
    public ObservabilityQueryTimeSeriesMetricsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsResponse queryTimeSeriesMetricsResponse;
    public ObservabilityQueryTimeSeriesMetricsResponse withQueryTimeSeriesMetricsResponse(com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsResponse queryTimeSeriesMetricsResponse) {
        this.queryTimeSeriesMetricsResponse = queryTimeSeriesMetricsResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ObservabilityQueryTimeSeriesMetricsResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public ObservabilityQueryTimeSeriesMetricsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ObservabilityQueryTimeSeriesMetricsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
