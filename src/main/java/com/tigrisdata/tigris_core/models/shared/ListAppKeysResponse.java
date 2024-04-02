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
 * ListAppKeysResponse - ListAppKeysResponse returns one or more visible app keys to user
 */

public class ListAppKeysResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_keys")
    private Optional<? extends java.util.List<AppKey>> appKeys;

    public ListAppKeysResponse(
            @JsonProperty("app_keys") Optional<? extends java.util.List<AppKey>> appKeys) {
        Utils.checkNotNull(appKeys, "appKeys");
        this.appKeys = appKeys;
    }

    public Optional<? extends java.util.List<AppKey>> appKeys() {
        return appKeys;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListAppKeysResponse withAppKeys(java.util.List<AppKey> appKeys) {
        Utils.checkNotNull(appKeys, "appKeys");
        this.appKeys = Optional.ofNullable(appKeys);
        return this;
    }

    public ListAppKeysResponse withAppKeys(Optional<? extends java.util.List<AppKey>> appKeys) {
        Utils.checkNotNull(appKeys, "appKeys");
        this.appKeys = appKeys;
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
        ListAppKeysResponse other = (ListAppKeysResponse) o;
        return 
            java.util.Objects.deepEquals(this.appKeys, other.appKeys);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appKeys);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAppKeysResponse.class,
                "appKeys", appKeys);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<AppKey>> appKeys = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder appKeys(java.util.List<AppKey> appKeys) {
            Utils.checkNotNull(appKeys, "appKeys");
            this.appKeys = Optional.ofNullable(appKeys);
            return this;
        }

        public Builder appKeys(Optional<? extends java.util.List<AppKey>> appKeys) {
            Utils.checkNotNull(appKeys, "appKeys");
            this.appKeys = appKeys;
            return this;
        }
        
        public ListAppKeysResponse build() {
            return new ListAppKeysResponse(
                appKeys);
        }
    }
}
