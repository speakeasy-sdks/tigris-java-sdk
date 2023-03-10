package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisCommitTransactionRequest {
    public TigrisCommitTransactionPathParams pathParams;
    public TigrisCommitTransactionRequest withPathParams(TigrisCommitTransactionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.CommitTransactionRequest request;
    public TigrisCommitTransactionRequest withRequest(com.tigrisdata.tigris_core.models.shared.CommitTransactionRequest request) {
        this.request = request;
        return this;
    }
    
}
