package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ManagementInsertNamespaceMetadataRequest {
    public ManagementInsertNamespaceMetadataPathParams pathParams;
    public ManagementInsertNamespaceMetadataRequest withPathParams(ManagementInsertNamespaceMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest request;
    public ManagementInsertNamespaceMetadataRequest withRequest(com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest request) {
        this.request = request;
        return this;
    }
    
}
