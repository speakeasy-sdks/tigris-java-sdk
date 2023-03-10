package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class RealtimeListSubscriptionsResponse {
    public String contentType;
    public RealtimeListSubscriptionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.ListSubscriptionResponse listSubscriptionResponse;
    public RealtimeListSubscriptionsResponse withListSubscriptionResponse(com.tigrisdata.tigris_core.models.shared.ListSubscriptionResponse listSubscriptionResponse) {
        this.listSubscriptionResponse = listSubscriptionResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public RealtimeListSubscriptionsResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public RealtimeListSubscriptionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public RealtimeListSubscriptionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
