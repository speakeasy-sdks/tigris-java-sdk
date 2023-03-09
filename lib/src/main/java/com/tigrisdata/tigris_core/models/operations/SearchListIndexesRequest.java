package com.tigrisdata.tigris_core.models.operations;



public class SearchListIndexesRequest {
    public SearchListIndexesPathParams pathParams;
    public SearchListIndexesRequest withPathParams(SearchListIndexesPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public SearchListIndexesQueryParams queryParams;
    public SearchListIndexesRequest withQueryParams(SearchListIndexesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
