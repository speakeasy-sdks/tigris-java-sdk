/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchCreateRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest createDocumentRequest;
    public SearchCreateRequest withCreateDocumentRequest(com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest createDocumentRequest) {
        this.createDocumentRequest = createDocumentRequest;
        return this;
    }
    
    /**
     * index name where to create documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=index")
    public String index;
    public SearchCreateRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    /**
     * Tigris project name.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public SearchCreateRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
}
