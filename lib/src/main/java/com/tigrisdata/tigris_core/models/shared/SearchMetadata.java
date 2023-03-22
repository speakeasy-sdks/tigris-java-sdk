/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchMetadata {
    /**
     * Total number of search results across all pages
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("found")public Long found;
    public SearchMetadata withFound(Long found) {
        this.found = found;
        return this;
    }
    
    /**
     * Pagination metadata for SearchResponse
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page")public Page page;
    public SearchMetadata withPage(Page page) {
        this.page = page;
        return this;
    }
    
    /**
     * Number representing the total pages of results
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_pages")public Integer totalPages;
    public SearchMetadata withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    
}
