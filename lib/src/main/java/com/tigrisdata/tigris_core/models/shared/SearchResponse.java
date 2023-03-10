package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SearchResponse
 * Response struct for search
**/
public class SearchResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("facets")
    public java.util.Map<String, SearchFacet> facets;
    public SearchResponse withFacets(java.util.Map<String, SearchFacet> facets) {
        this.facets = facets;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hits")
    public SearchHit[] hits;
    public SearchResponse withHits(SearchHit[] hits) {
        this.hits = hits;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    public SearchMetadata meta;
    public SearchResponse withMeta(SearchMetadata meta) {
        this.meta = meta;
        return this;
    }
    
}
