/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateOrUpdateIndexRequest {
    /**
     * search index name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public CreateOrUpdateIndexRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * If set to `true` then a conflict with HTTP Status code 409 is returned if an index already exists. The default is false.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("only_create")
    public Boolean onlyCreate;

    public CreateOrUpdateIndexRequest withOnlyCreate(Boolean onlyCreate) {
        this.onlyCreate = onlyCreate;
        return this;
    }
    
    /**
     * Tigris project name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;

    public CreateOrUpdateIndexRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    /**
     * schema of the index. The schema specifications are same as JSON schema specification defined &lt;a href="https://json-schema.org/specification.html" title="here"&gt;here&lt;/a&gt;.&lt;p&gt;&lt;/p&gt; Schema example: `{  "title": "ecommerce_index",  "description": "an ecommerce store search index",  "properties": {    "name": {      "description": "Name of the product",      "type": "string",      "maxLength": 128    },    "brand": {      "description": "Brand of the product",      "type": "string"    },    "price": {      "description": "Price of the product",      "type": "number"    }  } }`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public String schema;

    public CreateOrUpdateIndexRequest withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    public CreateOrUpdateIndexRequest(){}
}
