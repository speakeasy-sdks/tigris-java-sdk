package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ManagementInsertNamespaceMetadataResponse {
    public String contentType;
    public ManagementInsertNamespaceMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataResponse insertNamespaceMetadataResponse;
    public ManagementInsertNamespaceMetadataResponse withInsertNamespaceMetadataResponse(com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataResponse insertNamespaceMetadataResponse) {
        this.insertNamespaceMetadataResponse = insertNamespaceMetadataResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ManagementInsertNamespaceMetadataResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public ManagementInsertNamespaceMetadataResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ManagementInsertNamespaceMetadataResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
