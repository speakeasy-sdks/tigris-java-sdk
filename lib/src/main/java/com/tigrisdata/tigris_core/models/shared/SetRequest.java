package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SetRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ex")
    public Long ex;
    public SetRequest withEx(Long ex) {
        this.ex = ex;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nx")
    public Boolean nx;
    public SetRequest withNx(Boolean nx) {
        this.nx = nx;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("px")
    public Long px;
    public SetRequest withPx(Long px) {
        this.px = px;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public String value;
    public SetRequest withValue(String value) {
        this.value = value;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("xx")
    public Boolean xx;
    public SetRequest withXx(Boolean xx) {
        this.xx = xx;
        return this;
    }
    
}
