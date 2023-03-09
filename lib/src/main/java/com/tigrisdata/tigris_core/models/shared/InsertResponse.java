package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InsertResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keys")
    public String[] keys;
    public InsertResponse withKeys(String[] keys) {
        this.keys = keys;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public ResponseMetadata metadata;
    public InsertResponse withMetadata(ResponseMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;
    public InsertResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    
}
