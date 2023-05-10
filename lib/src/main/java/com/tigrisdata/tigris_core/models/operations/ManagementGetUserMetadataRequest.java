/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ManagementGetUserMetadataRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.GetUserMetadataRequest getUserMetadataRequest;

    public ManagementGetUserMetadataRequest withGetUserMetadataRequest(com.tigrisdata.tigris_core.models.shared.GetUserMetadataRequest getUserMetadataRequest) {
        this.getUserMetadataRequest = getUserMetadataRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metadataKey")
    public String metadataKey;

    public ManagementGetUserMetadataRequest withMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
        return this;
    }
    
    public ManagementGetUserMetadataRequest(@JsonProperty("GetUserMetadataRequest") com.tigrisdata.tigris_core.models.shared.GetUserMetadataRequest getUserMetadataRequest, @JsonProperty("metadataKey") String metadataKey) {
        this.getUserMetadataRequest = getUserMetadataRequest;
        this.metadataKey = metadataKey;
  }
}
