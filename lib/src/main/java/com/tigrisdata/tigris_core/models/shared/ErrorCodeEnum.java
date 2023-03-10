package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ErrorCodeEnum {
    OK("OK"),
    CANCELLED("CANCELLED"),
    UNKNOWN("UNKNOWN"),
    INVALID_ARGUMENT("INVALID_ARGUMENT"),
    DEADLINE_EXCEEDED("DEADLINE_EXCEEDED"),
    NOT_FOUND("NOT_FOUND"),
    ALREADY_EXISTS("ALREADY_EXISTS"),
    PERMISSION_DENIED("PERMISSION_DENIED"),
    RESOURCE_EXHAUSTED("RESOURCE_EXHAUSTED"),
    FAILED_PRECONDITION("FAILED_PRECONDITION"),
    ABORTED("ABORTED"),
    OUT_OF_RANGE("OUT_OF_RANGE"),
    UNIMPLEMENTED("UNIMPLEMENTED"),
    INTERNAL("INTERNAL"),
    UNAVAILABLE("UNAVAILABLE"),
    DATA_LOSS("DATA_LOSS"),
    UNAUTHENTICATED("UNAUTHENTICATED"),
    CONFLICT("CONFLICT"),
    BAD_GATEWAY("BAD_GATEWAY"),
    METHOD_NOT_ALLOWED("METHOD_NOT_ALLOWED");

    @JsonValue
    public final String value;

    private ErrorCodeEnum(String value) {
        this.value = value;
    }
}
