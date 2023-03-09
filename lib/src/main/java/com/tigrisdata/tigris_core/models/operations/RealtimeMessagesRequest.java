package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class RealtimeMessagesRequest {
    public RealtimeMessagesPathParams pathParams;
    public RealtimeMessagesRequest withPathParams(RealtimeMessagesPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.MessagesRequest request;
    public RealtimeMessagesRequest withRequest(com.tigrisdata.tigris_core.models.shared.MessagesRequest request) {
        this.request = request;
        return this;
    }
    
}
