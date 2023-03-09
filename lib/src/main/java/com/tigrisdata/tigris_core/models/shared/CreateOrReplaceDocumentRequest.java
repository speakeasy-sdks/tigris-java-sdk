package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOrReplaceDocumentRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    public String[] documents;
    public CreateOrReplaceDocumentRequest withDocuments(String[] documents) {
        this.documents = documents;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public String index;
    public CreateOrReplaceDocumentRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;
    public CreateOrReplaceDocumentRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
}
