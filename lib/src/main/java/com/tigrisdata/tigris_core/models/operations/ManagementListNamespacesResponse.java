package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ManagementListNamespacesResponse {
    public String contentType;
    public ManagementListNamespacesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.ListNamespacesResponse listNamespacesResponse;
    public ManagementListNamespacesResponse withListNamespacesResponse(com.tigrisdata.tigris_core.models.shared.ListNamespacesResponse listNamespacesResponse) {
        this.listNamespacesResponse = listNamespacesResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ManagementListNamespacesResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public ManagementListNamespacesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ManagementListNamespacesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
