package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HealthCheckResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("response")
    public String response;
    public HealthCheckResponse withResponse(String response) {
        this.response = response;
        return this;
    }
    
}
