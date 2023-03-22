/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CacheMetadata {
    /**
     * Cache name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")public String name;
    public CacheMetadata withName(String name) {
        this.name = name;
        return this;
    }
    
}
