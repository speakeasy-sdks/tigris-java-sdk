/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetRequest {
    /**
     * optional - ttl specific to this key in second
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ex")
    public Long ex;

    public SetRequest withEx(Long ex) {
        this.ex = ex;
        return this;
    }
    
    /**
     * set only if the key doesn't exist
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nx")
    public Boolean nx;

    public SetRequest withNx(Boolean nx) {
        this.nx = nx;
        return this;
    }
    
    /**
     * optional - ttl specific to this key in millisecond
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("px")
    public Long px;

    public SetRequest withPx(Long px) {
        this.px = px;
        return this;
    }
    
    /**
     * free form byte[] value
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public String value;

    public SetRequest withValue(String value) {
        this.value = value;
        return this;
    }
    
    /**
     * set only if the key exist
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("xx")
    public Boolean xx;

    public SetRequest withXx(Boolean xx) {
        this.xx = xx;
        return this;
    }
    
    public SetRequest(){}
}
