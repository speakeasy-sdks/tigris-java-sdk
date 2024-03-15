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


public class CreateNamespaceRequest {

    /**
     * Optional: unique id
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<? extends Long> code;

    /**
     * Optional: unique string id
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * Required: The display name for namespace.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    public CreateNamespaceRequest(
            @JsonProperty("code") Optional<? extends Long> code,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("name") Optional<? extends String> name) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        this.code = code;
        this.id = id;
        this.name = name;
    }

    /**
     * Optional: unique id
     */
    public Optional<? extends Long> code() {
        return code;
    }

    /**
     * Optional: unique string id
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * Required: The display name for namespace.
     */
    public Optional<? extends String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optional: unique id
     */
    public CreateNamespaceRequest withCode(long code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    /**
     * Optional: unique id
     */
    public CreateNamespaceRequest withCode(Optional<? extends Long> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * Optional: unique string id
     */
    public CreateNamespaceRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Optional: unique string id
     */
    public CreateNamespaceRequest withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Required: The display name for namespace.
     */
    public CreateNamespaceRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Required: The display name for namespace.
     */
    public CreateNamespaceRequest withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        CreateNamespaceRequest other = (CreateNamespaceRequest) o;
        return 
            java.util.Objects.deepEquals(this.code, other.code) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            code,
            id,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateNamespaceRequest.class,
                "code", code,
                "id", id,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> code = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Optional: unique id
         */
        public Builder code(long code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        /**
         * Optional: unique id
         */
        public Builder code(Optional<? extends Long> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * Optional: unique string id
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Optional: unique string id
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Required: The display name for namespace.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Required: The display name for namespace.
         */
        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public CreateNamespaceRequest build() {
            return new CreateNamespaceRequest(
                code,
                id,
                name);
        }
    }
}

