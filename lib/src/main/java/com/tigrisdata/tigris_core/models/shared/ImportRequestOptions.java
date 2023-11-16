/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImportRequestOptions - additional options for import requests.
 */

public class ImportRequestOptions {
    /**
     * Additional options to modify write requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("write_options")
    public WriteOptions writeOptions;

    public ImportRequestOptions withWriteOptions(WriteOptions writeOptions) {
        this.writeOptions = writeOptions;
        return this;
    }
    
    public ImportRequestOptions(){}
}
