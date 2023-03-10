package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ManagementInsertUserMetadataRequest {
    public ManagementInsertUserMetadataPathParams pathParams;
    public ManagementInsertUserMetadataRequest withPathParams(ManagementInsertUserMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.InsertUserMetadataRequest request;
    public ManagementInsertUserMetadataRequest withRequest(com.tigrisdata.tigris_core.models.shared.InsertUserMetadataRequest request) {
        this.request = request;
        return this;
    }
    
}
