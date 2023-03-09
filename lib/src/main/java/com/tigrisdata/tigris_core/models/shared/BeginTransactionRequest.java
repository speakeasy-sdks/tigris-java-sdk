package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BeginTransactionRequest
 * Start new transaction in project specified by "project".
**/
public class BeginTransactionRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public BeginTransactionRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public java.util.Map<String, Object> options;
    public BeginTransactionRequest withOptions(java.util.Map<String, Object> options) {
        this.options = options;
        return this;
    }
    
}
