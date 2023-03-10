package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAppKeyResponse
 * CreateAppKeyResponse returns created app keys
**/
public class CreateAppKeyResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_app_key")
    public AppKey createdAppKey;
    public CreateAppKeyResponse withCreatedAppKey(AppKey createdAppKey) {
        this.createdAppKey = createdAppKey;
        return this;
    }
    
}
