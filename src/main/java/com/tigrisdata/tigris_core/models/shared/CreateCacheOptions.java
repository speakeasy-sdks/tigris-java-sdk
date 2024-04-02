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


public class CreateCacheOptions {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ttl_ms")
    private Optional<? extends Long> ttlMs;

    public CreateCacheOptions(
            @JsonProperty("ttl_ms") Optional<? extends Long> ttlMs) {
        Utils.checkNotNull(ttlMs, "ttlMs");
        this.ttlMs = ttlMs;
    }

    public Optional<? extends Long> ttlMs() {
        return ttlMs;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateCacheOptions withTtlMs(long ttlMs) {
        Utils.checkNotNull(ttlMs, "ttlMs");
        this.ttlMs = Optional.ofNullable(ttlMs);
        return this;
    }

    public CreateCacheOptions withTtlMs(Optional<? extends Long> ttlMs) {
        Utils.checkNotNull(ttlMs, "ttlMs");
        this.ttlMs = ttlMs;
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
        CreateCacheOptions other = (CreateCacheOptions) o;
        return 
            java.util.Objects.deepEquals(this.ttlMs, other.ttlMs);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            ttlMs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCacheOptions.class,
                "ttlMs", ttlMs);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> ttlMs = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ttlMs(long ttlMs) {
            Utils.checkNotNull(ttlMs, "ttlMs");
            this.ttlMs = Optional.ofNullable(ttlMs);
            return this;
        }

        public Builder ttlMs(Optional<? extends Long> ttlMs) {
            Utils.checkNotNull(ttlMs, "ttlMs");
            this.ttlMs = ttlMs;
            return this;
        }
        
        public CreateCacheOptions build() {
            return new CreateCacheOptions(
                ttlMs);
        }
    }
}
