package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisListBranchesResponse {
    public String contentType;
    public TigrisListBranchesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.ListBranchesResponse listBranchesResponse;
    public TigrisListBranchesResponse withListBranchesResponse(com.tigrisdata.tigris_core.models.shared.ListBranchesResponse listBranchesResponse) {
        this.listBranchesResponse = listBranchesResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisListBranchesResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisListBranchesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisListBranchesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
