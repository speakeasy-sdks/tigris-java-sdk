package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchDeleteRequest {
    public SearchDeletePathParams pathParams;
    public SearchDeleteRequest withPathParams(SearchDeletePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.DeleteDocumentRequest request;
    public SearchDeleteRequest withRequest(com.tigrisdata.tigris_core.models.shared.DeleteDocumentRequest request) {
        this.request = request;
        return this;
    }
    
}
