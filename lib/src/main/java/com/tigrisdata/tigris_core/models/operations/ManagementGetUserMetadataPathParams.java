package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ManagementGetUserMetadataPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metadataKey")
    public String metadataKey;
    public ManagementGetUserMetadataPathParams withMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
        return this;
    }
    
}
