/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReadRequest {
    /**
     * Optionally specify a database branch name to perform operation on
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;

    public ReadRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * To read specific fields from a document. Default is all.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public ReadRequestFields fields;

    public ReadRequest withFields(ReadRequestFields fields) {
        this.fields = fields;
        return this;
    }
    
    /**
     * Returns documents matching this filter. A filter can simply be a key, value pair where a key is the field name and the value would be the value for this field. Tigris also allows complex filtering by passing logical expressions. Logical filters are applied on two or more fields using `$or` and `$and`. A few examples of filters: &lt;li&gt; To read a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To read all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}` Filter allows setting collation on an individual field level. To set collation for all the fields see options. The detailed documentation of the filter is &lt;a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    public ReadRequestFilter filter;

    public ReadRequest withFilter(ReadRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    
    /**
     * Options that can be used to modify the results, for example "limit" to control the number of documents returned by the server.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public ReadRequestOptions options;

    public ReadRequest withOptions(ReadRequestOptions options) {
        this.options = options;
        return this;
    }
    
    /**
     * Array of fields and corresponding sort orders to order the results. Ex: 1 `[{ "salary": "$desc" }]`, Ex: 2  `[{ "salary": "$asc"}]`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public String sort;

    public ReadRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    public ReadRequest(){}
}
