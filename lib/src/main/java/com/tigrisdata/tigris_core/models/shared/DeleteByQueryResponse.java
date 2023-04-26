/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteByQueryResponse - OK
 */
public class DeleteByQueryResponse {
    /**
     * The number of documents deleted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("count")
    public Integer count;
    public DeleteByQueryResponse withCount(Integer count) {
        this.count = count;
        return this;
    }
    
    public DeleteByQueryResponse(){}
}
