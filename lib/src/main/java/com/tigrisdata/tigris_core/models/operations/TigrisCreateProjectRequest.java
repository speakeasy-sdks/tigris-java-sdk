package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisCreateProjectRequest {
    public TigrisCreateProjectPathParams pathParams;
    public TigrisCreateProjectRequest withPathParams(TigrisCreateProjectPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public TigrisCreateProjectRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
