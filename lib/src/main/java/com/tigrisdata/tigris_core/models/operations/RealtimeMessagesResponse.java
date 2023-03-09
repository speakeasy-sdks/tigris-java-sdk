package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class RealtimeMessagesResponse {
    public String contentType;
    public RealtimeMessagesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.MessagesResponse messagesResponse;
    public RealtimeMessagesResponse withMessagesResponse(com.tigrisdata.tigris_core.models.shared.MessagesResponse messagesResponse) {
        this.messagesResponse = messagesResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public RealtimeMessagesResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public RealtimeMessagesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public RealtimeMessagesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
