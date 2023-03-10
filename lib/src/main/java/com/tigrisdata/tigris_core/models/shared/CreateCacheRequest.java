package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCacheRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public CreateCacheOptions options;
    public CreateCacheRequest withOptions(CreateCacheOptions options) {
        this.options = options;
        return this;
    }
    
}
