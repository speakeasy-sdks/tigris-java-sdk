package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InsertRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public InsertRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    public java.util.Map<String, Object>[] documents;
    public InsertRequest withDocuments(java.util.Map<String, Object>[] documents) {
        this.documents = documents;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public InsertRequestOptions options;
    public InsertRequest withOptions(InsertRequestOptions options) {
        this.options = options;
        return this;
    }
    
}
