package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisCommitTransactionResponse {
    public com.tigrisdata.tigris_core.models.shared.CommitTransactionResponse commitTransactionResponse;
    public TigrisCommitTransactionResponse withCommitTransactionResponse(com.tigrisdata.tigris_core.models.shared.CommitTransactionResponse commitTransactionResponse) {
        this.commitTransactionResponse = commitTransactionResponse;
        return this;
    }
    
    public String contentType;
    public TigrisCommitTransactionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisCommitTransactionResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisCommitTransactionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisCommitTransactionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
