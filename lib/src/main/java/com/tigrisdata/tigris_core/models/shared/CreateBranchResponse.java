/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateBranchResponse - OK
 */
public class CreateBranchResponse {
    /**
     * A detailed response message.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public CreateBranchResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * An enum with value set as "created".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;
    public CreateBranchResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    
    public CreateBranchResponse(){}
}
