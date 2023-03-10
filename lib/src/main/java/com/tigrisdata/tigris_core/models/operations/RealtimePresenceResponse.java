package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class RealtimePresenceResponse {
    public String contentType;
    public RealtimePresenceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.PresenceResponse presenceResponse;
    public RealtimePresenceResponse withPresenceResponse(com.tigrisdata.tigris_core.models.shared.PresenceResponse presenceResponse) {
        this.presenceResponse = presenceResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public RealtimePresenceResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public RealtimePresenceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public RealtimePresenceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
