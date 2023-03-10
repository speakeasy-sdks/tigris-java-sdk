package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ManagementGetUserMetadataRequest {
    public ManagementGetUserMetadataPathParams pathParams;
    public ManagementGetUserMetadataRequest withPathParams(ManagementGetUserMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.GetUserMetadataRequest request;
    public ManagementGetUserMetadataRequest withRequest(com.tigrisdata.tigris_core.models.shared.GetUserMetadataRequest request) {
        this.request = request;
        return this;
    }
    
}
