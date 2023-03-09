package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisSearchRequest {
    public TigrisSearchPathParams pathParams;
    public TigrisSearchRequest withPathParams(TigrisSearchPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.SearchRequest request;
    public TigrisSearchRequest withRequest(com.tigrisdata.tigris_core.models.shared.SearchRequest request) {
        this.request = request;
        return this;
    }
    
}
