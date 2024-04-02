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


public class MessagesResponse {

    /**
     * ids of the published messages
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ids")
    private Optional<? extends java.util.List<String>> ids;

    public MessagesResponse(
            @JsonProperty("ids") Optional<? extends java.util.List<String>> ids) {
        Utils.checkNotNull(ids, "ids");
        this.ids = ids;
    }

    /**
     * ids of the published messages
     */
    public Optional<? extends java.util.List<String>> ids() {
        return ids;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ids of the published messages
     */
    public MessagesResponse withIds(java.util.List<String> ids) {
        Utils.checkNotNull(ids, "ids");
        this.ids = Optional.ofNullable(ids);
        return this;
    }

    /**
     * ids of the published messages
     */
    public MessagesResponse withIds(Optional<? extends java.util.List<String>> ids) {
        Utils.checkNotNull(ids, "ids");
        this.ids = ids;
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
        MessagesResponse other = (MessagesResponse) o;
        return 
            java.util.Objects.deepEquals(this.ids, other.ids);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            ids);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MessagesResponse.class,
                "ids", ids);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<String>> ids = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ids of the published messages
         */
        public Builder ids(java.util.List<String> ids) {
            Utils.checkNotNull(ids, "ids");
            this.ids = Optional.ofNullable(ids);
            return this;
        }

        /**
         * ids of the published messages
         */
        public Builder ids(Optional<? extends java.util.List<String>> ids) {
            Utils.checkNotNull(ids, "ids");
            this.ids = ids;
            return this;
        }
        
        public MessagesResponse build() {
            return new MessagesResponse(
                ids);
        }
    }
}
