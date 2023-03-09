package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisReadRequest {
    public TigrisReadPathParams pathParams;
    public TigrisReadRequest withPathParams(TigrisReadPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.ReadRequest request;
    public TigrisReadRequest withRequest(com.tigrisdata.tigris_core.models.shared.ReadRequest request) {
        this.request = request;
        return this;
    }
    
}
