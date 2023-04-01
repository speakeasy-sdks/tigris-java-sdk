/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NamespaceInfo {
    /**
     * The unique namespace code.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public Integer code;
    public NamespaceInfo withCode(Integer code) {
        this.code = code;
        return this;
    }
    
    /**
     * The namespace unique id.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public NamespaceInfo withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The namespace display name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public NamespaceInfo withName(String name) {
        this.name = name;
        return this;
    }
    
}
