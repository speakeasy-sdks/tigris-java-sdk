/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateByIdResponse - OK
 */

public class CreateByIdResponse {
    /**
     * Returns the id of the created document.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CreateByIdResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    public CreateByIdResponse(){}
}
