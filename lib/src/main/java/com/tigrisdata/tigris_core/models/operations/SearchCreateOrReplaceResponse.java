package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchCreateOrReplaceResponse {
    public String contentType;
    public SearchCreateOrReplaceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse createOrReplaceDocumentResponse;
    public SearchCreateOrReplaceResponse withCreateOrReplaceDocumentResponse(com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse createOrReplaceDocumentResponse) {
        this.createOrReplaceDocumentResponse = createOrReplaceDocumentResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchCreateOrReplaceResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public SearchCreateOrReplaceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchCreateOrReplaceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
