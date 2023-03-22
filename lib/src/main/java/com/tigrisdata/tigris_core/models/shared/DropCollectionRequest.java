/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DropCollectionRequest {
    /**
     * Optionally specify a project branch name to perform operation on
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")public String branch;
    public DropCollectionRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * Collection requests modifying options.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")public java.util.Map<String, Object> options;
    public DropCollectionRequest withOptions(java.util.Map<String, Object> options) {
        this.options = options;
        return this;
    }
    
}
