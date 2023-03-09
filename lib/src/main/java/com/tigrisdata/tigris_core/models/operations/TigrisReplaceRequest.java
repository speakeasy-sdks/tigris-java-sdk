package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisReplaceRequest {
    public TigrisReplacePathParams pathParams;
    public TigrisReplaceRequest withPathParams(TigrisReplacePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.ReplaceRequest request;
    public TigrisReplaceRequest withRequest(com.tigrisdata.tigris_core.models.shared.ReplaceRequest request) {
        this.request = request;
        return this;
    }
    
}
