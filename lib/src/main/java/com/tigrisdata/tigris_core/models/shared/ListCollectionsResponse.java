package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListCollectionsResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collections")
    public CollectionInfo[] collections;
    public ListCollectionsResponse withCollections(CollectionInfo[] collections) {
        this.collections = collections;
        return this;
    }
    
}
