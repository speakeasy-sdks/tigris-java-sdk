package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchCreateByIdRequest {
    public SearchCreateByIdPathParams pathParams;
    public SearchCreateByIdRequest withPathParams(SearchCreateByIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.CreateByIdRequest request;
    public SearchCreateByIdRequest withRequest(com.tigrisdata.tigris_core.models.shared.CreateByIdRequest request) {
        this.request = request;
        return this;
    }
    
}
