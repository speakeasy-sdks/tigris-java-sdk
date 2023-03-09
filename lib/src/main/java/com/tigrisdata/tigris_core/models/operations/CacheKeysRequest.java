package com.tigrisdata.tigris_core.models.operations;



public class CacheKeysRequest {
    public CacheKeysPathParams pathParams;
    public CacheKeysRequest withPathParams(CacheKeysPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public CacheKeysQueryParams queryParams;
    public CacheKeysRequest withQueryParams(CacheKeysQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
