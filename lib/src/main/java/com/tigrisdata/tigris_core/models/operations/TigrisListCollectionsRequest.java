package com.tigrisdata.tigris_core.models.operations;



public class TigrisListCollectionsRequest {
    public TigrisListCollectionsPathParams pathParams;
    public TigrisListCollectionsRequest withPathParams(TigrisListCollectionsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public TigrisListCollectionsQueryParams queryParams;
    public TigrisListCollectionsRequest withQueryParams(TigrisListCollectionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
