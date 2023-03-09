package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListBranchesResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branches")
    public BranchInfo[] branches;
    public ListBranchesResponse withBranches(BranchInfo[] branches) {
        this.branches = branches;
        return this;
    }
    
}
