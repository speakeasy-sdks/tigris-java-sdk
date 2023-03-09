package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteBranchResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public DeleteBranchResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;
    public DeleteBranchResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    
}
