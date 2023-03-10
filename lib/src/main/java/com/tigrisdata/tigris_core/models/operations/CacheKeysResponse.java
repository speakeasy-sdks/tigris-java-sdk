package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class CacheKeysResponse {
    public String contentType;
    public CacheKeysResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.KeysResponse keysResponse;
    public CacheKeysResponse withKeysResponse(com.tigrisdata.tigris_core.models.shared.KeysResponse keysResponse) {
        this.keysResponse = keysResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public CacheKeysResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public CacheKeysResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CacheKeysResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
