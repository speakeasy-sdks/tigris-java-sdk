/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisDescribeCollectionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.DescribeCollectionRequest describeCollectionRequest;
    public TigrisDescribeCollectionRequest withDescribeCollectionRequest(com.tigrisdata.tigris_core.models.shared.DescribeCollectionRequest describeCollectionRequest) {
        this.describeCollectionRequest = describeCollectionRequest;
        return this;
    }
    
    /**
     * Name of the collection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collection")
    public String collection;
    public TigrisDescribeCollectionRequest withCollection(String collection) {
        this.collection = collection;
        return this;
    }
    
    /**
     * Project name whose db is under target to get description of its collection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public TigrisDescribeCollectionRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public TigrisDescribeCollectionRequest(@JsonProperty("DescribeCollectionRequest") com.tigrisdata.tigris_core.models.shared.DescribeCollectionRequest describeCollectionRequest, @JsonProperty("collection") String collection, @JsonProperty("project") String project) {
        this.describeCollectionRequest = describeCollectionRequest;
        this.collection = collection;
        this.project = project;
  }
}
