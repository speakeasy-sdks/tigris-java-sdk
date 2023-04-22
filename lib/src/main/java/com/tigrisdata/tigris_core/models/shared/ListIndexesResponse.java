/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListIndexesResponse - OK
 */
public class ListIndexesResponse {
    /**
     * List of indexes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("indexes")
    public IndexInfo[] indexes;
    public ListIndexesResponse withIndexes(IndexInfo[] indexes) {
        this.indexes = indexes;
        return this;
    }
    

    public ListIndexesResponse(){}
}
