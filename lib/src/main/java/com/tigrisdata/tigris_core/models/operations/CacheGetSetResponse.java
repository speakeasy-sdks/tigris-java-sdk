package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class CacheGetSetResponse {
    public String contentType;
    public CacheGetSetResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.GetSetResponse getSetResponse;
    public CacheGetSetResponse withGetSetResponse(com.tigrisdata.tigris_core.models.shared.GetSetResponse getSetResponse) {
        this.getSetResponse = getSetResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public CacheGetSetResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public CacheGetSetResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CacheGetSetResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
