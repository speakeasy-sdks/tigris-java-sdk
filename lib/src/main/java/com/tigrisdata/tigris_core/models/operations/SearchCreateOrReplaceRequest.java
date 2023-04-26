/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchCreateOrReplaceRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentRequest createOrReplaceDocumentRequest;
    public SearchCreateOrReplaceRequest withCreateOrReplaceDocumentRequest(com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentRequest createOrReplaceDocumentRequest) {
        this.createOrReplaceDocumentRequest = createOrReplaceDocumentRequest;
        return this;
    }
    
    /**
     * index name where to create documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=index")
    public String index;
    public SearchCreateOrReplaceRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    /**
     * Project name whose db is under target to insert documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public SearchCreateOrReplaceRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public SearchCreateOrReplaceRequest(@JsonProperty("CreateOrReplaceDocumentRequest") com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentRequest createOrReplaceDocumentRequest, @JsonProperty("index") String index, @JsonProperty("project") String project) {
        this.createOrReplaceDocumentRequest = createOrReplaceDocumentRequest;
        this.index = index;
        this.project = project;
  }
}
