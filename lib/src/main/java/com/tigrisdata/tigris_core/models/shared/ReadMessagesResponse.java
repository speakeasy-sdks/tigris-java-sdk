/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReadMessagesResponse - OK
 */
public class ReadMessagesResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public Message message;

    public ReadMessagesResponse withMessage(Message message) {
        this.message = message;
        return this;
    }
    
    public ReadMessagesResponse(){}
}
