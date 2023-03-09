package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Page
 * Pagination metadata for SearchResponse
**/
public class Page {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("current")
    public Integer current;
    public Page withCurrent(Integer current) {
        this.current = current;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Integer size;
    public Page withSize(Integer size) {
        this.size = size;
        return this;
    }
    
}
