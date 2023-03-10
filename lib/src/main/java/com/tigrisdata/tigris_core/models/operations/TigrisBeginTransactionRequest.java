package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisBeginTransactionRequest {
    public TigrisBeginTransactionPathParams pathParams;
    public TigrisBeginTransactionRequest withPathParams(TigrisBeginTransactionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.BeginTransactionRequest request;
    public TigrisBeginTransactionRequest withRequest(com.tigrisdata.tigris_core.models.shared.BeginTransactionRequest request) {
        this.request = request;
        return this;
    }
    
}
