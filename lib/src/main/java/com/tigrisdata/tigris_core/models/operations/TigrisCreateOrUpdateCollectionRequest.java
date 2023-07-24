/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;


public class TigrisCreateOrUpdateCollectionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest createOrUpdateCollectionRequest;

    public TigrisCreateOrUpdateCollectionRequest withCreateOrUpdateCollectionRequest(com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest createOrUpdateCollectionRequest) {
        this.createOrUpdateCollectionRequest = createOrUpdateCollectionRequest;
        return this;
    }
    
    /**
     * Collection name to create.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collection")
    public String collection;

    public TigrisCreateOrUpdateCollectionRequest withCollection(String collection) {
        this.collection = collection;
        return this;
    }
    
    /**
     * Project name whose db is under target to create or update collection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;

    public TigrisCreateOrUpdateCollectionRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public TigrisCreateOrUpdateCollectionRequest(@JsonProperty("CreateOrUpdateCollectionRequest") com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest createOrUpdateCollectionRequest, @JsonProperty("collection") String collection, @JsonProperty("project") String project) {
        this.createOrUpdateCollectionRequest = createOrUpdateCollectionRequest;
        this.collection = collection;
        this.project = project;
  }
}
