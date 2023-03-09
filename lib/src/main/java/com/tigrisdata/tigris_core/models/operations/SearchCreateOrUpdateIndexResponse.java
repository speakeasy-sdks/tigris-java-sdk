package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchCreateOrUpdateIndexResponse {
    public String contentType;
    public SearchCreateOrUpdateIndexResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.CreateOrUpdateIndexResponse createOrUpdateIndexResponse;
    public SearchCreateOrUpdateIndexResponse withCreateOrUpdateIndexResponse(com.tigrisdata.tigris_core.models.shared.CreateOrUpdateIndexResponse createOrUpdateIndexResponse) {
        this.createOrUpdateIndexResponse = createOrUpdateIndexResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchCreateOrUpdateIndexResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public SearchCreateOrUpdateIndexResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchCreateOrUpdateIndexResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
