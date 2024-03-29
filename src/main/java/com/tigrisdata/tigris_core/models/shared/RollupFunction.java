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
 * RollupFunction - Rollup function aggregates the slices of metrics returned by original query and lets you operate on the slices using aggregator and constructs the bigger slice of your choice of interval (specified in seconds).
 */

public class RollupFunction {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aggregator")
    private Optional<? extends Aggregator> aggregator;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interval")
    private Optional<? extends Long> interval;

    public RollupFunction(
            @JsonProperty("aggregator") Optional<? extends Aggregator> aggregator,
            @JsonProperty("interval") Optional<? extends Long> interval) {
        Utils.checkNotNull(aggregator, "aggregator");
        Utils.checkNotNull(interval, "interval");
        this.aggregator = aggregator;
        this.interval = interval;
    }

    public Optional<? extends Aggregator> aggregator() {
        return aggregator;
    }

    public Optional<? extends Long> interval() {
        return interval;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RollupFunction withAggregator(Aggregator aggregator) {
        Utils.checkNotNull(aggregator, "aggregator");
        this.aggregator = Optional.ofNullable(aggregator);
        return this;
    }

    public RollupFunction withAggregator(Optional<? extends Aggregator> aggregator) {
        Utils.checkNotNull(aggregator, "aggregator");
        this.aggregator = aggregator;
        return this;
    }

    public RollupFunction withInterval(long interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = Optional.ofNullable(interval);
        return this;
    }

    public RollupFunction withInterval(Optional<? extends Long> interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = interval;
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
        RollupFunction other = (RollupFunction) o;
        return 
            java.util.Objects.deepEquals(this.aggregator, other.aggregator) &&
            java.util.Objects.deepEquals(this.interval, other.interval);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            aggregator,
            interval);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RollupFunction.class,
                "aggregator", aggregator,
                "interval", interval);
    }
    
    public final static class Builder {
 
        private Optional<? extends Aggregator> aggregator = Optional.empty();
 
        private Optional<? extends Long> interval = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder aggregator(Aggregator aggregator) {
            Utils.checkNotNull(aggregator, "aggregator");
            this.aggregator = Optional.ofNullable(aggregator);
            return this;
        }

        public Builder aggregator(Optional<? extends Aggregator> aggregator) {
            Utils.checkNotNull(aggregator, "aggregator");
            this.aggregator = aggregator;
            return this;
        }

        public Builder interval(long interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = Optional.ofNullable(interval);
            return this;
        }

        public Builder interval(Optional<? extends Long> interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = interval;
            return this;
        }
        
        public RollupFunction build() {
            return new RollupFunction(
                aggregator,
                interval);
        }
    }
}

