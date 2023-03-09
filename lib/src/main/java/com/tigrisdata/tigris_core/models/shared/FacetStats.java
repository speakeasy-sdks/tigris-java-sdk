package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FacetStats
 * Additional stats for faceted field
**/
public class FacetStats {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("avg")
    public Double avg;
    public FacetStats withAvg(Double avg) {
        this.avg = avg;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("count")
    public Long count;
    public FacetStats withCount(Long count) {
        this.count = count;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max")
    public Double max;
    public FacetStats withMax(Double max) {
        this.max = max;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("min")
    public Double min;
    public FacetStats withMin(Double min) {
        this.min = min;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sum")
    public Double sum;
    public FacetStats withSum(Double sum) {
        this.sum = sum;
        return this;
    }
    
}
