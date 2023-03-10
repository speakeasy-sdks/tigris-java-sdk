package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class CacheSetResponse {
    public String contentType;
    public CacheSetResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.SetResponse setResponse;
    public CacheSetResponse withSetResponse(com.tigrisdata.tigris_core.models.shared.SetResponse setResponse) {
        this.setResponse = setResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public CacheSetResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public CacheSetResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CacheSetResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
