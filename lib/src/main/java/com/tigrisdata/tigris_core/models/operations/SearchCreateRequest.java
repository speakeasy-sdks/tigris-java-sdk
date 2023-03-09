package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchCreateRequest {
    public SearchCreatePathParams pathParams;
    public SearchCreateRequest withPathParams(SearchCreatePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest request;
    public SearchCreateRequest withRequest(com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest request) {
        this.request = request;
        return this;
    }
    
}
