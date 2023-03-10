package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisCreateOrUpdateCollectionRequest {
    public TigrisCreateOrUpdateCollectionPathParams pathParams;
    public TigrisCreateOrUpdateCollectionRequest withPathParams(TigrisCreateOrUpdateCollectionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest request;
    public TigrisCreateOrUpdateCollectionRequest withRequest(com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest request) {
        this.request = request;
        return this;
    }
    
}
