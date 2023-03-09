package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisRollbackTransactionResponse {
    public String contentType;
    public TigrisRollbackTransactionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.RollbackTransactionResponse rollbackTransactionResponse;
    public TigrisRollbackTransactionResponse withRollbackTransactionResponse(com.tigrisdata.tigris_core.models.shared.RollbackTransactionResponse rollbackTransactionResponse) {
        this.rollbackTransactionResponse = rollbackTransactionResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisRollbackTransactionResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisRollbackTransactionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisRollbackTransactionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
