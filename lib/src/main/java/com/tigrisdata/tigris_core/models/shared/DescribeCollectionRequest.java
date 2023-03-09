package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DescribeCollectionRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public DescribeCollectionRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collection")
    public String collection;
    public DescribeCollectionRequest withCollection(String collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public java.util.Map<String, Object> options;
    public DescribeCollectionRequest withOptions(java.util.Map<String, Object> options) {
        this.options = options;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;
    public DescribeCollectionRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema_format")
    public String schemaFormat;
    public DescribeCollectionRequest withSchemaFormat(String schemaFormat) {
        this.schemaFormat = schemaFormat;
        return this;
    }
    
}
