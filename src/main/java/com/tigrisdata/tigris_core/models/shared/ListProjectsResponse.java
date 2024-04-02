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


public class ListProjectsResponse {

    /**
     * List of the projects.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("projects")
    private Optional<? extends java.util.List<ProjectInfo>> projects;

    public ListProjectsResponse(
            @JsonProperty("projects") Optional<? extends java.util.List<ProjectInfo>> projects) {
        Utils.checkNotNull(projects, "projects");
        this.projects = projects;
    }

    /**
     * List of the projects.
     */
    public Optional<? extends java.util.List<ProjectInfo>> projects() {
        return projects;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * List of the projects.
     */
    public ListProjectsResponse withProjects(java.util.List<ProjectInfo> projects) {
        Utils.checkNotNull(projects, "projects");
        this.projects = Optional.ofNullable(projects);
        return this;
    }

    /**
     * List of the projects.
     */
    public ListProjectsResponse withProjects(Optional<? extends java.util.List<ProjectInfo>> projects) {
        Utils.checkNotNull(projects, "projects");
        this.projects = projects;
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
        ListProjectsResponse other = (ListProjectsResponse) o;
        return 
            java.util.Objects.deepEquals(this.projects, other.projects);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            projects);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListProjectsResponse.class,
                "projects", projects);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<ProjectInfo>> projects = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * List of the projects.
         */
        public Builder projects(java.util.List<ProjectInfo> projects) {
            Utils.checkNotNull(projects, "projects");
            this.projects = Optional.ofNullable(projects);
            return this;
        }

        /**
         * List of the projects.
         */
        public Builder projects(Optional<? extends java.util.List<ProjectInfo>> projects) {
            Utils.checkNotNull(projects, "projects");
            this.projects = projects;
            return this;
        }
        
        public ListProjectsResponse build() {
            return new ListProjectsResponse(
                projects);
        }
    }
}
