package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ManagementUpdateUserMetadataRequest {
    public ManagementUpdateUserMetadataPathParams pathParams;
    public ManagementUpdateUserMetadataRequest withPathParams(ManagementUpdateUserMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequest request;
    public ManagementUpdateUserMetadataRequest withRequest(com.tigrisdata.tigris_core.models.shared.UpdateUserMetadataRequest request) {
        this.request = request;
        return this;
    }
    
}
