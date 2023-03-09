package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisDropCollectionResponse {
    public String contentType;
    public TigrisDropCollectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DropCollectionResponse dropCollectionResponse;
    public TigrisDropCollectionResponse withDropCollectionResponse(com.tigrisdata.tigris_core.models.shared.DropCollectionResponse dropCollectionResponse) {
        this.dropCollectionResponse = dropCollectionResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisDropCollectionResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisDropCollectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisDropCollectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
