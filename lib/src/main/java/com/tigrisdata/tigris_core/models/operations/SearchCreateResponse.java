package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchCreateResponse {
    public String contentType;
    public SearchCreateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.CreateDocumentResponse createDocumentResponse;
    public SearchCreateResponse withCreateDocumentResponse(com.tigrisdata.tigris_core.models.shared.CreateDocumentResponse createDocumentResponse) {
        this.createDocumentResponse = createDocumentResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchCreateResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public SearchCreateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchCreateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
