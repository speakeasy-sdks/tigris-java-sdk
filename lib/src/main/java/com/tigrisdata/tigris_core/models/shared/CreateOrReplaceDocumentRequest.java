/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateOrReplaceDocumentRequest {
    /**
     * An array of documents to create. Each document is a JSON object. In case an id is missing then the server will automatically generate it for you and create the document and in case an id is provided in the document and the document already exists then that document will not index and in the response there will be an error corresponding to that document id other documents will succeed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    public String[] documents;

    public CreateOrReplaceDocumentRequest withDocuments(String[] documents) {
        this.documents = documents;
        return this;
    }
    
    /**
     * index name where to create documents.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public String index;

    public CreateOrReplaceDocumentRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    /**
     * Project name whose db is under target to insert documents.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;

    public CreateOrReplaceDocumentRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    public CreateOrReplaceDocumentRequest(){}
}
