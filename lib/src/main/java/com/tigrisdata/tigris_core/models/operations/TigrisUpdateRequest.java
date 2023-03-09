package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisUpdateRequest {
    public TigrisUpdatePathParams pathParams;
    public TigrisUpdateRequest withPathParams(TigrisUpdatePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.UpdateRequest request;
    public TigrisUpdateRequest withRequest(com.tigrisdata.tigris_core.models.shared.UpdateRequest request) {
        this.request = request;
        return this;
    }
    
}
