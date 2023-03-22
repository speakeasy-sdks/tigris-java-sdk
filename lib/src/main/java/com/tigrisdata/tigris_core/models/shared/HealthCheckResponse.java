/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HealthCheckResponse - OK
 */
public class HealthCheckResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("response")public String response;
    public HealthCheckResponse withResponse(String response) {
        this.response = response;
        return this;
    }
    
}
