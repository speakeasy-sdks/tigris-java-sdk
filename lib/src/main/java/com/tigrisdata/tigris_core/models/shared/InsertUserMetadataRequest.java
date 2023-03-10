package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InsertUserMetadataRequest
 * Request insertion of user metadata
**/
public class InsertUserMetadataRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadataKey")
    public String metadataKey;
    public InsertUserMetadataRequest withMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public java.util.Map<String, Object> value;
    public InsertUserMetadataRequest withValue(java.util.Map<String, Object> value) {
        this.value = value;
        return this;
    }
    
}
