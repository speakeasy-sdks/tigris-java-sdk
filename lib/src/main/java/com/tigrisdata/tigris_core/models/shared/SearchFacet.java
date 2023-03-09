package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchFacet {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("counts")
    public FacetCount[] counts;
    public SearchFacet withCounts(FacetCount[] counts) {
        this.counts = counts;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stats")
    public FacetStats stats;
    public SearchFacet withStats(FacetStats stats) {
        this.stats = stats;
        return this;
    }
    
}
