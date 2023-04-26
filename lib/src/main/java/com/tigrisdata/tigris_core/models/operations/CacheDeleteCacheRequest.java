/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class CacheDeleteCacheRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> requestBody;
    public CacheDeleteCacheRequest withRequestBody(java.util.Map<String, Object> requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * cache name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    public String name;
    public CacheDeleteCacheRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Tigris project name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public CacheDeleteCacheRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public CacheDeleteCacheRequest(@JsonProperty("RequestBody") java.util.Map<String, Object> requestBody, @JsonProperty("name") String name, @JsonProperty("project") String project) {
        this.requestBody = requestBody;
        this.name = name;
        this.project = project;
  }
}
