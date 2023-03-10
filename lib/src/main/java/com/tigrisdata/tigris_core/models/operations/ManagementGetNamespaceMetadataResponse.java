package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ManagementGetNamespaceMetadataResponse {
    public String contentType;
    public ManagementGetNamespaceMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.GetNamespaceMetadataResponse getNamespaceMetadataResponse;
    public ManagementGetNamespaceMetadataResponse withGetNamespaceMetadataResponse(com.tigrisdata.tigris_core.models.shared.GetNamespaceMetadataResponse getNamespaceMetadataResponse) {
        this.getNamespaceMetadataResponse = getNamespaceMetadataResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ManagementGetNamespaceMetadataResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public ManagementGetNamespaceMetadataResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ManagementGetNamespaceMetadataResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
