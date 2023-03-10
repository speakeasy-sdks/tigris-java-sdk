package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class CreateNamespaceRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.CreateNamespaceRequest request;
    public CreateNamespaceRequest withRequest(com.tigrisdata.tigris_core.models.shared.CreateNamespaceRequest request) {
        this.request = request;
        return this;
    }
    
}
