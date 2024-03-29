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
 * GetUserMetadataRequest - Request user metadata
 */

public class GetUserMetadataRequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadataKey")
    private Optional<? extends String> metadataKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<? extends GetUserMetadataRequestValue> value;

    public GetUserMetadataRequest(
            @JsonProperty("metadataKey") Optional<? extends String> metadataKey,
            @JsonProperty("value") Optional<? extends GetUserMetadataRequestValue> value) {
        Utils.checkNotNull(metadataKey, "metadataKey");
        Utils.checkNotNull(value, "value");
        this.metadataKey = metadataKey;
        this.value = value;
    }

    public Optional<? extends String> metadataKey() {
        return metadataKey;
    }

    public Optional<? extends GetUserMetadataRequestValue> value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetUserMetadataRequest withMetadataKey(String metadataKey) {
        Utils.checkNotNull(metadataKey, "metadataKey");
        this.metadataKey = Optional.ofNullable(metadataKey);
        return this;
    }

    public GetUserMetadataRequest withMetadataKey(Optional<? extends String> metadataKey) {
        Utils.checkNotNull(metadataKey, "metadataKey");
        this.metadataKey = metadataKey;
        return this;
    }

    public GetUserMetadataRequest withValue(GetUserMetadataRequestValue value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    public GetUserMetadataRequest withValue(Optional<? extends GetUserMetadataRequestValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        GetUserMetadataRequest other = (GetUserMetadataRequest) o;
        return 
            java.util.Objects.deepEquals(this.metadataKey, other.metadataKey) &&
            java.util.Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            metadataKey,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetUserMetadataRequest.class,
                "metadataKey", metadataKey,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> metadataKey = Optional.empty();
 
        private Optional<? extends GetUserMetadataRequestValue> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder metadataKey(String metadataKey) {
            Utils.checkNotNull(metadataKey, "metadataKey");
            this.metadataKey = Optional.ofNullable(metadataKey);
            return this;
        }

        public Builder metadataKey(Optional<? extends String> metadataKey) {
            Utils.checkNotNull(metadataKey, "metadataKey");
            this.metadataKey = metadataKey;
            return this;
        }

        public Builder value(GetUserMetadataRequestValue value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        public Builder value(Optional<? extends GetUserMetadataRequestValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public GetUserMetadataRequest build() {
            return new GetUserMetadataRequest(
                metadataKey,
                value);
        }
    }
}

