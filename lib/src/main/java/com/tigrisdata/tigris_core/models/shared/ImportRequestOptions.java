package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImportRequestOptions
 * additional options for import requests.
**/
public class ImportRequestOptions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("write_options")
    public java.util.Map<String, Object> writeOptions;
    public ImportRequestOptions withWriteOptions(java.util.Map<String, Object> writeOptions) {
        this.writeOptions = writeOptions;
        return this;
    }
    
}
