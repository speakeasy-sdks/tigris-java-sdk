package com.tigrisdata.tigris_core.models.operations;



public class CacheGetRequest {
    public CacheGetPathParams pathParams;
    public CacheGetRequest withPathParams(CacheGetPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
}
