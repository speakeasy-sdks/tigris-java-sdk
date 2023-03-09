package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ObservabilityQuotaUsageResponse {
    public String contentType;
    public ObservabilityQuotaUsageResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.QuotaUsageResponse quotaUsageResponse;
    public ObservabilityQuotaUsageResponse withQuotaUsageResponse(com.tigrisdata.tigris_core.models.shared.QuotaUsageResponse quotaUsageResponse) {
        this.quotaUsageResponse = quotaUsageResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ObservabilityQuotaUsageResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public ObservabilityQuotaUsageResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ObservabilityQuotaUsageResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
