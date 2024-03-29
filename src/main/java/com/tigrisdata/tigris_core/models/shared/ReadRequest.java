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


public class ReadRequest {

    /**
     * Optionally specify a database branch name to perform operation on
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    private Optional<? extends String> branch;

    /**
     * To read specific fields from a document. Default is all.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    private Optional<? extends Fields> fields;

    /**
     * Returns documents matching this filter. A filter can simply be a key, value pair where a key is the field name and the value would be the value for this field. Tigris also allows complex filtering by passing logical expressions. Logical filters are applied on two or more fields using `$or` and `$and`. A few examples of filters: &lt;li&gt; To read a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To read all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}` Filter allows setting collation on an individual field level. To set collation for all the fields see options. The detailed documentation of the filter is &lt;a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<? extends ReadRequestFilter> filter;

    /**
     * Options that can be used to modify the results, for example "limit" to control the number of documents returned by the server.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    private Optional<? extends ReadRequestOptions> options;

    /**
     * Array of fields and corresponding sort orders to order the results. Ex: 1 `[{ "salary": "$desc" }]`, Ex: 2  `[{ "salary": "$asc"}]`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    private Optional<? extends String> sort;

    public ReadRequest(
            @JsonProperty("branch") Optional<? extends String> branch,
            @JsonProperty("fields") Optional<? extends Fields> fields,
            @JsonProperty("filter") Optional<? extends ReadRequestFilter> filter,
            @JsonProperty("options") Optional<? extends ReadRequestOptions> options,
            @JsonProperty("sort") Optional<? extends String> sort) {
        Utils.checkNotNull(branch, "branch");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(options, "options");
        Utils.checkNotNull(sort, "sort");
        this.branch = branch;
        this.fields = fields;
        this.filter = filter;
        this.options = options;
        this.sort = sort;
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public Optional<? extends String> branch() {
        return branch;
    }

    /**
     * To read specific fields from a document. Default is all.
     */
    public Optional<? extends Fields> fields() {
        return fields;
    }

    /**
     * Returns documents matching this filter. A filter can simply be a key, value pair where a key is the field name and the value would be the value for this field. Tigris also allows complex filtering by passing logical expressions. Logical filters are applied on two or more fields using `$or` and `$and`. A few examples of filters: &lt;li&gt; To read a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To read all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}` Filter allows setting collation on an individual field level. To set collation for all the fields see options. The detailed documentation of the filter is &lt;a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here"&gt;here&lt;/a&gt;.
     */
    public Optional<? extends ReadRequestFilter> filter() {
        return filter;
    }

    /**
     * Options that can be used to modify the results, for example "limit" to control the number of documents returned by the server.
     */
    public Optional<? extends ReadRequestOptions> options() {
        return options;
    }

