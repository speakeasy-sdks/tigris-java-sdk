package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public UpdateRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public java.util.Map<String, Object> fields;
    public UpdateRequest withFields(java.util.Map<String, Object> fields) {
        this.fields = fields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    public java.util.Map<String, Object> filter;
    public UpdateRequest withFilter(java.util.Map<String, Object> filter) {
        this.filter = filter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public UpdateRequestOptions options;
    public UpdateRequest withOptions(UpdateRequestOptions options) {
        this.options = options;
        return this;
    }
    
}
