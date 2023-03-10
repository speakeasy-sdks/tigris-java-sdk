package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisUpdateResponse {
    public String contentType;
    public TigrisUpdateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public TigrisUpdateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisUpdateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisUpdateResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.UpdateResponse updateResponse;
    public TigrisUpdateResponse withUpdateResponse(com.tigrisdata.tigris_core.models.shared.UpdateResponse updateResponse) {
        this.updateResponse = updateResponse;
        return this;
    }
    
}
