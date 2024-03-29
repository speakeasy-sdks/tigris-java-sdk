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
 * DeleteAppKeyResponse - AppKeys returns the flag to convey if app key was deleted
 */

public class DeleteAppKeyResponse {

    /**
     * status flag for delete operation
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted")
    private Optional<? extends Boolean> deleted;

    public DeleteAppKeyResponse(
            @JsonProperty("deleted") Optional<? extends Boolean> deleted) {
        Utils.checkNotNull(deleted, "deleted");
        this.deleted = deleted;
    }

    /**
     * status flag for delete operation
     */
    public Optional<? extends Boolean> deleted() {
        return deleted;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * status flag for delete operation
     */
    public DeleteAppKeyResponse withDeleted(boolean deleted) {
        Utils.checkNotNull(deleted, "deleted");
        this.deleted = Optional.ofNullable(deleted);
        return this;
    }

    /**
     * status flag for delete operation
     */
    public DeleteAppKeyResponse withDeleted(Optional<? extends Boolean> deleted) {
        Utils.checkNotNull(deleted, "deleted");
        this.deleted = deleted;
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
        DeleteAppKeyResponse other = (DeleteAppKeyResponse) o;
        return 
            java.util.Objects.deepEquals(this.deleted, other.deleted);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            deleted);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteAppKeyResponse.class,
                "deleted", deleted);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> deleted = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * status flag for delete operation
         */
        public Builder deleted(boolean deleted) {
            Utils.checkNotNull(deleted, "deleted");
            this.deleted = Optional.ofNullable(deleted);
            return this;
        }

        /**
         * status flag for delete operation
         */
        public Builder deleted(Optional<? extends Boolean> deleted) {
            Utils.checkNotNull(deleted, "deleted");
            this.deleted = deleted;
            return this;
        }
        
        public DeleteAppKeyResponse build() {
            return new DeleteAppKeyResponse(
                deleted);
        }
    }
}

