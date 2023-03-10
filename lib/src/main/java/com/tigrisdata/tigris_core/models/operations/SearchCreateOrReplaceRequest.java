package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchCreateOrReplaceRequest {
    public SearchCreateOrReplacePathParams pathParams;
    public SearchCreateOrReplaceRequest withPathParams(SearchCreateOrReplacePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentRequest request;
    public SearchCreateOrReplaceRequest withRequest(com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentRequest request) {
        this.request = request;
        return this;
    }
    
}
