package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DescribeDatabaseResponse
 * A detailed description of the database and all the associated collections. Description of the collection includes schema details as well.
**/
public class DescribeDatabaseResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branches")
    public String[] branches;
    public DescribeDatabaseResponse withBranches(String[] branches) {
        this.branches = branches;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collections")
    public CollectionDescription[] collections;
    public DescribeDatabaseResponse withCollections(CollectionDescription[] collections) {
        this.collections = collections;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public DescribeDatabaseResponse withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Long size;
    public DescribeDatabaseResponse withSize(Long size) {
        this.size = size;
        return this;
    }
    
}
