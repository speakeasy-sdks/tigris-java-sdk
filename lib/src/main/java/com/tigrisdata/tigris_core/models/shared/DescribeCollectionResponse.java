/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DescribeCollectionResponse - A detailed description of the collection. The description returns collection metadata and the schema.
 */
public class DescribeCollectionResponse {
    /**
     * Name of the collection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collection")
    public String collection;

    public DescribeCollectionResponse withCollection(String collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public CollectionMetadata metadata;

    public DescribeCollectionResponse withMetadata(CollectionMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * Schema of this collection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public DescribeCollectionResponseSchema schema;

    public DescribeCollectionResponse withSchema(DescribeCollectionResponseSchema schema) {
        this.schema = schema;
        return this;
    }
    
    /**
     * The size of this collection in bytes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Long size;

    public DescribeCollectionResponse withSize(Long size) {
        this.size = size;
        return this;
    }
    
    public DescribeCollectionResponse(){}
}
