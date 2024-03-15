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
 * ReplaceRequestOptions - Additional options for replace requests.
 */

public class ReplaceRequestOptions {

    /**
     * Additional options to modify write requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("write_options")
    private Optional<? extends WriteOptions> writeOptions;

    public ReplaceRequestOptions(
            @JsonProperty("write_options") Optional<? extends WriteOptions> writeOptions) {
        Utils.checkNotNull(writeOptions, "writeOptions");
        this.writeOptions = writeOptions;
    }

    /**
     * Additional options to modify write requests.
     */
    public Optional<? extends WriteOptions> writeOptions() {
        return writeOptions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Additional options to modify write requests.
     */
    public ReplaceRequestOptions withWriteOptions(WriteOptions writeOptions) {
        Utils.checkNotNull(writeOptions, "writeOptions");
        this.writeOptions = Optional.ofNullable(writeOptions);
        return this;
    }

    /**
     * Additional options to modify write requests.
     */
    public ReplaceRequestOptions withWriteOptions(Optional<? extends WriteOptions> writeOptions) {
        Utils.checkNotNull(writeOptions, "writeOptions");
        this.writeOptions = writeOptions;
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
        ReplaceRequestOptions other = (ReplaceRequestOptions) o;
        return 
            java.util.Objects.deepEquals(this.writeOptions, other.writeOptions);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            writeOptions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReplaceRequestOptions.class,
                "writeOptions", writeOptions);
    }
    
    public final static class Builder {
 
        private Optional<? extends WriteOptions> writeOptions = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Additional options to modify write requests.
         */
        public Builder writeOptions(WriteOptions writeOptions) {
            Utils.checkNotNull(writeOptions, "writeOptions");
            this.writeOptions = Optional.ofNullable(writeOptions);
            return this;
        }

        /**
         * Additional options to modify write requests.
         */
        public Builder writeOptions(Optional<? extends WriteOptions> writeOptions) {
            Utils.checkNotNull(writeOptions, "writeOptions");
            this.writeOptions = writeOptions;
            return this;
        }
        
        public ReplaceRequestOptions build() {
            return new ReplaceRequestOptions(
                writeOptions);
        }
    }
}

