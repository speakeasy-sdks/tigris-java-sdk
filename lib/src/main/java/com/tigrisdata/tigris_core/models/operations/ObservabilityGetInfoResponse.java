package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ObservabilityGetInfoResponse {
    public String contentType;
    public ObservabilityGetInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.GetInfoResponse getInfoResponse;
    public ObservabilityGetInfoResponse withGetInfoResponse(com.tigrisdata.tigris_core.models.shared.GetInfoResponse getInfoResponse) {
        this.getInfoResponse = getInfoResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ObservabilityGetInfoResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public ObservabilityGetInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ObservabilityGetInfoResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
