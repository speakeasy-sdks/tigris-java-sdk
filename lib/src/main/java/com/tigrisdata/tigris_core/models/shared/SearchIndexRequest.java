/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchIndexRequest {
    /**
     * A collation allows you to specify string comparison rules. Default is case-sensitive, to override it you can set this option to 'ci' that will apply to all the text fields in the filters.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collation")
    public Collation collation;
    public SearchIndexRequest withCollation(Collation collation) {
        this.collation = collation;
        return this;
    }
    
    /**
     * Array of document field names to exclude from results. `include_fields`, if specified, takes precedence over `exclude_fields`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exclude_fields")
    public String[] excludeFields;
    public SearchIndexRequest withExcludeFields(String[] excludeFields) {
        this.excludeFields = excludeFields;
        return this;
    }
    
    /**
     * Facet query to aggregate results on given fields. The field name for the facet search can be passed like this `{"brand": { "size": 10 }}` where the size controls the total facets for this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("facet")
    public String facet;
    public SearchIndexRequest withFacet(String facet) {
        this.facet = facet;
        return this;
    }
    
    /**
     * Filter stacks on top of query results to further narrow down the results. Similar to `ReadRequest.filter`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    public String filter;
    public SearchIndexRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }
    
    /**
     * Array of document field names to include in results. By default, all fields are included.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_fields")
    public String[] includeFields;
    public SearchIndexRequest withIncludeFields(String[] includeFields) {
        this.includeFields = includeFields;
        return this;
    }
    
    /**
     * The index name to search documents from.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public String index;
    public SearchIndexRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    /**
     * Optionally can specify the page to retrieve. If page is set then only hits for this page is returned
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page")
    public Integer page;
    public SearchIndexRequest withPage(Integer page) {
        this.page = page;
        return this;
    }
    
    /**
     * Optionally can set the number of hits to be returned per page, default is 20.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size")
    public Integer pageSize;
    public SearchIndexRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    /**
     * Project name whose db is under target to search documents from.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project")
    public String project;
    public SearchIndexRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
    /**
     * Query string for searching across text fields
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("q")
    public String q;
    public SearchIndexRequest withQ(String q) {
        this.q = q;
        return this;
    }
    
    /**
     * Array of fields to project search query against
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_fields")
    public String[] searchFields;
    public SearchIndexRequest withSearchFields(String[] searchFields) {
        this.searchFields = searchFields;
        return this;
    }
    
    /**
     * Array of fields and corresponding sort orders to order the results `[{ "salary": "$desc" }]`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public String sort;
    public SearchIndexRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
}
