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


public class UpdateRequest {

    /**
     * Optionally specify a database branch name to perform operation on
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    private Optional<? extends String> branch;

    /**
     * Fields contains set of fields with the values which need to be updated. Should be proper JSON object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    private Optional<? extends UpdateRequestFields> fields;

    /**
     * Update documents which matching specified filter. A filter can simply be key, value where key is the field name and value would be the value for this field. Or a filter can be logical where two or more fields can be logically joined using $or and $and. A few examples of filter: &lt;li&gt; To update a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To update all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<? extends UpdateRequestFilter> filter;

    /**
     * Additional options for update requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    private Optional<? extends UpdateRequestOptions> options;

    public UpdateRequest(
            @JsonProperty("branch") Optional<? extends String> branch,
            @JsonProperty("fields") Optional<? extends UpdateRequestFields> fields,
            @JsonProperty("filter") Optional<? extends UpdateRequestFilter> filter,
            @JsonProperty("options") Optional<? extends UpdateRequestOptions> options) {
        Utils.checkNotNull(branch, "branch");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(options, "options");
        this.branch = branch;
        this.fields = fields;
        this.filter = filter;
        this.options = options;
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public Optional<? extends String> branch() {
        return branch;
    }

    /**
     * Fields contains set of fields with the values which need to be updated. Should be proper JSON object.
     */
    public Optional<? extends UpdateRequestFields> fields() {
        return fields;
    }

    /**
     * Update documents which matching specified filter. A filter can simply be key, value where key is the field name and value would be the value for this field. Or a filter can be logical where two or more fields can be logically joined using $or and $and. A few examples of filter: &lt;li&gt; To update a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To update all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}`
     */
    public Optional<? extends UpdateRequestFilter> filter() {
        return filter;
    }

    /**
     * Additional options for update requests.
     */
    public Optional<? extends UpdateRequestOptions> options() {
        return options;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public UpdateRequest withBranch(String branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = Optional.ofNullable(branch);
        return this;
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public UpdateRequest withBranch(Optional<? extends String> branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = branch;
        return this;
    }

    /**
     * Fields contains set of fields with the values which need to be updated. Should be proper JSON object.
     */
    public UpdateRequest withFields(UpdateRequestFields fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Fields contains set of fields with the values which need to be updated. Should be proper JSON object.
     */
    public UpdateRequest withFields(Optional<? extends UpdateRequestFields> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Update documents which matching specified filter. A filter can simply be key, value where key is the field name and value would be the value for this field. Or a filter can be logical where two or more fields can be logically joined using $or and $and. A few examples of filter: &lt;li&gt; To update a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To update all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}`
     */
    public UpdateRequest withFilter(UpdateRequestFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * Update documents which matching specified filter. A filter can simply be key, value where key is the field name and value would be the value for this field. Or a filter can be logical where two or more fields can be logically joined using $or and $and. A few examples of filter: &lt;li&gt; To update a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To update all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}`
     */
    public UpdateRequest withFilter(Optional<? extends UpdateRequestFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * Additional options for update requests.
     */
    public UpdateRequest withOptions(UpdateRequestOptions options) {
        Utils.checkNotNull(options, "options");
        this.options = Optional.ofNullable(options);
        return this;
    }

    /**
     * Additional options for update requests.
     */
    public UpdateRequest withOptions(Optional<? extends UpdateRequestOptions> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
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
        UpdateRequest other = (UpdateRequest) o;
        return 
            java.util.Objects.deepEquals(this.branch, other.branch) &&
            java.util.Objects.deepEquals(this.fields, other.fields) &&
            java.util.Objects.deepEquals(this.filter, other.filter) &&
            java.util.Objects.deepEquals(this.options, other.options);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            branch,
            fields,
            filter,
            options);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateRequest.class,
                "branch", branch,
                "fields", fields,
                "filter", filter,
                "options", options);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> branch = Optional.empty();
 
        private Optional<? extends UpdateRequestFields> fields = Optional.empty();
 
        private Optional<? extends UpdateRequestFilter> filter = Optional.empty();
 
        private Optional<? extends UpdateRequestOptions> options = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Optionally specify a database branch name to perform operation on
         */
        public Builder branch(String branch) {
            Utils.checkNotNull(branch, "branch");
            this.branch = Optional.ofNullable(branch);
            return this;
        }

        /**
         * Optionally specify a database branch name to perform operation on
         */
        public Builder branch(Optional<? extends String> branch) {
            Utils.checkNotNull(branch, "branch");
            this.branch = branch;
            return this;
        }

        /**
         * Fields contains set of fields with the values which need to be updated. Should be proper JSON object.
         */
        public Builder fields(UpdateRequestFields fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = Optional.ofNullable(fields);
            return this;
        }

        /**
         * Fields contains set of fields with the values which need to be updated. Should be proper JSON object.
         */
        public Builder fields(Optional<? extends UpdateRequestFields> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }

        /**
         * Update documents which matching specified filter. A filter can simply be key, value where key is the field name and value would be the value for this field. Or a filter can be logical where two or more fields can be logically joined using $or and $and. A few examples of filter: &lt;li&gt; To update a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To update all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}`
         */
        public Builder filter(UpdateRequestFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * Update documents which matching specified filter. A filter can simply be key, value where key is the field name and value would be the value for this field. Or a filter can be logical where two or more fields can be logically joined using $or and $and. A few examples of filter: &lt;li&gt; To update a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To update all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}`
         */
        public Builder filter(Optional<? extends UpdateRequestFilter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * Additional options for update requests.
         */
        public Builder options(UpdateRequestOptions options) {
            Utils.checkNotNull(options, "options");
            this.options = Optional.ofNullable(options);
            return this;
        }

        /**
         * Additional options for update requests.
         */
        public Builder options(Optional<? extends UpdateRequestOptions> options) {
            Utils.checkNotNull(options, "options");
            this.options = options;
            return this;
        }
        
        public UpdateRequest build() {
            return new UpdateRequest(
                branch,
                fields,
                filter,
                options);
        }
    }
}

