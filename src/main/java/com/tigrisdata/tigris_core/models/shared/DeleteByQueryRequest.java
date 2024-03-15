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


public class DeleteByQueryRequest {

    /**
     * A filter is required to delete matching documents. To delete document by id, you can pass the filter as follows ```{"id": "test"}```
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<? extends String> filter;

    /**
     * The index name of the documents that needs deletion.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    private Optional<? extends String> index;

    /**
     * The project name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    private Optional<? extends String> project;

    public DeleteByQueryRequest(
            @JsonProperty("filter") Optional<? extends String> filter,
            @JsonProperty("index") Optional<? extends String> index,
            @JsonProperty("project") Optional<? extends String> project) {
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(index, "index");
        Utils.checkNotNull(project, "project");
        this.filter = filter;
        this.index = index;
        this.project = project;
    }

    /**
     * A filter is required to delete matching documents. To delete document by id, you can pass the filter as follows ```{"id": "test"}```
     */
    public Optional<? extends String> filter() {
        return filter;
    }

    /**
     * The index name of the documents that needs deletion.
     */
    public Optional<? extends String> index() {
        return index;
    }

    /**
     * The project name.
     */
    public Optional<? extends String> project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A filter is required to delete matching documents. To delete document by id, you can pass the filter as follows ```{"id": "test"}```
     */
    public DeleteByQueryRequest withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * A filter is required to delete matching documents. To delete document by id, you can pass the filter as follows ```{"id": "test"}```
     */
    public DeleteByQueryRequest withFilter(Optional<? extends String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * The index name of the documents that needs deletion.
     */
    public DeleteByQueryRequest withIndex(String index) {
        Utils.checkNotNull(index, "index");
        this.index = Optional.ofNullable(index);
        return this;
    }

    /**
     * The index name of the documents that needs deletion.
     */
    public DeleteByQueryRequest withIndex(Optional<? extends String> index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
        return this;
    }

    /**
     * The project name.
     */
    public DeleteByQueryRequest withProject(String project) {
        Utils.checkNotNull(project, "project");
        this.project = Optional.ofNullable(project);
        return this;
    }

    /**
     * The project name.
     */
    public DeleteByQueryRequest withProject(Optional<? extends String> project) {
        Utils.checkNotNull(project, "project");
        this.project = project;
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
        DeleteByQueryRequest other = (DeleteByQueryRequest) o;
        return 
            java.util.Objects.deepEquals(this.filter, other.filter) &&
            java.util.Objects.deepEquals(this.index, other.index) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            filter,
            index,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteByQueryRequest.class,
                "filter", filter,
                "index", index,
                "project", project);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> filter = Optional.empty();
 
        private Optional<? extends String> index = Optional.empty();
 
        private Optional<? extends String> project = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A filter is required to delete matching documents. To delete document by id, you can pass the filter as follows ```{"id": "test"}```
         */
        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * A filter is required to delete matching documents. To delete document by id, you can pass the filter as follows ```{"id": "test"}```
         */
        public Builder filter(Optional<? extends String> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * The index name of the documents that needs deletion.
         */
        public Builder index(String index) {
            Utils.checkNotNull(index, "index");
            this.index = Optional.ofNullable(index);
            return this;
        }

        /**
         * The index name of the documents that needs deletion.
         */
        public Builder index(Optional<? extends String> index) {
            Utils.checkNotNull(index, "index");
            this.index = index;
            return this;
        }

        /**
         * The project name.
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = Optional.ofNullable(project);
            return this;
        }

        /**
         * The project name.
         */
        public Builder project(Optional<? extends String> project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public DeleteByQueryRequest build() {
            return new DeleteByQueryRequest(
                filter,
                index,
                project);
        }
    }
}

