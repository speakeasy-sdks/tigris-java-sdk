package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DescribeCollectionResponse
 * A detailed description of the collection. The description returns collection metadata and the schema.
**/
public class DescribeCollectionResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collection")
    public String collection;
    public DescribeCollectionResponse withCollection(String collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public DescribeCollectionResponse withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public java.util.Map<String, Object> schema;
    public DescribeCollectionResponse withSchema(java.util.Map<String, Object> schema) {
        this.schema = schema;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Long size;
    public DescribeCollectionResponse withSize(Long size) {
        this.size = size;
        return this;
    }
    
}
