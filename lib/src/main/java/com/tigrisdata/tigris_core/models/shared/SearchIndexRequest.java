package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchIndexRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collation")
    public Collation collation;
    public SearchIndexRequest withCollation(Collation collation) {
        this.collation = collation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exclude_fields")
    public String[] excludeFields;
    public SearchIndexRequest withExcludeFields(String[] excludeFields) {
        this.excludeFields = excludeFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("facet")
    public String facet;
    public SearchIndexRequest withFacet(String facet) {
        this.facet = facet;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    public String filter;
    public SearchIndexRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_fields")
    public String[] includeFields;
    public SearchIndexRequest withIncludeFields(String[] includeFields) {
        this.includeFields = includeFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public String index;
    public SearchIndexRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page")
    public Integer page;
    public SearchIndexRequest withPage(Integer page) {
        this.page = page;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size")
    public Integer pageSize;
    public SearchIndexRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;
    public SearchIndexRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("q")
    public String q;
    public SearchIndexRequest withQ(String q) {
        this.q = q;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_fields")
    public String[] searchFields;
    public SearchIndexRequest withSearchFields(String[] searchFields) {
        this.searchFields = searchFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public String sort;
    public SearchIndexRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
}
