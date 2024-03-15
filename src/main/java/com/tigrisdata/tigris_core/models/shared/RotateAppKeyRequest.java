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

/**
 * RotateAppKeyRequest - Request rotation of an app key secret
 */

public class RotateAppKeyRequest {

    /**
     * app key id
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * project name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    private Optional<? extends String> project;

    public RotateAppKeyRequest(
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("project") Optional<? extends String> project) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(project, "project");
        this.id = id;
        this.project = project;
    }

    /**
     * app key id
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * project name
     */
    public Optional<? extends String> project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * app key id
     */
    public RotateAppKeyRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * app key id
     */
    public RotateAppKeyRequest withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * project name
     */
    public RotateAppKeyRequest withProject(String project) {
        Utils.checkNotNull(project, "project");
        this.project = Optional.ofNullable(project);
        return this;
    }

    /**
     * project name
     */
    public RotateAppKeyRequest withProject(Optional<? extends String> project) {
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
        RotateAppKeyRequest other = (RotateAppKeyRequest) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RotateAppKeyRequest.class,
                "id", id,
                "project", project);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> project = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * app key id
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * app key id
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * project name
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = Optional.ofNullable(project);
            return this;
        }

        /**
         * project name
         */
        public Builder project(Optional<? extends String> project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public RotateAppKeyRequest build() {
            return new RotateAppKeyRequest(
                id,
                project);
        }
    }
}

