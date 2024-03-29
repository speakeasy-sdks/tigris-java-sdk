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


public class ReadMessagesResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<? extends Message> message;

    public ReadMessagesResponse(
            @JsonProperty("message") Optional<? extends Message> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
    }

    public Optional<? extends Message> message() {
        return message;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ReadMessagesResponse withMessage(Message message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    public ReadMessagesResponse withMessage(Optional<? extends Message> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
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
        ReadMessagesResponse other = (ReadMessagesResponse) o;
        return 
            java.util.Objects.deepEquals(this.message, other.message);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            message);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReadMessagesResponse.class,
                "message", message);
    }
    
    public final static class Builder {
 
        private Optional<? extends Message> message = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder message(Message message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        public Builder message(Optional<? extends Message> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }
        
        public ReadMessagesResponse build() {
            return new ReadMessagesResponse(
                message);
        }
    }
}

