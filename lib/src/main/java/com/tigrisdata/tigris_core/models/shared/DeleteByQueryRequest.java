/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteByQueryRequest {
    /**
     * A filter is required to delete matching documents. To delete document by id, you can pass the filter as follows ```{"id": "test"}```
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    public String filter;
    public DeleteByQueryRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }
    
    /**
     * The index name of the documents that needs deletion.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public String index;
    public DeleteByQueryRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    /**
     * The project name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;
    public DeleteByQueryRequest withProject(String project) {
        this.project = project;
        return this;
    }
    

    public DeleteByQueryRequest(){}
}