    /**
     * Array of fields and corresponding sort orders to order the results. Ex: 1 `[{ "salary": "$desc" }]`, Ex: 2  `[{ "salary": "$asc"}]`
     */
    public Optional<? extends String> sort() {
        return sort;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public ReadRequest withBranch(String branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = Optional.ofNullable(branch);
        return this;
    }

    /**
     * Optionally specify a database branch name to perform operation on
     */
    public ReadRequest withBranch(Optional<? extends String> branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = branch;
        return this;
    }

    /**
     * To read specific fields from a document. Default is all.
     */
    public ReadRequest withFields(Fields fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * To read specific fields from a document. Default is all.
     */
    public ReadRequest withFields(Optional<? extends Fields> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Returns documents matching this filter. A filter can simply be a key, value pair where a key is the field name and the value would be the value for this field. Tigris also allows complex filtering by passing logical expressions. Logical filters are applied on two or more fields using `$or` and `$and`. A few examples of filters: &lt;li&gt; To read a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To read all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}` Filter allows setting collation on an individual field level. To set collation for all the fields see options. The detailed documentation of the filter is &lt;a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here"&gt;here&lt;/a&gt;.
     */
    public ReadRequest withFilter(ReadRequestFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * Returns documents matching this filter. A filter can simply be a key, value pair where a key is the field name and the value would be the value for this field. Tigris also allows complex filtering by passing logical expressions. Logical filters are applied on two or more fields using `$or` and `$and`. A few examples of filters: &lt;li&gt; To read a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To read all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}` Filter allows setting collation on an individual field level. To set collation for all the fields see options. The detailed documentation of the filter is &lt;a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here"&gt;here&lt;/a&gt;.
     */
    public ReadRequest withFilter(Optional<? extends ReadRequestFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * Options that can be used to modify the results, for example "limit" to control the number of documents returned by the server.
     */
    public ReadRequest withOptions(ReadRequestOptions options) {
        Utils.checkNotNull(options, "options");
        this.options = Optional.ofNullable(options);
        return this;
    }

    /**
     * Options that can be used to modify the results, for example "limit" to control the number of documents returned by the server.
     */
    public ReadRequest withOptions(Optional<? extends ReadRequestOptions> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
        return this;
    }

    /**
     * Array of fields and corresponding sort orders to order the results. Ex: 1 `[{ "salary": "$desc" }]`, Ex: 2  `[{ "salary": "$asc"}]`
     */
    public ReadRequest withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    /**
     * Array of fields and corresponding sort orders to order the results. Ex: 1 `[{ "salary": "$desc" }]`, Ex: 2  `[{ "salary": "$asc"}]`
     */
    public ReadRequest withSort(Optional<? extends String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
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
        ReadRequest other = (ReadRequest) o;
        return 
            java.util.Objects.deepEquals(this.branch, other.branch) &&
            java.util.Objects.deepEquals(this.fields, other.fields) &&
            java.util.Objects.deepEquals(this.filter, other.filter) &&
            java.util.Objects.deepEquals(this.options, other.options) &&
            java.util.Objects.deepEquals(this.sort, other.sort);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            branch,
            fields,
            filter,
            options,
            sort);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReadRequest.class,
                "branch", branch,
                "fields", fields,
                "filter", filter,
                "options", options,
                "sort", sort);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> branch = Optional.empty();
 
        private Optional<? extends Fields> fields = Optional.empty();
 
        private Optional<? extends ReadRequestFilter> filter = Optional.empty();
 
        private Optional<? extends ReadRequestOptions> options = Optional.empty();
 
        private Optional<? extends String> sort = Optional.empty();  
        
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
         * To read specific fields from a document. Default is all.
         */
        public Builder fields(Fields fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = Optional.ofNullable(fields);
            return this;
        }

        /**
         * To read specific fields from a document. Default is all.
         */
        public Builder fields(Optional<? extends Fields> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }

        /**
         * Returns documents matching this filter. A filter can simply be a key, value pair where a key is the field name and the value would be the value for this field. Tigris also allows complex filtering by passing logical expressions. Logical filters are applied on two or more fields using `$or` and `$and`. A few examples of filters: &lt;li&gt; To read a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To read all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}` Filter allows setting collation on an individual field level. To set collation for all the fields see options. The detailed documentation of the filter is &lt;a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here"&gt;here&lt;/a&gt;.
         */
        public Builder filter(ReadRequestFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * Returns documents matching this filter. A filter can simply be a key, value pair where a key is the field name and the value would be the value for this field. Tigris also allows complex filtering by passing logical expressions. Logical filters are applied on two or more fields using `$or` and `$and`. A few examples of filters: &lt;li&gt; To read a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To read all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}` Filter allows setting collation on an individual field level. To set collation for all the fields see options. The detailed documentation of the filter is &lt;a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here"&gt;here&lt;/a&gt;.
         */
        public Builder filter(Optional<? extends ReadRequestFilter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * Options that can be used to modify the results, for example "limit" to control the number of documents returned by the server.
         */
        public Builder options(ReadRequestOptions options) {
            Utils.checkNotNull(options, "options");
            this.options = Optional.ofNullable(options);
            return this;
        }

        /**
         * Options that can be used to modify the results, for example "limit" to control the number of documents returned by the server.
         */
        public Builder options(Optional<? extends ReadRequestOptions> options) {
            Utils.checkNotNull(options, "options");
            this.options = options;
            return this;
        }

        /**
         * Array of fields and corresponding sort orders to order the results. Ex: 1 `[{ "salary": "$desc" }]`, Ex: 2  `[{ "salary": "$asc"}]`
         */
        public Builder sort(String sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        /**
         * Array of fields and corresponding sort orders to order the results. Ex: 1 `[{ "salary": "$desc" }]`, Ex: 2  `[{ "salary": "$asc"}]`
         */
        public Builder sort(Optional<? extends String> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
            return this;
        }
        
        public ReadRequest build() {
            return new ReadRequest(
                branch,
                fields,
                filter,
                options,
                sort);
        }
    }
}

