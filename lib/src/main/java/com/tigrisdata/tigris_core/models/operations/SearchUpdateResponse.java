package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchUpdateResponse {
    public String contentType;
    public SearchUpdateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public SearchUpdateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchUpdateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchUpdateResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.UpdateDocumentResponse updateDocumentResponse;
    public SearchUpdateResponse withUpdateDocumentResponse(com.tigrisdata.tigris_core.models.shared.UpdateDocumentResponse updateDocumentResponse) {
        this.updateDocumentResponse = updateDocumentResponse;
        return this;
    }
    
}
