package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchSearchResponse {
    public String contentType;
    public SearchSearchResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.SearchIndexResponse searchIndexResponse;
    public SearchSearchResponse withSearchIndexResponse(com.tigrisdata.tigris_core.models.shared.SearchIndexResponse searchIndexResponse) {
        this.searchIndexResponse = searchIndexResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchSearchResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public SearchSearchResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchSearchResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
