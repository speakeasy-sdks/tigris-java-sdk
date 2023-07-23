/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetDocumentResponse - OK
 */

public class GetDocumentResponse {
    /**
     * An array of documents.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    public IndexDoc[] documents;

    public GetDocumentResponse withDocuments(IndexDoc[] documents) {
        this.documents = documents;
        return this;
    }
    
    public GetDocumentResponse(){}
}
