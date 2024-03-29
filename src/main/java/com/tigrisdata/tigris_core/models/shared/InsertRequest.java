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


public class InsertRequest {

    /**
     * Optionally specify a database branch name to perform operation on
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    private Optional<? extends String> branch;

    /**
     * Array of documents to insert. Each document is a JSON object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    private Optional<? extends java.util.List<InsertRequestDocuments>> documents;

    /**
     * additional options for insert requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    private Optional<? extends InsertRequestOptions> options;

    public InsertRequest(
            @JsonProperty("branch") Optional<? extends String> branch,
            @JsonProperty("documents") Optional<? extends java.util.List<InsertRequestDocuments>> documents,
            @JsonProperty("options") Optional<? extends InsertRequestOptions> options) {
        Utils.checkNotNull(branch, "branch");
        Utils.checkNotNull(documents, "documents");
        Utils.checkNotNull(options, "options");
        this.branch = branch;
        this.documents = documents;
        this.options = options;
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public Optional<? extends String> branch() {
        return branch;
    }

    /**
     * Array of documents to insert. Each document is a JSON object.
     */
    public Optional<? extends java.util.List<InsertRequestDocuments>> documents() {
        return documents;
    }

    /**
     * additional options for insert requests.
     */
    public Optional<? extends InsertRequestOptions> options() {
        return options;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public InsertRequest withBranch(String branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = Optional.ofNullable(branch);
        return this;
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public InsertRequest withBranch(Optional<? extends String> branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = branch;
        return this;
    }

    /**
     * Array of documents to insert. Each document is a JSON object.
     */
    public InsertRequest withDocuments(java.util.List<InsertRequestDocuments> documents) {
        Utils.checkNotNull(documents, "documents");
        this.documents = Optional.ofNullable(documents);
        return this;
    }

    /**
     * Array of documents to insert. Each document is a JSON object.
     */
    public InsertRequest withDocuments(Optional<? extends java.util.List<InsertRequestDocuments>> documents) {
        Utils.checkNotNull(documents, "documents");
        this.documents = documents;
        return this;
    }

    /**
     * additional options for insert requests.
     */
    public InsertRequest withOptions(InsertRequestOptions options) {
        Utils.checkNotNull(options, "options");
        this.options = Optional.ofNullable(options);
        return this;
    }

    /**
     * additional options for insert requests.
     */
    public InsertRequest withOptions(Optional<? extends InsertRequestOptions> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
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
        InsertRequest other = (InsertRequest) o;
        return 
            java.util.Objects.deepEquals(this.branch, other.branch) &&
            java.util.Objects.deepEquals(this.documents, other.documents) &&
            java.util.Objects.deepEquals(this.options, other.options);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            branch,
            documents,
            options);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InsertRequest.class,
                "branch", branch,
                "documents", documents,
                "options", options);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> branch = Optional.empty();
 
        private Optional<? extends java.util.List<InsertRequestDocuments>> documents = Optional.empty();
 
        private Optional<? extends InsertRequestOptions> options = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Optionally specify a database branch name to perform operation on
         */
        public Builder branch(String branch) {
            Utils.checkNotNull(branch, "branch");
            this.branch = Optional.ofNullable(branch);
            return this;
        }

        /**
         * Optionally specify a database branch name to perform operation on
         */
        public Builder branch(Optional<? extends String> branch) {
            Utils.checkNotNull(branch, "branch");
            this.branch = branch;
            return this;
        }

        /**
         * Array of documents to insert. Each document is a JSON object.
         */
        public Builder documents(java.util.List<InsertRequestDocuments> documents) {
            Utils.checkNotNull(documents, "documents");
            this.documents = Optional.ofNullable(documents);
            return this;
        }

        /**
         * Array of documents to insert. Each document is a JSON object.
         */
        public Builder documents(Optional<? extends java.util.List<InsertRequestDocuments>> documents) {
            Utils.checkNotNull(documents, "documents");
            this.documents = documents;
            return this;
        }

        /**
         * additional options for insert requests.
         */
        public Builder options(InsertRequestOptions options) {
            Utils.checkNotNull(options, "options");
            this.options = Optional.ofNullable(options);
            return this;
        }

        /**
         * additional options for insert requests.
         */
        public Builder options(Optional<? extends InsertRequestOptions> options) {
            Utils.checkNotNull(options, "options");
            this.options = options;
            return this;
        }
        
        public InsertRequest build() {
            return new InsertRequest(
                branch,
                documents,
                options);
        }
    }
}

