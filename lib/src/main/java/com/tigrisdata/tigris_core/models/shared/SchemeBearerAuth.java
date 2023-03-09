package com.tigrisdata.tigris_core.models.shared;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SchemeBearerAuth {
    @SpeakeasyMetadata("security:name=Authorization")
    public String authorization;
    public SchemeBearerAuth withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    
}
