package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisDescribeDatabaseResponse {
    public String contentType;
    public TigrisDescribeDatabaseResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DescribeDatabaseResponse describeDatabaseResponse;
    public TigrisDescribeDatabaseResponse withDescribeDatabaseResponse(com.tigrisdata.tigris_core.models.shared.DescribeDatabaseResponse describeDatabaseResponse) {
        this.describeDatabaseResponse = describeDatabaseResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisDescribeDatabaseResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisDescribeDatabaseResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisDescribeDatabaseResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
