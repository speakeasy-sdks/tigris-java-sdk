/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DocStatus {
    /**
     * The Error type defines a logical error model
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    public Error error;
    public DocStatus withError(Error error) {
        this.error = error;
        return this;
    }
    
    /**
     * An id of the document.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public DocStatus withId(String id) {
        this.id = id;
        return this;
    }
    

    public DocStatus(){}
}
