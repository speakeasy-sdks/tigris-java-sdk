package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchGetResponse {
    public String contentType;
    public SearchGetResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.GetDocumentResponse getDocumentResponse;
    public SearchGetResponse withGetDocumentResponse(com.tigrisdata.tigris_core.models.shared.GetDocumentResponse getDocumentResponse) {
        this.getDocumentResponse = getDocumentResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchGetResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public SearchGetResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchGetResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
