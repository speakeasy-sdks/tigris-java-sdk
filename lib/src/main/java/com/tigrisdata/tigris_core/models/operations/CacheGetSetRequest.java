/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;


public class CacheGetSetRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.GetSetRequest getSetRequest;

    public CacheGetSetRequest withGetSetRequest(com.tigrisdata.tigris_core.models.shared.GetSetRequest getSetRequest) {
        this.getSetRequest = getSetRequest;
        return this;
    }
    
    /**
     * cache key
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=key")
    public String key;

    public CacheGetSetRequest withKey(String key) {
        this.key = key;
        return this;
    }
    
    /**
     * cache name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    public String name;

    public CacheGetSetRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Tigris project name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;

    public CacheGetSetRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public CacheGetSetRequest(@JsonProperty("GetSetRequest") com.tigrisdata.tigris_core.models.shared.GetSetRequest getSetRequest, @JsonProperty("key") String key, @JsonProperty("name") String name, @JsonProperty("project") String project) {
        this.getSetRequest = getSetRequest;
        this.key = key;
        this.name = name;
        this.project = project;
  }
}
