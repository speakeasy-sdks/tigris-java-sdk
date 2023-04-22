/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisImportRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.ImportRequest importRequest;
    public TigrisImportRequest withImportRequest(com.tigrisdata.tigris_core.models.shared.ImportRequest importRequest) {
        this.importRequest = importRequest;
        return this;
    }
    
    /**
     * Collection name where to import documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collection")
    public String collection;
    public TigrisImportRequest withCollection(String collection) {
        this.collection = collection;
        return this;
    }
    
    /**
     * Project name whose db is under target to import documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public TigrisImportRequest withProject(String project) {
        this.project = project;
        return this;
    }
    

    public TigrisImportRequest(@JsonProperty("ImportRequest") com.tigrisdata.tigris_core.models.shared.ImportRequest importRequest, @JsonProperty("collection") String collection, @JsonProperty("project") String project) {
    this.importRequest = importRequest;
this.collection = collection;
this.project = project;
  }
}
