package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisInsertResponse {
    public String contentType;
    public TigrisInsertResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.InsertResponse insertResponse;
    public TigrisInsertResponse withInsertResponse(com.tigrisdata.tigris_core.models.shared.InsertResponse insertResponse) {
        this.insertResponse = insertResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisInsertResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisInsertResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisInsertResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
