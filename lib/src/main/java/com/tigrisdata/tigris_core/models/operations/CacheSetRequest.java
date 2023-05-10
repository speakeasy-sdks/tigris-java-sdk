/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class CacheSetRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.SetRequest setRequest;

    public CacheSetRequest withSetRequest(com.tigrisdata.tigris_core.models.shared.SetRequest setRequest) {
        this.setRequest = setRequest;
        return this;
    }
    
    /**
     * cache key
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=key")
    public String key;

    public CacheSetRequest withKey(String key) {
        this.key = key;
        return this;
    }
    
    /**
     * cache name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    public String name;

    public CacheSetRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Tigris project name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;

    public CacheSetRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public CacheSetRequest(@JsonProperty("SetRequest") com.tigrisdata.tigris_core.models.shared.SetRequest setRequest, @JsonProperty("key") String key, @JsonProperty("name") String name, @JsonProperty("project") String project) {
        this.setRequest = setRequest;
        this.key = key;
        this.name = name;
        this.project = project;
  }
}
