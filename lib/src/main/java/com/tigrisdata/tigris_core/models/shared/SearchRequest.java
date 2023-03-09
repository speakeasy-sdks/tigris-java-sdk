package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public SearchRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collation")
    public Collation collation;
    public SearchRequest withCollation(Collation collation) {
        this.collation = collation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exclude_fields")
    public String[] excludeFields;
    public SearchRequest withExcludeFields(String[] excludeFields) {
        this.excludeFields = excludeFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("facet")
    public java.util.Map<String, Object> facet;
    public SearchRequest withFacet(java.util.Map<String, Object> facet) {
        this.facet = facet;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public java.util.Map<String, Object> fields;
    public SearchRequest withFields(java.util.Map<String, Object> fields) {
        this.fields = fields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    public java.util.Map<String, Object> filter;
    public SearchRequest withFilter(java.util.Map<String, Object> filter) {
        this.filter = filter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_fields")
    public String[] includeFields;
    public SearchRequest withIncludeFields(String[] includeFields) {
        this.includeFields = includeFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page")
    public Integer page;
    public SearchRequest withPage(Integer page) {
        this.page = page;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size")
    public Integer pageSize;
    public SearchRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("q")
    public String q;
    public SearchRequest withQ(String q) {
        this.q = q;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_fields")
    public String[] searchFields;
    public SearchRequest withSearchFields(String[] searchFields) {
        this.searchFields = searchFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public java.util.Map<String, Object> sort;
    public SearchRequest withSort(java.util.Map<String, Object> sort) {
        this.sort = sort;
        return this;
    }
    
}
