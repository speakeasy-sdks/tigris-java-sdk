package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisRotateAppKeySecretRequest {
    public TigrisRotateAppKeySecretPathParams pathParams;
    public TigrisRotateAppKeySecretRequest withPathParams(TigrisRotateAppKeySecretPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.RotateAppKeyRequest request;
    public TigrisRotateAppKeySecretRequest withRequest(com.tigrisdata.tigris_core.models.shared.RotateAppKeyRequest request) {
        this.request = request;
        return this;
    }
    
}
