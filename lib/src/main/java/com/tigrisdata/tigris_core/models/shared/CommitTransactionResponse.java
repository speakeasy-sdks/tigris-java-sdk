package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CommitTransactionResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;
    public CommitTransactionResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    
}
