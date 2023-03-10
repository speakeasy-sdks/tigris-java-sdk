package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class RealtimeGetRTChannelResponse {
    public String contentType;
    public RealtimeGetRTChannelResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.GetRTChannelResponse getRTChannelResponse;
    public RealtimeGetRTChannelResponse withGetRTChannelResponse(com.tigrisdata.tigris_core.models.shared.GetRTChannelResponse getRTChannelResponse) {
        this.getRTChannelResponse = getRTChannelResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public RealtimeGetRTChannelResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public RealtimeGetRTChannelResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public RealtimeGetRTChannelResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
