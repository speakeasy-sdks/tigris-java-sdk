/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReplaceRequestOptions - Additional options for replace requests.
 */

public class ReplaceRequestOptions {
    /**
     * Additional options to modify write requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("write_options")
    public WriteOptions writeOptions;

    public ReplaceRequestOptions withWriteOptions(WriteOptions writeOptions) {
        this.writeOptions = writeOptions;
        return this;
    }
    
    public ReplaceRequestOptions(){}
}
