package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisRollbackTransactionRequest {
    public TigrisRollbackTransactionPathParams pathParams;
    public TigrisRollbackTransactionRequest withPathParams(TigrisRollbackTransactionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.RollbackTransactionRequest request;
    public TigrisRollbackTransactionRequest withRequest(com.tigrisdata.tigris_core.models.shared.RollbackTransactionRequest request) {
        this.request = request;
        return this;
    }
    
}
