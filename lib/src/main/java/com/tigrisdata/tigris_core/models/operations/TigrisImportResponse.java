package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisImportResponse {
    public String contentType;
    public TigrisImportResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.ImportResponse importResponse;
    public TigrisImportResponse withImportResponse(com.tigrisdata.tigris_core.models.shared.ImportResponse importResponse) {
        this.importResponse = importResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisImportResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisImportResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisImportResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
