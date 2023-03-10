package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisDeleteRequest {
    public TigrisDeletePathParams pathParams;
    public TigrisDeleteRequest withPathParams(TigrisDeletePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.DeleteRequest request;
    public TigrisDeleteRequest withRequest(com.tigrisdata.tigris_core.models.shared.DeleteRequest request) {
        this.request = request;
        return this;
    }
    
}
