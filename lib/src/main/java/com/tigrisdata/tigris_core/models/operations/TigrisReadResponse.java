package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisReadResponse {
    public String contentType;
    public TigrisReadResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public TigrisReadResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisReadResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisReadResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.StreamingReadResponse streamingReadResponse;
    public TigrisReadResponse withStreamingReadResponse(com.tigrisdata.tigris_core.models.shared.StreamingReadResponse streamingReadResponse) {
        this.streamingReadResponse = streamingReadResponse;
        return this;
    }
    
}
