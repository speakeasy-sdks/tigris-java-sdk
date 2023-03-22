/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BeginTransactionResponse - Start transaction returns transaction context  which uniquely identifies the transaction
 */
public class BeginTransactionResponse {
    /**
     * Contains ID which uniquely identifies transaction This context is returned by BeginTransaction request and should be passed in the metadata (headers) of subsequent requests in order to run them in the context of the same transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tx_ctx")public TransactionCtx txCtx;
    public BeginTransactionResponse withTxCtx(TransactionCtx txCtx) {
        this.txCtx = txCtx;
        return this;
    }
    
}
