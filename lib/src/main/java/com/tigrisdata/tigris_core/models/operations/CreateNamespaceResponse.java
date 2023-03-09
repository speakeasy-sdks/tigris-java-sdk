package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class CreateNamespaceResponse {
    public String contentType;
    public CreateNamespaceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.CreateNamespaceResponse createNamespaceResponse;
    public CreateNamespaceResponse withCreateNamespaceResponse(com.tigrisdata.tigris_core.models.shared.CreateNamespaceResponse createNamespaceResponse) {
        this.createNamespaceResponse = createNamespaceResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public CreateNamespaceResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public CreateNamespaceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateNamespaceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
