package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class RealtimeGetRTChannelPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=channel")
    public String channel;
    public RealtimeGetRTChannelPathParams withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public RealtimeGetRTChannelPathParams withProject(String project) {
        this.project = project;
        return this;
    }
    
}
