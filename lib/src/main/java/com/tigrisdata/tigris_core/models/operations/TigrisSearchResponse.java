package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisSearchResponse {
    public String contentType;
    public TigrisSearchResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public TigrisSearchResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisSearchResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisSearchResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.StreamingSearchResponse streamingSearchResponse;
    public TigrisSearchResponse withStreamingSearchResponse(com.tigrisdata.tigris_core.models.shared.StreamingSearchResponse streamingSearchResponse) {
        this.streamingSearchResponse = streamingSearchResponse;
        return this;
    }
    
}
