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

/**
 * CommitTransactionRequest - Commit transaction with the given ID
 */

public class CommitTransactionRequest {

    /**
     * Optionally specify a database branch name to perform operation on
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    private Optional<? extends String> branch;

    public CommitTransactionRequest(
            @JsonProperty("branch") Optional<? extends String> branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = branch;
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public Optional<? extends String> branch() {
        return branch;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public CommitTransactionRequest withBranch(String branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = Optional.ofNullable(branch);
        return this;
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public CommitTransactionRequest withBranch(Optional<? extends String> branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = branch;
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
        CommitTransactionRequest other = (CommitTransactionRequest) o;
        return 
            java.util.Objects.deepEquals(this.branch, other.branch);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            branch);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CommitTransactionRequest.class,
                "branch", branch);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> branch = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Optionally specify a database branch name to perform operation on
         */
        public Builder branch(String branch) {
            Utils.checkNotNull(branch, "branch");
            this.branch = Optional.ofNullable(branch);
            return this;
        }

        /**
         * Optionally specify a database branch name to perform operation on
         */
        public Builder branch(Optional<? extends String> branch) {
            Utils.checkNotNull(branch, "branch");
            this.branch = branch;
            return this;
        }
        
        public CommitTransactionRequest build() {
            return new CommitTransactionRequest(
                branch);
        }
    }
}
