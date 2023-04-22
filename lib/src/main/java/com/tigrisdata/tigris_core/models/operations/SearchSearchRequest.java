/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class SearchSearchRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.tigrisdata.tigris_core.models.shared.SearchIndexRequest searchIndexRequest;
    public SearchSearchRequest withSearchIndexRequest(com.tigrisdata.tigris_core.models.shared.SearchIndexRequest searchIndexRequest) {
        this.searchIndexRequest = searchIndexRequest;
        return this;
    }
    
    /**
     * The index name to search documents from.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=index")
    public String index;
    public SearchSearchRequest withIndex(String index) {
        this.index = index;
        return this;
    }
    
    /**
     * Project name whose db is under target to search documents from.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public SearchSearchRequest withProject(String project) {
        this.project = project;
        return this;
    }
    

    public SearchSearchRequest(@JsonProperty("SearchIndexRequest") com.tigrisdata.tigris_core.models.shared.SearchIndexRequest searchIndexRequest, @JsonProperty("index") String index, @JsonProperty("project") String project) {
    this.searchIndexRequest = searchIndexRequest;
this.index = index;
this.project = project;
  }
}
