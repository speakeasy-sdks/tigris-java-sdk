/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;


public class TigrisListAppKeysRequest {
    /**
     * Project name filter
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;

    public TigrisListAppKeysRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public TigrisListAppKeysRequest(@JsonProperty("project") String project) {
        this.project = project;
  }
}
