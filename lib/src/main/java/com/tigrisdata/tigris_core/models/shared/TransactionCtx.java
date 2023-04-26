/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TransactionCtx - Contains ID which uniquely identifies transaction This context is returned by BeginTransaction request and should be passed in the metadata (headers) of subsequent requests in order to run them in the context of the same transaction.
 */
public class TransactionCtx {
    /**
     * Unique for a single transactional request.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TransactionCtx withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Serves as an internal identifier.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("origin")
    public String origin;
    public TransactionCtx withOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    
    public TransactionCtx(){}
}
