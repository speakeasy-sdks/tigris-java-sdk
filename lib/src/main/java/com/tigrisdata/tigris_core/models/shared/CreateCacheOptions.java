package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCacheOptions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ttl_ms")
    public Long ttlMs;
    public CreateCacheOptions withTtlMs(Long ttlMs) {
        this.ttlMs = ttlMs;
        return this;
    }
    
}
