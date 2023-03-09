package com.tigrisdata.tigris_core.models.operations;



public class RealtimeReadMessagesRequest {
    public RealtimeReadMessagesPathParams pathParams;
    public RealtimeReadMessagesRequest withPathParams(RealtimeReadMessagesPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public RealtimeReadMessagesQueryParams queryParams;
    public RealtimeReadMessagesRequest withQueryParams(RealtimeReadMessagesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
