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


public class CollectionDescription {

    /**
     * Name of the collection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collection")
    private Optional<? extends String> collection;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends CollectionMetadata> metadata;

    /**
     * Collections schema
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    private Optional<? extends Schema> schema;

    /**
     * Collection size in bytes
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Long> size;

    public CollectionDescription(
            @JsonProperty("collection") Optional<? extends String> collection,
            @JsonProperty("metadata") Optional<? extends CollectionMetadata> metadata,
            @JsonProperty("schema") Optional<? extends Schema> schema,
            @JsonProperty("size") Optional<? extends Long> size) {
        Utils.checkNotNull(collection, "collection");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(schema, "schema");
        Utils.checkNotNull(size, "size");
        this.collection = collection;
        this.metadata = metadata;
        this.schema = schema;
        this.size = size;
    }

    /**
     * Name of the collection.
     */
    public Optional<? extends String> collection() {
        return collection;
    }

    public Optional<? extends CollectionMetadata> metadata() {
        return metadata;
    }

    /**
     * Collections schema
     */
    public Optional<? extends Schema> schema() {
        return schema;
    }

    /**
     * Collection size in bytes
     */
    public Optional<? extends Long> size() {
        return size;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the collection.
     */
    public CollectionDescription withCollection(String collection) {
        Utils.checkNotNull(collection, "collection");
        this.collection = Optional.ofNullable(collection);
        return this;
    }

    /**
     * Name of the collection.
     */
    public CollectionDescription withCollection(Optional<? extends String> collection) {
        Utils.checkNotNull(collection, "collection");
        this.collection = collection;
        return this;
    }

    public CollectionDescription withMetadata(CollectionMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public CollectionDescription withMetadata(Optional<? extends CollectionMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * Collections schema
     */
    public CollectionDescription withSchema(Schema schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = Optional.ofNullable(schema);
        return this;
    }

    /**
     * Collections schema
     */
    public CollectionDescription withSchema(Optional<? extends Schema> schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = schema;
        return this;
    }

    /**
     * Collection size in bytes
     */
    public CollectionDescription withSize(long size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    /**
     * Collection size in bytes
     */
    public CollectionDescription withSize(Optional<? extends Long> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
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
        CollectionDescription other = (CollectionDescription) o;
        return 
            java.util.Objects.deepEquals(this.collection, other.collection) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.schema, other.schema) &&
            java.util.Objects.deepEquals(this.size, other.size);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            collection,
            metadata,
            schema,
            size);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CollectionDescription.class,
                "collection", collection,
                "metadata", metadata,
                "schema", schema,
                "size", size);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> collection = Optional.empty();
 
        private Optional<? extends CollectionMetadata> metadata = Optional.empty();
 
        private Optional<? extends Schema> schema = Optional.empty();
 
        private Optional<? extends Long> size = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the collection.
         */
        public Builder collection(String collection) {
            Utils.checkNotNull(collection, "collection");
            this.collection = Optional.ofNullable(collection);
            return this;
        }

        /**
         * Name of the collection.
         */
        public Builder collection(Optional<? extends String> collection) {
            Utils.checkNotNull(collection, "collection");
            this.collection = collection;
            return this;
        }

        public Builder metadata(CollectionMetadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends CollectionMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * Collections schema
         */
        public Builder schema(Schema schema) {
            Utils.checkNotNull(schema, "schema");
            this.schema = Optional.ofNullable(schema);
            return this;
        }

        /**
         * Collections schema
         */
        public Builder schema(Optional<? extends Schema> schema) {
            Utils.checkNotNull(schema, "schema");
            this.schema = schema;
            return this;
        }

        /**
         * Collection size in bytes
         */
        public Builder size(long size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        /**
         * Collection size in bytes
         */
        public Builder size(Optional<? extends Long> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }
        
        public CollectionDescription build() {
            return new CollectionDescription(
                collection,
                metadata,
                schema,
                size);
        }
    }
}

