package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateByIdRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document")
    public String document;
    public CreateByIdRequest withDocument(String document) {
        this.document = document;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public CreateByIdRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public String index;
    public CreateByIdRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;
    public CreateByIdRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
}
