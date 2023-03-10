package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class CacheDeleteCacheResponse {
    public String contentType;
    public CacheDeleteCacheResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DeleteCacheResponse deleteCacheResponse;
    public CacheDeleteCacheResponse withDeleteCacheResponse(com.tigrisdata.tigris_core.models.shared.DeleteCacheResponse deleteCacheResponse) {
        this.deleteCacheResponse = deleteCacheResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public CacheDeleteCacheResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public CacheDeleteCacheResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CacheDeleteCacheResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
