package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RotateAppKeyResponse
 * RotateAppKeyResponse returns the new app key with rotated secret
**/
public class RotateAppKeyResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_key")
    public AppKey appKey;
    public RotateAppKeyResponse withAppKey(AppKey appKey) {
        this.appKey = appKey;
        return this;
    }
    
}
