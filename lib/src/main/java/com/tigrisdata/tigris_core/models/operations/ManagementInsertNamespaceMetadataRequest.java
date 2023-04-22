/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class ManagementInsertNamespaceMetadataRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest insertNamespaceMetadataRequest;
    public ManagementInsertNamespaceMetadataRequest withInsertNamespaceMetadataRequest(com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest insertNamespaceMetadataRequest) {
        this.insertNamespaceMetadataRequest = insertNamespaceMetadataRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metadataKey")
    public String metadataKey;
    public ManagementInsertNamespaceMetadataRequest withMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
        return this;
    }
    

    public ManagementInsertNamespaceMetadataRequest(@JsonProperty("InsertNamespaceMetadataRequest") com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest insertNamespaceMetadataRequest, @JsonProperty("metadataKey") String metadataKey) {
    this.insertNamespaceMetadataRequest = insertNamespaceMetadataRequest;
this.metadataKey = metadataKey;
  }
}
