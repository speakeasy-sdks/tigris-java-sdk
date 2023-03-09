package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DescribeDatabaseRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public DescribeDatabaseRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;
    public DescribeDatabaseRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema_format")
    public String schemaFormat;
    public DescribeDatabaseRequest withSchemaFormat(String schemaFormat) {
        this.schemaFormat = schemaFormat;
        return this;
    }
    
}
