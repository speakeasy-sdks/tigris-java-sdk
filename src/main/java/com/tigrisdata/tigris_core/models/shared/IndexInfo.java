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


public class IndexInfo {

    /**
     * Name of the index.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    /**
     * Schema of the index.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    private Optional<? extends String> schema;

    public IndexInfo(
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("schema") Optional<? extends String> schema) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(schema, "schema");
        this.name = name;
        this.schema = schema;
    }

    /**
     * Name of the index.
     */
    public Optional<? extends String> name() {
        return name;
    }

    /**
     * Schema of the index.
     */
    public Optional<? extends String> schema() {
        return schema;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the index.
     */
    public IndexInfo withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the index.
     */
    public IndexInfo withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Schema of the index.
     */
    public IndexInfo withSchema(String schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = Optional.ofNullable(schema);
        return this;
    }

    /**
     * Schema of the index.
     */
    public IndexInfo withSchema(Optional<? extends String> schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = schema;
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
        IndexInfo other = (IndexInfo) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.schema, other.schema);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            schema);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IndexInfo.class,
                "name", name,
                "schema", schema);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends String> schema = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the index.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of the index.
         */
        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Schema of the index.
         */
        public Builder schema(String schema) {
            Utils.checkNotNull(schema, "schema");
            this.schema = Optional.ofNullable(schema);
            return this;
        }

        /**
         * Schema of the index.
         */
        public Builder schema(Optional<? extends String> schema) {
            Utils.checkNotNull(schema, "schema");
            this.schema = schema;
            return this;
        }
        
        public IndexInfo build() {
            return new IndexInfo(
                name,
                schema);
        }
    }
}

