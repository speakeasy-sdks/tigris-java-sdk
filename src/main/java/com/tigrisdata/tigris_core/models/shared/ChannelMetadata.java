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


public class ChannelMetadata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel")
    private Optional<? extends String> channel;

    public ChannelMetadata(
            @JsonProperty("channel") Optional<? extends String> channel) {
        Utils.checkNotNull(channel, "channel");
        this.channel = channel;
    }

    public Optional<? extends String> channel() {
        return channel;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ChannelMetadata withChannel(String channel) {
        Utils.checkNotNull(channel, "channel");
        this.channel = Optional.ofNullable(channel);
        return this;
    }

    public ChannelMetadata withChannel(Optional<? extends String> channel) {
        Utils.checkNotNull(channel, "channel");
        this.channel = channel;
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
        ChannelMetadata other = (ChannelMetadata) o;
        return 
            java.util.Objects.deepEquals(this.channel, other.channel);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            channel);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ChannelMetadata.class,
                "channel", channel);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> channel = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder channel(String channel) {
            Utils.checkNotNull(channel, "channel");
            this.channel = Optional.ofNullable(channel);
            return this;
        }

        public Builder channel(Optional<? extends String> channel) {
            Utils.checkNotNull(channel, "channel");
            this.channel = channel;
            return this;
        }
        
        public ChannelMetadata build() {
            return new ChannelMetadata(
                channel);
        }
    }
}

