package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RotateAppKeyRequest
 * Request rotation of an app key secret
**/
public class RotateAppKeyRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public RotateAppKeyRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;
    public RotateAppKeyRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
}
