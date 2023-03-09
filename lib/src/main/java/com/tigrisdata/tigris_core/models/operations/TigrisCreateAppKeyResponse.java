package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisCreateAppKeyResponse {
    public String contentType;
    public TigrisCreateAppKeyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.CreateAppKeyResponse createAppKeyResponse;
    public TigrisCreateAppKeyResponse withCreateAppKeyResponse(com.tigrisdata.tigris_core.models.shared.CreateAppKeyResponse createAppKeyResponse) {
        this.createAppKeyResponse = createAppKeyResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisCreateAppKeyResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisCreateAppKeyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisCreateAppKeyResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
