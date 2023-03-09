package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplaceRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public ReplaceRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    public java.util.Map<String, Object>[] documents;
    public ReplaceRequest withDocuments(java.util.Map<String, Object>[] documents) {
        this.documents = documents;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public ReplaceRequestOptions options;
    public ReplaceRequest withOptions(ReplaceRequestOptions options) {
        this.options = options;
        return this;
    }
    
}
