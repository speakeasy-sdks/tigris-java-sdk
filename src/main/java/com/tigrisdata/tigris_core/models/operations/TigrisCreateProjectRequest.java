/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;
import com.tigrisdata.tigris_core.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class TigrisCreateProjectRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.CreateProjectRequest createProjectRequest;

    /**
     * Create project with this name.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public TigrisCreateProjectRequest(
            com.tigrisdata.tigris_core.models.shared.CreateProjectRequest createProjectRequest,
            String project) {
        Utils.checkNotNull(createProjectRequest, "createProjectRequest");
        Utils.checkNotNull(project, "project");
        this.createProjectRequest = createProjectRequest;
        this.project = project;
    }

    public com.tigrisdata.tigris_core.models.shared.CreateProjectRequest createProjectRequest() {
        return createProjectRequest;
    }

    /**
     * Create project with this name.
     */
    public String project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TigrisCreateProjectRequest withCreateProjectRequest(com.tigrisdata.tigris_core.models.shared.CreateProjectRequest createProjectRequest) {
        Utils.checkNotNull(createProjectRequest, "createProjectRequest");
        this.createProjectRequest = createProjectRequest;
        return this;
    }

    /**
     * Create project with this name.
     */
    public TigrisCreateProjectRequest withProject(String project) {
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
        TigrisCreateProjectRequest other = (TigrisCreateProjectRequest) o;
        return 
            java.util.Objects.deepEquals(this.createProjectRequest, other.createProjectRequest) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createProjectRequest,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TigrisCreateProjectRequest.class,
                "createProjectRequest", createProjectRequest,
                "project", project);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.CreateProjectRequest createProjectRequest;
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createProjectRequest(com.tigrisdata.tigris_core.models.shared.CreateProjectRequest createProjectRequest) {
            Utils.checkNotNull(createProjectRequest, "createProjectRequest");
            this.createProjectRequest = createProjectRequest;
            return this;
        }

        /**
         * Create project with this name.
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public TigrisCreateProjectRequest build() {
            return new TigrisCreateProjectRequest(
                createProjectRequest,
                project);
        }
    }
}

