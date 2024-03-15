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


public class CreateProjectResponse {

    /**
     * A detailed response message.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<? extends String> message;

    /**
     * An enum with value set as "created".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends String> status;

    public CreateProjectResponse(
            @JsonProperty("message") Optional<? extends String> message,
            @JsonProperty("status") Optional<? extends String> status) {
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(status, "status");
        this.message = message;
        this.status = status;
    }

    /**
     * A detailed response message.
     */
    public Optional<? extends String> message() {
        return message;
    }

    /**
     * An enum with value set as "created".
     */
    public Optional<? extends String> status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A detailed response message.
     */
    public CreateProjectResponse withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * A detailed response message.
     */
    public CreateProjectResponse withMessage(Optional<? extends String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * An enum with value set as "created".
     */
    public CreateProjectResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * An enum with value set as "created".
     */
    public CreateProjectResponse withStatus(Optional<? extends String> status) {
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
        CreateProjectResponse other = (CreateProjectResponse) o;
        return 
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            message,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateProjectResponse.class,
                "message", message,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> message = Optional.empty();
 
        private Optional<? extends String> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A detailed response message.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        /**
         * A detailed response message.
         */
        public Builder message(Optional<? extends String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * An enum with value set as "created".
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * An enum with value set as "created".
         */
        public Builder status(Optional<? extends String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public CreateProjectResponse build() {
            return new CreateProjectResponse(
                message,
                status);
        }
    }
}

