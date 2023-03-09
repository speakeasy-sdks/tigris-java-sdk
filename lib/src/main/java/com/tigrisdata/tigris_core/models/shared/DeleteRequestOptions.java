package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteRequestOptions
 * Additional options for deleted requests.
**/
public class DeleteRequestOptions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collation")
    public Collation collation;
    public DeleteRequestOptions withCollation(Collation collation) {
        this.collation = collation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public DeleteRequestOptions withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("write_options")
    public java.util.Map<String, Object> writeOptions;
    public DeleteRequestOptions withWriteOptions(java.util.Map<String, Object> writeOptions) {
        this.writeOptions = writeOptions;
        return this;
    }
    
}
