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
 * UpdateAppKeyResponse - Returns response for updating the app key description
 */

public class UpdateAppKeyResponse {

    /**
     * An user AppKey
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_app_key")
    private Optional<? extends AppKey> updatedAppKey;

    public UpdateAppKeyResponse(
            @JsonProperty("updated_app_key") Optional<? extends AppKey> updatedAppKey) {
        Utils.checkNotNull(updatedAppKey, "updatedAppKey");
        this.updatedAppKey = updatedAppKey;
    }

    /**
     * An user AppKey
     */
    public Optional<? extends AppKey> updatedAppKey() {
        return updatedAppKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An user AppKey
     */
    public UpdateAppKeyResponse withUpdatedAppKey(AppKey updatedAppKey) {
        Utils.checkNotNull(updatedAppKey, "updatedAppKey");
        this.updatedAppKey = Optional.ofNullable(updatedAppKey);
        return this;
    }

    /**
     * An user AppKey
     */
    public UpdateAppKeyResponse withUpdatedAppKey(Optional<? extends AppKey> updatedAppKey) {
        Utils.checkNotNull(updatedAppKey, "updatedAppKey");
        this.updatedAppKey = updatedAppKey;
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
        UpdateAppKeyResponse other = (UpdateAppKeyResponse) o;
        return 
            java.util.Objects.deepEquals(this.updatedAppKey, other.updatedAppKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            updatedAppKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateAppKeyResponse.class,
                "updatedAppKey", updatedAppKey);
    }
    
    public final static class Builder {
 
        private Optional<? extends AppKey> updatedAppKey = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An user AppKey
         */
        public Builder updatedAppKey(AppKey updatedAppKey) {
            Utils.checkNotNull(updatedAppKey, "updatedAppKey");
            this.updatedAppKey = Optional.ofNullable(updatedAppKey);
            return this;
        }

        /**
         * An user AppKey
         */
        public Builder updatedAppKey(Optional<? extends AppKey> updatedAppKey) {
            Utils.checkNotNull(updatedAppKey, "updatedAppKey");
            this.updatedAppKey = updatedAppKey;
            return this;
        }
        
        public UpdateAppKeyResponse build() {
            return new UpdateAppKeyResponse(
                updatedAppKey);
        }
    }
}

