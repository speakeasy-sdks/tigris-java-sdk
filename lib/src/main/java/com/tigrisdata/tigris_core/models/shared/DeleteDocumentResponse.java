package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteDocumentResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public DocStatus[] status;
    public DeleteDocumentResponse withStatus(DocStatus[] status) {
        this.status = status;
        return this;
    }
    
}
