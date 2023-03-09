package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Collation
 * A collation allows you to specify string comparison rules. Default is case-sensitive, to override it you can set this option to 'ci' that will apply to all the text fields in the filters.
**/
public class Collation {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("case")
    public String case_;
    public Collation withCase(String case_) {
        this.case_ = case_;
        return this;
    }
    
}
