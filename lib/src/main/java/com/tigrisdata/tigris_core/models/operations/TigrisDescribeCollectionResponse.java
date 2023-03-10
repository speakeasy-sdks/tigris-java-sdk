package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisDescribeCollectionResponse {
    public String contentType;
    public TigrisDescribeCollectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DescribeCollectionResponse describeCollectionResponse;
    public TigrisDescribeCollectionResponse withDescribeCollectionResponse(com.tigrisdata.tigris_core.models.shared.DescribeCollectionResponse describeCollectionResponse) {
        this.describeCollectionResponse = describeCollectionResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisDescribeCollectionResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisDescribeCollectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisDescribeCollectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
