/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Function {
    RATE("RATE"),
    COUNT("COUNT"),
    NONE("NONE");

    @JsonValue
    public final String value;

    private Function(String value) {
        this.value = value;
    }
}
