package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KeysResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cursor")
    public Long cursor;
    public KeysResponse withCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keys")
    public String[] keys;
    public KeysResponse withKeys(String[] keys) {
        this.keys = keys;
        return this;
    }
    
}
