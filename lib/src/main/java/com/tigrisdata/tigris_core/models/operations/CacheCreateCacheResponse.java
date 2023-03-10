package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class CacheCreateCacheResponse {
    public String contentType;
    public CacheCreateCacheResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.CreateCacheResponse createCacheResponse;
    public CacheCreateCacheResponse withCreateCacheResponse(com.tigrisdata.tigris_core.models.shared.CreateCacheResponse createCacheResponse) {
        this.createCacheResponse = createCacheResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public CacheCreateCacheResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public CacheCreateCacheResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CacheCreateCacheResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
