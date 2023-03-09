package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteAppKeyRequest
 * Request deletion of an app key
**/
public class DeleteAppKeyRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public DeleteAppKeyRequest withId(String id) {
        this.id = id;
        return this;
    }
    
}
