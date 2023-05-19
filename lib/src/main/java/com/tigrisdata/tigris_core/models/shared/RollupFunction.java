/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RollupFunction - Rollup function aggregates the slices of metrics returned by original query and lets you operate on the slices using aggregator and constructs the bigger slice of your choice of interval (specified in seconds).
 */
public class RollupFunction {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aggregator")
    public RollupFunctionAggregator aggregator;

    public RollupFunction withAggregator(RollupFunctionAggregator aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interval")
    public Long interval;

    public RollupFunction withInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    
    public RollupFunction(){}
}
