package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_in_ms")
    public Long expiresInMs;
    public GetResponse withExpiresInMs(Long expiresInMs) {
        this.expiresInMs = expiresInMs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public String value;
    public GetResponse withValue(String value) {
        this.value = value;
        return this;
    }
    
}
