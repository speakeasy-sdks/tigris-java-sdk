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


public class CreateNamespaceResponse {

    /**
     * A detailed response message.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<? extends String> message;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespace")
    private Optional<? extends NamespaceInfo> namespace;

    /**
     * An enum with value set as "created".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends String> status;

    public CreateNamespaceResponse(
            @JsonProperty("message") Optional<? extends String> message,
            @JsonProperty("namespace") Optional<? extends NamespaceInfo> namespace,
            @JsonProperty("status") Optional<? extends String> status) {
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(namespace, "namespace");
        Utils.checkNotNull(status, "status");
        this.message = message;
        this.namespace = namespace;
        this.status = status;
    }

    /**
     * A detailed response message.
     */
    public Optional<? extends String> message() {
        return message;
    }

    public Optional<? extends NamespaceInfo> namespace() {
        return namespace;
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
    public CreateNamespaceResponse withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * A detailed response message.
     */
    public CreateNamespaceResponse withMessage(Optional<? extends String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    public CreateNamespaceResponse withNamespace(NamespaceInfo namespace) {
        Utils.checkNotNull(namespace, "namespace");
        this.namespace = Optional.ofNullable(namespace);
        return this;
    }

    public CreateNamespaceResponse withNamespace(Optional<? extends NamespaceInfo> namespace) {
        Utils.checkNotNull(namespace, "namespace");
        this.namespace = namespace;
        return this;
    }

    /**
     * An enum with value set as "created".
     */
    public CreateNamespaceResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * An enum with value set as "created".
     */
    public CreateNamespaceResponse withStatus(Optional<? extends String> status) {
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
        CreateNamespaceResponse other = (CreateNamespaceResponse) o;
        return 
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.namespace, other.namespace) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            message,
            namespace,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateNamespaceResponse.class,
                "message", message,
                "namespace", namespace,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> message = Optional.empty();
 
        private Optional<? extends NamespaceInfo> namespace = Optional.empty();
 
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

        public Builder namespace(NamespaceInfo namespace) {
            Utils.checkNotNull(namespace, "namespace");
            this.namespace = Optional.ofNullable(namespace);
            return this;
        }

        public Builder namespace(Optional<? extends NamespaceInfo> namespace) {
            Utils.checkNotNull(namespace, "namespace");
            this.namespace = namespace;
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
        
        public CreateNamespaceResponse build() {
            return new CreateNamespaceResponse(
                message,
                namespace,
                status);
        }
    }
}

