package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisDeleteProjectResponse {
    public String contentType;
    public TigrisDeleteProjectResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DeleteProjectResponse deleteProjectResponse;
    public TigrisDeleteProjectResponse withDeleteProjectResponse(com.tigrisdata.tigris_core.models.shared.DeleteProjectResponse deleteProjectResponse) {
        this.deleteProjectResponse = deleteProjectResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisDeleteProjectResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisDeleteProjectResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisDeleteProjectResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
