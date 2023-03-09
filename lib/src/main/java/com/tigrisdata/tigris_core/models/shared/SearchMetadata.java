package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("found")
    public Long found;
    public SearchMetadata withFound(Long found) {
        this.found = found;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page")
    public Page page;
    public SearchMetadata withPage(Page page) {
        this.page = page;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_pages")
    public Integer totalPages;
    public SearchMetadata withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    
}
