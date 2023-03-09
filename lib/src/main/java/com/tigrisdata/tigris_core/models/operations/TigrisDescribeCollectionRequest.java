package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisDescribeCollectionRequest {
    public TigrisDescribeCollectionPathParams pathParams;
    public TigrisDescribeCollectionRequest withPathParams(TigrisDescribeCollectionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.DescribeCollectionRequest request;
    public TigrisDescribeCollectionRequest withRequest(com.tigrisdata.tigris_core.models.shared.DescribeCollectionRequest request) {
        this.request = request;
        return this;
    }
    
}
