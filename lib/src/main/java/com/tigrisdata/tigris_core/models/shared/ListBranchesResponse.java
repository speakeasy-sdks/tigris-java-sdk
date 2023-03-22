/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListBranchesResponse - OK
 */
public class ListBranchesResponse {
    /**
     * List of all the branches in this database
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branches")public BranchInfo[] branches;
    public ListBranchesResponse withBranches(BranchInfo[] branches) {
        this.branches = branches;
        return this;
    }
    
}
