package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisDeleteBranchResponse {
    public String contentType;
    public TigrisDeleteBranchResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DeleteBranchResponse deleteBranchResponse;
    public TigrisDeleteBranchResponse withDeleteBranchResponse(com.tigrisdata.tigris_core.models.shared.DeleteBranchResponse deleteBranchResponse) {
        this.deleteBranchResponse = deleteBranchResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisDeleteBranchResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisDeleteBranchResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisDeleteBranchResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
