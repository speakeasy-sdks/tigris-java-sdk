/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Aggregator {
    ROLLUP_AGGREGATOR_SUM("ROLLUP_AGGREGATOR_SUM"),
    ROLLUP_AGGREGATOR_COUNT("ROLLUP_AGGREGATOR_COUNT"),
    ROLLUP_AGGREGATOR_MIN("ROLLUP_AGGREGATOR_MIN"),
    ROLLUP_AGGREGATOR_MAX("ROLLUP_AGGREGATOR_MAX"),
    ROLLUP_AGGREGATOR_AVG("ROLLUP_AGGREGATOR_AVG");

    @JsonValue
    public final String value;

    private Aggregator(String value) {
        this.value = value;
    }
}
