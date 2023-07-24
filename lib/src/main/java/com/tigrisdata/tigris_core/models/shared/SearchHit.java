/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchHit {
    /**
     * Actual search document
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public SearchHitData data;

    public SearchHit withData(SearchHitData data) {
        this.data = data;
        return this;
    }
    
    /**
     * Contains metadata related to the search hit, has information about document created_at/updated_at as well.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public SearchHitMeta metadata;

    public SearchHit withMetadata(SearchHitMeta metadata) {
        this.metadata = metadata;
        return this;
    }
    
    public SearchHit(){}
}
