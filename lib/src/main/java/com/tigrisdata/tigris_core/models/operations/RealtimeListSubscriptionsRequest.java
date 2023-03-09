package com.tigrisdata.tigris_core.models.operations;



public class RealtimeListSubscriptionsRequest {
    public RealtimeListSubscriptionsPathParams pathParams;
    public RealtimeListSubscriptionsRequest withPathParams(RealtimeListSubscriptionsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public RealtimeListSubscriptionsQueryParams queryParams;
    public RealtimeListSubscriptionsRequest withQueryParams(RealtimeListSubscriptionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
