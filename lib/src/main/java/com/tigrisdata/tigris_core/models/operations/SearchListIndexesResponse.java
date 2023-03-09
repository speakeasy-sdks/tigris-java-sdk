package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchListIndexesResponse {
    public String contentType;
    public SearchListIndexesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.ListIndexesResponse listIndexesResponse;
    public SearchListIndexesResponse withListIndexesResponse(com.tigrisdata.tigris_core.models.shared.ListIndexesResponse listIndexesResponse) {
        this.listIndexesResponse = listIndexesResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchListIndexesResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public SearchListIndexesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchListIndexesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
