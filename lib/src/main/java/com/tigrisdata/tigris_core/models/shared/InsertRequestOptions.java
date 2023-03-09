package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InsertRequestOptions
 * additional options for insert requests.
**/
public class InsertRequestOptions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("write_options")
    public java.util.Map<String, Object> writeOptions;
    public InsertRequestOptions withWriteOptions(java.util.Map<String, Object> writeOptions) {
        this.writeOptions = writeOptions;
        return this;
    }
    
}
