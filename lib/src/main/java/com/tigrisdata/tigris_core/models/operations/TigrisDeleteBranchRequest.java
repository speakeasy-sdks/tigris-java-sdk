/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisDeleteBranchRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.DeleteBranchRequest deleteBranchRequest;

    public TigrisDeleteBranchRequest withDeleteBranchRequest(com.tigrisdata.tigris_core.models.shared.DeleteBranchRequest deleteBranchRequest) {
        this.deleteBranchRequest = deleteBranchRequest;
        return this;
    }
    
    /**
     * Name of the database branch to delete. &lt;p&gt;&lt;/p&gt;**Note**: `main` branch cannot be deleted, use DeleteProject instead
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=branch")
    public String branch;

    public TigrisDeleteBranchRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * Delete a database branch in this project
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;

    public TigrisDeleteBranchRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public TigrisDeleteBranchRequest(@JsonProperty("DeleteBranchRequest") com.tigrisdata.tigris_core.models.shared.DeleteBranchRequest deleteBranchRequest, @JsonProperty("branch") String branch, @JsonProperty("project") String project) {
        this.deleteBranchRequest = deleteBranchRequest;
        this.branch = branch;
        this.project = project;
  }
}
