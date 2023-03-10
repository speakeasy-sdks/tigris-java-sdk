package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisDropCollectionRequest {
    public TigrisDropCollectionPathParams pathParams;
    public TigrisDropCollectionRequest withPathParams(TigrisDropCollectionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.DropCollectionRequest request;
    public TigrisDropCollectionRequest withRequest(com.tigrisdata.tigris_core.models.shared.DropCollectionRequest request) {
        this.request = request;
        return this;
    }
    
}
