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


public class TigrisDeleteBranchRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.DeleteBranchRequest deleteBranchRequest;

    /**
     * Name of the database branch to delete. &lt;p&gt;&lt;/p&gt;**Note**: `main` branch cannot be deleted, use DeleteProject instead
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=branch")
    private String branch;

    /**
     * Delete a database branch in this project
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public TigrisDeleteBranchRequest(
            com.tigrisdata.tigris_core.models.shared.DeleteBranchRequest deleteBranchRequest,
            String branch,
            String project) {
        Utils.checkNotNull(deleteBranchRequest, "deleteBranchRequest");
        Utils.checkNotNull(branch, "branch");
        Utils.checkNotNull(project, "project");
        this.deleteBranchRequest = deleteBranchRequest;
        this.branch = branch;
        this.project = project;
    }

    public com.tigrisdata.tigris_core.models.shared.DeleteBranchRequest deleteBranchRequest() {
        return deleteBranchRequest;
    }

    /**
     * Name of the database branch to delete. &lt;p&gt;&lt;/p&gt;**Note**: `main` branch cannot be deleted, use DeleteProject instead
     */
    public String branch() {
        return branch;
    }

    /**
     * Delete a database branch in this project
     */
    public String project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TigrisDeleteBranchRequest withDeleteBranchRequest(com.tigrisdata.tigris_core.models.shared.DeleteBranchRequest deleteBranchRequest) {
        Utils.checkNotNull(deleteBranchRequest, "deleteBranchRequest");
        this.deleteBranchRequest = deleteBranchRequest;
        return this;
    }

    /**
     * Name of the database branch to delete. &lt;p&gt;&lt;/p&gt;**Note**: `main` branch cannot be deleted, use DeleteProject instead
     */
    public TigrisDeleteBranchRequest withBranch(String branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = branch;
        return this;
    }

    /**
     * Delete a database branch in this project
     */
    public TigrisDeleteBranchRequest withProject(String project) {
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
        TigrisDeleteBranchRequest other = (TigrisDeleteBranchRequest) o;
        return 
            java.util.Objects.deepEquals(this.deleteBranchRequest, other.deleteBranchRequest) &&
            java.util.Objects.deepEquals(this.branch, other.branch) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            deleteBranchRequest,
            branch,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TigrisDeleteBranchRequest.class,
                "deleteBranchRequest", deleteBranchRequest,
                "branch", branch,
                "project", project);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.DeleteBranchRequest deleteBranchRequest;
 
        private String branch;
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder deleteBranchRequest(com.tigrisdata.tigris_core.models.shared.DeleteBranchRequest deleteBranchRequest) {
            Utils.checkNotNull(deleteBranchRequest, "deleteBranchRequest");
            this.deleteBranchRequest = deleteBranchRequest;
            return this;
        }

        /**
         * Name of the database branch to delete. &lt;p&gt;&lt;/p&gt;**Note**: `main` branch cannot be deleted, use DeleteProject instead
         */
        public Builder branch(String branch) {
            Utils.checkNotNull(branch, "branch");
            this.branch = branch;
            return this;
        }

        /**
         * Delete a database branch in this project
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public TigrisDeleteBranchRequest build() {
            return new TigrisDeleteBranchRequest(
                deleteBranchRequest,
                branch,
                project);
        }
    }
}

