package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetInfoResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("server_version")
    public String serverVersion;
    public GetInfoResponse withServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }
    
}
