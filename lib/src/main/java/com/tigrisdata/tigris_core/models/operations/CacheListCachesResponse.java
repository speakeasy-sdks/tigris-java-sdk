package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class CacheListCachesResponse {
    public String contentType;
    public CacheListCachesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.ListCachesResponse listCachesResponse;
    public CacheListCachesResponse withListCachesResponse(com.tigrisdata.tigris_core.models.shared.ListCachesResponse listCachesResponse) {
        this.listCachesResponse = listCachesResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public CacheListCachesResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public CacheListCachesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CacheListCachesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
