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


public class DeleteDocumentRequest {

    /**
     * A list of ids
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ids")
    private Optional<? extends java.util.List<String>> ids;

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

    public DeleteDocumentRequest(
            @JsonProperty("ids") Optional<? extends java.util.List<String>> ids,
            @JsonProperty("index") Optional<? extends String> index,
            @JsonProperty("project") Optional<? extends String> project) {
        Utils.checkNotNull(ids, "ids");
        Utils.checkNotNull(index, "index");
        Utils.checkNotNull(project, "project");
        this.ids = ids;
        this.index = index;
        this.project = project;
    }

    /**
     * A list of ids
     */
    public Optional<? extends java.util.List<String>> ids() {
        return ids;
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
     * A list of ids
     */
    public DeleteDocumentRequest withIds(java.util.List<String> ids) {
        Utils.checkNotNull(ids, "ids");
        this.ids = Optional.ofNullable(ids);
        return this;
    }

    /**
     * A list of ids
     */
    public DeleteDocumentRequest withIds(Optional<? extends java.util.List<String>> ids) {
        Utils.checkNotNull(ids, "ids");
        this.ids = ids;
        return this;
    }

    /**
     * The index name of the documents that needs deletion.
     */
    public DeleteDocumentRequest withIndex(String index) {
        Utils.checkNotNull(index, "index");
        this.index = Optional.ofNullable(index);
        return this;
    }

    /**
     * The index name of the documents that needs deletion.
     */
    public DeleteDocumentRequest withIndex(Optional<? extends String> index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
        return this;
    }

    /**
     * The project name.
     */
    public DeleteDocumentRequest withProject(String project) {
        Utils.checkNotNull(project, "project");
        this.project = Optional.ofNullable(project);
        return this;
    }

    /**
     * The project name.
     */
    public DeleteDocumentRequest withProject(Optional<? extends String> project) {
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
        DeleteDocumentRequest other = (DeleteDocumentRequest) o;
        return 
            java.util.Objects.deepEquals(this.ids, other.ids) &&
            java.util.Objects.deepEquals(this.index, other.index) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            ids,
            index,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteDocumentRequest.class,
                "ids", ids,
                "index", index,
                "project", project);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<String>> ids = Optional.empty();
 
        private Optional<? extends String> index = Optional.empty();
 
        private Optional<? extends String> project = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A list of ids
         */
        public Builder ids(java.util.List<String> ids) {
            Utils.checkNotNull(ids, "ids");
            this.ids = Optional.ofNullable(ids);
            return this;
        }

        /**
         * A list of ids
         */
        public Builder ids(Optional<? extends java.util.List<String>> ids) {
            Utils.checkNotNull(ids, "ids");
            this.ids = ids;
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
        
        public DeleteDocumentRequest build() {
            return new DeleteDocumentRequest(
                ids,
                index,
                project);
        }
    }
}

