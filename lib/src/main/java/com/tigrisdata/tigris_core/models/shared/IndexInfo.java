/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IndexInfo {
    /**
     * Name of the index.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public IndexInfo withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Schema of the index.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public String schema;
    public IndexInfo withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    

    public IndexInfo(){}
}
