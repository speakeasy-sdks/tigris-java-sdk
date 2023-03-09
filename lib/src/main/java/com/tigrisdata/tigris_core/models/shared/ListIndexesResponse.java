package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListIndexesResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("indexes")
    public IndexInfo[] indexes;
    public ListIndexesResponse withIndexes(IndexInfo[] indexes) {
        this.indexes = indexes;
        return this;
    }
    
}
