package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ManagementUpdateNamespaceMetadataRequest {
    public ManagementUpdateNamespaceMetadataPathParams pathParams;
    public ManagementUpdateNamespaceMetadataRequest withPathParams(ManagementUpdateNamespaceMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.UpdateNamespaceMetadataRequest request;
    public ManagementUpdateNamespaceMetadataRequest withRequest(com.tigrisdata.tigris_core.models.shared.UpdateNamespaceMetadataRequest request) {
        this.request = request;
        return this;
    }
    
}
