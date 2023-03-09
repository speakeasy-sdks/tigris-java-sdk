package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetRTChannelsResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channels")
    public ChannelMetadata[] channels;
    public GetRTChannelsResponse withChannels(ChannelMetadata[] channels) {
        this.channels = channels;
        return this;
    }
    
}
