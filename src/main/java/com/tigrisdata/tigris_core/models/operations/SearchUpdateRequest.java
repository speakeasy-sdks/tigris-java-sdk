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


public class SearchUpdateRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest updateDocumentRequest;

    /**
     * Index name where to create documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=index")
    private String index;

    /**
     * Project name whose db is under target to insert documents.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public SearchUpdateRequest(
            com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest updateDocumentRequest,
            String index,
            String project) {
        Utils.checkNotNull(updateDocumentRequest, "updateDocumentRequest");
        Utils.checkNotNull(index, "index");
        Utils.checkNotNull(project, "project");
        this.updateDocumentRequest = updateDocumentRequest;
        this.index = index;
        this.project = project;
    }

    public com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest updateDocumentRequest() {
        return updateDocumentRequest;
    }

    /**
     * Index name where to create documents.
     */
    public String index() {
        return index;
    }

    /**
     * Project name whose db is under target to insert documents.
     */
    public String project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SearchUpdateRequest withUpdateDocumentRequest(com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest updateDocumentRequest) {
        Utils.checkNotNull(updateDocumentRequest, "updateDocumentRequest");
        this.updateDocumentRequest = updateDocumentRequest;
        return this;
    }

    /**
     * Index name where to create documents.
     */
    public SearchUpdateRequest withIndex(String index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
        return this;
    }

    /**
     * Project name whose db is under target to insert documents.
     */
    public SearchUpdateRequest withProject(String project) {
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
        SearchUpdateRequest other = (SearchUpdateRequest) o;
        return 
            java.util.Objects.deepEquals(this.updateDocumentRequest, other.updateDocumentRequest) &&
            java.util.Objects.deepEquals(this.index, other.index) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            updateDocumentRequest,
            index,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SearchUpdateRequest.class,
                "updateDocumentRequest", updateDocumentRequest,
                "index", index,
                "project", project);
    }
    
    public final static class Builder {
 
        private com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest updateDocumentRequest;
 
        private String index;
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder updateDocumentRequest(com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest updateDocumentRequest) {
            Utils.checkNotNull(updateDocumentRequest, "updateDocumentRequest");
            this.updateDocumentRequest = updateDocumentRequest;
            return this;
        }

        /**
         * Index name where to create documents.
         */
        public Builder index(String index) {
            Utils.checkNotNull(index, "index");
            this.index = index;
            return this;
        }

        /**
         * Project name whose db is under target to insert documents.
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public SearchUpdateRequest build() {
            return new SearchUpdateRequest(
                updateDocumentRequest,
                index,
                project);
        }
    }
}

