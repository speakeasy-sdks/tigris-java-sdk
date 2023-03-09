package com.tigrisdata.tigris_core.models.operations;



public class SearchGetRequest {
    public SearchGetPathParams pathParams;
    public SearchGetRequest withPathParams(SearchGetPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public SearchGetQueryParams queryParams;
    public SearchGetRequest withQueryParams(SearchGetQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
