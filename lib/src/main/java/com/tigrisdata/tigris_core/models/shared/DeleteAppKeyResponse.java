package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteAppKeyResponse
 * AppKeys returns the flag to convey if app key was deleted
**/
public class DeleteAppKeyResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted")
    public Boolean deleted;
    public DeleteAppKeyResponse withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
}
