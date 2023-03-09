package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisUpdateAppKeyRequest {
    public TigrisUpdateAppKeyPathParams pathParams;
    public TigrisUpdateAppKeyRequest withPathParams(TigrisUpdateAppKeyPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.UpdateAppKeyRequest request;
    public TigrisUpdateAppKeyRequest withRequest(com.tigrisdata.tigris_core.models.shared.UpdateAppKeyRequest request) {
        this.request = request;
        return this;
    }
    
}
