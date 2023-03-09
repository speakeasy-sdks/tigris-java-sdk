package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisCreateBranchResponse {
    public String contentType;
    public TigrisCreateBranchResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.CreateBranchResponse createBranchResponse;
    public TigrisCreateBranchResponse withCreateBranchResponse(com.tigrisdata.tigris_core.models.shared.CreateBranchResponse createBranchResponse) {
        this.createBranchResponse = createBranchResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisCreateBranchResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisCreateBranchResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisCreateBranchResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
