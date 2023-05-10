/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateRequest {
    /**
     * Optionally specify a database branch name to perform operation on
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;

    public UpdateRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * Fields contains set of fields with the values which need to be updated. Should be proper JSON object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public java.util.Map<String, Object> fields;

    public UpdateRequest withFields(java.util.Map<String, Object> fields) {
        this.fields = fields;
        return this;
    }
    
    /**
     * Update documents which matching specified filter. A filter can simply be key, value where key is the field name and value would be the value for this field. Or a filter can be logical where two or more fields can be logically joined using $or and $and. A few examples of filter: &lt;li&gt; To update a user document where the id has a value 1: ```{"id": 1 }``` &lt;li&gt; To update all the user documents where the key "id" has a value 1 or 2 or 3: `{"$or": [{"id": 1}, {"id": 2}, {"id": 3}]}`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    public java.util.Map<String, Object> filter;

    public UpdateRequest withFilter(java.util.Map<String, Object> filter) {
        this.filter = filter;
        return this;
    }
    
    /**
     * Additional options for update requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public UpdateRequestOptions options;

    public UpdateRequest withOptions(UpdateRequestOptions options) {
        this.options = options;
        return this;
    }
    
    public UpdateRequest(){}
}
