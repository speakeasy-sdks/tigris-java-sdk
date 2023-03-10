package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MetricSeries
 * Represents series in timeseries based on input query.
**/
public class MetricSeries {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataPoints")
    public DataPoint[] dataPoints;
    public MetricSeries withDataPoints(DataPoint[] dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public Long from;
    public MetricSeries withFrom(Long from) {
        this.from = from;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metric")
    public String metric;
    public MetricSeries withMetric(String metric) {
        this.metric = metric;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scope")
    public String scope;
    public MetricSeries withScope(String scope) {
        this.scope = scope;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("to")
    public Long to;
    public MetricSeries withTo(Long to) {
        this.to = to;
        return this;
    }
    
}
