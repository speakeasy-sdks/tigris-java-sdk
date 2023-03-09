package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateRequestOptions
 * Additional options for update requests.
**/
public class UpdateRequestOptions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collation")
    public Collation collation;
    public UpdateRequestOptions withCollation(Collation collation) {
        this.collation = collation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public UpdateRequestOptions withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("write_options")
    public java.util.Map<String, Object> writeOptions;
    public UpdateRequestOptions withWriteOptions(java.util.Map<String, Object> writeOptions) {
        this.writeOptions = writeOptions;
        return this;
    }
    
}
