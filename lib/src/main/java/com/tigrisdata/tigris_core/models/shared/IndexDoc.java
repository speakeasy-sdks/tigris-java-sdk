package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IndexDoc {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("doc")
    public String doc;
    public IndexDoc withDoc(String doc) {
        this.doc = doc;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public DocMeta metadata;
    public IndexDoc withMetadata(DocMeta metadata) {
        this.metadata = metadata;
        return this;
    }
    
}
