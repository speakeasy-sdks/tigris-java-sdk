/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DescribeDatabaseRequest {
    /**
     * Optionally specify a database branch name to perform operation on
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")public String branch;
    public DescribeDatabaseRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * Project name whose db is under target to get description.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")public String project;
    public DescribeDatabaseRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    /**
     * Return schema in the requested format. Format can be JSON, Go, TypeScript, Java. Default is JSON.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema_format")public String schemaFormat;
    public DescribeDatabaseRequest withSchemaFormat(String schemaFormat) {
        this.schemaFormat = schemaFormat;
        return this;
    }
    
}
