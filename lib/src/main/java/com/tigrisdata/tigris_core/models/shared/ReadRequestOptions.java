package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReadRequestOptions
 * Options that can be used to modify the results, for example "limit" to control the number of documents returned by the server.
**/
public class ReadRequestOptions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collation")
    public Collation collation;
    public ReadRequestOptions withCollation(Collation collation) {
        this.collation = collation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public ReadRequestOptions withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    public String offset;
    public ReadRequestOptions withOffset(String offset) {
        this.offset = offset;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skip")
    public Long skip;
    public ReadRequestOptions withSkip(Long skip) {
        this.skip = skip;
        return this;
    }
    
}
