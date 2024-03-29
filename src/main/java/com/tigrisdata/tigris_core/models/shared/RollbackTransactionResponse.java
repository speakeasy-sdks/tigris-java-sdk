/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.tigrisdata.tigris_core.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class RollbackTransactionResponse {

    /**
     * Status of rollback transaction operation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends String> status;

    public RollbackTransactionResponse(
            @JsonProperty("status") Optional<? extends String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
    }

    /**
     * Status of rollback transaction operation.
     */
    public Optional<? extends String> status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Status of rollback transaction operation.
     */
    public RollbackTransactionResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Status of rollback transaction operation.
     */
    public RollbackTransactionResponse withStatus(Optional<? extends String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RollbackTransactionResponse other = (RollbackTransactionResponse) o;
        return 
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RollbackTransactionResponse.class,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Status of rollback transaction operation.
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Status of rollback transaction operation.
         */
        public Builder status(Optional<? extends String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public RollbackTransactionResponse build() {
            return new RollbackTransactionResponse(
                status);
        }
    }
}

