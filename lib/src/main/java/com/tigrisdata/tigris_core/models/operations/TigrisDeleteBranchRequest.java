package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisDeleteBranchRequest {
    public TigrisDeleteBranchPathParams pathParams;
    public TigrisDeleteBranchRequest withPathParams(TigrisDeleteBranchPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public TigrisDeleteBranchRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
