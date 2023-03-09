package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class CacheCreateCacheRequest {
    public CacheCreateCachePathParams pathParams;
    public CacheCreateCacheRequest withPathParams(CacheCreateCachePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.CreateCacheRequest request;
    public CacheCreateCacheRequest withRequest(com.tigrisdata.tigris_core.models.shared.CreateCacheRequest request) {
        this.request = request;
        return this;
    }
    
}
