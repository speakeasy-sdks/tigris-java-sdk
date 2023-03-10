package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateUserMetadataResponse
 * Update of user metadata response
**/
public class UpdateUserMetadataResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadataKey")
    public String metadataKey;
    public UpdateUserMetadataResponse withMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceId")
    public Long namespaceId;
    public UpdateUserMetadataResponse withNamespaceId(Long namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userId")
    public String userId;
    public UpdateUserMetadataResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public java.util.Map<String, Object> value;
    public UpdateUserMetadataResponse withValue(java.util.Map<String, Object> value) {
        this.value = value;
        return this;
    }
    
}
