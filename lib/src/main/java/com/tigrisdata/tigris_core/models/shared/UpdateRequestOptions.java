/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateRequestOptions - Additional options for update requests.
 */
public class UpdateRequestOptions {
    /**
     * A collation allows you to specify string comparison rules. Default is case-sensitive, to override it you can set this option to 'ci' that will apply to all the text fields in the filters.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collation")
    public Collation collation;

    public UpdateRequestOptions withCollation(Collation collation) {
        this.collation = collation;
        return this;
    }
    
    /**
     * Limit the number of documents to be updated
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;

    public UpdateRequestOptions withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * Additional options to modify write requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("write_options")
    public java.util.Map<String, Object> writeOptions;

    public UpdateRequestOptions withWriteOptions(java.util.Map<String, Object> writeOptions) {
        this.writeOptions = writeOptions;
        return this;
    }
    
    public UpdateRequestOptions(){}
}
