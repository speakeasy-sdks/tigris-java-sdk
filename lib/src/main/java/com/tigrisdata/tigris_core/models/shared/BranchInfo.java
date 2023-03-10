package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BranchInfo {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public BranchInfo withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;
    public BranchInfo withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
}
