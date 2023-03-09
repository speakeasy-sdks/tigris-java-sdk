package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ManagementCreateNamespaceResponse {
    public String contentType;
    public ManagementCreateNamespaceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.CreateNamespaceResponse createNamespaceResponse;
    public ManagementCreateNamespaceResponse withCreateNamespaceResponse(com.tigrisdata.tigris_core.models.shared.CreateNamespaceResponse createNamespaceResponse) {
        this.createNamespaceResponse = createNamespaceResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ManagementCreateNamespaceResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public ManagementCreateNamespaceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ManagementCreateNamespaceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
