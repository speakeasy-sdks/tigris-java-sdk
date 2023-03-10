package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetIndexResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public IndexInfo index;
    public GetIndexResponse withIndex(IndexInfo index) {
        this.index = index;
        return this;
    }
    
}
