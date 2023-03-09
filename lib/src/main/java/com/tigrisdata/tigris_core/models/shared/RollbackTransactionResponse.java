package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RollbackTransactionResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;
    public RollbackTransactionResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    
}
