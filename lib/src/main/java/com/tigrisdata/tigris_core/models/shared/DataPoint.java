package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataPoint
 * Represents the data point in timeseries.
**/
public class DataPoint {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timestamp")
    public Long timestamp;
    public DataPoint withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public Double value;
    public DataPoint withValue(Double value) {
        this.value = value;
        return this;
    }
    
}
