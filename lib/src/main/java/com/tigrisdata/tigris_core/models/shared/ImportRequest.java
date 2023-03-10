package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ImportRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autogenerated")
    public String[] autogenerated;
    public ImportRequest withAutogenerated(String[] autogenerated) {
        this.autogenerated = autogenerated;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public ImportRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("create_collection")
    public Boolean createCollection;
    public ImportRequest withCreateCollection(Boolean createCollection) {
        this.createCollection = createCollection;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    public java.util.Map<String, Object>[] documents;
    public ImportRequest withDocuments(java.util.Map<String, Object>[] documents) {
        this.documents = documents;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public ImportRequestOptions options;
    public ImportRequest withOptions(ImportRequestOptions options) {
        this.options = options;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary_key")
    public String[] primaryKey;
    public ImportRequest withPrimaryKey(String[] primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    
}
