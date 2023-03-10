package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListAppKeysResponse
 * ListAppKeysResponse returns one or more visible app keys to user
**/
public class ListAppKeysResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_keys")
    public AppKey[] appKeys;
    public ListAppKeysResponse withAppKeys(AppKey[] appKeys) {
        this.appKeys = appKeys;
        return this;
    }
    
}
