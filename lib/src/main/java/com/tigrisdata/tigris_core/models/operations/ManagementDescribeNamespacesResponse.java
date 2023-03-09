package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ManagementDescribeNamespacesResponse {
    public String contentType;
    public ManagementDescribeNamespacesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DescribeNamespacesResponse describeNamespacesResponse;
    public ManagementDescribeNamespacesResponse withDescribeNamespacesResponse(com.tigrisdata.tigris_core.models.shared.DescribeNamespacesResponse describeNamespacesResponse) {
        this.describeNamespacesResponse = describeNamespacesResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ManagementDescribeNamespacesResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public ManagementDescribeNamespacesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ManagementDescribeNamespacesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
