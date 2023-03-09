package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisListProjectsResponse {
    public String contentType;
    public TigrisListProjectsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.ListProjectsResponse listProjectsResponse;
    public TigrisListProjectsResponse withListProjectsResponse(com.tigrisdata.tigris_core.models.shared.ListProjectsResponse listProjectsResponse) {
        this.listProjectsResponse = listProjectsResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisListProjectsResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisListProjectsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisListProjectsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
