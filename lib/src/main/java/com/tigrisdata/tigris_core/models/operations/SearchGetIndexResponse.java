package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchGetIndexResponse {
    public String contentType;
    public SearchGetIndexResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.GetIndexResponse getIndexResponse;
    public SearchGetIndexResponse withGetIndexResponse(com.tigrisdata.tigris_core.models.shared.GetIndexResponse getIndexResponse) {
        this.getIndexResponse = getIndexResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchGetIndexResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public SearchGetIndexResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchGetIndexResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
