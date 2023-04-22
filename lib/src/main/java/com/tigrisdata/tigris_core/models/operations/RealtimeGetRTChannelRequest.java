/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class RealtimeGetRTChannelRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=channel")
    public String channel;
    public RealtimeGetRTChannelRequest withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public RealtimeGetRTChannelRequest withProject(String project) {
        this.project = project;
        return this;
    }
    

    public RealtimeGetRTChannelRequest(@JsonProperty("channel") String channel, @JsonProperty("project") String project) {
    this.channel = channel;
this.project = project;
  }
}
