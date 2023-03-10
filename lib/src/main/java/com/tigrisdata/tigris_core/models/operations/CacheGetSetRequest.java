package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class CacheGetSetRequest {
    public CacheGetSetPathParams pathParams;
    public CacheGetSetRequest withPathParams(CacheGetSetPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.GetSetRequest request;
    public CacheGetSetRequest withRequest(com.tigrisdata.tigris_core.models.shared.GetSetRequest request) {
        this.request = request;
        return this;
    }
    
}
