package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum QueryTimeSeriesMetricsRequestFunctionEnum {
    RATE("RATE"),
    COUNT("COUNT"),
    NONE("NONE");

    @JsonValue
    public final String value;

    private QueryTimeSeriesMetricsRequestFunctionEnum(String value) {
        this.value = value;
    }
}
