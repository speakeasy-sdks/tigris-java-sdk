package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppKeyResponse
 * Returns response for updating the app key description
**/
public class UpdateAppKeyResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_app_key")
    public AppKey updatedAppKey;
    public UpdateAppKeyResponse withUpdatedAppKey(AppKey updatedAppKey) {
        this.updatedAppKey = updatedAppKey;
        return this;
    }
    
}
