package com.tigrisdata.tigris_core.models.operations;



public class TigrisListBranchesRequest {
    public TigrisListBranchesPathParams pathParams;
    public TigrisListBranchesRequest withPathParams(TigrisListBranchesPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
}
