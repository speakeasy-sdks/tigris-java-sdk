package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateNamespaceMetadataResponse
 * Update of namespace metadata response
**/
public class UpdateNamespaceMetadataResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadataKey")
    public String metadataKey;
    public UpdateNamespaceMetadataResponse withMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceId")
    public Long namespaceId;
    public UpdateNamespaceMetadataResponse withNamespaceId(Long namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public java.util.Map<String, Object> value;
    public UpdateNamespaceMetadataResponse withValue(java.util.Map<String, Object> value) {
        this.value = value;
        return this;
    }
    
}
