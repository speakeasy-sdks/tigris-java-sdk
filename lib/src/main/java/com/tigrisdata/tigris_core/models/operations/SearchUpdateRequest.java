package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchUpdateRequest {
    public SearchUpdatePathParams pathParams;
    public SearchUpdateRequest withPathParams(SearchUpdatePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest request;
    public SearchUpdateRequest withRequest(com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest request) {
        this.request = request;
        return this;
    }
    
}
