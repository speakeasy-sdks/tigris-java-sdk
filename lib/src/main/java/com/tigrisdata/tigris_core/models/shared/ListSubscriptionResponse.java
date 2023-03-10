package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListSubscriptionResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("devices")
    public String[] devices;
    public ListSubscriptionResponse withDevices(String[] devices) {
        this.devices = devices;
        return this;
    }
    
}
