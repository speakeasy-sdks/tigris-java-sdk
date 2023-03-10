package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DescribeNamespacesData {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public String details;
    public DescribeNamespacesData withDetails(String details) {
        this.details = details;
        return this;
    }
    
}
