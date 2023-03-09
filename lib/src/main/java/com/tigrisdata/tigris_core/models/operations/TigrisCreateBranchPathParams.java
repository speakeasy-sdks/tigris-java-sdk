package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisCreateBranchPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=branch")
    public String branch;
    public TigrisCreateBranchPathParams withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public TigrisCreateBranchPathParams withProject(String project) {
        this.project = project;
        return this;
    }
    
}
