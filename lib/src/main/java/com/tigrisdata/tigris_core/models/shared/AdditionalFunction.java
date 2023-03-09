package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdditionalFunction
 * Additional function to apply on metrics query
**/
public class AdditionalFunction {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rollup")
    public RollupFunction rollup;
    public AdditionalFunction withRollup(RollupFunction rollup) {
        this.rollup = rollup;
        return this;
    }
    
}
