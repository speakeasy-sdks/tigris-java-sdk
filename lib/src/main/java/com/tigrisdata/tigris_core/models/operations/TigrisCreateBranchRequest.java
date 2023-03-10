package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisCreateBranchRequest {
    public TigrisCreateBranchPathParams pathParams;
    public TigrisCreateBranchRequest withPathParams(TigrisCreateBranchPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public TigrisCreateBranchRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
