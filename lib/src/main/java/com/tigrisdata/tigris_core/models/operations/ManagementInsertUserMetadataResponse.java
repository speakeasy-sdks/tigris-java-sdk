package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ManagementInsertUserMetadataResponse {
    public String contentType;
    public ManagementInsertUserMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.InsertUserMetadataResponse insertUserMetadataResponse;
    public ManagementInsertUserMetadataResponse withInsertUserMetadataResponse(com.tigrisdata.tigris_core.models.shared.InsertUserMetadataResponse insertUserMetadataResponse) {
        this.insertUserMetadataResponse = insertUserMetadataResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ManagementInsertUserMetadataResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public ManagementInsertUserMetadataResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ManagementInsertUserMetadataResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
