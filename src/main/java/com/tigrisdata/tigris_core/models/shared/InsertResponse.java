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


public class InsertResponse {

    /**
     * an array returns the value of the primary keys.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keys")
    private Optional<? extends java.util.List<String>> keys;

    /**
     * Has metadata related to the documents stored.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends ResponseMetadata> metadata;

    /**
     * An enum with value set as "inserted"
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends String> status;

    public InsertResponse(
            @JsonProperty("keys") Optional<? extends java.util.List<String>> keys,
            @JsonProperty("metadata") Optional<? extends ResponseMetadata> metadata,
            @JsonProperty("status") Optional<? extends String> status) {
        Utils.checkNotNull(keys, "keys");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(status, "status");
        this.keys = keys;
        this.metadata = metadata;
        this.status = status;
    }

    /**
     * an array returns the value of the primary keys.
     */
    public Optional<? extends java.util.List<String>> keys() {
        return keys;
    }

    /**
     * Has metadata related to the documents stored.
     */
    public Optional<? extends ResponseMetadata> metadata() {
        return metadata;
    }

    /**
     * An enum with value set as "inserted"
     */
    public Optional<? extends String> status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * an array returns the value of the primary keys.
     */
    public InsertResponse withKeys(java.util.List<String> keys) {
        Utils.checkNotNull(keys, "keys");
        this.keys = Optional.ofNullable(keys);
        return this;
    }

    /**
     * an array returns the value of the primary keys.
     */
    public InsertResponse withKeys(Optional<? extends java.util.List<String>> keys) {
        Utils.checkNotNull(keys, "keys");
        this.keys = keys;
        return this;
    }

    /**
     * Has metadata related to the documents stored.
     */
    public InsertResponse withMetadata(ResponseMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Has metadata related to the documents stored.
     */
    public InsertResponse withMetadata(Optional<? extends ResponseMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * An enum with value set as "inserted"
     */
    public InsertResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * An enum with value set as "inserted"
     */
    public InsertResponse withStatus(Optional<? extends String> status) {
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
        InsertResponse other = (InsertResponse) o;
        return 
            java.util.Objects.deepEquals(this.keys, other.keys) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            keys,
            metadata,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InsertResponse.class,
                "keys", keys,
                "metadata", metadata,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<String>> keys = Optional.empty();
 
        private Optional<? extends ResponseMetadata> metadata = Optional.empty();
 
        private Optional<? extends String> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * an array returns the value of the primary keys.
         */
        public Builder keys(java.util.List<String> keys) {
            Utils.checkNotNull(keys, "keys");
            this.keys = Optional.ofNullable(keys);
            return this;
        }

        /**
         * an array returns the value of the primary keys.
         */
        public Builder keys(Optional<? extends java.util.List<String>> keys) {
            Utils.checkNotNull(keys, "keys");
            this.keys = keys;
            return this;
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
         * An enum with value set as "inserted"
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * An enum with value set as "inserted"
         */
        public Builder status(Optional<? extends String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public InsertResponse build() {
            return new InsertResponse(
                keys,
                metadata,
                status);
        }
    }
}

