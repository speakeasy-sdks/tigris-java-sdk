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


public class SearchDeleteByQueryRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.DeleteByQueryRequest deleteByQueryRequest;

    /**
     * The index name of the documents that needs deletion.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=index")
    private String index;

    /**
     * The project name.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public SearchDeleteByQueryRequest(
            com.tigrisdata.tigris_core.models.shared.DeleteByQueryRequest deleteByQueryRequest,
            String index,
            String project) {
        Utils.checkNotNull(deleteByQueryRequest, "deleteByQueryRequest");
        Utils.checkNotNull(index, "index");
        Utils.checkNotNull(project, "project");
        this.deleteByQueryRequest = deleteByQueryRequest;
        this.index = index;
        this.project = project;
    }

    public com.tigrisdata.tigris_core.models.shared.DeleteByQueryRequest deleteByQueryRequest() {
        return deleteByQueryRequest;
    }

    /**
     * The index name of the documents that needs deletion.
     */
    public String index() {
        return index;
    }

    /**
     * The project name.
     */
    public String project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SearchDeleteByQueryRequest withDeleteByQueryRequest(com.tigrisdata.tigris_core.models.shared.DeleteByQueryRequest deleteByQueryRequest) {
        Utils.checkNotNull(deleteByQueryRequest, "deleteByQueryRequest");
        this.deleteByQueryRequest = deleteByQueryRequest;
        return this;
    }

    /**
     * The index name of the documents that needs deletion.
     */
    public SearchDeleteByQueryRequest withIndex(String index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
        return this;
    }

    /**
     * The project name.
     */
    public SearchDeleteByQueryRequest withProject(String project) {
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
        SearchDeleteByQueryRequest other = (SearchDeleteByQueryRequest) o;
        return 
            java.util.Objects.deepEquals(this.deleteByQueryRequest, other.deleteByQueryRequest) &&
            java.util.Objects.deepEquals(this.index, other.index) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            deleteByQueryRequest,
            index,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SearchDeleteByQueryRequest.class,
                "deleteByQueryRequest", deleteByQueryRequest,
                "index", index,
                "project", project);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.DeleteByQueryRequest deleteByQueryRequest;
 
        private String index;
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder deleteByQueryRequest(com.tigrisdata.tigris_core.models.shared.DeleteByQueryRequest deleteByQueryRequest) {
            Utils.checkNotNull(deleteByQueryRequest, "deleteByQueryRequest");
            this.deleteByQueryRequest = deleteByQueryRequest;
            return this;
        }

        /**
         * The index name of the documents that needs deletion.
         */
        public Builder index(String index) {
            Utils.checkNotNull(index, "index");
            this.index = index;
            return this;
        }

        /**
         * The project name.
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public SearchDeleteByQueryRequest build() {
            return new SearchDeleteByQueryRequest(
                deleteByQueryRequest,
                index,
                project);
        }
    }
}
