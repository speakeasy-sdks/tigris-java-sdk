package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisCreateAppKeyRequest {
    public TigrisCreateAppKeyPathParams pathParams;
    public TigrisCreateAppKeyRequest withPathParams(TigrisCreateAppKeyPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.CreateAppKeyRequest request;
    public TigrisCreateAppKeyRequest withRequest(com.tigrisdata.tigris_core.models.shared.CreateAppKeyRequest request) {
        this.request = request;
        return this;
    }
    
}
