package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class RealtimeGetRTChannelsResponse {
    public String contentType;
    public RealtimeGetRTChannelsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.GetRTChannelsResponse getRTChannelsResponse;
    public RealtimeGetRTChannelsResponse withGetRTChannelsResponse(com.tigrisdata.tigris_core.models.shared.GetRTChannelsResponse getRTChannelsResponse) {
        this.getRTChannelsResponse = getRTChannelsResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public RealtimeGetRTChannelsResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public RealtimeGetRTChannelsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public RealtimeGetRTChannelsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
