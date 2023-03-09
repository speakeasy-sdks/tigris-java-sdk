package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisDeleteAppKeyResponse {
    public String contentType;
    public TigrisDeleteAppKeyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DeleteAppKeyResponse deleteAppKeyResponse;
    public TigrisDeleteAppKeyResponse withDeleteAppKeyResponse(com.tigrisdata.tigris_core.models.shared.DeleteAppKeyResponse deleteAppKeyResponse) {
        this.deleteAppKeyResponse = deleteAppKeyResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisDeleteAppKeyResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisDeleteAppKeyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisDeleteAppKeyResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
