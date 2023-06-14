/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;


public class TigrisDropCollectionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.DropCollectionRequest dropCollectionRequest;

    public TigrisDropCollectionRequest withDropCollectionRequest(com.tigrisdata.tigris_core.models.shared.DropCollectionRequest dropCollectionRequest) {
        this.dropCollectionRequest = dropCollectionRequest;
        return this;
    }
    
    /**
     * Collection name to delete.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collection")
    public String collection;

    public TigrisDropCollectionRequest withCollection(String collection) {
        this.collection = collection;
        return this;
    }
    
    /**
     * Project name whose db is under target to delete collection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;

    public TigrisDropCollectionRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public TigrisDropCollectionRequest(@JsonProperty("DropCollectionRequest") com.tigrisdata.tigris_core.models.shared.DropCollectionRequest dropCollectionRequest, @JsonProperty("collection") String collection, @JsonProperty("project") String project) {
        this.dropCollectionRequest = dropCollectionRequest;
        this.collection = collection;
        this.project = project;
  }
}
