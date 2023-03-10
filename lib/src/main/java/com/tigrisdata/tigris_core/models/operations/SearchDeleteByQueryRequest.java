package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchDeleteByQueryRequest {
    public SearchDeleteByQueryPathParams pathParams;
    public SearchDeleteByQueryRequest withPathParams(SearchDeleteByQueryPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.DeleteByQueryRequest request;
    public SearchDeleteByQueryRequest withRequest(com.tigrisdata.tigris_core.models.shared.DeleteByQueryRequest request) {
        this.request = request;
        return this;
    }
    
}
