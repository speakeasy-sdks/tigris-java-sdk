package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateDocumentResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public DocStatus[] status;
    public UpdateDocumentResponse withStatus(DocStatus[] status) {
        this.status = status;
        return this;
    }
    
}
