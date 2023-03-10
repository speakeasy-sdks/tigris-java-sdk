package com.tigrisdata.tigris_core.models.shared;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer")
    public SchemeBearerAuth bearerAuth;
    public Security withBearerAuth(SchemeBearerAuth bearerAuth) {
        this.bearerAuth = bearerAuth;
        return this;
    }
    
}
