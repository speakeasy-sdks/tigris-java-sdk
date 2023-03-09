package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ManagementGetUserMetadataResponse {
    public String contentType;
    public ManagementGetUserMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.GetUserMetadataResponse getUserMetadataResponse;
    public ManagementGetUserMetadataResponse withGetUserMetadataResponse(com.tigrisdata.tigris_core.models.shared.GetUserMetadataResponse getUserMetadataResponse) {
        this.getUserMetadataResponse = getUserMetadataResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ManagementGetUserMetadataResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public ManagementGetUserMetadataResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ManagementGetUserMetadataResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
