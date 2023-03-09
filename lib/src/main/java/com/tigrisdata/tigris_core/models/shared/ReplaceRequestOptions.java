package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReplaceRequestOptions
 * Additional options for replace requests.
**/
public class ReplaceRequestOptions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("write_options")
    public java.util.Map<String, Object> writeOptions;
    public ReplaceRequestOptions withWriteOptions(java.util.Map<String, Object> writeOptions) {
        this.writeOptions = writeOptions;
        return this;
    }
    
}
