/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchDeleteRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.DeleteDocumentRequest deleteDocumentRequest;
    public SearchDeleteRequest withDeleteDocumentRequest(com.tigrisdata.tigris_core.models.shared.DeleteDocumentRequest deleteDocumentRequest) {
        this.deleteDocumentRequest = deleteDocumentRequest;
        return this;
    }
    
    /**
     * The index name of the documents that needs deletion.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=index")
    public String index;
    public SearchDeleteRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    /**
     * The project name.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public SearchDeleteRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public SearchDeleteRequest(@JsonProperty("DeleteDocumentRequest") com.tigrisdata.tigris_core.models.shared.DeleteDocumentRequest deleteDocumentRequest, @JsonProperty("index") String index, @JsonProperty("project") String project) {
        this.deleteDocumentRequest = deleteDocumentRequest;
        this.index = index;
        this.project = project;
  }
}
