package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetDocumentResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    public IndexDoc[] documents;
    public GetDocumentResponse withDocuments(IndexDoc[] documents) {
        this.documents = documents;
        return this;
    }
    
}
