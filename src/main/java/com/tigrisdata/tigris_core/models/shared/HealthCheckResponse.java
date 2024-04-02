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


public class HealthCheckResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("response")
    private Optional<? extends String> response;

    public HealthCheckResponse(
            @JsonProperty("response") Optional<? extends String> response) {
        Utils.checkNotNull(response, "response");
        this.response = response;
    }

    public Optional<? extends String> response() {
        return response;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HealthCheckResponse withResponse(String response) {
        Utils.checkNotNull(response, "response");
        this.response = Optional.ofNullable(response);
        return this;
    }

    public HealthCheckResponse withResponse(Optional<? extends String> response) {
        Utils.checkNotNull(response, "response");
        this.response = response;
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
        HealthCheckResponse other = (HealthCheckResponse) o;
        return 
            java.util.Objects.deepEquals(this.response, other.response);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            response);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HealthCheckResponse.class,
                "response", response);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> response = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder response(String response) {
            Utils.checkNotNull(response, "response");
            this.response = Optional.ofNullable(response);
            return this;
        }

        public Builder response(Optional<? extends String> response) {
            Utils.checkNotNull(response, "response");
            this.response = response;
            return this;
        }
        
        public HealthCheckResponse build() {
            return new HealthCheckResponse(
                response);
        }
    }
}
