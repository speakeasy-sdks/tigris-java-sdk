package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SearchIndexResponse
 * Response struct for search
**/
public class SearchIndexResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("facets")
    public java.util.Map<String, SearchFacet> facets;
    public SearchIndexResponse withFacets(java.util.Map<String, SearchFacet> facets) {
        this.facets = facets;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hits")
    public IndexDoc[] hits;
    public SearchIndexResponse withHits(IndexDoc[] hits) {
        this.hits = hits;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    public SearchMetadata meta;
    public SearchIndexResponse withMeta(SearchMetadata meta) {
        this.meta = meta;
        return this;
    }
    
}
