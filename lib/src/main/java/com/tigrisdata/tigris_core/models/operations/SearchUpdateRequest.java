/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;


public class SearchUpdateRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest updateDocumentRequest;

    public SearchUpdateRequest withUpdateDocumentRequest(com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest updateDocumentRequest) {
        this.updateDocumentRequest = updateDocumentRequest;
        return this;
    }
    
    /**
     * Index name where to create documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=index")
    public String index;

    public SearchUpdateRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    /**
     * Project name whose db is under target to insert documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;

    public SearchUpdateRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public SearchUpdateRequest(@JsonProperty("UpdateDocumentRequest") com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest updateDocumentRequest, @JsonProperty("index") String index, @JsonProperty("project") String project) {
        this.updateDocumentRequest = updateDocumentRequest;
        this.index = index;
        this.project = project;
  }
}
