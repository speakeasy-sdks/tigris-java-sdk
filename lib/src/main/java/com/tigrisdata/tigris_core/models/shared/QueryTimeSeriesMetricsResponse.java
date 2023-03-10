package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryTimeSeriesMetricsResponse
 * QueryTimeSeriesMetric responds with this type.
**/
public class QueryTimeSeriesMetricsResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public Long from;
    public QueryTimeSeriesMetricsResponse withFrom(Long from) {
        this.from = from;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query")
    public String query;
    public QueryTimeSeriesMetricsResponse withQuery(String query) {
        this.query = query;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("series")
    public MetricSeries[] series;
    public QueryTimeSeriesMetricsResponse withSeries(MetricSeries[] series) {
        this.series = series;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("to")
    public Long to;
    public QueryTimeSeriesMetricsResponse withTo(Long to) {
        this.to = to;
        return this;
    }
    
}
