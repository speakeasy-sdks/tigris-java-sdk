package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class CacheDeleteCacheRequest {
    public CacheDeleteCachePathParams pathParams;
    public CacheDeleteCacheRequest withPathParams(CacheDeleteCachePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public CacheDeleteCacheRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
