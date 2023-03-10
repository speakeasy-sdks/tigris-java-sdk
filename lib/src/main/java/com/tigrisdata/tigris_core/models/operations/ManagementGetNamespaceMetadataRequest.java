package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ManagementGetNamespaceMetadataRequest {
    public ManagementGetNamespaceMetadataPathParams pathParams;
    public ManagementGetNamespaceMetadataRequest withPathParams(ManagementGetNamespaceMetadataPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.GetNamespaceMetadataRequest request;
    public ManagementGetNamespaceMetadataRequest withRequest(com.tigrisdata.tigris_core.models.shared.GetNamespaceMetadataRequest request) {
        this.request = request;
        return this;
    }
    
}
