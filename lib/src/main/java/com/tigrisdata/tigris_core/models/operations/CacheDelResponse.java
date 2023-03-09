package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class CacheDelResponse {
    public String contentType;
    public CacheDelResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DelResponse delResponse;
    public CacheDelResponse withDelResponse(com.tigrisdata.tigris_core.models.shared.DelResponse delResponse) {
        this.delResponse = delResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public CacheDelResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public CacheDelResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CacheDelResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
