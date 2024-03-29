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
 * QuotaLimitsResponse - Contains current quota limits
 */

public class QuotaLimitsResponse {

    /**
     * Number of allowed read units per second
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ReadUnits")
    private Optional<? extends Long> readUnits;

    /**
     * Maximum number of bytes allowed to store
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("StorageSize")
    private Optional<? extends Long> storageSize;

    /**
     * Number of allowed write units per second
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("WriteUnits")
    private Optional<? extends Long> writeUnits;

    public QuotaLimitsResponse(
            @JsonProperty("ReadUnits") Optional<? extends Long> readUnits,
            @JsonProperty("StorageSize") Optional<? extends Long> storageSize,
            @JsonProperty("WriteUnits") Optional<? extends Long> writeUnits) {
        Utils.checkNotNull(readUnits, "readUnits");
        Utils.checkNotNull(storageSize, "storageSize");
        Utils.checkNotNull(writeUnits, "writeUnits");
        this.readUnits = readUnits;
        this.storageSize = storageSize;
        this.writeUnits = writeUnits;
    }

    /**
     * Number of allowed read units per second
     */
    public Optional<? extends Long> readUnits() {
        return readUnits;
    }

    /**
     * Maximum number of bytes allowed to store
     */
    public Optional<? extends Long> storageSize() {
        return storageSize;
    }

    /**
     * Number of allowed write units per second
     */
    public Optional<? extends Long> writeUnits() {
        return writeUnits;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Number of allowed read units per second
     */
    public QuotaLimitsResponse withReadUnits(long readUnits) {
        Utils.checkNotNull(readUnits, "readUnits");
        this.readUnits = Optional.ofNullable(readUnits);
        return this;
    }

    /**
     * Number of allowed read units per second
     */
    public QuotaLimitsResponse withReadUnits(Optional<? extends Long> readUnits) {
        Utils.checkNotNull(readUnits, "readUnits");
        this.readUnits = readUnits;
        return this;
    }

    /**
     * Maximum number of bytes allowed to store
     */
    public QuotaLimitsResponse withStorageSize(long storageSize) {
        Utils.checkNotNull(storageSize, "storageSize");
        this.storageSize = Optional.ofNullable(storageSize);
        return this;
    }

    /**
     * Maximum number of bytes allowed to store
     */
    public QuotaLimitsResponse withStorageSize(Optional<? extends Long> storageSize) {
        Utils.checkNotNull(storageSize, "storageSize");
        this.storageSize = storageSize;
        return this;
    }

    /**
     * Number of allowed write units per second
     */
    public QuotaLimitsResponse withWriteUnits(long writeUnits) {
        Utils.checkNotNull(writeUnits, "writeUnits");
        this.writeUnits = Optional.ofNullable(writeUnits);
        return this;
    }

    /**
     * Number of allowed write units per second
     */
    public QuotaLimitsResponse withWriteUnits(Optional<? extends Long> writeUnits) {
        Utils.checkNotNull(writeUnits, "writeUnits");
        this.writeUnits = writeUnits;
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
        QuotaLimitsResponse other = (QuotaLimitsResponse) o;
        return 
            java.util.Objects.deepEquals(this.readUnits, other.readUnits) &&
            java.util.Objects.deepEquals(this.storageSize, other.storageSize) &&
            java.util.Objects.deepEquals(this.writeUnits, other.writeUnits);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            readUnits,
            storageSize,
            writeUnits);
    }
    
    @Override
    public String toString() {
        return Utils.toString(QuotaLimitsResponse.class,
                "readUnits", readUnits,
                "storageSize", storageSize,
                "writeUnits", writeUnits);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> readUnits = Optional.empty();
 
        private Optional<? extends Long> storageSize = Optional.empty();
 
        private Optional<? extends Long> writeUnits = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Number of allowed read units per second
         */
        public Builder readUnits(long readUnits) {
            Utils.checkNotNull(readUnits, "readUnits");
            this.readUnits = Optional.ofNullable(readUnits);
            return this;
        }

        /**
         * Number of allowed read units per second
         */
        public Builder readUnits(Optional<? extends Long> readUnits) {
            Utils.checkNotNull(readUnits, "readUnits");
            this.readUnits = readUnits;
            return this;
        }

        /**
         * Maximum number of bytes allowed to store
         */
        public Builder storageSize(long storageSize) {
            Utils.checkNotNull(storageSize, "storageSize");
            this.storageSize = Optional.ofNullable(storageSize);
            return this;
        }

        /**
         * Maximum number of bytes allowed to store
         */
        public Builder storageSize(Optional<? extends Long> storageSize) {
            Utils.checkNotNull(storageSize, "storageSize");
            this.storageSize = storageSize;
            return this;
        }

        /**
         * Number of allowed write units per second
         */
        public Builder writeUnits(long writeUnits) {
            Utils.checkNotNull(writeUnits, "writeUnits");
            this.writeUnits = Optional.ofNullable(writeUnits);
            return this;
        }

        /**
         * Number of allowed write units per second
         */
        public Builder writeUnits(Optional<? extends Long> writeUnits) {
            Utils.checkNotNull(writeUnits, "writeUnits");
            this.writeUnits = writeUnits;
            return this;
        }
        
        public QuotaLimitsResponse build() {
            return new QuotaLimitsResponse(
                readUnits,
                storageSize,
                writeUnits);
        }
    }
}

