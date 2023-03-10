package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUserMetadataResponse
 * User metadata response
**/
public class GetUserMetadataResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadataKey")
    public String metadataKey;
    public GetUserMetadataResponse withMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceId")
    public Long namespaceId;
    public GetUserMetadataResponse withNamespaceId(Long namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userId")
    public String userId;
    public GetUserMetadataResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public String value;
    public GetUserMetadataResponse withValue(String value) {
        this.value = value;
        return this;
    }
    
}
