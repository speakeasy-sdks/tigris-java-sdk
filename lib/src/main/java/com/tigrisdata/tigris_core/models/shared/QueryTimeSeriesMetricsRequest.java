package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryTimeSeriesMetricsRequest
 * Requests the time series metrics
**/
public class QueryTimeSeriesMetricsRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additionalFunctions")
    public AdditionalFunction[] additionalFunctions;
    public QueryTimeSeriesMetricsRequest withAdditionalFunctions(AdditionalFunction[] additionalFunctions) {
        this.additionalFunctions = additionalFunctions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public QueryTimeSeriesMetricsRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collection")
    public String collection;
    public QueryTimeSeriesMetricsRequest withCollection(String collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("db")
    public String db;
    public QueryTimeSeriesMetricsRequest withDb(String db) {
        this.db = db;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public Long from;
    public QueryTimeSeriesMetricsRequest withFrom(Long from) {
        this.from = from;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("function")
    public QueryTimeSeriesMetricsRequestFunctionEnum function;
    public QueryTimeSeriesMetricsRequest withFunction(QueryTimeSeriesMetricsRequestFunctionEnum function) {
        this.function = function;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metric_name")
    public String metricName;
    public QueryTimeSeriesMetricsRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quantile")
    public Float quantile;
    public QueryTimeSeriesMetricsRequest withQuantile(Float quantile) {
        this.quantile = quantile;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("space_aggregated_by")
    public String[] spaceAggregatedBy;
    public QueryTimeSeriesMetricsRequest withSpaceAggregatedBy(String[] spaceAggregatedBy) {
        this.spaceAggregatedBy = spaceAggregatedBy;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("space_aggregation")
    public QueryTimeSeriesMetricsRequestSpaceAggregationEnum spaceAggregation;
    public QueryTimeSeriesMetricsRequest withSpaceAggregation(QueryTimeSeriesMetricsRequestSpaceAggregationEnum spaceAggregation) {
        this.spaceAggregation = spaceAggregation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tigris_operation")
    public QueryTimeSeriesMetricsRequestTigrisOperationEnum tigrisOperation;
    public QueryTimeSeriesMetricsRequest withTigrisOperation(QueryTimeSeriesMetricsRequestTigrisOperationEnum tigrisOperation) {
        this.tigrisOperation = tigrisOperation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("to")
    public Long to;
    public QueryTimeSeriesMetricsRequest withTo(Long to) {
        this.to = to;
        return this;
    }
    
}
