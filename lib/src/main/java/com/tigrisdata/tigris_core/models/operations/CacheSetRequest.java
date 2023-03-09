package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class CacheSetRequest {
    public CacheSetPathParams pathParams;
    public CacheSetRequest withPathParams(CacheSetPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.SetRequest request;
    public CacheSetRequest withRequest(com.tigrisdata.tigris_core.models.shared.SetRequest request) {
        this.request = request;
        return this;
    }
    
}
