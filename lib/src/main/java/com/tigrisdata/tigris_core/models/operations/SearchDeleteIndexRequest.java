package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchDeleteIndexRequest {
    public SearchDeleteIndexPathParams pathParams;
    public SearchDeleteIndexRequest withPathParams(SearchDeleteIndexPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.DeleteIndexRequest request;
    public SearchDeleteIndexRequest withRequest(com.tigrisdata.tigris_core.models.shared.DeleteIndexRequest request) {
        this.request = request;
        return this;
    }
    
}
