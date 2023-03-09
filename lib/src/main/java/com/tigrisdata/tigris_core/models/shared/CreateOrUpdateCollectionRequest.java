package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOrUpdateCollectionRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public CreateOrUpdateCollectionRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("only_create")
    public Boolean onlyCreate;
    public CreateOrUpdateCollectionRequest withOnlyCreate(Boolean onlyCreate) {
        this.onlyCreate = onlyCreate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public java.util.Map<String, Object> options;
    public CreateOrUpdateCollectionRequest withOptions(java.util.Map<String, Object> options) {
        this.options = options;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public java.util.Map<String, Object> schema;
    public CreateOrUpdateCollectionRequest withSchema(java.util.Map<String, Object> schema) {
        this.schema = schema;
        return this;
    }
    
}
