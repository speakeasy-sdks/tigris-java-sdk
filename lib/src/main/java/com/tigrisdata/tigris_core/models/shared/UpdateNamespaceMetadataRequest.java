package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateNamespaceMetadataRequest
 * Request update of namespace metadata
**/
public class UpdateNamespaceMetadataRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadataKey")
    public String metadataKey;
    public UpdateNamespaceMetadataRequest withMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public java.util.Map<String, Object> value;
    public UpdateNamespaceMetadataRequest withValue(java.util.Map<String, Object> value) {
        this.value = value;
        return this;
    }
    
}
