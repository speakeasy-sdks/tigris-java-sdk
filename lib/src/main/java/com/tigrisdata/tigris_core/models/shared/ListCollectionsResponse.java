/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListCollectionsResponse - OK
 */

public class ListCollectionsResponse {
    /**
     * List of the collections info in the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collections")
    public CollectionInfo[] collections;

    public ListCollectionsResponse withCollections(CollectionInfo[] collections) {
        this.collections = collections;
        return this;
    }
    
    public ListCollectionsResponse(){}
}
