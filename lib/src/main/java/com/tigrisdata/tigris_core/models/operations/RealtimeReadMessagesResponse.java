package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class RealtimeReadMessagesResponse {
    public String contentType;
    public RealtimeReadMessagesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.ReadMessagesResponse readMessagesResponse;
    public RealtimeReadMessagesResponse withReadMessagesResponse(com.tigrisdata.tigris_core.models.shared.ReadMessagesResponse readMessagesResponse) {
        this.readMessagesResponse = readMessagesResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public RealtimeReadMessagesResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public RealtimeReadMessagesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public RealtimeReadMessagesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
