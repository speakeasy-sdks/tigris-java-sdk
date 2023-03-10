package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchSearchRequest {
    public SearchSearchPathParams pathParams;
    public SearchSearchRequest withPathParams(SearchSearchPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.SearchIndexRequest request;
    public SearchSearchRequest withRequest(com.tigrisdata.tigris_core.models.shared.SearchIndexRequest request) {
        this.request = request;
        return this;
    }
    
}
