package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ManagementUpdateUserMetadataResponse {
    public String contentType;
    public ManagementUpdateUserMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ManagementUpdateUserMetadataResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ManagementUpdateUserMetadataResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ManagementUpdateUserMetadataResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataResponse updateUserMetadataResponse;
    public ManagementUpdateUserMetadataResponse withUpdateUserMetadataResponse(com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataResponse updateUserMetadataResponse) {
        this.updateUserMetadataResponse = updateUserMetadataResponse;
        return this;
    }
    
}
