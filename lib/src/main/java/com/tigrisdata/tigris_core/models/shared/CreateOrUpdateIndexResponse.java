/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateOrUpdateIndexResponse - OK
 */
public class CreateOrUpdateIndexResponse {
    /**
     * A detailed response message.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public CreateOrUpdateIndexResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * An enum with value set as "created"
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;
    public CreateOrUpdateIndexResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    

    public CreateOrUpdateIndexResponse(){}
}
