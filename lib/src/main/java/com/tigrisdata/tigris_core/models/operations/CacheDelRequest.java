package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class CacheDelRequest {
    public CacheDelPathParams pathParams;
    public CacheDelRequest withPathParams(CacheDelPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public CacheDelRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
