package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOrUpdateIndexRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public CreateOrUpdateIndexRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("only_create")
    public Boolean onlyCreate;
    public CreateOrUpdateIndexRequest withOnlyCreate(Boolean onlyCreate) {
        this.onlyCreate = onlyCreate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;
    public CreateOrUpdateIndexRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public String schema;
    public CreateOrUpdateIndexRequest withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
}
