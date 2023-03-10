package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class CacheGetResponse {
    public String contentType;
    public CacheGetResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.GetResponse getResponse;
    public CacheGetResponse withGetResponse(com.tigrisdata.tigris_core.models.shared.GetResponse getResponse) {
        this.getResponse = getResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public CacheGetResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public CacheGetResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CacheGetResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
