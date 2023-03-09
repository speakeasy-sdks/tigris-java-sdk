package com.tigrisdata.tigris_core.models.operations;



public class RealtimePresenceRequest {
    public RealtimePresencePathParams pathParams;
    public RealtimePresenceRequest withPathParams(RealtimePresencePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
}
