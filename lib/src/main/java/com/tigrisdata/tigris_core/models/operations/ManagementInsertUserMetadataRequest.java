/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ManagementInsertUserMetadataRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.InsertUserMetadataRequest insertUserMetadataRequest;
    public ManagementInsertUserMetadataRequest withInsertUserMetadataRequest(com.tigrisdata.tigris_core.models.shared.InsertUserMetadataRequest insertUserMetadataRequest) {
        this.insertUserMetadataRequest = insertUserMetadataRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metadataKey")
    public String metadataKey;
    public ManagementInsertUserMetadataRequest withMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
        return this;
    }
    

    public ManagementInsertUserMetadataRequest(@JsonProperty("InsertUserMetadataRequest") com.tigrisdata.tigris_core.models.shared.InsertUserMetadataRequest insertUserMetadataRequest, @JsonProperty("metadataKey") String metadataKey) {
    this.insertUserMetadataRequest = insertUserMetadataRequest;
this.metadataKey = metadataKey;
  }
}
