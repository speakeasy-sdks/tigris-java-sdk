package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ObservabilityQuotaLimitsResponse {
    public String contentType;
    public ObservabilityQuotaLimitsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.QuotaLimitsResponse quotaLimitsResponse;
    public ObservabilityQuotaLimitsResponse withQuotaLimitsResponse(com.tigrisdata.tigris_core.models.shared.QuotaLimitsResponse quotaLimitsResponse) {
        this.quotaLimitsResponse = quotaLimitsResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ObservabilityQuotaLimitsResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public ObservabilityQuotaLimitsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ObservabilityQuotaLimitsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
