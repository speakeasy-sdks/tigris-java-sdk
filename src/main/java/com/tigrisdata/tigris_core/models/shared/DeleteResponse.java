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


public class DeleteResponse {

    /**
     * Has metadata related to the documents stored.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends ResponseMetadata> metadata;

    /**
     * an enum with value set as "deleted"
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends String> status;

    public DeleteResponse(
            @JsonProperty("metadata") Optional<? extends ResponseMetadata> metadata,
            @JsonProperty("status") Optional<? extends String> status) {
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(status, "status");
        this.metadata = metadata;
        this.status = status;
    }

    /**
     * Has metadata related to the documents stored.
     */
    public Optional<? extends ResponseMetadata> metadata() {
        return metadata;
    }

    /**
     * an enum with value set as "deleted"
     */
    public Optional<? extends String> status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Has metadata related to the documents stored.
     */
    public DeleteResponse withMetadata(ResponseMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Has metadata related to the documents stored.
     */
    public DeleteResponse withMetadata(Optional<? extends ResponseMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * an enum with value set as "deleted"
     */
    public DeleteResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * an enum with value set as "deleted"
     */
    public DeleteResponse withStatus(Optional<? extends String> status) {
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
        DeleteResponse other = (DeleteResponse) o;
        return 
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            metadata,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteResponse.class,
                "metadata", metadata,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends ResponseMetadata> metadata = Optional.empty();
 
        private Optional<? extends String> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Has metadata related to the documents stored.
         */
        public Builder metadata(ResponseMetadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * Has metadata related to the documents stored.
         */
        public Builder metadata(Optional<? extends ResponseMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * an enum with value set as "deleted"
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * an enum with value set as "deleted"
         */
        public Builder status(Optional<? extends String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public DeleteResponse build() {
            return new DeleteResponse(
                metadata,
                status);
        }
    }
}
