/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;
import com.tigrisdata.tigris_core.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SearchSearchRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.SearchIndexRequest searchIndexRequest;

    /**
     * The index name to search documents from.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=index")
    private String index;

    /**
     * Project name whose db is under target to search documents from.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public SearchSearchRequest(
            com.tigrisdata.tigris_core.models.shared.SearchIndexRequest searchIndexRequest,
            String index,
            String project) {
        Utils.checkNotNull(searchIndexRequest, "searchIndexRequest");
        Utils.checkNotNull(index, "index");
        Utils.checkNotNull(project, "project");
        this.searchIndexRequest = searchIndexRequest;
        this.index = index;
        this.project = project;
    }

    public com.tigrisdata.tigris_core.models.shared.SearchIndexRequest searchIndexRequest() {
        return searchIndexRequest;
    }

    /**
     * The index name to search documents from.
     */
    public String index() {
        return index;
    }

    /**
     * Project name whose db is under target to search documents from.
     */
    public String project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SearchSearchRequest withSearchIndexRequest(com.tigrisdata.tigris_core.models.shared.SearchIndexRequest searchIndexRequest) {
        Utils.checkNotNull(searchIndexRequest, "searchIndexRequest");
        this.searchIndexRequest = searchIndexRequest;
        return this;
    }

    /**
     * The index name to search documents from.
     */
    public SearchSearchRequest withIndex(String index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
        return this;
    }

    /**
     * Project name whose db is under target to search documents from.
     */
    public SearchSearchRequest withProject(String project) {
        Utils.checkNotNull(project, "project");
        this.project = project;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchSearchRequest other = (SearchSearchRequest) o;
        return 
            java.util.Objects.deepEquals(this.searchIndexRequest, other.searchIndexRequest) &&
            java.util.Objects.deepEquals(this.index, other.index) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            searchIndexRequest,
            index,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SearchSearchRequest.class,
                "searchIndexRequest", searchIndexRequest,
                "index", index,
                "project", project);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.SearchIndexRequest searchIndexRequest;
 
        private String index;
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder searchIndexRequest(com.tigrisdata.tigris_core.models.shared.SearchIndexRequest searchIndexRequest) {
            Utils.checkNotNull(searchIndexRequest, "searchIndexRequest");
            this.searchIndexRequest = searchIndexRequest;
            return this;
        }

        /**
         * The index name to search documents from.
         */
        public Builder index(String index) {
            Utils.checkNotNull(index, "index");
            this.index = index;
            return this;
        }

        /**
         * Project name whose db is under target to search documents from.
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public SearchSearchRequest build() {
            return new SearchSearchRequest(
                searchIndexRequest,
                index,
                project);
        }
    }
}
