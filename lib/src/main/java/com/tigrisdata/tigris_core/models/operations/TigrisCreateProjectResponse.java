package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisCreateProjectResponse {
    public String contentType;
    public TigrisCreateProjectResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.CreateProjectResponse createProjectResponse;
    public TigrisCreateProjectResponse withCreateProjectResponse(com.tigrisdata.tigris_core.models.shared.CreateProjectResponse createProjectResponse) {
        this.createProjectResponse = createProjectResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisCreateProjectResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisCreateProjectResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisCreateProjectResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
