/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.tigrisdata.tigris_core.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * Collation - A collation allows you to specify string comparison rules. Default is case-sensitive, to override it you can set this option to 'ci' that will apply to all the text fields in the filters.
 */

public class Collation {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("case")
    private Optional<? extends String> case_;

    public Collation(
            @JsonProperty("case") Optional<? extends String> case_) {
        Utils.checkNotNull(case_, "case_");
        this.case_ = case_;
    }

    public Optional<? extends String> case_() {
        return case_;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Collation withCase(String case_) {
        Utils.checkNotNull(case_, "case_");
        this.case_ = Optional.ofNullable(case_);
        return this;
    }

    public Collation withCase(Optional<? extends String> case_) {
        Utils.checkNotNull(case_, "case_");
        this.case_ = case_;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Collation other = (Collation) o;
        return 
            java.util.Objects.deepEquals(this.case_, other.case_);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            case_);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Collation.class,
                "case_", case_);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> case_ = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder case_(String case_) {
            Utils.checkNotNull(case_, "case_");
            this.case_ = Optional.ofNullable(case_);
            return this;
        }

        public Builder case_(Optional<? extends String> case_) {
            Utils.checkNotNull(case_, "case_");
            this.case_ = case_;
            return this;
        }
        
        public Collation build() {
            return new Collation(
                case_);
        }
    }
}

