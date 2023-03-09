package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DescribeNamespacesResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public DescribeNamespacesData data;
    public DescribeNamespacesResponse withData(DescribeNamespacesData data) {
        this.data = data;
        return this;
    }
    
}
