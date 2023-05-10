/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateDocumentRequest {
    /**
     * An array of documents to be created or replaced. Each document is a JSON object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    public String[] documents;

    public CreateDocumentRequest withDocuments(String[] documents) {
        this.documents = documents;
        return this;
    }
    
    /**
     * index name where to create documents.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public String index;

    public CreateDocumentRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    /**
     * Tigris project name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;

    public CreateDocumentRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public CreateDocumentRequest(){}
}
