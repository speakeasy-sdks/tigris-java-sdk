package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchDeleteResponse {
    public String contentType;
    public SearchDeleteResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DeleteDocumentResponse deleteDocumentResponse;
    public SearchDeleteResponse withDeleteDocumentResponse(com.tigrisdata.tigris_core.models.shared.DeleteDocumentResponse deleteDocumentResponse) {
        this.deleteDocumentResponse = deleteDocumentResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchDeleteResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public SearchDeleteResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchDeleteResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
