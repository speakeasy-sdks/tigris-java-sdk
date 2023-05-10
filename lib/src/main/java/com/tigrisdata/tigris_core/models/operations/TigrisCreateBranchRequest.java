/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisCreateBranchRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> requestBody;

    public TigrisCreateBranchRequest withRequestBody(java.util.Map<String, Object> requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Name of the database branch to be created. &lt;p&gt;&lt;/p&gt;**Note**: `main` is a reserved branch name for primary database and is automatically created with CreateProject
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=branch")
    public String branch;

    public TigrisCreateBranchRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * Create a database branch in this project
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;

    public TigrisCreateBranchRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public TigrisCreateBranchRequest(@JsonProperty("RequestBody") java.util.Map<String, Object> requestBody, @JsonProperty("branch") String branch, @JsonProperty("project") String project) {
        this.requestBody = requestBody;
        this.branch = branch;
        this.project = project;
  }
}
