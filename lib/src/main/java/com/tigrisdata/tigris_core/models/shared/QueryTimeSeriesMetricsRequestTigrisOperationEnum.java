package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum QueryTimeSeriesMetricsRequestTigrisOperationEnum {
    ALL("ALL"),
    READ("READ"),
    WRITE("WRITE"),
    METADATA("METADATA");

    @JsonValue
    public final String value;

    private QueryTimeSeriesMetricsRequestTigrisOperationEnum(String value) {
        this.value = value;
    }
}
