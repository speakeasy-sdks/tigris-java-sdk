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


public class UpdateResponse {

    /**
     * Has metadata related to the documents stored.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends ResponseMetadata> metadata;

    /**
     * Returns the number of documents modified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modified_count")
    private Optional<? extends Integer> modifiedCount;

    /**
     * an enum with value set as "updated".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends String> status;

    public UpdateResponse(
            @JsonProperty("metadata") Optional<? extends ResponseMetadata> metadata,
            @JsonProperty("modified_count") Optional<? extends Integer> modifiedCount,
            @JsonProperty("status") Optional<? extends String> status) {
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(modifiedCount, "modifiedCount");
        Utils.checkNotNull(status, "status");
        this.metadata = metadata;
        this.modifiedCount = modifiedCount;
        this.status = status;
    }

    /**
     * Has metadata related to the documents stored.
     */
    public Optional<? extends ResponseMetadata> metadata() {
        return metadata;
    }

    /**
     * Returns the number of documents modified.
     */
    public Optional<? extends Integer> modifiedCount() {
        return modifiedCount;
    }

    /**
     * an enum with value set as "updated".
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
    public UpdateResponse withMetadata(ResponseMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Has metadata related to the documents stored.
     */
    public UpdateResponse withMetadata(Optional<? extends ResponseMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * Returns the number of documents modified.
     */
    public UpdateResponse withModifiedCount(int modifiedCount) {
        Utils.checkNotNull(modifiedCount, "modifiedCount");
        this.modifiedCount = Optional.ofNullable(modifiedCount);
        return this;
    }

    /**
     * Returns the number of documents modified.
     */
    public UpdateResponse withModifiedCount(Optional<? extends Integer> modifiedCount) {
        Utils.checkNotNull(modifiedCount, "modifiedCount");
        this.modifiedCount = modifiedCount;
        return this;
    }

    /**
     * an enum with value set as "updated".
     */
    public UpdateResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * an enum with value set as "updated".
     */
    public UpdateResponse withStatus(Optional<? extends String> status) {
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
        UpdateResponse other = (UpdateResponse) o;
        return 
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.modifiedCount, other.modifiedCount) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            metadata,
            modifiedCount,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateResponse.class,
                "metadata", metadata,
                "modifiedCount", modifiedCount,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends ResponseMetadata> metadata = Optional.empty();
 
        private Optional<? extends Integer> modifiedCount = Optional.empty();
 
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
         * Returns the number of documents modified.
         */
        public Builder modifiedCount(int modifiedCount) {
            Utils.checkNotNull(modifiedCount, "modifiedCount");
            this.modifiedCount = Optional.ofNullable(modifiedCount);
            return this;
        }

        /**
         * Returns the number of documents modified.
         */
        public Builder modifiedCount(Optional<? extends Integer> modifiedCount) {
            Utils.checkNotNull(modifiedCount, "modifiedCount");
            this.modifiedCount = modifiedCount;
            return this;
        }

        /**
         * an enum with value set as "updated".
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * an enum with value set as "updated".
         */
        public Builder status(Optional<? extends String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public UpdateResponse build() {
            return new UpdateResponse(
                metadata,
                modifiedCount,
                status);
        }
    }
}

