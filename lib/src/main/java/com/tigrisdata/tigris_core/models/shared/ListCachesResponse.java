package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListCachesResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("caches")
    public CacheMetadata[] caches;
    public ListCachesResponse withCaches(CacheMetadata[] caches) {
        this.caches = caches;
        return this;
    }
    
}
