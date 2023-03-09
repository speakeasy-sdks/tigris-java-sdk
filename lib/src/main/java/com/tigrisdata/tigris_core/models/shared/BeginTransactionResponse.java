package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BeginTransactionResponse
 * Start transaction returns transaction context  which uniquely identifies the transaction
**/
public class BeginTransactionResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tx_ctx")
    public TransactionCtx txCtx;
    public BeginTransactionResponse withTxCtx(TransactionCtx txCtx) {
        this.txCtx = txCtx;
        return this;
    }
    
}
