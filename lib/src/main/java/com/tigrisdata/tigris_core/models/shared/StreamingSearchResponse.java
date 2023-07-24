/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StreamingSearchResponse - OK
 */

public class StreamingSearchResponse {
    /**
     * The Error type defines a logical error model
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    public Error error;

    public StreamingSearchResponse withError(Error error) {
        this.error = error;
        return this;
    }
    
    /**
     * Response struct for search
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    public SearchResponse result;

    public StreamingSearchResponse withResult(SearchResponse result) {
        this.result = result;
        return this;
    }
    
    public StreamingSearchResponse(){}
}
