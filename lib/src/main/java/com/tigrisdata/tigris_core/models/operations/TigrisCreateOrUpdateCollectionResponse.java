package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisCreateOrUpdateCollectionResponse {
    public String contentType;
    public TigrisCreateOrUpdateCollectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionResponse createOrUpdateCollectionResponse;
    public TigrisCreateOrUpdateCollectionResponse withCreateOrUpdateCollectionResponse(com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionResponse createOrUpdateCollectionResponse) {
        this.createOrUpdateCollectionResponse = createOrUpdateCollectionResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisCreateOrUpdateCollectionResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisCreateOrUpdateCollectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisCreateOrUpdateCollectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
