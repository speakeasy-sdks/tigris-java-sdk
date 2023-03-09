package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplaceResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keys")
    public String[] keys;
    public ReplaceResponse withKeys(String[] keys) {
        this.keys = keys;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public ResponseMetadata metadata;
    public ReplaceResponse withMetadata(ResponseMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;
    public ReplaceResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    
}
