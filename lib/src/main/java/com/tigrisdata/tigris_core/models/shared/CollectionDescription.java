/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CollectionDescription {
    /**
     * Name of the collection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collection")
    public String collection;
    public CollectionDescription withCollection(String collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public CollectionDescription withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * Collections schema
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public java.util.Map<String, Object> schema;
    public CollectionDescription withSchema(java.util.Map<String, Object> schema) {
        this.schema = schema;
        return this;
    }
    
    /**
     * Collection size in bytes
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Long size;
    public CollectionDescription withSize(Long size) {
        this.size = size;
        return this;
    }
    
}
