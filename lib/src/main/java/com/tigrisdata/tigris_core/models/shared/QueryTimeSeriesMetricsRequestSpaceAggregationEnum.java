package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum QueryTimeSeriesMetricsRequestSpaceAggregationEnum {
    AVG("AVG"),
    MIN("MIN"),
    MAX("MAX"),
    SUM("SUM");

    @JsonValue
    public final String value;

    private QueryTimeSeriesMetricsRequestSpaceAggregationEnum(String value) {
        this.value = value;
    }
}
