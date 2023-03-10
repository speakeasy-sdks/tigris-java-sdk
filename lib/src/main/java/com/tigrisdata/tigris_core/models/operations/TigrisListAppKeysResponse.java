package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisListAppKeysResponse {
    public String contentType;
    public TigrisListAppKeysResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.ListAppKeysResponse listAppKeysResponse;
    public TigrisListAppKeysResponse withListAppKeysResponse(com.tigrisdata.tigris_core.models.shared.ListAppKeysResponse listAppKeysResponse) {
        this.listAppKeysResponse = listAppKeysResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisListAppKeysResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisListAppKeysResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisListAppKeysResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
