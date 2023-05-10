/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteIndexRequest {
    /**
     * index name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public DeleteIndexRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Tigris project name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;

    public DeleteIndexRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public DeleteIndexRequest(){}
}
