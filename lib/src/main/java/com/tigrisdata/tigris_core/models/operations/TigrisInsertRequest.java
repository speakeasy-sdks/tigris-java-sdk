package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisInsertRequest {
    public TigrisInsertPathParams pathParams;
    public TigrisInsertRequest withPathParams(TigrisInsertPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.InsertRequest request;
    public TigrisInsertRequest withRequest(com.tigrisdata.tigris_core.models.shared.InsertRequest request) {
        this.request = request;
        return this;
    }
    
}
