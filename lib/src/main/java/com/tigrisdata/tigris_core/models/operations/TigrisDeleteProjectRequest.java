package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisDeleteProjectRequest {
    public TigrisDeleteProjectPathParams pathParams;
    public TigrisDeleteProjectRequest withPathParams(TigrisDeleteProjectPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public TigrisDeleteProjectRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
