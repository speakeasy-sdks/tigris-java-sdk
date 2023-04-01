/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InsertResponse - OK
 */
public class InsertResponse {
    /**
     * an array returns the value of the primary keys.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keys")
    public String[] keys;
    public InsertResponse withKeys(String[] keys) {
        this.keys = keys;
        return this;
    }
    
    /**
     * Has metadata related to the documents stored.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public ResponseMetadata metadata;
    public InsertResponse withMetadata(ResponseMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * An enum with value set as "inserted"
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;
    public InsertResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    
}
