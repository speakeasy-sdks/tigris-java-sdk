/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tigrisdata.tigris_core.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

/**
 * ResponseMetadata - Has metadata related to the documents stored.
 */

public class ResponseMetadata {

    /**
     * Time at which the document was inserted/replaced. Measured in nano-seconds since the Unix epoch.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<? extends OffsetDateTime> createdAt;

    /**
     * Time at which the document was deleted. Measured in nano-seconds since the Unix epoch.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted_at")
    private Optional<? extends OffsetDateTime> deletedAt;

    /**
     * Time at which the document was updated. Measured in nano-seconds since the Unix epoch.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<? extends OffsetDateTime> updatedAt;

    public ResponseMetadata(
            @JsonProperty("created_at") Optional<? extends OffsetDateTime> createdAt,
            @JsonProperty("deleted_at") Optional<? extends OffsetDateTime> deletedAt,
            @JsonProperty("updated_at") Optional<? extends OffsetDateTime> updatedAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(deletedAt, "deletedAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Time at which the document was inserted/replaced. Measured in nano-seconds since the Unix epoch.
     */
    public Optional<? extends OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * Time at which the document was deleted. Measured in nano-seconds since the Unix epoch.
     */
    public Optional<? extends OffsetDateTime> deletedAt() {
        return deletedAt;
    }

    /**
     * Time at which the document was updated. Measured in nano-seconds since the Unix epoch.
     */
    public Optional<? extends OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Time at which the document was inserted/replaced. Measured in nano-seconds since the Unix epoch.
     */
    public ResponseMetadata withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Time at which the document was inserted/replaced. Measured in nano-seconds since the Unix epoch.
     */
    public ResponseMetadata withCreatedAt(Optional<? extends OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Time at which the document was deleted. Measured in nano-seconds since the Unix epoch.
     */
    public ResponseMetadata withDeletedAt(OffsetDateTime deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = Optional.ofNullable(deletedAt);
        return this;
    }

    /**
     * Time at which the document was deleted. Measured in nano-seconds since the Unix epoch.
     */
    public ResponseMetadata withDeletedAt(Optional<? extends OffsetDateTime> deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * Time at which the document was updated. Measured in nano-seconds since the Unix epoch.
     */
    public ResponseMetadata withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Time at which the document was updated. Measured in nano-seconds since the Unix epoch.
     */
    public ResponseMetadata withUpdatedAt(Optional<? extends OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        ResponseMetadata other = (ResponseMetadata) o;
        return 
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.deletedAt, other.deletedAt) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createdAt,
            deletedAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ResponseMetadata.class,
                "createdAt", createdAt,
                "deletedAt", deletedAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<? extends OffsetDateTime> deletedAt = Optional.empty();
 
        private Optional<? extends OffsetDateTime> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Time at which the document was inserted/replaced. Measured in nano-seconds since the Unix epoch.
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        /**
         * Time at which the document was inserted/replaced. Measured in nano-seconds since the Unix epoch.
         */
        public Builder createdAt(Optional<? extends OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Time at which the document was deleted. Measured in nano-seconds since the Unix epoch.
         */
        public Builder deletedAt(OffsetDateTime deletedAt) {
            Utils.checkNotNull(deletedAt, "deletedAt");
            this.deletedAt = Optional.ofNullable(deletedAt);
            return this;
        }

        /**
         * Time at which the document was deleted. Measured in nano-seconds since the Unix epoch.
         */
        public Builder deletedAt(Optional<? extends OffsetDateTime> deletedAt) {
            Utils.checkNotNull(deletedAt, "deletedAt");
            this.deletedAt = deletedAt;
            return this;
        }

        /**
         * Time at which the document was updated. Measured in nano-seconds since the Unix epoch.
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        /**
         * Time at which the document was updated. Measured in nano-seconds since the Unix epoch.
         */
        public Builder updatedAt(Optional<? extends OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public ResponseMetadata build() {
            return new ResponseMetadata(
                createdAt,
                deletedAt,
                updatedAt);
        }
    }
}

