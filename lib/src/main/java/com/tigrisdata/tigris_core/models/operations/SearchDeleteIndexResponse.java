package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchDeleteIndexResponse {
    public String contentType;
    public SearchDeleteIndexResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DeleteIndexResponse deleteIndexResponse;
    public SearchDeleteIndexResponse withDeleteIndexResponse(com.tigrisdata.tigris_core.models.shared.DeleteIndexResponse deleteIndexResponse) {
        this.deleteIndexResponse = deleteIndexResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchDeleteIndexResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public SearchDeleteIndexResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchDeleteIndexResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
