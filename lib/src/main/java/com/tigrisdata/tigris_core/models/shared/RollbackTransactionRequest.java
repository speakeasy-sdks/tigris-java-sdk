package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RollbackTransactionRequest
 * Rollback transaction with the given ID
**/
public class RollbackTransactionRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public RollbackTransactionRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
}
